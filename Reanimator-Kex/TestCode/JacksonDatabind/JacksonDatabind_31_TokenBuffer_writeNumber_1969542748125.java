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

public class TokenBuffer_writeNumber_1969542748125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;

    public TokenBuffer_writeNumber_1969542748125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term279 = (int[]) newIntArray(4);
        setIntField(term277, term277.getClass(), "signum", 1);
        setIntElement(term279, 0, 791012385);
        setIntElement(term279, 1, 819285061);
        setIntElement(term279, 2, 1509521496);
        setIntElement(term279, 3, 1264343831);
        setField(term277, term277.getClass(), "mag", term279);
        setIntField(term277, term277.getClass(), "bitCountPlusOne", 0);
        setIntField(term277, term277.getClass(), "bitLengthPlusOne", 0);
        setIntField(term277, term277.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term277, term277.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term277;
        try {
            callMethod(klass, "writeNumber", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


