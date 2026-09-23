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

public class ReferenceCollectingCallback_visit_872273174381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86015;
     Object term86245;
     Object term86199;
     Object term86545;
     Object term86546;
     Object term86547;

    public ReferenceCollectingCallback_visit_872273174381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86015 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term86245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term86245, term86245.getClass(), "type", 98);
        term86199 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term86199, term86199.getClass(), "type", 98);
        setField(term86199, term86199.getClass(), "first", term86245);
        term86545 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term86545, term86545.getClass(), "referenceMap", null);
        setField(term86545, term86545.getClass(), "blockStack", null);
        setField(term86545, term86545.getClass(), "behavior", null);
        setField(term86545, term86545.getClass(), "compiler", null);
        setField(term86545, term86545.getClass(), "varFilter", null);
        term86546 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term86546, term86546.getClass(), "str", null);
        setIntField(term86546, term86546.getClass(), "type", 98);
        setField(term86546, term86546.getClass(), "next", null);
        setField(term86546, term86546.getClass(), "first", null);
        setField(term86546, term86546.getClass(), "last", null);
        setField(term86546, term86546.getClass(), "propListHead", null);
        setIntField(term86546, term86546.getClass(), "sourcePosition", 0);
        setField(term86546, term86546.getClass(), "jsType", null);
        setField(term86546, term86546.getClass(), "parent", null);
        term86547 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term86548 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term86547, term86547.getClass(), "str", null);
        setIntField(term86547, term86547.getClass(), "type", 98);
        setField(term86547, term86547.getClass(), "next", null);
        setField(term86548, term86548.getClass(), "str", null);
        setIntField(term86548, term86548.getClass(), "type", 98);
        setField(term86548, term86548.getClass(), "next", null);
        setField(term86548, term86548.getClass(), "first", null);
        setField(term86548, term86548.getClass(), "last", null);
        setField(term86548, term86548.getClass(), "propListHead", null);
        setIntField(term86548, term86548.getClass(), "sourcePosition", 0);
        setField(term86548, term86548.getClass(), "jsType", null);
        setField(term86548, term86548.getClass(), "parent", null);
        setField(term86547, term86547.getClass(), "first", term86548);
        setField(term86547, term86547.getClass(), "last", null);
        setField(term86547, term86547.getClass(), "propListHead", null);
        setIntField(term86547, term86547.getClass(), "sourcePosition", 0);
        setField(term86547, term86547.getClass(), "jsType", null);
        setField(term86547, term86547.getClass(), "parent", null);
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
        args[1] = term86245;
        args[2] = term86199;
        callMethod(klass, "visit", argTypes, term86015, args);
        assertTrue(recursiveEquals(term86015, term86545));
        assertTrue(recursiveEquals(term86245, term86547));
        assertTrue(recursiveEquals(term86199, null));
    }

};


