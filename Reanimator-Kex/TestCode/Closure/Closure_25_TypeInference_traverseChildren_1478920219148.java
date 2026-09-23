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

public class TypeInference_traverseChildren_1478920219148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46461;
     Object term46531;
     Object term48775;
     Object term48776;

    public TypeInference_traverseChildren_1478920219148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46461 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term46531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46601, term46601.getClass(), "type", 1241164745);
        setField(term46601, term46601.getClass(), "propListHead", null);
        setIntField(term46671, term46671.getClass(), "type", 67);
        setField(term46601, term46601.getClass(), "next", term46671);
        setField(term46531, term46531.getClass(), "first", term46601);
        term48775 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term48775, term48775.getClass(), "compiler", null);
        setField(term48775, term48775.getClass(), "registry", null);
        setField(term48775, term48775.getClass(), "reverseInterpreter", null);
        setField(term48775, term48775.getClass(), "syntacticScope", null);
        setField(term48775, term48775.getClass(), "functionScope", null);
        setField(term48775, term48775.getClass(), "bottomScope", null);
        setField(term48775, term48775.getClass(), "assertionFunctionsMap", null);
        setField(term48775, term48775.getClass(), "cfg", null);
        setField(term48775, term48775.getClass(), "joinOp", null);
        setField(term48775, term48775.getClass(), "orderedWorkSet", null);
        term48776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48776, term48776.getClass(), "type", 0);
        setField(term48776, term48776.getClass(), "next", null);
        setIntField(term48777, term48777.getClass(), "type", 1241164745);
        setIntField(term48778, term48778.getClass(), "type", 67);
        setField(term48778, term48778.getClass(), "next", null);
        setField(term48778, term48778.getClass(), "first", null);
        setField(term48778, term48778.getClass(), "last", null);
        setField(term48778, term48778.getClass(), "propListHead", null);
        setIntField(term48778, term48778.getClass(), "sourcePosition", 0);
        setField(term48778, term48778.getClass(), "jsType", null);
        setField(term48778, term48778.getClass(), "parent", null);
        setField(term48777, term48777.getClass(), "next", term48778);
        setField(term48777, term48777.getClass(), "first", null);
        setField(term48777, term48777.getClass(), "last", null);
        setField(term48777, term48777.getClass(), "propListHead", null);
        setIntField(term48777, term48777.getClass(), "sourcePosition", 0);
        setField(term48777, term48777.getClass(), "jsType", null);
        setField(term48777, term48777.getClass(), "parent", null);
        setField(term48776, term48776.getClass(), "first", term48777);
        setField(term48776, term48776.getClass(), "last", null);
        setField(term48776, term48776.getClass(), "propListHead", null);
        setIntField(term48776, term48776.getClass(), "sourcePosition", 0);
        setField(term48776, term48776.getClass(), "jsType", null);
        setField(term48776, term48776.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term46531;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term46461, args);
        assertTrue(recursiveEquals(term46461, term48775));
        assertTrue(recursiveEquals(term46531, term48776));
        assertTrue(recursiveEquals(retValue, null));
    }

};


