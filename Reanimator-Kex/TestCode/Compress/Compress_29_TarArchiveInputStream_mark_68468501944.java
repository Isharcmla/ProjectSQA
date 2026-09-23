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
import java.lang.Integer;

public class TarArchiveInputStream_mark_68468501944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1348;
     Object term1411;
     Object term12715;

    public TarArchiveInputStream_mark_68468501944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12759 = Class.forName((String) "java.io.File$PathStatus");
        Field term12758 = ((Class) term12759).getDeclaredField((String) "INVALID");
        ((Field) term12758).setAccessible(true);
        Object enum32 = ((Field) term12758).get((Object) null);
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
        setField(term1392, term1392.getClass(), "status", enum32);
        setIntField(term1392, term1392.getClass(), "prefixLength", 2055867847);
        setField(term1392, term1392.getClass(), "filePath", null);
        setField(term1356, term1356.getClass(), "file", term1392);
        setField(term1348, term1348.getClass(), "currEntry", term1356);
        setField(term1348, term1348.getClass(), "zipEncoding", null);
        setField(term1348, term1348.getClass(), "SINGLE", term1409);
        setLongField(term1348, term1348.getClass(), "bytesRead", 6617340557564669657L);
        term1411 = new Integer(-1048298087);
        Class<? extends Object> term12925 = Class.forName((String) "java.io.File$PathStatus");
        Field term12924 = ((Class) term12925).getDeclaredField((String) "INVALID");
        ((Field) term12924).setAccessible(true);
        Object enum33 = ((Field) term12924).get((Object) null);
        term12715 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term12716 = (byte[]) newByteArray(1);
        Object term12717 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term12730 = newInstance(Class.forName("java.io.File"));
        byte[] term12735 = (byte[]) newByteArray(0);
        setByteElement(term12716, 0, (byte) 116);
        setField(term12715, term12715.getClass(), "SMALL_BUF", term12716);
        setIntField(term12715, term12715.getClass(), "recordSize", -1016503459);
        setIntField(term12715, term12715.getClass(), "blockSize", -1968847291);
        setBooleanField(term12715, term12715.getClass(), "hasHitEOF", false);
        setLongField(term12715, term12715.getClass(), "entrySize", -5892135042702373494L);
        setLongField(term12715, term12715.getClass(), "entryOffset", 5262507301787091109L);
        setField(term12715, term12715.getClass(), "is", null);
        setField(term12717, term12717.getClass(), "name", "");
        setIntField(term12717, term12717.getClass(), "mode", 579005622);
        setIntField(term12717, term12717.getClass(), "userId", -14890619);
        setIntField(term12717, term12717.getClass(), "groupId", 1632125673);
        setLongField(term12717, term12717.getClass(), "size", -6823727938421990489L);
        setLongField(term12717, term12717.getClass(), "modTime", -484994522244390100L);
        setBooleanField(term12717, term12717.getClass(), "checkSumOK", true);
        setByteField(term12717, term12717.getClass(), "linkFlag", (byte) -81);
        setField(term12717, term12717.getClass(), "linkName", "");
        setField(term12717, term12717.getClass(), "magic", "ustar ");
        setField(term12717, term12717.getClass(), "version", "00");
        setField(term12717, term12717.getClass(), "userName", "root");
        setField(term12717, term12717.getClass(), "groupName", "");
        setIntField(term12717, term12717.getClass(), "devMajor", 454281060);
        setIntField(term12717, term12717.getClass(), "devMinor", -1786399638);
        setBooleanField(term12717, term12717.getClass(), "isExtended", true);
        setLongField(term12717, term12717.getClass(), "realSize", 1233889271256172047L);
        setField(term12730, term12730.getClass(), "path", "hRNSzYYIrc");
        setField(term12730, term12730.getClass(), "status", enum33);
        setIntField(term12730, term12730.getClass(), "prefixLength", 2055867847);
        setField(term12730, term12730.getClass(), "filePath", null);
        setField(term12717, term12717.getClass(), "file", term12730);
        setField(term12715, term12715.getClass(), "currEntry", term12717);
        setField(term12715, term12715.getClass(), "zipEncoding", null);
        setField(term12715, term12715.getClass(), "SINGLE", term12735);
        setLongField(term12715, term12715.getClass(), "bytesRead", 6617340557564669657L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1411;
        callMethod(klass, "mark", argTypes, term1348, args);
        assertTrue(recursiveEquals(term1348, term12715));
        assertTrue(recursiveEquals(term1411, -1048298087));
    }

};


