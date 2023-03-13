package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad(int count){
        if(count <= 0) {
            return;
        }
        System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
        repeatIsBad(count - 1);

    }

    public static void main(String[] args) {
        RepeatIsBad mainObj = new RepeatIsBad();
        mainObj.repeatIsBad(20);
    }
}
