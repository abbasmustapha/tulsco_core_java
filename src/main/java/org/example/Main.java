package org.example;

import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<String,Integer> maMap = new HashMap<>();
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(23);
        nums.add(21);
        nums.add(28);
        nums.add(12);

        List<Integer> collect = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        Set<Integer> numsSet = new HashSet<>();

        numsSet.add(3);
        numsSet.add(7);
        numsSet.add(1);
        numsSet.add(8);

        System.out.println(numsSet.stream().filter(ent -> ent>2).collect(Collectors.toList()));

        Iterator<Integer> values = numsSet.iterator();

        System.out.println("Affiche toutes les valeurs via iterator : ");
        while (values.hasNext())
            System.out.print(values.next()+" - ");

        maMap.put("premier",1);
        maMap.put("troisieme",3);
        maMap.put("quatrieme",4);
        maMap.put("deuxiemer",2);
        System.out.println();

        for (String key: maMap.keySet()) {
            System.out.println(key + " : "+maMap.get(key));
        }

        System.out.println(maMap.toString());

        // -------------------------------------------------
        System.out.println("Consumer : ");
        List<Integer> nums3 = Arrays.asList(4,2,5,1,7,9,8,6,2,1,4,9);

        Consumer<Integer> con = n -> System.out.print(n);

        System.out.println("");
        System.out.println("nums3 = ");

        nums3.forEach(con);

        // ------------ Même chose sans consumer --------------

        List<Integer> nums4 = Arrays.asList(4,2,5,1,7,9,8,6,2,1,4,9);
        System.out.println("");
        System.out.println("nums4 = ");
        nums4.forEach(n -> System.out.print(n));
        System.out.println("");

        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n%2==0;
            }
        };

        Function<Integer,Integer> fun = new Function<Integer, Integer>() {
            public Integer apply(Integer n) {

                return n*2;
            }
        };

        Integer result = nums4.stream()
                // .filter(p)    idem que dessous
                .filter(n -> n % 2 == 0)
                // .map(fun)     idem que dessous
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);


    }
}
