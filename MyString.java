public class MyString implements CharSequence,Comparable<CharSequence>{
  // data is the only private variable;
  private char[] data;
  String arrayerror = "Will throw Excpetion if start or end are negative, if end is greater than length(), or if start is greater than end";
  public MyString(CharSequence s){
    if (s.length() < 0) {
      throw new StringIndexOutOfBoundsException("invalid parameters");
}
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i += 1) {
      data[i] = s.charAt(i);
    }
  }
  public MyString subSequence(int start, int end) {
    if (start < 0 || end < 0 || end > data.length || start > end) {throw new StringIndexOutOfBoundsException(arrayerror);}
    CharSequence input = this.subSequence(start, end);
    MyString output = new MyString(input);
    return output;
  }
  public char charAt(int index) {
    if (index < 0 || index >= data.length) {throw new StringIndexOutOfBoundsException(arrayerror);}
    return data[index];
  }

  public int length() {
    return data.length;
  }
  public int compareTo(CharSequence other) {
    for (int i = 0; i < this.length() && i < other.length(); i += 1) {
      if (this.charAt(i) < other.charAt(i)) {
        return -1;
      }
      if (this.charAt(i) > other.charAt(i)) {
        return 1;
      }
    }
    if (this.length() == other.length()) {return 0;}
    if (this.length() > other.length()) {return 1;}
    return -1;
  }

}
