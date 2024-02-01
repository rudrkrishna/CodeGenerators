import java.util.Scanner;

public class HammingCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin= sc.nextInt();
        int dataLength=Integer.valueOf(bin).toString().length();
        if(dataLength==4){
           System.out.println((new HammingCode()).hammingGenerate(bin));
        }
    }

    private String hammingGenerate(int data){
        char[] binaryData=Integer.valueOf(data).toString().toCharArray();
        int[] dataInt=new int[binaryData.length];
        String hammedcode="";
        for(int i=0;i<binaryData.length;i++){
            dataInt[i]=Integer.parseInt(""+binaryData[i]);
        }

        int i=0;
        for(int j=1;j<=7;j++){
            if(isPowerOf2(j)){
                switch(j){
                    case 1: hammedcode= "" + (dataInt[0]^dataInt[1]^dataInt[3]);
                    break;
                    case 2: hammedcode=hammedcode + (dataInt[0]^dataInt[2]^dataInt[3]);
                    break;
                    case 4: hammedcode=hammedcode + (dataInt[1]^dataInt[2]^dataInt[3]);
                    break;
                }
            }

            else{
                hammedcode=hammedcode + dataInt[i];
                i++;
            }
        }
        return hammedcode;
    }

    public static boolean isPowerOf2(int i){
        return (i & i-1)==0;
    }
}
