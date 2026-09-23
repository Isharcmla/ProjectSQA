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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86174;
     Object term86266;
     Object term86518;
     Object term86519;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86174 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term86266 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86358 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86450 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term86266, term86266.getClass(), "type", 45);
        setIntField(term86358, term86358.getClass(), "type", 45);
        setField(term86266, term86266.getClass(), "first", term86358);
        setIntField(term86450, term86450.getClass(), "type", 45);
        setField(term86266, term86266.getClass(), "last", term86450);
        term86518 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term86518, term86518.getClass(), "INEQ", null);
        setField(term86518, term86518.getClass(), "convention", null);
        setField(term86518, term86518.getClass(), "typeRegistry", null);
        setField(term86518, term86518.getClass(), "firstLink", null);
        setField(term86518, term86518.getClass(), "nextLink", null);
        setField(term86518, term86518.getClass(), "restrictUndefinedVisitor", null);
        setField(term86518, term86518.getClass(), "restrictNullVisitor", null);
        term86519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term86519, term86519.getClass(), "number", 0.0);
        setIntField(term86519, term86519.getClass(), "type", 45);
        setField(term86519, term86519.getClass(), "next", null);
        setDoubleField(term86520, term86520.getClass(), "number", 0.0);
        setIntField(term86520, term86520.getClass(), "type", 45);
        setField(term86520, term86520.getClass(), "next", null);
        setField(term86520, term86520.getClass(), "first", null);
        setField(term86520, term86520.getClass(), "last", null);
        setField(term86520, term86520.getClass(), "propListHead", null);
        setIntField(term86520, term86520.getClass(), "sourcePosition", 0);
        setField(term86520, term86520.getClass(), "jsType", null);
        setField(term86520, term86520.getClass(), "parent", null);
        setField(term86519, term86519.getClass(), "first", term86520);
        setDoubleField(term86521, term86521.getClass(), "number", 0.0);
        setIntField(term86521, term86521.getClass(), "type", 45);
        setField(term86521, term86521.getClass(), "next", null);
        setField(term86521, term86521.getClass(), "first", null);
        setField(term86521, term86521.getClass(), "last", null);
        setField(term86521, term86521.getClass(), "propListHead", null);
        setIntField(term86521, term86521.getClass(), "sourcePosition", 0);
        setField(term86521, term86521.getClass(), "jsType", null);
        setField(term86521, term86521.getClass(), "parent", null);
        setField(term86519, term86519.getClass(), "last", term86521);
        setField(term86519, term86519.getClass(), "propListHead", null);
        setIntField(term86519, term86519.getClass(), "sourcePosition", 0);
        setField(term86519, term86519.getClass(), "jsType", null);
        setField(term86519, term86519.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term86266;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term86174, args);
        assertTrue(recursiveEquals(term86174, term86518));
        assertTrue(recursiveEquals(term86266, term86519));
        assertTrue(recursiveEquals(retValue, null));
    }

};


