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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169905;
     Object term169997;
     Object term170357;
     Object term170358;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169905 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term169997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170089 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term169997, term169997.getClass(), "type", 111);
        setIntField(term170181, term170181.getClass(), "type", 111);
        setField(term170089, term170089.getClass(), "first", term170181);
        setField(term169997, term169997.getClass(), "parent", term170089);
        setField(term169997, term169997.getClass(), "first", term170273);
        term170357 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term170357, term170357.getClass(), "INEQ", null);
        setField(term170357, term170357.getClass(), "convention", null);
        setField(term170357, term170357.getClass(), "typeRegistry", null);
        setField(term170357, term170357.getClass(), "firstLink", null);
        setField(term170357, term170357.getClass(), "nextLink", null);
        setField(term170357, term170357.getClass(), "restrictUndefinedVisitor", null);
        setField(term170357, term170357.getClass(), "restrictNullVisitor", null);
        term170358 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170359 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term170358, term170358.getClass(), "number", 0.0);
        setIntField(term170358, term170358.getClass(), "type", 111);
        setField(term170358, term170358.getClass(), "next", null);
        setField(term170359, term170359.getClass(), "str", null);
        setIntField(term170359, term170359.getClass(), "type", 0);
        setField(term170359, term170359.getClass(), "next", null);
        setField(term170359, term170359.getClass(), "first", null);
        setField(term170359, term170359.getClass(), "last", null);
        setField(term170359, term170359.getClass(), "propListHead", null);
        setIntField(term170359, term170359.getClass(), "sourcePosition", 0);
        setField(term170359, term170359.getClass(), "jsType", null);
        setField(term170359, term170359.getClass(), "parent", null);
        setField(term170358, term170358.getClass(), "first", term170359);
        setField(term170358, term170358.getClass(), "last", null);
        setField(term170358, term170358.getClass(), "propListHead", null);
        setIntField(term170358, term170358.getClass(), "sourcePosition", 0);
        setField(term170358, term170358.getClass(), "jsType", null);
        setDoubleField(term170360, term170360.getClass(), "number", 0.0);
        setIntField(term170360, term170360.getClass(), "type", 0);
        setField(term170360, term170360.getClass(), "next", null);
        setField(term170361, term170361.getClass(), "str", null);
        setIntField(term170361, term170361.getClass(), "type", 111);
        setField(term170361, term170361.getClass(), "next", null);
        setField(term170361, term170361.getClass(), "first", null);
        setField(term170361, term170361.getClass(), "last", null);
        setField(term170361, term170361.getClass(), "propListHead", null);
        setIntField(term170361, term170361.getClass(), "sourcePosition", 0);
        setField(term170361, term170361.getClass(), "jsType", null);
        setField(term170361, term170361.getClass(), "parent", null);
        setField(term170360, term170360.getClass(), "first", term170361);
        setField(term170360, term170360.getClass(), "last", null);
        setField(term170360, term170360.getClass(), "propListHead", null);
        setIntField(term170360, term170360.getClass(), "sourcePosition", 0);
        setField(term170360, term170360.getClass(), "jsType", null);
        setField(term170360, term170360.getClass(), "parent", null);
        setField(term170358, term170358.getClass(), "parent", term170360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term169997;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term169905, args);
        assertTrue(recursiveEquals(term169905, term170357));
        assertTrue(recursiveEquals(term169997, term170358));
        assertTrue(recursiveEquals(retValue, null));
    }

};


