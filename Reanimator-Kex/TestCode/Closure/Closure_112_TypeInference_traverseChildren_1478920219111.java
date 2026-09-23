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

public class TypeInference_traverseChildren_1478920219111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64203;
     Object term64273;
     Object term68160;
     Object term68161;

    public TypeInference_traverseChildren_1478920219111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64203 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term64273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64343, term64343.getClass(), "type", -516303035);
        setIntField(term64413, term64413.getClass(), "type", 115);
        setField(term64343, term64343.getClass(), "next", term64413);
        setField(term64273, term64273.getClass(), "first", term64343);
        term68160 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term68160, term68160.getClass(), "compiler", null);
        setField(term68160, term68160.getClass(), "registry", null);
        setField(term68160, term68160.getClass(), "reverseInterpreter", null);
        setField(term68160, term68160.getClass(), "syntacticScope", null);
        setField(term68160, term68160.getClass(), "functionScope", null);
        setField(term68160, term68160.getClass(), "bottomScope", null);
        setField(term68160, term68160.getClass(), "assertionFunctionsMap", null);
        setField(term68160, term68160.getClass(), "unknownType", null);
        setField(term68160, term68160.getClass(), "cfg", null);
        setField(term68160, term68160.getClass(), "joinOp", null);
        setField(term68160, term68160.getClass(), "orderedWorkSet", null);
        term68161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68161, term68161.getClass(), "type", 0);
        setField(term68161, term68161.getClass(), "next", null);
        setIntField(term68162, term68162.getClass(), "type", -516303035);
        setIntField(term68163, term68163.getClass(), "type", 115);
        setField(term68163, term68163.getClass(), "next", null);
        setField(term68163, term68163.getClass(), "first", null);
        setField(term68163, term68163.getClass(), "last", null);
        setField(term68163, term68163.getClass(), "propListHead", null);
        setIntField(term68163, term68163.getClass(), "sourcePosition", 0);
        setField(term68163, term68163.getClass(), "jsType", null);
        setField(term68163, term68163.getClass(), "parent", null);
        setField(term68162, term68162.getClass(), "next", term68163);
        setField(term68162, term68162.getClass(), "first", null);
        setField(term68162, term68162.getClass(), "last", null);
        setField(term68162, term68162.getClass(), "propListHead", null);
        setIntField(term68162, term68162.getClass(), "sourcePosition", 0);
        setField(term68162, term68162.getClass(), "jsType", null);
        setField(term68162, term68162.getClass(), "parent", null);
        setField(term68161, term68161.getClass(), "first", term68162);
        setField(term68161, term68161.getClass(), "last", null);
        setField(term68161, term68161.getClass(), "propListHead", null);
        setIntField(term68161, term68161.getClass(), "sourcePosition", 0);
        setField(term68161, term68161.getClass(), "jsType", null);
        setField(term68161, term68161.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term64273;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term64203, args);
        assertTrue(recursiveEquals(term64203, term68160));
        assertTrue(recursiveEquals(term64273, term68161));
        assertTrue(recursiveEquals(retValue, null));
    }

};


