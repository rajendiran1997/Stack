public class DOB {
    public static void main(String args[]) {
        int cur_month = 9;
        int cur_year = 2018;
        
        int dob_month = 5;
        int dob_year = 1997;
        
        System.out.println((cur_month - dob_month)>=0?"Year "+ (cur_year - dob_year) + " Months "+ (cur_month - dob_month):"Year "+ ((cur_year - dob_year) - 1) + " Months "+ (12 -(dob_month - cur_month)));
    }
}
