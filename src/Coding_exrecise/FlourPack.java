package Coding_exrecise;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        bigCount = bigCount * 5;

        if (bigCount == goal || (bigCount < goal && smallCount != 0 && (bigCount + smallCount) >= goal) || (bigCount == 0 && smallCount >= goal)){
            return true;

        } else if ( bigCount > goal) {
            while (bigCount != 5){
                bigCount = bigCount - 5;
                if (bigCount <= goal && (bigCount + smallCount) >= goal){
                    return true;
                }
            }
        }
        return false;
    }
}
