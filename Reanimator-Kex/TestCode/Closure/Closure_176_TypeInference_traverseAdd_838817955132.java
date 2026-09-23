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

public class TypeInference_traverseAdd_838817955132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71918;
     Object term71988;
     Object term75150;
     Object term75151;

    public TypeInference_traverseAdd_838817955132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71918 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term71988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71988, term71988.getClass(), "first", term71988);
        setIntField(term72058, term72058.getClass(), "type", 123);
        setField(term71988, term71988.getClass(), "next", term72058);
        setIntField(term71988, term71988.getClass(), "type", 1045547089);
        term75150 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term75150, term75150.getClass(), "compiler", null);
        setField(term75150, term75150.getClass(), "registry", null);
        setField(term75150, term75150.getClass(), "reverseInterpreter", null);
        setField(term75150, term75150.getClass(), "syntacticScope", null);
        setField(term75150, term75150.getClass(), "functionScope", null);
        setField(term75150, term75150.getClass(), "bottomScope", null);
        setField(term75150, term75150.getClass(), "assertionFunctionsMap", null);
        setField(term75150, term75150.getClass(), "unknownType", null);
        setField(term75150, term75150.getClass(), "cfg", null);
        setField(term75150, term75150.getClass(), "joinOp", null);
        setField(term75150, term75150.getClass(), "orderedWorkSet", null);
        term75151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75151, term75151.getClass(), "type", 1045547089);
        setIntField(term75152, term75152.getClass(), "type", 123);
        setField(term75152, term75152.getClass(), "next", null);
        setField(term75152, term75152.getClass(), "first", null);
        setField(term75152, term75152.getClass(), "last", null);
        setField(term75152, term75152.getClass(), "propListHead", null);
        setIntField(term75152, term75152.getClass(), "sourcePosition", 0);
        setField(term75152, term75152.getClass(), "jsType", null);
        setField(term75152, term75152.getClass(), "parent", null);
        setField(term75151, term75151.getClass(), "next", term75152);
        setField(term75151, term75151.getClass(), "first", term75151);
        setField(term75151, term75151.getClass(), "last", null);
        setField(term75151, term75151.getClass(), "propListHead", null);
        setIntField(term75151, term75151.getClass(), "sourcePosition", 0);
        setField(term75151, term75151.getClass(), "jsType", null);
        setField(term75151, term75151.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term71988;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseAdd", argTypes, term71918, args);
        assertTrue(recursiveEquals(term71918, term75150));
        assertTrue(recursiveEquals(term71988, term75151));
        assertTrue(recursiveEquals(retValue, null));
    }

};


