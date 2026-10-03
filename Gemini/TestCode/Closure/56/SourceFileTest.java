package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class SourceFileTest {

  @Rule
  public TemporaryFolder tempFolder = new TemporaryFolder();

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_nullFileName_throwsException() {
    new SourceFile(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_emptyFileName_throwsException() {
    new SourceFile("");
  }

  @Test
  public void testConstructor_validFileName_success() {
    SourceFile sf = new SourceFile("valid/path.js");
    Assert.assertEquals("valid/path.js", sf.getName());
    Assert.assertEquals("valid/path.js", sf.getOriginalPath());
    Assert.assertEquals("valid/path.js", sf.toString());
    Assert.assertFalse(sf.isExtern());
    Assert.assertFalse(sf.hasSourceInMemory());
    Assert.assertNull(sf.getCodeNoCache());
  }

  @Test
  public void testGetOriginalPath_setOriginalPath_returnsCustomPath() {
    SourceFile sf = new SourceFile("actual.js");
    Assert.assertEquals("actual.js", sf.getOriginalPath());
    sf.setOriginalPath("original.js");
    Assert.assertEquals("original.js", sf.getOriginalPath());
  }

  @Test
  public void testIsExtern_setIsExtern_updatesFlag() {
    SourceFile sf = SourceFile.fromCode("test.js", "var x = 1;");
    Assert.assertFalse(sf.isExtern());
    sf.setIsExtern(true);
    Assert.assertTrue(sf.isExtern());
    sf.setIsExtern(false);
    Assert.assertFalse(sf.isExtern());
  }

  @Test
  public void testFromCode_twoArgs_createsPreloaded() throws IOException {
    SourceFile sf = SourceFile.fromCode("foo.js", "var a = 10;\nvar b = 20;");
    Assert.assertEquals("foo.js", sf.getName());
    Assert.assertEquals("foo.js", sf.getOriginalPath());
    Assert.assertEquals("var a = 10;\nvar b = 20;", sf.getCode());
    Assert.assertTrue(sf.hasSourceInMemory());
    Assert.assertEquals("var a = 10;\nvar b = 20;", sf.getCodeNoCache());
  }

  @Test
  public void testFromCode_threeArgs_createsPreloadedWithOriginalPath() throws IOException {
    SourceFile sf = SourceFile.fromCode("foo.js", "orig/foo.js", "var a = 10;");
    Assert.assertEquals("foo.js", sf.getName());
    Assert.assertEquals("orig/foo.js", sf.getOriginalPath());
    Assert.assertEquals("var a = 10;", sf.getCode());
  }

  @Test
  public void testFromInputStream_twoArgs_createsSourceFile() throws IOException {
    byte[] bytes = "var stream = true;".getBytes(StandardCharsets.UTF_8);
    ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
    SourceFile sf = SourceFile.fromInputStream("stream.js", bais);
    Assert.assertEquals("stream.js", sf.getName());
    Assert.assertEquals("var stream = true;", sf.getCode());
  }

  @Test
  public void testFromInputStream_threeArgs_createsSourceFile() throws IOException {
    byte[] bytes = "var stream = 123;".getBytes(StandardCharsets.UTF_8);
    ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
    SourceFile sf = SourceFile.fromInputStream("stream.js", "orig/stream.js", bais);
    Assert.assertEquals("stream.js", sf.getName());
    Assert.assertEquals("orig/stream.js", sf.getOriginalPath());
    Assert.assertEquals("var stream = 123;", sf.getCode());
  }

  @Test
  public void testFromReader_validReader_createsSourceFile() throws IOException {
    StringReader reader = new StringReader("var r = 1;");
    SourceFile sf = SourceFile.fromReader("reader.js", reader);
    Assert.assertEquals("reader.js", sf.getName());
    Assert.assertEquals("var r = 1;", sf.getCode());
  }

  @Test
  public void testFromGenerator_cachingAndClearCache() throws IOException {
    final int[] callCount = new int[]{0};
    SourceFile.Generator generator = new SourceFile.Generator() {
      @Override
      public String getCode() {
        callCount[0]++;
        return "var generated = " + callCount[0] + ";";
      }
    };

    SourceFile sf = SourceFile.fromGenerator("gen.js", generator);
    Assert.assertNull(sf.getCodeNoCache());

    Assert.assertEquals("var generated = 1;", sf.getCode());
    Assert.assertEquals(1, callCount[0]);

    // Subsequent call should hit cache
    Assert.assertEquals("var generated = 1;", sf.getCode());
    Assert.assertEquals(1, callCount[0]);

    // Clear cache
    sf.clearCachedSource();
    Assert.assertNull(sf.getCodeNoCache());

    // Next getCode generates again
    Assert.assertEquals("var generated = 2;", sf.getCode());
    Assert.assertEquals(2, callCount[0]);
  }

  @Test
  public void testFromFile_stringPathAndCharset() throws IOException {
    File tempFile = tempFolder.newFile("test_from_str.js");
    Files.write("var fileStr = true;\n", tempFile, StandardCharsets.UTF_8);

    SourceFile sf = SourceFile.fromFile(tempFile.getAbsolutePath(), StandardCharsets.UTF_8);
    Assert.assertEquals(tempFile.getPath(), sf.getName());
    Assert.assertEquals("var fileStr = true;\n", sf.getCode());

    SourceFile sfDefaultCharset = SourceFile.fromFile(tempFile.getAbsolutePath());
    Assert.assertEquals("var fileStr = true;\n", sfDefaultCharset.getCode());
  }

  @Test
  public void testFromFile_fileAndCharset() throws IOException {
    File tempFile = tempFolder.newFile("test_from_file.js");
    Files.write("var fileObj = 1;\nvar fileObj2 = 2;\n", tempFile, StandardCharsets.UTF_8);

    SourceFile sf = SourceFile.fromFile(tempFile, StandardCharsets.UTF_8);
    Assert.assertEquals(tempFile.getPath(), sf.getName());
    Assert.assertEquals("var fileObj = 1;\nvar fileObj2 = 2;\n", sf.getCode());

    SourceFile sfDefault = SourceFile.fromFile(tempFile);
    Assert.assertEquals("var fileObj = 1;\nvar fileObj2 = 2;\n", sfDefault.getCode());
  }

  @Test
  public void testOnDisk_charsetOperationsAndCodeReader() throws IOException {
    File tempFile = tempFolder.newFile("test_ondisk.js");
    Files.write("var disk = 'ok';\n", tempFile, StandardCharsets.ISO_8859_1);

    SourceFile.OnDisk onDisk = new SourceFile.OnDisk(tempFile, null);
    Assert.assertEquals(Charsets.UTF_8, onDisk.getCharset());

    onDisk.setCharset(StandardCharsets.ISO_8859_1);
    Assert.assertEquals(StandardCharsets.ISO_8859_1, onDisk.getCharset());

    // Test getCodeReader before cached in memory
    Assert.assertFalse(onDisk.hasSourceInMemory());
    Reader readerBefore = onDisk.getCodeReader();
    Assert.assertNotNull(readerBefore);
    readerBefore.close();

    // Cache code in memory
    Assert.assertEquals("var disk = 'ok';\n", onDisk.getCode());
    Assert.assertTrue(onDisk.hasSourceInMemory());

    // Test getCodeReader after cached in memory
    Reader readerAfter = onDisk.getCodeReader();
    char[] buf = new char[32];
    int read = readerAfter.read(buf);
    Assert.assertEquals("var disk = 'ok';\n", new String(buf, 0, read));

    // Clear cache
    onDisk.clearCachedSource();
    Assert.assertFalse(onDisk.hasSourceInMemory());
  }

  @Test
  public void testGetCodeReader_preloaded() throws IOException {
    SourceFile sf = SourceFile.fromCode("code.js", "var readerCode = true;");
    Reader reader = sf.getCodeReader();
    char[] buf = new char[32];
    int read = reader.read(buf);
    Assert.assertEquals("var readerCode = true;", new String(buf, 0, read));
  }

  @Test
  public void testClearCachedSource_baseClassDoesNothing() {
    SourceFile sf = SourceFile.fromCode("base.js", "var x = 1;");
    sf.clearCachedSource();
    Assert.assertTrue(sf.hasSourceInMemory());
  }

  @Test
  public void testGetNumLines_and_getLineOffset() {
    String code = "line1\nline22\n\nline4444\nline5";
    SourceFile sf = SourceFile.fromCode("lines.js", code);

    Assert.assertEquals(5, sf.getNumLines());
    // line 1 offset 0
    Assert.assertEquals(0, sf.getLineOffset(1));
    // line 2 offset: "line1\n" -> 6
    Assert.assertEquals(6, sf.getLineOffset(2));
    // line 3 offset: 6 + "line22\n" (7) -> 13
    Assert.assertEquals(13, sf.getLineOffset(3));
    // line 4 offset: 13 + "\n" (1) -> 14
    Assert.assertEquals(14, sf.getLineOffset(4));
    // line 5 offset: 14 + "line4444\n" (9) -> 23
    Assert.assertEquals(23, sf.getLineOffset(5));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetLineOffset_zeroIndex_throwsException() {
    SourceFile sf = SourceFile.fromCode("test.js", "line1\nline2");
    sf.getLineOffset(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetLineOffset_negativeIndex_throwsException() {
    SourceFile sf = SourceFile.fromCode("test.js", "line1\nline2");
    sf.getLineOffset(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetLineOffset_outOfRangeIndex_throwsException() {
    SourceFile sf = SourceFile.fromCode("test.js", "line1\nline2");
    sf.getLineOffset(3);
  }

  @Test
  public void testGetLine_sequentialAndRandomAccess() {
    String code = "first line\nsecond line\nthird line\nfourth line\n";
    SourceFile sf = SourceFile.fromCode("test.js", code);

    // Sequential queries (forward)
    Assert.assertEquals("first line", sf.getLine(1));
    Assert.assertEquals("second line", sf.getLine(2));
    Assert.assertEquals("third line", sf.getLine(3));
    Assert.assertEquals("fourth line", sf.getLine(4));
    Assert.assertNull(sf.getLine(5));
    Assert.assertNull(sf.getLine(100));

    // Backward query (lineNumber < lastLine)
    Assert.assertEquals("second line", sf.getLine(2));
    Assert.assertEquals("first line", sf.getLine(1));
    Assert.assertEquals("fourth line", sf.getLine(4));

    // Without trailing newline
    SourceFile sfNoTrailing = SourceFile.fromCode("test2.js", "line1\nline2");
    Assert.assertEquals("line1", sfNoTrailing.getLine(1));
    // line 2 does not end with newline, getLine returns null per implementation
    Assert.assertNull(sfNoTrailing.getLine(2));
  }

  @Test
  public void testGetRegion_withinBoundsAndVariousLineLengths() {
    String code = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";
    SourceFile sf = SourceFile.fromCode("test.js", code);

    // Line 1: startLine = max(1, 1 - 3 + 1) = 1. EndLine = 6. Region: lines 1..5
    Region r1 = sf.getRegion(1);
    Assert.assertNotNull(r1);
    Assert.assertEquals(1, r1.getBeginningLineNumber());
    Assert.assertEquals(6, r1.getEndingLineNumber());
    Assert.assertEquals("1\n2\n3\n4\n5\n", r1.getSourceExcerpt());

    // Line 5: startLine = max(1, 5 - 3 + 1) = 3. EndLine = 8. Region: lines 3..7
    Region r5 = sf.getRegion(5);
    Assert.assertNotNull(r5);
    Assert.assertEquals(3, r5.getBeginningLineNumber());
    Assert.assertEquals(8, r5.getEndingLineNumber());
    Assert.assertEquals("3\n4\n5\n6\n7\n", r5.getSourceExcerpt());

    // Out of bounds line
    Assert.assertNull(sf.getRegion(20));
  }

  @Test
  public void testGetRegion_shortFileWithTrailingNewline() {
    String code = "line1\nline2\n";
    SourceFile sf = SourceFile.fromCode("short.js", code);

    Region r = sf.getRegion(1);
    Assert.assertNotNull(r);
    Assert.assertEquals(1, r.getBeginningLineNumber());
    Assert.assertEquals(3, r.getEndingLineNumber());
    Assert.assertEquals("line1\nline2", r.getSourceExcerpt());
  }

  @Test
  public void testGetRegion_shortFileWithoutTrailingNewline() {
    String code = "line1\nline2";
    SourceFile sf = SourceFile.fromCode("short_notrail.js", code);

    Region r = sf.getRegion(1);
    Assert.assertNotNull(r);
    Assert.assertEquals(1, r.getBeginningLineNumber());
    Assert.assertEquals(3, r.getEndingLineNumber());
    Assert.assertEquals("line1\nline2", r.getSourceExcerpt());
  }

  @Test
  public void testIOExceptionHandling_inLineOffsetsGetLineAndGetRegion() {
    SourceFile sf = new SourceFile("io_error.js") {
      private static final long serialVersionUID = 1L;

      @Override
      public String getCode() throws IOException {
        throw new IOException("Simulated IO failure");
      }
    };

    // findLineOffsets falls back to 1 line at offset 0 on IOException
    Assert.assertEquals(1, sf.getNumLines());
    Assert.assertEquals(0, sf.getLineOffset(1));

    // getLine returns null on IOException
    Assert.assertNull(sf.getLine(1));

    // getRegion returns null on IOException
    Assert.assertNull(sf.getRegion(1));
  }
}
