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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190658;
     Object term1190750;
     Object term1191238;
     Object term1191239;
     Object term1191200;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1190658 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1190750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1190842 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1190912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1190750, term1190750.getClass(), "type", 37);
        setIntField(term1190842, term1190842.getClass(), "type", 33);
        setField(term1190842, term1190842.getClass(), "first", term1190912);
        setField(term1190750, term1190750.getClass(), "first", term1190842);
        term1191238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1191238, term1191238.getClass(), "currentTraversal", null);
        term1191239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1191240 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1191241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1191239, term1191239.getClass(), "str", null);
        setIntField(term1191239, term1191239.getClass(), "type", 37);
        setField(term1191239, term1191239.getClass(), "next", null);
        setDoubleField(term1191240, term1191240.getClass(), "number", 0.0);
        setIntField(term1191240, term1191240.getClass(), "type", 33);
        setField(term1191240, term1191240.getClass(), "next", null);
        setIntField(term1191241, term1191241.getClass(), "type", 0);
        setField(term1191241, term1191241.getClass(), "next", null);
        setField(term1191241, term1191241.getClass(), "first", null);
        setField(term1191241, term1191241.getClass(), "last", null);
        setField(term1191241, term1191241.getClass(), "propListHead", null);
        setIntField(term1191241, term1191241.getClass(), "sourcePosition", 0);
        setField(term1191241, term1191241.getClass(), "jsType", null);
        setField(term1191241, term1191241.getClass(), "parent", null);
        setField(term1191240, term1191240.getClass(), "first", term1191241);
        setField(term1191240, term1191240.getClass(), "last", null);
        setField(term1191240, term1191240.getClass(), "propListHead", null);
        setIntField(term1191240, term1191240.getClass(), "sourcePosition", 0);
        setField(term1191240, term1191240.getClass(), "jsType", null);
        setField(term1191240, term1191240.getClass(), "parent", null);
        setField(term1191239, term1191239.getClass(), "first", term1191240);
        setField(term1191239, term1191239.getClass(), "last", null);
        setField(term1191239, term1191239.getClass(), "propListHead", null);
        setIntField(term1191239, term1191239.getClass(), "sourcePosition", 0);
        setField(term1191239, term1191239.getClass(), "jsType", null);
        setField(term1191239, term1191239.getClass(), "parent", null);
        term1191200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1191202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1191205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1191200, term1191200.getClass(), "str", null);
        setIntField(term1191200, term1191200.getClass(), "type", 37);
        setField(term1191200, term1191200.getClass(), "next", null);
        setDoubleField(term1191202, term1191202.getClass(), "number", 0.0);
        setIntField(term1191202, term1191202.getClass(), "type", 33);
        setField(term1191202, term1191202.getClass(), "next", null);
        setIntField(term1191205, term1191205.getClass(), "type", 0);
        setField(term1191205, term1191205.getClass(), "next", null);
        setField(term1191205, term1191205.getClass(), "first", null);
        setField(term1191205, term1191205.getClass(), "last", null);
        setField(term1191205, term1191205.getClass(), "propListHead", null);
        setIntField(term1191205, term1191205.getClass(), "sourcePosition", 0);
        setField(term1191205, term1191205.getClass(), "jsType", null);
        setField(term1191205, term1191205.getClass(), "parent", null);
        setField(term1191202, term1191202.getClass(), "first", term1191205);
        setField(term1191202, term1191202.getClass(), "last", null);
        setField(term1191202, term1191202.getClass(), "propListHead", null);
        setIntField(term1191202, term1191202.getClass(), "sourcePosition", 0);
        setField(term1191202, term1191202.getClass(), "jsType", null);
        setField(term1191202, term1191202.getClass(), "parent", null);
        setField(term1191200, term1191200.getClass(), "first", term1191202);
        setField(term1191200, term1191200.getClass(), "last", null);
        setField(term1191200, term1191200.getClass(), "propListHead", null);
        setIntField(term1191200, term1191200.getClass(), "sourcePosition", 0);
        setField(term1191200, term1191200.getClass(), "jsType", null);
        setField(term1191200, term1191200.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1190750;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1190658, args);
        assertTrue(recursiveEquals(term1190658, term1191238));
        assertTrue(recursiveEquals(term1190750, term1191239));
        assertTrue(recursiveEquals(retValue, term1191200));
    }

};


