package org.apache.commons.compress.archivers.tar;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getNextEntry_36885160336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2869;
     Object term149804;

    public TarArchiveInputStream_getNextEntry_36885160336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term149862 = Class.forName((String) "java.io.File$PathStatus");
        Field term149861 = ((Class) term149862).getDeclaredField((String) "CHECKED");
        ((Field) term149861).setAccessible(true);
        Object enum38 = ((Field) term149861).get((Object) null);
        term2869 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2873 = (byte[]) newByteArray(9);
        Object term2883 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term2884 = (byte[]) newByteArray(4);
        Object term2894 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2929 = newInstance(Class.forName("java.io.File"));
        byte[] term2946 = (byte[]) newByteArray(8);
        setBooleanField(term2869, term2869.getClass(), "hasHitEOF", true);
        setLongField(term2869, term2869.getClass(), "entrySize", 463622836963501975L);
        setLongField(term2869, term2869.getClass(), "entryOffset", 305759998609888272L);
        setByteElement(term2873, 0, (byte) 7);
        setByteElement(term2873, 1, (byte) -96);
        setByteElement(term2873, 2, (byte) -22);
        setByteElement(term2873, 3, (byte) -5);
        setByteElement(term2873, 4, (byte) -124);
        setByteElement(term2873, 5, (byte) -105);
        setByteElement(term2873, 6, (byte) 25);
        setByteElement(term2873, 7, (byte) 16);
        setByteElement(term2873, 8, (byte) 39);
        setField(term2869, term2869.getClass(), "readBuf", term2873);
        setField(term2883, term2883.getClass(), "inStream", null);
        setField(term2883, term2883.getClass(), "outStream", null);
        setByteElement(term2884, 0, (byte) 123);
        setByteElement(term2884, 1, (byte) 16);
        setByteElement(term2884, 2, (byte) 2);
        setByteElement(term2884, 3, (byte) -120);
        setField(term2883, term2883.getClass(), "blockBuffer", term2884);
        setIntField(term2883, term2883.getClass(), "currBlkIdx", 568954359);
        setIntField(term2883, term2883.getClass(), "currRecIdx", 53410913);
        setIntField(term2883, term2883.getClass(), "blockSize", -375014958);
        setIntField(term2883, term2883.getClass(), "recordSize", 1107176718);
        setIntField(term2883, term2883.getClass(), "recsPerBlock", 480137250);
        setField(term2869, term2869.getClass(), "buffer", term2883);
        setField(term2894, term2894.getClass(), "name", "");
        setIntField(term2894, term2894.getClass(), "mode", -341152642);
        setIntField(term2894, term2894.getClass(), "userId", -2015854073);
        setIntField(term2894, term2894.getClass(), "groupId", 538259104);
        setLongField(term2894, term2894.getClass(), "size", -8654565919063661957L);
        setLongField(term2894, term2894.getClass(), "modTime", -5248475803419977214L);
        setByteField(term2894, term2894.getClass(), "linkFlag", (byte) 96);
        setField(term2894, term2894.getClass(), "linkName", "");
        setField(term2894, term2894.getClass(), "magic", "ustar ");
        setField(term2894, term2894.getClass(), "version", "00");
        setField(term2894, term2894.getClass(), "userName", "root");
        setField(term2894, term2894.getClass(), "groupName", "");
        setIntField(term2894, term2894.getClass(), "devMajor", 96566506);
        setIntField(term2894, term2894.getClass(), "devMinor", -343325701);
        setBooleanField(term2894, term2894.getClass(), "isExtended", true);
        setLongField(term2894, term2894.getClass(), "realSize", -6723783499250797216L);
        setField(term2929, term2929.getClass(), "path", "aJlieCFVtF");
        setField(term2929, term2929.getClass(), "status", enum38);
        setIntField(term2929, term2929.getClass(), "prefixLength", 107945604);
        setField(term2929, term2929.getClass(), "filePath", null);
        setField(term2894, term2894.getClass(), "file", term2929);
        setField(term2869, term2869.getClass(), "currEntry", term2894);
        setByteElement(term2946, 0, (byte) -41);
        setByteElement(term2946, 1, (byte) -88);
        setByteElement(term2946, 2, (byte) 39);
        setByteElement(term2946, 3, (byte) -1);
        setByteElement(term2946, 4, (byte) 117);
        setByteElement(term2946, 5, (byte) 43);
        setByteElement(term2946, 6, (byte) -27);
        setByteElement(term2946, 7, (byte) 34);
        setField(term2869, term2869.getClass(), "SINGLE", term2946);
        setLongField(term2869, term2869.getClass(), "bytesRead", 41775768178052008L);
        Class<? extends Object> term150048 = Class.forName((String) "java.io.File$PathStatus");
        Field term150047 = ((Class) term150048).getDeclaredField((String) "INVALID");
        ((Field) term150047).setAccessible(true);
        Object enum39 = ((Field) term150047).get((Object) null);
        term149804 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term149805 = (byte[]) newByteArray(9);
        Object term149806 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term149807 = (byte[]) newByteArray(4);
        Object term149808 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term149821 = newInstance(Class.forName("java.io.File"));
        byte[] term149826 = (byte[]) newByteArray(8);
        setBooleanField(term149804, term149804.getClass(), "hasHitEOF", true);
        setLongField(term149804, term149804.getClass(), "entrySize", 463622836963501975L);
        setLongField(term149804, term149804.getClass(), "entryOffset", 305759998609888272L);
        setByteElement(term149805, 0, (byte) 7);
        setByteElement(term149805, 1, (byte) -96);
        setByteElement(term149805, 2, (byte) -22);
        setByteElement(term149805, 3, (byte) -5);
        setByteElement(term149805, 4, (byte) -124);
        setByteElement(term149805, 5, (byte) -105);
        setByteElement(term149805, 6, (byte) 25);
        setByteElement(term149805, 7, (byte) 16);
        setByteElement(term149805, 8, (byte) 39);
        setField(term149804, term149804.getClass(), "readBuf", term149805);
        setField(term149806, term149806.getClass(), "inStream", null);
        setField(term149806, term149806.getClass(), "outStream", null);
        setByteElement(term149807, 0, (byte) 123);
        setByteElement(term149807, 1, (byte) 16);
        setByteElement(term149807, 2, (byte) 2);
        setByteElement(term149807, 3, (byte) -120);
        setField(term149806, term149806.getClass(), "blockBuffer", term149807);
        setIntField(term149806, term149806.getClass(), "currBlkIdx", 568954359);
        setIntField(term149806, term149806.getClass(), "currRecIdx", 53410913);
        setIntField(term149806, term149806.getClass(), "blockSize", -375014958);
        setIntField(term149806, term149806.getClass(), "recordSize", 1107176718);
        setIntField(term149806, term149806.getClass(), "recsPerBlock", 480137250);
        setField(term149804, term149804.getClass(), "buffer", term149806);
        setField(term149808, term149808.getClass(), "name", "");
        setIntField(term149808, term149808.getClass(), "mode", -341152642);
        setIntField(term149808, term149808.getClass(), "userId", -2015854073);
        setIntField(term149808, term149808.getClass(), "groupId", 538259104);
        setLongField(term149808, term149808.getClass(), "size", -8654565919063661957L);
        setLongField(term149808, term149808.getClass(), "modTime", -5248475803419977214L);
        setByteField(term149808, term149808.getClass(), "linkFlag", (byte) 96);
        setField(term149808, term149808.getClass(), "linkName", "");
        setField(term149808, term149808.getClass(), "magic", "ustar ");
        setField(term149808, term149808.getClass(), "version", "00");
        setField(term149808, term149808.getClass(), "userName", "root");
        setField(term149808, term149808.getClass(), "groupName", "");
        setIntField(term149808, term149808.getClass(), "devMajor", 96566506);
        setIntField(term149808, term149808.getClass(), "devMinor", -343325701);
        setBooleanField(term149808, term149808.getClass(), "isExtended", true);
        setLongField(term149808, term149808.getClass(), "realSize", -6723783499250797216L);
        setField(term149821, term149821.getClass(), "path", "aJlieCFVtF");
        setField(term149821, term149821.getClass(), "status", enum39);
        setIntField(term149821, term149821.getClass(), "prefixLength", 107945604);
        setField(term149821, term149821.getClass(), "filePath", null);
        setField(term149808, term149808.getClass(), "file", term149821);
        setField(term149804, term149804.getClass(), "currEntry", term149808);
        setByteElement(term149826, 0, (byte) -41);
        setByteElement(term149826, 1, (byte) -88);
        setByteElement(term149826, 2, (byte) 39);
        setByteElement(term149826, 3, (byte) -1);
        setByteElement(term149826, 4, (byte) 117);
        setByteElement(term149826, 5, (byte) 43);
        setByteElement(term149826, 6, (byte) -27);
        setByteElement(term149826, 7, (byte) 34);
        setField(term149804, term149804.getClass(), "SINGLE", term149826);
        setLongField(term149804, term149804.getClass(), "bytesRead", 41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term2869, args);
        assertTrue(recursiveEquals(term2869, term149804));
        assertTrue(recursiveEquals(retValue, null));
    }

};


