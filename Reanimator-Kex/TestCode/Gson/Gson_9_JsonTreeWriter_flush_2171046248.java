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

public class JsonTreeWriter_flush_2171046248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2555;
     Object term6147;

    public JsonTreeWriter_flush_2171046248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2555 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term2555, term2555.getClass(), "stack", null);
        setField(term2555, term2555.getClass(), "pendingName", null);
        setField(term2555, term2555.getClass(), "product", null);
        setField(term2555, term2555.getClass(), "out", null);
        setField(term2555, term2555.getClass(), "stack", null);
        setIntField(term2555, term2555.getClass(), "stackSize", 0);
        setField(term2555, term2555.getClass(), "indent", null);
        setField(term2555, term2555.getClass(), "separator", null);
        setBooleanField(term2555, term2555.getClass(), "lenient", false);
        setBooleanField(term2555, term2555.getClass(), "htmlSafe", false);
        setField(term2555, term2555.getClass(), "deferredName", null);
        setBooleanField(term2555, term2555.getClass(), "serializeNulls", false);
        term6147 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term6147, term6147.getClass(), "stack", null);
        setField(term6147, term6147.getClass(), "pendingName", null);
        setField(term6147, term6147.getClass(), "product", null);
        setField(term6147, term6147.getClass(), "out", null);
        setField(term6147, term6147.getClass(), "stack", null);
        setIntField(term6147, term6147.getClass(), "stackSize", 0);
        setField(term6147, term6147.getClass(), "indent", null);
        setField(term6147, term6147.getClass(), "separator", null);
        setBooleanField(term6147, term6147.getClass(), "lenient", false);
        setBooleanField(term6147, term6147.getClass(), "htmlSafe", false);
        setField(term6147, term6147.getClass(), "deferredName", null);
        setBooleanField(term6147, term6147.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term2555, args);
        assertTrue(recursiveEquals(term2555, term6147));
    }

};


