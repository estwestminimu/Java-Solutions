import java.util.*;

public class EKuchnia implements Kuchnia {

    private Map<Produkt, Integer> spizarnia = new HashMap<Produkt, Integer>();



    @Override
    public void dodajDoSpizarni(Produkt produkt, int gram) {
        if (spizarnia.containsKey(produkt))
        {
            spizarnia.replace(produkt, spizarnia.get(produkt)+gram);
        }
        else
        {
            spizarnia.put(produkt, gram);
        }

    }

    @Override
    public Set<Skladnik> przeliczPrzepis(Przepis przepis) {
        double minCoefficient= Integer.MAX_VALUE;;
        double tmp;

        for (Skladnik skladnik : przepis.sklad())
        {

          //  System.out.println("Składnik: "+skladnik);
                   if(!spizarnia.containsKey(skladnik.produkt()))
                   {
                       return new HashSet<>();
                   }
                //wspolczynnik


            tmp=(double)( spizarnia.get(skladnik.produkt()) /skladnik.gramow());
         //   System.out.println("TMP: "+tmp);

            minCoefficient= Math.min(minCoefficient, tmp);

/*
            if (minCoefficient<tmp)
            {
                minCoefficient=tmp;
                System.out.println("min: "+minCoefficient);
            }
*/
        }
     //   System.out.println("min: "+minCoefficient);

        if (minCoefficient==0)
        {
            return new HashSet<>();
        }
        Set<Skladnik> newPrzepis = new HashSet<>();

        for (Skladnik skladnik : przepis.sklad())
        {
            newPrzepis.add(new Skladnik(skladnik.produkt(), (int) (skladnik.gramow()*minCoefficient)));
        }

     //   System.out.println("nowy przepis"+newPrzepis);

        return  newPrzepis;

    }

    @Override
    public boolean wykonaj(Przepis przepis) {

        //elemnty przepisu
        for (Skladnik skladnik : przepis.sklad())
        {
            //spizarnia jest mniejsza lub produkt nie istnieje
          //  System.out.println("spizarnia.get(skladnik.produkt())"+spizarnia.get(skladnik.produkt()));
           if(spizarnia.get(skladnik.produkt())<skladnik.gramow() || !spizarnia.containsKey(skladnik.produkt()) || )
           {
               return false;
           }
        }

        //mozemy teraz na spokojnie zmniejszac rozmiar spizarni
        for (Skladnik skladnik : przepis.sklad())
        {
            if(spizarnia.get(skladnik.produkt())>=skladnik.gramow())
            {
                spizarnia.replace(skladnik.produkt(), spizarnia.get(skladnik.produkt())-skladnik.gramow());
            }
        }

        return true;
    }

    @Override
    public Map<Produkt, Integer> stanSpizarni() {

        Map<Produkt, Integer> tmpMap= new HashMap<>();

        for (Produkt produkt : spizarnia.keySet()) {
            if (spizarnia.get(produkt)!=0)
            {
               tmpMap.put(produkt, spizarnia.get(produkt));
            }
        }

      // System.out.println("wynik: "+tmpMap);
        spizarnia.clear();
        spizarnia.putAll(tmpMap);

        return spizarnia;
    }

}