package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120982;
     Object term121212;
     Object term121166;
     Object term121831;
     Object term121832;
     Object term121833;

    public ReferenceCollectingCallback_visit_872273174487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120982 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term121212 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term121212, term121212.getClass(), "type", 108);
        term121166 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term121166, term121166.getClass(), "type", 108);
        setField(term121166, term121166.getClass(), "first", term121212);
        term121831 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term121831, term121831.getClass(), "referenceMap", null);
        setField(term121831, term121831.getClass(), "blockStack", null);
        setField(term121831, term121831.getClass(), "behavior", null);
        setField(term121831, term121831.getClass(), "compiler", null);
        setField(term121831, term121831.getClass(), "varFilter", null);
        term121832 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term121832, term121832.getClass(), "number", 0.0);
        setIntField(term121832, term121832.getClass(), "type", 108);
        setField(term121832, term121832.getClass(), "next", null);
        setField(term121832, term121832.getClass(), "first", null);
        setField(term121832, term121832.getClass(), "last", null);
        setField(term121832, term121832.getClass(), "propListHead", null);
        setIntField(term121832, term121832.getClass(), "sourcePosition", 0);
        setField(term121832, term121832.getClass(), "jsType", null);
        setField(term121832, term121832.getClass(), "parent", null);
        term121833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121834 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term121833, term121833.getClass(), "number", 0.0);
        setIntField(term121833, term121833.getClass(), "type", 108);
        setField(term121833, term121833.getClass(), "next", null);
        setDoubleField(term121834, term121834.getClass(), "number", 0.0);
        setIntField(term121834, term121834.getClass(), "type", 108);
        setField(term121834, term121834.getClass(), "next", null);
        setField(term121834, term121834.getClass(), "first", null);
        setField(term121834, term121834.getClass(), "last", null);
        setField(term121834, term121834.getClass(), "propListHead", null);
        setIntField(term121834, term121834.getClass(), "sourcePosition", 0);
        setField(term121834, term121834.getClass(), "jsType", null);
        setField(term121834, term121834.getClass(), "parent", null);
        setField(term121833, term121833.getClass(), "first", term121834);
        setField(term121833, term121833.getClass(), "last", null);
        setField(term121833, term121833.getClass(), "propListHead", null);
        setIntField(term121833, term121833.getClass(), "sourcePosition", 0);
        setField(term121833, term121833.getClass(), "jsType", null);
        setField(term121833, term121833.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term121212;
        args[2] = term121166;
        callMethod(klass, "visit", argTypes, term120982, args);
        assertTrue(recursiveEquals(term120982, term121831));
        assertTrue(recursiveEquals(term121212, term121833));
        assertTrue(recursiveEquals(term121166, null));
    }

};


