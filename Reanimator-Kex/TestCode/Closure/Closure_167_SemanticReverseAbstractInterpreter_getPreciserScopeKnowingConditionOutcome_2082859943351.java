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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91289;
     Object term91381;
     Object term91605;
     Object term91606;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91289 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term91381 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term91473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91381, term91381.getClass(), "type", 13);
        setIntField(term91473, term91473.getClass(), "type", 0);
        setField(term91381, term91381.getClass(), "first", term91473);
        setField(term91381, term91381.getClass(), "last", term91543);
        term91605 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term91605, term91605.getClass(), "INEQ", null);
        setField(term91605, term91605.getClass(), "convention", null);
        setField(term91605, term91605.getClass(), "typeRegistry", null);
        setField(term91605, term91605.getClass(), "firstLink", null);
        setField(term91605, term91605.getClass(), "nextLink", null);
        setField(term91605, term91605.getClass(), "restrictUndefinedVisitor", null);
        setField(term91605, term91605.getClass(), "restrictNullVisitor", null);
        term91606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term91607 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term91606, term91606.getClass(), "str", null);
        setIntField(term91606, term91606.getClass(), "type", 13);
        setField(term91606, term91606.getClass(), "next", null);
        setDoubleField(term91607, term91607.getClass(), "number", 0.0);
        setIntField(term91607, term91607.getClass(), "type", 0);
        setField(term91607, term91607.getClass(), "next", null);
        setField(term91607, term91607.getClass(), "first", null);
        setField(term91607, term91607.getClass(), "last", null);
        setField(term91607, term91607.getClass(), "propListHead", null);
        setIntField(term91607, term91607.getClass(), "sourcePosition", 0);
        setField(term91607, term91607.getClass(), "jsType", null);
        setField(term91607, term91607.getClass(), "parent", null);
        setField(term91606, term91606.getClass(), "first", term91607);
        setIntField(term91608, term91608.getClass(), "type", 0);
        setField(term91608, term91608.getClass(), "next", null);
        setField(term91608, term91608.getClass(), "first", null);
        setField(term91608, term91608.getClass(), "last", null);
        setField(term91608, term91608.getClass(), "propListHead", null);
        setIntField(term91608, term91608.getClass(), "sourcePosition", 0);
        setField(term91608, term91608.getClass(), "jsType", null);
        setField(term91608, term91608.getClass(), "parent", null);
        setField(term91606, term91606.getClass(), "last", term91608);
        setField(term91606, term91606.getClass(), "propListHead", null);
        setIntField(term91606, term91606.getClass(), "sourcePosition", 0);
        setField(term91606, term91606.getClass(), "jsType", null);
        setField(term91606, term91606.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term91381;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term91289, args);
        assertTrue(recursiveEquals(term91289, term91605));
        assertTrue(recursiveEquals(term91381, term91606));
        assertTrue(recursiveEquals(retValue, null));
    }

};


