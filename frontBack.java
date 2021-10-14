/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/

public String frontBack(String str){
  if(str.length() < 2)
    return str;
  char front = str.charAt(0);
  char back = str.charAt(str.length() - 1);
  String middle = str.substring(1, str.length() - 1);
  return back + middle + front;
}
