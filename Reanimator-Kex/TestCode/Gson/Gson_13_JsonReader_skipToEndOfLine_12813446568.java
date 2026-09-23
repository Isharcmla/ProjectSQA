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

public class JsonReader_skipToEndOfLine_12813446568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4301;

    public JsonReader_skipToEndOfLine_12813446568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4301 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4303 = (char[]) newCharArray(4);
        int[] term4327 = (int[]) newIntArray(1);
        Object[] term4330 = (Object[]) newArray("java.lang.String", 0);
        int[] term4331 = (int[]) newIntArray(6);
        setField(term4301, term4301.getClass(), "in", null);
        setBooleanField(term4301, term4301.getClass(), "lenient", true);
        setCharElement(term4303, 0, 'a');
        setCharElement(term4303, 1, 'H');
        setCharElement(term4303, 2, 'E');
        setCharElement(term4303, 3, 'w');
        setField(term4301, term4301.getClass(), "buffer", term4303);
        setIntField(term4301, term4301.getClass(), "pos", 114279242);
        setIntField(term4301, term4301.getClass(), "limit", 990883365);
        setIntField(term4301, term4301.getClass(), "lineNumber", 633598642);
        setIntField(term4301, term4301.getClass(), "lineStart", 1862841859);
        setIntField(term4301, term4301.getClass(), "peeked", -1114668574);
        setLongField(term4301, term4301.getClass(), "peekedLong", 2120084523938730454L);
        setIntField(term4301, term4301.getClass(), "peekedNumberLength", 514511037);
        setField(term4301, term4301.getClass(), "peekedString", "yVMkkQhvmN");
        setIntElement(term4327, 0, 1713573821);
        setField(term4301, term4301.getClass(), "stack", term4327);
        setIntField(term4301, term4301.getClass(), "stackSize", 1956590498);
        setField(term4301, term4301.getClass(), "pathNames", term4330);
        setIntElement(term4331, 0, 1467356494);
        setIntElement(term4331, 1, -26316536);
        setIntElement(term4331, 2, 1716165145);
        setIntElement(term4331, 3, 1692937831);
        setIntElement(term4331, 4, -1539747985);
        setIntElement(term4331, 5, -1982489643);
        setField(term4301, term4301.getClass(), "pathIndices", term4331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipToEndOfLine", argTypes, term4301, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


