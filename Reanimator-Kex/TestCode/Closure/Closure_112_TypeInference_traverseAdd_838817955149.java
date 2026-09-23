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

public class TypeInference_traverseAdd_838817955149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79377;
     Object term79447;
     Object term80114;
     Object term80115;

    public TypeInference_traverseAdd_838817955149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79377 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term79447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79447, term79447.getClass(), "first", term79447);
        setIntField(term79517, term79517.getClass(), "type", 34);
        setField(term79447, term79447.getClass(), "next", term79517);
        setIntField(term79447, term79447.getClass(), "type", 1045547089);
        term80114 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term80114, term80114.getClass(), "compiler", null);
        setField(term80114, term80114.getClass(), "registry", null);
        setField(term80114, term80114.getClass(), "reverseInterpreter", null);
        setField(term80114, term80114.getClass(), "syntacticScope", null);
        setField(term80114, term80114.getClass(), "functionScope", null);
        setField(term80114, term80114.getClass(), "bottomScope", null);
        setField(term80114, term80114.getClass(), "assertionFunctionsMap", null);
        setField(term80114, term80114.getClass(), "unknownType", null);
        setField(term80114, term80114.getClass(), "cfg", null);
        setField(term80114, term80114.getClass(), "joinOp", null);
        setField(term80114, term80114.getClass(), "orderedWorkSet", null);
        term80115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80115, term80115.getClass(), "type", 1045547089);
        setIntField(term80116, term80116.getClass(), "type", 34);
        setField(term80116, term80116.getClass(), "next", null);
        setField(term80116, term80116.getClass(), "first", null);
        setField(term80116, term80116.getClass(), "last", null);
        setField(term80116, term80116.getClass(), "propListHead", null);
        setIntField(term80116, term80116.getClass(), "sourcePosition", 0);
        setField(term80116, term80116.getClass(), "jsType", null);
        setField(term80116, term80116.getClass(), "parent", null);
        setField(term80115, term80115.getClass(), "next", term80116);
        setField(term80115, term80115.getClass(), "first", term80115);
        setField(term80115, term80115.getClass(), "last", null);
        setField(term80115, term80115.getClass(), "propListHead", null);
        setIntField(term80115, term80115.getClass(), "sourcePosition", 0);
        setField(term80115, term80115.getClass(), "jsType", null);
        setField(term80115, term80115.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term79447;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseAdd", argTypes, term79377, args);
        assertTrue(recursiveEquals(term79377, term80114));
        assertTrue(recursiveEquals(term79447, term80115));
        assertTrue(recursiveEquals(retValue, null));
    }

};


