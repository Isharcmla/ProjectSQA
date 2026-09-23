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

public class JsonWriter_jsonValue_1831286341242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87930;
     Object term87982;
     Object term87977;

    public JsonWriter_jsonValue_1831286341242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87930 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term87930, term87930.getClass(), "deferredName", "");
        term87982 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term87982, term87982.getClass(), "out", null);
        setField(term87982, term87982.getClass(), "stack", null);
        setIntField(term87982, term87982.getClass(), "stackSize", 0);
        setField(term87982, term87982.getClass(), "indent", null);
        setField(term87982, term87982.getClass(), "separator", null);
        setBooleanField(term87982, term87982.getClass(), "lenient", false);
        setBooleanField(term87982, term87982.getClass(), "htmlSafe", false);
        setField(term87982, term87982.getClass(), "deferredName", null);
        setBooleanField(term87982, term87982.getClass(), "serializeNulls", false);
        term87977 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term87977, term87977.getClass(), "out", null);
        setField(term87977, term87977.getClass(), "stack", null);
        setIntField(term87977, term87977.getClass(), "stackSize", 0);
        setField(term87977, term87977.getClass(), "indent", null);
        setField(term87977, term87977.getClass(), "separator", null);
        setBooleanField(term87977, term87977.getClass(), "lenient", false);
        setBooleanField(term87977, term87977.getClass(), "htmlSafe", false);
        setField(term87977, term87977.getClass(), "deferredName", null);
        setBooleanField(term87977, term87977.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "jsonValue", argTypes, term87930, args);
        assertTrue(recursiveEquals(term87930, term87982));
        assertTrue(recursiveEquals(retValue, term87977));
    }

};


