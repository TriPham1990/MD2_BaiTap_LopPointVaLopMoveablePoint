public class TextMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());

        moveablePoint = new MoveablePoint(2,2);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());


        moveablePoint = new MoveablePoint(1,1,2,2);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move());

    }
}
