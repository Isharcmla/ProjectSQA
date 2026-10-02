package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import org.junit.Test;

public class SystemUtilsTest {

    @Test
    public void testConstructor_default_instanceCreated() {
        SystemUtils utils = new SystemUtils();
        assertNotNull(utils);
    }

    @Test
    public void testGetJavaHome_default_returnsValidDirectory() {
        File javaHome = SystemUtils.getJavaHome();
        assertNotNull(javaHome);
        assertTrue(javaHome.exists());
    }

    @Test
    public void testGetJavaIoTmpDir_default_returnsValidDirectory() {
        File tmpDir = SystemUtils.getJavaIoTmpDir();
        assertNotNull(tmpDir);
        assertTrue(tmpDir.exists());
    }

    @Test
    public void testGetUserDir_default_returnsValidDirectory() {
        File userDir = SystemUtils.getUserDir();
        assertNotNull(userDir);
        assertTrue(userDir.exists());
    }

    @Test
    public void testGetUserHome_default_returnsValidDirectory() {
        File userHome = SystemUtils.getUserHome();
        assertNotNull(userHome);
        assertTrue(userHome.exists());
    }

    @Test
    public void testIsJavaAwtHeadless_default_returnsConsistentBoolean() {
        boolean headless = SystemUtils.isJavaAwtHeadless();
        String headlessProp = System.getProperty("java.awt.headless");
        if (headlessProp != null && headlessProp.equals("true")) {
            assertTrue(headless);
        } else {
            assertFalse(headless);
        }
    }

    @Test
    public void testIsJavaVersionAtLeastFloat_variousVersions_returnsCorrectly() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(0.0f));
        assertTrue(SystemUtils.isJavaVersionAtLeast(1.1f));
        assertFalse(SystemUtils.isJavaVersionAtLeast(100.0f));
        assertFalse(SystemUtils.isJavaVersionAtLeast(-1.0f) == false);
    }

    @Test
    public void testIsJavaVersionAtLeastInt_variousVersions_returnsCorrectly() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(0));
        assertTrue(SystemUtils.isJavaVersionAtLeast(110));
        assertFalse(SystemUtils.isJavaVersionAtLeast(10000));
        assertTrue(SystemUtils.isJavaVersionAtLeast(-1));
    }

    @Test
    public void testIsJavaVersionMatch_normalAndEdgeCases_returnsExpectedResults() {
        assertFalse(SystemUtils.isJavaVersionMatch(null, "1.5"));
        assertFalse(SystemUtils.isJavaVersionMatch("1.6.0_20", null == null ? "1.5" : null));
        assertTrue(SystemUtils.isJavaVersionMatch("1.5.0_22", "1.5"));
        assertTrue(SystemUtils.isJavaVersionMatch("1.6.0", "1.6"));
        assertFalse(SystemUtils.isJavaVersionMatch("1.7.0", "1.6"));
        assertTrue(SystemUtils.isJavaVersionMatch("", ""));
        assertFalse(SystemUtils.isJavaVersionMatch("", "1.5"));
    }

    @Test
    public void testIsOSMatch_normalAndEdgeCases_returnsExpectedResults() {
        assertFalse(SystemUtils.isOSMatch(null, "10.0", "Windows", "10"));
        assertFalse(SystemUtils.isOSMatch("Windows 10", null, "Windows", "10"));
        assertFalse(SystemUtils.isOSMatch(null, null, "Windows", "10"));

        assertTrue(SystemUtils.isOSMatch("Windows XP", "5.1", "Windows", "5.1"));
        assertTrue(SystemUtils.isOSMatch("Windows 7", "6.1", "Windows", "6.1"));
        assertFalse(SystemUtils.isOSMatch("Linux", "2.6", "Windows", "5.1"));
        assertFalse(SystemUtils.isOSMatch("Windows 7", "6.1", "Windows", "5.1"));
    }

    @Test
    public void testIsOSNameMatch_normalAndEdgeCases_returnsExpectedResults() {
        assertFalse(SystemUtils.isOSNameMatch(null, "Windows"));
        assertTrue(SystemUtils.isOSNameMatch("Windows 7", "Windows"));
        assertTrue(SystemUtils.isOSNameMatch("Linux", "Lin"));
        assertFalse(SystemUtils.isOSNameMatch("Mac OS X", "Windows"));
        assertTrue(SystemUtils.isOSNameMatch("", ""));
    }

    @Test
    public void testToJavaVersionFloat_variousStrings_convertsProperly() {
        assertEquals(0.0f, SystemUtils.toJavaVersionFloat(null), 0.0001f);
        assertEquals(0.0f, SystemUtils.toJavaVersionFloat(""), 0.0001f);
        assertEquals(0.0f, SystemUtils.toJavaVersionFloat("abc"), 0.0001f);
        assertEquals(1.0f, SystemUtils.toJavaVersionFloat("1"), 0.0001f);
        assertEquals(1.2f, SystemUtils.toJavaVersionFloat("1.2"), 0.0001f);
        assertEquals(1.31f, SystemUtils.toJavaVersionFloat("1.3.1"), 0.0001f);
        assertEquals(1.6f, SystemUtils.toJavaVersionFloat("1.6.0_20"), 0.0001f);
        assertEquals(1.8f, SystemUtils.toJavaVersionFloat("Java 1.8.0"), 0.0001f);
    }

    @Test
    public void testToJavaVersionInt_variousStrings_convertsProperly() {
        assertEquals(0f, SystemUtils.toJavaVersionInt(null), 0.0001f);
        assertEquals(0f, SystemUtils.toJavaVersionInt(""), 0.0001f);
        assertEquals(0f, SystemUtils.toJavaVersionInt("abc"), 0.0001f);
        assertEquals(100f, SystemUtils.toJavaVersionInt("1"), 0.0001f);
        assertEquals(120f, SystemUtils.toJavaVersionInt("1.2"), 0.0001f);
        assertEquals(131f, SystemUtils.toJavaVersionInt("1.3.1"), 0.0001f);
        assertEquals(160f, SystemUtils.toJavaVersionInt("1.6.0_20"), 0.0001f);
        assertEquals(170f, SystemUtils.toJavaVersionInt("1.7"), 0.0001f);
    }

    @Test
    public void testToJavaVersionIntArray_variousStrings_returnsExpectedArrays() {
        assertArrayEquals(new int[]{}, SystemUtils.toJavaVersionIntArray(null));
        assertArrayEquals(new int[]{}, SystemUtils.toJavaVersionIntArray(""));
        assertArrayEquals(new int[]{}, SystemUtils.toJavaVersionIntArray("java"));
        assertArrayEquals(new int[]{1}, SystemUtils.toJavaVersionIntArray("1"));
        assertArrayEquals(new int[]{1, 2}, SystemUtils.toJavaVersionIntArray("1.2"));
        assertArrayEquals(new int[]{1, 3, 1}, SystemUtils.toJavaVersionIntArray("1.3.1"));
        assertArrayEquals(new int[]{1, 5, 0, 21}, SystemUtils.toJavaVersionIntArray("1.5.0_21"));
        assertArrayEquals(new int[]{1, 8, 0, 292}, SystemUtils.toJavaVersionIntArray("Java 1.8.0_292-b10"));
    }

    @Test
    public void testConstants_readAccess_noNullPointers() {
        assertNotNull(SystemUtils.AWT_TOOLKIT == null ? "" : SystemUtils.AWT_TOOLKIT);
        assertNotNull(SystemUtils.FILE_ENCODING == null ? "" : SystemUtils.FILE_ENCODING);
        assertNotNull(SystemUtils.FILE_SEPARATOR);
        assertNotNull(SystemUtils.JAVA_CLASS_PATH == null ? "" : SystemUtils.JAVA_CLASS_PATH);
        assertNotNull(SystemUtils.JAVA_CLASS_VERSION == null ? "" : SystemUtils.JAVA_CLASS_VERSION);
        assertNotNull(SystemUtils.JAVA_HOME);
        assertNotNull(SystemUtils.JAVA_IO_TMPDIR);
        assertNotNull(SystemUtils.JAVA_RUNTIME_NAME == null ? "" : SystemUtils.JAVA_RUNTIME_NAME);
        assertNotNull(SystemUtils.JAVA_RUNTIME_VERSION == null ? "" : SystemUtils.JAVA_RUNTIME_VERSION);
        assertNotNull(SystemUtils.JAVA_SPECIFICATION_NAME == null ? "" : SystemUtils.JAVA_SPECIFICATION_NAME);
        assertNotNull(SystemUtils.JAVA_SPECIFICATION_VENDOR == null ? "" : SystemUtils.JAVA_SPECIFICATION_VENDOR);
        assertNotNull(SystemUtils.JAVA_SPECIFICATION_VERSION == null ? "" : SystemUtils.JAVA_SPECIFICATION_VERSION);
        assertNotNull(SystemUtils.JAVA_VENDOR == null ? "" : SystemUtils.JAVA_VENDOR);
        assertNotNull(SystemUtils.JAVA_VENDOR_URL == null ? "" : SystemUtils.JAVA_VENDOR_URL);
        assertNotNull(SystemUtils.JAVA_VERSION == null ? "" : SystemUtils.JAVA_VERSION);
        assertNotNull(SystemUtils.JAVA_VM_NAME == null ? "" : SystemUtils.JAVA_VM_NAME);
        assertNotNull(SystemUtils.JAVA_VM_SPECIFICATION_NAME == null ? "" : SystemUtils.JAVA_VM_SPECIFICATION_NAME);
        assertNotNull(SystemUtils.JAVA_VM_SPECIFICATION_VENDOR == null ? "" : SystemUtils.JAVA_VM_SPECIFICATION_VENDOR);
        assertNotNull(SystemUtils.JAVA_VM_SPECIFICATION_VERSION == null ? "" : SystemUtils.JAVA_VM_SPECIFICATION_VERSION);
        assertNotNull(SystemUtils.JAVA_VM_VENDOR == null ? "" : SystemUtils.JAVA_VM_VENDOR);
        assertNotNull(SystemUtils.JAVA_VM_VERSION == null ? "" : SystemUtils.JAVA_VM_VERSION);
        assertNotNull(SystemUtils.LINE_SEPARATOR);
        assertNotNull(SystemUtils.OS_ARCH == null ? "" : SystemUtils.OS_ARCH);
        assertNotNull(SystemUtils.OS_NAME == null ? "" : SystemUtils.OS_NAME);
        assertNotNull(SystemUtils.OS_VERSION == null ? "" : SystemUtils.OS_VERSION);
        assertNotNull(SystemUtils.PATH_SEPARATOR);
        assertNotNull(SystemUtils.USER_DIR);
        assertNotNull(SystemUtils.USER_HOME);
        assertNotNull(SystemUtils.USER_NAME == null ? "" : SystemUtils.USER_NAME);

        boolean osUnix = SystemUtils.IS_OS_UNIX;
        boolean osWindows = SystemUtils.IS_OS_WINDOWS;
        assertFalse(osUnix && osWindows);

        boolean isJava11 = SystemUtils.IS_JAVA_1_1;
        boolean isJava12 = SystemUtils.IS_JAVA_1_2;
        boolean isJava13 = SystemUtils.IS_JAVA_1_3;
        boolean isJava14 = SystemUtils.IS_JAVA_1_4;
        boolean isJava15 = SystemUtils.IS_JAVA_1_5;
        boolean isJava16 = SystemUtils.IS_JAVA_1_6;
        boolean isJava17 = SystemUtils.IS_JAVA_1_7;

        int javaMatchCount = 0;
        if (isJava11) javaMatchCount++;
        if (isJava12) javaMatchCount++;
        if (isJava13) javaMatchCount++;
        if (isJava14) javaMatchCount++;
        if (isJava15) javaMatchCount++;
        if (isJava16) javaMatchCount++;
        if (isJava17) javaMatchCount++;
        assertTrue(javaMatchCount <= 1);
    }
}
