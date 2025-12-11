public class Player {
    //---- UC1------
    int position=0;
    int num;


    //---- UC2-------
    public void generateNumber(){
        num=(int) (Math.random()*100)%6 + 1;
        System.out.println("Random number generated: " + num);
    }
}
