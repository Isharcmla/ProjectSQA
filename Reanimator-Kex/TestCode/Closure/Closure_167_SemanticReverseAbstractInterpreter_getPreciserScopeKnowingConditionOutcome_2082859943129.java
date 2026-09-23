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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28337;
     Object term28429;
     Object term28597;
     Object term28598;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28337 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term28429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term28521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term28429, term28429.getClass(), "type", 13);
        setField(term28429, term28429.getClass(), "first", term28429);
        setField(term28429, term28429.getClass(), "last", term28521);
        term28597 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term28597, term28597.getClass(), "INEQ", null);
        setField(term28597, term28597.getClass(), "convention", null);
        setField(term28597, term28597.getClass(), "typeRegistry", null);
        setField(term28597, term28597.getClass(), "firstLink", null);
        setField(term28597, term28597.getClass(), "nextLink", null);
        setField(term28597, term28597.getClass(), "restrictUndefinedVisitor", null);
        setField(term28597, term28597.getClass(), "restrictNullVisitor", null);
        term28598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term28599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28598, term28598.getClass(), "number", 0.0);
        setIntField(term28598, term28598.getClass(), "type", 13);
        setField(term28598, term28598.getClass(), "next", null);
        setField(term28598, term28598.getClass(), "first", term28598);
        setDoubleField(term28599, term28599.getClass(), "number", 0.0);
        setIntField(term28599, term28599.getClass(), "type", 0);
        setField(term28599, term28599.getClass(), "next", null);
        setField(term28599, term28599.getClass(), "first", null);
        setField(term28599, term28599.getClass(), "last", null);
        setField(term28599, term28599.getClass(), "propListHead", null);
        setIntField(term28599, term28599.getClass(), "sourcePosition", 0);
        setField(term28599, term28599.getClass(), "jsType", null);
        setField(term28599, term28599.getClass(), "parent", null);
        setField(term28598, term28598.getClass(), "last", term28599);
        setField(term28598, term28598.getClass(), "propListHead", null);
        setIntField(term28598, term28598.getClass(), "sourcePosition", 0);
        setField(term28598, term28598.getClass(), "jsType", null);
        setField(term28598, term28598.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term28429;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term28337, args);
        assertTrue(recursiveEquals(term28337, term28597));
        assertTrue(recursiveEquals(term28429, term28598));
        assertTrue(recursiveEquals(retValue, null));
    }

};


