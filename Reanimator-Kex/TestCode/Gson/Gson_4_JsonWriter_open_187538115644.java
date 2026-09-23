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

public class JsonWriter_open_187538115644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911;
     Object term958;

    public JsonWriter_open_187538115644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term911 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term912 = (int[]) newIntArray(5);
        setField(term911, term911.getClass(), "out", null);
        setIntElement(term912, 0, 458147407);
        setIntElement(term912, 1, -184153539);
        setIntElement(term912, 2, 493620644);
        setIntElement(term912, 3, 1328271830);
        setIntElement(term912, 4, 1596070772);
        setField(term911, term911.getClass(), "stack", term912);
        setIntField(term911, term911.getClass(), "stackSize", 97029295);
        setField(term911, term911.getClass(), "indent", "kuTXqwMtDB");
        setField(term911, term911.getClass(), "separator", "Ghbwtircqb");
        setBooleanField(term911, term911.getClass(), "lenient", true);
        setBooleanField(term911, term911.getClass(), "htmlSafe", true);
        setField(term911, term911.getClass(), "deferredName", "xrwlQZdwCp");
        setBooleanField(term911, term911.getClass(), "serializeNulls", true);
        term958 = new Integer(-1371869594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term958;
        args[1] = "IDCWpPLRkE";
        try {
            callMethod(klass, "open", argTypes, term911, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


