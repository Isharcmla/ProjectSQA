package com.fasterxml.jackson.dataformat.xml.ser;

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
import static com.fasterxml.jackson.dataformat.xml.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ToXmlGenerator_writeNumber_1708798673116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700;

    public ToXmlGenerator_writeNumber_1708798673116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term701 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term703 = (int[]) newIntArray(6);
        setIntField(term701, term701.getClass(), "signum", 1);
        setIntElement(term703, 0, 9058);
        setIntElement(term703, 1, 1365043541);
        setIntElement(term703, 2, 1239861896);
        setIntElement(term703, 3, -1338148297);
        setIntElement(term703, 4, -418263970);
        setIntElement(term703, 5, -265097411);
        setField(term701, term701.getClass(), "mag", term703);
        setIntField(term701, term701.getClass(), "bitCountPlusOne", 0);
        setIntField(term701, term701.getClass(), "bitLengthPlusOne", 0);
        setIntField(term701, term701.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term701, term701.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term700, term700.getClass(), "intVal", term701);
        setIntField(term700, term700.getClass(), "scale", 53);
        setIntField(term700, term700.getClass(), "precision", 0);
        setField(term700, term700.getClass(), "stringCache", null);
        setLongField(term700, term700.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term700;
        try {
            callMethod(klass, "writeNumber", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


