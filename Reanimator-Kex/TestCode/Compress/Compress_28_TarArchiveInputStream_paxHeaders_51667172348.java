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

public class TarArchiveInputStream_paxHeaders_51667172348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2773;
     Object term15817;

    public TarArchiveInputStream_paxHeaders_51667172348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15869 = Class.forName((String) "java.io.File$PathStatus");
        Field term15868 = ((Class) term15869).getDeclaredField((String) "INVALID");
        ((Field) term15868).setAccessible(true);
        Object enum41 = ((Field) term15868).get((Object) null);
        term2773 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2774 = (byte[]) newByteArray(9);
        Object term2789 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2825 = newInstance(Class.forName("java.io.File"));
        byte[] term2842 = (byte[]) newByteArray(4);
        setByteElement(term2774, 0, (byte) 33);
        setByteElement(term2774, 1, (byte) -74);
        setByteElement(term2774, 2, (byte) -84);
        setByteElement(term2774, 3, (byte) -53);
        setByteElement(term2774, 4, (byte) -93);
        setByteElement(term2774, 5, (byte) 82);
        setByteElement(term2774, 6, (byte) -89);
        setByteElement(term2774, 7, (byte) 24);
        setByteElement(term2774, 8, (byte) 123);
        setField(term2773, term2773.getClass(), "SMALL_BUF", term2774);
        setIntField(term2773, term2773.getClass(), "recordSize", 941650513);
        setIntField(term2773, term2773.getClass(), "blockSize", 444029505);
        setBooleanField(term2773, term2773.getClass(), "hasHitEOF", true);
        setLongField(term2773, term2773.getClass(), "entrySize", 463622836963501975L);
        setLongField(term2773, term2773.getClass(), "entryOffset", 305759998609888272L);
        setField(term2773, term2773.getClass(), "is", null);
        setField(term2789, term2789.getClass(), "name", "");
        setIntField(term2789, term2789.getClass(), "mode", -1034506028);
        setIntField(term2789, term2789.getClass(), "userId", -1263114719);
        setIntField(term2789, term2789.getClass(), "groupId", -894662986);
        setLongField(term2789, term2789.getClass(), "size", -8654565919063661957L);
        setLongField(term2789, term2789.getClass(), "modTime", -5248475803419977214L);
        setBooleanField(term2789, term2789.getClass(), "checkSumOK", false);
        setByteField(term2789, term2789.getClass(), "linkFlag", (byte) -101);
        setField(term2789, term2789.getClass(), "linkName", "");
        setField(term2789, term2789.getClass(), "magic", "ustar ");
        setField(term2789, term2789.getClass(), "version", "00");
        setField(term2789, term2789.getClass(), "userName", "root");
        setField(term2789, term2789.getClass(), "groupName", "");
        setIntField(term2789, term2789.getClass(), "devMajor", 304775596);
        setIntField(term2789, term2789.getClass(), "devMinor", -1347665717);
        setBooleanField(term2789, term2789.getClass(), "isExtended", true);
        setLongField(term2789, term2789.getClass(), "realSize", -6723783499250797216L);
        setField(term2825, term2825.getClass(), "path", "oVcInYnLWB");
        setField(term2825, term2825.getClass(), "status", enum41);
        setIntField(term2825, term2825.getClass(), "prefixLength", -1888585309);
        setField(term2825, term2825.getClass(), "filePath", null);
        setField(term2789, term2789.getClass(), "file", term2825);
        setField(term2773, term2773.getClass(), "currEntry", term2789);
        setField(term2773, term2773.getClass(), "encoding", null);
        setByteElement(term2842, 0, (byte) -102);
        setByteElement(term2842, 1, (byte) -95);
        setByteElement(term2842, 2, (byte) -2);
        setByteElement(term2842, 3, (byte) 28);
        setField(term2773, term2773.getClass(), "SINGLE", term2842);
        setLongField(term2773, term2773.getClass(), "bytesRead", 41775768178052008L);
        Class<? extends Object> term16047 = Class.forName((String) "java.io.File$PathStatus");
        Field term16046 = ((Class) term16047).getDeclaredField((String) "CHECKED");
        ((Field) term16046).setAccessible(true);
        Object enum42 = ((Field) term16046).get((Object) null);
        term15817 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term15818 = (byte[]) newByteArray(9);
        Object term15819 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term15832 = newInstance(Class.forName("java.io.File"));
        byte[] term15837 = (byte[]) newByteArray(4);
        setByteElement(term15818, 0, (byte) 33);
        setByteElement(term15818, 1, (byte) -74);
        setByteElement(term15818, 2, (byte) -84);
        setByteElement(term15818, 3, (byte) -53);
        setByteElement(term15818, 4, (byte) -93);
        setByteElement(term15818, 5, (byte) 82);
        setByteElement(term15818, 6, (byte) -89);
        setByteElement(term15818, 7, (byte) 24);
        setByteElement(term15818, 8, (byte) 123);
        setField(term15817, term15817.getClass(), "SMALL_BUF", term15818);
        setIntField(term15817, term15817.getClass(), "recordSize", 941650513);
        setIntField(term15817, term15817.getClass(), "blockSize", 444029505);
        setBooleanField(term15817, term15817.getClass(), "hasHitEOF", true);
        setLongField(term15817, term15817.getClass(), "entrySize", 463622836963501975L);
        setLongField(term15817, term15817.getClass(), "entryOffset", 305759998609888272L);
        setField(term15817, term15817.getClass(), "is", null);
        setField(term15819, term15819.getClass(), "name", "");
        setIntField(term15819, term15819.getClass(), "mode", -1034506028);
        setIntField(term15819, term15819.getClass(), "userId", -1263114719);
        setIntField(term15819, term15819.getClass(), "groupId", -894662986);
        setLongField(term15819, term15819.getClass(), "size", -8654565919063661957L);
        setLongField(term15819, term15819.getClass(), "modTime", -5248475803419977214L);
        setBooleanField(term15819, term15819.getClass(), "checkSumOK", false);
        setByteField(term15819, term15819.getClass(), "linkFlag", (byte) -101);
        setField(term15819, term15819.getClass(), "linkName", "");
        setField(term15819, term15819.getClass(), "magic", "ustar ");
        setField(term15819, term15819.getClass(), "version", "00");
        setField(term15819, term15819.getClass(), "userName", "root");
        setField(term15819, term15819.getClass(), "groupName", "");
        setIntField(term15819, term15819.getClass(), "devMajor", 304775596);
        setIntField(term15819, term15819.getClass(), "devMinor", -1347665717);
        setBooleanField(term15819, term15819.getClass(), "isExtended", true);
        setLongField(term15819, term15819.getClass(), "realSize", -6723783499250797216L);
        setField(term15832, term15832.getClass(), "path", "oVcInYnLWB");
        setField(term15832, term15832.getClass(), "status", enum42);
        setIntField(term15832, term15832.getClass(), "prefixLength", -1888585309);
        setField(term15832, term15832.getClass(), "filePath", null);
        setField(term15819, term15819.getClass(), "file", term15832);
        setField(term15817, term15817.getClass(), "currEntry", term15819);
        setField(term15817, term15817.getClass(), "encoding", null);
        setByteElement(term15837, 0, (byte) -102);
        setByteElement(term15837, 1, (byte) -95);
        setByteElement(term15837, 2, (byte) -2);
        setByteElement(term15837, 3, (byte) 28);
        setField(term15817, term15817.getClass(), "SINGLE", term15837);
        setLongField(term15817, term15817.getClass(), "bytesRead", 41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term2773, args);
        assertTrue(recursiveEquals(term2773, term15817));
    }

};


