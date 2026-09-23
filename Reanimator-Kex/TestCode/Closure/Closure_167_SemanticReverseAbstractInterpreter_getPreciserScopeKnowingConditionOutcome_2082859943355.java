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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92309;
     Object term92401;
     Object term92642;
     Object term92643;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92309 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term92401 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92493 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92585 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term92401, term92401.getClass(), "type", 13);
        setIntField(term92493, term92493.getClass(), "type", 13);
        setField(term92401, term92401.getClass(), "first", term92493);
        setIntField(term92585, term92585.getClass(), "type", 13);
        setField(term92401, term92401.getClass(), "last", term92585);
        term92642 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term92642, term92642.getClass(), "INEQ", null);
        setField(term92642, term92642.getClass(), "convention", null);
        setField(term92642, term92642.getClass(), "typeRegistry", null);
        setField(term92642, term92642.getClass(), "firstLink", null);
        setField(term92642, term92642.getClass(), "nextLink", null);
        setField(term92642, term92642.getClass(), "restrictUndefinedVisitor", null);
        setField(term92642, term92642.getClass(), "restrictNullVisitor", null);
        term92643 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92645 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term92643, term92643.getClass(), "str", null);
        setIntField(term92643, term92643.getClass(), "type", 13);
        setField(term92643, term92643.getClass(), "next", null);
        setField(term92644, term92644.getClass(), "str", null);
        setIntField(term92644, term92644.getClass(), "type", 13);
        setField(term92644, term92644.getClass(), "next", null);
        setField(term92644, term92644.getClass(), "first", null);
        setField(term92644, term92644.getClass(), "last", null);
        setField(term92644, term92644.getClass(), "propListHead", null);
        setIntField(term92644, term92644.getClass(), "sourcePosition", 0);
        setField(term92644, term92644.getClass(), "jsType", null);
        setField(term92644, term92644.getClass(), "parent", null);
        setField(term92643, term92643.getClass(), "first", term92644);
        setField(term92645, term92645.getClass(), "str", null);
        setIntField(term92645, term92645.getClass(), "type", 13);
        setField(term92645, term92645.getClass(), "next", null);
        setField(term92645, term92645.getClass(), "first", null);
        setField(term92645, term92645.getClass(), "last", null);
        setField(term92645, term92645.getClass(), "propListHead", null);
        setIntField(term92645, term92645.getClass(), "sourcePosition", 0);
        setField(term92645, term92645.getClass(), "jsType", null);
        setField(term92645, term92645.getClass(), "parent", null);
        setField(term92643, term92643.getClass(), "last", term92645);
        setField(term92643, term92643.getClass(), "propListHead", null);
        setIntField(term92643, term92643.getClass(), "sourcePosition", 0);
        setField(term92643, term92643.getClass(), "jsType", null);
        setField(term92643, term92643.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term92401;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term92309, args);
        assertTrue(recursiveEquals(term92309, term92642));
        assertTrue(recursiveEquals(term92401, term92643));
        assertTrue(recursiveEquals(retValue, null));
    }

};


