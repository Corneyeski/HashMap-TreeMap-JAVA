package company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String []args){

        System.out.println();

        coche Jaguar = new coche("Jaguar","JSFSDF","DFSDF",222,444.4);
        coche Mercedes = new coche("mercedes","JSFSDF","DFSDF",222,444.4);
        coche BMW = new coche("BMW","JSFSDF","DFSDF",222,444.4);

        List<coche> cocheList = new ArrayList<>();

        cocheList.add(Jaguar);
        cocheList.add(Mercedes);
        cocheList.add(BMW);

        System.out.println(cocheList.get(0));
    }
}
