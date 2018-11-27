public class MyString implements CharSequence,Comparable<CharSequence>{
  // data is the only private variable;
  private char[] data;
  // basic message to throw is there is an out of array error.
  String arrayerror = "Will throw Excpetion if start or end are negative, if end is greater than length(), or if start is greater than end";
  public MyString(CharSequence s){
    if (s.length() < 0) {
      throw new StringIndexOutOfBoundsException("invalid parameters");
}
// data needs to be equal to the size of the chracters thrown.
    data = new char[s.length()];
// for loop to convert the chracter into a array
    for (int i = 0; i < s.length(); i += 1) {
      data[i] = s.charAt(i);
    }
  }

// for testing purposes and used once in code; not very important just creates an empty data
  public MyString(int length){
    if (length < 0) {
      throw new StringIndexOutOfBoundsException("invalid parameters");
}
    data = new char[length];
  }
  public CharSequence subSequence(int start, int end) {
    // will throw error if  if beginIndex or endIndex are negative, if endIndex is greater than length(), or if beginIndex is greater than startIndex
    if (start < 0 || end < 0 || end > data.length || start > end) {throw new IndexOutOfBoundsException(arrayerror);}
    MyString output = new MyString(end - start);
    // counter to make it eaiser
    int count = 0;
    for (int index = start; index < end; index += 1) {
      output.data[count] = data[index];
      count++;
    }
    // a mystring is a CharSequence
    return output;
  }
  public char charAt(int index) {
    if (index < 0 || index >= data.length) {throw new IndexOutOfBoundsException(arrayerror);}
    return data[index];
  }
  // returns data.length beccause data is a private variable
  public int length() {
    return data.length;
  }
  // compare to compares the value of the characters of the string until there are no characters left in one of them. Then checks if the lengths differ.
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
// quick toString using a loop
  public String toString() {
    String output = "";
    for (int i = 0; i < length(); i += 1) {
      output += charAt(i);
    }
    return output;
  }

}
