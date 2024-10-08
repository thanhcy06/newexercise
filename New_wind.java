public class New_wind {
  private int day, month, year;
  public New_wind(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
  }
  public int getDay() {
      return day;
  }
  public int getMonth() {
      return month;
  }
  public int getYear() {
      return year;
  }
  public void setDay(int day) {
      this.day = day;
  }
  public void setMonth(int month) {
      this.month = month;
  }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
    }
    public String toString() {
   //  return "Day: " + day + ", Month: " + month + ", Year: " + year;
       return String.format("%02d/%02d/%d", day, month, year);}
}
