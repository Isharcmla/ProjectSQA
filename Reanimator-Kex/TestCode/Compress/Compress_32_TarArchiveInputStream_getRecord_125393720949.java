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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getRecord_125393720949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2749;

    public TarArchiveInputStream_getRecord_125393720949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17123 = Class.forName((String) "java.io.File$PathStatus");
        Field term17122 = ((Class) term17123).getDeclaredField((String) "INVALID");
        ((Field) term17122).setAccessible(true);
        Object enum44 = ((Field) term17122).get((Object) null);
        term2749 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2750 = (byte[]) newByteArray(6);
        Object term2762 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2798 = newInstance(Class.forName("java.io.File"));
        byte[] term2827 = (byte[]) newByteArray(5);
        setByteElement(term2750, 0, (byte) 96);
        setByteElement(term2750, 1, (byte) 70);
        setByteElement(term2750, 2, (byte) 48);
        setByteElement(term2750, 3, (byte) -46);
        setByteElement(term2750, 4, (byte) -128);
        setByteElement(term2750, 5, (byte) 66);
        setField(term2749, term2749.getClass(), "SMALL_BUF", term2750);
        setIntField(term2749, term2749.getClass(), "recordSize", -93135961);
        setIntField(term2749, term2749.getClass(), "blockSize", -112921587);
        setBooleanField(term2749, term2749.getClass(), "hasHitEOF", true);
        setLongField(term2749, term2749.getClass(), "entrySize", 6005241913654469005L);
        setLongField(term2749, term2749.getClass(), "entryOffset", -1983291584002806658L);
        setField(term2749, term2749.getClass(), "is", null);
        setField(term2762, term2762.getClass(), "name", "");
        setIntField(term2762, term2762.getClass(), "mode", 933028652);
        setLongField(term2762, term2762.getClass(), "userId", 5946780097489996391L);
        setLongField(term2762, term2762.getClass(), "groupId", -8652538484981166496L);
        setLongField(term2762, term2762.getClass(), "size", 2701184207686293431L);
        setLongField(term2762, term2762.getClass(), "modTime", 4474998035090263139L);
        setBooleanField(term2762, term2762.getClass(), "checkSumOK", true);
        setByteField(term2762, term2762.getClass(), "linkFlag", (byte) -112);
        setField(term2762, term2762.getClass(), "linkName", "");
        setField(term2762, term2762.getClass(), "magic", "ustar ");
        setField(term2762, term2762.getClass(), "version", "00");
        setField(term2762, term2762.getClass(), "userName", "root");
        setField(term2762, term2762.getClass(), "groupName", "");
        setIntField(term2762, term2762.getClass(), "devMajor", 287287233);
        setIntField(term2762, term2762.getClass(), "devMinor", 962840079);
        setBooleanField(term2762, term2762.getClass(), "isExtended", true);
        setLongField(term2762, term2762.getClass(), "realSize", 2848819812340321742L);
        setField(term2798, term2798.getClass(), "path", "eZFUvlxvGV");
        setField(term2798, term2798.getClass(), "status", enum44);
        setIntField(term2798, term2798.getClass(), "prefixLength", 1540719661);
        setField(term2798, term2798.getClass(), "filePath", null);
        setField(term2762, term2762.getClass(), "file", term2798);
        setField(term2749, term2749.getClass(), "currEntry", term2762);
        setField(term2749, term2749.getClass(), "zipEncoding", null);
        setField(term2749, term2749.getClass(), "encoding", "BYqFIqCKAV");
        setByteElement(term2827, 0, (byte) 81);
        setByteElement(term2827, 1, (byte) 65);
        setByteElement(term2827, 2, (byte) -44);
        setByteElement(term2827, 3, (byte) 33);
        setByteElement(term2827, 4, (byte) -74);
        setField(term2749, term2749.getClass(), "SINGLE", term2827);
        setLongField(term2749, term2749.getClass(), "bytesRead", -8876856890348836498L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRecord", argTypes, term2749, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


