package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class Node_getSideEffectFlags_1336245615494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39482;
     Object term39606;

    public Node_getSideEffectFlags_1336245615494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39590 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term39482, term39482.getClass(), "propListHead", term39590);
        term39606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39607 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term39606, term39606.getClass(), "type", 0);
        setField(term39606, term39606.getClass(), "next", null);
        setField(term39606, term39606.getClass(), "first", null);
        setField(term39606, term39606.getClass(), "last", null);
        setField(term39607, term39607.getClass(), "objectValue", null);
        setField(term39607, term39607.getClass(), "next", null);
        setIntField(term39607, term39607.getClass(), "propType", 0);
        setField(term39606, term39606.getClass(), "propListHead", term39607);
        setIntField(term39606, term39606.getClass(), "sourcePosition", 0);
        setField(term39606, term39606.getClass(), "jsType", null);
        setField(term39606, term39606.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSideEffectFlags", argTypes, term39482, args);
        assertTrue(recursiveEquals(term39482, term39606));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


