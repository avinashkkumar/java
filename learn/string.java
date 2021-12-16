public class string {
    public static void main(String args[]){

        String st = "Avinash Is A God Boy";
        System.out.println(st.length());
        System.out.println(st.startsWith("avi"));
        System.out.println(st.substring(1,4));
        System.out.println(st.endsWith("d"));
        System.out.println(st.replace(" ","_"));
        // char at returns the character at the given index
        System.out.println(st.charAt(4));
        System.out.println(st.toLowerCase());
    }
}
