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

public class TypeInference_traverse_542145818108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60303;
     Object term60373;
     Object term61111;
     Object term61112;

    public TypeInference_traverse_542145818108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60303 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term60373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60373, term60373.getClass(), "type", 119);
        term61111 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term61111, term61111.getClass(), "compiler", null);
        setField(term61111, term61111.getClass(), "registry", null);
        setField(term61111, term61111.getClass(), "reverseInterpreter", null);
        setField(term61111, term61111.getClass(), "syntacticScope", null);
        setField(term61111, term61111.getClass(), "functionScope", null);
        setField(term61111, term61111.getClass(), "bottomScope", null);
        setField(term61111, term61111.getClass(), "assignedOuterLocalVars", null);
        setField(term61111, term61111.getClass(), "unflowableVarNames", null);
        setField(term61111, term61111.getClass(), "cfg", null);
        setField(term61111, term61111.getClass(), "joinOp", null);
        setField(term61111, term61111.getClass(), "orderedWorkSet", null);
        term61112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61112, term61112.getClass(), "type", 119);
        setField(term61112, term61112.getClass(), "next", null);
        setField(term61112, term61112.getClass(), "first", null);
        setField(term61112, term61112.getClass(), "last", null);
        setField(term61112, term61112.getClass(), "propListHead", null);
        setIntField(term61112, term61112.getClass(), "sourcePosition", 0);
        setField(term61112, term61112.getClass(), "jsType", null);
        setField(term61112, term61112.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term60373;
        args[1] = null;
        Object retValue = callMethod(klass, "traverse", argTypes, term60303, args);
        assertTrue(recursiveEquals(term60303, term61111));
        assertTrue(recursiveEquals(term60373, term61112));
        assertTrue(recursiveEquals(retValue, null));
    }

};


