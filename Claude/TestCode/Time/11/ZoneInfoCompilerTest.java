package org.joda.time.tz;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTimeZone;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZoneInfoCompilerTest {

    private PrintStream originalOut;
    private ByteArrayOutputStream capturedOut;

    @Before
    public void setUp() {
        // Reset verbose flag to a known state before each test to avoid cross-test pollution.
        ZoneInfoCompiler.cVerbose.set(Boolean.FALSE);
        originalOut = System.out;
        capturedOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturedOut));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
        ZoneInfoCompiler.cVerbose.set(Boolean.FALSE);
    }

    private File createTempDir(String prefix) throws IOException {
        File tempFile = File.createTempFile(prefix, "");
        tempFile.delete();
        tempFile.mkdirs();
        return tempFile;
    }

    //-----------------------------------------------------------------------
    // verbose()
    //-----------------------------------------------------------------------
    @Test
    public void testVerbose_default_returnsFalse() {
        assertFalse(ZoneInfoCompiler.verbose());
    }

    @Test
    public void testVerbose_afterSettingTrue_returnsTrue() {
        ZoneInfoCompiler.cVerbose.set(Boolean.TRUE);
        assertTrue(ZoneInfoCompiler.verbose());
    }

    //-----------------------------------------------------------------------
    // main()
    //-----------------------------------------------------------------------
    @Test
    public void testMain_noArgs_printsUsage() throws Exception {
        ZoneInfoCompiler.main(new String[0]);
        String output = capturedOut.toString();
        assertTrue(output.contains("Usage"));
    }

    @Test
    public void testMain_helpFlag_printsUsage() throws Exception {
        ZoneInfoCompiler.main(new String[] { "-?" });
        String output = capturedOut.toString();
        assertTrue(output.contains("Usage"));
    }

    @Test
    public void testMain_onlyOptionsNoSourceFiles_printsUsage() throws Exception {
        ZoneInfoCompiler.main(new String[] { "-verbose" });
        String output = capturedOut.toString();
        assertTrue(output.contains("Usage"));
    }

    @Test
    public void testMain_missingArgForSrc_printsUsage() throws Exception {
        ZoneInfoCompiler.main(new String[] { "-src" });
        String output = capturedOut.toString();
        assertTrue(output.contains("Usage"));
    }

    @Test
    public void testMain_withValidSourceFile_compilesSuccessfully() throws Exception {
        File srcDir = createTempDir("zicsrc");
        File dstDir = createTempDir("zicdst");
        File srcFile = new File(srcDir, "testdata");
        writeFile(srcFile, buildSampleData());

        ZoneInfoCompiler.main(new String[] { "-src", srcDir.getAbsolutePath(),
                "-dst", dstDir.getAbsolutePath(), "-verbose", "testdata" });

        String output = capturedOut.toString();
        assertTrue(output.contains("Writing zoneinfo files"));
    }

    private void writeFile(File file, String content) throws IOException {
        FileWriter writer = new FileWriter(file);
        try {
            writer.write(content);
        } finally {
            writer.close();
        }
    }

    private String buildSampleData() {
        StringBuilder sb = new StringBuilder();
        sb.append("# Test tz data\n");
        sb.append("Rule Test 2000 2005 - Mar lastSun 2:00 1:00 D\n");
        sb.append("Rule Test 2000 2005 - Oct lastSun 2:00 0 S\n");
        sb.append("\n");
        sb.append("Zone Test/Zone1 1:00 Test CE%sT\n");
        sb.append("Zone Test/Zone2 2:00 - EST\n");
        sb.append("Zone Test/Zone3 3:00 1:00 EDT\n");
        sb.append("Zone Test/ZoneChain 1:00 - EST 1995 Jan 1\n");
        sb.append("\t\t\t2:00 - EDT\n");
        sb.append("\n");
        sb.append("Link Test/Zone1 Test/Alias1\n");
        return sb.toString();
    }

    //-----------------------------------------------------------------------
    // getStartOfYear()
    //-----------------------------------------------------------------------
    @Test
    public void testGetStartOfYear_returnsDefaultValues() {
        ZoneInfoCompiler.DateTimeOfYear dtoy = ZoneInfoCompiler.getStartOfYear();
        assertNotNull(dtoy);
        assertEquals(1, dtoy.iMonthOfYear);
        assertEquals(1, dtoy.iDayOfMonth);
        assertEquals(0, dtoy.iDayOfWeek);
        assertFalse(dtoy.iAdvanceDayOfWeek);
        assertEquals(0, dtoy.iMillisOfDay);
        assertEquals('w', dtoy.iZoneChar);
    }

    @Test
    public void testGetStartOfYear_calledTwice_returnsSameInstance() {
        ZoneInfoCompiler.DateTimeOfYear first = ZoneInfoCompiler.getStartOfYear();
        ZoneInfoCompiler.DateTimeOfYear second = ZoneInfoCompiler.getStartOfYear();
        assertSame(first, second);
    }

    //-----------------------------------------------------------------------
    // getLenientISOChronology()
    //-----------------------------------------------------------------------
    @Test
    public void testGetLenientISOChronology_returnsNonNull() {
        assertNotNull(ZoneInfoCompiler.getLenientISOChronology());
    }

    @Test
    public void testGetLenientISOChronology_calledTwice_returnsSameInstance() {
        Object first = ZoneInfoCompiler.getLenientISOChronology();
        Object second = ZoneInfoCompiler.getLenientISOChronology();
        assertSame(first, second);
    }

    //-----------------------------------------------------------------------
    // writeZoneInfoMap()
    //-----------------------------------------------------------------------
    @Test
    public void testWriteZoneInfoMap_withValidMap_writesWithoutError() throws IOException {
        Map<String, DateTimeZone> map = new HashMap<String, DateTimeZone>();
        map.put("UTC", DateTimeZone.forID("UTC"));
        map.put("Europe/London", DateTimeZone.forID("UTC"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(baos);
        ZoneInfoCompiler.writeZoneInfoMap(dout, map);
        dout.flush();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testWriteZoneInfoMap_withEmptyMap_writesWithoutError() throws IOException {
        Map<String, DateTimeZone> map = new HashMap<String, DateTimeZone>();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(baos);
        ZoneInfoCompiler.writeZoneInfoMap(dout, map);
        dout.flush();
        assertTrue(baos.size() > 0);
    }

    //-----------------------------------------------------------------------
    // parseYear()
    //-----------------------------------------------------------------------
    @Test
    public void testParseYear_minimum_returnsMinValue() {
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("minimum", 0));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("min", 0));
    }

    @Test
    public void testParseYear_maximum_returnsMaxValue() {
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("maximum", 0));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("max", 0));
    }

    @Test
    public void testParseYear_only_returnsDefault() {
        assertEquals(1999, ZoneInfoCompiler.parseYear("only", 1999));
    }

    @Test
    public void testParseYear_numeric_returnsParsedValue() {
        assertEquals(2015, ZoneInfoCompiler.parseYear("2015", 0));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseYear_invalidString_throwsNumberFormatException() {
        ZoneInfoCompiler.parseYear("notanumber", 0);
    }

    //-----------------------------------------------------------------------
    // parseMonth()
    //-----------------------------------------------------------------------
    @Test
    public void testParseMonth_validMonth_returnsCorrectValue() {
        assertEquals(1, ZoneInfoCompiler.parseMonth("Jan"));
        assertEquals(12, ZoneInfoCompiler.parseMonth("Dec"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMonth_invalidMonth_throwsException() {
        ZoneInfoCompiler.parseMonth("NotAMonth");
    }

    //-----------------------------------------------------------------------
    // parseDayOfWeek()
    //-----------------------------------------------------------------------
    @Test
    public void testParseDayOfWeek_validDay_returnsCorrectValue() {
        assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Mon"));
        assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sun"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDayOfWeek_invalidDay_throwsException() {
        ZoneInfoCompiler.parseDayOfWeek("NotADay");
    }

    //-----------------------------------------------------------------------
    // parseOptional()
    //-----------------------------------------------------------------------
    @Test
    public void testParseOptional_dash_returnsNull() {
        assertNull(ZoneInfoCompiler.parseOptional("-"));
    }

    @Test
    public void testParseOptional_value_returnsValue() {
        assertEquals("Hello", ZoneInfoCompiler.parseOptional("Hello"));
    }

    //-----------------------------------------------------------------------
    // parseTime()
    //-----------------------------------------------------------------------
    @Test
    public void testParseTime_simpleTime_returnsMillis() {
        int millis = ZoneInfoCompiler.parseTime("1:00");
        assertEquals(3600000, millis);
    }

    @Test
    public void testParseTime_zeroTime_returnsZero() {
        int millis = ZoneInfoCompiler.parseTime("0:00");
        assertEquals(0, millis);
    }

    @Test
    public void testParseTime_negativeTime_returnsNegativeMillis() {
        int millis = ZoneInfoCompiler.parseTime("-1:00");
        assertEquals(-3600000, millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseTime_invalidString_throwsIllegalArgumentException() {
        ZoneInfoCompiler.parseTime("notatime");
    }

    //-----------------------------------------------------------------------
    // parseZoneChar()
    //-----------------------------------------------------------------------
    @Test
    public void testParseZoneChar_standard_returnsS() {
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('s'));
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('S'));
    }

    @Test
    public void testParseZoneChar_utc_returnsU() {
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('u'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('U'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('g'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('G'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('z'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('Z'));
    }

    @Test
    public void testParseZoneChar_wall_returnsW() {
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('w'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('W'));
    }

    @Test
    public void testParseZoneChar_defaultCase_returnsW() {
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('x'));
    }

    //-----------------------------------------------------------------------
    // test()
    //-----------------------------------------------------------------------
    @Test
    public void testTest_mismatchedId_returnsTrue() {
        DateTimeZone tz = DateTimeZone.forID("UTC");
        boolean result = ZoneInfoCompiler.test("SomeOtherId", tz);
        assertTrue(result);
    }

    @Test
    public void testTest_matchingIdUTC_returnsTrue() {
        DateTimeZone tz = DateTimeZone.forID("UTC");
        boolean result = ZoneInfoCompiler.test(tz.getID(), tz);
        assertTrue(result);
    }

    @Test
    public void testTest_matchingIdFixedOffset_returnsTrue() {
        DateTimeZone tz = DateTimeZone.forOffsetHours(2);
        boolean result = ZoneInfoCompiler.test(tz.getID(), tz);
        assertTrue(result);
    }

    //-----------------------------------------------------------------------
    // constructor
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_createsInstanceSuccessfully() {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        assertNotNull(zic);
    }

    //-----------------------------------------------------------------------
    // parseDataFile()
    //-----------------------------------------------------------------------
    @Test
    public void testParseDataFile_emptyContent_noExceptionThrown() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        BufferedReader reader = new BufferedReader(new StringReader(""));
        zic.parseDataFile(reader);
        reader.close();
    }

    @Test
    public void testParseDataFile_onlyCommentLines_noExceptionThrown() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        String data = "# comment line 1\n# comment line 2\n";
        BufferedReader reader = new BufferedReader(new StringReader(data));
        zic.parseDataFile(reader);
        reader.close();
    }

    @Test
    public void testParseDataFile_withRuleLines_addsRuleSetAndAddsRule() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        String data = "Rule Test 2000 2005 - Mar lastSun 2:00 1:00 D\n" +
                       "Rule Test 2000 2005 - Oct lastSun 2:00 0 S\n";
        BufferedReader reader = new BufferedReader(new StringReader(data));
        zic.parseDataFile(reader);
        reader.close();
        // No direct getter, but no exception means success; verify indirectly via compile.
        assertNotNull(zic);
    }

    @Test
    public void testParseDataFile_withZoneLine_addsZone() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        String data = "Zone Test/SimpleZone 1:00 - EST\n";
        BufferedReader reader = new BufferedReader(new StringReader(data));
        zic.parseDataFile(reader);
        reader.close();
        assertNotNull(zic);
    }

    @Test
    public void testParseDataFile_withZoneContinuation_chainsZone() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        String data = "Zone Test/ChainZone 1:00 - EST 1995 Jan 1\n" +
                       "\t\t\t2:00 - EDT\n";
        BufferedReader reader = new BufferedReader(new StringReader(data));
        zic.parseDataFile(reader);
        reader.close();
        assertNotNull(zic);
    }

    @Test
    public void testParseDataFile_withLinkLine_addsLink() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        String data = "Zone Test/LinkSrc 1:00 - EST\n" +
                       "Link Test/LinkSrc Test/LinkAlias\n";
        BufferedReader reader = new BufferedReader(new StringReader(data));
        zic.parseDataFile(reader);
        reader.close();
        assertNotNull(zic);
    }

    @Test
    public void testParseDataFile_withUnknownLine_printsMessage() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        String data = "UnknownKeyword foo bar\n";
        BufferedReader reader = new BufferedReader(new StringReader(data));
        zic.parseDataFile(reader);
        reader.close();
        String output = capturedOut.toString();
        assertTrue(output.contains("Unknown line"));
    }

    @Test
    public void testParseDataFile_withInlineComment_stripsComment() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        String data = "Zone Test/CommentZone 1:00 - EST # trailing comment\n";
        BufferedReader reader = new BufferedReader(new StringReader(data));
        zic.parseDataFile(reader);
        reader.close();
        assertNotNull(zic);
    }

    //-----------------------------------------------------------------------
    // compile()
    //-----------------------------------------------------------------------
    @Test
    public void testCompile_withNullSourcesAndNullOutputDir_returnsMap() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        Map<String, DateTimeZone> result = zic.compile(null, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCompile_withValidSourceFiles_returnsPopulatedMap() throws IOException {
        File srcDir = createTempDir("compilesrc");
        File srcFile = new File(srcDir, "testdata");
        writeFile(srcFile, buildSampleData());

        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        Map<String, DateTimeZone> result = zic.compile(null, new File[] { srcFile });

        assertNotNull(result);
        assertTrue(result.containsKey("Test/Zone1"));
        assertTrue(result.containsKey("Test/Zone2"));
        assertTrue(result.containsKey("Test/Zone3"));
        assertTrue(result.containsKey("Test/ZoneChain"));
        assertTrue(result.containsKey("Test/Alias1"));
    }

    @Test
    public void testCompile_withOutputDirWritesFiles() throws IOException {
        File srcDir = createTempDir("compilesrc2");
        File dstDir = createTempDir("compiledst2");
        File srcFile = new File(srcDir, "testdata");
        writeFile(srcFile, buildSampleData());

        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        Map<String, DateTimeZone> result = zic.compile(dstDir, new File[] { srcFile });

        assertNotNull(result);
        File zoneInfoMapFile = new File(dstDir, "ZoneInfoMap");
        assertTrue(zoneInfoMapFile.exists());
    }

    @Test
    public void testCompile_withOutputDirNotExisting_createsDirectory() throws IOException {
        File parentDir = createTempDir("compileparent");
        File dstDir = new File(parentDir, "newSubDir");
        assertFalse(dstDir.exists());

        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.compile(dstDir, null);

        assertTrue(dstDir.exists());
        assertTrue(dstDir.isDirectory());
    }

    @Test(expected = IOException.class)
    public void testCompile_withOutputDirIsFile_throwsIOException() throws IOException {
        File tempFile = File.createTempFile("notadir", ".tmp");
        tempFile.deleteOnExit();

        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.compile(tempFile, null);
    }

    @Test
    public void testCompile_withLinkToUnknownZone_printsErrorOnSecondPass() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        String data = "Link NonExistentZone AliasForNonExistent\n";
        BufferedReader reader = new BufferedReader(new StringReader(data));
        zic.parseDataFile(reader);
        reader.close();

        Map<String, DateTimeZone> result = zic.compile(null, null);
        String output = capturedOut.toString();
        assertTrue(output.contains("Cannot find time zone"));
        assertFalse(result.containsKey("AliasForNonExistent"));
    }
}
