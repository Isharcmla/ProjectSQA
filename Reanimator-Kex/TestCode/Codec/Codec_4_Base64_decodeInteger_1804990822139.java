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

public class Base64_decodeInteger_1804990822139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84589;
     Object term233916;
     Object term233909;

    public Base64_decodeInteger_1804990822139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84589 = (byte[]) newByteArray(696);
        setByteElement(term84589, 0, (byte) -1);
        term233916 = (byte[]) newByteArray(696);
        setByteElement(term233916, 0, (byte) -1);
        term233909 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term233911 = (int[]) newIntArray(0);
        setIntField(term233909, term233909.getClass(), "signum", 0);
        setField(term233909, term233909.getClass(), "mag", term233911);
        setIntField(term233909, term233909.getClass(), "bitCountPlusOne", 0);
        setIntField(term233909, term233909.getClass(), "bitLengthPlusOne", 0);
        setIntField(term233909, term233909.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term233909, term233909.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term84589;
        Object retValue = callMethod(klass, "decodeInteger", argTypes, null, args);
        assertTrue(recursiveEquals(term84589, term233916));
        assertTrue(recursiveEquals(retValue, term233909));
    }

};


