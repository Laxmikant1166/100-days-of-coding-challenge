public class Day12 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ").append(" World");
        System.out.println("Output of StringBuilder="+sb);


        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" ").append("World");
        System.out.println("Output of StringBuffer="+sf);


    }
    
}
