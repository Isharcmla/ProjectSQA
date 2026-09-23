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

public class Node_getSourceOffset_714623852578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49505;
     Object term49753;

    public Node_getSourceOffset_714623852578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49613 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term49505, term49505.getClass(), "propListHead", term49613);
        term49753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49754 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term49753, term49753.getClass(), "type", 0);
        setField(term49753, term49753.getClass(), "next", null);
        setField(term49753, term49753.getClass(), "first", null);
        setField(term49753, term49753.getClass(), "last", null);
        setField(term49754, term49754.getClass(), "objectValue", null);
        setField(term49754, term49754.getClass(), "next", null);
        setIntField(term49754, term49754.getClass(), "propType", 0);
        setField(term49753, term49753.getClass(), "propListHead", term49754);
        setIntField(term49753, term49753.getClass(), "sourcePosition", 0);
        setField(term49753, term49753.getClass(), "jsType", null);
        setField(term49753, term49753.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSourceOffset", argTypes, term49505, args);
        assertTrue(recursiveEquals(term49505, term49753));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


