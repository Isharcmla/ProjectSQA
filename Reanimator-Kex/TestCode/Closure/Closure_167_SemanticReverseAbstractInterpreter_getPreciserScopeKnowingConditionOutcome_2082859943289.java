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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73416;
     Object term73508;
     Object term73754;
     Object term73755;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73416 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term73508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term73600 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term73508, term73508.getClass(), "type", 46);
        setIntField(term73600, term73600.getClass(), "type", -47);
        setField(term73508, term73508.getClass(), "first", term73600);
        setIntField(term73692, term73692.getClass(), "type", 46);
        setField(term73508, term73508.getClass(), "last", term73692);
        term73754 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term73754, term73754.getClass(), "INEQ", null);
        setField(term73754, term73754.getClass(), "convention", null);
        setField(term73754, term73754.getClass(), "typeRegistry", null);
        setField(term73754, term73754.getClass(), "firstLink", null);
        setField(term73754, term73754.getClass(), "nextLink", null);
        setField(term73754, term73754.getClass(), "restrictUndefinedVisitor", null);
        setField(term73754, term73754.getClass(), "restrictNullVisitor", null);
        term73755 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term73756 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73757 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term73755, term73755.getClass(), "str", null);
        setIntField(term73755, term73755.getClass(), "type", 46);
        setField(term73755, term73755.getClass(), "next", null);
        setDoubleField(term73756, term73756.getClass(), "number", 0.0);
        setIntField(term73756, term73756.getClass(), "type", -47);
        setField(term73756, term73756.getClass(), "next", null);
        setField(term73756, term73756.getClass(), "first", null);
        setField(term73756, term73756.getClass(), "last", null);
        setField(term73756, term73756.getClass(), "propListHead", null);
        setIntField(term73756, term73756.getClass(), "sourcePosition", 0);
        setField(term73756, term73756.getClass(), "jsType", null);
        setField(term73756, term73756.getClass(), "parent", null);
        setField(term73755, term73755.getClass(), "first", term73756);
        setField(term73757, term73757.getClass(), "str", null);
        setIntField(term73757, term73757.getClass(), "type", 46);
        setField(term73757, term73757.getClass(), "next", null);
        setField(term73757, term73757.getClass(), "first", null);
        setField(term73757, term73757.getClass(), "last", null);
        setField(term73757, term73757.getClass(), "propListHead", null);
        setIntField(term73757, term73757.getClass(), "sourcePosition", 0);
        setField(term73757, term73757.getClass(), "jsType", null);
        setField(term73757, term73757.getClass(), "parent", null);
        setField(term73755, term73755.getClass(), "last", term73757);
        setField(term73755, term73755.getClass(), "propListHead", null);
        setIntField(term73755, term73755.getClass(), "sourcePosition", 0);
        setField(term73755, term73755.getClass(), "jsType", null);
        setField(term73755, term73755.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term73508;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term73416, args);
        assertTrue(recursiveEquals(term73416, term73754));
        assertTrue(recursiveEquals(term73508, term73755));
        assertTrue(recursiveEquals(retValue, null));
    }

};


