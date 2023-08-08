import java.util.Random;


public class Switch {

    String answerStr;

    static int rand = (int) (Math.random() * 7 + 1);
    public static void main(String[] args) {
     

        switch (rand) {
            case 1:
                System.out.println("L");
                break;
            case 2:
                System.out.println("M");
                break;
            case 3:
                System.out.println("M");
                break;
            case 4:
                System.out.println("M");
                break;
            case 5:
                System.out.println("M");
                break;
            case 6:
                System.out.println("M");
                break;
            case 7:
                System.out.println("M");
                break;
            default:
                System.out.println("stupid");
                break;
        }

        
    }




    
}
