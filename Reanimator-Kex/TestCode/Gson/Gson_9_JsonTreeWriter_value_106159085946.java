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
import java.lang.Long;

public class JsonTreeWriter_value_106159085946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2543;
     Object term2548;

    public JsonTreeWriter_value_106159085946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2543 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term2543, term2543.getClass(), "stack", null);
        setField(term2543, term2543.getClass(), "pendingName", null);
        setField(term2543, term2543.getClass(), "product", null);
        setField(term2543, term2543.getClass(), "out", null);
        setField(term2543, term2543.getClass(), "stack", null);
        setIntField(term2543, term2543.getClass(), "stackSize", 0);
        setField(term2543, term2543.getClass(), "indent", null);
        setField(term2543, term2543.getClass(), "separator", null);
        setBooleanField(term2543, term2543.getClass(), "lenient", false);
        setBooleanField(term2543, term2543.getClass(), "htmlSafe", false);
        setField(term2543, term2543.getClass(), "deferredName", null);
        setBooleanField(term2543, term2543.getClass(), "serializeNulls", false);
        term2548 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2548;
        try {
            callMethod(klass, "value", argTypes, term2543, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


