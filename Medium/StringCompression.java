public class StringCompression {
    public static void main(String[] args) {
        String str = "aabbcdd";
        StringBuilder sb = new StringBuilder();

        int i=0;
        while(i < str.length()){
            int j=i;

            while(j < str.length() && str.charAt(i) == str.charAt(j)){
                j++;
            }

            sb.append(str.charAt(i));
            sb.append(j-i);
            i=j;
        }

        System.out.println(sb.toString());
    }
}
