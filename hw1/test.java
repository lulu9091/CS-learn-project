 import java.net.*;
 import java.io.*;


class test {
  public static void main(String[] arg) throws Exception {
      URL url= new URL("http://www.1point3acres.com/");
      System.out.println(url.openStream());
}
}
