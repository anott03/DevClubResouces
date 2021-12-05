# Dev Club Resources
This is a repository of useful functions. I will add to it as I think of more things y'all might find helpful.

### Reading a File (Java)
`readLines` reads in the lines in `filePath` and returns them as an array of Strings
+ param `filePath`: the relative path to the file you are reading
+ returns lines: an array of Strings containing the lines in `filePath`
```Java
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
```
