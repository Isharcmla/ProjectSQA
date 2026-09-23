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
import java.util.ArrayList;
import java.lang.Object;

public class JsonWriter_value_1296217067519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387147;
     Object term388133;

    public JsonWriter_value_1296217067519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term387199 = new ArrayList();
        term387147 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term387147, term387147.getClass(), "pendingName", null);
        setField(term387147, term387147.getClass(), "stack", term387199);
        ArrayList term388134 = new ArrayList();
        term388133 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term388136 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term388133, term388133.getClass(), "stack", term388134);
        setField(term388133, term388133.getClass(), "pendingName", null);
        setField(term388133, term388133.getClass(), "product", term388136);
        setField(term388133, term388133.getClass(), "out", null);
        setField(term388133, term388133.getClass(), "stack", null);
        setIntField(term388133, term388133.getClass(), "stackSize", 0);
        setField(term388133, term388133.getClass(), "indent", null);
        setField(term388133, term388133.getClass(), "separator", null);
        setBooleanField(term388133, term388133.getClass(), "lenient", false);
        setBooleanField(term388133, term388133.getClass(), "htmlSafe", false);
        setField(term388133, term388133.getClass(), "deferredName", null);
        setBooleanField(term388133, term388133.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "value", argTypes, term387147, args);
        assertTrue(recursiveEquals(term387147, term388133));
    }

};


