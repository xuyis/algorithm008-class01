

class Solution{
    public boolean lemonadeChange(int[] bills){
        // 记录零钱个数，
        int fiveCount=0;
        int tenCount=0;
        for (int bill:bills){
            if (bill == 5){
                fiveCount++;
                continue;
            }
            if (bill == 10){
                if (fiveCount>0){
                    fiveCount--;
                    tenCount++;
                    continue;
                }
                return false;
            }
            if (bill == 20){
                if (fiveCount>0 && tenCount>0){
                    fiveCount--;
                    tenCount--;
                    continue;
                }
                if (fiveCount>2){
                    fiveCount-=3;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}