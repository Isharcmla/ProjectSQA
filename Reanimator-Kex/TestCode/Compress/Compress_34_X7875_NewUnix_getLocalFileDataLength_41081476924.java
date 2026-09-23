package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.lang.Object;

public class X7875_NewUnix_getLocalFileDataLength_41081476924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term415;
     Object term402;

    public X7875_NewUnix_getLocalFileDataLength_41081476924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term62 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term64 = (int[]) newIntArray(1);
        setIntField(term60, term60.getClass(), "version", 1);
        setIntField(term62, term62.getClass(), "signum", 1);
        setIntElement(term64, 0, 1000);
        setField(term62, term62.getClass(), "mag", term64);
        setIntField(term62, term62.getClass(), "bitCountPlusOne", 0);
        setIntField(term62, term62.getClass(), "bitLengthPlusOne", 0);
        setIntField(term62, term62.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term62, term62.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term60, term60.getClass(), "uid", term62);
        setField(term60, term60.getClass(), "gid", term62);
        term415 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term416 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term417 = (int[]) newIntArray(1);
        setIntField(term415, term415.getClass(), "version", 1);
        setIntField(term416, term416.getClass(), "signum", 1);
        setIntElement(term417, 0, 1000);
        setField(term416, term416.getClass(), "mag", term417);
        setIntField(term416, term416.getClass(), "bitCountPlusOne", 0);
        setIntField(term416, term416.getClass(), "bitLengthPlusOne", 11);
        setIntField(term416, term416.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term416, term416.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term415, term415.getClass(), "uid", term416);
        setField(term415, term415.getClass(), "gid", term416);
        term402 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term402, term402.getClass(), "value", 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term60, args);
        assertTrue(recursiveEquals(term60, term415));
        assertTrue(recursiveEquals(retValue, term402));
    }

};


