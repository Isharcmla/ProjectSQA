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
     Object term2055;
     Object term14341;

    public TarArchiveInputStream_skipRecordPadding_10841937947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14386 = Class.forName((String) "java.io.File$PathStatus");
        Field term14385 = ((Class) term14386).getDeclaredField((String) "INVALID");
        ((Field) term14385).setAccessible(true);
        Object enum40 = ((Field) term14385).get((Object) null);
        term2055 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2056 = (byte[]) newByteArray(2);
        Object term2064 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2100 = newInstance(Class.forName("java.io.File"));
        byte[] term2117 = (byte[]) newByteArray(1);
        setByteElement(term2056, 0, (byte) 10);
        setByteElement(term2056, 1, (byte) 77);
        setField(term2055, term2055.getClass(), "SMALL_BUF", term2056);
        setIntField(term2055, term2055.getClass(), "recordSize", 962840079);
        setIntField(term2055, term2055.getClass(), "blockSize", 1540719661);
        setBooleanField(term2055, term2055.getClass(), "hasHitEOF", true);
        setLongField(term2055, term2055.getClass(), "entrySize", -3842548265506930260L);
        setLongField(term2055, term2055.getClass(), "entryOffset", -5788180182343976541L);
        setField(term2055, term2055.getClass(), "is", null);
        setField(term2064, term2064.getClass(), "name", "");
        setIntField(term2064, term2064.getClass(), "mode", 1265463001);
        setIntField(term2064, term2064.getClass(), "userId", 335112684);
        setIntField(term2064, term2064.getClass(), "groupId", 1551099402);
        setLongField(term2064, term2064.getClass(), "size", 2936323121573284007L);
        setLongField(term2064, term2064.getClass(), "modTime", -1154553077993834885L);
        setBooleanField(term2064, term2064.getClass(), "checkSumOK", false);
        setByteField(term2064, term2064.getClass(), "linkFlag", (byte) 14);
        setField(term2064, term2064.getClass(), "linkName", "");
        setField(term2064, term2064.getClass(), "magic", "ustar ");
        setField(term2064, term2064.getClass(), "version", "00");
        setField(term2064, term2064.getClass(), "userName", "root");
        setField(term2064, term2064.getClass(), "groupName", "");
        setIntField(term2064, term2064.getClass(), "devMajor", -2027534003);
        setIntField(term2064, term2064.getClass(), "devMinor", 1063420942);
        setBooleanField(term2064, term2064.getClass(), "isExtended", false);
        setLongField(term2064, term2064.getClass(), "realSize", -2850532706972744550L);
        setField(term2100, term2100.getClass(), "path", "uuaPigETmJ");
        setField(term2100, term2100.getClass(), "status", enum40);
        setIntField(term2100, term2100.getClass(), "prefixLength", 1375330971);
        setField(term2100, term2100.getClass(), "filePath", null);
        setField(term2064, term2064.getClass(), "file", term2100);
        setField(term2055, term2055.getClass(), "currEntry", term2064);
        setField(term2055, term2055.getClass(), "zipEncoding", null);
        setByteElement(term2117, 0, (byte) -101);
        setField(term2055, term2055.getClass(), "SINGLE", term2117);
        setLongField(term2055, term2055.getClass(), "bytesRead", -2644215923136513282L);
        Class<? extends Object> term14554 = Class.forName((String) "java.io.File$PathStatus");
        Field term14553 = ((Class) term14554).getDeclaredField((String) "INVALID");
        ((Field) term14553).setAccessible(true);
        Object enum41 = ((Field) term14553).get((Object) null);
        term14341 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term14342 = (byte[]) newByteArray(2);
        Object term14343 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term14356 = newInstance(Class.forName("java.io.File"));
        byte[] term14361 = (byte[]) newByteArray(1);
        setByteElement(term14342, 0, (byte) 10);
        setByteElement(term14342, 1, (byte) 77);
        setField(term14341, term14341.getClass(), "SMALL_BUF", term14342);
        setIntField(term14341, term14341.getClass(), "recordSize", 962840079);
        setIntField(term14341, term14341.getClass(), "blockSize", 1540719661);
        setBooleanField(term14341, term14341.getClass(), "hasHitEOF", true);
        setLongField(term14341, term14341.getClass(), "entrySize", -3842548265506930260L);
        setLongField(term14341, term14341.getClass(), "entryOffset", -5788180182343976541L);
        setField(term14341, term14341.getClass(), "is", null);
        setField(term14343, term14343.getClass(), "name", "");
        setIntField(term14343, term14343.getClass(), "mode", 1265463001);
        setIntField(term14343, term14343.getClass(), "userId", 335112684);
        setIntField(term14343, term14343.getClass(), "groupId", 1551099402);
        setLongField(term14343, term14343.getClass(), "size", 2936323121573284007L);
        setLongField(term14343, term14343.getClass(), "modTime", -1154553077993834885L);
        setBooleanField(term14343, term14343.getClass(), "checkSumOK", false);
        setByteField(term14343, term14343.getClass(), "linkFlag", (byte) 14);
        setField(term14343, term14343.getClass(), "linkName", "");
        setField(term14343, term14343.getClass(), "magic", "ustar ");
        setField(term14343, term14343.getClass(), "version", "00");
        setField(term14343, term14343.getClass(), "userName", "root");
        setField(term14343, term14343.getClass(), "groupName", "");
        setIntField(term14343, term14343.getClass(), "devMajor", -2027534003);
        setIntField(term14343, term14343.getClass(), "devMinor", 1063420942);
        setBooleanField(term14343, term14343.getClass(), "isExtended", false);
        setLongField(term14343, term14343.getClass(), "realSize", -2850532706972744550L);
        setField(term14356, term14356.getClass(), "path", "uuaPigETmJ");
        setField(term14356, term14356.getClass(), "status", enum41);
        setIntField(term14356, term14356.getClass(), "prefixLength", 1375330971);
        setField(term14356, term14356.getClass(), "filePath", null);
        setField(term14343, term14343.getClass(), "file", term14356);
        setField(term14341, term14341.getClass(), "currEntry", term14343);
        setField(term14341, term14341.getClass(), "zipEncoding", null);
        setByteElement(term14361, 0, (byte) -101);
        setField(term14341, term14341.getClass(), "SINGLE", term14361);
        setLongField(term14341, term14341.getClass(), "bytesRead", -2644215923136513282L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipRecordPadding", argTypes, term2055, args);
        assertTrue(recursiveEquals(term2055, term14341));
    }

};


