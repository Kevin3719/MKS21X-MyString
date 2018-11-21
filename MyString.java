public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
  }
  public CharSequence subSequence(int start, int end) {
    if (start < 0 || end < 0 || end > data.length) {throw new IndexOutOfBoundsExecption("Will throw Excpetion if start or end are negative, if end is greater than length(), or if start is greater than end");}
  }
  String output = s;
  while (end > start) {
    s += data[start];
  }
  return ouput;
}
