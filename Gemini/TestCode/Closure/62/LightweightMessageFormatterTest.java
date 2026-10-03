package com.google.javascript.jscomp;

import static com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
import static com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LightweightMessageFormatterTest {

  private static final DiagnosticType ERROR_TYPE =
      DiagnosticType.error("TEST_ERROR", "{0}");
  private static final DiagnosticType WARNING_TYPE =
      DiagnosticType.warning("TEST_WARNING", "{0}");

  private static class SimpleRegionImpl implements Region {
    private final int beginningLine;
    private final int endingLine;
    private final String source;

    SimpleRegionImpl(int beginningLine, int endingLine, String source) {
      this.beginningLine = beginningLine;
      this.endingLine = endingLine;
      this.source = source;
    }

    @Override
    public int getBeginningLineNumber() {
      return beginningLine;
    }

    @Override
    public int getEndingLineNumber() {
      return endingLine;
    }

    @Override
    public String getSourceExcerpt() {
      return source;
    }
  }

  private static class SimpleSourceExcerptProvider implements SourceExcerptProvider {
    private final String lineSource;
    private final Region regionSource;

    SimpleSourceExcerptProvider(String lineSource, Region regionSource) {
      this.lineSource = lineSource;
      this.regionSource = regionSource;
    }

    @Override
    public String getSourceLine(String sourceName, int lineNumber) {
      return lineSource;
    }

    @Override
    public Region getSourceRegion(String sourceName, int lineNumber) {
      return regionSource;
    }
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullSourceProvider_throwsException() {
    new LightweightMessageFormatter(null);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullSourceProviderWithExcerpt_throwsException() {
    new LightweightMessageFormatter(null, LINE);
  }

  @Test
  public void testFormatError_withoutSource_noSourceName() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = JSError.make(ERROR_TYPE, "Error occurred");
    String formatted = formatter.formatError(error);
    assertEquals("ERROR - Error occurred\n", formatted);
  }

  @Test
  public void testFormatWarning_withoutSource_noSourceName() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError warning = JSError.make(WARNING_TYPE, "Warning occurred");
    String formatted = formatter.formatWarning(warning);
    assertEquals("WARNING - Warning occurred\n", formatted);
  }

  @Test
  public void testFormatError_withoutSource_withSourceAndLine() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = JSError.make("test.js", 10, 5, ERROR_TYPE, "Error occurred");
    String formatted = formatter.formatError(error);
    assertEquals("test.js:10: ERROR - Error occurred\n", formatted);
  }

  @Test
  public void testFormatError_withoutSource_withSourceAndZeroLine() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = JSError.make("test.js", 0, 5, ERROR_TYPE, "Error occurred");
    String formatted = formatter.formatError(error);
    assertEquals("test.js: ERROR - Error occurred\n", formatted);
  }

  @Test
  public void testFormatError_withoutSource_withSourceAndNegativeLine() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = JSError.make("test.js", -1, -1, ERROR_TYPE, "Error occurred");
    String formatted = formatter.formatError(error);
    assertEquals("test.js: ERROR - Error occurred\n", formatted);
  }

  @Test
  public void testFormatError_withSource_validCharnoAndExcerptLine() {
    SimpleSourceExcerptProvider provider =
        new SimpleSourceExcerptProvider("var a = 1;", null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, 4, ERROR_TYPE, "Variable error");
    String formatted = formatter.formatError(error);
    String expected = "test.js:1: ERROR - Variable error\nvar a = 1;\n    ^\n";
    assertEquals(expected, formatted);
  }

  @Test
  public void testFormatError_withSource_whitespacePreservedInPadding() {
    SimpleSourceExcerptProvider provider =
        new SimpleSourceExcerptProvider("\t  var a = 1;", null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, 5, ERROR_TYPE, "Variable error");
    String formatted = formatter.formatError(error);
    String expected = "test.js:1: ERROR - Variable error\n\t  var a = 1;\n\t   ^\n";
    assertEquals(expected, formatted);
  }

  @Test
  public void testFormatError_withSource_negativeCharno_noCaret() {
    SimpleSourceExcerptProvider provider =
        new SimpleSourceExcerptProvider("var a = 1;", null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, -1, ERROR_TYPE, "Variable error");
    String formatted = formatter.formatError(error);
    String expected = "test.js:1: ERROR - Variable error\nvar a = 1;\n";
    assertEquals(expected, formatted);
  }

  @Test
  public void testFormatError_withSource_charnoEqualToLength_noCaret() {
    String sourceLine = "var a = 1;";
    SimpleSourceExcerptProvider provider =
        new SimpleSourceExcerptProvider(sourceLine, null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, sourceLine.length(), ERROR_TYPE, "Variable error");
    String formatted = formatter.formatError(error);
    String expected = "test.js:1: ERROR - Variable error\nvar a = 1;\n";
    assertEquals(expected, formatted);
  }

  @Test
  public void testFormatError_withSource_charnoGreaterThanLength_noCaret() {
    String sourceLine = "var a = 1;";
    SimpleSourceExcerptProvider provider =
        new SimpleSourceExcerptProvider(sourceLine, null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, sourceLine.length() + 5, ERROR_TYPE, "Variable error");
    String formatted = formatter.formatError(error);
    String expected = "test.js:1: ERROR - Variable error\nvar a = 1;\n";
    assertEquals(expected, formatted);
  }

  @Test
  public void testFormatError_withRegionExcerpt_noCaret() {
    Region region = new SimpleRegionImpl(1, 2, "var a = 1;\nvar b = 2;");
    SimpleSourceExcerptProvider provider =
        new SimpleSourceExcerptProvider(null, region);
    LightweightMessageFormatter formatter =
        new LightweightMessageFormatter(provider, REGION);
    JSError error = JSError.make("test.js", 1, 2, ERROR_TYPE, "Region error");
    String formatted = formatter.formatError(error);
    assertTrue(formatted.contains("  1| var a = 1;\n  2| var b = 2;"));
    assertTrue(!formatted.contains("^"));
  }

  @Test
  public void testLineNumberingFormatter_formatLine() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    assertEquals("test line", formatter.formatLine("test line", 10));
    assertEquals("", formatter.formatLine("", 1));
    assertNull(formatter.formatLine(null, 1));
  }

  @Test
  public void testLineNumberingFormatter_formatRegion_nullRegion() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    assertNull(formatter.formatRegion(null));
  }

  @Test
  public void testLineNumberingFormatter_formatRegion_emptyCode() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    Region region = new SimpleRegionImpl(1, 1, "");
    assertNull(formatter.formatRegion(region));
  }

  @Test
  public void testLineNumberingFormatter_formatRegion_singleLineNoNewline() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    Region region = new SimpleRegionImpl(5, 5, "alert('single');");
    String result = formatter.formatRegion(region);
    assertEquals("  5| alert('single');", result);
  }

  @Test
  public void testLineNumberingFormatter_formatRegion_multiLineWithPaddedNumbers() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    String code = "line 9\nline 10\nline 11";
    Region region = new SimpleRegionImpl(9, 11, code);
    String result = formatter.formatRegion(region);
    String expected = "   9| line 9\n  10| line 10\n  11| line 11";
    assertEquals(expected, result);
  }

  @Test
  public void testLineNumberingFormatter_formatRegion_endsWithNewline() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    String code = "line 1\nline 2\n";
    Region region = new SimpleRegionImpl(1, 2, code);
    String result = formatter.formatRegion(region);
    String expected = "  1| line 1\n  2| line 2";
    assertEquals(expected, result);
  }
}
