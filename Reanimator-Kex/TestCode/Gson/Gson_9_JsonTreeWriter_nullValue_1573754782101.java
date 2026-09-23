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

public class JsonTreeWriter_nullValue_1573754782101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17225;
     Object term17275;
     Object term17269;

    public JsonTreeWriter_nullValue_1573754782101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17225 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term17225, term17225.getClass(), "pendingName", "");
        term17275 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term17275, term17275.getClass(), "stack", null);
        setField(term17275, term17275.getClass(), "pendingName", null);
        setField(term17275, term17275.getClass(), "product", null);
        setField(term17275, term17275.getClass(), "out", null);
        setField(term17275, term17275.getClass(), "stack", null);
        setIntField(term17275, term17275.getClass(), "stackSize", 0);
        setField(term17275, term17275.getClass(), "indent", null);
        setField(term17275, term17275.getClass(), "separator", null);
        setBooleanField(term17275, term17275.getClass(), "lenient", false);
        setBooleanField(term17275, term17275.getClass(), "htmlSafe", false);
        setField(term17275, term17275.getClass(), "deferredName", null);
        setBooleanField(term17275, term17275.getClass(), "serializeNulls", false);
        term17269 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term17269, term17269.getClass(), "stack", null);
        setField(term17269, term17269.getClass(), "pendingName", null);
        setField(term17269, term17269.getClass(), "product", null);
        setField(term17269, term17269.getClass(), "out", null);
        setField(term17269, term17269.getClass(), "stack", null);
        setIntField(term17269, term17269.getClass(), "stackSize", 0);
        setField(term17269, term17269.getClass(), "indent", null);
        setField(term17269, term17269.getClass(), "separator", null);
        setBooleanField(term17269, term17269.getClass(), "lenient", false);
        setBooleanField(term17269, term17269.getClass(), "htmlSafe", false);
        setField(term17269, term17269.getClass(), "deferredName", null);
        setBooleanField(term17269, term17269.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nullValue", argTypes, term17225, args);
        assertTrue(recursiveEquals(term17225, term17275));
        assertTrue(recursiveEquals(retValue, term17269));
    }

};


