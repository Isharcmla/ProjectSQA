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
import java.lang.Integer;

public class JsonWriter_replaceTop_89732405648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281;
     Object term1324;

    public JsonWriter_replaceTop_89732405648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1281 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1282 = (int[]) newIntArray(1);
        setField(term1281, term1281.getClass(), "out", null);
        setIntElement(term1282, 0, -478195677);
        setField(term1281, term1281.getClass(), "stack", term1282);
        setIntField(term1281, term1281.getClass(), "stackSize", 972867650);
        setField(term1281, term1281.getClass(), "indent", "xLbjWUgOIL");
        setField(term1281, term1281.getClass(), "separator", "jDtqGUpnZN");
        setBooleanField(term1281, term1281.getClass(), "lenient", false);
        setBooleanField(term1281, term1281.getClass(), "htmlSafe", true);
        setField(term1281, term1281.getClass(), "deferredName", "nGKItKLYNC");
        setBooleanField(term1281, term1281.getClass(), "serializeNulls", false);
        term1324 = new Integer(1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1324;
        try {
            callMethod(klass, "replaceTop", argTypes, term1281, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


