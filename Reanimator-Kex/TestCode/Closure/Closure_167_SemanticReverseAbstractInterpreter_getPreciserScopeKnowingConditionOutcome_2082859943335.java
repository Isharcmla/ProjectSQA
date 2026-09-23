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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86692;
     Object term86784;
     Object term87031;
     Object term87032;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86692 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term86784 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86876 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term86968 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term86784, term86784.getClass(), "type", 45);
        setIntField(term86876, term86876.getClass(), "type", 0);
        setField(term86784, term86784.getClass(), "first", term86876);
        setField(term86784, term86784.getClass(), "last", term86968);
        term87031 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term87031, term87031.getClass(), "INEQ", null);
        setField(term87031, term87031.getClass(), "convention", null);
        setField(term87031, term87031.getClass(), "typeRegistry", null);
        setField(term87031, term87031.getClass(), "firstLink", null);
        setField(term87031, term87031.getClass(), "nextLink", null);
        setField(term87031, term87031.getClass(), "restrictUndefinedVisitor", null);
        setField(term87031, term87031.getClass(), "restrictNullVisitor", null);
        term87032 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87033 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term87034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term87032, term87032.getClass(), "number", 0.0);
        setIntField(term87032, term87032.getClass(), "type", 45);
        setField(term87032, term87032.getClass(), "next", null);
        setField(term87033, term87033.getClass(), "str", null);
        setIntField(term87033, term87033.getClass(), "type", 0);
        setField(term87033, term87033.getClass(), "next", null);
        setField(term87033, term87033.getClass(), "first", null);
        setField(term87033, term87033.getClass(), "last", null);
        setField(term87033, term87033.getClass(), "propListHead", null);
        setIntField(term87033, term87033.getClass(), "sourcePosition", 0);
        setField(term87033, term87033.getClass(), "jsType", null);
        setField(term87033, term87033.getClass(), "parent", null);
        setField(term87032, term87032.getClass(), "first", term87033);
        setDoubleField(term87034, term87034.getClass(), "number", 0.0);
        setIntField(term87034, term87034.getClass(), "type", 0);
        setField(term87034, term87034.getClass(), "next", null);
        setField(term87034, term87034.getClass(), "first", null);
        setField(term87034, term87034.getClass(), "last", null);
        setField(term87034, term87034.getClass(), "propListHead", null);
        setIntField(term87034, term87034.getClass(), "sourcePosition", 0);
        setField(term87034, term87034.getClass(), "jsType", null);
        setField(term87034, term87034.getClass(), "parent", null);
        setField(term87032, term87032.getClass(), "last", term87034);
        setField(term87032, term87032.getClass(), "propListHead", null);
        setIntField(term87032, term87032.getClass(), "sourcePosition", 0);
        setField(term87032, term87032.getClass(), "jsType", null);
        setField(term87032, term87032.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term86784;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term86692, args);
        assertTrue(recursiveEquals(term86692, term87031));
        assertTrue(recursiveEquals(term86784, term87032));
        assertTrue(recursiveEquals(retValue, null));
    }

};


