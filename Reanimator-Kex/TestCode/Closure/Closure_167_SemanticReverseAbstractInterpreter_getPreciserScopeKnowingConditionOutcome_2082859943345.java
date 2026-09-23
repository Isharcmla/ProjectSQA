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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89545;
     Object term89637;
     Object term89884;
     Object term89885;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89545 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term89637 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term89637, term89637.getClass(), "type", 13);
        setIntField(term89729, term89729.getClass(), "type", 0);
        setField(term89637, term89637.getClass(), "first", term89729);
        setField(term89637, term89637.getClass(), "last", term89821);
        term89884 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term89884, term89884.getClass(), "INEQ", null);
        setField(term89884, term89884.getClass(), "convention", null);
        setField(term89884, term89884.getClass(), "typeRegistry", null);
        setField(term89884, term89884.getClass(), "firstLink", null);
        setField(term89884, term89884.getClass(), "nextLink", null);
        setField(term89884, term89884.getClass(), "restrictUndefinedVisitor", null);
        setField(term89884, term89884.getClass(), "restrictNullVisitor", null);
        term89885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89886 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term89885, term89885.getClass(), "number", 0.0);
        setIntField(term89885, term89885.getClass(), "type", 13);
        setField(term89885, term89885.getClass(), "next", null);
        setField(term89886, term89886.getClass(), "str", null);
        setIntField(term89886, term89886.getClass(), "type", 0);
        setField(term89886, term89886.getClass(), "next", null);
        setField(term89886, term89886.getClass(), "first", null);
        setField(term89886, term89886.getClass(), "last", null);
        setField(term89886, term89886.getClass(), "propListHead", null);
        setIntField(term89886, term89886.getClass(), "sourcePosition", 0);
        setField(term89886, term89886.getClass(), "jsType", null);
        setField(term89886, term89886.getClass(), "parent", null);
        setField(term89885, term89885.getClass(), "first", term89886);
        setDoubleField(term89887, term89887.getClass(), "number", 0.0);
        setIntField(term89887, term89887.getClass(), "type", 0);
        setField(term89887, term89887.getClass(), "next", null);
        setField(term89887, term89887.getClass(), "first", null);
        setField(term89887, term89887.getClass(), "last", null);
        setField(term89887, term89887.getClass(), "propListHead", null);
        setIntField(term89887, term89887.getClass(), "sourcePosition", 0);
        setField(term89887, term89887.getClass(), "jsType", null);
        setField(term89887, term89887.getClass(), "parent", null);
        setField(term89885, term89885.getClass(), "last", term89887);
        setField(term89885, term89885.getClass(), "propListHead", null);
        setIntField(term89885, term89885.getClass(), "sourcePosition", 0);
        setField(term89885, term89885.getClass(), "jsType", null);
        setField(term89885, term89885.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term89637;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term89545, args);
        assertTrue(recursiveEquals(term89545, term89884));
        assertTrue(recursiveEquals(term89637, term89885));
        assertTrue(recursiveEquals(retValue, null));
    }

};


