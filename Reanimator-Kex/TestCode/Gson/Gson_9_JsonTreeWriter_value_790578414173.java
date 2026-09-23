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
import java.lang.Float;
import java.lang.Object;

public class JsonTreeWriter_value_790578414173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38022;
     Object term38118;
     Object term38148;
     Object term38153;
     Object term38122;

    public JsonTreeWriter_value_790578414173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38074 = new ArrayList();
        term38022 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setBooleanField(term38022, term38022.getClass(), "lenient", false);
        setField(term38022, term38022.getClass(), "pendingName", null);
        setField(term38022, term38022.getClass(), "stack", term38074);
        term38118 = new Float(0.0F);
        ArrayList term38149 = new ArrayList();
        Float term38152 = new Float(0.0F);
        term38148 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term38151 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term38148, term38148.getClass(), "stack", term38149);
        setField(term38148, term38148.getClass(), "pendingName", null);
        setField(term38151, term38151.getClass(), "value", term38152);
        setField(term38148, term38148.getClass(), "product", term38151);
        setField(term38148, term38148.getClass(), "out", null);
        setField(term38148, term38148.getClass(), "stack", null);
        setIntField(term38148, term38148.getClass(), "stackSize", 0);
        setField(term38148, term38148.getClass(), "indent", null);
        setField(term38148, term38148.getClass(), "separator", null);
        setBooleanField(term38148, term38148.getClass(), "lenient", false);
        setBooleanField(term38148, term38148.getClass(), "htmlSafe", false);
        setField(term38148, term38148.getClass(), "deferredName", null);
        setBooleanField(term38148, term38148.getClass(), "serializeNulls", false);
        term38153 = new Float(0.0F);
        ArrayList term38123 = new ArrayList();
        Float term38128 = new Float(0.0F);
        term38122 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term38127 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term38122, term38122.getClass(), "stack", term38123);
        setField(term38122, term38122.getClass(), "pendingName", null);
        setField(term38127, term38127.getClass(), "value", term38128);
        setField(term38122, term38122.getClass(), "product", term38127);
        setField(term38122, term38122.getClass(), "out", null);
        setField(term38122, term38122.getClass(), "stack", null);
        setIntField(term38122, term38122.getClass(), "stackSize", 0);
        setField(term38122, term38122.getClass(), "indent", null);
        setField(term38122, term38122.getClass(), "separator", null);
        setBooleanField(term38122, term38122.getClass(), "lenient", false);
        setBooleanField(term38122, term38122.getClass(), "htmlSafe", false);
        setField(term38122, term38122.getClass(), "deferredName", null);
        setBooleanField(term38122, term38122.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = term38118;
        Object retValue = callMethod(klass, "value", argTypes, term38022, args);
        assertTrue(recursiveEquals(term38022, term38148));
        assertTrue(recursiveEquals(term38118, term38153));
        assertTrue(recursiveEquals(retValue, term38122));
    }

};


