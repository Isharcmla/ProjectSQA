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

public class UTF8JsonGenerator_writeNumber_1095985946112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;

    public UTF8JsonGenerator_writeNumber_1095985946112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term257 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term259 = (int[]) newIntArray(6);
        setIntField(term257, term257.getClass(), "signum", 1);
        setIntElement(term259, 0, 9058);
        setIntElement(term259, 1, 1365043541);
        setIntElement(term259, 2, 1239861896);
        setIntElement(term259, 3, -1338148297);
        setIntElement(term259, 4, -418263970);
        setIntElement(term259, 5, -265097411);
        setField(term257, term257.getClass(), "mag", term259);
        setIntField(term257, term257.getClass(), "bitCountPlusOne", 0);
        setIntField(term257, term257.getClass(), "bitLengthPlusOne", 0);
        setIntField(term257, term257.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term257, term257.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term256, term256.getClass(), "intVal", term257);
        setIntField(term256, term256.getClass(), "scale", 53);
        setIntField(term256, term256.getClass(), "precision", 0);
        setField(term256, term256.getClass(), "stringCache", null);
        setLongField(term256, term256.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term256;
        try {
            callMethod(klass, "writeNumber", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


