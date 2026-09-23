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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34333;
     Object term34425;
     Object term34666;
     Object term34667;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34333 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term34425 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term34517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term34609 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term34425, term34425.getClass(), "type", 45);
        setIntField(term34517, term34517.getClass(), "type", 45);
        setField(term34425, term34425.getClass(), "first", term34517);
        setIntField(term34609, term34609.getClass(), "type", 45);
        setField(term34425, term34425.getClass(), "last", term34609);
        term34666 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term34666, term34666.getClass(), "INEQ", null);
        setField(term34666, term34666.getClass(), "convention", null);
        setField(term34666, term34666.getClass(), "typeRegistry", null);
        setField(term34666, term34666.getClass(), "firstLink", null);
        setField(term34666, term34666.getClass(), "nextLink", null);
        setField(term34666, term34666.getClass(), "restrictUndefinedVisitor", null);
        setField(term34666, term34666.getClass(), "restrictNullVisitor", null);
        term34667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term34668 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term34669 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34667, term34667.getClass(), "str", null);
        setIntField(term34667, term34667.getClass(), "type", 45);
        setField(term34667, term34667.getClass(), "next", null);
        setField(term34668, term34668.getClass(), "str", null);
        setIntField(term34668, term34668.getClass(), "type", 45);
        setField(term34668, term34668.getClass(), "next", null);
        setField(term34668, term34668.getClass(), "first", null);
        setField(term34668, term34668.getClass(), "last", null);
        setField(term34668, term34668.getClass(), "propListHead", null);
        setIntField(term34668, term34668.getClass(), "sourcePosition", 0);
        setField(term34668, term34668.getClass(), "jsType", null);
        setField(term34668, term34668.getClass(), "parent", null);
        setField(term34667, term34667.getClass(), "first", term34668);
        setField(term34669, term34669.getClass(), "str", null);
        setIntField(term34669, term34669.getClass(), "type", 45);
        setField(term34669, term34669.getClass(), "next", null);
        setField(term34669, term34669.getClass(), "first", null);
        setField(term34669, term34669.getClass(), "last", null);
        setField(term34669, term34669.getClass(), "propListHead", null);
        setIntField(term34669, term34669.getClass(), "sourcePosition", 0);
        setField(term34669, term34669.getClass(), "jsType", null);
        setField(term34669, term34669.getClass(), "parent", null);
        setField(term34667, term34667.getClass(), "last", term34669);
        setField(term34667, term34667.getClass(), "propListHead", null);
        setIntField(term34667, term34667.getClass(), "sourcePosition", 0);
        setField(term34667, term34667.getClass(), "jsType", null);
        setField(term34667, term34667.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term34425;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term34333, args);
        assertTrue(recursiveEquals(term34333, term34666));
        assertTrue(recursiveEquals(term34425, term34667));
        assertTrue(recursiveEquals(retValue, null));
    }

};


