// class Hello{
//     static int guess(int n){
//         if (n==5){
//             return 0;
//         }
//         if (n>5){
//             return -1;
//         }
//         return 1;
//     }
//     static int recursiveGuess(int low,int high){
//         int middle=(low+high)/2;
//         System.out.println(middle);
//         if (guess(middle)==0){
//             return middle;
//         }
//         if (guess(middle)==-1){
//             System.out.println("")
//             return recursiveGuess(low, middle-1);
//         }
//         return recursiveGuess(middle+1, high);
//     }
//     static int guessNum(int n){
//         int result=recursiveGuess(1, n);
//         return result;
//     }
//     public static void main(String[] args){
//         System.out.println("Hello world");

//         int n=100;
//         System.out.println(guessNum(n));
//     }
// }

// class SolutionHello {
//     int guess(int num) {
//         int x=17;
//         if (num == x) {
//             return 0;
//         }
//         if (num > x) {
//             return -1;
//         }
//         return 1;
//     }

//     public int recursiveGuess(int low, int high) {
//         int middle = (low + high) / 2;
//         if (guess(middle) == 0) {
//             System.out.println("Guess found");
//             return middle;
//         }
//         if (guess(middle) == -1) {
//             System.out.println("called for the left part");
//             return recursiveGuess(low, middle - 1);
//         }
//         System.out.println("Called for the right part.");
//         return recursiveGuess(middle + 1, high);

//     }

//     public int guessNumber(int n) {

//         return recursiveGuess(1, n);

//     }

//     public static void main(String[] args) {
//         System.out.println("Code is running");

//         SolutionHello obj = new SolutionHello();
//         int result = obj.guessNumber(21);
//         System.out.println("Guess = " + result);

//     }
// }


class SolutionHello{
    public static void main(String[] args){
        int start=1;
        int end=100;
        while (start<end){
            int mid1 = start + (end - start)/2 ; 
            int mid2=(start+end)/2;
            start++;

            System.out.println("mid1 = "+mid1+" mid2 = "+mid2);

        }
    }
}
