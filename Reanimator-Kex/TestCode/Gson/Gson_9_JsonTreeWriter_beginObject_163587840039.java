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

public class JsonTreeWriter_beginObject_163587840039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2504;

    public JsonTreeWriter_beginObject_163587840039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2504 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term2504, term2504.getClass(), "stack", null);
        setField(term2504, term2504.getClass(), "pendingName", null);
        setField(term2504, term2504.getClass(), "product", null);
        setField(term2504, term2504.getClass(), "out", null);
        setField(term2504, term2504.getClass(), "stack", null);
        setIntField(term2504, term2504.getClass(), "stackSize", 0);
        setField(term2504, term2504.getClass(), "indent", null);
        setField(term2504, term2504.getClass(), "separator", null);
        setBooleanField(term2504, term2504.getClass(), "lenient", false);
        setBooleanField(term2504, term2504.getClass(), "htmlSafe", false);
        setField(term2504, term2504.getClass(), "deferredName", null);
        setBooleanField(term2504, term2504.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term2504, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


