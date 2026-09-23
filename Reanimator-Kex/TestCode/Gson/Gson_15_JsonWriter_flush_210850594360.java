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

public class JsonWriter_flush_210850594360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2235;

    public JsonWriter_flush_210850594360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2235 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2236 = (int[]) newIntArray(5);
        setField(term2235, term2235.getClass(), "out", null);
        setIntElement(term2236, 0, 107945604);
        setIntElement(term2236, 1, -1963464809);
        setIntElement(term2236, 2, 71190297);
        setIntElement(term2236, 3, 1202361360);
        setIntElement(term2236, 4, -2015048153);
        setField(term2235, term2235.getClass(), "stack", term2236);
        setIntField(term2235, term2235.getClass(), "stackSize", -2063457669);
        setField(term2235, term2235.getClass(), "indent", "cAPeiZHKGJ");
        setField(term2235, term2235.getClass(), "separator", "LvJFtLBaxj");
        setBooleanField(term2235, term2235.getClass(), "lenient", true);
        setBooleanField(term2235, term2235.getClass(), "htmlSafe", false);
        setField(term2235, term2235.getClass(), "deferredName", "PHvxnGHptP");
        setBooleanField(term2235, term2235.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "flush", argTypes, term2235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


