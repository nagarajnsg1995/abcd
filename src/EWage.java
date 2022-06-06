public class EWage {


    public static void main(String[] args) {
        int ispresent = 1;
        System.out.println("wellcome to employee wage");

        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == ispresent)
            System.out.println("emp is present");
        else
            System.out.println("emp is abscent");

    }
}





