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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonWriter_close_48159369959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2233;

    public JsonWriter_close_48159369959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2233 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2234 = (int[]) newIntArray(5);
        setField(term2233, term2233.getClass(), "out", null);
        setIntElement(term2234, 0, 107945604);
        setIntElement(term2234, 1, -1963464809);
        setIntElement(term2234, 2, 71190297);
        setIntElement(term2234, 3, 1202361360);
        setIntElement(term2234, 4, -2015048153);
        setField(term2233, term2233.getClass(), "stack", term2234);
        setIntField(term2233, term2233.getClass(), "stackSize", -2063457669);
        setField(term2233, term2233.getClass(), "indent", "cAPeiZHKGJ");
        setField(term2233, term2233.getClass(), "separator", "LvJFtLBaxj");
        setBooleanField(term2233, term2233.getClass(), "lenient", true);
        setBooleanField(term2233, term2233.getClass(), "htmlSafe", false);
        setField(term2233, term2233.getClass(), "deferredName", "PHvxnGHptP");
        setBooleanField(term2233, term2233.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term2233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


