public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall= new Conditionals ();

    } //main method

    public Conditionals () {

        String question = "Will I eat pasta today?";
        System.out.println(question);

        int randomInt = (int)(Math.random() * 11);  // 0 to 10;

        if(randomInt == 0){
            System.out.println("Better not tell you now");

        } else  if(randomInt > 9){
            System.out.println("As I see it, yes");
        } else if(randomInt %4==0){
            System.out.println("Very doubtful");
        } else if(randomInt == 3){
            System.out.println("Without doubt");
        } else {
            System.out.println("...");
        }

    } //constructor method
}
