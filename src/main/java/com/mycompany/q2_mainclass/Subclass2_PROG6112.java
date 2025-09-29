package com.mycompany.Q2_MainClass;


  public abstract class Subclass2_PROG6112 implements InterfaceClass_PROG6112 {

  
  private String batsmanName;
  private String stadiumName;
  private int totalRunsScored;

  
  public Subclass2_PROG6112(String batsmanName, String stadiumName, int totalRunsScored) {
  this.batsmanName = batsmanName;
  this.stadiumName = stadiumName;
  this.totalRunsScored = totalRunsScored;
  }

  // ---------------- IMPLEMENTED INTERFACE METHODS ----------------
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
  return totalRunsScored;
  }

  // ---------------- ABSTRACT METHOD ----------------
  public abstract void printReport();
  }
