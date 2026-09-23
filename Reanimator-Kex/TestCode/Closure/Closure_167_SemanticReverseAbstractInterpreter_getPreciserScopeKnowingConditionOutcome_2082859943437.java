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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113880;
     Object term113972;
     Object term114557;
     Object term114558;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113880 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term113972 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114156 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term113972, term113972.getClass(), "type", 111);
        setField(term114064, term114064.getClass(), "first", term113972);
        setField(term113972, term113972.getClass(), "parent", term114064);
        setIntField(term114156, term114156.getClass(), "type", 111);
        setField(term114156, term114156.getClass(), "jsType", null);
        setField(term113972, term113972.getClass(), "first", term114156);
        setField(term113972, term113972.getClass(), "jsType", null);
        term114557 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term114557, term114557.getClass(), "INEQ", null);
        setField(term114557, term114557.getClass(), "convention", null);
        setField(term114557, term114557.getClass(), "typeRegistry", null);
        setField(term114557, term114557.getClass(), "firstLink", null);
        setField(term114557, term114557.getClass(), "nextLink", null);
        setField(term114557, term114557.getClass(), "restrictUndefinedVisitor", null);
        setField(term114557, term114557.getClass(), "restrictNullVisitor", null);
        term114558 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term114560 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term114558, term114558.getClass(), "number", 0.0);
        setIntField(term114558, term114558.getClass(), "type", 111);
        setField(term114558, term114558.getClass(), "next", null);
        setField(term114559, term114559.getClass(), "str", null);
        setIntField(term114559, term114559.getClass(), "type", 111);
        setField(term114559, term114559.getClass(), "next", null);
        setField(term114559, term114559.getClass(), "first", null);
        setField(term114559, term114559.getClass(), "last", null);
        setField(term114559, term114559.getClass(), "propListHead", null);
        setIntField(term114559, term114559.getClass(), "sourcePosition", 0);
        setField(term114559, term114559.getClass(), "jsType", null);
        setField(term114559, term114559.getClass(), "parent", null);
        setField(term114558, term114558.getClass(), "first", term114559);
        setField(term114558, term114558.getClass(), "last", null);
        setField(term114558, term114558.getClass(), "propListHead", null);
        setIntField(term114558, term114558.getClass(), "sourcePosition", 0);
        setField(term114558, term114558.getClass(), "jsType", null);
        setDoubleField(term114560, term114560.getClass(), "number", 0.0);
        setIntField(term114560, term114560.getClass(), "type", 0);
        setField(term114560, term114560.getClass(), "next", null);
        setField(term114560, term114560.getClass(), "first", term114558);
        setField(term114560, term114560.getClass(), "last", null);
        setField(term114560, term114560.getClass(), "propListHead", null);
        setIntField(term114560, term114560.getClass(), "sourcePosition", 0);
        setField(term114560, term114560.getClass(), "jsType", null);
        setField(term114560, term114560.getClass(), "parent", null);
        setField(term114558, term114558.getClass(), "parent", term114560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term113972;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term113880, args);
        assertTrue(recursiveEquals(term113880, term114557));
        assertTrue(recursiveEquals(term113972, term114558));
        assertTrue(recursiveEquals(retValue, null));
    }

};


