import com.google.javascript.jscomp.SourceFile;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class SourceFileTest {

  private File tempFile;

  @Before
  public void setUp() throws IOException {
    tempFile = File.createTempFile("SourceFileTest", ".js");
    tempFile.deleteOnExit();
  }

  @After
  public void tearDown() {
    if (tempFile != null && tempFile.exists()) {
      tempFile.delete();
    }
  }

  private void writeToFile(File file, String content) throws IOException {
    FileWriter writer = new FileWriter(file);
    try {
      writer.write(content);
    } finally {
      writer.close();
    }
  }

  // ---------------------------------------------------------------
  // Constructor tests
  // ---------------------------------------------------------------

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_nullFileName_throwsException() {
    new SourceFile(null) {
    };
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_emptyFileName_throwsException() {
    new SourceFile("") {
    };
  }

  @Test
  public void testConstructor_validFileName_success() {
    SourceFile sf = SourceFile.fromCode("test.js", "var x = 1;");
    assertEquals("test.js", sf.getName());
  }

  // ---------------------------------------------------------------
  // getName / toString
  // ---------------------------------------------------------------

  @Test
  public void testGetName_returnsFileName() {
    SourceFile sf = SourceFile.fromCode("myFile.js", "code");
    assertEquals("myFile.js", sf.getName());
  }

  @Test
  public void testToString_returnsFileName() {
    SourceFile sf = SourceFile.fromCode("myFile.js", "code");
    assertEquals("myFile.js", sf.toString());
  }

  // ---------------------------------------------------------------
  // getCode / getCodeReader / getCodeNoCache
  // ---------------------------------------------------------------

  @Test
  public void testGetCode_returnsCode() throws IOException {
    SourceFile sf = SourceFile.fromCode("a.js", "var a = 1;");
    assertEquals("var a = 1;", sf.getCode());
  }

  @Test
  public void testGetCodeReader_returnsReaderWithCode() throws IOException {
    SourceFile sf = SourceFile.fromCode("a.js", "hello world");
    Reader reader = sf.getCodeReader();
    char[] buffer = new char[11];
    int read = reader.read(buffer);
    assertEquals(11, read);
    assertEquals("hello world", new String(buffer));
    reader.close();
  }

  @Test
  public void testGetCodeNoCache_returnsCachedCode() {
    SourceFile sf = SourceFile.fromCode("a.js", "some code");
    assertEquals("some code", sf.getCodeNoCache());
  }

  // ---------------------------------------------------------------
  // getOriginalPath / setOriginalPath
  // ---------------------------------------------------------------

  @Test
  public void testGetOriginalPath_defaultReturnsFileName() {
    SourceFile sf = SourceFile.fromCode("file.js", "code");
    assertEquals("file.js", sf.getOriginalPath());
  }

  @Test
  public void testGetOriginalPath_afterFromCodeWithOriginalPath_returnsSetPath() {
    SourceFile sf = SourceFile.fromCode("file.js", "original/path.js", "code");
    assertEquals("original/path.js", sf.getOriginalPath());
  }

  @Test
  public void testSetOriginalPath_thenGetOriginalPath_returnsUpdatedPath() {
    SourceFile sf = SourceFile.fromCode("file.js", "code");
    sf.setOriginalPath("new/path.js");
    assertEquals("new/path.js", sf.getOriginalPath());
  }

  // ---------------------------------------------------------------
  // isExtern / setIsExtern
  // ---------------------------------------------------------------

  @Test
  public void testIsExtern_defaultFalse() {
    SourceFile sf = SourceFile.fromCode("file.js", "code");
    assertFalse(sf.isExtern());
  }

  @Test
  public void testSetIsExtern_true_returnsTrue() {
    SourceFile sf = SourceFile.fromCode("file.js", "code");
    sf.setIsExtern(true);
    assertTrue(sf.isExtern());
  }

  // ---------------------------------------------------------------
  // getLineOffset / getNumLines
  // ---------------------------------------------------------------

  @Test
  public void testGetLineOffset_validLine_returnsOffset() {
    SourceFile sf = SourceFile.fromCode("file.js", "aaa\nbb\nc");
    assertEquals(0, sf.getLineOffset(1));
    assertEquals(4, sf.getLineOffset(2));
    assertEquals(7, sf.getLineOffset(3));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetLineOffset_lineZero_throwsException() {
    SourceFile sf = SourceFile.fromCode("file.js", "aaa\nbb\nc");
    sf.getLineOffset(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetLineOffset_lineTooLarge_throwsException() {
    SourceFile sf = SourceFile.fromCode("file.js", "aaa\nbb\nc");
    sf.getLineOffset(100);
  }

  @Test
  public void testGetNumLines_returnsCorrectCount() {
    SourceFile sf = SourceFile.fromCode("file.js", "line1\nline2\nline3");
    assertEquals(3, sf.getNumLines());
  }

  @Test
  public void testGetNumLines_singleLine_returnsOne() {
    SourceFile sf = SourceFile.fromCode("file.js", "single line");
    assertEquals(1, sf.getNumLines());
  }

  // ---------------------------------------------------------------
  // getLine
  // ---------------------------------------------------------------

  @Test
  public void testGetLine_validLineWithTrailingNewline_returnsLine() {
    SourceFile sf = SourceFile.fromCode("file.js", "line1\nline2\nline3\n");
    assertEquals("line1", sf.getLine(1));
    assertEquals("line2", sf.getLine(2));
    assertEquals("line3", sf.getLine(3));
  }

  @Test
  public void testGetLine_lineNumberOutOfBounds_returnsNull() {
    SourceFile sf = SourceFile.fromCode("file.js", "line1\nline2\n");
    assertNull(sf.getLine(10));
  }

  @Test
  public void testGetLine_lastLineWithoutTrailingNewline_returnsNull() {
    SourceFile sf = SourceFile.fromCode("file.js", "line1\nline2\nline3");
    // last line has no trailing newline, so implementation returns null
    assertNull(sf.getLine(3));
  }

  @Test
  public void testGetLine_repeatedCallsUseCachedOffset_returnsCorrectLine() {
    SourceFile sf = SourceFile.fromCode("file.js", "l1\nl2\nl3\nl4\nl5\n");
    assertEquals("l1", sf.getLine(1));
    // second call for a line number >= lastLine exercises the cached-offset branch
    assertEquals("l3", sf.getLine(3));
    assertEquals("l5", sf.getLine(5));
  }

  // ---------------------------------------------------------------
  // getRegion
  // ---------------------------------------------------------------

  @Test
  public void testGetRegion_validLine_returnsNonNullRegion() {
    SourceFile sf = SourceFile.fromCode("file.js",
        "l1\nl2\nl3\nl4\nl5\nl6\nl7\nl8\nl9\nl10\n");
    Object region = sf.getRegion(5);
    assertNotNull(region);
  }

  @Test
  public void testGetRegion_lineNumberBeyondFile_returnsNull() {
    SourceFile sf = SourceFile.fromCode("file.js", "l1\nl2\n");
    Object region = sf.getRegion(1000);
    assertNull(region);
  }

  @Test
  public void testGetRegion_firstLine_returnsNonNullRegion() {
    SourceFile sf = SourceFile.fromCode("file.js",
        "l1\nl2\nl3\nl4\nl5\nl6\n");
    Object region = sf.getRegion(1);
    assertNotNull(region);
  }

  @Test
  public void testGetRegion_codeWithoutTrailingNewline_returnsRegion() {
    SourceFile sf = SourceFile.fromCode("file.js", "l1\nl2\nl3");
    Object region = sf.getRegion(1);
    assertNotNull(region);
  }

  // ---------------------------------------------------------------
  // clearCachedSource / hasSourceInMemory
  // ---------------------------------------------------------------

  @Test
  public void testHasSourceInMemory_afterFromCode_returnsTrue() {
    SourceFile sf = SourceFile.fromCode("file.js", "code");
    assertTrue(sf.hasSourceInMemory());
  }

  @Test
  public void testClearCachedSource_onPreloaded_doesNotClearCode() throws IOException {
    SourceFile sf = SourceFile.fromCode("file.js", "code");
    sf.clearCachedSource();
    // Preloaded does not override clearCachedSource, so code remains
    assertTrue(sf.hasSourceInMemory());
    assertEquals("code", sf.getCode());
  }

  @Test
  public void testClearCachedSource_onGenerated_clearsCache() throws IOException {
    SourceFile.Generator generator = new SourceFile.Generator() {
      @Override
      public String getCode() {
        return "generated code";
      }
    };
    SourceFile sf = SourceFile.fromGenerator("gen.js", generator);
    assertEquals("generated code", sf.getCode());
    assertTrue(sf.hasSourceInMemory());
    sf.clearCachedSource();
    assertFalse(sf.hasSourceInMemory());
  }

  @Test
  public void testClearCachedSource_onDisk_clearsCache() throws IOException {
    writeToFile(tempFile, "on disk content");
    SourceFile sf = SourceFile.fromFile(tempFile);
    assertFalse(sf.hasSourceInMemory());
    assertEquals("on disk content", sf.getCode());
    assertTrue(sf.hasSourceInMemory());
    sf.clearCachedSource();
    assertFalse(sf.hasSourceInMemory());
  }

  // ---------------------------------------------------------------
  // fromFile
  // ---------------------------------------------------------------

  @Test
  public void testFromFile_readsFileContent() throws IOException {
    writeToFile(tempFile, "file content here");
    SourceFile sf = SourceFile.fromFile(tempFile);
    assertEquals("file content here", sf.getCode());
  }

  @Test
  public void testFromFile_withFileNameString_readsContent() throws IOException {
    writeToFile(tempFile, "string path content");
    SourceFile sf = SourceFile.fromFile(tempFile.getPath());
    assertEquals("string path content", sf.getCode());
  }

  @Test
  public void testFromFile_withCharset_readsContentCorrectly() throws IOException {
    writeToFile(tempFile, "utf8 content");
    SourceFile sf = SourceFile.fromFile(tempFile, Charset.forName("UTF-8"));
    assertEquals("utf8 content", sf.getCode());
  }

  @Test
  public void testFromFile_withFileNameStringAndCharset_readsContent() throws IOException {
    writeToFile(tempFile, "charset string content");
    SourceFile sf = SourceFile.fromFile(tempFile.getPath(), Charset.forName("UTF-8"));
    assertEquals("charset string content", sf.getCode());
  }

  @Test
  public void testFromFile_getCodeReader_whenNoSourceInMemory_readsFromDisk() throws IOException {
    writeToFile(tempFile, "reader content");
    SourceFile sf = SourceFile.fromFile(tempFile);
    assertFalse(sf.hasSourceInMemory());
    Reader reader = sf.getCodeReader();
    char[] buffer = new char[15];
    int read = reader.read(buffer);
    assertEquals(15, read);
    assertEquals("reader content", new String(buffer));
    reader.close();
    // getCodeReader on OnDisk without cached source should not populate the cache
    assertFalse(sf.hasSourceInMemory());
  }

  @Test
  public void testFromFile_getCodeReader_whenSourceInMemory_usesCachedCode() throws IOException {
    writeToFile(tempFile, "cached reader content");
    SourceFile sf = SourceFile.fromFile(tempFile);
    sf.getCode(); // force caching
    assertTrue(sf.hasSourceInMemory());
    Reader reader = sf.getCodeReader();
    char[] buffer = new char[22];
    int read = reader.read(buffer);
    assertEquals(22, read);
    assertEquals("cached reader content", new String(buffer));
    reader.close();
  }

  @Test
  public void testFromFile_nonExistentFile_throwsIOExceptionOnGetCode() {
    File nonExistent = new File("this_file_does_not_exist_12345.js");
    SourceFile sf = SourceFile.fromFile(nonExistent);
    try {
      sf.getCode();
      fail("Expected IOException");
    } catch (IOException e) {
      // expected
    }
  }

  @Test
  public void testOnDisk_getName_returnsFilePath() {
    SourceFile sf = SourceFile.fromFile(tempFile);
    assertEquals(tempFile.getPath(), sf.getName());
  }

  // ---------------------------------------------------------------
  // fromCode
  // ---------------------------------------------------------------

  @Test
  public void testFromCode_returnsCode() throws IOException {
    SourceFile sf = SourceFile.fromCode("code.js", "var a = 1;");
    assertEquals("var a = 1;", sf.getCode());
    assertEquals("code.js", sf.getName());
  }

  @Test
  public void testFromCode_withOriginalPath_setsOriginalPath() {
    SourceFile sf = SourceFile.fromCode("code.js", "orig/path.js", "var a = 1;");
    assertEquals("orig/path.js", sf.getOriginalPath());
    assertEquals("code.js", sf.getName());
  }

  // ---------------------------------------------------------------
  // fromInputStream
  // ---------------------------------------------------------------

  @Test
  public void testFromInputStream_returnsCode() throws IOException {
    InputStream is = new ByteArrayInputStream("stream content".getBytes("UTF-8"));
    SourceFile sf = SourceFile.fromInputStream("stream.js", is);
    assertEquals("stream content", sf.getCode());
  }

  @Test
  public void testFromInputStream_withOriginalPath_setsOriginalPath() throws IOException {
    InputStream is = new ByteArrayInputStream("stream content 2".getBytes("UTF-8"));
    SourceFile sf = SourceFile.fromInputStream("stream.js", "orig/stream.js", is);
    assertEquals("stream content 2", sf.getCode());
    assertEquals("orig/stream.js", sf.getOriginalPath());
  }

  // ---------------------------------------------------------------
  // fromReader
  // ---------------------------------------------------------------

  @Test
  public void testFromReader_returnsCode() throws IOException {
    Reader reader = new StringReader("reader based content");
    SourceFile sf = SourceFile.fromReader("reader.js", reader);
    assertEquals("reader based content", sf.getCode());
  }

  // ---------------------------------------------------------------
  // fromGenerator
  // ---------------------------------------------------------------

  @Test
  public void testFromGenerator_returnsGeneratedCode() throws IOException {
    SourceFile.Generator generator = new SourceFile.Generator() {
      @Override
      public String getCode() {
        return "generated content";
      }
    };
    SourceFile sf = SourceFile.fromGenerator("gen.js", generator);
    assertEquals("generated content", sf.getCode());
  }

  @Test
  public void testFromGenerator_cachesGeneratedCode() throws IOException {
    final int[] callCount = {0};
    SourceFile.Generator generator = new SourceFile.Generator() {
      @Override
      public String getCode() {
        callCount[0]++;
        return "cached generated content";
      }
    };
    SourceFile sf = SourceFile.fromGenerator("gen.js", generator);
    sf.getCode();
    sf.getCode();
    assertEquals(1, callCount[0]);
  }

  @Test
  public void testFromGenerator_afterClearCachedSource_regeneratesCode() throws IOException {
    final int[] callCount = {0};
    SourceFile.Generator generator = new SourceFile.Generator() {
      @Override
      public String getCode() {
        callCount[0]++;
        return "regenerated content";
      }
    };
    SourceFile sf = SourceFile.fromGenerator("gen.js", generator);
    sf.getCode();
    sf.clearCachedSource();
    sf.getCode();
    assertEquals(2, callCount[0]);
  }
}
