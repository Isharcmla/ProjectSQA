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

public class JsonWriter_jsonValue_183128634152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1637;

    public JsonWriter_jsonValue_183128634152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1637 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1638 = (int[]) newIntArray(6);
        setField(term1637, term1637.getClass(), "out", null);
        setIntElement(term1638, 0, 444029505);
        setIntElement(term1638, 1, -1034506028);
        setIntElement(term1638, 2, -1263114719);
        setIntElement(term1638, 3, -894662986);
        setIntElement(term1638, 4, 304775596);
        setIntElement(term1638, 5, -1347665717);
        setField(term1637, term1637.getClass(), "stack", term1638);
        setIntField(term1637, term1637.getClass(), "stackSize", -1888585309);
        setField(term1637, term1637.getClass(), "indent", "hoicvmsovO");
        setField(term1637, term1637.getClass(), "separator", "eqJfYWRaEL");
        setBooleanField(term1637, term1637.getClass(), "lenient", false);
        setBooleanField(term1637, term1637.getClass(), "htmlSafe", false);
        setField(term1637, term1637.getClass(), "deferredName", "fhkbdRViHi");
        setBooleanField(term1637, term1637.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        try {
            callMethod(klass, "jsonValue", argTypes, term1637, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


