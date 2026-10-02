package org.joda.time.tz;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ZoneInfoCompilerTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testVerbose_defaultAndSet() {
        boolean v = ZoneInfoCompiler.verbose();
        assertFalse(v);
        ZoneInfoCompiler.cVerbose.set(Boolean.TRUE);
        assertTrue(ZoneInfoCompiler.verbose());
        ZoneInfoCompiler.cVerbose.set(Boolean.FALSE);
    }

    @Test
    public void testGetStartOfYear_singletonBehavior() {
        ZoneInfoCompiler.DateTimeOfYear doy1 = ZoneInfoCompiler.getStartOfYear();
        assertNotNull(doy1);
        ZoneInfoCompiler.DateTimeOfYear doy2 = ZoneInfoCompiler.getStartOfYear();
        assertSame(doy1, doy2);
        assertEquals(1, doy1.iMonthOfYear);
        assertEquals(1, doy1.iDayOfMonth);
        assertEquals(0, doy1.iDayOfWeek);
        assertFalse(doy1.iAdvanceDayOfWeek);
        assertEquals(0, doy1.iMillisOfDay);
        assertEquals('w', doy1.iZoneChar);
    }

    @Test
    public void testGetLenientISOChronology_singletonBehavior() {
        Chronology c1 = ZoneInfoCompiler.getLenientISOChronology();
        assertNotNull(c1);
        Chronology c2 = ZoneInfoCompiler.getLenientISOChronology();
        assertSame(c1, c2);
    }

    @Test
    public void testParseYear_validInputs() {
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("min", 2000));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("minimum", 2000));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("MINIMUM", 2000));

        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("max", 2000));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("maximum", 2000));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("MAX", 2000));

        assertEquals(1999, ZoneInfoCompiler.parseYear("only", 1999));
        assertEquals(1999, ZoneInfoCompiler.parseYear("ONLY", 1999));

        assertEquals(2023, ZoneInfoCompiler.parseYear("2023", 0));
        assertEquals(-500, ZoneInfoCompiler.parseYear("-500", 0));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseYear_invalidInput_throwsException() {
        ZoneInfoCompiler.parseYear("invalid_year", 0);
    }

    @Test
    public void testParseMonth_validInputs() {
        assertEquals(1, ZoneInfoCompiler.parseMonth("Jan"));
        assertEquals(1, ZoneInfoCompiler.parseMonth("January"));
        assertEquals(2, ZoneInfoCompiler.parseMonth("Feb"));
        assertEquals(12, ZoneInfoCompiler.parseMonth("Dec"));
        assertEquals(12, ZoneInfoCompiler.parseMonth("December"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMonth_invalidInput_throwsException() {
        ZoneInfoCompiler.parseMonth("InvalidMonth");
    }

    @Test
    public void testParseDayOfWeek_validInputs() {
        assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Mon"));
        assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Monday"));
        assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sun"));
        assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sunday"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDayOfWeek_invalidInput_throwsException() {
        ZoneInfoCompiler.parseDayOfWeek("Funday");
    }

    @Test
    public void testParseOptional_hyphenAndValues() {
        assertNull(ZoneInfoCompiler.parseOptional("-"));
        assertEquals("ABC", ZoneInfoCompiler.parseOptional("ABC"));
        assertEquals("", ZoneInfoCompiler.parseOptional(""));
    }

    @Test
    public void testParseTime_positiveAndNegative() {
        assertEquals(0, ZoneInfoCompiler.parseTime("0"));
        assertEquals(0, ZoneInfoCompiler.parseTime("00:00"));
        assertEquals(0, ZoneInfoCompiler.parseTime("00:00:00"));
        assertEquals(3600000, ZoneInfoCompiler.parseTime("1:00"));
        assertEquals(3600000, ZoneInfoCompiler.parseTime("01:00"));
        assertEquals(3661000, ZoneInfoCompiler.parseTime("01:01:01"));
        assertEquals(3661500, ZoneInfoCompiler.parseTime("01:01:01.500"));
        assertEquals(-3600000, ZoneInfoCompiler.parseTime("-1:00"));
        assertEquals(-3661000, ZoneInfoCompiler.parseTime("-01:01:01"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseTime_invalidFormat_throwsException() {
        ZoneInfoCompiler.parseTime("invalid:time:format");
    }

    @Test
    public void testParseZoneChar_allVariants() {
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('s'));
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('S'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('u'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('U'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('g'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('G'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('z'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('Z'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('w'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('W'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('x'));
    }

    @Test
    public void testWriteZoneInfoMap_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(baos);

        Map<String, DateTimeZone> map = new HashMap<String, DateTimeZone>();
        map.put("UTC", DateTimeZone.UTC);
        map.put("Universal", DateTimeZone.UTC);

        ZoneInfoCompiler.writeZoneInfoMap(dout, map);
        dout.flush();

        byte[] bytes = baos.toByteArray();
        assertTrue(bytes.length > 0);
    }

    @Test
    public void testTest_methodBehavior() {
        DateTimeZone utc = DateTimeZone.UTC;
        assertTrue(ZoneInfoCompiler.test("MismatchId", utc));
        assertTrue(ZoneInfoCompiler.test("UTC", utc));
    }

    @Test
    public void testDateTimeOfYear_tokenParsingVariants() {
        StringTokenizer stDefault = new StringTokenizer("");
        ZoneInfoCompiler.DateTimeOfYear doyDef = new ZoneInfoCompiler.DateTimeOfYear(stDefault);
        assertEquals(1, doyDef.iMonthOfYear);
        assertEquals(1, doyDef.iDayOfMonth);
        assertNotNull(doyDef.toString());

        StringTokenizer stLast = new StringTokenizer("Mar lastSun 2:00s");
        ZoneInfoCompiler.DateTimeOfYear doyLast = new ZoneInfoCompiler.DateTimeOfYear(stLast);
        assertEquals(3, doyLast.iMonthOfYear);
        assertEquals(-1, doyLast.iDayOfMonth);
        assertEquals(7, doyLast.iDayOfWeek);
        assertFalse(doyLast.iAdvanceDayOfWeek);
        assertEquals('s', doyLast.iZoneChar);
        assertEquals(7200000, doyLast.iMillisOfDay);

        StringTokenizer stGte = new StringTokenizer("Apr Sun>=1 2:00u");
        ZoneInfoCompiler.DateTimeOfYear doyGte = new ZoneInfoCompiler.DateTimeOfYear(stGte);
        assertEquals(4, doyGte.iMonthOfYear);
        assertEquals(1, doyGte.iDayOfMonth);
        assertEquals(7, doyGte.iDayOfWeek);
        assertTrue(doyGte.iAdvanceDayOfWeek);
        assertEquals('u', doyGte.iZoneChar);

        StringTokenizer stLte = new StringTokenizer("Oct Sun<=15 3:00w");
        ZoneInfoCompiler.DateTimeOfYear doyLte = new ZoneInfoCompiler.DateTimeOfYear(stLte);
        assertEquals(10, doyLte.iMonthOfYear);
        assertEquals(15, doyLte.iDayOfMonth);
        assertEquals(7, doyLte.iDayOfWeek);
        assertFalse(doyLte.iAdvanceDayOfWeek);
        assertEquals('w', doyLte.iZoneChar);

        StringTokenizer stExactDay = new StringTokenizer("May 10 0:00");
        ZoneInfoCompiler.DateTimeOfYear doyExact = new ZoneInfoCompiler.DateTimeOfYear(stExactDay);
        assertEquals(5, doyExact.iMonthOfYear);
        assertEquals(10, doyExact.iDayOfMonth);
        assertEquals(0, doyExact.iDayOfWeek);

        StringTokenizer st2400Last = new StringTokenizer("Feb lastSun 24:00");
        ZoneInfoCompiler.DateTimeOfYear doy2400Last = new ZoneInfoCompiler.DateTimeOfYear(st2400Last);
        assertEquals(3, doy2400Last.iMonthOfYear);
        assertEquals(1, doy2400Last.iDayOfMonth);
        assertFalse(doy2400Last.iAdvanceDayOfWeek);

        StringTokenizer st2400Exact = new StringTokenizer("Jan 31 24:00");
        ZoneInfoCompiler.DateTimeOfYear doy2400Exact = new ZoneInfoCompiler.DateTimeOfYear(st2400Exact);
        assertEquals(2, doy2400Exact.iMonthOfYear);
        assertEquals(1, doy2400Exact.iDayOfMonth);
        assertTrue(doy2400Exact.iAdvanceDayOfWeek);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDateTimeOfYear_invalidDayFormat_throwsException() {
        StringTokenizer stInvalid = new StringTokenizer("Jan InvalidDay 2:00");
        new ZoneInfoCompiler.DateTimeOfYear(stInvalid);
    }

    @Test
    public void testParseDataFile_and_Compile_completeWorkflow() throws Exception {
        String data =
                "# Olson test rules\n" +
                "Rule  EU  2000  max  -  Mar  lastSun  1:00u  1:00  S\n" +
                "Rule  EU  2000  max  -  Oct  lastSun  1:00u  0     -\n" +
                "Rule  US  2000  2005 -  Apr  Sun>=1   2:00   1:00  D\n" +
                "Rule  US  2000  2005 -  Oct  lastSun  2:00   0     S\n" +
                "Rule  FormatSlash 2000 max - Jan 1 0 0 -\n" +
                "Rule  FormatSlash 2000 max - Jul 1 0 1:00 -\n" +
                "\n" +
                "Zone  Test/Zone/Slash  1:00  FormatSlash  STD/DST\n" +
                "Zone  Test/Zone/Percent  1:00  US  E%sT\n" +
                "Zone  Test/Zone/Fixed  2:00  -  TEST  2000\n" +
                "                       3:00  1:00  TEST\n" +
                "Zone  Test/Zone/Continuation  1:00  EU  CE%sT  2001  Mar  lastSun  1:00u\n" +
                "                              1:00  EU  CE%sT\n" +
                "Link  Test/Zone/Fixed  Test/Zone/Link1\n" +
                "Link  NonExistentZone  Test/Zone/BrokenLink\n" +
                "UnknownToken xyz\n";

        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        BufferedReader reader = new BufferedReader(new StringReader(data));
        compiler.parseDataFile(reader);

        File outDir = temporaryFolder.newFolder("tz_output");
        Map<String, DateTimeZone> compiled = compiler.compile(outDir, null);

        assertNotNull(compiled);
        assertTrue(compiled.containsKey("Test/Zone/Slash"));
        assertTrue(compiled.containsKey("Test/Zone/Percent"));
        assertTrue(compiled.containsKey("Test/Zone/Fixed"));
        assertTrue(compiled.containsKey("Test/Zone/Continuation"));
        assertTrue(compiled.containsKey("Test/Zone/Link1"));
        assertFalse(compiled.containsKey("Test/Zone/BrokenLink"));

        File zoneInfoMapFile = new File(outDir, "ZoneInfoMap");
        assertTrue(zoneInfoMapFile.exists());
    }

    @Test
    public void testCompile_fromSourceFiles() throws Exception {
        File srcDir = temporaryFolder.newFolder("tz_src");
        File srcFile = new File(srcDir, "test.tz");
        FileWriter writer = new FileWriter(srcFile);
        writer.write("Zone Test/Single 0:00 - UTC\n");
        writer.close();

        File outDir = temporaryFolder.newFolder("tz_out2");
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        Map<String, DateTimeZone> result = compiler.compile(outDir, new File[]{srcFile});

        assertNotNull(result);
        assertTrue(result.containsKey("Test/Single"));
    }

    @Test
    public void testCompile_outputDirCreationAndValidation() throws Exception {
        File parent = temporaryFolder.newFolder("tz_parent");
        File nonExistentDir = new File(parent, "sub/dir/path");
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();

        Map<String, DateTimeZone> result = compiler.compile(nonExistentDir, null);
        assertNotNull(result);
        assertTrue(nonExistentDir.exists());
        assertTrue(nonExistentDir.isDirectory());

        File regularFile = temporaryFolder.newFile("regular_file.txt");
        try {
            compiler.compile(regularFile, null);
            fail("Expected IOException when destination is not a directory");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Destination is not a directory"));
        }
    }

    @Test
    public void testCompile_unknownRulesReference_throwsException() throws IOException {
        String data = "Zone Test/InvalidRule 1:00 NonExistentRule FORMAT\n";
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new StringReader(data)));
        try {
            compiler.compile(null, null);
            fail("Expected IllegalArgumentException for missing rule");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Rules not found"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDataFile_ruleToYearBeforeFromYear_throwsException() throws IOException {
        String data = "Rule BadRule 2010 2005 - Jan 1 0 0 -\n";
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new StringReader(data)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDataFile_ruleNameMismatch_throwsException() throws IOException {
        String data =
                "Rule R1 2000 max - Jan 1 0 0 -\n" +
                "Rule R2 2000 max - Feb 1 0 0 -\n";
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        BufferedReader reader = new BufferedReader(new StringReader(data));

        compiler.parseDataFile(reader);
    }

    @Test
    public void testMain_argumentsCoverage() throws Exception {
        ZoneInfoCompiler.main(new String[0]);
        ZoneInfoCompiler.main(new String[]{"-?"});

        ZoneInfoCompiler.main(new String[]{"-src"});
        ZoneInfoCompiler.main(new String[]{"-dst"});

        ZoneInfoCompiler.main(new String[]{"-verbose"});
        ZoneInfoCompiler.main(new String[]{"-unknownOption"});

        File srcDir = temporaryFolder.newFolder("main_src");
        File tzFile = new File(srcDir, "sample.tz");
        FileOutputStream fos = new FileOutputStream(tzFile);
        fos.write("Zone Main/Test 0:00 - GMT\n".getBytes());
        fos.close();

        File dstDir = temporaryFolder.newFolder("main_dst");

        ZoneInfoCompiler.main(new String[]{
                "-src", srcDir.getAbsolutePath(),
                "-dst", dstDir.getAbsolutePath(),
                "-verbose",
                "sample.tz"
        });

        File generatedFile = new File(dstDir, "Main/Test");
        assertTrue(generatedFile.exists());
    }

    @Test
    public void testMain_directFilesWithoutSrcDir() throws Exception {
        File tzFile = temporaryFolder.newFile("direct.tz");
        FileOutputStream fos = new FileOutputStream(tzFile);
        fos.write("Zone Direct/Test 0:00 - GMT\n".getBytes());
        fos.close();

        File dstDir = temporaryFolder.newFolder("main_direct_dst");

        ZoneInfoCompiler.main(new String[]{
                "-dst", dstDir.getAbsolutePath(),
                tzFile.getAbsolutePath()
        });

        File generatedFile = new File(dstDir, "Direct/Test");
        assertTrue(generatedFile.exists());
    }
}
