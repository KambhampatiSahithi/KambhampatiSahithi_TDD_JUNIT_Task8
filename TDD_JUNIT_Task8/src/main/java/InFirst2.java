public class InFirst2 {
    public String removal_ofA(String st){
        if(st.length()==0 || (st.length()==1 && st.charAt(0)=='A'))
            return "";
        if(st.length()==1 && st.charAt(0)!='A')
            return st;
        if(st.charAt(1)=='A')
            st = st.charAt(0)+st.substring(2);
        if(st.charAt(0)=='A')
            st = st.substring(1);
        final String st1 = st;
        return st1;
    }
}
