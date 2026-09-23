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

public class JsonTreeWriter_nullValue_157375478243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2524;

    public JsonTreeWriter_nullValue_157375478243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2524 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term2524, term2524.getClass(), "stack", null);
        setField(term2524, term2524.getClass(), "pendingName", null);
        setField(term2524, term2524.getClass(), "product", null);
        setField(term2524, term2524.getClass(), "out", null);
        setField(term2524, term2524.getClass(), "stack", null);
        setIntField(term2524, term2524.getClass(), "stackSize", 0);
        setField(term2524, term2524.getClass(), "indent", null);
        setField(term2524, term2524.getClass(), "separator", null);
        setBooleanField(term2524, term2524.getClass(), "lenient", false);
        setBooleanField(term2524, term2524.getClass(), "htmlSafe", false);
        setField(term2524, term2524.getClass(), "deferredName", null);
        setBooleanField(term2524, term2524.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nullValue", argTypes, term2524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


