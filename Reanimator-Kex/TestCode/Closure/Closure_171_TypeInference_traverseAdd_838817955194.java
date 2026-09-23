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

public class TypeInference_traverseAdd_838817955194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94107;
     Object term94177;
     Object term97266;
     Object term97267;

    public TypeInference_traverseAdd_838817955194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94107 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term94177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term94177, term94177.getClass(), "first", term94177);
        setIntField(term94247, term94247.getClass(), "type", 74);
        setField(term94177, term94177.getClass(), "next", term94247);
        setIntField(term94177, term94177.getClass(), "type", 1045547089);
        term97266 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term97266, term97266.getClass(), "compiler", null);
        setField(term97266, term97266.getClass(), "registry", null);
        setField(term97266, term97266.getClass(), "reverseInterpreter", null);
        setField(term97266, term97266.getClass(), "syntacticScope", null);
        setField(term97266, term97266.getClass(), "functionScope", null);
        setField(term97266, term97266.getClass(), "bottomScope", null);
        setField(term97266, term97266.getClass(), "assertionFunctionsMap", null);
        setField(term97266, term97266.getClass(), "unknownType", null);
        setField(term97266, term97266.getClass(), "cfg", null);
        setField(term97266, term97266.getClass(), "joinOp", null);
        setField(term97266, term97266.getClass(), "orderedWorkSet", null);
        term97267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97267, term97267.getClass(), "type", 1045547089);
        setIntField(term97268, term97268.getClass(), "type", 74);
        setField(term97268, term97268.getClass(), "next", null);
        setField(term97268, term97268.getClass(), "first", null);
        setField(term97268, term97268.getClass(), "last", null);
        setField(term97268, term97268.getClass(), "propListHead", null);
        setIntField(term97268, term97268.getClass(), "sourcePosition", 0);
        setField(term97268, term97268.getClass(), "jsType", null);
        setField(term97268, term97268.getClass(), "parent", null);
        setField(term97267, term97267.getClass(), "next", term97268);
        setField(term97267, term97267.getClass(), "first", term97267);
        setField(term97267, term97267.getClass(), "last", null);
        setField(term97267, term97267.getClass(), "propListHead", null);
        setIntField(term97267, term97267.getClass(), "sourcePosition", 0);
        setField(term97267, term97267.getClass(), "jsType", null);
        setField(term97267, term97267.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term94177;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseAdd", argTypes, term94107, args);
        assertTrue(recursiveEquals(term94107, term97266));
        assertTrue(recursiveEquals(term94177, term97267));
        assertTrue(recursiveEquals(retValue, null));
    }

};


