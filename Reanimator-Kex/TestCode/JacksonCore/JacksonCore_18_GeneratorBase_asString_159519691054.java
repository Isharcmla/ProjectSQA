package com.fasterxml.jackson.core.base;

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
import static com.fasterxml.jackson.core.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GeneratorBase_asString_159519691054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;

    public GeneratorBase_asString_159519691054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term79 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term81 = (int[]) newIntArray(6);
        setIntField(term79, term79.getClass(), "signum", 1);
        setIntElement(term81, 0, 9058);
        setIntElement(term81, 1, 1365043541);
        setIntElement(term81, 2, 1239861896);
        setIntElement(term81, 3, -1338148297);
        setIntElement(term81, 4, -418263970);
        setIntElement(term81, 5, -265097411);
        setField(term79, term79.getClass(), "mag", term81);
        setIntField(term79, term79.getClass(), "bitCountPlusOne", 0);
        setIntField(term79, term79.getClass(), "bitLengthPlusOne", 0);
        setIntField(term79, term79.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term79, term79.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term78, term78.getClass(), "intVal", term79);
        setIntField(term78, term78.getClass(), "scale", 53);
        setIntField(term78, term78.getClass(), "precision", 0);
        setField(term78, term78.getClass(), "stringCache", null);
        setLongField(term78, term78.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term78;
        try {
            callMethod(klass, "_asString", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


