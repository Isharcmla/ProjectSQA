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

public class Base64_decodeInteger_1804990822114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63422;
     Object term132827;
     Object term132820;

    public Base64_decodeInteger_1804990822114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63422 = (byte[]) newByteArray(3);
        term132827 = (byte[]) newByteArray(3);
        term132820 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term132822 = (int[]) newIntArray(0);
        setIntField(term132820, term132820.getClass(), "signum", 0);
        setField(term132820, term132820.getClass(), "mag", term132822);
        setIntField(term132820, term132820.getClass(), "bitCountPlusOne", 0);
        setIntField(term132820, term132820.getClass(), "bitLengthPlusOne", 0);
        setIntField(term132820, term132820.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term132820, term132820.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term63422;
        Object retValue = callMethod(klass, "decodeInteger", argTypes, null, args);
        assertTrue(recursiveEquals(term63422, term132827));
        assertTrue(recursiveEquals(retValue, term132820));
    }

};


