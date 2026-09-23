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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41782;
     Object term41874;
     Object term42135;
     Object term42136;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41782 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term41874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41966 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42058 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term41874, term41874.getClass(), "type", 13);
        setField(term41874, term41874.getClass(), "first", term41966);
        setField(term41874, term41874.getClass(), "last", term42058);
        term42135 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term42135, term42135.getClass(), "INEQ", null);
        setField(term42135, term42135.getClass(), "convention", null);
        setField(term42135, term42135.getClass(), "typeRegistry", null);
        setField(term42135, term42135.getClass(), "firstLink", null);
        setField(term42135, term42135.getClass(), "nextLink", null);
        setField(term42135, term42135.getClass(), "restrictUndefinedVisitor", null);
        setField(term42135, term42135.getClass(), "restrictNullVisitor", null);
        term42136 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42138 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term42136, term42136.getClass(), "number", 0.0);
        setIntField(term42136, term42136.getClass(), "type", 13);
        setField(term42136, term42136.getClass(), "next", null);
        setDoubleField(term42137, term42137.getClass(), "number", 0.0);
        setIntField(term42137, term42137.getClass(), "type", 0);
        setField(term42137, term42137.getClass(), "next", null);
        setField(term42137, term42137.getClass(), "first", null);
        setField(term42137, term42137.getClass(), "last", null);
        setField(term42137, term42137.getClass(), "propListHead", null);
        setIntField(term42137, term42137.getClass(), "sourcePosition", 0);
        setField(term42137, term42137.getClass(), "jsType", null);
        setField(term42137, term42137.getClass(), "parent", null);
        setField(term42136, term42136.getClass(), "first", term42137);
        setDoubleField(term42138, term42138.getClass(), "number", 0.0);
        setIntField(term42138, term42138.getClass(), "type", 0);
        setField(term42138, term42138.getClass(), "next", null);
        setField(term42138, term42138.getClass(), "first", null);
        setField(term42138, term42138.getClass(), "last", null);
        setField(term42138, term42138.getClass(), "propListHead", null);
        setIntField(term42138, term42138.getClass(), "sourcePosition", 0);
        setField(term42138, term42138.getClass(), "jsType", null);
        setField(term42138, term42138.getClass(), "parent", null);
        setField(term42136, term42136.getClass(), "last", term42138);
        setField(term42136, term42136.getClass(), "propListHead", null);
        setIntField(term42136, term42136.getClass(), "sourcePosition", 0);
        setField(term42136, term42136.getClass(), "jsType", null);
        setField(term42136, term42136.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term41874;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term41782, args);
        assertTrue(recursiveEquals(term41782, term42135));
        assertTrue(recursiveEquals(term41874, term42136));
        assertTrue(recursiveEquals(retValue, null));
    }

};


