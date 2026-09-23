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
import java.lang.Long;

public class JsonWriter_value_102520462258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2067;
     Object term2114;

    public JsonWriter_value_102520462258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2067 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2068 = (int[]) newIntArray(5);
        setField(term2067, term2067.getClass(), "out", null);
        setIntElement(term2068, 0, 1072005683);
        setIntElement(term2068, 1, 1861318859);
        setIntElement(term2068, 2, 1474524152);
        setIntElement(term2068, 3, 568954359);
        setIntElement(term2068, 4, 53410913);
        setField(term2067, term2067.getClass(), "stack", term2068);
        setIntField(term2067, term2067.getClass(), "stackSize", -375014958);
        setField(term2067, term2067.getClass(), "indent", "OWKQODBLzb");
        setField(term2067, term2067.getClass(), "separator", "wGmYcqUkgE");
        setBooleanField(term2067, term2067.getClass(), "lenient", true);
        setBooleanField(term2067, term2067.getClass(), "htmlSafe", false);
        setField(term2067, term2067.getClass(), "deferredName", "idgaQsnJpQ");
        setBooleanField(term2067, term2067.getClass(), "serializeNulls", false);
        term2114 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2114;
        try {
            callMethod(klass, "value", argTypes, term2067, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


