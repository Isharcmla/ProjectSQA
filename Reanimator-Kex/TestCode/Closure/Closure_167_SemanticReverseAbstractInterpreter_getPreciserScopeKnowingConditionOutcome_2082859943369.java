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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96938;
     Object term97030;
     Object term97272;
     Object term97273;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96938 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term97030 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term97214 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term97030, term97030.getClass(), "type", 13);
        setIntField(term97122, term97122.getClass(), "type", 0);
        setField(term97030, term97030.getClass(), "first", term97122);
        setField(term97030, term97030.getClass(), "last", term97214);
        term97272 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term97272, term97272.getClass(), "INEQ", null);
        setField(term97272, term97272.getClass(), "convention", null);
        setField(term97272, term97272.getClass(), "typeRegistry", null);
        setField(term97272, term97272.getClass(), "firstLink", null);
        setField(term97272, term97272.getClass(), "nextLink", null);
        setField(term97272, term97272.getClass(), "restrictUndefinedVisitor", null);
        setField(term97272, term97272.getClass(), "restrictNullVisitor", null);
        term97273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97274 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term97275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term97273, term97273.getClass(), "number", 0.0);
        setIntField(term97273, term97273.getClass(), "type", 13);
        setField(term97273, term97273.getClass(), "next", null);
        setField(term97274, term97274.getClass(), "str", null);
        setIntField(term97274, term97274.getClass(), "type", 0);
        setField(term97274, term97274.getClass(), "next", null);
        setField(term97274, term97274.getClass(), "first", null);
        setField(term97274, term97274.getClass(), "last", null);
        setField(term97274, term97274.getClass(), "propListHead", null);
        setIntField(term97274, term97274.getClass(), "sourcePosition", 0);
        setField(term97274, term97274.getClass(), "jsType", null);
        setField(term97274, term97274.getClass(), "parent", null);
        setField(term97273, term97273.getClass(), "first", term97274);
        setField(term97275, term97275.getClass(), "str", null);
        setIntField(term97275, term97275.getClass(), "type", 0);
        setField(term97275, term97275.getClass(), "next", null);
        setField(term97275, term97275.getClass(), "first", null);
        setField(term97275, term97275.getClass(), "last", null);
        setField(term97275, term97275.getClass(), "propListHead", null);
        setIntField(term97275, term97275.getClass(), "sourcePosition", 0);
        setField(term97275, term97275.getClass(), "jsType", null);
        setField(term97275, term97275.getClass(), "parent", null);
        setField(term97273, term97273.getClass(), "last", term97275);
        setField(term97273, term97273.getClass(), "propListHead", null);
        setIntField(term97273, term97273.getClass(), "sourcePosition", 0);
        setField(term97273, term97273.getClass(), "jsType", null);
        setField(term97273, term97273.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term97030;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term96938, args);
        assertTrue(recursiveEquals(term96938, term97272));
        assertTrue(recursiveEquals(term97030, term97273));
        assertTrue(recursiveEquals(retValue, null));
    }

};


