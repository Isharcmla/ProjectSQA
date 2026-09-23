package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class ConstructorConstructor_newUnsafeAllocator_107993886510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term1640;
     Object term1632;

    public ConstructorConstructor_newUnsafeAllocator_107993886510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term30 = new HashMap();
        term29 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term29, term29.getClass(), "instanceCreators", term30);
        HashMap term1641 = new HashMap();
        term1640 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term1640, term1640.getClass(), "instanceCreators", term1641);
        HashMap term1635 = new HashMap();
        term1632 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor$12"));
        Object term1633 = newInstance(Class.forName("com.google.gson.internal.UnsafeAllocator$4"));
        Object term1634 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term1632, term1632.getClass(), "unsafeAllocator", term1633);
        setField(term1632, term1632.getClass(), "val$rawType", null);
        setField(term1632, term1632.getClass(), "val$type", null);
        setField(term1634, term1634.getClass(), "instanceCreators", term1635);
        setField(term1632, term1632.getClass(), "this$0", term1634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "newUnsafeAllocator", argTypes, term29, args);
        assertTrue(recursiveEquals(term29, term1640));
        assertTrue(recursiveEquals(retValue, term1632));
    }

};


