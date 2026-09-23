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

public class JsonWriter_beforeValue_118791082563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2577;

    public JsonWriter_beforeValue_118791082563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2577 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2578 = (int[]) newIntArray(6);
        setField(term2577, term2577.getClass(), "out", null);
        setIntElement(term2578, 0, 1598895173);
        setIntElement(term2578, 1, 1830648570);
        setIntElement(term2578, 2, -227365013);
        setIntElement(term2578, 3, 11724947);
        setIntElement(term2578, 4, 1953277050);
        setIntElement(term2578, 5, 1283079251);
        setField(term2577, term2577.getClass(), "stack", term2578);
        setIntField(term2577, term2577.getClass(), "stackSize", -523949691);
        setField(term2577, term2577.getClass(), "indent", "JiVRgTZvKc");
        setField(term2577, term2577.getClass(), "separator", "XPKmummaqg");
        setBooleanField(term2577, term2577.getClass(), "lenient", false);
        setBooleanField(term2577, term2577.getClass(), "htmlSafe", false);
        setField(term2577, term2577.getClass(), "deferredName", "BKLfkLiZTH");
        setBooleanField(term2577, term2577.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beforeValue", argTypes, term2577, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


