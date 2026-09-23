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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173784;
     Object term173876;
     Object term174122;
     Object term174123;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173784 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term173876 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173968 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174060 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term173876, term173876.getClass(), "type", 12);
        setIntField(term173968, term173968.getClass(), "type", 0);
        setField(term173876, term173876.getClass(), "first", term173968);
        setField(term173876, term173876.getClass(), "last", term174060);
        term174122 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term174122, term174122.getClass(), "INEQ", null);
        setField(term174122, term174122.getClass(), "convention", null);
        setField(term174122, term174122.getClass(), "typeRegistry", null);
        setField(term174122, term174122.getClass(), "firstLink", null);
        setField(term174122, term174122.getClass(), "nextLink", null);
        setField(term174122, term174122.getClass(), "restrictUndefinedVisitor", null);
        setField(term174122, term174122.getClass(), "restrictNullVisitor", null);
        term174123 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174124 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174125 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term174123, term174123.getClass(), "str", null);
        setIntField(term174123, term174123.getClass(), "type", 12);
        setField(term174123, term174123.getClass(), "next", null);
        setDoubleField(term174124, term174124.getClass(), "number", 0.0);
        setIntField(term174124, term174124.getClass(), "type", 0);
        setField(term174124, term174124.getClass(), "next", null);
        setField(term174124, term174124.getClass(), "first", null);
        setField(term174124, term174124.getClass(), "last", null);
        setField(term174124, term174124.getClass(), "propListHead", null);
        setIntField(term174124, term174124.getClass(), "sourcePosition", 0);
        setField(term174124, term174124.getClass(), "jsType", null);
        setField(term174124, term174124.getClass(), "parent", null);
        setField(term174123, term174123.getClass(), "first", term174124);
        setField(term174125, term174125.getClass(), "str", null);
        setIntField(term174125, term174125.getClass(), "type", 0);
        setField(term174125, term174125.getClass(), "next", null);
        setField(term174125, term174125.getClass(), "first", null);
        setField(term174125, term174125.getClass(), "last", null);
        setField(term174125, term174125.getClass(), "propListHead", null);
        setIntField(term174125, term174125.getClass(), "sourcePosition", 0);
        setField(term174125, term174125.getClass(), "jsType", null);
        setField(term174125, term174125.getClass(), "parent", null);
        setField(term174123, term174123.getClass(), "last", term174125);
        setField(term174123, term174123.getClass(), "propListHead", null);
        setIntField(term174123, term174123.getClass(), "sourcePosition", 0);
        setField(term174123, term174123.getClass(), "jsType", null);
        setField(term174123, term174123.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term173876;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term173784, args);
        assertTrue(recursiveEquals(term173784, term174122));
        assertTrue(recursiveEquals(term173876, term174123));
        assertTrue(recursiveEquals(retValue, null));
    }

};


