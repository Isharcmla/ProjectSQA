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
import java.util.ArrayList;
import java.lang.Object;

public class JsonTreeWriter_close_160520178285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13469;
     Object term13534;

    public JsonTreeWriter_close_160520178285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13521 = new ArrayList();
        term13469 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term13469, term13469.getClass(), "stack", term13521);
        Object term13537 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term13537, term13537.getClass(), "value", "");
        ArrayList term13535 = new ArrayList();
        ((ArrayList) term13535).add(term13537);
        term13534 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term13534, term13534.getClass(), "stack", term13535);
        setField(term13534, term13534.getClass(), "pendingName", null);
        setField(term13534, term13534.getClass(), "product", null);
        setField(term13534, term13534.getClass(), "out", null);
        setField(term13534, term13534.getClass(), "stack", null);
        setIntField(term13534, term13534.getClass(), "stackSize", 0);
        setField(term13534, term13534.getClass(), "indent", null);
        setField(term13534, term13534.getClass(), "separator", null);
        setBooleanField(term13534, term13534.getClass(), "lenient", false);
        setBooleanField(term13534, term13534.getClass(), "htmlSafe", false);
        setField(term13534, term13534.getClass(), "deferredName", null);
        setBooleanField(term13534, term13534.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term13469, args);
        assertTrue(recursiveEquals(term13469, term13534));
    }

};


