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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181586;
     Object term181678;
     Object term181925;
     Object term181926;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181586 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term181678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181770 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term181862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term181678, term181678.getClass(), "type", 12);
        setIntField(term181770, term181770.getClass(), "type", 0);
        setField(term181678, term181678.getClass(), "first", term181770);
        setField(term181678, term181678.getClass(), "last", term181862);
        term181925 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term181925, term181925.getClass(), "INEQ", null);
        setField(term181925, term181925.getClass(), "convention", null);
        setField(term181925, term181925.getClass(), "typeRegistry", null);
        setField(term181925, term181925.getClass(), "firstLink", null);
        setField(term181925, term181925.getClass(), "nextLink", null);
        setField(term181925, term181925.getClass(), "restrictUndefinedVisitor", null);
        setField(term181925, term181925.getClass(), "restrictNullVisitor", null);
        term181926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181927 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term181928 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term181926, term181926.getClass(), "number", 0.0);
        setIntField(term181926, term181926.getClass(), "type", 12);
        setField(term181926, term181926.getClass(), "next", null);
        setField(term181927, term181927.getClass(), "str", null);
        setIntField(term181927, term181927.getClass(), "type", 0);
        setField(term181927, term181927.getClass(), "next", null);
        setField(term181927, term181927.getClass(), "first", null);
        setField(term181927, term181927.getClass(), "last", null);
        setField(term181927, term181927.getClass(), "propListHead", null);
        setIntField(term181927, term181927.getClass(), "sourcePosition", 0);
        setField(term181927, term181927.getClass(), "jsType", null);
        setField(term181927, term181927.getClass(), "parent", null);
        setField(term181926, term181926.getClass(), "first", term181927);
        setDoubleField(term181928, term181928.getClass(), "number", 0.0);
        setIntField(term181928, term181928.getClass(), "type", 0);
        setField(term181928, term181928.getClass(), "next", null);
        setField(term181928, term181928.getClass(), "first", null);
        setField(term181928, term181928.getClass(), "last", null);
        setField(term181928, term181928.getClass(), "propListHead", null);
        setIntField(term181928, term181928.getClass(), "sourcePosition", 0);
        setField(term181928, term181928.getClass(), "jsType", null);
        setField(term181928, term181928.getClass(), "parent", null);
        setField(term181926, term181926.getClass(), "last", term181928);
        setField(term181926, term181926.getClass(), "propListHead", null);
        setIntField(term181926, term181926.getClass(), "sourcePosition", 0);
        setField(term181926, term181926.getClass(), "jsType", null);
        setField(term181926, term181926.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term181678;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term181586, args);
        assertTrue(recursiveEquals(term181586, term181925));
        assertTrue(recursiveEquals(term181678, term181926));
        assertTrue(recursiveEquals(retValue, null));
    }

};


