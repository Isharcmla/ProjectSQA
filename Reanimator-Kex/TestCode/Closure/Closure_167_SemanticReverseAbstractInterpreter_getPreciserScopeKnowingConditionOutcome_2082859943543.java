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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150960;
     Object term151052;
     Object term151263;
     Object term151264;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150960 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term151052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term151144 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term151236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term151052, term151052.getClass(), "type", 52);
        setField(term151052, term151052.getClass(), "first", term151144);
        setField(term151052, term151052.getClass(), "last", term151236);
        term151263 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term151263, term151263.getClass(), "INEQ", null);
        setField(term151263, term151263.getClass(), "convention", null);
        setField(term151263, term151263.getClass(), "typeRegistry", null);
        setField(term151263, term151263.getClass(), "firstLink", null);
        setField(term151263, term151263.getClass(), "nextLink", null);
        setField(term151263, term151263.getClass(), "restrictUndefinedVisitor", null);
        setField(term151263, term151263.getClass(), "restrictNullVisitor", null);
        term151264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term151265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term151266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term151264, term151264.getClass(), "str", null);
        setIntField(term151264, term151264.getClass(), "type", 52);
        setField(term151264, term151264.getClass(), "next", null);
        setField(term151265, term151265.getClass(), "str", null);
        setIntField(term151265, term151265.getClass(), "type", 0);
        setField(term151265, term151265.getClass(), "next", null);
        setField(term151265, term151265.getClass(), "first", null);
        setField(term151265, term151265.getClass(), "last", null);
        setField(term151265, term151265.getClass(), "propListHead", null);
        setIntField(term151265, term151265.getClass(), "sourcePosition", 0);
        setField(term151265, term151265.getClass(), "jsType", null);
        setField(term151265, term151265.getClass(), "parent", null);
        setField(term151264, term151264.getClass(), "first", term151265);
        setField(term151266, term151266.getClass(), "str", null);
        setIntField(term151266, term151266.getClass(), "type", 0);
        setField(term151266, term151266.getClass(), "next", null);
        setField(term151266, term151266.getClass(), "first", null);
        setField(term151266, term151266.getClass(), "last", null);
        setField(term151266, term151266.getClass(), "propListHead", null);
        setIntField(term151266, term151266.getClass(), "sourcePosition", 0);
        setField(term151266, term151266.getClass(), "jsType", null);
        setField(term151266, term151266.getClass(), "parent", null);
        setField(term151264, term151264.getClass(), "last", term151266);
        setField(term151264, term151264.getClass(), "propListHead", null);
        setIntField(term151264, term151264.getClass(), "sourcePosition", 0);
        setField(term151264, term151264.getClass(), "jsType", null);
        setField(term151264, term151264.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term151052;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term150960, args);
        assertTrue(recursiveEquals(term150960, term151263));
        assertTrue(recursiveEquals(term151052, term151264));
        assertTrue(recursiveEquals(retValue, null));
    }

};


