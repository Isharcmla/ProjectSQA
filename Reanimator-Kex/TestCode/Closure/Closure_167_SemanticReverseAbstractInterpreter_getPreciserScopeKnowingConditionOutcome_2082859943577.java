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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161666;
     Object term161758;
     Object term162096;
     Object term162097;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161666 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term161758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161850 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161942 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term162012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term161758, term161758.getClass(), "type", 111);
        setIntField(term161942, term161942.getClass(), "type", 111);
        setField(term161850, term161850.getClass(), "first", term161942);
        setField(term161758, term161758.getClass(), "parent", term161850);
        setIntField(term162012, term162012.getClass(), "type", 111);
        setField(term161758, term161758.getClass(), "first", term162012);
        term162096 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term162096, term162096.getClass(), "INEQ", null);
        setField(term162096, term162096.getClass(), "convention", null);
        setField(term162096, term162096.getClass(), "typeRegistry", null);
        setField(term162096, term162096.getClass(), "firstLink", null);
        setField(term162096, term162096.getClass(), "nextLink", null);
        setField(term162096, term162096.getClass(), "restrictUndefinedVisitor", null);
        setField(term162096, term162096.getClass(), "restrictNullVisitor", null);
        term162097 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term162097, term162097.getClass(), "number", 0.0);
        setIntField(term162097, term162097.getClass(), "type", 111);
        setField(term162097, term162097.getClass(), "next", null);
        setIntField(term162098, term162098.getClass(), "type", 111);
        setField(term162098, term162098.getClass(), "next", null);
        setField(term162098, term162098.getClass(), "first", null);
        setField(term162098, term162098.getClass(), "last", null);
        setField(term162098, term162098.getClass(), "propListHead", null);
        setIntField(term162098, term162098.getClass(), "sourcePosition", 0);
        setField(term162098, term162098.getClass(), "jsType", null);
        setField(term162098, term162098.getClass(), "parent", null);
        setField(term162097, term162097.getClass(), "first", term162098);
        setField(term162097, term162097.getClass(), "last", null);
        setField(term162097, term162097.getClass(), "propListHead", null);
        setIntField(term162097, term162097.getClass(), "sourcePosition", 0);
        setField(term162097, term162097.getClass(), "jsType", null);
        setDoubleField(term162099, term162099.getClass(), "number", 0.0);
        setIntField(term162099, term162099.getClass(), "type", 0);
        setField(term162099, term162099.getClass(), "next", null);
        setField(term162100, term162100.getClass(), "str", null);
        setIntField(term162100, term162100.getClass(), "type", 111);
        setField(term162100, term162100.getClass(), "next", null);
        setField(term162100, term162100.getClass(), "first", null);
        setField(term162100, term162100.getClass(), "last", null);
        setField(term162100, term162100.getClass(), "propListHead", null);
        setIntField(term162100, term162100.getClass(), "sourcePosition", 0);
        setField(term162100, term162100.getClass(), "jsType", null);
        setField(term162100, term162100.getClass(), "parent", null);
        setField(term162099, term162099.getClass(), "first", term162100);
        setField(term162099, term162099.getClass(), "last", null);
        setField(term162099, term162099.getClass(), "propListHead", null);
        setIntField(term162099, term162099.getClass(), "sourcePosition", 0);
        setField(term162099, term162099.getClass(), "jsType", null);
        setField(term162099, term162099.getClass(), "parent", null);
        setField(term162097, term162097.getClass(), "parent", term162099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term161758;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term161666, args);
        assertTrue(recursiveEquals(term161666, term162096));
        assertTrue(recursiveEquals(term161758, term162097));
        assertTrue(recursiveEquals(retValue, null));
    }

};


