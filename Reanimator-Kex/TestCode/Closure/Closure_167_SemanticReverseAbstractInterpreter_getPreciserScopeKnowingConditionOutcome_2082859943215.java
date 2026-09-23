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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50913;
     Object term51005;
     Object term51251;
     Object term51252;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50913 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term51005 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51189 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term51005, term51005.getClass(), "type", 12);
        setIntField(term51097, term51097.getClass(), "type", 12);
        setField(term51005, term51005.getClass(), "first", term51097);
        setField(term51005, term51005.getClass(), "last", term51189);
        term51251 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term51251, term51251.getClass(), "INEQ", null);
        setField(term51251, term51251.getClass(), "convention", null);
        setField(term51251, term51251.getClass(), "typeRegistry", null);
        setField(term51251, term51251.getClass(), "firstLink", null);
        setField(term51251, term51251.getClass(), "nextLink", null);
        setField(term51251, term51251.getClass(), "restrictUndefinedVisitor", null);
        setField(term51251, term51251.getClass(), "restrictNullVisitor", null);
        term51252 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51253 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term51252, term51252.getClass(), "str", null);
        setIntField(term51252, term51252.getClass(), "type", 12);
        setField(term51252, term51252.getClass(), "next", null);
        setField(term51253, term51253.getClass(), "str", null);
        setIntField(term51253, term51253.getClass(), "type", 12);
        setField(term51253, term51253.getClass(), "next", null);
        setField(term51253, term51253.getClass(), "first", null);
        setField(term51253, term51253.getClass(), "last", null);
        setField(term51253, term51253.getClass(), "propListHead", null);
        setIntField(term51253, term51253.getClass(), "sourcePosition", 0);
        setField(term51253, term51253.getClass(), "jsType", null);
        setField(term51253, term51253.getClass(), "parent", null);
        setField(term51252, term51252.getClass(), "first", term51253);
        setDoubleField(term51254, term51254.getClass(), "number", 0.0);
        setIntField(term51254, term51254.getClass(), "type", 0);
        setField(term51254, term51254.getClass(), "next", null);
        setField(term51254, term51254.getClass(), "first", null);
        setField(term51254, term51254.getClass(), "last", null);
        setField(term51254, term51254.getClass(), "propListHead", null);
        setIntField(term51254, term51254.getClass(), "sourcePosition", 0);
        setField(term51254, term51254.getClass(), "jsType", null);
        setField(term51254, term51254.getClass(), "parent", null);
        setField(term51252, term51252.getClass(), "last", term51254);
        setField(term51252, term51252.getClass(), "propListHead", null);
        setIntField(term51252, term51252.getClass(), "sourcePosition", 0);
        setField(term51252, term51252.getClass(), "jsType", null);
        setField(term51252, term51252.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term51005;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term50913, args);
        assertTrue(recursiveEquals(term50913, term51251));
        assertTrue(recursiveEquals(term51005, term51252));
        assertTrue(recursiveEquals(retValue, null));
    }

};


