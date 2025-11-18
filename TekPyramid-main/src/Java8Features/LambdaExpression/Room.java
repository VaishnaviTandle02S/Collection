    package Java8Features.LambdaExpression;

    public interface Room {
        //void switchOn();
        //void sum(int input);
        int sub(int a, int b);
    }


    class LambdaExpression{

        public static void main(String[] args) {
//            Room room=() -> {
//                System.out.println("SwitchOn light");
//            };
//            room.switchOn();

//            Room room=(input)->{
//                System.out.println("sum :"+input);
//            };
//            room.sum(5);

            Room room = (a, b) -> {
                if (a < b) {
                    throw new RuntimeException("a is greater than b");
                } else
                    return a - b;
            };
            System.out.println(room.sub(2, 3));
        }
    }

