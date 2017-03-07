  public static String usrEncode(String usr)
  {
    String rtn = "{SRUN3}\r\n";
    char[] usr_arr = usr.toCharArray();
    for (int i = 0; i < usr_arr.length; i++) {
      rtn = rtn + (char)(usr_arr[i] + '\004');
    }
    return rtn;
  }
  
  public static String pwdEncode(String pwd)
  {
    String pe = "";
    for (int i = 0; i < pwd.length(); i++)
    {
      int ki = "1234567890".charAt("1234567890".length() - i % "1234567890".length() - 1) ^ pwd.charAt(i);
      char _l = (char)((ki & 0xF) + 54);
      char _h = (char)((ki >> 4 & 0xF) + 99);
      if (i % 2 == 0) {
        pe = pe + String.valueOf(_l) + String.valueOf(_h);
      } else {
        pe = pe + String.valueOf(_h) + String.valueOf(_l);
      }
    }
    return pe;
  }
}
