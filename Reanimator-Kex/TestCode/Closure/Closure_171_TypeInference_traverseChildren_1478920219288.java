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

public class TypeInference_traverseChildren_1478920219288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554090;
     Object term554160;
     Object term574044;
     Object term574045;

    public TypeInference_traverseChildren_1478920219288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554090 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term554160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term554230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term554300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term554230, term554230.getClass(), "type", 1816273440);
        setIntField(term554300, term554300.getClass(), "type", 69);
        setField(term554230, term554230.getClass(), "next", term554300);
        setField(term554160, term554160.getClass(), "first", term554230);
        term574044 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term574044, term574044.getClass(), "compiler", null);
        setField(term574044, term574044.getClass(), "registry", null);
        setField(term574044, term574044.getClass(), "reverseInterpreter", null);
        setField(term574044, term574044.getClass(), "syntacticScope", null);
        setField(term574044, term574044.getClass(), "functionScope", null);
        setField(term574044, term574044.getClass(), "bottomScope", null);
        setField(term574044, term574044.getClass(), "assertionFunctionsMap", null);
        setField(term574044, term574044.getClass(), "unknownType", null);
        setField(term574044, term574044.getClass(), "cfg", null);
        setField(term574044, term574044.getClass(), "joinOp", null);
        setField(term574044, term574044.getClass(), "orderedWorkSet", null);
        term574045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term574046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term574047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term574045, term574045.getClass(), "type", 0);
        setField(term574045, term574045.getClass(), "next", null);
        setIntField(term574046, term574046.getClass(), "type", 1816273440);
        setIntField(term574047, term574047.getClass(), "type", 69);
        setField(term574047, term574047.getClass(), "next", null);
        setField(term574047, term574047.getClass(), "first", null);
        setField(term574047, term574047.getClass(), "last", null);
        setField(term574047, term574047.getClass(), "propListHead", null);
        setIntField(term574047, term574047.getClass(), "sourcePosition", 0);
        setField(term574047, term574047.getClass(), "jsType", null);
        setField(term574047, term574047.getClass(), "parent", null);
        setField(term574046, term574046.getClass(), "next", term574047);
        setField(term574046, term574046.getClass(), "first", null);
        setField(term574046, term574046.getClass(), "last", null);
        setField(term574046, term574046.getClass(), "propListHead", null);
        setIntField(term574046, term574046.getClass(), "sourcePosition", 0);
        setField(term574046, term574046.getClass(), "jsType", null);
        setField(term574046, term574046.getClass(), "parent", null);
        setField(term574045, term574045.getClass(), "first", term574046);
        setField(term574045, term574045.getClass(), "last", null);
        setField(term574045, term574045.getClass(), "propListHead", null);
        setIntField(term574045, term574045.getClass(), "sourcePosition", 0);
        setField(term574045, term574045.getClass(), "jsType", null);
        setField(term574045, term574045.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term554160;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term554090, args);
        assertTrue(recursiveEquals(term554090, term574044));
        assertTrue(recursiveEquals(term554160, term574045));
        assertTrue(recursiveEquals(retValue, null));
    }

};


