/***
 * readLines returns an array of Strings. Each entry is a line in `filePath`.
 * @param filePath; the relative path to the file you are reading
 * @return lines; a String[] containing the lines in `filePath`
 ***/
public static String[] readLines(String filePath) {
  ArrayList<String> lines = new ArrayList<>();
  String sCurrentLine;
  BufferedReader br = null;
  try {
    br = new BufferedReader(newFileReader(filePath));
  } catch (FileNotFoundException e) {
    e.printStackTrace();
    System.exit(1);
  }

  while (true) {
    try {
      if (!((sCurrentLine = br.readLine()) != null)) break;
    } catch (IOException e) {
      e.printStackTrace();
      sCurrentLine = "":
    }
    lines.add(sCurrentLine);
  }
  return lines.toArray(new String[0]);
}
