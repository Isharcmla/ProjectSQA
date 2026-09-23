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

public class TypeInference_traverseChildren_1478920219112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64517;
     Object term64587;
     Object term68177;
     Object term68178;

    public TypeInference_traverseChildren_1478920219112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64517 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term64587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64587, term64587.getClass(), "first", term64587);
        setIntField(term64587, term64587.getClass(), "type", 56);
        term68177 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term68177, term68177.getClass(), "compiler", null);
        setField(term68177, term68177.getClass(), "registry", null);
        setField(term68177, term68177.getClass(), "reverseInterpreter", null);
        setField(term68177, term68177.getClass(), "syntacticScope", null);
        setField(term68177, term68177.getClass(), "functionScope", null);
        setField(term68177, term68177.getClass(), "bottomScope", null);
        setField(term68177, term68177.getClass(), "assertionFunctionsMap", null);
        setField(term68177, term68177.getClass(), "unknownType", null);
        setField(term68177, term68177.getClass(), "cfg", null);
        setField(term68177, term68177.getClass(), "joinOp", null);
        setField(term68177, term68177.getClass(), "orderedWorkSet", null);
        term68178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68178, term68178.getClass(), "type", 56);
        setField(term68178, term68178.getClass(), "next", null);
        setField(term68178, term68178.getClass(), "first", term68178);
        setField(term68178, term68178.getClass(), "last", null);
        setField(term68178, term68178.getClass(), "propListHead", null);
        setIntField(term68178, term68178.getClass(), "sourcePosition", 0);
        setField(term68178, term68178.getClass(), "jsType", null);
        setField(term68178, term68178.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term64587;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term64517, args);
        assertTrue(recursiveEquals(term64517, term68177));
        assertTrue(recursiveEquals(term64587, term68178));
        assertTrue(recursiveEquals(retValue, null));
    }

};


