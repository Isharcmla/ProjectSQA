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

public class JsonTreeWriter_endArray_32304472638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2499;

    public JsonTreeWriter_endArray_32304472638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2499 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term2499, term2499.getClass(), "stack", null);
        setField(term2499, term2499.getClass(), "pendingName", null);
        setField(term2499, term2499.getClass(), "product", null);
        setField(term2499, term2499.getClass(), "out", null);
        setField(term2499, term2499.getClass(), "stack", null);
        setIntField(term2499, term2499.getClass(), "stackSize", 0);
        setField(term2499, term2499.getClass(), "indent", null);
        setField(term2499, term2499.getClass(), "separator", null);
        setBooleanField(term2499, term2499.getClass(), "lenient", false);
        setBooleanField(term2499, term2499.getClass(), "htmlSafe", false);
        setField(term2499, term2499.getClass(), "deferredName", null);
        setBooleanField(term2499, term2499.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term2499, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


