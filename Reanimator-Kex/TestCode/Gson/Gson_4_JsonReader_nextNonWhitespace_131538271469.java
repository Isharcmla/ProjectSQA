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
import java.lang.Boolean;

public class JsonReader_nextNonWhitespace_131538271469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4299;
     Object term4336;

    public JsonReader_nextNonWhitespace_131538271469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4299 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4301 = (char[]) newCharArray(4);
        int[] term4325 = (int[]) newIntArray(1);
        Object[] term4328 = (Object[]) newArray("java.lang.String", 0);
        int[] term4329 = (int[]) newIntArray(6);
        setField(term4299, term4299.getClass(), "in", null);
        setBooleanField(term4299, term4299.getClass(), "lenient", true);
        setCharElement(term4301, 0, 'a');
        setCharElement(term4301, 1, 'H');
        setCharElement(term4301, 2, 'E');
        setCharElement(term4301, 3, 'w');
        setField(term4299, term4299.getClass(), "buffer", term4301);
        setIntField(term4299, term4299.getClass(), "pos", 114279242);
        setIntField(term4299, term4299.getClass(), "limit", 990883365);
        setIntField(term4299, term4299.getClass(), "lineNumber", 633598642);
        setIntField(term4299, term4299.getClass(), "lineStart", 1862841859);
        setIntField(term4299, term4299.getClass(), "peeked", -1114668574);
        setLongField(term4299, term4299.getClass(), "peekedLong", 2120084523938730454L);
        setIntField(term4299, term4299.getClass(), "peekedNumberLength", 514511037);
        setField(term4299, term4299.getClass(), "peekedString", "yVMkkQhvmN");
        setIntElement(term4325, 0, 1713573821);
        setField(term4299, term4299.getClass(), "stack", term4325);
        setIntField(term4299, term4299.getClass(), "stackSize", 1956590498);
        setField(term4299, term4299.getClass(), "pathNames", term4328);
        setIntElement(term4329, 0, 1467356494);
        setIntElement(term4329, 1, -26316536);
        setIntElement(term4329, 2, 1716165145);
        setIntElement(term4329, 3, 1692937831);
        setIntElement(term4329, 4, -1539747985);
        setIntElement(term4329, 5, -1982489643);
        setField(term4299, term4299.getClass(), "pathIndices", term4329);
        term4336 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4336;
        try {
            callMethod(klass, "nextNonWhitespace", argTypes, term4299, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


