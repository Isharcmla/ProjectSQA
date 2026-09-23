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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17132;
     Object term17224;
     Object term17465;
     Object term17466;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17132 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term17224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term17316 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term17408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term17224, term17224.getClass(), "type", 45);
        setField(term17224, term17224.getClass(), "first", term17316);
        setField(term17224, term17224.getClass(), "last", term17408);
        term17465 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term17465, term17465.getClass(), "INEQ", null);
        setField(term17465, term17465.getClass(), "convention", null);
        setField(term17465, term17465.getClass(), "typeRegistry", null);
        setField(term17465, term17465.getClass(), "firstLink", null);
        setField(term17465, term17465.getClass(), "nextLink", null);
        setField(term17465, term17465.getClass(), "restrictUndefinedVisitor", null);
        setField(term17465, term17465.getClass(), "restrictNullVisitor", null);
        term17466 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term17467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term17468 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term17466, term17466.getClass(), "str", null);
        setIntField(term17466, term17466.getClass(), "type", 45);
        setField(term17466, term17466.getClass(), "next", null);
        setField(term17467, term17467.getClass(), "str", null);
        setIntField(term17467, term17467.getClass(), "type", 0);
        setField(term17467, term17467.getClass(), "next", null);
        setField(term17467, term17467.getClass(), "first", null);
        setField(term17467, term17467.getClass(), "last", null);
        setField(term17467, term17467.getClass(), "propListHead", null);
        setIntField(term17467, term17467.getClass(), "sourcePosition", 0);
        setField(term17467, term17467.getClass(), "jsType", null);
        setField(term17467, term17467.getClass(), "parent", null);
        setField(term17466, term17466.getClass(), "first", term17467);
        setField(term17468, term17468.getClass(), "str", null);
        setIntField(term17468, term17468.getClass(), "type", 0);
        setField(term17468, term17468.getClass(), "next", null);
        setField(term17468, term17468.getClass(), "first", null);
        setField(term17468, term17468.getClass(), "last", null);
        setField(term17468, term17468.getClass(), "propListHead", null);
        setIntField(term17468, term17468.getClass(), "sourcePosition", 0);
        setField(term17468, term17468.getClass(), "jsType", null);
        setField(term17468, term17468.getClass(), "parent", null);
        setField(term17466, term17466.getClass(), "last", term17468);
        setField(term17466, term17466.getClass(), "propListHead", null);
        setIntField(term17466, term17466.getClass(), "sourcePosition", 0);
        setField(term17466, term17466.getClass(), "jsType", null);
        setField(term17466, term17466.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term17224;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term17132, args);
        assertTrue(recursiveEquals(term17132, term17465));
        assertTrue(recursiveEquals(term17224, term17466));
        assertTrue(recursiveEquals(retValue, null));
    }

};


