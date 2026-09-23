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

public class JsonTreeWriter_beginArray_712666648380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90597;

    public JsonTreeWriter_beginArray_712666648380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term90757 = new ArrayList();
        Object term90705 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term90705, term90705.getClass(), "elements", term90757);
        ArrayList term90649 = new ArrayList();
        ((ArrayList) term90649).add((Object)null);
        ((ArrayList) term90649).add((Object)null);
        ((ArrayList) term90649).add((Object)null);
        ((ArrayList) term90649).add(term90705);
        term90597 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term90597, term90597.getClass(), "pendingName", null);
        setField(term90597, term90597.getClass(), "stack", term90649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "beginArray", argTypes, term90597, args);
        assertTrue(recursiveEquals(retValue, (byte) 32));
    }

};


