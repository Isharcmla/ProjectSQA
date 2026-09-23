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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221544;
     Object term221636;
     Object term221883;
     Object term221884;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221544 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term221636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term221728 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term221820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term221636, term221636.getClass(), "type", 12);
        setIntField(term221728, term221728.getClass(), "type", -13);
        setField(term221636, term221636.getClass(), "first", term221728);
        setIntField(term221820, term221820.getClass(), "type", 12);
        setField(term221636, term221636.getClass(), "last", term221820);
        term221883 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term221883, term221883.getClass(), "INEQ", null);
        setField(term221883, term221883.getClass(), "convention", null);
        setField(term221883, term221883.getClass(), "typeRegistry", null);
        setField(term221883, term221883.getClass(), "firstLink", null);
        setField(term221883, term221883.getClass(), "nextLink", null);
        setField(term221883, term221883.getClass(), "restrictUndefinedVisitor", null);
        setField(term221883, term221883.getClass(), "restrictNullVisitor", null);
        term221884 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term221885 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term221886 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term221884, term221884.getClass(), "number", 0.0);
        setIntField(term221884, term221884.getClass(), "type", 12);
        setField(term221884, term221884.getClass(), "next", null);
        setField(term221885, term221885.getClass(), "str", null);
        setIntField(term221885, term221885.getClass(), "type", -13);
        setField(term221885, term221885.getClass(), "next", null);
        setField(term221885, term221885.getClass(), "first", null);
        setField(term221885, term221885.getClass(), "last", null);
        setField(term221885, term221885.getClass(), "propListHead", null);
        setIntField(term221885, term221885.getClass(), "sourcePosition", 0);
        setField(term221885, term221885.getClass(), "jsType", null);
        setField(term221885, term221885.getClass(), "parent", null);
        setField(term221884, term221884.getClass(), "first", term221885);
        setDoubleField(term221886, term221886.getClass(), "number", 0.0);
        setIntField(term221886, term221886.getClass(), "type", 12);
        setField(term221886, term221886.getClass(), "next", null);
        setField(term221886, term221886.getClass(), "first", null);
        setField(term221886, term221886.getClass(), "last", null);
        setField(term221886, term221886.getClass(), "propListHead", null);
        setIntField(term221886, term221886.getClass(), "sourcePosition", 0);
        setField(term221886, term221886.getClass(), "jsType", null);
        setField(term221886, term221886.getClass(), "parent", null);
        setField(term221884, term221884.getClass(), "last", term221886);
        setField(term221884, term221884.getClass(), "propListHead", null);
        setIntField(term221884, term221884.getClass(), "sourcePosition", 0);
        setField(term221884, term221884.getClass(), "jsType", null);
        setField(term221884, term221884.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term221636;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term221544, args);
        assertTrue(recursiveEquals(term221544, term221883));
        assertTrue(recursiveEquals(term221636, term221884));
        assertTrue(recursiveEquals(retValue, null));
    }

};


