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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149045;
     Object term149137;
     Object term149379;
     Object term149380;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149045 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term149137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149229 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149321 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term149137, term149137.getClass(), "type", 46);
        setIntField(term149229, term149229.getClass(), "type", 0);
        setField(term149137, term149137.getClass(), "first", term149229);
        setField(term149137, term149137.getClass(), "last", term149321);
        term149379 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term149379, term149379.getClass(), "INEQ", null);
        setField(term149379, term149379.getClass(), "convention", null);
        setField(term149379, term149379.getClass(), "typeRegistry", null);
        setField(term149379, term149379.getClass(), "firstLink", null);
        setField(term149379, term149379.getClass(), "nextLink", null);
        setField(term149379, term149379.getClass(), "restrictUndefinedVisitor", null);
        setField(term149379, term149379.getClass(), "restrictNullVisitor", null);
        term149380 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149381 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149382 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term149380, term149380.getClass(), "number", 0.0);
        setIntField(term149380, term149380.getClass(), "type", 46);
        setField(term149380, term149380.getClass(), "next", null);
        setField(term149381, term149381.getClass(), "str", null);
        setIntField(term149381, term149381.getClass(), "type", 0);
        setField(term149381, term149381.getClass(), "next", null);
        setField(term149381, term149381.getClass(), "first", null);
        setField(term149381, term149381.getClass(), "last", null);
        setField(term149381, term149381.getClass(), "propListHead", null);
        setIntField(term149381, term149381.getClass(), "sourcePosition", 0);
        setField(term149381, term149381.getClass(), "jsType", null);
        setField(term149381, term149381.getClass(), "parent", null);
        setField(term149380, term149380.getClass(), "first", term149381);
        setField(term149382, term149382.getClass(), "str", null);
        setIntField(term149382, term149382.getClass(), "type", 0);
        setField(term149382, term149382.getClass(), "next", null);
        setField(term149382, term149382.getClass(), "first", null);
        setField(term149382, term149382.getClass(), "last", null);
        setField(term149382, term149382.getClass(), "propListHead", null);
        setIntField(term149382, term149382.getClass(), "sourcePosition", 0);
        setField(term149382, term149382.getClass(), "jsType", null);
        setField(term149382, term149382.getClass(), "parent", null);
        setField(term149380, term149380.getClass(), "last", term149382);
        setField(term149380, term149380.getClass(), "propListHead", null);
        setIntField(term149380, term149380.getClass(), "sourcePosition", 0);
        setField(term149380, term149380.getClass(), "jsType", null);
        setField(term149380, term149380.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term149137;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term149045, args);
        assertTrue(recursiveEquals(term149045, term149379));
        assertTrue(recursiveEquals(term149137, term149380));
        assertTrue(recursiveEquals(retValue, null));
    }

};


