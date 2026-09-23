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

public class JsonTreeWriter_close_160520178249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2560;

    public JsonTreeWriter_close_160520178249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2560 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term2560, term2560.getClass(), "stack", null);
        setField(term2560, term2560.getClass(), "pendingName", null);
        setField(term2560, term2560.getClass(), "product", null);
        setField(term2560, term2560.getClass(), "out", null);
        setField(term2560, term2560.getClass(), "stack", null);
        setIntField(term2560, term2560.getClass(), "stackSize", 0);
        setField(term2560, term2560.getClass(), "indent", null);
        setField(term2560, term2560.getClass(), "separator", null);
        setBooleanField(term2560, term2560.getClass(), "lenient", false);
        setBooleanField(term2560, term2560.getClass(), "htmlSafe", false);
        setField(term2560, term2560.getClass(), "deferredName", null);
        setBooleanField(term2560, term2560.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term2560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


