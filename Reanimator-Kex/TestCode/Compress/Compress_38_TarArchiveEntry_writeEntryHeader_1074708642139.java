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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveEntry_writeEntryHeader_1074708642139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13419;
     Object term13483;

    public TarArchiveEntry_writeEntryHeader_1074708642139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43376 = Class.forName((String) "java.io.File$PathStatus");
        Field term43375 = ((Class) term43376).getDeclaredField((String) "INVALID");
        ((Field) term43375).setAccessible(true);
        Object enum184 = ((Field) term43375).get((Object) null);
        term13419 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13458 = newInstance(Class.forName("java.io.File"));
        setField(term13419, term13419.getClass(), "name", "");
        setBooleanField(term13419, term13419.getClass(), "preserveLeadingSlashes", true);
        setIntField(term13419, term13419.getClass(), "mode", -1111249833);
        setLongField(term13419, term13419.getClass(), "userId", -6985556670871089725L);
        setLongField(term13419, term13419.getClass(), "groupId", -8469818909085103606L);
        setLongField(term13419, term13419.getClass(), "size", 11315815278355083L);
        setLongField(term13419, term13419.getClass(), "modTime", 7735460540091431012L);
        setBooleanField(term13419, term13419.getClass(), "checkSumOK", true);
        setByteField(term13419, term13419.getClass(), "linkFlag", (byte) 13);
        setField(term13419, term13419.getClass(), "linkName", "");
        setField(term13419, term13419.getClass(), "magic", "ustar ");
        setField(term13419, term13419.getClass(), "version", "00");
        setField(term13419, term13419.getClass(), "userName", "root");
        setField(term13419, term13419.getClass(), "groupName", "");
        setIntField(term13419, term13419.getClass(), "devMajor", -1692331299);
        setIntField(term13419, term13419.getClass(), "devMinor", 479531250);
        setBooleanField(term13419, term13419.getClass(), "isExtended", true);
        setLongField(term13419, term13419.getClass(), "realSize", 1346299551708610248L);
        setBooleanField(term13419, term13419.getClass(), "paxGNUSparse", true);
        setBooleanField(term13419, term13419.getClass(), "starSparse", false);
        setField(term13458, term13458.getClass(), "path", "whBvTVIIlC");
        setField(term13458, term13458.getClass(), "status", enum184);
        setIntField(term13458, term13458.getClass(), "prefixLength", 1320570890);
        setField(term13458, term13458.getClass(), "filePath", null);
        setField(term13419, term13419.getClass(), "file", term13458);
        term13483 = (byte[]) newByteArray(3);
        setByteElement(term13483, 0, (byte) 44);
        setByteElement(term13483, 1, (byte) -63);
        setByteElement(term13483, 2, (byte) 15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term13483;
        try {
            callMethod(klass, "writeEntryHeader", argTypes, term13419, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


