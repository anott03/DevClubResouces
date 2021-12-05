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
