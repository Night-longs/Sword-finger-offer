import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static java.lang.System.arraycopy;
public class Solution {
        public void reOrderArray(int [] array) {
            for(int i= 0;i<array.length-1;i++){
                for(int j=0;j<array.length-1-i;j++){
                    if(array[j]%2==0&&array[j+1]%2==1){
                        array[j]=array[j]+array[j+1];
                        array[j+1]=array[j]-array[j+1];
                        array[j]=array[j]-array[j+1];
                    }
                }
            }
        }
}