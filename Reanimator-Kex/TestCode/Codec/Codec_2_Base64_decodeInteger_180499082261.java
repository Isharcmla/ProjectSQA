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

public class Base64_decodeInteger_180499082261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2037;
     Object term9487;
     Object term9480;

    public Base64_decodeInteger_180499082261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2037 = (byte[]) newByteArray(6);
        setByteElement(term2037, 0, (byte) -53);
        setByteElement(term2037, 1, (byte) -8);
        setByteElement(term2037, 2, (byte) -9);
        setByteElement(term2037, 3, (byte) 97);
        setByteElement(term2037, 4, (byte) -46);
        setByteElement(term2037, 5, (byte) 14);
        term9487 = (byte[]) newByteArray(6);
        setByteElement(term9487, 0, (byte) -53);
        setByteElement(term9487, 1, (byte) -8);
        setByteElement(term9487, 2, (byte) -9);
        setByteElement(term9487, 3, (byte) 97);
        setByteElement(term9487, 4, (byte) -46);
        setByteElement(term9487, 5, (byte) 14);
        term9480 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9482 = (int[]) newIntArray(0);
        setIntField(term9480, term9480.getClass(), "signum", 0);
        setField(term9480, term9480.getClass(), "mag", term9482);
        setIntField(term9480, term9480.getClass(), "bitCountPlusOne", 0);
        setIntField(term9480, term9480.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9480, term9480.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9480, term9480.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2037;
        Object retValue = callMethod(klass, "decodeInteger", argTypes, null, args);
        assertTrue(recursiveEquals(term2037, term9487));
        assertTrue(recursiveEquals(retValue, term9480));
    }

};


