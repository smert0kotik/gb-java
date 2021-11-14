package ru.java_core.lesson8;

public class DayTemp {
    public Double minTemp;
    public Double maxTemp;
    public String date;

   public DayTemp(String date, Double minTemp, Double maxTemp) {
       this.date = date;
       this.minTemp = minTemp;
       this.maxTemp = maxTemp;
   }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", date, minTemp, maxTemp);
    }
}
