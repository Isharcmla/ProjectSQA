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

public class JsonTreeWriter_value_90933482273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11468;
     Object term11519;
     Object term11513;

    public JsonTreeWriter_value_90933482273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11468 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term11468, term11468.getClass(), "pendingName", "");
        term11519 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term11519, term11519.getClass(), "stack", null);
        setField(term11519, term11519.getClass(), "pendingName", null);
        setField(term11519, term11519.getClass(), "product", null);
        setField(term11519, term11519.getClass(), "out", null);
        setField(term11519, term11519.getClass(), "stack", null);
        setIntField(term11519, term11519.getClass(), "stackSize", 0);
        setField(term11519, term11519.getClass(), "indent", null);
        setField(term11519, term11519.getClass(), "separator", null);
        setBooleanField(term11519, term11519.getClass(), "lenient", false);
        setBooleanField(term11519, term11519.getClass(), "htmlSafe", false);
        setField(term11519, term11519.getClass(), "deferredName", null);
        setBooleanField(term11519, term11519.getClass(), "serializeNulls", false);
        term11513 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term11513, term11513.getClass(), "stack", null);
        setField(term11513, term11513.getClass(), "pendingName", null);
        setField(term11513, term11513.getClass(), "product", null);
        setField(term11513, term11513.getClass(), "out", null);
        setField(term11513, term11513.getClass(), "stack", null);
        setIntField(term11513, term11513.getClass(), "stackSize", 0);
        setField(term11513, term11513.getClass(), "indent", null);
        setField(term11513, term11513.getClass(), "separator", null);
        setBooleanField(term11513, term11513.getClass(), "lenient", false);
        setBooleanField(term11513, term11513.getClass(), "htmlSafe", false);
        setField(term11513, term11513.getClass(), "deferredName", null);
        setBooleanField(term11513, term11513.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term11468, args);
        assertTrue(recursiveEquals(term11468, term11519));
        assertTrue(recursiveEquals(retValue, term11513));
    }

};


