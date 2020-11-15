public class PythagoreanTest {
    public static void main(String[] args){
        Pythagorean iD = new Pythagorean();
        double total = iD.calculateHypotenuse(3, 4);
        double squareRoot = Math.sqrt(total);
        System.out.println(squareRoot);

    }
}