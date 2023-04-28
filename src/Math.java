import javax.swing.JOptionPane;

public class Math {
    private Integer arrayResult[];
    public Integer [] getArrayResult() {
        return this.arrayResult;
    }
    public String calcOddNumbers(int limit) {
        arrayResult=new Integer[(limit+1)/2] ;
        String aux = "";
        int count = 1,countArray=0;

        while (count < limit) {
            aux = aux + count + ",";
            arrayResult[countArray]=count;
            countArray=countArray+1;
            count=count + 2;
        }
        return aux;
    }
    public String calcIventNumbers(int limit){
    arrayResult=new Integer[(limit+1)/2] ;
        String aux = "";
        int count = 2,countArray=0;

        while (count < limit) {
            aux = aux + count + ",";
            arrayResult[countArray]=count;
            countArray=countArray+1;
            count=count + 2;
        }
        return aux;

    }
    public String calcCousinNumbers(int limit){
        arrayResult=new Integer[limit+1/2];
        String aux="";
        int count = 2,countArray=0;
        while (count < limit) {
            aux = aux + count + ",";
            arrayResult[countArray]=count;
            countArray=countArray+1;
            count=count + 1;

        }
        return aux;
    }
}
