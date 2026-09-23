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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2619214;
     Object term2619306;
     Object term2619600;
     Object term2619601;
     Object term2619563;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2619214 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2619306 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2619398 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2619490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2619306, term2619306.getClass(), "type", 37);
        setIntField(term2619398, term2619398.getClass(), "type", 35);
        setField(term2619398, term2619398.getClass(), "first", term2619490);
        setField(term2619306, term2619306.getClass(), "first", term2619398);
        term2619600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2619600, term2619600.getClass(), "currentTraversal", null);
        term2619601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2619602 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2619603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2619601, term2619601.getClass(), "str", null);
        setIntField(term2619601, term2619601.getClass(), "type", 37);
        setField(term2619601, term2619601.getClass(), "next", null);
        setField(term2619602, term2619602.getClass(), "str", null);
        setIntField(term2619602, term2619602.getClass(), "type", 35);
        setField(term2619602, term2619602.getClass(), "next", null);
        setField(term2619603, term2619603.getClass(), "str", null);
        setIntField(term2619603, term2619603.getClass(), "type", 0);
        setField(term2619603, term2619603.getClass(), "next", null);
        setField(term2619603, term2619603.getClass(), "first", null);
        setField(term2619603, term2619603.getClass(), "last", null);
        setField(term2619603, term2619603.getClass(), "propListHead", null);
        setIntField(term2619603, term2619603.getClass(), "sourcePosition", 0);
        setField(term2619603, term2619603.getClass(), "jsType", null);
        setField(term2619603, term2619603.getClass(), "parent", null);
        setField(term2619602, term2619602.getClass(), "first", term2619603);
        setField(term2619602, term2619602.getClass(), "last", null);
        setField(term2619602, term2619602.getClass(), "propListHead", null);
        setIntField(term2619602, term2619602.getClass(), "sourcePosition", 0);
        setField(term2619602, term2619602.getClass(), "jsType", null);
        setField(term2619602, term2619602.getClass(), "parent", null);
        setField(term2619601, term2619601.getClass(), "first", term2619602);
        setField(term2619601, term2619601.getClass(), "last", null);
        setField(term2619601, term2619601.getClass(), "propListHead", null);
        setIntField(term2619601, term2619601.getClass(), "sourcePosition", 0);
        setField(term2619601, term2619601.getClass(), "jsType", null);
        setField(term2619601, term2619601.getClass(), "parent", null);
        term2619563 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2619565 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2619567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2619563, term2619563.getClass(), "str", null);
        setIntField(term2619563, term2619563.getClass(), "type", 37);
        setField(term2619563, term2619563.getClass(), "next", null);
        setField(term2619565, term2619565.getClass(), "str", null);
        setIntField(term2619565, term2619565.getClass(), "type", 35);
        setField(term2619565, term2619565.getClass(), "next", null);
        setField(term2619567, term2619567.getClass(), "str", null);
        setIntField(term2619567, term2619567.getClass(), "type", 0);
        setField(term2619567, term2619567.getClass(), "next", null);
        setField(term2619567, term2619567.getClass(), "first", null);
        setField(term2619567, term2619567.getClass(), "last", null);
        setField(term2619567, term2619567.getClass(), "propListHead", null);
        setIntField(term2619567, term2619567.getClass(), "sourcePosition", 0);
        setField(term2619567, term2619567.getClass(), "jsType", null);
        setField(term2619567, term2619567.getClass(), "parent", null);
        setField(term2619565, term2619565.getClass(), "first", term2619567);
        setField(term2619565, term2619565.getClass(), "last", null);
        setField(term2619565, term2619565.getClass(), "propListHead", null);
        setIntField(term2619565, term2619565.getClass(), "sourcePosition", 0);
        setField(term2619565, term2619565.getClass(), "jsType", null);
        setField(term2619565, term2619565.getClass(), "parent", null);
        setField(term2619563, term2619563.getClass(), "first", term2619565);
        setField(term2619563, term2619563.getClass(), "last", null);
        setField(term2619563, term2619563.getClass(), "propListHead", null);
        setIntField(term2619563, term2619563.getClass(), "sourcePosition", 0);
        setField(term2619563, term2619563.getClass(), "jsType", null);
        setField(term2619563, term2619563.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2619306;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2619214, args);
        assertTrue(recursiveEquals(term2619214, term2619600));
        assertTrue(recursiveEquals(term2619306, term2619601));
        assertTrue(recursiveEquals(retValue, term2619563));
    }

};


