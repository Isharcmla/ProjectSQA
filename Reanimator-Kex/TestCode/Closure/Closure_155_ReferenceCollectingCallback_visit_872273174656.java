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

public class ReferenceCollectingCallback_visit_872273174656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172870;
     Object term173100;
     Object term173054;
     Object term173159;
     Object term173160;
     Object term173161;

    public ReferenceCollectingCallback_visit_872273174656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172870 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term173100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term173100, term173100.getClass(), "type", 0);
        term173054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term173054, term173054.getClass(), "type", 98);
        setField(term173054, term173054.getClass(), "first", term173100);
        term173159 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term173159, term173159.getClass(), "referenceMap", null);
        setField(term173159, term173159.getClass(), "blockStack", null);
        setField(term173159, term173159.getClass(), "behavior", null);
        setField(term173159, term173159.getClass(), "compiler", null);
        setField(term173159, term173159.getClass(), "varFilter", null);
        term173160 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term173160, term173160.getClass(), "str", null);
        setIntField(term173160, term173160.getClass(), "type", 0);
        setField(term173160, term173160.getClass(), "next", null);
        setField(term173160, term173160.getClass(), "first", null);
        setField(term173160, term173160.getClass(), "last", null);
        setField(term173160, term173160.getClass(), "propListHead", null);
        setIntField(term173160, term173160.getClass(), "sourcePosition", 0);
        setField(term173160, term173160.getClass(), "jsType", null);
        setField(term173160, term173160.getClass(), "parent", null);
        term173161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term173161, term173161.getClass(), "number", 0.0);
        setIntField(term173161, term173161.getClass(), "type", 98);
        setField(term173161, term173161.getClass(), "next", null);
        setField(term173162, term173162.getClass(), "str", null);
        setIntField(term173162, term173162.getClass(), "type", 0);
        setField(term173162, term173162.getClass(), "next", null);
        setField(term173162, term173162.getClass(), "first", null);
        setField(term173162, term173162.getClass(), "last", null);
        setField(term173162, term173162.getClass(), "propListHead", null);
        setIntField(term173162, term173162.getClass(), "sourcePosition", 0);
        setField(term173162, term173162.getClass(), "jsType", null);
        setField(term173162, term173162.getClass(), "parent", null);
        setField(term173161, term173161.getClass(), "first", term173162);
        setField(term173161, term173161.getClass(), "last", null);
        setField(term173161, term173161.getClass(), "propListHead", null);
        setIntField(term173161, term173161.getClass(), "sourcePosition", 0);
        setField(term173161, term173161.getClass(), "jsType", null);
        setField(term173161, term173161.getClass(), "parent", null);
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
        args[1] = term173100;
        args[2] = term173054;
        callMethod(klass, "visit", argTypes, term172870, args);
        assertTrue(recursiveEquals(term172870, term173159));
        assertTrue(recursiveEquals(term173100, term173161));
        assertTrue(recursiveEquals(term173054, null));
    }

};


