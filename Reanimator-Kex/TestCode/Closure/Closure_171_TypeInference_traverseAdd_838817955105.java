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

public class TypeInference_traverseAdd_838817955105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65218;
     Object term65288;
     Object term65951;
     Object term65952;

    public TypeInference_traverseAdd_838817955105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65218 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term65288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65288, term65288.getClass(), "first", term65288);
        setIntField(term65358, term65358.getClass(), "type", 82);
        setField(term65288, term65288.getClass(), "next", term65358);
        setIntField(term65288, term65288.getClass(), "type", 1045547089);
        term65951 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term65951, term65951.getClass(), "compiler", null);
        setField(term65951, term65951.getClass(), "registry", null);
        setField(term65951, term65951.getClass(), "reverseInterpreter", null);
        setField(term65951, term65951.getClass(), "syntacticScope", null);
        setField(term65951, term65951.getClass(), "functionScope", null);
        setField(term65951, term65951.getClass(), "bottomScope", null);
        setField(term65951, term65951.getClass(), "assertionFunctionsMap", null);
        setField(term65951, term65951.getClass(), "unknownType", null);
        setField(term65951, term65951.getClass(), "cfg", null);
        setField(term65951, term65951.getClass(), "joinOp", null);
        setField(term65951, term65951.getClass(), "orderedWorkSet", null);
        term65952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65952, term65952.getClass(), "type", 1045547089);
        setIntField(term65953, term65953.getClass(), "type", 82);
        setField(term65953, term65953.getClass(), "next", null);
        setField(term65953, term65953.getClass(), "first", null);
        setField(term65953, term65953.getClass(), "last", null);
        setField(term65953, term65953.getClass(), "propListHead", null);
        setIntField(term65953, term65953.getClass(), "sourcePosition", 0);
        setField(term65953, term65953.getClass(), "jsType", null);
        setField(term65953, term65953.getClass(), "parent", null);
        setField(term65952, term65952.getClass(), "next", term65953);
        setField(term65952, term65952.getClass(), "first", term65952);
        setField(term65952, term65952.getClass(), "last", null);
        setField(term65952, term65952.getClass(), "propListHead", null);
        setIntField(term65952, term65952.getClass(), "sourcePosition", 0);
        setField(term65952, term65952.getClass(), "jsType", null);
        setField(term65952, term65952.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term65288;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseAdd", argTypes, term65218, args);
        assertTrue(recursiveEquals(term65218, term65951));
        assertTrue(recursiveEquals(term65288, term65952));
        assertTrue(recursiveEquals(retValue, null));
    }

};


