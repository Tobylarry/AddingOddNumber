public class AdditionOfOddNumber {
    public static void main(String[] args) {
isOdd(11);
sumOdd(1, 100);
    }
    public static boolean isOdd (int number){
        if(number > 0){
            if(number%2 != 0){

                return true;
            }else {

                return false;
            }
        }
        else {
            return false;
        }
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && end >= start){
            for (int i = start; i <= end; i++){
                if(isOdd(i)) {
                    sum += i;
                }
            }
            System.out.println(sum);
            return sum;
        }
        else {
            System.out.println("error");
            return -1;
        }
    }
}
