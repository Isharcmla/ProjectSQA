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
import java.lang.Boolean;

public class JsonTreeWriter_value_106158887544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2529;
     Object term2534;

    public JsonTreeWriter_value_106158887544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2529 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term2529, term2529.getClass(), "stack", null);
        setField(term2529, term2529.getClass(), "pendingName", null);
        setField(term2529, term2529.getClass(), "product", null);
        setField(term2529, term2529.getClass(), "out", null);
        setField(term2529, term2529.getClass(), "stack", null);
        setIntField(term2529, term2529.getClass(), "stackSize", 0);
        setField(term2529, term2529.getClass(), "indent", null);
        setField(term2529, term2529.getClass(), "separator", null);
        setBooleanField(term2529, term2529.getClass(), "lenient", false);
        setBooleanField(term2529, term2529.getClass(), "htmlSafe", false);
        setField(term2529, term2529.getClass(), "deferredName", null);
        setBooleanField(term2529, term2529.getClass(), "serializeNulls", false);
        term2534 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2534;
        try {
            callMethod(klass, "value", argTypes, term2529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


