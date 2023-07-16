package task_01;

public class Main {

    static String name;

    public static void main(String[] args) {

        name = "Robot 1.0";
        getRobotInfo(/* ??? **/);

        name = "Robot 2.0";
        getRobotInfo(/* ??? **/);
    }

    private static /* ??? **/ getRobot(String name) {
       return new Robot(name);
    }

    private static void getRobotInfo(Robot robot) {
        System.out.println(robot/* отримати ім'я потоку **/ + " state: " + robot/* отримати стан потоку **/);
        robot./* поток стартует **/
        System.out.println(robot./* отримати ім'я потоку **/ + " state: " + robot./* отримати стан потоку **/
    }
}
