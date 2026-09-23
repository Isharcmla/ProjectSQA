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

public class TypeInference_traverseChildren_431151291175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60241;
     Object term60311;
     Object term60618;
     Object term60619;

    public TypeInference_traverseChildren_431151291175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60241 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term60311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60311, term60311.getClass(), "first", term60311);
        setIntField(term60311, term60311.getClass(), "type", 53);
        term60618 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term60618, term60618.getClass(), "compiler", null);
        setField(term60618, term60618.getClass(), "registry", null);
        setField(term60618, term60618.getClass(), "reverseInterpreter", null);
        setField(term60618, term60618.getClass(), "syntacticScope", null);
        setField(term60618, term60618.getClass(), "functionScope", null);
        setField(term60618, term60618.getClass(), "bottomScope", null);
        setField(term60618, term60618.getClass(), "assertionFunctionsMap", null);
        setField(term60618, term60618.getClass(), "cfg", null);
        setField(term60618, term60618.getClass(), "joinOp", null);
        setField(term60618, term60618.getClass(), "orderedWorkSet", null);
        term60619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60619, term60619.getClass(), "type", 53);
        setField(term60619, term60619.getClass(), "next", null);
        setField(term60619, term60619.getClass(), "first", term60619);
        setField(term60619, term60619.getClass(), "last", null);
        setField(term60619, term60619.getClass(), "propListHead", null);
        setIntField(term60619, term60619.getClass(), "sourcePosition", 0);
        setField(term60619, term60619.getClass(), "jsType", null);
        setField(term60619, term60619.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term60311;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term60241, args);
        assertTrue(recursiveEquals(term60241, term60618));
        assertTrue(recursiveEquals(term60311, term60619));
        assertTrue(recursiveEquals(retValue, null));
    }

};


