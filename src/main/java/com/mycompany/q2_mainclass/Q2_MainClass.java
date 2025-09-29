package com.mycompany.Q2_MainClass;

import java.util.Scanner;


interface InterfaceClass_PROG6112 {
String getBatsman();
String getStadium();
int getRunsScored();
}


abstract class Subclass2_PROG6112 implements InterfaceClass_PROG6112 {
protected String batsmanName;
protected String stadiumName;
protected int runsScored;

```
public Cricket(String batsmanName, String stadiumName, int runsScored) {
    this.batsmanName = batsmanName;
    this.stadiumName = stadiumName;
    this.runsScored = runsScored;
}

@Override
public String getBatsman() {
    return batsmanName;
}

@Override
public String getStadium() {
    return stadiumName;
}

@Override
public int getRunsScored() {
    return runsScored;
}
```

}


class Subclass1_PROG6112 extends Cricket {
public CricketRunsScored(String batsmanName, String stadiumName, int runsScored) {
super(batsmanName, stadiumName, runsScored);
}

```
public void printReport() {
    System.out.println("\nBATSMAN RUNS SCORED REPORT");
    System.out.println("**************************");
    System.out.println("CRICKET PLAYER: " + getBatsman());
    System.out.println("STADIUM: " + getStadium());
    System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
}
```

}


public class RunApplication {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

```
    
    System.out.print("The cricketer name: ");
    String batsmanName = scanner.nextLine();

    System.out.print("Enter the stadium: ");
    String stadiumName = scanner.nextLine();

    System.out.print("Enter the total runs scored by " + batsmanName + " at " + stadiumName + ": ");
    int totalRuns = scanner.nextInt();

    
    CricketRunsScored cricketReport = new CricketRunsScored(batsmanName, stadiumName, totalRuns);
    cricketReport.printReport();

    scanner.close();
}
```

}
