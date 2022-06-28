import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj ciag");
    String znak=scan.nextLine();
    char litera=znak.charAt(0);
    String ciag=znak;
    while(litera!='k')
      {
        ciag=ciag+znak;
       znak=scan.nextLine();
        litera=znak.charAt(0);
      }
    System.out.println(ciag);
  }
}