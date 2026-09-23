package com.google.gson.stream;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class JsonReader_fillBuffer_13674569066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4057;
     Object term4101;

    public JsonReader_fillBuffer_13674569066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4057 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4059 = (char[]) newCharArray(1);
        int[] term4080 = (int[]) newIntArray(0);
        Object[] term4082 = (Object[]) newArray("java.lang.String", 1);
        int[] term4095 = (int[]) newIntArray(5);
        setField(term4057, term4057.getClass(), "in", null);
        setBooleanField(term4057, term4057.getClass(), "lenient", false);
        setCharElement(term4059, 0, 'V');
        setField(term4057, term4057.getClass(), "buffer", term4059);
        setIntField(term4057, term4057.getClass(), "pos", -1488938905);
        setIntField(term4057, term4057.getClass(), "limit", 1916544127);
        setIntField(term4057, term4057.getClass(), "lineNumber", -1133405894);
        setIntField(term4057, term4057.getClass(), "lineStart", 1289741214);
        setIntField(term4057, term4057.getClass(), "peeked", 243280944);
        setLongField(term4057, term4057.getClass(), "peekedLong", -7672528020740371001L);
        setIntField(term4057, term4057.getClass(), "peekedNumberLength", -726681073);
        setField(term4057, term4057.getClass(), "peekedString", "fWKJoSoCwE");
        setField(term4057, term4057.getClass(), "stack", term4080);
        setIntField(term4057, term4057.getClass(), "stackSize", -1724487863);
        setElement(term4082, 0, "wfaXBpWAUH");
        setField(term4057, term4057.getClass(), "pathNames", term4082);
        setIntElement(term4095, 0, -128490829);
        setIntElement(term4095, 1, 202214133);
        setIntElement(term4095, 2, 1543091617);
        setIntElement(term4095, 3, -763166094);
        setIntElement(term4095, 4, -222941705);
        setField(term4057, term4057.getClass(), "pathIndices", term4095);
        term4101 = new Integer(291864719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4101;
        try {
            callMethod(klass, "fillBuffer", argTypes, term4057, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


