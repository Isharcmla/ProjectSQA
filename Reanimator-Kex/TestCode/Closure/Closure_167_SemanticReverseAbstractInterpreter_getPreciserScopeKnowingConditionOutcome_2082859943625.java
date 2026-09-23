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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177074;
     Object term177166;
     Object term177531;
     Object term177532;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177074 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term177166 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177258 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177350 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term177442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term177166, term177166.getClass(), "type", 111);
        setIntField(term177350, term177350.getClass(), "type", 111);
        setField(term177258, term177258.getClass(), "first", term177350);
        setField(term177166, term177166.getClass(), "parent", term177258);
        setField(term177166, term177166.getClass(), "first", term177442);
        term177531 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term177531, term177531.getClass(), "INEQ", null);
        setField(term177531, term177531.getClass(), "convention", null);
        setField(term177531, term177531.getClass(), "typeRegistry", null);
        setField(term177531, term177531.getClass(), "firstLink", null);
        setField(term177531, term177531.getClass(), "nextLink", null);
        setField(term177531, term177531.getClass(), "restrictUndefinedVisitor", null);
        setField(term177531, term177531.getClass(), "restrictNullVisitor", null);
        term177532 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177533 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177534 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177535 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term177532, term177532.getClass(), "number", 0.0);
        setIntField(term177532, term177532.getClass(), "type", 111);
        setField(term177532, term177532.getClass(), "next", null);
        setDoubleField(term177533, term177533.getClass(), "number", 0.0);
        setIntField(term177533, term177533.getClass(), "type", 0);
        setField(term177533, term177533.getClass(), "next", null);
        setField(term177533, term177533.getClass(), "first", null);
        setField(term177533, term177533.getClass(), "last", null);
        setField(term177533, term177533.getClass(), "propListHead", null);
        setIntField(term177533, term177533.getClass(), "sourcePosition", 0);
        setField(term177533, term177533.getClass(), "jsType", null);
        setField(term177533, term177533.getClass(), "parent", null);
        setField(term177532, term177532.getClass(), "first", term177533);
        setField(term177532, term177532.getClass(), "last", null);
        setField(term177532, term177532.getClass(), "propListHead", null);
        setIntField(term177532, term177532.getClass(), "sourcePosition", 0);
        setField(term177532, term177532.getClass(), "jsType", null);
        setDoubleField(term177534, term177534.getClass(), "number", 0.0);
        setIntField(term177534, term177534.getClass(), "type", 0);
        setField(term177534, term177534.getClass(), "next", null);
        setField(term177535, term177535.getClass(), "str", null);
        setIntField(term177535, term177535.getClass(), "type", 111);
        setField(term177535, term177535.getClass(), "next", null);
        setField(term177535, term177535.getClass(), "first", null);
        setField(term177535, term177535.getClass(), "last", null);
        setField(term177535, term177535.getClass(), "propListHead", null);
        setIntField(term177535, term177535.getClass(), "sourcePosition", 0);
        setField(term177535, term177535.getClass(), "jsType", null);
        setField(term177535, term177535.getClass(), "parent", null);
        setField(term177534, term177534.getClass(), "first", term177535);
        setField(term177534, term177534.getClass(), "last", null);
        setField(term177534, term177534.getClass(), "propListHead", null);
        setIntField(term177534, term177534.getClass(), "sourcePosition", 0);
        setField(term177534, term177534.getClass(), "jsType", null);
        setField(term177534, term177534.getClass(), "parent", null);
        setField(term177532, term177532.getClass(), "parent", term177534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term177166;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term177074, args);
        assertTrue(recursiveEquals(term177074, term177531));
        assertTrue(recursiveEquals(term177166, term177532));
        assertTrue(recursiveEquals(retValue, null));
    }

};


