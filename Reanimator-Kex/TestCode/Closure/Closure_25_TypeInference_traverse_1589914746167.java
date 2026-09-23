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

public class TypeInference_traverse_1589914746167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52985;
     Object term53055;
     Object term53418;
     Object term53419;

    public TypeInference_traverse_1589914746167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52985 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term53055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53055, term53055.getClass(), "type", 75);
        term53418 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term53418, term53418.getClass(), "compiler", null);
        setField(term53418, term53418.getClass(), "registry", null);
        setField(term53418, term53418.getClass(), "reverseInterpreter", null);
        setField(term53418, term53418.getClass(), "syntacticScope", null);
        setField(term53418, term53418.getClass(), "functionScope", null);
        setField(term53418, term53418.getClass(), "bottomScope", null);
        setField(term53418, term53418.getClass(), "assertionFunctionsMap", null);
        setField(term53418, term53418.getClass(), "cfg", null);
        setField(term53418, term53418.getClass(), "joinOp", null);
        setField(term53418, term53418.getClass(), "orderedWorkSet", null);
        term53419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53419, term53419.getClass(), "type", 75);
        setField(term53419, term53419.getClass(), "next", null);
        setField(term53419, term53419.getClass(), "first", null);
        setField(term53419, term53419.getClass(), "last", null);
        setField(term53419, term53419.getClass(), "propListHead", null);
        setIntField(term53419, term53419.getClass(), "sourcePosition", 0);
        setField(term53419, term53419.getClass(), "jsType", null);
        setField(term53419, term53419.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term53055;
        args[1] = null;
        Object retValue = callMethod(klass, "traverse", argTypes, term52985, args);
        assertTrue(recursiveEquals(term52985, term53418));
        assertTrue(recursiveEquals(term53055, term53419));
        assertTrue(recursiveEquals(retValue, null));
    }

};


