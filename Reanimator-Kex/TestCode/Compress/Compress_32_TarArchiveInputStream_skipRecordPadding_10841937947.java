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

public class TarArchiveInputStream_skipRecordPadding_10841937947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231;
     Object term15223;

    public TarArchiveInputStream_skipRecordPadding_10841937947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15270 = Class.forName((String) "java.io.File$PathStatus");
        Field term15269 = ((Class) term15270).getDeclaredField((String) "INVALID");
        ((Field) term15269).setAccessible(true);
        Object enum40 = ((Field) term15269).get((Object) null);
        term2231 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2232 = (byte[]) newByteArray(2);
        Object term2240 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2276 = newInstance(Class.forName("java.io.File"));
        byte[] term2305 = (byte[]) newByteArray(1);
        setByteElement(term2232, 0, (byte) 10);
        setByteElement(term2232, 1, (byte) 77);
        setField(term2231, term2231.getClass(), "SMALL_BUF", term2232);
        setIntField(term2231, term2231.getClass(), "recordSize", 292681826);
        setIntField(term2231, term2231.getClass(), "blockSize", 458147407);
        setBooleanField(term2231, term2231.getClass(), "hasHitEOF", true);
        setLongField(term2231, term2231.getClass(), "entrySize", -8658027316505137504L);
        setLongField(term2231, term2231.getClass(), "entryOffset", 414749984815662075L);
        setField(term2231, term2231.getClass(), "is", null);
        setField(term2240, term2240.getClass(), "name", "");
        setIntField(term2240, term2240.getClass(), "mode", -184153539);
        setLongField(term2240, term2240.getClass(), "userId", 463622836963501975L);
        setLongField(term2240, term2240.getClass(), "groupId", 305759998609888272L);
        setLongField(term2240, term2240.getClass(), "size", -8654565919063661957L);
        setLongField(term2240, term2240.getClass(), "modTime", -5248475803419977214L);
        setBooleanField(term2240, term2240.getClass(), "checkSumOK", false);
        setByteField(term2240, term2240.getClass(), "linkFlag", (byte) 14);
        setField(term2240, term2240.getClass(), "linkName", "");
        setField(term2240, term2240.getClass(), "magic", "ustar ");
        setField(term2240, term2240.getClass(), "version", "00");
        setField(term2240, term2240.getClass(), "userName", "root");
        setField(term2240, term2240.getClass(), "groupName", "");
        setIntField(term2240, term2240.getClass(), "devMajor", 493620644);
        setIntField(term2240, term2240.getClass(), "devMinor", 1328271830);
        setBooleanField(term2240, term2240.getClass(), "isExtended", false);
        setLongField(term2240, term2240.getClass(), "realSize", -6723783499250797216L);
        setField(term2276, term2276.getClass(), "path", "pCTimMblYc");
        setField(term2276, term2276.getClass(), "status", enum40);
        setIntField(term2276, term2276.getClass(), "prefixLength", 1596070772);
        setField(term2276, term2276.getClass(), "filePath", null);
        setField(term2240, term2240.getClass(), "file", term2276);
        setField(term2231, term2231.getClass(), "currEntry", term2240);
        setField(term2231, term2231.getClass(), "zipEncoding", null);
        setField(term2231, term2231.getClass(), "encoding", "hNxWaHcfhY");
        setByteElement(term2305, 0, (byte) -101);
        setField(term2231, term2231.getClass(), "SINGLE", term2305);
        setLongField(term2231, term2231.getClass(), "bytesRead", 41775768178052008L);
        Class<? extends Object> term15448 = Class.forName((String) "java.io.File$PathStatus");
        Field term15447 = ((Class) term15448).getDeclaredField((String) "INVALID");
        ((Field) term15447).setAccessible(true);
        Object enum41 = ((Field) term15447).get((Object) null);
        term15223 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term15224 = (byte[]) newByteArray(2);
        Object term15225 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term15238 = newInstance(Class.forName("java.io.File"));
        byte[] term15245 = (byte[]) newByteArray(1);
        setByteElement(term15224, 0, (byte) 10);
        setByteElement(term15224, 1, (byte) 77);
        setField(term15223, term15223.getClass(), "SMALL_BUF", term15224);
        setIntField(term15223, term15223.getClass(), "recordSize", 292681826);
        setIntField(term15223, term15223.getClass(), "blockSize", 458147407);
        setBooleanField(term15223, term15223.getClass(), "hasHitEOF", true);
        setLongField(term15223, term15223.getClass(), "entrySize", -8658027316505137504L);
        setLongField(term15223, term15223.getClass(), "entryOffset", 414749984815662075L);
        setField(term15223, term15223.getClass(), "is", null);
        setField(term15225, term15225.getClass(), "name", "");
        setIntField(term15225, term15225.getClass(), "mode", -184153539);
        setLongField(term15225, term15225.getClass(), "userId", 463622836963501975L);
        setLongField(term15225, term15225.getClass(), "groupId", 305759998609888272L);
        setLongField(term15225, term15225.getClass(), "size", -8654565919063661957L);
        setLongField(term15225, term15225.getClass(), "modTime", -5248475803419977214L);
        setBooleanField(term15225, term15225.getClass(), "checkSumOK", false);
        setByteField(term15225, term15225.getClass(), "linkFlag", (byte) 14);
        setField(term15225, term15225.getClass(), "linkName", "");
        setField(term15225, term15225.getClass(), "magic", "ustar ");
        setField(term15225, term15225.getClass(), "version", "00");
        setField(term15225, term15225.getClass(), "userName", "root");
        setField(term15225, term15225.getClass(), "groupName", "");
        setIntField(term15225, term15225.getClass(), "devMajor", 493620644);
        setIntField(term15225, term15225.getClass(), "devMinor", 1328271830);
        setBooleanField(term15225, term15225.getClass(), "isExtended", false);
        setLongField(term15225, term15225.getClass(), "realSize", -6723783499250797216L);
        setField(term15238, term15238.getClass(), "path", "pCTimMblYc");
        setField(term15238, term15238.getClass(), "status", enum41);
        setIntField(term15238, term15238.getClass(), "prefixLength", 1596070772);
        setField(term15238, term15238.getClass(), "filePath", null);
        setField(term15225, term15225.getClass(), "file", term15238);
        setField(term15223, term15223.getClass(), "currEntry", term15225);
        setField(term15223, term15223.getClass(), "zipEncoding", null);
        setField(term15223, term15223.getClass(), "encoding", "hNxWaHcfhY");
        setByteElement(term15245, 0, (byte) -101);
        setField(term15223, term15223.getClass(), "SINGLE", term15245);
        setLongField(term15223, term15223.getClass(), "bytesRead", 41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipRecordPadding", argTypes, term2231, args);
        assertTrue(recursiveEquals(term2231, term15223));
    }

};


