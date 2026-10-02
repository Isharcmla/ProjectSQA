package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class SystemUtilsTest {

    // -------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------

    @Test
    public void testConstructor_createInstance_notNull() {
        SystemUtils systemUtils = new SystemUtils();
        assertNotNull(systemUtils);
    }

    // -------------------------------------------------------------
    // getJavaHome()
    // -------------------------------------------------------------

    @Test
    public void testGetJavaHome_normalCase_returnsNonNullFile() {
        File javaHome = SystemUtils.getJavaHome();
        assertNotNull(javaHome);
        assertEquals(System.getProperty("java.home"), javaHome.getPath());
    }

    // -------------------------------------------------------------
    // getJavaIoTmpDir()
    // -------------------------------------------------------------

    @Test
    public void testGetJavaIoTmpDir_normalCase_returnsNonNullFile() {
        File tmpDir = SystemUtils.getJavaIoTmpDir();
        assertNotNull(tmpDir);
        assertEquals(System.getProperty("java.io.tmpdir"), tmpDir.getPath());
    }

    // -------------------------------------------------------------
    // getUserDir()
    // -------------------------------------------------------------

    @Test
    public void testGetUserDir_normalCase_returnsNonNullFile() {
        File userDir = SystemUtils.getUserDir();
        assertNotNull(userDir);
        assertEquals(System.getProperty("user.dir"), userDir.getPath());
    }

    // -------------------------------------------------------------
    // getUserHome()
    // -------------------------------------------------------------

    @Test
    public void testGetUserHome_normalCase_returnsNonNullFile() {
        File userHome = SystemUtils.getUserHome();
        assertNotNull(userHome);
        assertEquals(System.getProperty("user.home"), userHome.getPath());
    }

    // -------------------------------------------------------------
    // isJavaAwtHeadless()
    // -------------------------------------------------------------

    @Test
    public void testIsJavaAwtHeadless_normalCase_matchesFieldLogic() {
        boolean expected;
        if (SystemUtils.JAVA_AWT_HEADLESS != null) {
            expected = SystemUtils.JAVA_AWT_HEADLESS.equals(Boolean.TRUE.toString());
        } else {
            expected = false;
        }
        assertEquals(expected, SystemUtils.isJavaAwtHeadless());
    }

    // -------------------------------------------------------------
    // isJavaVersionAtLeast(float)
    // -------------------------------------------------------------

    @Test
    public void testIsJavaVersionAtLeastFloat_lowValue_returnsTrue() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(0f));
    }

    @Test
    public void testIsJavaVersionAtLeastFloat_veryHighValue_returnsFalse() {
        assertFalse(SystemUtils.isJavaVersionAtLeast(999f));
    }

    @Test
    public void testIsJavaVersionAtLeastFloat_exactCurrentVersion_returnsTrue() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(SystemUtils.JAVA_VERSION_FLOAT));
    }

    // -------------------------------------------------------------
    // isJavaVersionAtLeast(int)
    // -------------------------------------------------------------

    @Test
    public void testIsJavaVersionAtLeastInt_lowValue_returnsTrue() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(0));
    }

    @Test
    public void testIsJavaVersionAtLeastInt_veryHighValue_returnsFalse() {
        assertFalse(SystemUtils.isJavaVersionAtLeast(999999));
    }

    @Test
    public void testIsJavaVersionAtLeastInt_exactCurrentVersion_returnsTrue() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(SystemUtils.JAVA_VERSION_INT));
    }

    // -------------------------------------------------------------
    // isJavaVersionMatch(String, String) - package-private static
    // -------------------------------------------------------------

    @Test
    public void testIsJavaVersionMatch_matchingPrefix_returnsTrue() {
        assertTrue(SystemUtils.isJavaVersionMatch("1.6.0_20", "1.6"));
    }

    @Test
    public void testIsJavaVersionMatch_nonMatchingPrefix_returnsFalse() {
        assertFalse(SystemUtils.isJavaVersionMatch("1.6.0_20", "1.7"));
    }

    @Test
    public void testIsJavaVersionMatch_nullVersion_returnsFalse() {
        assertFalse(SystemUtils.isJavaVersionMatch(null, "1.6"));
    }

    @Test
    public void testIsJavaVersionMatch_emptyStringVersion_returnsFalse() {
        assertFalse(SystemUtils.isJavaVersionMatch("", "1.6"));
    }

    @Test
    public void testIsJavaVersionMatch_emptyPrefix_returnsTrue() {
        assertTrue(SystemUtils.isJavaVersionMatch("1.6.0", ""));
    }

    // -------------------------------------------------------------
    // isOSMatch(String, String, String, String) - package-private static
    // -------------------------------------------------------------

    @Test
    public void testIsOSMatch_matchingNameAndVersion_returnsTrue() {
        assertTrue(SystemUtils.isOSMatch("Windows XP", "5.1.2600", "Windows", "5.1"));
    }

    @Test
    public void testIsOSMatch_nonMatchingName_returnsFalse() {
        assertFalse(SystemUtils.isOSMatch("Linux", "5.1", "Windows", "5.1"));
    }

    @Test
    public void testIsOSMatch_nonMatchingVersion_returnsFalse() {
        assertFalse(SystemUtils.isOSMatch("Windows XP", "6.0", "Windows", "5.1"));
    }

    @Test
    public void testIsOSMatch_nullOsName_returnsFalse() {
        assertFalse(SystemUtils.isOSMatch(null, "5.1", "Windows", "5.1"));
    }

    @Test
    public void testIsOSMatch_nullOsVersion_returnsFalse() {
        assertFalse(SystemUtils.isOSMatch("Windows", null, "Windows", "5.1"));
    }

    @Test
    public void testIsOSMatch_bothNull_returnsFalse() {
        assertFalse(SystemUtils.isOSMatch(null, null, "Windows", "5.1"));
    }

    // -------------------------------------------------------------
    // isOSNameMatch(String, String) - package-private static
    // -------------------------------------------------------------

    @Test
    public void testIsOSNameMatch_matchingPrefix_returnsTrue() {
        assertTrue(SystemUtils.isOSNameMatch("Windows 98", "Windows"));
    }

    @Test
    public void testIsOSNameMatch_nonMatchingPrefix_returnsFalse() {
        assertFalse(SystemUtils.isOSNameMatch("Linux", "Windows"));
    }

    @Test
    public void testIsOSNameMatch_nullOsName_returnsFalse() {
        assertFalse(SystemUtils.isOSNameMatch(null, "Windows"));
    }

    @Test
    public void testIsOSNameMatch_emptyOsName_returnsFalse() {
        assertFalse(SystemUtils.isOSNameMatch("", "Windows"));
    }

    // -------------------------------------------------------------
    // toJavaVersionFloat(String) - package-private static
    // -------------------------------------------------------------

    @Test
    public void testToJavaVersionFloat_typicalVersion_returnsCorrectFloat() {
        float result = SystemUtils.toJavaVersionFloat("1.6.0_20");
        assertEquals(1.6f, result, 0.0001f);
    }

    @Test
    public void testToJavaVersionFloat_singleDigitVersion_returnsSameValue() {
        float result = SystemUtils.toJavaVersionFloat("5");
        assertEquals(5f, result, 0.0001f);
    }

    @Test
    public void testToJavaVersionFloat_nullVersion_returnsZero() {
        float result = SystemUtils.toJavaVersionFloat(null);
        assertEquals(0f, result, 0.0001f);
    }

    @Test
    public void testToJavaVersionFloat_emptyVersion_returnsZero() {
        float result = SystemUtils.toJavaVersionFloat("");
        assertEquals(0f, result, 0.0001f);
    }

    // -------------------------------------------------------------
    // toJavaVersionInt(String) - package-private static (returns float)
    // -------------------------------------------------------------

    @Test
    public void testToJavaVersionInt_typicalVersion_returnsCorrectValue() {
        float result = SystemUtils.toJavaVersionInt("1.3.1");
        assertEquals(131f, result, 0.0001f);
    }

    @Test
    public void testToJavaVersionInt_nullVersion_returnsZero() {
        float result = SystemUtils.toJavaVersionInt(null);
        assertEquals(0f, result, 0.0001f);
    }

    @Test
    public void testToJavaVersionInt_singleComponentVersion_returnsScaledValue() {
        float result = SystemUtils.toJavaVersionInt("5");
        assertEquals(500f, result, 0.0001f);
    }

    // -------------------------------------------------------------
    // toJavaVersionIntArray(String) - package-private static
    // -------------------------------------------------------------

    @Test
    public void testToJavaVersionIntArray_typicalVersion_returnsCorrectArray() {
        int[] result = SystemUtils.toJavaVersionIntArray("1.5.0_21");
        assertArrayEquals(new int[] { 1, 5, 0, 21 }, result);
    }

    @Test
    public void testToJavaVersionIntArray_nullVersion_returnsEmptyArray() {
        int[] result = SystemUtils.toJavaVersionIntArray(null);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testToJavaVersionIntArray_singleDigitVersion_returnsSingleElementArray() {
        int[] result = SystemUtils.toJavaVersionIntArray("7");
        assertArrayEquals(new int[] { 7 }, result);
    }

    @Test
    public void testToJavaVersionIntArray_emptyVersion_returnsEmptyArray() {
        int[] result = SystemUtils.toJavaVersionIntArray("");
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    // -------------------------------------------------------------
    // Static constant fields sanity checks
    // -------------------------------------------------------------

    @Test
    public void testStaticFields_javaVersion_consistentWithSystemProperty() {
        assertEquals(System.getProperty("java.version"), SystemUtils.JAVA_VERSION);
    }

    @Test
    public void testStaticFields_osName_consistentWithSystemProperty() {
        assertEquals(System.getProperty("os.name"), SystemUtils.OS_NAME);
    }

    @Test
    public void testStaticFields_javaVersionTrimmed_notNullWhenJavaVersionNotNull() {
        if (SystemUtils.JAVA_VERSION != null) {
            assertNotNull(SystemUtils.JAVA_VERSION_TRIMMED);
        }
    }

    @Test
    public void testStaticFields_javaVersionFloat_nonNegative() {
        assertTrue(SystemUtils.JAVA_VERSION_FLOAT >= 0f);
    }

    @Test
    public void testStaticFields_javaVersionInt_nonNegative() {
        assertTrue(SystemUtils.JAVA_VERSION_INT >= 0);
    }

    @Test
    public void testStaticFields_isOsUnix_consistentWithSubFlags() {
        boolean expected = SystemUtils.IS_OS_AIX || SystemUtils.IS_OS_HP_UX || SystemUtils.IS_OS_IRIX
                || SystemUtils.IS_OS_LINUX || SystemUtils.IS_OS_MAC_OSX || SystemUtils.IS_OS_SOLARIS
                || SystemUtils.IS_OS_SUN_OS;
        assertEquals(expected, SystemUtils.IS_OS_UNIX);
    }

    @Test
    public void testStaticFields_isOsLinux_consistentWithOsName() {
        boolean expected = SystemUtils.isOSNameMatch(SystemUtils.OS_NAME, "Linux")
                || SystemUtils.isOSNameMatch(SystemUtils.OS_NAME, "LINUX");
        assertEquals(expected, SystemUtils.IS_OS_LINUX);
    }

    @Test
    public void testStaticFields_userCountry_fallbackLogic() {
        String expected = System.getProperty("user.country") == null ? System.getProperty("user.region")
                : System.getProperty("user.country");
        assertEquals(expected, SystemUtils.USER_COUNTRY);
    }
}
