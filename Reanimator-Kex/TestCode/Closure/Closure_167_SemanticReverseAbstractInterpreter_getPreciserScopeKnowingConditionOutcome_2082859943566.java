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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157836;
     Object term157928;
     Object term158759;
     Object term158760;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157836 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term157928 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term158112 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term157928, term157928.getClass(), "type", 12);
        setIntField(term158020, term158020.getClass(), "type", 0);
        setField(term157928, term157928.getClass(), "first", term158020);
        setField(term157928, term157928.getClass(), "last", term158112);
        term158759 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term158759, term158759.getClass(), "INEQ", null);
        setField(term158759, term158759.getClass(), "convention", null);
        setField(term158759, term158759.getClass(), "typeRegistry", null);
        setField(term158759, term158759.getClass(), "firstLink", null);
        setField(term158759, term158759.getClass(), "nextLink", null);
        setField(term158759, term158759.getClass(), "restrictUndefinedVisitor", null);
        setField(term158759, term158759.getClass(), "restrictNullVisitor", null);
        term158760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158761 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term158762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term158760, term158760.getClass(), "number", 0.0);
        setIntField(term158760, term158760.getClass(), "type", 12);
        setField(term158760, term158760.getClass(), "next", null);
        setField(term158761, term158761.getClass(), "str", null);
        setIntField(term158761, term158761.getClass(), "type", 0);
        setField(term158761, term158761.getClass(), "next", null);
        setField(term158761, term158761.getClass(), "first", null);
        setField(term158761, term158761.getClass(), "last", null);
        setField(term158761, term158761.getClass(), "propListHead", null);
        setIntField(term158761, term158761.getClass(), "sourcePosition", 0);
        setField(term158761, term158761.getClass(), "jsType", null);
        setField(term158761, term158761.getClass(), "parent", null);
        setField(term158760, term158760.getClass(), "first", term158761);
        setField(term158762, term158762.getClass(), "str", null);
        setIntField(term158762, term158762.getClass(), "type", 0);
        setField(term158762, term158762.getClass(), "next", null);
        setField(term158762, term158762.getClass(), "first", null);
        setField(term158762, term158762.getClass(), "last", null);
        setField(term158762, term158762.getClass(), "propListHead", null);
        setIntField(term158762, term158762.getClass(), "sourcePosition", 0);
        setField(term158762, term158762.getClass(), "jsType", null);
        setField(term158762, term158762.getClass(), "parent", null);
        setField(term158760, term158760.getClass(), "last", term158762);
        setField(term158760, term158760.getClass(), "propListHead", null);
        setIntField(term158760, term158760.getClass(), "sourcePosition", 0);
        setField(term158760, term158760.getClass(), "jsType", null);
        setField(term158760, term158760.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term157928;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term157836, args);
        assertTrue(recursiveEquals(term157836, term158759));
        assertTrue(recursiveEquals(term157928, term158760));
        assertTrue(recursiveEquals(retValue, null));
    }

};


