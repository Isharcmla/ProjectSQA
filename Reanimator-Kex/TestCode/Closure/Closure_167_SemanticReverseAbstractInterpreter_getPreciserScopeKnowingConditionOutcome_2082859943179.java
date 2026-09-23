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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41117;
     Object term41209;
     Object term41461;
     Object term41462;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41117 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term41209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41393 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term41209, term41209.getClass(), "type", 45);
        setField(term41209, term41209.getClass(), "first", term41301);
        setField(term41209, term41209.getClass(), "last", term41393);
        term41461 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term41461, term41461.getClass(), "INEQ", null);
        setField(term41461, term41461.getClass(), "convention", null);
        setField(term41461, term41461.getClass(), "typeRegistry", null);
        setField(term41461, term41461.getClass(), "firstLink", null);
        setField(term41461, term41461.getClass(), "nextLink", null);
        setField(term41461, term41461.getClass(), "restrictUndefinedVisitor", null);
        setField(term41461, term41461.getClass(), "restrictNullVisitor", null);
        term41462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41463 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41464 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term41462, term41462.getClass(), "number", 0.0);
        setIntField(term41462, term41462.getClass(), "type", 45);
        setField(term41462, term41462.getClass(), "next", null);
        setDoubleField(term41463, term41463.getClass(), "number", 0.0);
        setIntField(term41463, term41463.getClass(), "type", 0);
        setField(term41463, term41463.getClass(), "next", null);
        setField(term41463, term41463.getClass(), "first", null);
        setField(term41463, term41463.getClass(), "last", null);
        setField(term41463, term41463.getClass(), "propListHead", null);
        setIntField(term41463, term41463.getClass(), "sourcePosition", 0);
        setField(term41463, term41463.getClass(), "jsType", null);
        setField(term41463, term41463.getClass(), "parent", null);
        setField(term41462, term41462.getClass(), "first", term41463);
        setDoubleField(term41464, term41464.getClass(), "number", 0.0);
        setIntField(term41464, term41464.getClass(), "type", 0);
        setField(term41464, term41464.getClass(), "next", null);
        setField(term41464, term41464.getClass(), "first", null);
        setField(term41464, term41464.getClass(), "last", null);
        setField(term41464, term41464.getClass(), "propListHead", null);
        setIntField(term41464, term41464.getClass(), "sourcePosition", 0);
        setField(term41464, term41464.getClass(), "jsType", null);
        setField(term41464, term41464.getClass(), "parent", null);
        setField(term41462, term41462.getClass(), "last", term41464);
        setField(term41462, term41462.getClass(), "propListHead", null);
        setIntField(term41462, term41462.getClass(), "sourcePosition", 0);
        setField(term41462, term41462.getClass(), "jsType", null);
        setField(term41462, term41462.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term41209;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term41117, args);
        assertTrue(recursiveEquals(term41117, term41461));
        assertTrue(recursiveEquals(term41209, term41462));
        assertTrue(recursiveEquals(retValue, null));
    }

};


