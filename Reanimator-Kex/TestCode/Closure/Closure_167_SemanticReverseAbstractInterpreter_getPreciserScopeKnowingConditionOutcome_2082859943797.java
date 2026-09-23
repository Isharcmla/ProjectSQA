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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241263;
     Object term241501;
     Object term241728;
     Object term241730;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241263 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term241409 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$3"));
        setField(term241263, term241263.getClass(), "INEQ", term241409);
        term241501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term241501, term241501.getClass(), "type", 14);
        setIntField(term241593, term241593.getClass(), "type", -15);
        setField(term241593, term241593.getClass(), "jsType", null);
        setField(term241501, term241501.getClass(), "first", term241593);
        setIntField(term241685, term241685.getClass(), "type", 14);
        setField(term241685, term241685.getClass(), "jsType", null);
        setField(term241501, term241501.getClass(), "last", term241685);
        term241728 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term241729 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$3"));
        setField(term241728, term241728.getClass(), "INEQ", term241729);
        setField(term241728, term241728.getClass(), "convention", null);
        setField(term241728, term241728.getClass(), "typeRegistry", null);
        setField(term241728, term241728.getClass(), "firstLink", null);
        setField(term241728, term241728.getClass(), "nextLink", null);
        setField(term241728, term241728.getClass(), "restrictUndefinedVisitor", null);
        setField(term241728, term241728.getClass(), "restrictNullVisitor", null);
        term241730 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241731 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term241730, term241730.getClass(), "number", 0.0);
        setIntField(term241730, term241730.getClass(), "type", 14);
        setField(term241730, term241730.getClass(), "next", null);
        setDoubleField(term241731, term241731.getClass(), "number", 0.0);
        setIntField(term241731, term241731.getClass(), "type", -15);
        setField(term241731, term241731.getClass(), "next", null);
        setField(term241731, term241731.getClass(), "first", null);
        setField(term241731, term241731.getClass(), "last", null);
        setField(term241731, term241731.getClass(), "propListHead", null);
        setIntField(term241731, term241731.getClass(), "sourcePosition", 0);
        setField(term241731, term241731.getClass(), "jsType", null);
        setField(term241731, term241731.getClass(), "parent", null);
        setField(term241730, term241730.getClass(), "first", term241731);
        setDoubleField(term241732, term241732.getClass(), "number", 0.0);
        setIntField(term241732, term241732.getClass(), "type", 14);
        setField(term241732, term241732.getClass(), "next", null);
        setField(term241732, term241732.getClass(), "first", null);
        setField(term241732, term241732.getClass(), "last", null);
        setField(term241732, term241732.getClass(), "propListHead", null);
        setIntField(term241732, term241732.getClass(), "sourcePosition", 0);
        setField(term241732, term241732.getClass(), "jsType", null);
        setField(term241732, term241732.getClass(), "parent", null);
        setField(term241730, term241730.getClass(), "last", term241732);
        setField(term241730, term241730.getClass(), "propListHead", null);
        setIntField(term241730, term241730.getClass(), "sourcePosition", 0);
        setField(term241730, term241730.getClass(), "jsType", null);
        setField(term241730, term241730.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term241501;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term241263, args);
        assertTrue(recursiveEquals(term241263, term241728));
        assertTrue(recursiveEquals(term241501, term241730));
        assertTrue(recursiveEquals(retValue, null));
    }

};


