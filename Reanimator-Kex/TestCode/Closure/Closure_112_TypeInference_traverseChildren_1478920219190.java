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

public class TypeInference_traverseChildren_1478920219190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93539;
     Object term93609;
     Object term97440;
     Object term97441;

    public TypeInference_traverseChildren_1478920219190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93539 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term93609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93679, term93679.getClass(), "type", -516303035);
        setIntField(term93749, term93749.getClass(), "type", 126);
        setField(term93679, term93679.getClass(), "next", term93749);
        setField(term93609, term93609.getClass(), "first", term93679);
        term97440 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term97440, term97440.getClass(), "compiler", null);
        setField(term97440, term97440.getClass(), "registry", null);
        setField(term97440, term97440.getClass(), "reverseInterpreter", null);
        setField(term97440, term97440.getClass(), "syntacticScope", null);
        setField(term97440, term97440.getClass(), "functionScope", null);
        setField(term97440, term97440.getClass(), "bottomScope", null);
        setField(term97440, term97440.getClass(), "assertionFunctionsMap", null);
        setField(term97440, term97440.getClass(), "unknownType", null);
        setField(term97440, term97440.getClass(), "cfg", null);
        setField(term97440, term97440.getClass(), "joinOp", null);
        setField(term97440, term97440.getClass(), "orderedWorkSet", null);
        term97441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97441, term97441.getClass(), "type", 0);
        setField(term97441, term97441.getClass(), "next", null);
        setIntField(term97442, term97442.getClass(), "type", -516303035);
        setIntField(term97443, term97443.getClass(), "type", 126);
        setField(term97443, term97443.getClass(), "next", null);
        setField(term97443, term97443.getClass(), "first", null);
        setField(term97443, term97443.getClass(), "last", null);
        setField(term97443, term97443.getClass(), "propListHead", null);
        setIntField(term97443, term97443.getClass(), "sourcePosition", 0);
        setField(term97443, term97443.getClass(), "jsType", null);
        setField(term97443, term97443.getClass(), "parent", null);
        setField(term97442, term97442.getClass(), "next", term97443);
        setField(term97442, term97442.getClass(), "first", null);
        setField(term97442, term97442.getClass(), "last", null);
        setField(term97442, term97442.getClass(), "propListHead", null);
        setIntField(term97442, term97442.getClass(), "sourcePosition", 0);
        setField(term97442, term97442.getClass(), "jsType", null);
        setField(term97442, term97442.getClass(), "parent", null);
        setField(term97441, term97441.getClass(), "first", term97442);
        setField(term97441, term97441.getClass(), "last", null);
        setField(term97441, term97441.getClass(), "propListHead", null);
        setIntField(term97441, term97441.getClass(), "sourcePosition", 0);
        setField(term97441, term97441.getClass(), "jsType", null);
        setField(term97441, term97441.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term93609;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term93539, args);
        assertTrue(recursiveEquals(term93539, term97440));
        assertTrue(recursiveEquals(term93609, term97441));
        assertTrue(recursiveEquals(retValue, null));
    }

};


