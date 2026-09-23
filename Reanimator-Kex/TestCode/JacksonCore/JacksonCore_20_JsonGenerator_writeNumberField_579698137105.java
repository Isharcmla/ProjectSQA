package com.fasterxml.jackson.core;

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
import static com.fasterxml.jackson.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonGenerator_writeNumberField_579698137105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;

    public JsonGenerator_writeNumberField_579698137105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term281 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term283 = (int[]) newIntArray(6);
        setIntField(term281, term281.getClass(), "signum", 1);
        setIntElement(term283, 0, 9058);
        setIntElement(term283, 1, 1365043541);
        setIntElement(term283, 2, 1239861896);
        setIntElement(term283, 3, -1338148297);
        setIntElement(term283, 4, -418263970);
        setIntElement(term283, 5, -265097411);
        setField(term281, term281.getClass(), "mag", term283);
        setIntField(term281, term281.getClass(), "bitCountPlusOne", 0);
        setIntField(term281, term281.getClass(), "bitLengthPlusOne", 0);
        setIntField(term281, term281.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term281, term281.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term280, term280.getClass(), "intVal", term281);
        setIntField(term280, term280.getClass(), "scale", 53);
        setIntField(term280, term280.getClass(), "precision", 0);
        setField(term280, term280.getClass(), "stringCache", null);
        setLongField(term280, term280.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[2];
        args[0] = "hRNSzYYIrc";
        args[1] = term280;
        try {
            callMethod(klass, "writeNumberField", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


