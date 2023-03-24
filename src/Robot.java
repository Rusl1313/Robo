public class Robot {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, -2, 2);
        moveRobot(robot, -8, -4);
    }
    int x=0;
    int y=0;
    Direction direction;
    public Robot(Direction direction, int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public Direction getDirection() {
        // текущее направление взгляда
        return direction;
    }
    public int getX() {
        // текущая координата X
        return x;
    }
    public int getY() {
        // текущая координата Y
        return y;
    }
    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        if (direction == Direction.UP) {
            direction = Direction.LEFT;
        } else if (direction == Direction.DOWN) {
            direction = Direction.RIGHT;
        } else if (direction == Direction.LEFT) {
            direction = Direction.DOWN;
        } else if (direction == Direction.RIGHT) {
            direction = Direction.UP;
        }
    }
    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        if (direction == Direction.UP) {
            direction = Direction.RIGHT;
        } else if (direction == Direction.DOWN) {
            direction = Direction.LEFT;
        } else if (direction == Direction.LEFT) {
            direction = Direction.UP;
        } else if (direction == Direction.RIGHT) {
            direction = Direction.DOWN;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch (getDirection()) {
            case UP -> {
                y++;
                break;
            }
            case DOWN -> {
                y--;
                break;
            }
            case LEFT -> {
                x--;
                break;
            }
            case RIGHT -> {
                x++;
                break;
            }
        }
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        int tX = robot.getX();
        int tY = robot.getY();
        if (toX - tX > 0 && toY - tY > 0) {
            robot.turnRight();
            for (int i = tX; i < toX; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int j = tY; j < toY; j++) {
                robot.stepForward();
            }
        } else if (toX - tX < 0 && toY - tY > 0) {
            robot.turnLeft();
            for (int i = tX; i > toX; i--) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int j = tY; j < toY; j++) {
                robot.stepForward();
            }
        } else if (toX - tX < 0 && toY - tY < 0) {
            robot.turnLeft();
            for (int i = tX; i > toX; i--) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int j = tY; j > toY; j--) {
                robot.stepForward();
            }
        } else if (toX - tX > 0 && tY < 0) {
            robot.turnRight();
            for (int i = tX; i < toX; i++) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int j = tY; j > toY; j--) {
                robot.stepForward();
            }
        }
        System.out.println("Позиция по X: " + robot.getX() + "\n" +"Позиция по Y: " + robot.getY() + "\n" + "Взгляд: " + robot.getDirection());
    }
    }


  /*
  int tX = robot.getX();
        int tY = robot.getY();
        if (toX - robot.getX() > 0  toY - robot.getY() > 0) {
            robot.turnRight();
            for (int i = robot.getX(); i <= toX; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int j = robot.getY(); j <= toY; j++) {
                robot.stepForward();
            }
        } else if (toX - robot.getX() < 0  toY - robot.getY() > 0) {
            robot.turnLeft();
            for (int i = robot.getX(); i >= toX; i--) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int j = robot.getY(); j <= toY; j++) {
                robot.stepForward();
            }
        } else if (toX - robot.getX() < 0  toY - robot.getY() < 0) {
            robot.turnLeft();
            for (int i = robot.getX(); i >= toX; i--) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int j = robot.getY(); j >= toY; j--) {
                robot.stepForward();
            }
        } else if (toX - robot.getX() > 0  toY - robot.getY() < 0) {
            robot.turnRight();
            for (int i = robot.getX(); i <= toX; i++) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int j = robot.getY(); j >= toY; j--) {
                robot.stepForward();
            }
        }
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();
    }
    }


  for (int i = robot.getX(); i >= toX; i--){
        robot.stepForward();
    }
        for (int i = robot.getX(); i <= toX; i++){
        robot.stepForward();
    }
        for (int j = robot.getY(); j >= toY; j--){
        robot.stepForward();
    }
        for (int j = robot.getY(); j <= toY; j++){
        robot.stepForward();
    } */

