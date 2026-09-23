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

public class ReferenceCollectingCallback_visit_872273174733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259796;
     Object term260026;
     Object term259980;
     Object term260062;
     Object term260063;
     Object term260064;

    public ReferenceCollectingCallback_visit_872273174733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259796 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term260026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term260026, term260026.getClass(), "type", 100);
        term259980 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term259980, term259980.getClass(), "type", 100);
        setField(term259980, term259980.getClass(), "first", term260026);
        term260062 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term260062, term260062.getClass(), "referenceMap", null);
        setField(term260062, term260062.getClass(), "blockStack", null);
        setField(term260062, term260062.getClass(), "behavior", null);
        setField(term260062, term260062.getClass(), "compiler", null);
        setField(term260062, term260062.getClass(), "varFilter", null);
        term260063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term260063, term260063.getClass(), "number", 0.0);
        setIntField(term260063, term260063.getClass(), "type", 100);
        setField(term260063, term260063.getClass(), "next", null);
        setField(term260063, term260063.getClass(), "first", null);
        setField(term260063, term260063.getClass(), "last", null);
        setField(term260063, term260063.getClass(), "propListHead", null);
        setIntField(term260063, term260063.getClass(), "sourcePosition", 0);
        setField(term260063, term260063.getClass(), "jsType", null);
        setField(term260063, term260063.getClass(), "parent", null);
        term260064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term260065 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term260064, term260064.getClass(), "str", null);
        setIntField(term260064, term260064.getClass(), "type", 100);
        setField(term260064, term260064.getClass(), "next", null);
        setDoubleField(term260065, term260065.getClass(), "number", 0.0);
        setIntField(term260065, term260065.getClass(), "type", 100);
        setField(term260065, term260065.getClass(), "next", null);
        setField(term260065, term260065.getClass(), "first", null);
        setField(term260065, term260065.getClass(), "last", null);
        setField(term260065, term260065.getClass(), "propListHead", null);
        setIntField(term260065, term260065.getClass(), "sourcePosition", 0);
        setField(term260065, term260065.getClass(), "jsType", null);
        setField(term260065, term260065.getClass(), "parent", null);
        setField(term260064, term260064.getClass(), "first", term260065);
        setField(term260064, term260064.getClass(), "last", null);
        setField(term260064, term260064.getClass(), "propListHead", null);
        setIntField(term260064, term260064.getClass(), "sourcePosition", 0);
        setField(term260064, term260064.getClass(), "jsType", null);
        setField(term260064, term260064.getClass(), "parent", null);
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
        args[1] = term260026;
        args[2] = term259980;
        callMethod(klass, "visit", argTypes, term259796, args);
        assertTrue(recursiveEquals(term259796, term260062));
        assertTrue(recursiveEquals(term260026, term260064));
        assertTrue(recursiveEquals(term259980, null));
    }

};


