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

public class Node_useSourceInfoIfMissingFrom_478015123512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41509;
     Object term41579;
     Object term41724;
     Object term41725;
     Object term41689;

    public Node_useSourceInfoIfMissingFrom_478015123512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term41509, term41509.getClass(), "propListHead", null);
        term41579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41687 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term41579, term41579.getClass(), "propListHead", term41687);
        term41724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41724, term41724.getClass(), "type", 0);
        setField(term41724, term41724.getClass(), "next", null);
        setField(term41724, term41724.getClass(), "first", null);
        setField(term41724, term41724.getClass(), "last", null);
        setField(term41724, term41724.getClass(), "propListHead", null);
        setIntField(term41724, term41724.getClass(), "sourcePosition", 0);
        setField(term41724, term41724.getClass(), "jsType", null);
        setField(term41724, term41724.getClass(), "parent", null);
        term41725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41726 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term41725, term41725.getClass(), "type", 0);
        setField(term41725, term41725.getClass(), "next", null);
        setField(term41725, term41725.getClass(), "first", null);
        setField(term41725, term41725.getClass(), "last", null);
        setField(term41726, term41726.getClass(), "objectValue", null);
        setField(term41726, term41726.getClass(), "next", null);
        setIntField(term41726, term41726.getClass(), "propType", 0);
        setField(term41725, term41725.getClass(), "propListHead", term41726);
        setIntField(term41725, term41725.getClass(), "sourcePosition", 0);
        setField(term41725, term41725.getClass(), "jsType", null);
        setField(term41725, term41725.getClass(), "parent", null);
        term41689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41689, term41689.getClass(), "type", 0);
        setField(term41689, term41689.getClass(), "next", null);
        setField(term41689, term41689.getClass(), "first", null);
        setField(term41689, term41689.getClass(), "last", null);
        setField(term41689, term41689.getClass(), "propListHead", null);
        setIntField(term41689, term41689.getClass(), "sourcePosition", 0);
        setField(term41689, term41689.getClass(), "jsType", null);
        setField(term41689, term41689.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41579;
        Object retValue = callMethod(klass, "useSourceInfoIfMissingFrom", argTypes, term41509, args);
        assertTrue(recursiveEquals(term41509, term41724));
        assertTrue(recursiveEquals(term41579, term41725));
        assertTrue(recursiveEquals(retValue, term41689));
    }

};


