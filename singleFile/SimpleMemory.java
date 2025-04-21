public class SimpleMemory implements Memory {
    private final short[] memory;

    public SimpleMemory(int size) {
        if (size <= 0 || size > 256) {
            throw new IllegalArgumentException("Memory size must be between 1 and 256.");
        }
        this.memory = new short[size];
    }

    @Override
    public void set(int address, short value) {
        if (address < 0 || address >= memory.length) {
            throw new IllegalArgumentException("Invalid memory address: " + address);
        }
        if (value < 0 || value > 255) {
            throw new IllegalArgumentException("Value must be between 0 and 255: " + value);
        }
        memory[address] = value;
    }

    @Override
    public short get(int address) {
        if (address < 0 || address >= memory.length) {
            throw new IllegalArgumentException("Invalid memory address: " + address);
        }
        return memory[address];
    }

    @Override
    public short size() {
        return (short) memory.length;
    }
}
