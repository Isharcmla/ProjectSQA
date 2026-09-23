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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getRecord_125393720945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2053;

    public TarArchiveInputStream_getRecord_125393720945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14694 = Class.forName((String) "java.io.File$PathStatus");
        Field term14693 = ((Class) term14694).getDeclaredField((String) "INVALID");
        ((Field) term14693).setAccessible(true);
        Object enum37 = ((Field) term14693).get((Object) null);
        term2053 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2054 = (byte[]) newByteArray(2);
        Object term2062 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2098 = newInstance(Class.forName("java.io.File"));
        byte[] term2115 = (byte[]) newByteArray(1);
        setByteElement(term2054, 0, (byte) 10);
        setByteElement(term2054, 1, (byte) 77);
        setField(term2053, term2053.getClass(), "SMALL_BUF", term2054);
        setIntField(term2053, term2053.getClass(), "recordSize", 287287233);
        setIntField(term2053, term2053.getClass(), "blockSize", 962840079);
        setBooleanField(term2053, term2053.getClass(), "hasHitEOF", true);
        setLongField(term2053, term2053.getClass(), "entrySize", -3842548265506930260L);
        setLongField(term2053, term2053.getClass(), "entryOffset", -5788180182343976541L);
        setField(term2053, term2053.getClass(), "is", null);
        setField(term2062, term2062.getClass(), "name", "");
        setIntField(term2062, term2062.getClass(), "mode", 1540719661);
        setIntField(term2062, term2062.getClass(), "userId", 1265463001);
        setIntField(term2062, term2062.getClass(), "groupId", 335112684);
        setLongField(term2062, term2062.getClass(), "size", 2936323121573284007L);
        setLongField(term2062, term2062.getClass(), "modTime", -1154553077993834885L);
        setBooleanField(term2062, term2062.getClass(), "checkSumOK", false);
        setByteField(term2062, term2062.getClass(), "linkFlag", (byte) 14);
        setField(term2062, term2062.getClass(), "linkName", "");
        setField(term2062, term2062.getClass(), "magic", "ustar ");
        setField(term2062, term2062.getClass(), "version", "00");
        setField(term2062, term2062.getClass(), "userName", "root");
        setField(term2062, term2062.getClass(), "groupName", "");
        setIntField(term2062, term2062.getClass(), "devMajor", 1551099402);
        setIntField(term2062, term2062.getClass(), "devMinor", -2027534003);
        setBooleanField(term2062, term2062.getClass(), "isExtended", false);
        setLongField(term2062, term2062.getClass(), "realSize", -2850532706972744550L);
        setField(term2098, term2098.getClass(), "path", "uuaPigETmJ");
        setField(term2098, term2098.getClass(), "status", enum37);
        setIntField(term2098, term2098.getClass(), "prefixLength", 1063420942);
        setField(term2098, term2098.getClass(), "filePath", null);
        setField(term2062, term2062.getClass(), "file", term2098);
        setField(term2053, term2053.getClass(), "currEntry", term2062);
        setField(term2053, term2053.getClass(), "encoding", null);
        setByteElement(term2115, 0, (byte) -101);
        setField(term2053, term2053.getClass(), "SINGLE", term2115);
        setLongField(term2053, term2053.getClass(), "bytesRead", -2644215923136513282L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRecord", argTypes, term2053, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


