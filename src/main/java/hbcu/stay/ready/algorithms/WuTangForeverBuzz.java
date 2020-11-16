package hbcu.stay.ready.algorithms;



public class WuTangForeverBuzz {

    public String wuTangClan(){
        String str = "";
        int n = 15;
        for (int i = 1; i <= n;  i++) {

            if (i % 3 == 0 && i % 5 == 0 ) {
                str += "WuTang Forever";
                str += "\n";
            }else if(i % 3 == 0 ) {
                str += "Wu";
                str += "\n";
            }else if (i % 5 == 0) {
                str += "Tang";
                str += "\n";
            }else {
                str += i;
                str += "\n";
            }
         }
        return str.substring(0,str.length() -1);
    }
 }

