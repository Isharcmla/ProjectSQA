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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64968;
     Object term65184;
     Object term65414;
     Object term65416;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64968 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term65114 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$1"));
        setField(term64968, term64968.getClass(), "INEQ", term65114);
        term65184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65184, term65184.getClass(), "type", 15);
        setIntField(term65254, term65254.getClass(), "type", 15);
        setField(term65254, term65254.getClass(), "jsType", null);
        setField(term65184, term65184.getClass(), "first", term65254);
        setField(term65184, term65184.getClass(), "last", term65254);
        term65414 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term65415 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$1"));
        setField(term65414, term65414.getClass(), "INEQ", term65415);
        setField(term65414, term65414.getClass(), "convention", null);
        setField(term65414, term65414.getClass(), "typeRegistry", null);
        setField(term65414, term65414.getClass(), "firstLink", null);
        setField(term65414, term65414.getClass(), "nextLink", null);
        setField(term65414, term65414.getClass(), "restrictUndefinedVisitor", null);
        setField(term65414, term65414.getClass(), "restrictNullVisitor", null);
        term65416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65416, term65416.getClass(), "type", 15);
        setField(term65416, term65416.getClass(), "next", null);
        setIntField(term65417, term65417.getClass(), "type", 15);
        setField(term65417, term65417.getClass(), "next", null);
        setField(term65417, term65417.getClass(), "first", null);
        setField(term65417, term65417.getClass(), "last", null);
        setField(term65417, term65417.getClass(), "propListHead", null);
        setIntField(term65417, term65417.getClass(), "sourcePosition", 0);
        setField(term65417, term65417.getClass(), "jsType", null);
        setField(term65417, term65417.getClass(), "parent", null);
        setField(term65416, term65416.getClass(), "first", term65417);
        setField(term65416, term65416.getClass(), "last", term65417);
        setField(term65416, term65416.getClass(), "propListHead", null);
        setIntField(term65416, term65416.getClass(), "sourcePosition", 0);
        setField(term65416, term65416.getClass(), "jsType", null);
        setField(term65416, term65416.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term65184;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term64968, args);
        assertTrue(recursiveEquals(term64968, term65414));
        assertTrue(recursiveEquals(term65184, term65416));
        assertTrue(recursiveEquals(retValue, null));
    }

};


