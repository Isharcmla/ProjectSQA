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

public class TypeInference_traverseNew_850871778149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48232;
     Object term48302;
     Object term48826;
     Object term48827;

    public TypeInference_traverseNew_850871778149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48232 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term48302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48372, term48372.getClass(), "type", -233024044);
        setField(term48372, term48372.getClass(), "propListHead", null);
        setField(term48372, term48372.getClass(), "jsType", null);
        setIntField(term48442, term48442.getClass(), "type", 72);
        setField(term48372, term48372.getClass(), "next", term48442);
        setField(term48302, term48302.getClass(), "first", term48372);
        setField(term48302, term48302.getClass(), "jsType", null);
        term48826 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term48826, term48826.getClass(), "compiler", null);
        setField(term48826, term48826.getClass(), "registry", null);
        setField(term48826, term48826.getClass(), "reverseInterpreter", null);
        setField(term48826, term48826.getClass(), "syntacticScope", null);
        setField(term48826, term48826.getClass(), "functionScope", null);
        setField(term48826, term48826.getClass(), "bottomScope", null);
        setField(term48826, term48826.getClass(), "assertionFunctionsMap", null);
        setField(term48826, term48826.getClass(), "cfg", null);
        setField(term48826, term48826.getClass(), "joinOp", null);
        setField(term48826, term48826.getClass(), "orderedWorkSet", null);
        term48827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48827, term48827.getClass(), "type", 0);
        setField(term48827, term48827.getClass(), "next", null);
        setIntField(term48828, term48828.getClass(), "type", -233024044);
        setIntField(term48829, term48829.getClass(), "type", 72);
        setField(term48829, term48829.getClass(), "next", null);
        setField(term48829, term48829.getClass(), "first", null);
        setField(term48829, term48829.getClass(), "last", null);
        setField(term48829, term48829.getClass(), "propListHead", null);
        setIntField(term48829, term48829.getClass(), "sourcePosition", 0);
        setField(term48829, term48829.getClass(), "jsType", null);
        setField(term48829, term48829.getClass(), "parent", null);
        setField(term48828, term48828.getClass(), "next", term48829);
        setField(term48828, term48828.getClass(), "first", null);
        setField(term48828, term48828.getClass(), "last", null);
        setField(term48828, term48828.getClass(), "propListHead", null);
        setIntField(term48828, term48828.getClass(), "sourcePosition", 0);
        setField(term48828, term48828.getClass(), "jsType", null);
        setField(term48828, term48828.getClass(), "parent", null);
        setField(term48827, term48827.getClass(), "first", term48828);
        setField(term48827, term48827.getClass(), "last", null);
        setField(term48827, term48827.getClass(), "propListHead", null);
        setIntField(term48827, term48827.getClass(), "sourcePosition", 0);
        setField(term48827, term48827.getClass(), "jsType", null);
        setField(term48827, term48827.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term48302;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseNew", argTypes, term48232, args);
        assertTrue(recursiveEquals(term48232, term48826));
        assertTrue(recursiveEquals(term48302, term48827));
        assertTrue(recursiveEquals(retValue, null));
    }

};


