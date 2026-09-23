package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;

public class JsonTreeWriter_value_79057841479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12204;
     Object term12255;
     Object term12249;

    public JsonTreeWriter_value_79057841479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12204 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term12204, term12204.getClass(), "pendingName", "");
        term12255 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term12255, term12255.getClass(), "stack", null);
        setField(term12255, term12255.getClass(), "pendingName", null);
        setField(term12255, term12255.getClass(), "product", null);
        setField(term12255, term12255.getClass(), "out", null);
        setField(term12255, term12255.getClass(), "stack", null);
        setIntField(term12255, term12255.getClass(), "stackSize", 0);
        setField(term12255, term12255.getClass(), "indent", null);
        setField(term12255, term12255.getClass(), "separator", null);
        setBooleanField(term12255, term12255.getClass(), "lenient", false);
        setBooleanField(term12255, term12255.getClass(), "htmlSafe", false);
        setField(term12255, term12255.getClass(), "deferredName", null);
        setBooleanField(term12255, term12255.getClass(), "serializeNulls", false);
        term12249 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term12249, term12249.getClass(), "stack", null);
        setField(term12249, term12249.getClass(), "pendingName", null);
        setField(term12249, term12249.getClass(), "product", null);
        setField(term12249, term12249.getClass(), "out", null);
        setField(term12249, term12249.getClass(), "stack", null);
        setIntField(term12249, term12249.getClass(), "stackSize", 0);
        setField(term12249, term12249.getClass(), "indent", null);
        setField(term12249, term12249.getClass(), "separator", null);
        setBooleanField(term12249, term12249.getClass(), "lenient", false);
        setBooleanField(term12249, term12249.getClass(), "htmlSafe", false);
        setField(term12249, term12249.getClass(), "deferredName", null);
        setBooleanField(term12249, term12249.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term12204, args);
        assertTrue(recursiveEquals(term12204, term12255));
        assertTrue(recursiveEquals(retValue, term12249));
    }

};


