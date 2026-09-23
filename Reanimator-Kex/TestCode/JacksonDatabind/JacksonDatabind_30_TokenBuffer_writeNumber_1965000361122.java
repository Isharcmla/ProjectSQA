package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TokenBuffer_writeNumber_1965000361122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252;

    public TokenBuffer_writeNumber_1965000361122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term253 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term255 = (int[]) newIntArray(6);
        setIntField(term253, term253.getClass(), "signum", 1);
        setIntElement(term255, 0, 9058);
        setIntElement(term255, 1, 1365043541);
        setIntElement(term255, 2, 1239861896);
        setIntElement(term255, 3, -1338148297);
        setIntElement(term255, 4, -418263970);
        setIntElement(term255, 5, -265097411);
        setField(term253, term253.getClass(), "mag", term255);
        setIntField(term253, term253.getClass(), "bitCountPlusOne", 0);
        setIntField(term253, term253.getClass(), "bitLengthPlusOne", 0);
        setIntField(term253, term253.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term253, term253.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term252, term252.getClass(), "intVal", term253);
        setIntField(term252, term252.getClass(), "scale", 53);
        setIntField(term252, term252.getClass(), "precision", 0);
        setField(term252, term252.getClass(), "stringCache", null);
        setLongField(term252, term252.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term252;
        try {
            callMethod(klass, "writeNumber", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


