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

public class TypeInference_traverseNew_1898640706151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49023;
     Object term49093;
     Object term49701;
     Object term49702;

    public TypeInference_traverseNew_1898640706151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49023 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term49093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49093, term49093.getClass(), "first", term49093);
        setIntField(term49093, term49093.getClass(), "type", 115);
        term49701 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term49701, term49701.getClass(), "compiler", null);
        setField(term49701, term49701.getClass(), "registry", null);
        setField(term49701, term49701.getClass(), "reverseInterpreter", null);
        setField(term49701, term49701.getClass(), "syntacticScope", null);
        setField(term49701, term49701.getClass(), "functionScope", null);
        setField(term49701, term49701.getClass(), "bottomScope", null);
        setField(term49701, term49701.getClass(), "assertionFunctionsMap", null);
        setField(term49701, term49701.getClass(), "cfg", null);
        setField(term49701, term49701.getClass(), "joinOp", null);
        setField(term49701, term49701.getClass(), "orderedWorkSet", null);
        term49702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49702, term49702.getClass(), "type", 115);
        setField(term49702, term49702.getClass(), "next", null);
        setField(term49702, term49702.getClass(), "first", term49702);
        setField(term49702, term49702.getClass(), "last", null);
        setField(term49702, term49702.getClass(), "propListHead", null);
        setIntField(term49702, term49702.getClass(), "sourcePosition", 0);
        setField(term49702, term49702.getClass(), "jsType", null);
        setField(term49702, term49702.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term49093;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseNew", argTypes, term49023, args);
        assertTrue(recursiveEquals(term49023, term49701));
        assertTrue(recursiveEquals(term49093, term49702));
        assertTrue(recursiveEquals(retValue, null));
    }

};


