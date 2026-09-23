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

public class JsonWriter_beforeName_143343339364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2579;

    public JsonWriter_beforeName_143343339364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2579 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2580 = (int[]) newIntArray(6);
        setField(term2579, term2579.getClass(), "out", null);
        setIntElement(term2580, 0, 1598895173);
        setIntElement(term2580, 1, 1830648570);
        setIntElement(term2580, 2, -227365013);
        setIntElement(term2580, 3, 11724947);
        setIntElement(term2580, 4, 1953277050);
        setIntElement(term2580, 5, 1283079251);
        setField(term2579, term2579.getClass(), "stack", term2580);
        setIntField(term2579, term2579.getClass(), "stackSize", -523949691);
        setField(term2579, term2579.getClass(), "indent", "JiVRgTZvKc");
        setField(term2579, term2579.getClass(), "separator", "XPKmummaqg");
        setBooleanField(term2579, term2579.getClass(), "lenient", false);
        setBooleanField(term2579, term2579.getClass(), "htmlSafe", false);
        setField(term2579, term2579.getClass(), "deferredName", "BKLfkLiZTH");
        setBooleanField(term2579, term2579.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beforeName", argTypes, term2579, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


