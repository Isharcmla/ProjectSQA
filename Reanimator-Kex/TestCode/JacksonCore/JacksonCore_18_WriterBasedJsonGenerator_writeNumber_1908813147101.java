package com.fasterxml.jackson.core.json;

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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class WriterBasedJsonGenerator_writeNumber_1908813147101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;

    public WriterBasedJsonGenerator_writeNumber_1908813147101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term264 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term266 = (int[]) newIntArray(6);
        setIntField(term264, term264.getClass(), "signum", 1);
        setIntElement(term266, 0, 9058);
        setIntElement(term266, 1, 1365043541);
        setIntElement(term266, 2, 1239861896);
        setIntElement(term266, 3, -1338148297);
        setIntElement(term266, 4, -418263970);
        setIntElement(term266, 5, -265097411);
        setField(term264, term264.getClass(), "mag", term266);
        setIntField(term264, term264.getClass(), "bitCountPlusOne", 0);
        setIntField(term264, term264.getClass(), "bitLengthPlusOne", 0);
        setIntField(term264, term264.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term264, term264.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term263, term263.getClass(), "intVal", term264);
        setIntField(term263, term263.getClass(), "scale", 53);
        setIntField(term263, term263.getClass(), "precision", 0);
        setField(term263, term263.getClass(), "stringCache", null);
        setLongField(term263, term263.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term263;
        try {
            callMethod(klass, "writeNumber", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


