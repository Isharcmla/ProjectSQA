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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38428;
     Object term38520;
     Object term38772;
     Object term38773;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38428 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term38520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38612 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38704 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term38520, term38520.getClass(), "type", 13);
        setIntField(term38612, term38612.getClass(), "type", 13);
        setField(term38520, term38520.getClass(), "first", term38612);
        setField(term38520, term38520.getClass(), "last", term38704);
        term38772 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term38772, term38772.getClass(), "INEQ", null);
        setField(term38772, term38772.getClass(), "convention", null);
        setField(term38772, term38772.getClass(), "typeRegistry", null);
        setField(term38772, term38772.getClass(), "firstLink", null);
        setField(term38772, term38772.getClass(), "nextLink", null);
        setField(term38772, term38772.getClass(), "restrictUndefinedVisitor", null);
        setField(term38772, term38772.getClass(), "restrictNullVisitor", null);
        term38773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38774 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38775 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term38773, term38773.getClass(), "number", 0.0);
        setIntField(term38773, term38773.getClass(), "type", 13);
        setField(term38773, term38773.getClass(), "next", null);
        setDoubleField(term38774, term38774.getClass(), "number", 0.0);
        setIntField(term38774, term38774.getClass(), "type", 13);
        setField(term38774, term38774.getClass(), "next", null);
        setField(term38774, term38774.getClass(), "first", null);
        setField(term38774, term38774.getClass(), "last", null);
        setField(term38774, term38774.getClass(), "propListHead", null);
        setIntField(term38774, term38774.getClass(), "sourcePosition", 0);
        setField(term38774, term38774.getClass(), "jsType", null);
        setField(term38774, term38774.getClass(), "parent", null);
        setField(term38773, term38773.getClass(), "first", term38774);
        setDoubleField(term38775, term38775.getClass(), "number", 0.0);
        setIntField(term38775, term38775.getClass(), "type", 0);
        setField(term38775, term38775.getClass(), "next", null);
        setField(term38775, term38775.getClass(), "first", null);
        setField(term38775, term38775.getClass(), "last", null);
        setField(term38775, term38775.getClass(), "propListHead", null);
        setIntField(term38775, term38775.getClass(), "sourcePosition", 0);
        setField(term38775, term38775.getClass(), "jsType", null);
        setField(term38775, term38775.getClass(), "parent", null);
        setField(term38773, term38773.getClass(), "last", term38775);
        setField(term38773, term38773.getClass(), "propListHead", null);
        setIntField(term38773, term38773.getClass(), "sourcePosition", 0);
        setField(term38773, term38773.getClass(), "jsType", null);
        setField(term38773, term38773.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term38520;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term38428, args);
        assertTrue(recursiveEquals(term38428, term38772));
        assertTrue(recursiveEquals(term38520, term38773));
        assertTrue(recursiveEquals(retValue, null));
    }

};


