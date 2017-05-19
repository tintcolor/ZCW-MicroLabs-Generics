package ArrayListCombiner;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner {
    ArrayList arrayList1 = new ArrayList();
    ArrayList arrayList2 = new ArrayList();


    public static <E> E extendCombiner(ArrayList<? extends E> array1, ArrayList<? extends E> array2) {

        // array1.get(0);
        E a = array1.get(0);
        E b = array2.get(0);
        array1.set(0, b);
        System.out.println(a + " " + b);

        // array1.add(array2.get(0));
        return a;

    }


    public static <E> E superCombiner(ArrayList<? super E> array1, ArrayList<? super E> array2) {
        return null;

    }


}
