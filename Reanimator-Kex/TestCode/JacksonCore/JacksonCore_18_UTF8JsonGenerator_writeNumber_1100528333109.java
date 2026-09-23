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

public class UTF8JsonGenerator_writeNumber_1100528333109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public UTF8JsonGenerator_writeNumber_1100528333109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term239 = (int[]) newIntArray(4);
        setIntField(term237, term237.getClass(), "signum", 1);
        setIntElement(term239, 0, 791012385);
        setIntElement(term239, 1, 819285061);
        setIntElement(term239, 2, 1509521496);
        setIntElement(term239, 3, 1264343831);
        setField(term237, term237.getClass(), "mag", term239);
        setIntField(term237, term237.getClass(), "bitCountPlusOne", 0);
        setIntField(term237, term237.getClass(), "bitLengthPlusOne", 0);
        setIntField(term237, term237.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term237, term237.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term237;
        try {
            callMethod(klass, "writeNumber", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


