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

public class TypeInference_traverseChildren_431151291162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50485;
     Object term50555;
     Object term54383;
     Object term54384;

    public TypeInference_traverseChildren_431151291162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50485 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term50555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50625, term50625.getClass(), "type", 1241164745);
        setField(term50625, term50625.getClass(), "propListHead", null);
        setIntField(term50695, term50695.getClass(), "type", 104);
        setField(term50625, term50625.getClass(), "next", term50695);
        setField(term50555, term50555.getClass(), "first", term50625);
        term54383 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term54383, term54383.getClass(), "compiler", null);
        setField(term54383, term54383.getClass(), "registry", null);
        setField(term54383, term54383.getClass(), "reverseInterpreter", null);
        setField(term54383, term54383.getClass(), "syntacticScope", null);
        setField(term54383, term54383.getClass(), "functionScope", null);
        setField(term54383, term54383.getClass(), "bottomScope", null);
        setField(term54383, term54383.getClass(), "assertionFunctionsMap", null);
        setField(term54383, term54383.getClass(), "cfg", null);
        setField(term54383, term54383.getClass(), "joinOp", null);
        setField(term54383, term54383.getClass(), "orderedWorkSet", null);
        term54384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54384, term54384.getClass(), "type", 0);
        setField(term54384, term54384.getClass(), "next", null);
        setIntField(term54385, term54385.getClass(), "type", 1241164745);
        setIntField(term54386, term54386.getClass(), "type", 104);
        setField(term54386, term54386.getClass(), "next", null);
        setField(term54386, term54386.getClass(), "first", null);
        setField(term54386, term54386.getClass(), "last", null);
        setField(term54386, term54386.getClass(), "propListHead", null);
        setIntField(term54386, term54386.getClass(), "sourcePosition", 0);
        setField(term54386, term54386.getClass(), "jsType", null);
        setField(term54386, term54386.getClass(), "parent", null);
        setField(term54385, term54385.getClass(), "next", term54386);
        setField(term54385, term54385.getClass(), "first", null);
        setField(term54385, term54385.getClass(), "last", null);
        setField(term54385, term54385.getClass(), "propListHead", null);
        setIntField(term54385, term54385.getClass(), "sourcePosition", 0);
        setField(term54385, term54385.getClass(), "jsType", null);
        setField(term54385, term54385.getClass(), "parent", null);
        setField(term54384, term54384.getClass(), "first", term54385);
        setField(term54384, term54384.getClass(), "last", null);
        setField(term54384, term54384.getClass(), "propListHead", null);
        setIntField(term54384, term54384.getClass(), "sourcePosition", 0);
        setField(term54384, term54384.getClass(), "jsType", null);
        setField(term54384, term54384.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term50555;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term50485, args);
        assertTrue(recursiveEquals(term50485, term54383));
        assertTrue(recursiveEquals(term50555, term54384));
        assertTrue(recursiveEquals(retValue, null));
    }

};


