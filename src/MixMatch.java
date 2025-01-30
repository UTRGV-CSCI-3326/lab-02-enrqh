public class MixMatch{
    public static void main (String[] args){

        String str = "Hello";
        System.out.println(str + " <- String, stores a string of characters.");

        char ch = 'A';
        System.out.println(ch + " <- Character, stores a single character.");

        short sh = 11010;
        System.out.println(sh + " <- Short, stores a 16 bit signed 2's complement integer from -32,768 to 32,767.");

        int x = 2;
        System.out.println(x + " <- Integer, stores whole number values from -2,147,483,648 to 2,147,483,647.");
 
        long lng = 100000000;
        System.out.println(lng + " <- Long, stores a large integer value from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");

        float y = 1.53467f;
        System.out.println(y + " <- Float, stores a decimal value with 6-7 total digits."); // Double check description

        double z = 3.14157913;
        System.out.println(z + " <- Double, stores a decimal value with greater digits than a float, up to 15-16 total digits.");

        boolean a = true;
        System.out.println(a + " <- Boolean, store either true or false state.");

    }


}