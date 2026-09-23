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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204470;
     Object term204562;
     Object term204922;
     Object term204923;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204470 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term204562 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204654 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term204838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term204562, term204562.getClass(), "type", 111);
        setIntField(term204746, term204746.getClass(), "type", 415367776);
        setField(term204654, term204654.getClass(), "first", term204746);
        setField(term204562, term204562.getClass(), "parent", term204654);
        setIntField(term204838, term204838.getClass(), "type", 2359296);
        setField(term204562, term204562.getClass(), "first", term204838);
        term204922 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term204922, term204922.getClass(), "INEQ", null);
        setField(term204922, term204922.getClass(), "convention", null);
        setField(term204922, term204922.getClass(), "typeRegistry", null);
        setField(term204922, term204922.getClass(), "firstLink", null);
        setField(term204922, term204922.getClass(), "nextLink", null);
        setField(term204922, term204922.getClass(), "restrictUndefinedVisitor", null);
        setField(term204922, term204922.getClass(), "restrictNullVisitor", null);
        term204923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204924 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term204925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term204923, term204923.getClass(), "number", 0.0);
        setIntField(term204923, term204923.getClass(), "type", 111);
        setField(term204923, term204923.getClass(), "next", null);
        setField(term204924, term204924.getClass(), "str", null);
        setIntField(term204924, term204924.getClass(), "type", 2359296);
        setField(term204924, term204924.getClass(), "next", null);
        setField(term204924, term204924.getClass(), "first", null);
        setField(term204924, term204924.getClass(), "last", null);
        setField(term204924, term204924.getClass(), "propListHead", null);
        setIntField(term204924, term204924.getClass(), "sourcePosition", 0);
        setField(term204924, term204924.getClass(), "jsType", null);
        setField(term204924, term204924.getClass(), "parent", null);
        setField(term204923, term204923.getClass(), "first", term204924);
        setField(term204923, term204923.getClass(), "last", null);
        setField(term204923, term204923.getClass(), "propListHead", null);
        setIntField(term204923, term204923.getClass(), "sourcePosition", 0);
        setField(term204923, term204923.getClass(), "jsType", null);
        setDoubleField(term204925, term204925.getClass(), "number", 0.0);
        setIntField(term204925, term204925.getClass(), "type", 0);
        setField(term204925, term204925.getClass(), "next", null);
        setField(term204926, term204926.getClass(), "str", null);
        setIntField(term204926, term204926.getClass(), "type", 415367776);
        setField(term204926, term204926.getClass(), "next", null);
        setField(term204926, term204926.getClass(), "first", null);
        setField(term204926, term204926.getClass(), "last", null);
        setField(term204926, term204926.getClass(), "propListHead", null);
        setIntField(term204926, term204926.getClass(), "sourcePosition", 0);
        setField(term204926, term204926.getClass(), "jsType", null);
        setField(term204926, term204926.getClass(), "parent", null);
        setField(term204925, term204925.getClass(), "first", term204926);
        setField(term204925, term204925.getClass(), "last", null);
        setField(term204925, term204925.getClass(), "propListHead", null);
        setIntField(term204925, term204925.getClass(), "sourcePosition", 0);
        setField(term204925, term204925.getClass(), "jsType", null);
        setField(term204925, term204925.getClass(), "parent", null);
        setField(term204923, term204923.getClass(), "parent", term204925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term204562;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term204470, args);
        assertTrue(recursiveEquals(term204470, term204922));
        assertTrue(recursiveEquals(term204562, term204923));
        assertTrue(recursiveEquals(retValue, null));
    }

};


