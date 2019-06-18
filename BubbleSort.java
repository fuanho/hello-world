public class BubbleSort {
    public static void main(String[] args) {
        int [] aNum = {32, 24, 11, 48, 15, 20, 47, 97, 67, 55, 82};
        //int count1 = aNum.length;
        System.out.print("排序前：");
        for(int a = 0 ; a < aNum.length ; a++){
            System.out.print(" " + aNum[a]);
        }
        System.out.println();
        int n = aNum.length;
        int t ;
        for(int i = n-2 ; i >= 0 ; i--){
            for(int j = 0 ; j <= i ; j++){
                if(aNum[j] > aNum[j + 1]){
                    t = aNum[j];
                    aNum[j] = aNum[j + 1];
                    aNum[j + 1] = t;
                }
            }
            System.out.print("第" + ((n-1)-i) + "次循環：");
            for(int a = 0 ; a < aNum.length ; a++){
                System.out.print(" " + aNum[a]);
            }
            System.out.println();
        }
        System.out.print("排序後：");
        for(int a = 0 ; a < aNum.length ; a++){
            System.out.print(" " + aNum[a]);
        }
        System.out.println();
    }
}