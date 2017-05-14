import java.io.*;



class Nuke2{
    public static void main(String[] arg) throws Exception{
     BufferedReader keyboard;
     String inputLine;
     keyboard = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Please input your word.");
     inputLine = keyboard.readLine();
     int n=1;
     System.out.println(inputLine.substring(0,n)+inputLine.substring(n+1));
  }
}
