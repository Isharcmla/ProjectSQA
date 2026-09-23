package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;

public class Base64_decodeInteger_180499082276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2311;
     Object term11948;
     Object term11941;

    public Base64_decodeInteger_180499082276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2311 = (byte[]) newByteArray(5);
        setByteElement(term2311, 0, (byte) 43);
        setByteElement(term2311, 1, (byte) -27);
        setByteElement(term2311, 2, (byte) 34);
        setByteElement(term2311, 3, (byte) -126);
        setByteElement(term2311, 4, (byte) 12);
        term11948 = (byte[]) newByteArray(5);
        setByteElement(term11948, 0, (byte) 43);
        setByteElement(term11948, 1, (byte) -27);
        setByteElement(term11948, 2, (byte) 34);
        setByteElement(term11948, 3, (byte) -126);
        setByteElement(term11948, 4, (byte) 12);
        term11941 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term11943 = (int[]) newIntArray(0);
        setIntField(term11941, term11941.getClass(), "signum", 0);
        setField(term11941, term11941.getClass(), "mag", term11943);
        setIntField(term11941, term11941.getClass(), "bitCountPlusOne", 0);
        setIntField(term11941, term11941.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11941, term11941.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11941, term11941.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2311;
        Object retValue = callMethod(klass, "decodeInteger", argTypes, null, args);
        assertTrue(recursiveEquals(term2311, term11948));
        assertTrue(recursiveEquals(retValue, term11941));
    }

};


