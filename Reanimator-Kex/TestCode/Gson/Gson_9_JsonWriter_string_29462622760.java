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

public class JsonWriter_string_29462622760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2315;

    public JsonWriter_string_29462622760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2315 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2316 = (int[]) newIntArray(3);
        setField(term2315, term2315.getClass(), "out", null);
        setIntElement(term2316, 0, -1222006000);
        setIntElement(term2316, 1, 2095798786);
        setIntElement(term2316, 2, -1565502840);
        setField(term2315, term2315.getClass(), "stack", term2316);
        setIntField(term2315, term2315.getClass(), "stackSize", 344323424);
        setField(term2315, term2315.getClass(), "indent", "TimdotUuNC");
        setField(term2315, term2315.getClass(), "separator", "PkWMRdJcBb");
        setBooleanField(term2315, term2315.getClass(), "lenient", false);
        setBooleanField(term2315, term2315.getClass(), "htmlSafe", true);
        setField(term2315, term2315.getClass(), "deferredName", "jSpAteRute");
        setBooleanField(term2315, term2315.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        try {
            callMethod(klass, "string", argTypes, term2315, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


