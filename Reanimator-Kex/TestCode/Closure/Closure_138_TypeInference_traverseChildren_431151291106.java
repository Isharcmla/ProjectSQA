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

public class TypeInference_traverseChildren_431151291106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55566;
     Object term55636;
     Object term60924;
     Object term60925;

    public TypeInference_traverseChildren_431151291106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55566 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term55636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55636, term55636.getClass(), "first", term55636);
        setIntField(term55636, term55636.getClass(), "type", 57);
        term60924 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term60924, term60924.getClass(), "compiler", null);
        setField(term60924, term60924.getClass(), "registry", null);
        setField(term60924, term60924.getClass(), "reverseInterpreter", null);
        setField(term60924, term60924.getClass(), "syntacticScope", null);
        setField(term60924, term60924.getClass(), "functionScope", null);
        setField(term60924, term60924.getClass(), "bottomScope", null);
        setField(term60924, term60924.getClass(), "assignedOuterLocalVars", null);
        setField(term60924, term60924.getClass(), "unflowableVarNames", null);
        setField(term60924, term60924.getClass(), "cfg", null);
        setField(term60924, term60924.getClass(), "joinOp", null);
        setField(term60924, term60924.getClass(), "orderedWorkSet", null);
        term60925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60925, term60925.getClass(), "type", 57);
        setField(term60925, term60925.getClass(), "next", null);
        setField(term60925, term60925.getClass(), "first", term60925);
        setField(term60925, term60925.getClass(), "last", null);
        setField(term60925, term60925.getClass(), "propListHead", null);
        setIntField(term60925, term60925.getClass(), "sourcePosition", 0);
        setField(term60925, term60925.getClass(), "jsType", null);
        setField(term60925, term60925.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term55636;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term55566, args);
        assertTrue(recursiveEquals(term55566, term60924));
        assertTrue(recursiveEquals(term55636, term60925));
        assertTrue(recursiveEquals(retValue, null));
    }

};


