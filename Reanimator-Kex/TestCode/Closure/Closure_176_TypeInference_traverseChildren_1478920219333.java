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

public class TypeInference_traverseChildren_1478920219333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995484;
     Object term995554;
     Object term1155270;
     Object term1155271;

    public TypeInference_traverseChildren_1478920219333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term995484 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term995554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term995624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term995694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term995624, term995624.getClass(), "type", 2634669);
        setIntField(term995694, term995694.getClass(), "type", 8);
        setField(term995624, term995624.getClass(), "next", term995694);
        setField(term995554, term995554.getClass(), "first", term995624);
        term1155270 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term1155270, term1155270.getClass(), "compiler", null);
        setField(term1155270, term1155270.getClass(), "registry", null);
        setField(term1155270, term1155270.getClass(), "reverseInterpreter", null);
        setField(term1155270, term1155270.getClass(), "syntacticScope", null);
        setField(term1155270, term1155270.getClass(), "functionScope", null);
        setField(term1155270, term1155270.getClass(), "bottomScope", null);
        setField(term1155270, term1155270.getClass(), "assertionFunctionsMap", null);
        setField(term1155270, term1155270.getClass(), "unknownType", null);
        setField(term1155270, term1155270.getClass(), "cfg", null);
        setField(term1155270, term1155270.getClass(), "joinOp", null);
        setField(term1155270, term1155270.getClass(), "orderedWorkSet", null);
        term1155271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1155272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1155273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1155271, term1155271.getClass(), "type", 0);
        setField(term1155271, term1155271.getClass(), "next", null);
        setIntField(term1155272, term1155272.getClass(), "type", 2634669);
        setIntField(term1155273, term1155273.getClass(), "type", 8);
        setField(term1155273, term1155273.getClass(), "next", null);
        setField(term1155273, term1155273.getClass(), "first", null);
        setField(term1155273, term1155273.getClass(), "last", null);
        setField(term1155273, term1155273.getClass(), "propListHead", null);
        setIntField(term1155273, term1155273.getClass(), "sourcePosition", 0);
        setField(term1155273, term1155273.getClass(), "jsType", null);
        setField(term1155273, term1155273.getClass(), "parent", null);
        setField(term1155272, term1155272.getClass(), "next", term1155273);
        setField(term1155272, term1155272.getClass(), "first", null);
        setField(term1155272, term1155272.getClass(), "last", null);
        setField(term1155272, term1155272.getClass(), "propListHead", null);
        setIntField(term1155272, term1155272.getClass(), "sourcePosition", 0);
        setField(term1155272, term1155272.getClass(), "jsType", null);
        setField(term1155272, term1155272.getClass(), "parent", null);
        setField(term1155271, term1155271.getClass(), "first", term1155272);
        setField(term1155271, term1155271.getClass(), "last", null);
        setField(term1155271, term1155271.getClass(), "propListHead", null);
        setIntField(term1155271, term1155271.getClass(), "sourcePosition", 0);
        setField(term1155271, term1155271.getClass(), "jsType", null);
        setField(term1155271, term1155271.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term995554;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term995484, args);
        assertTrue(recursiveEquals(term995484, term1155270));
        assertTrue(recursiveEquals(term995554, term1155271));
        assertTrue(recursiveEquals(retValue, null));
    }

};


