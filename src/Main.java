import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int Mat, Phys, Turk, Chem, Mus;
        double Avarage;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Mathematics note :");
        Mat = input.nextInt();
        if (Mat < 0 || Mat > 100) {
            System.out.println("Mathematics grade must be between 0 and 100.");
            return;
        }
        System.out.print("Enter your Physics note :");
        Phys = input.nextInt();
        if (Phys < 0 || Phys > 100) {
            System.out.println("Physics grade must be between 0 and 100.");
            return;
        }
        System.out.print("Enter your Turkish note :");
        Turk = input.nextInt();
        if (Turk < 0 || Turk > 100) {
            System.out.println("Turkish grade must be between 0 and 100.");
            return;
        }
        System.out.print("Enter your Chemistry note :");
        Chem = input.nextInt();
        if (Chem < 0 || Chem > 100) {
            System.out.println("Chemistry grade must be between 0 and 100.");
            return;
        }
        System.out.print("Enter your Music note :");
        Mus = input.nextInt();
        if (Mus < 0 || Mus > 100) {
            System.out.println("Music grade must be between 0 and 100.");
            return;
        }
        Avarage= (Mat+Phys+Turk+Chem+Mus)/ 5;

        if(Avarage<55){
            System.out.print("You failed the class, see you again next year");
        }else{
            System.out.print("Congratulations, you have completed the term successfully.");
        }
    }
}
