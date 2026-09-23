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
import java.lang.ClassCastException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class JsonTreeWriter_value_1061588875206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42347;

    public JsonTreeWriter_value_1061588875206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class term42435 =  Class.forName((String) "kex.java.util.concurrent.atomic.AtomicIntegerArray");
        ArrayList term42399 = new ArrayList();
        ((ArrayList) term42399).add((Object)null);
        ((ArrayList) term42399).add(term42435);
        ((ArrayList) term42399).add(term42435);
        ((ArrayList) term42399).add(term42435);
        ((ArrayList) term42399).add(term42435);
        ((ArrayList) term42399).add(term42435);
        ((ArrayList) term42399).add(term42435);
        ((ArrayList) term42399).add(term42435);
        term42347 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term42347, term42347.getClass(), "pendingName", null);
        setField(term42347, term42347.getClass(), "stack", term42399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "value", argTypes, term42347, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


