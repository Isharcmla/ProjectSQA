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

public class TypeInference_traverseChildren_1478920219156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82638;
     Object term82708;
     Object term83205;
     Object term83206;

    public TypeInference_traverseChildren_1478920219156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82638 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term82708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82778, term82778.getClass(), "type", 1816273440);
        setIntField(term82848, term82848.getClass(), "type", 4);
        setField(term82778, term82778.getClass(), "next", term82848);
        setField(term82708, term82708.getClass(), "first", term82778);
        term83205 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term83205, term83205.getClass(), "compiler", null);
        setField(term83205, term83205.getClass(), "registry", null);
        setField(term83205, term83205.getClass(), "reverseInterpreter", null);
        setField(term83205, term83205.getClass(), "syntacticScope", null);
        setField(term83205, term83205.getClass(), "functionScope", null);
        setField(term83205, term83205.getClass(), "bottomScope", null);
        setField(term83205, term83205.getClass(), "assertionFunctionsMap", null);
        setField(term83205, term83205.getClass(), "unknownType", null);
        setField(term83205, term83205.getClass(), "cfg", null);
        setField(term83205, term83205.getClass(), "joinOp", null);
        setField(term83205, term83205.getClass(), "orderedWorkSet", null);
        term83206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83206, term83206.getClass(), "type", 0);
        setField(term83206, term83206.getClass(), "next", null);
        setIntField(term83207, term83207.getClass(), "type", 1816273440);
        setIntField(term83208, term83208.getClass(), "type", 4);
        setField(term83208, term83208.getClass(), "next", null);
        setField(term83208, term83208.getClass(), "first", null);
        setField(term83208, term83208.getClass(), "last", null);
        setField(term83208, term83208.getClass(), "propListHead", null);
        setIntField(term83208, term83208.getClass(), "sourcePosition", 0);
        setField(term83208, term83208.getClass(), "jsType", null);
        setField(term83208, term83208.getClass(), "parent", null);
        setField(term83207, term83207.getClass(), "next", term83208);
        setField(term83207, term83207.getClass(), "first", null);
        setField(term83207, term83207.getClass(), "last", null);
        setField(term83207, term83207.getClass(), "propListHead", null);
        setIntField(term83207, term83207.getClass(), "sourcePosition", 0);
        setField(term83207, term83207.getClass(), "jsType", null);
        setField(term83207, term83207.getClass(), "parent", null);
        setField(term83206, term83206.getClass(), "first", term83207);
        setField(term83206, term83206.getClass(), "last", null);
        setField(term83206, term83206.getClass(), "propListHead", null);
        setIntField(term83206, term83206.getClass(), "sourcePosition", 0);
        setField(term83206, term83206.getClass(), "jsType", null);
        setField(term83206, term83206.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term82708;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term82638, args);
        assertTrue(recursiveEquals(term82638, term83205));
        assertTrue(recursiveEquals(term82708, term83206));
        assertTrue(recursiveEquals(retValue, null));
    }

};


