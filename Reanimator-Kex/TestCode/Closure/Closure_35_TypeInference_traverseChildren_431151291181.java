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

public class TypeInference_traverseChildren_431151291181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61531;
     Object term61601;
     Object term61881;
     Object term61882;

    public TypeInference_traverseChildren_431151291181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61531 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term61601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61601, term61601.getClass(), "first", term61601);
        setIntField(term61601, term61601.getClass(), "type", 80);
        term61881 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term61881, term61881.getClass(), "compiler", null);
        setField(term61881, term61881.getClass(), "registry", null);
        setField(term61881, term61881.getClass(), "reverseInterpreter", null);
        setField(term61881, term61881.getClass(), "syntacticScope", null);
        setField(term61881, term61881.getClass(), "functionScope", null);
        setField(term61881, term61881.getClass(), "bottomScope", null);
        setField(term61881, term61881.getClass(), "assertionFunctionsMap", null);
        setField(term61881, term61881.getClass(), "cfg", null);
        setField(term61881, term61881.getClass(), "joinOp", null);
        setField(term61881, term61881.getClass(), "orderedWorkSet", null);
        term61882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61882, term61882.getClass(), "type", 80);
        setField(term61882, term61882.getClass(), "next", null);
        setField(term61882, term61882.getClass(), "first", term61882);
        setField(term61882, term61882.getClass(), "last", null);
        setField(term61882, term61882.getClass(), "propListHead", null);
        setIntField(term61882, term61882.getClass(), "sourcePosition", 0);
        setField(term61882, term61882.getClass(), "jsType", null);
        setField(term61882, term61882.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term61601;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term61531, args);
        assertTrue(recursiveEquals(term61531, term61881));
        assertTrue(recursiveEquals(term61601, term61882));
        assertTrue(recursiveEquals(retValue, null));
    }

};


