/**
 * Created by Administrator on 2016/9/12.
 */
public class java2 {
    public static void main(String[] args){
        int[]intArray = {1,5,8,4,6,2};
        int temp = 6;
        for(int i = 0;i<intArray.length;i++){
            for(int j = i+1;j<intArray.length;j++){
                if (intArray[i]==temp) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
