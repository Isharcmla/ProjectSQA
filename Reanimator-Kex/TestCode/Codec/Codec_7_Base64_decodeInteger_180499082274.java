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

public class Base64_decodeInteger_180499082274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2448;
     Object term12260;
     Object term12253;

    public Base64_decodeInteger_180499082274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2448 = (byte[]) newByteArray(1);
        setByteElement(term2448, 0, (byte) -75);
        term12260 = (byte[]) newByteArray(1);
        setByteElement(term12260, 0, (byte) -75);
        term12253 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12255 = (int[]) newIntArray(0);
        setIntField(term12253, term12253.getClass(), "signum", 0);
        setField(term12253, term12253.getClass(), "mag", term12255);
        setIntField(term12253, term12253.getClass(), "bitCountPlusOne", 0);
        setIntField(term12253, term12253.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12253, term12253.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12253, term12253.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2448;
        Object retValue = callMethod(klass, "decodeInteger", argTypes, null, args);
        assertTrue(recursiveEquals(term2448, term12260));
        assertTrue(recursiveEquals(retValue, term12253));
    }

};


