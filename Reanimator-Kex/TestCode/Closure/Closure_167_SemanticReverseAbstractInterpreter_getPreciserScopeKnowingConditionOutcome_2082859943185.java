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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42308;
     Object term42400;
     Object term42652;
     Object term42653;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42308 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term42400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42492 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term42400, term42400.getClass(), "type", 45);
        setIntField(term42492, term42492.getClass(), "type", 45);
        setField(term42400, term42400.getClass(), "first", term42492);
        setField(term42400, term42400.getClass(), "last", term42584);
        term42652 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term42652, term42652.getClass(), "INEQ", null);
        setField(term42652, term42652.getClass(), "convention", null);
        setField(term42652, term42652.getClass(), "typeRegistry", null);
        setField(term42652, term42652.getClass(), "firstLink", null);
        setField(term42652, term42652.getClass(), "nextLink", null);
        setField(term42652, term42652.getClass(), "restrictUndefinedVisitor", null);
        setField(term42652, term42652.getClass(), "restrictNullVisitor", null);
        term42653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42654 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42655 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term42653, term42653.getClass(), "number", 0.0);
        setIntField(term42653, term42653.getClass(), "type", 45);
        setField(term42653, term42653.getClass(), "next", null);
        setDoubleField(term42654, term42654.getClass(), "number", 0.0);
        setIntField(term42654, term42654.getClass(), "type", 45);
        setField(term42654, term42654.getClass(), "next", null);
        setField(term42654, term42654.getClass(), "first", null);
        setField(term42654, term42654.getClass(), "last", null);
        setField(term42654, term42654.getClass(), "propListHead", null);
        setIntField(term42654, term42654.getClass(), "sourcePosition", 0);
        setField(term42654, term42654.getClass(), "jsType", null);
        setField(term42654, term42654.getClass(), "parent", null);
        setField(term42653, term42653.getClass(), "first", term42654);
        setDoubleField(term42655, term42655.getClass(), "number", 0.0);
        setIntField(term42655, term42655.getClass(), "type", 0);
        setField(term42655, term42655.getClass(), "next", null);
        setField(term42655, term42655.getClass(), "first", null);
        setField(term42655, term42655.getClass(), "last", null);
        setField(term42655, term42655.getClass(), "propListHead", null);
        setIntField(term42655, term42655.getClass(), "sourcePosition", 0);
        setField(term42655, term42655.getClass(), "jsType", null);
        setField(term42655, term42655.getClass(), "parent", null);
        setField(term42653, term42653.getClass(), "last", term42655);
        setField(term42653, term42653.getClass(), "propListHead", null);
        setIntField(term42653, term42653.getClass(), "sourcePosition", 0);
        setField(term42653, term42653.getClass(), "jsType", null);
        setField(term42653, term42653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term42400;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term42308, args);
        assertTrue(recursiveEquals(term42308, term42652));
        assertTrue(recursiveEquals(term42400, term42653));
        assertTrue(recursiveEquals(retValue, null));
    }

};


