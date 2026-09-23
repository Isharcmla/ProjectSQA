package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35850;
     Object term35942;
     Object term37804;
     Object term37805;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35850 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term35942 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36126 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term35942, term35942.getClass(), "type", 45);
        setIntField(term36034, term36034.getClass(), "type", 0);
        setField(term35942, term35942.getClass(), "first", term36034);
        setField(term35942, term35942.getClass(), "last", term36126);
        term37804 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term37804, term37804.getClass(), "INEQ", null);
        setField(term37804, term37804.getClass(), "convention", null);
        setField(term37804, term37804.getClass(), "typeRegistry", null);
        setField(term37804, term37804.getClass(), "firstLink", null);
        setField(term37804, term37804.getClass(), "nextLink", null);
        setField(term37804, term37804.getClass(), "restrictUndefinedVisitor", null);
        setField(term37804, term37804.getClass(), "restrictNullVisitor", null);
        term37805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term37806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term37807 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term37805, term37805.getClass(), "str", null);
        setIntField(term37805, term37805.getClass(), "type", 45);
        setField(term37805, term37805.getClass(), "next", null);
        setDoubleField(term37806, term37806.getClass(), "number", 0.0);
        setIntField(term37806, term37806.getClass(), "type", 0);
        setField(term37806, term37806.getClass(), "next", null);
        setField(term37806, term37806.getClass(), "first", null);
        setField(term37806, term37806.getClass(), "last", null);
        setField(term37806, term37806.getClass(), "propListHead", null);
        setIntField(term37806, term37806.getClass(), "sourcePosition", 0);
        setField(term37806, term37806.getClass(), "jsType", null);
        setField(term37806, term37806.getClass(), "parent", null);
        setField(term37805, term37805.getClass(), "first", term37806);
        setField(term37807, term37807.getClass(), "str", null);
        setIntField(term37807, term37807.getClass(), "type", 0);
        setField(term37807, term37807.getClass(), "next", null);
        setField(term37807, term37807.getClass(), "first", null);
        setField(term37807, term37807.getClass(), "last", null);
        setField(term37807, term37807.getClass(), "propListHead", null);
        setIntField(term37807, term37807.getClass(), "sourcePosition", 0);
        setField(term37807, term37807.getClass(), "jsType", null);
        setField(term37807, term37807.getClass(), "parent", null);
        setField(term37805, term37805.getClass(), "last", term37807);
        setField(term37805, term37805.getClass(), "propListHead", null);
        setIntField(term37805, term37805.getClass(), "sourcePosition", 0);
        setField(term37805, term37805.getClass(), "jsType", null);
        setField(term37805, term37805.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term35942;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term35850, args);
        assertTrue(recursiveEquals(term35850, term37804));
        assertTrue(recursiveEquals(term35942, term37805));
        assertTrue(recursiveEquals(retValue, null));
    }

};


