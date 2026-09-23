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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;

public class JsonWriter_beforeName_1433433393203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73530;
     Object term73820;

    public JsonWriter_beforeName_1433433393203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73530 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term73431 = (int[]) newIntArray(8);
        setIntField(term73530, term73530.getClass(), "stackSize", 8);
        setIntElement(term73431, 0, 3);
        setIntElement(term73431, 1, 3);
        setIntElement(term73431, 2, 3);
        setIntElement(term73431, 3, 3);
        setIntElement(term73431, 4, 3);
        setIntElement(term73431, 5, 3);
        setIntElement(term73431, 6, 3);
        setIntElement(term73431, 7, 3);
        setField(term73530, term73530.getClass(), "stack", term73431);
        term73820 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term73821 = (int[]) newIntArray(8);
        setField(term73820, term73820.getClass(), "out", null);
        setIntElement(term73821, 0, 3);
        setIntElement(term73821, 1, 3);
        setIntElement(term73821, 2, 3);
        setIntElement(term73821, 3, 3);
        setIntElement(term73821, 4, 3);
        setIntElement(term73821, 5, 3);
        setIntElement(term73821, 6, 3);
        setIntElement(term73821, 7, 4);
        setField(term73820, term73820.getClass(), "stack", term73821);
        setIntField(term73820, term73820.getClass(), "stackSize", 8);
        setField(term73820, term73820.getClass(), "indent", null);
        setField(term73820, term73820.getClass(), "separator", null);
        setBooleanField(term73820, term73820.getClass(), "lenient", false);
        setBooleanField(term73820, term73820.getClass(), "htmlSafe", false);
        setField(term73820, term73820.getClass(), "deferredName", null);
        setBooleanField(term73820, term73820.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforeName", argTypes, term73530, args);
        assertTrue(recursiveEquals(term73530, term73820));
    }

};


