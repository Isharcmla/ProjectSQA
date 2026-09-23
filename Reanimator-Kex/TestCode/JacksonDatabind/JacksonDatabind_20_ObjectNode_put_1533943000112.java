package com.fasterxml.jackson.databind.node;

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
import static com.fasterxml.jackson.databind.node.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectNode_put_1533943000112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term797;

    public ObjectNode_put_1533943000112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term797 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term798 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term800 = (int[]) newIntArray(6);
        setIntField(term798, term798.getClass(), "signum", 1);
        setIntElement(term800, 0, 9058);
        setIntElement(term800, 1, 1365043541);
        setIntElement(term800, 2, 1239861896);
        setIntElement(term800, 3, -1338148297);
        setIntElement(term800, 4, -418263970);
        setIntElement(term800, 5, -265097411);
        setField(term798, term798.getClass(), "mag", term800);
        setIntField(term798, term798.getClass(), "bitCountPlusOne", 0);
        setIntField(term798, term798.getClass(), "bitLengthPlusOne", 0);
        setIntField(term798, term798.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term798, term798.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term797, term797.getClass(), "intVal", term798);
        setIntField(term797, term797.getClass(), "scale", 53);
        setIntField(term797, term797.getClass(), "precision", 0);
        setField(term797, term797.getClass(), "stringCache", null);
        setLongField(term797, term797.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[2];
        args[0] = "nyiiPDVjAc";
        args[1] = term797;
        try {
            callMethod(klass, "put", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


