package jtraining.common.sort;

public abstract class SortDelegate {

    public abstract int[] Sort(int[] array);

    protected void showArray(int[] array){
        System.out.print("[");
        for(int  i = 0; i < array.length; i ++) {
            System.out.print(array[i]);
            if(i + 1 != array.length){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    protected void showArrayOperation(int[] array, int first, int last, int pivot){
        System.out.print("     [");
        for(int  i = 0; i < array.length; i ++) {
            if(i == first || i == last) System.out.print("(" + array[i] + ")");
            else System.out.print(array[i]);

            if(i + 1 != array.length){
                System.out.print(", ");
            }
        }
        System.out.println("] { first = " + first + ", last = " + last + ", pivot = " + pivot + " }");
    }
}
