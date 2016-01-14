
 

 
public class RangeDemo {
 
    public static void main(String[] args) {
         
        int[] myArray = { 1, 2, 3, 4, 5 };
         
        for (int i = 0; i < myArray.length; i++  ) {
            myArray[i] *= 2;
        }
         
        System.out.println(myArray);
    }
}