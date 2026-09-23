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

public class TarArchiveInputStream_isEOFRecord_179817665150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2778;
     Object term2853;
     Object term16414;
     Object term16435;

    public TarArchiveInputStream_isEOFRecord_179817665150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16463 = Class.forName((String) "java.io.File$PathStatus");
        Field term16462 = ((Class) term16463).getDeclaredField((String) "INVALID");
        ((Field) term16462).setAccessible(true);
        Object enum45 = ((Field) term16462).get((Object) null);
        term2778 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2779 = (byte[]) newByteArray(4);
        Object term2789 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2825 = newInstance(Class.forName("java.io.File"));
        byte[] term2842 = (byte[]) newByteArray(9);
        setByteElement(term2779, 0, (byte) -84);
        setByteElement(term2779, 1, (byte) -53);
        setByteElement(term2779, 2, (byte) -93);
        setByteElement(term2779, 3, (byte) 82);
        setField(term2778, term2778.getClass(), "SMALL_BUF", term2779);
        setIntField(term2778, term2778.getClass(), "recordSize", 444029505);
        setIntField(term2778, term2778.getClass(), "blockSize", -1034506028);
        setBooleanField(term2778, term2778.getClass(), "hasHitEOF", true);
        setLongField(term2778, term2778.getClass(), "entrySize", 463622836963501975L);
        setLongField(term2778, term2778.getClass(), "entryOffset", 305759998609888272L);
        setField(term2778, term2778.getClass(), "is", null);
        setField(term2789, term2789.getClass(), "name", "");
        setIntField(term2789, term2789.getClass(), "mode", -1263114719);
        setIntField(term2789, term2789.getClass(), "userId", -894662986);
        setIntField(term2789, term2789.getClass(), "groupId", 304775596);
        setLongField(term2789, term2789.getClass(), "size", -8654565919063661957L);
        setLongField(term2789, term2789.getClass(), "modTime", -5248475803419977214L);
        setBooleanField(term2789, term2789.getClass(), "checkSumOK", false);
        setByteField(term2789, term2789.getClass(), "linkFlag", (byte) -89);
        setField(term2789, term2789.getClass(), "linkName", "");
        setField(term2789, term2789.getClass(), "magic", "ustar ");
        setField(term2789, term2789.getClass(), "version", "00");
        setField(term2789, term2789.getClass(), "userName", "root");
        setField(term2789, term2789.getClass(), "groupName", "");
        setIntField(term2789, term2789.getClass(), "devMajor", -1347665717);
        setIntField(term2789, term2789.getClass(), "devMinor", -1888585309);
        setBooleanField(term2789, term2789.getClass(), "isExtended", true);
        setLongField(term2789, term2789.getClass(), "realSize", -6723783499250797216L);
        setField(term2825, term2825.getClass(), "path", "oVcInYnLWB");
        setField(term2825, term2825.getClass(), "status", enum45);
        setIntField(term2825, term2825.getClass(), "prefixLength", 683666002);
        setField(term2825, term2825.getClass(), "filePath", null);
        setField(term2789, term2789.getClass(), "file", term2825);
        setField(term2778, term2778.getClass(), "currEntry", term2789);
        setField(term2778, term2778.getClass(), "zipEncoding", null);
        setByteElement(term2842, 0, (byte) 24);
        setByteElement(term2842, 1, (byte) 123);
        setByteElement(term2842, 2, (byte) -101);
        setByteElement(term2842, 3, (byte) -102);
        setByteElement(term2842, 4, (byte) -95);
        setByteElement(term2842, 5, (byte) -2);
        setByteElement(term2842, 6, (byte) 28);
        setByteElement(term2842, 7, (byte) 84);
        setByteElement(term2842, 8, (byte) 85);
        setField(term2778, term2778.getClass(), "SINGLE", term2842);
        setLongField(term2778, term2778.getClass(), "bytesRead", 41775768178052008L);
        term2853 = (byte[]) newByteArray(4);
        setByteElement(term2853, 0, (byte) -17);
        setByteElement(term2853, 1, (byte) -83);
        setByteElement(term2853, 2, (byte) 48);
        setByteElement(term2853, 3, (byte) -128);
        Class<? extends Object> term16645 = Class.forName((String) "java.io.File$PathStatus");
        Field term16644 = ((Class) term16645).getDeclaredField((String) "INVALID");
        ((Field) term16644).setAccessible(true);
        Object enum46 = ((Field) term16644).get((Object) null);
        term16414 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term16415 = (byte[]) newByteArray(4);
        Object term16416 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term16429 = newInstance(Class.forName("java.io.File"));
        byte[] term16434 = (byte[]) newByteArray(9);
        setByteElement(term16415, 0, (byte) -84);
        setByteElement(term16415, 1, (byte) -53);
        setByteElement(term16415, 2, (byte) -93);
        setByteElement(term16415, 3, (byte) 82);
        setField(term16414, term16414.getClass(), "SMALL_BUF", term16415);
        setIntField(term16414, term16414.getClass(), "recordSize", 444029505);
        setIntField(term16414, term16414.getClass(), "blockSize", -1034506028);
        setBooleanField(term16414, term16414.getClass(), "hasHitEOF", true);
        setLongField(term16414, term16414.getClass(), "entrySize", 463622836963501975L);
        setLongField(term16414, term16414.getClass(), "entryOffset", 305759998609888272L);
        setField(term16414, term16414.getClass(), "is", null);
        setField(term16416, term16416.getClass(), "name", "");
        setIntField(term16416, term16416.getClass(), "mode", -1263114719);
        setIntField(term16416, term16416.getClass(), "userId", -894662986);
        setIntField(term16416, term16416.getClass(), "groupId", 304775596);
        setLongField(term16416, term16416.getClass(), "size", -8654565919063661957L);
        setLongField(term16416, term16416.getClass(), "modTime", -5248475803419977214L);
        setBooleanField(term16416, term16416.getClass(), "checkSumOK", false);
        setByteField(term16416, term16416.getClass(), "linkFlag", (byte) -89);
        setField(term16416, term16416.getClass(), "linkName", "");
        setField(term16416, term16416.getClass(), "magic", "ustar ");
        setField(term16416, term16416.getClass(), "version", "00");
        setField(term16416, term16416.getClass(), "userName", "root");
        setField(term16416, term16416.getClass(), "groupName", "");
        setIntField(term16416, term16416.getClass(), "devMajor", -1347665717);
        setIntField(term16416, term16416.getClass(), "devMinor", -1888585309);
        setBooleanField(term16416, term16416.getClass(), "isExtended", true);
        setLongField(term16416, term16416.getClass(), "realSize", -6723783499250797216L);
        setField(term16429, term16429.getClass(), "path", "oVcInYnLWB");
        setField(term16429, term16429.getClass(), "status", enum46);
        setIntField(term16429, term16429.getClass(), "prefixLength", 683666002);
        setField(term16429, term16429.getClass(), "filePath", null);
        setField(term16416, term16416.getClass(), "file", term16429);
        setField(term16414, term16414.getClass(), "currEntry", term16416);
        setField(term16414, term16414.getClass(), "zipEncoding", null);
        setByteElement(term16434, 0, (byte) 24);
        setByteElement(term16434, 1, (byte) 123);
        setByteElement(term16434, 2, (byte) -101);
        setByteElement(term16434, 3, (byte) -102);
        setByteElement(term16434, 4, (byte) -95);
        setByteElement(term16434, 5, (byte) -2);
        setByteElement(term16434, 6, (byte) 28);
        setByteElement(term16434, 7, (byte) 84);
        setByteElement(term16434, 8, (byte) 85);
        setField(term16414, term16414.getClass(), "SINGLE", term16434);
        setLongField(term16414, term16414.getClass(), "bytesRead", 41775768178052008L);
        term16435 = (byte[]) newByteArray(4);
        setByteElement(term16435, 0, (byte) -17);
        setByteElement(term16435, 1, (byte) -83);
        setByteElement(term16435, 2, (byte) 48);
        setByteElement(term16435, 3, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2853;
        Object retValue = callMethod(klass, "isEOFRecord", argTypes, term2778, args);
        assertTrue(recursiveEquals(term2778, term16414));
        assertTrue(recursiveEquals(term2853, term16435));
        assertTrue(recursiveEquals(retValue, false));
    }

};


