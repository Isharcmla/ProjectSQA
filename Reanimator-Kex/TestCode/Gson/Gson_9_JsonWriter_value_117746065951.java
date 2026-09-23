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

public class JsonWriter_value_117746065951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1527;

    public JsonWriter_value_117746065951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1527 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1528 = (int[]) newIntArray(8);
        setField(term1527, term1527.getClass(), "out", null);
        setIntElement(term1528, 0, -1547384488);
        setIntElement(term1528, 1, 1442160736);
        setIntElement(term1528, 2, 1114000454);
        setIntElement(term1528, 3, -556405712);
        setIntElement(term1528, 4, -1772434990);
        setIntElement(term1528, 5, -1845499264);
        setIntElement(term1528, 6, -505439934);
        setIntElement(term1528, 7, -344842608);
        setField(term1527, term1527.getClass(), "stack", term1528);
        setIntField(term1527, term1527.getClass(), "stackSize", 941650513);
        setField(term1527, term1527.getClass(), "indent", "ytSBIKXogI");
        setField(term1527, term1527.getClass(), "separator", "nHXjMycHlU");
        setBooleanField(term1527, term1527.getClass(), "lenient", true);
        setBooleanField(term1527, term1527.getClass(), "htmlSafe", false);
        setField(term1527, term1527.getClass(), "deferredName", "ieCtQFdkii");
        setBooleanField(term1527, term1527.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dEnhdmILtU";
        try {
            callMethod(klass, "value", argTypes, term1527, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


