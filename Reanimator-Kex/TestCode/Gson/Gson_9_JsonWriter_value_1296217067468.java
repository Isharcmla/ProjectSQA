package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;

public class JsonWriter_value_1296217067468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291213;
     Object term293641;

    public JsonWriter_value_1296217067468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291213 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term291213, term291213.getClass(), "pendingName", "");
        term293641 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term293641, term293641.getClass(), "stack", null);
        setField(term293641, term293641.getClass(), "pendingName", null);
        setField(term293641, term293641.getClass(), "product", null);
        setField(term293641, term293641.getClass(), "out", null);
        setField(term293641, term293641.getClass(), "stack", null);
        setIntField(term293641, term293641.getClass(), "stackSize", 0);
        setField(term293641, term293641.getClass(), "indent", null);
        setField(term293641, term293641.getClass(), "separator", null);
        setBooleanField(term293641, term293641.getClass(), "lenient", false);
        setBooleanField(term293641, term293641.getClass(), "htmlSafe", false);
        setField(term293641, term293641.getClass(), "deferredName", null);
        setBooleanField(term293641, term293641.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "value", argTypes, term291213, args);
        assertTrue(recursiveEquals(term291213, term293641));
    }

};


