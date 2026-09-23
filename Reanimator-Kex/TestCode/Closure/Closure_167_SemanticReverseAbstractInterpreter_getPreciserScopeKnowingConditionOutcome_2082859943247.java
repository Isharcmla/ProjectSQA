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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60021;
     Object term60113;
     Object term60359;
     Object term60360;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60021 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term60113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60297 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term60113, term60113.getClass(), "type", 12);
        setIntField(term60205, term60205.getClass(), "type", -13);
        setField(term60113, term60113.getClass(), "first", term60205);
        setIntField(term60297, term60297.getClass(), "type", 12);
        setField(term60113, term60113.getClass(), "last", term60297);
        term60359 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term60359, term60359.getClass(), "INEQ", null);
        setField(term60359, term60359.getClass(), "convention", null);
        setField(term60359, term60359.getClass(), "typeRegistry", null);
        setField(term60359, term60359.getClass(), "firstLink", null);
        setField(term60359, term60359.getClass(), "nextLink", null);
        setField(term60359, term60359.getClass(), "restrictUndefinedVisitor", null);
        setField(term60359, term60359.getClass(), "restrictNullVisitor", null);
        term60360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60362 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term60360, term60360.getClass(), "str", null);
        setIntField(term60360, term60360.getClass(), "type", 12);
        setField(term60360, term60360.getClass(), "next", null);
        setField(term60361, term60361.getClass(), "str", null);
        setIntField(term60361, term60361.getClass(), "type", -13);
        setField(term60361, term60361.getClass(), "next", null);
        setField(term60361, term60361.getClass(), "first", null);
        setField(term60361, term60361.getClass(), "last", null);
        setField(term60361, term60361.getClass(), "propListHead", null);
        setIntField(term60361, term60361.getClass(), "sourcePosition", 0);
        setField(term60361, term60361.getClass(), "jsType", null);
        setField(term60361, term60361.getClass(), "parent", null);
        setField(term60360, term60360.getClass(), "first", term60361);
        setDoubleField(term60362, term60362.getClass(), "number", 0.0);
        setIntField(term60362, term60362.getClass(), "type", 12);
        setField(term60362, term60362.getClass(), "next", null);
        setField(term60362, term60362.getClass(), "first", null);
        setField(term60362, term60362.getClass(), "last", null);
        setField(term60362, term60362.getClass(), "propListHead", null);
        setIntField(term60362, term60362.getClass(), "sourcePosition", 0);
        setField(term60362, term60362.getClass(), "jsType", null);
        setField(term60362, term60362.getClass(), "parent", null);
        setField(term60360, term60360.getClass(), "last", term60362);
        setField(term60360, term60360.getClass(), "propListHead", null);
        setIntField(term60360, term60360.getClass(), "sourcePosition", 0);
        setField(term60360, term60360.getClass(), "jsType", null);
        setField(term60360, term60360.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term60113;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term60021, args);
        assertTrue(recursiveEquals(term60021, term60359));
        assertTrue(recursiveEquals(term60113, term60360));
        assertTrue(recursiveEquals(retValue, null));
    }

};


