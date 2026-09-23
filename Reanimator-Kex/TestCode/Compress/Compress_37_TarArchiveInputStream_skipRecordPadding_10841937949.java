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
import java.util.HashMap;

public class TarArchiveInputStream_skipRecordPadding_10841937949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2335;
     Object term16983;

    public TarArchiveInputStream_skipRecordPadding_10841937949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17031 = Class.forName((String) "java.io.File$PathStatus");
        Field term17030 = ((Class) term17031).getDeclaredField((String) "INVALID");
        ((Field) term17030).setAccessible(true);
        Object enum44 = ((Field) term17030).get((Object) null);
        HashMap term2412 = new HashMap();
        term2335 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2336 = (byte[]) newByteArray(2);
        Object term2344 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2383 = newInstance(Class.forName("java.io.File"));
        byte[] term2422 = (byte[]) newByteArray(1);
        setByteElement(term2336, 0, (byte) 10);
        setByteElement(term2336, 1, (byte) 77);
        setField(term2335, term2335.getClass(), "SMALL_BUF", term2336);
        setIntField(term2335, term2335.getClass(), "recordSize", 292681826);
        setIntField(term2335, term2335.getClass(), "blockSize", 458147407);
        setBooleanField(term2335, term2335.getClass(), "hasHitEOF", false);
        setLongField(term2335, term2335.getClass(), "entrySize", -8658027316505137504L);
        setLongField(term2335, term2335.getClass(), "entryOffset", 414749984815662075L);
        setField(term2335, term2335.getClass(), "is", null);
        setField(term2344, term2344.getClass(), "name", "");
        setBooleanField(term2344, term2344.getClass(), "preserveLeadingSlashes", true);
        setIntField(term2344, term2344.getClass(), "mode", -184153539);
        setLongField(term2344, term2344.getClass(), "userId", 463622836963501975L);
        setLongField(term2344, term2344.getClass(), "groupId", 305759998609888272L);
        setLongField(term2344, term2344.getClass(), "size", -8654565919063661957L);
        setLongField(term2344, term2344.getClass(), "modTime", -5248475803419977214L);
        setBooleanField(term2344, term2344.getClass(), "checkSumOK", false);
        setByteField(term2344, term2344.getClass(), "linkFlag", (byte) 14);
        setField(term2344, term2344.getClass(), "linkName", "");
        setField(term2344, term2344.getClass(), "magic", "ustar ");
        setField(term2344, term2344.getClass(), "version", "00");
        setField(term2344, term2344.getClass(), "userName", "root");
        setField(term2344, term2344.getClass(), "groupName", "");
        setIntField(term2344, term2344.getClass(), "devMajor", 493620644);
        setIntField(term2344, term2344.getClass(), "devMinor", 1328271830);
        setBooleanField(term2344, term2344.getClass(), "isExtended", false);
        setLongField(term2344, term2344.getClass(), "realSize", -6723783499250797216L);
        setBooleanField(term2344, term2344.getClass(), "paxGNUSparse", true);
        setBooleanField(term2344, term2344.getClass(), "starSparse", false);
        setField(term2383, term2383.getClass(), "path", "Ghbwtircqb");
        setField(term2383, term2383.getClass(), "status", enum44);
        setIntField(term2383, term2383.getClass(), "prefixLength", 1596070772);
        setField(term2383, term2383.getClass(), "filePath", null);
        setField(term2344, term2344.getClass(), "file", term2383);
        setField(term2335, term2335.getClass(), "currEntry", term2344);
        setField(term2335, term2335.getClass(), "zipEncoding", null);
        setField(term2335, term2335.getClass(), "encoding", "xrwlQZdwCp");
        setField(term2335, term2335.getClass(), "globalPaxHeaders", term2412);
        setByteElement(term2422, 0, (byte) -101);
        setField(term2335, term2335.getClass(), "SINGLE", term2422);
        setLongField(term2335, term2335.getClass(), "bytesRead", 41775768178052008L);
        Class<? extends Object> term17209 = Class.forName((String) "java.io.File$PathStatus");
        Field term17208 = ((Class) term17209).getDeclaredField((String) "CHECKED");
        ((Field) term17208).setAccessible(true);
        Object enum45 = ((Field) term17208).get((Object) null);
        HashMap term17005 = new HashMap();
        term16983 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term16984 = (byte[]) newByteArray(2);
        Object term16985 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term16998 = newInstance(Class.forName("java.io.File"));
        byte[] term17006 = (byte[]) newByteArray(1);
        setByteElement(term16984, 0, (byte) 10);
        setByteElement(term16984, 1, (byte) 77);
        setField(term16983, term16983.getClass(), "SMALL_BUF", term16984);
        setIntField(term16983, term16983.getClass(), "recordSize", 292681826);
        setIntField(term16983, term16983.getClass(), "blockSize", 458147407);
        setBooleanField(term16983, term16983.getClass(), "hasHitEOF", false);
        setLongField(term16983, term16983.getClass(), "entrySize", -8658027316505137504L);
        setLongField(term16983, term16983.getClass(), "entryOffset", 414749984815662075L);
        setField(term16983, term16983.getClass(), "is", null);
        setField(term16985, term16985.getClass(), "name", "");
        setBooleanField(term16985, term16985.getClass(), "preserveLeadingSlashes", true);
        setIntField(term16985, term16985.getClass(), "mode", -184153539);
        setLongField(term16985, term16985.getClass(), "userId", 463622836963501975L);
        setLongField(term16985, term16985.getClass(), "groupId", 305759998609888272L);
        setLongField(term16985, term16985.getClass(), "size", -8654565919063661957L);
        setLongField(term16985, term16985.getClass(), "modTime", -5248475803419977214L);
        setBooleanField(term16985, term16985.getClass(), "checkSumOK", false);
        setByteField(term16985, term16985.getClass(), "linkFlag", (byte) 14);
        setField(term16985, term16985.getClass(), "linkName", "");
        setField(term16985, term16985.getClass(), "magic", "ustar ");
        setField(term16985, term16985.getClass(), "version", "00");
        setField(term16985, term16985.getClass(), "userName", "root");
        setField(term16985, term16985.getClass(), "groupName", "");
        setIntField(term16985, term16985.getClass(), "devMajor", 493620644);
        setIntField(term16985, term16985.getClass(), "devMinor", 1328271830);
        setBooleanField(term16985, term16985.getClass(), "isExtended", false);
        setLongField(term16985, term16985.getClass(), "realSize", -6723783499250797216L);
        setBooleanField(term16985, term16985.getClass(), "paxGNUSparse", true);
        setBooleanField(term16985, term16985.getClass(), "starSparse", false);
        setField(term16998, term16998.getClass(), "path", "Ghbwtircqb");
        setField(term16998, term16998.getClass(), "status", enum45);
        setIntField(term16998, term16998.getClass(), "prefixLength", 1596070772);
        setField(term16998, term16998.getClass(), "filePath", null);
        setField(term16985, term16985.getClass(), "file", term16998);
        setField(term16983, term16983.getClass(), "currEntry", term16985);
        setField(term16983, term16983.getClass(), "zipEncoding", null);
        setField(term16983, term16983.getClass(), "encoding", "xrwlQZdwCp");
        setField(term16983, term16983.getClass(), "globalPaxHeaders", term17005);
        setByteElement(term17006, 0, (byte) -101);
        setField(term16983, term16983.getClass(), "SINGLE", term17006);
        setLongField(term16983, term16983.getClass(), "bytesRead", 41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipRecordPadding", argTypes, term2335, args);
        assertTrue(recursiveEquals(term2335, term16983));
    }

};


