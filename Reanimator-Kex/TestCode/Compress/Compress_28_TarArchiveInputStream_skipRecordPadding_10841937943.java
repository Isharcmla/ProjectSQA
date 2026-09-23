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

public class TarArchiveInputStream_skipRecordPadding_10841937943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577;
     Object term13601;

    public TarArchiveInputStream_skipRecordPadding_10841937943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13645 = Class.forName((String) "java.io.File$PathStatus");
        Field term13644 = ((Class) term13645).getDeclaredField((String) "INVALID");
        ((Field) term13644).setAccessible(true);
        Object enum33 = ((Field) term13644).get((Object) null);
        term1577 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1578 = (byte[]) newByteArray(1);
        Object term1585 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1621 = newInstance(Class.forName("java.io.File"));
        byte[] term1638 = (byte[]) newByteArray(0);
        setByteElement(term1578, 0, (byte) 102);
        setField(term1577, term1577.getClass(), "SMALL_BUF", term1578);
        setIntField(term1577, term1577.getClass(), "recordSize", -1048298087);
        setIntField(term1577, term1577.getClass(), "blockSize", 292681826);
        setBooleanField(term1577, term1577.getClass(), "hasHitEOF", false);
        setLongField(term1577, term1577.getClass(), "entrySize", 1439298019805881866L);
        setLongField(term1577, term1577.getClass(), "entryOffset", -8708192233349544946L);
        setField(term1577, term1577.getClass(), "is", null);
        setField(term1585, term1585.getClass(), "name", "");
        setIntField(term1585, term1585.getClass(), "mode", 458147407);
        setIntField(term1585, term1585.getClass(), "userId", -184153539);
        setIntField(term1585, term1585.getClass(), "groupId", 493620644);
        setLongField(term1585, term1585.getClass(), "size", 5907001541142728739L);
        setLongField(term1585, term1585.getClass(), "modTime", 4178434741742309755L);
        setBooleanField(term1585, term1585.getClass(), "checkSumOK", false);
        setByteField(term1585, term1585.getClass(), "linkFlag", (byte) -118);
        setField(term1585, term1585.getClass(), "linkName", "");
        setField(term1585, term1585.getClass(), "magic", "ustar ");
        setField(term1585, term1585.getClass(), "version", "00");
        setField(term1585, term1585.getClass(), "userName", "root");
        setField(term1585, term1585.getClass(), "groupName", "");
        setIntField(term1585, term1585.getClass(), "devMajor", 1328271830);
        setIntField(term1585, term1585.getClass(), "devMinor", 1596070772);
        setBooleanField(term1585, term1585.getClass(), "isExtended", true);
        setLongField(term1585, term1585.getClass(), "realSize", -2068172595987555756L);
        setField(term1621, term1621.getClass(), "path", "RMFIsYGgne");
        setField(term1621, term1621.getClass(), "status", enum33);
        setIntField(term1621, term1621.getClass(), "prefixLength", 97029295);
        setField(term1621, term1621.getClass(), "filePath", null);
        setField(term1585, term1585.getClass(), "file", term1621);
        setField(term1577, term1577.getClass(), "currEntry", term1585);
        setField(term1577, term1577.getClass(), "encoding", null);
        setField(term1577, term1577.getClass(), "SINGLE", term1638);
        setLongField(term1577, term1577.getClass(), "bytesRead", -6292278961887936280L);
        Class<? extends Object> term13811 = Class.forName((String) "java.io.File$PathStatus");
        Field term13810 = ((Class) term13811).getDeclaredField((String) "CHECKED");
        ((Field) term13810).setAccessible(true);
        Object enum34 = ((Field) term13810).get((Object) null);
        term13601 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term13602 = (byte[]) newByteArray(1);
        Object term13603 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13616 = newInstance(Class.forName("java.io.File"));
        byte[] term13621 = (byte[]) newByteArray(0);
        setByteElement(term13602, 0, (byte) 102);
        setField(term13601, term13601.getClass(), "SMALL_BUF", term13602);
        setIntField(term13601, term13601.getClass(), "recordSize", -1048298087);
        setIntField(term13601, term13601.getClass(), "blockSize", 292681826);
        setBooleanField(term13601, term13601.getClass(), "hasHitEOF", false);
        setLongField(term13601, term13601.getClass(), "entrySize", 1439298019805881866L);
        setLongField(term13601, term13601.getClass(), "entryOffset", -8708192233349544946L);
        setField(term13601, term13601.getClass(), "is", null);
        setField(term13603, term13603.getClass(), "name", "");
        setIntField(term13603, term13603.getClass(), "mode", 458147407);
        setIntField(term13603, term13603.getClass(), "userId", -184153539);
        setIntField(term13603, term13603.getClass(), "groupId", 493620644);
        setLongField(term13603, term13603.getClass(), "size", 5907001541142728739L);
        setLongField(term13603, term13603.getClass(), "modTime", 4178434741742309755L);
        setBooleanField(term13603, term13603.getClass(), "checkSumOK", false);
        setByteField(term13603, term13603.getClass(), "linkFlag", (byte) -118);
        setField(term13603, term13603.getClass(), "linkName", "");
        setField(term13603, term13603.getClass(), "magic", "ustar ");
        setField(term13603, term13603.getClass(), "version", "00");
        setField(term13603, term13603.getClass(), "userName", "root");
        setField(term13603, term13603.getClass(), "groupName", "");
        setIntField(term13603, term13603.getClass(), "devMajor", 1328271830);
        setIntField(term13603, term13603.getClass(), "devMinor", 1596070772);
        setBooleanField(term13603, term13603.getClass(), "isExtended", true);
        setLongField(term13603, term13603.getClass(), "realSize", -2068172595987555756L);
        setField(term13616, term13616.getClass(), "path", "RMFIsYGgne");
        setField(term13616, term13616.getClass(), "status", enum34);
        setIntField(term13616, term13616.getClass(), "prefixLength", 97029295);
        setField(term13616, term13616.getClass(), "filePath", null);
        setField(term13603, term13603.getClass(), "file", term13616);
        setField(term13601, term13601.getClass(), "currEntry", term13603);
        setField(term13601, term13601.getClass(), "encoding", null);
        setField(term13601, term13601.getClass(), "SINGLE", term13621);
        setLongField(term13601, term13601.getClass(), "bytesRead", -6292278961887936280L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipRecordPadding", argTypes, term1577, args);
        assertTrue(recursiveEquals(term1577, term13601));
    }

};


