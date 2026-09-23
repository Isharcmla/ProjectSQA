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
import java.lang.NullPointerException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonTreeWriter_value_79057841447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2550;

    public JsonTreeWriter_value_79057841447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2550 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term2550, term2550.getClass(), "stack", null);
        setField(term2550, term2550.getClass(), "pendingName", null);
        setField(term2550, term2550.getClass(), "product", null);
        setField(term2550, term2550.getClass(), "out", null);
        setField(term2550, term2550.getClass(), "stack", null);
        setIntField(term2550, term2550.getClass(), "stackSize", 0);
        setField(term2550, term2550.getClass(), "indent", null);
        setField(term2550, term2550.getClass(), "separator", null);
        setBooleanField(term2550, term2550.getClass(), "lenient", false);
        setBooleanField(term2550, term2550.getClass(), "htmlSafe", false);
        setField(term2550, term2550.getClass(), "deferredName", null);
        setBooleanField(term2550, term2550.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "value", argTypes, term2550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


