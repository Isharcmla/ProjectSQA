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

public class ReferenceCollectingCallback_visit_872273174103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21990;
     Object term22220;
     Object term22174;
     Object term22836;
     Object term22837;
     Object term22838;

    public ReferenceCollectingCallback_visit_872273174103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21990 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term22220 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term22220, term22220.getClass(), "type", 101);
        term22174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term22174, term22174.getClass(), "type", 101);
        setField(term22174, term22174.getClass(), "first", term22220);
        term22836 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term22836, term22836.getClass(), "referenceMap", null);
        setField(term22836, term22836.getClass(), "blockStack", null);
        setField(term22836, term22836.getClass(), "behavior", null);
        setField(term22836, term22836.getClass(), "compiler", null);
        setField(term22836, term22836.getClass(), "varFilter", null);
        term22837 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term22837, term22837.getClass(), "str", null);
        setIntField(term22837, term22837.getClass(), "type", 101);
        setField(term22837, term22837.getClass(), "next", null);
        setField(term22837, term22837.getClass(), "first", null);
        setField(term22837, term22837.getClass(), "last", null);
        setField(term22837, term22837.getClass(), "propListHead", null);
        setIntField(term22837, term22837.getClass(), "sourcePosition", 0);
        setField(term22837, term22837.getClass(), "jsType", null);
        setField(term22837, term22837.getClass(), "parent", null);
        term22838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term22839 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term22838, term22838.getClass(), "str", null);
        setIntField(term22838, term22838.getClass(), "type", 101);
        setField(term22838, term22838.getClass(), "next", null);
        setField(term22839, term22839.getClass(), "str", null);
        setIntField(term22839, term22839.getClass(), "type", 101);
        setField(term22839, term22839.getClass(), "next", null);
        setField(term22839, term22839.getClass(), "first", null);
        setField(term22839, term22839.getClass(), "last", null);
        setField(term22839, term22839.getClass(), "propListHead", null);
        setIntField(term22839, term22839.getClass(), "sourcePosition", 0);
        setField(term22839, term22839.getClass(), "jsType", null);
        setField(term22839, term22839.getClass(), "parent", null);
        setField(term22838, term22838.getClass(), "first", term22839);
        setField(term22838, term22838.getClass(), "last", null);
        setField(term22838, term22838.getClass(), "propListHead", null);
        setIntField(term22838, term22838.getClass(), "sourcePosition", 0);
        setField(term22838, term22838.getClass(), "jsType", null);
        setField(term22838, term22838.getClass(), "parent", null);
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
        args[1] = term22220;
        args[2] = term22174;
        callMethod(klass, "visit", argTypes, term21990, args);
        assertTrue(recursiveEquals(term21990, term22836));
        assertTrue(recursiveEquals(term22220, term22838));
        assertTrue(recursiveEquals(term22174, null));
    }

};


