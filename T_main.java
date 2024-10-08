public class T_main {
    public static void main(String[] args) {
        Ball ball = new Ball(1.1f,2.2f,10,3.3f,4.4f);
        System.out.println(ball);
        ball = new Ball(80.0f,35.0f,10,4.0f,6.0f);
        System.out.println(ball);
     //   ball.getX();
        System.out.println("x is:"+ball.getX());
        System.out.println("y is:"+ball.getY());
        ball.setRadius(5);
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();
            // Check boundary value to bounce back
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }

    }
}
