public class ArrayFunReverseIt {
    public static void main(String[] args) {

        int arrayNum[] = {1,2,3,4,5};

        int numArray[] = {5,4,3,2,1};

        for(int i=0; i < arrayNum.length; i++){
            System.out.println("In order " + arrayNum[i] + " ");
        }
        for(int i = arrayNum.length-1; i >= 0; i--){
            System.out.println("In reverse order " + arrayNum[i] + " ");
        }
    }
}
