package com.google.gson;

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
import java.lang.AssertionError;
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultDateTypeAdapter_read_80590444317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118;
     Object term119;

    public DefaultDateTypeAdapter_read_80590444317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        setField(term118, term118.getClass(), "dateType", null);
        setField(term118, term118.getClass(), "enUsFormat", null);
        setField(term118, term118.getClass(), "localFormat", null);
        term119 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term121 = (char[]) newCharArray(4);
        int[] term145 = (int[]) newIntArray(3);
        Object[] term150 = (Object[]) newArray("java.lang.String", 4);
        int[] term199 = (int[]) newIntArray(1);
        setField(term119, term119.getClass(), "in", null);
        setBooleanField(term119, term119.getClass(), "lenient", false);
        setCharElement(term121, 0, 'P');
        setCharElement(term121, 1, 'A');
        setCharElement(term121, 2, 'E');
        setCharElement(term121, 3, 'B');
        setField(term119, term119.getClass(), "buffer", term121);
        setIntField(term119, term119.getClass(), "pos", -883034806);
        setIntField(term119, term119.getClass(), "limit", 1585847225);
        setIntField(term119, term119.getClass(), "lineNumber", 597278769);
        setIntField(term119, term119.getClass(), "lineStart", -1685132342);
        setIntField(term119, term119.getClass(), "peeked", -1456670397);
        setLongField(term119, term119.getClass(), "peekedLong", 2442117782898005296L);
        setIntField(term119, term119.getClass(), "peekedNumberLength", 1622346318);
        setField(term119, term119.getClass(), "peekedString", "jJCZpVmanW");
        setIntElement(term145, 0, 1048535127);
        setIntElement(term145, 1, -655067527);
        setIntElement(term145, 2, -6029667);
        setField(term119, term119.getClass(), "stack", term145);
        setIntField(term119, term119.getClass(), "stackSize", -2068769794);
        setElement(term150, 0, "EGtDIRbSSb");
        setElement(term150, 1, "SzjVpOQTyS");
        setElement(term150, 2, "MjGYSRKTNF");
        setElement(term150, 3, "hRNSzYYIrc");
        setField(term119, term119.getClass(), "pathNames", term150);
        setIntElement(term199, 0, -117576464);
        setField(term119, term119.getClass(), "pathIndices", term199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term119;
        try {
            callMethod(klass, "read", argTypes, term118, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


