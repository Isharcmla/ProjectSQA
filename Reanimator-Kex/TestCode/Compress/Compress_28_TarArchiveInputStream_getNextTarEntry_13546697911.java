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
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getNextTarEntry_13546697911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1348;

    public TarArchiveInputStream_getNextTarEntry_13546697911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1435 = Class.forName((String) "java.io.File$PathStatus");
        Field term1434 = ((Class) term1435).getDeclaredField((String) "CHECKED");
        ((Field) term1434).setAccessible(true);
        Object enum5 = ((Field) term1434).get((Object) null);
        term1348 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1349 = (byte[]) newByteArray(1);
        Object term1356 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1392 = newInstance(Class.forName("java.io.File"));
        byte[] term1409 = (byte[]) newByteArray(0);
        setByteElement(term1349, 0, (byte) 116);
        setField(term1348, term1348.getClass(), "SMALL_BUF", term1349);
        setIntField(term1348, term1348.getClass(), "recordSize", -1016503459);
        setIntField(term1348, term1348.getClass(), "blockSize", -1968847291);
        setBooleanField(term1348, term1348.getClass(), "hasHitEOF", false);
        setLongField(term1348, term1348.getClass(), "entrySize", -5892135042702373494L);
        setLongField(term1348, term1348.getClass(), "entryOffset", 5262507301787091109L);
        setField(term1348, term1348.getClass(), "is", null);
        setField(term1356, term1356.getClass(), "name", "");
        setIntField(term1356, term1356.getClass(), "mode", 579005622);
        setIntField(term1356, term1356.getClass(), "userId", -14890619);
        setIntField(term1356, term1356.getClass(), "groupId", 1632125673);
        setLongField(term1356, term1356.getClass(), "size", -6823727938421990489L);
        setLongField(term1356, term1356.getClass(), "modTime", -484994522244390100L);
        setBooleanField(term1356, term1356.getClass(), "checkSumOK", true);
        setByteField(term1356, term1356.getClass(), "linkFlag", (byte) -81);
        setField(term1356, term1356.getClass(), "linkName", "");
        setField(term1356, term1356.getClass(), "magic", "ustar ");
        setField(term1356, term1356.getClass(), "version", "00");
        setField(term1356, term1356.getClass(), "userName", "root");
        setField(term1356, term1356.getClass(), "groupName", "");
        setIntField(term1356, term1356.getClass(), "devMajor", 454281060);
        setIntField(term1356, term1356.getClass(), "devMinor", -1786399638);
        setBooleanField(term1356, term1356.getClass(), "isExtended", true);
        setLongField(term1356, term1356.getClass(), "realSize", 1233889271256172047L);
        setField(term1392, term1392.getClass(), "path", "hRNSzYYIrc");
        setField(term1392, term1392.getClass(), "status", enum5);
        setIntField(term1392, term1392.getClass(), "prefixLength", 2055867847);
        setField(term1392, term1392.getClass(), "filePath", null);
        setField(term1356, term1356.getClass(), "file", term1392);
        setField(term1348, term1348.getClass(), "currEntry", term1356);
        setField(term1348, term1348.getClass(), "encoding", null);
        setField(term1348, term1348.getClass(), "SINGLE", term1409);
        setLongField(term1348, term1348.getClass(), "bytesRead", 6617340557564669657L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextTarEntry", argTypes, term1348, args);
    }

};


