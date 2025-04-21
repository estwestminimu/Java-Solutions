import java.util.List;

public class JavaCPU implements CPU {
    private short A, X, Y;
    private Memory ram;

    private void in_f(String interaction) {
        if (interaction.charAt(2) == 'X') {
            X++;
        } else {
            Y++;
        }
    }

    private void ld_f(String interaction) {
        if (interaction.charAt(4) == '#') {
            String[] set = interaction.split("#");
            short number = Short.parseShort(set[1]);
            switch (interaction.charAt(2)) {
                case 'A':
                    A = number;
                    break;
                case 'X':
                    X = number;
                    break;
                case 'Y':
                    Y = number;
                    break;
            }

        } else if (interaction.contains(",")) {
            String[] set = interaction.split(",");
            String before = set[0].trim();
            before = before.split(" ")[1];
            short number = Short.parseShort(before);
            switch (interaction.charAt(2)) {
                case 'A':
                    A = ram.get(number + Y);
                    break;
                case 'X':
                    X = ram.get(number + Y);
                    break;
            }
        } else {
            String[] set = interaction.split(" ");
            String after = set[1].trim();
            short number = Short.parseShort(after);

            switch (interaction.charAt(2)) {
                case 'A':
                    A = ram.get(number);
                    break;
                case 'X':
                    X = ram.get(number);
                    break;
                case 'Y':
                    Y = ram.get(number);
                    break;
            }
        }
    }

    private void st_f(String interaction) {
        String[] set = interaction.split(" ");
        String after = set[1].trim();
        short number = Short.parseShort(after);
        ram.set(number, A);
    }


    private void t_f(String interaction) {
        switch (interaction.charAt(1)) {
            case 'A':
                X = A;
                break;
            case 'X':
                if (interaction.charAt(2) == 'A') {
                    A = X;
                } else {
                    Y = X;
                }
                break;
            case 'Y':
                X = Y;
                break;
        }
    }


    private void ad_f(String interaction) {

        if (interaction.charAt(4) == '#') {
            String[] set = interaction.split("#");
            String after = set[1].trim();
            short number = Short.parseShort(after);
            A += number;
        } else if (interaction.charAt(4) == 'X') {
            A += X;
        } else if (interaction.charAt(4) == 'Y') {
            A += Y;
        } else {

            String[] set = interaction.split(" ");
            String after = set[1].trim();
            short number = Short.parseShort(after);
            A += ram.get(number);
        }
    }

    @Override
    public void setRAM(Memory ram) {
        this.ram = ram;
    }


    @Override
    public void execute(List<String> code) {
        for (String interaction : code) {
            switch (interaction.charAt(0)) {
                case 'I':
                    in_f(interaction);
                    break;
                case 'L':
                    ld_f(interaction);
                    break;
                case 'S':
                    st_f(interaction);
                    break;
                case 'T':
                    t_f(interaction);
                    break;
                case 'A':
                    ad_f(interaction);
                    break;


            }
        }
    }
}