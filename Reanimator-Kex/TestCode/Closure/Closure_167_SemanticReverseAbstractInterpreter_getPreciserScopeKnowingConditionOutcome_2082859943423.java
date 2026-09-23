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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110795;
     Object term110887;
     Object term111134;
     Object term111135;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110795 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term110887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110979 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111071 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term110887, term110887.getClass(), "type", 46);
        setIntField(term110979, term110979.getClass(), "type", -47);
        setField(term110887, term110887.getClass(), "first", term110979);
        setIntField(term111071, term111071.getClass(), "type", 46);
        setField(term110887, term110887.getClass(), "last", term111071);
        term111134 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term111134, term111134.getClass(), "INEQ", null);
        setField(term111134, term111134.getClass(), "convention", null);
        setField(term111134, term111134.getClass(), "typeRegistry", null);
        setField(term111134, term111134.getClass(), "firstLink", null);
        setField(term111134, term111134.getClass(), "nextLink", null);
        setField(term111134, term111134.getClass(), "restrictUndefinedVisitor", null);
        setField(term111134, term111134.getClass(), "restrictNullVisitor", null);
        term111135 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111136 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term111135, term111135.getClass(), "number", 0.0);
        setIntField(term111135, term111135.getClass(), "type", 46);
        setField(term111135, term111135.getClass(), "next", null);
        setDoubleField(term111136, term111136.getClass(), "number", 0.0);
        setIntField(term111136, term111136.getClass(), "type", -47);
        setField(term111136, term111136.getClass(), "next", null);
        setField(term111136, term111136.getClass(), "first", null);
        setField(term111136, term111136.getClass(), "last", null);
        setField(term111136, term111136.getClass(), "propListHead", null);
        setIntField(term111136, term111136.getClass(), "sourcePosition", 0);
        setField(term111136, term111136.getClass(), "jsType", null);
        setField(term111136, term111136.getClass(), "parent", null);
        setField(term111135, term111135.getClass(), "first", term111136);
        setField(term111137, term111137.getClass(), "str", null);
        setIntField(term111137, term111137.getClass(), "type", 46);
        setField(term111137, term111137.getClass(), "next", null);
        setField(term111137, term111137.getClass(), "first", null);
        setField(term111137, term111137.getClass(), "last", null);
        setField(term111137, term111137.getClass(), "propListHead", null);
        setIntField(term111137, term111137.getClass(), "sourcePosition", 0);
        setField(term111137, term111137.getClass(), "jsType", null);
        setField(term111137, term111137.getClass(), "parent", null);
        setField(term111135, term111135.getClass(), "last", term111137);
        setField(term111135, term111135.getClass(), "propListHead", null);
        setIntField(term111135, term111135.getClass(), "sourcePosition", 0);
        setField(term111135, term111135.getClass(), "jsType", null);
        setField(term111135, term111135.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term110887;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term110795, args);
        assertTrue(recursiveEquals(term110795, term111134));
        assertTrue(recursiveEquals(term110887, term111135));
        assertTrue(recursiveEquals(retValue, null));
    }

};


