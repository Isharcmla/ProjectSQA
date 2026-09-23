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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403590;
     Object term403682;
     Object term404096;
     Object term404097;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403590 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term403682 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term403774 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term403870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term403962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term403682, term403682.getClass(), "type", 45);
        setIntField(term403774, term403774.getClass(), "type", 0);
        setField(term403774, term403774.getClass(), "jsType", term403870);
        setField(term403682, term403682.getClass(), "first", term403774);
        setIntField(term403962, term403962.getClass(), "type", 0);
        setField(term403962, term403962.getClass(), "jsType", term403870);
        setField(term403682, term403682.getClass(), "last", term403962);
        term404096 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term404096, term404096.getClass(), "INEQ", null);
        setField(term404096, term404096.getClass(), "convention", null);
        setField(term404096, term404096.getClass(), "typeRegistry", null);
        setField(term404096, term404096.getClass(), "firstLink", null);
        setField(term404096, term404096.getClass(), "nextLink", null);
        setField(term404096, term404096.getClass(), "restrictUndefinedVisitor", null);
        setField(term404096, term404096.getClass(), "restrictNullVisitor", null);
        term404097 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term404098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term404099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term404100 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term404097, term404097.getClass(), "number", 0.0);
        setIntField(term404097, term404097.getClass(), "type", 45);
        setField(term404097, term404097.getClass(), "next", null);
        setField(term404098, term404098.getClass(), "str", null);
        setIntField(term404098, term404098.getClass(), "type", 0);
        setField(term404098, term404098.getClass(), "next", null);
        setField(term404098, term404098.getClass(), "first", null);
        setField(term404098, term404098.getClass(), "last", null);
        setField(term404098, term404098.getClass(), "propListHead", null);
        setIntField(term404098, term404098.getClass(), "sourcePosition", 0);
        setBooleanField(term404099, term404099.getClass(), "resolved", false);
        setField(term404099, term404099.getClass(), "resolveResult", null);
        setBooleanField(term404099, term404099.getClass(), "inTemplatedCheckVisit", false);
        setField(term404099, term404099.getClass(), "registry", null);
        setField(term404098, term404098.getClass(), "jsType", term404099);
        setField(term404098, term404098.getClass(), "parent", null);
        setField(term404097, term404097.getClass(), "first", term404098);
        setDoubleField(term404100, term404100.getClass(), "number", 0.0);
        setIntField(term404100, term404100.getClass(), "type", 0);
        setField(term404100, term404100.getClass(), "next", null);
        setField(term404100, term404100.getClass(), "first", null);
        setField(term404100, term404100.getClass(), "last", null);
        setField(term404100, term404100.getClass(), "propListHead", null);
        setIntField(term404100, term404100.getClass(), "sourcePosition", 0);
        setField(term404100, term404100.getClass(), "jsType", term404099);
        setField(term404100, term404100.getClass(), "parent", null);
        setField(term404097, term404097.getClass(), "last", term404100);
        setField(term404097, term404097.getClass(), "propListHead", null);
        setIntField(term404097, term404097.getClass(), "sourcePosition", 0);
        setField(term404097, term404097.getClass(), "jsType", null);
        setField(term404097, term404097.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term403682;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term403590, args);
        assertTrue(recursiveEquals(term403590, term404096));
        assertTrue(recursiveEquals(term403682, term404097));
        assertTrue(recursiveEquals(retValue, null));
    }

};


