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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18118;
     Object term18210;
     Object term18462;
     Object term18463;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18118 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term18210 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term18302 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term18394 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term18210, term18210.getClass(), "type", 45);
        setField(term18210, term18210.getClass(), "first", term18302);
        setField(term18210, term18210.getClass(), "last", term18394);
        term18462 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term18462, term18462.getClass(), "INEQ", null);
        setField(term18462, term18462.getClass(), "convention", null);
        setField(term18462, term18462.getClass(), "typeRegistry", null);
        setField(term18462, term18462.getClass(), "firstLink", null);
        setField(term18462, term18462.getClass(), "nextLink", null);
        setField(term18462, term18462.getClass(), "restrictUndefinedVisitor", null);
        setField(term18462, term18462.getClass(), "restrictNullVisitor", null);
        term18463 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term18464 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term18465 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term18463, term18463.getClass(), "number", 0.0);
        setIntField(term18463, term18463.getClass(), "type", 45);
        setField(term18463, term18463.getClass(), "next", null);
        setDoubleField(term18464, term18464.getClass(), "number", 0.0);
        setIntField(term18464, term18464.getClass(), "type", 0);
        setField(term18464, term18464.getClass(), "next", null);
        setField(term18464, term18464.getClass(), "first", null);
        setField(term18464, term18464.getClass(), "last", null);
        setField(term18464, term18464.getClass(), "propListHead", null);
        setIntField(term18464, term18464.getClass(), "sourcePosition", 0);
        setField(term18464, term18464.getClass(), "jsType", null);
        setField(term18464, term18464.getClass(), "parent", null);
        setField(term18463, term18463.getClass(), "first", term18464);
        setDoubleField(term18465, term18465.getClass(), "number", 0.0);
        setIntField(term18465, term18465.getClass(), "type", 0);
        setField(term18465, term18465.getClass(), "next", null);
        setField(term18465, term18465.getClass(), "first", null);
        setField(term18465, term18465.getClass(), "last", null);
        setField(term18465, term18465.getClass(), "propListHead", null);
        setIntField(term18465, term18465.getClass(), "sourcePosition", 0);
        setField(term18465, term18465.getClass(), "jsType", null);
        setField(term18465, term18465.getClass(), "parent", null);
        setField(term18463, term18463.getClass(), "last", term18465);
        setField(term18463, term18463.getClass(), "propListHead", null);
        setIntField(term18463, term18463.getClass(), "sourcePosition", 0);
        setField(term18463, term18463.getClass(), "jsType", null);
        setField(term18463, term18463.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term18210;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term18118, args);
        assertTrue(recursiveEquals(term18118, term18462));
        assertTrue(recursiveEquals(term18210, term18463));
        assertTrue(recursiveEquals(retValue, null));
    }

};


