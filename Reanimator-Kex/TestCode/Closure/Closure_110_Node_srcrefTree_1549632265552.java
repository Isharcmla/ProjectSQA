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

public class Node_srcrefTree_1549632265552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45428;
     Object term45834;
     Object term45836;
     Object term45800;

    public Node_srcrefTree_1549632265552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45482 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term45428, term45428.getClass(), "propListHead", term45482);
        term45834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45835 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term45834, term45834.getClass(), "type", 0);
        setField(term45834, term45834.getClass(), "next", null);
        setField(term45834, term45834.getClass(), "first", null);
        setField(term45834, term45834.getClass(), "last", null);
        setField(term45835, term45835.getClass(), "objectValue", null);
        setField(term45835, term45835.getClass(), "next", null);
        setIntField(term45835, term45835.getClass(), "propType", 0);
        setField(term45834, term45834.getClass(), "propListHead", term45835);
        setIntField(term45834, term45834.getClass(), "sourcePosition", 0);
        setField(term45834, term45834.getClass(), "jsType", null);
        setField(term45834, term45834.getClass(), "parent", null);
        term45836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45837 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term45836, term45836.getClass(), "type", 0);
        setField(term45836, term45836.getClass(), "next", null);
        setField(term45836, term45836.getClass(), "first", null);
        setField(term45836, term45836.getClass(), "last", null);
        setField(term45837, term45837.getClass(), "objectValue", null);
        setField(term45837, term45837.getClass(), "next", null);
        setIntField(term45837, term45837.getClass(), "propType", 0);
        setField(term45836, term45836.getClass(), "propListHead", term45837);
        setIntField(term45836, term45836.getClass(), "sourcePosition", 0);
        setField(term45836, term45836.getClass(), "jsType", null);
        setField(term45836, term45836.getClass(), "parent", null);
        term45800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45802 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term45800, term45800.getClass(), "type", 0);
        setField(term45800, term45800.getClass(), "next", null);
        setField(term45800, term45800.getClass(), "first", null);
        setField(term45800, term45800.getClass(), "last", null);
        setField(term45802, term45802.getClass(), "objectValue", null);
        setField(term45802, term45802.getClass(), "next", null);
        setIntField(term45802, term45802.getClass(), "propType", 0);
        setField(term45800, term45800.getClass(), "propListHead", term45802);
        setIntField(term45800, term45800.getClass(), "sourcePosition", 0);
        setField(term45800, term45800.getClass(), "jsType", null);
        setField(term45800, term45800.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45428;
        Object retValue = callMethod(klass, "srcrefTree", argTypes, term45428, args);
        assertTrue(recursiveEquals(term45428, term45834));
        assertTrue(recursiveEquals(term45428, term45836));
        assertTrue(recursiveEquals(retValue, term45800));
    }

};


