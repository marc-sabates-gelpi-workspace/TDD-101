public class Clazz {
    private static final int THRESHOLD = 55;
    private int num;

    public int getNum(){
        return num;
    }

    public void setNum(int param){
        this.num = param;
    }

    public int compareWithThreshold(int comparand){
        //if(comparand == THRESHOLD) {
        //    return 0;
        //} else {
        //    return THRESHOLD-comparand;
        //}
        if(comparand < THRESHOLD) {
            return -1;
        } else if (comparand > THRESHOLD) {
            return 1;
        } else {
            return 0;
        }
    }
}
