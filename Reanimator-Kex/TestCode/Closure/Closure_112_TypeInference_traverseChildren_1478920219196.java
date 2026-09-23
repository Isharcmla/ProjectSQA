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

public class TypeInference_traverseChildren_1478920219196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97986;
     Object term98056;
     Object term98657;
     Object term98658;

    public TypeInference_traverseChildren_1478920219196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97986 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term98056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98126, term98126.getClass(), "type", -516303035);
        setIntField(term98196, term98196.getClass(), "type", 112);
        setField(term98126, term98126.getClass(), "next", term98196);
        setField(term98056, term98056.getClass(), "first", term98126);
        term98657 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term98657, term98657.getClass(), "compiler", null);
        setField(term98657, term98657.getClass(), "registry", null);
        setField(term98657, term98657.getClass(), "reverseInterpreter", null);
        setField(term98657, term98657.getClass(), "syntacticScope", null);
        setField(term98657, term98657.getClass(), "functionScope", null);
        setField(term98657, term98657.getClass(), "bottomScope", null);
        setField(term98657, term98657.getClass(), "assertionFunctionsMap", null);
        setField(term98657, term98657.getClass(), "unknownType", null);
        setField(term98657, term98657.getClass(), "cfg", null);
        setField(term98657, term98657.getClass(), "joinOp", null);
        setField(term98657, term98657.getClass(), "orderedWorkSet", null);
        term98658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98658, term98658.getClass(), "type", 0);
        setField(term98658, term98658.getClass(), "next", null);
        setIntField(term98659, term98659.getClass(), "type", -516303035);
        setIntField(term98660, term98660.getClass(), "type", 112);
        setField(term98660, term98660.getClass(), "next", null);
        setField(term98660, term98660.getClass(), "first", null);
        setField(term98660, term98660.getClass(), "last", null);
        setField(term98660, term98660.getClass(), "propListHead", null);
        setIntField(term98660, term98660.getClass(), "sourcePosition", 0);
        setField(term98660, term98660.getClass(), "jsType", null);
        setField(term98660, term98660.getClass(), "parent", null);
        setField(term98659, term98659.getClass(), "next", term98660);
        setField(term98659, term98659.getClass(), "first", null);
        setField(term98659, term98659.getClass(), "last", null);
        setField(term98659, term98659.getClass(), "propListHead", null);
        setIntField(term98659, term98659.getClass(), "sourcePosition", 0);
        setField(term98659, term98659.getClass(), "jsType", null);
        setField(term98659, term98659.getClass(), "parent", null);
        setField(term98658, term98658.getClass(), "first", term98659);
        setField(term98658, term98658.getClass(), "last", null);
        setField(term98658, term98658.getClass(), "propListHead", null);
        setIntField(term98658, term98658.getClass(), "sourcePosition", 0);
        setField(term98658, term98658.getClass(), "jsType", null);
        setField(term98658, term98658.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term98056;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term97986, args);
        assertTrue(recursiveEquals(term97986, term98657));
        assertTrue(recursiveEquals(term98056, term98658));
        assertTrue(recursiveEquals(retValue, null));
    }

};


