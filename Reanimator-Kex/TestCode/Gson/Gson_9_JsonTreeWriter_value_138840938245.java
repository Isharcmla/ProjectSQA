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
import java.lang.Double;

public class JsonTreeWriter_value_138840938245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2536;
     Object term2541;

    public JsonTreeWriter_value_138840938245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2536 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term2536, term2536.getClass(), "stack", null);
        setField(term2536, term2536.getClass(), "pendingName", null);
        setField(term2536, term2536.getClass(), "product", null);
        setField(term2536, term2536.getClass(), "out", null);
        setField(term2536, term2536.getClass(), "stack", null);
        setIntField(term2536, term2536.getClass(), "stackSize", 0);
        setField(term2536, term2536.getClass(), "indent", null);
        setField(term2536, term2536.getClass(), "separator", null);
        setBooleanField(term2536, term2536.getClass(), "lenient", false);
        setBooleanField(term2536, term2536.getClass(), "htmlSafe", false);
        setField(term2536, term2536.getClass(), "deferredName", null);
        setBooleanField(term2536, term2536.getClass(), "serializeNulls", false);
        term2541 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term2541;
        try {
            callMethod(klass, "value", argTypes, term2536, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


