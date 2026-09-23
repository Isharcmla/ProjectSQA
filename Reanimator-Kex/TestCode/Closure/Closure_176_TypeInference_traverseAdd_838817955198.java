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

public class TypeInference_traverseAdd_838817955198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93023;
     Object term93093;
     Object term95690;
     Object term95696;

    public TypeInference_traverseAdd_838817955198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93023 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term93093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93093, term93093.getClass(), "first", term93093);
        setIntField(term93163, term93163.getClass(), "type", 74);
        setField(term93093, term93093.getClass(), "next", term93163);
        setIntField(term93093, term93093.getClass(), "type", 1045547089);
        term95690 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term95690, term95690.getClass(), "compiler", null);
        setField(term95690, term95690.getClass(), "registry", null);
        setField(term95690, term95690.getClass(), "reverseInterpreter", null);
        setField(term95690, term95690.getClass(), "syntacticScope", null);
        setField(term95690, term95690.getClass(), "functionScope", null);
        setField(term95690, term95690.getClass(), "bottomScope", null);
        setField(term95690, term95690.getClass(), "assertionFunctionsMap", null);
        setField(term95690, term95690.getClass(), "unknownType", null);
        setField(term95690, term95690.getClass(), "cfg", null);
        setField(term95690, term95690.getClass(), "joinOp", null);
        setField(term95690, term95690.getClass(), "orderedWorkSet", null);
        term95696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term95696, term95696.getClass(), "type", 1045547089);
        setIntField(term95700, term95700.getClass(), "type", 74);
        setField(term95700, term95700.getClass(), "next", null);
        setField(term95700, term95700.getClass(), "first", null);
        setField(term95700, term95700.getClass(), "last", null);
        setField(term95700, term95700.getClass(), "propListHead", null);
        setIntField(term95700, term95700.getClass(), "sourcePosition", 0);
        setField(term95700, term95700.getClass(), "jsType", null);
        setField(term95700, term95700.getClass(), "parent", null);
        setField(term95696, term95696.getClass(), "next", term95700);
        setField(term95696, term95696.getClass(), "first", term95696);
        setField(term95696, term95696.getClass(), "last", null);
        setField(term95696, term95696.getClass(), "propListHead", null);
        setIntField(term95696, term95696.getClass(), "sourcePosition", 0);
        setField(term95696, term95696.getClass(), "jsType", null);
        setField(term95696, term95696.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term93093;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseAdd", argTypes, term93023, args);
        assertTrue(recursiveEquals(term93023, term95690));
        assertTrue(recursiveEquals(term93093, term95696));
        assertTrue(recursiveEquals(retValue, null));
    }

};


