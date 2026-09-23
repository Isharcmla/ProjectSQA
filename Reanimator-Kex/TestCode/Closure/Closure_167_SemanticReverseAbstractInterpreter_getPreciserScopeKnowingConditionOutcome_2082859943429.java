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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111949;
     Object term112041;
     Object term112292;
     Object term112293;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111949 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term112041 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term112133 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term112225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term112041, term112041.getClass(), "type", 45);
        setIntField(term112133, term112133.getClass(), "type", 45);
        setField(term112041, term112041.getClass(), "first", term112133);
        setIntField(term112225, term112225.getClass(), "type", 45);
        setField(term112041, term112041.getClass(), "last", term112225);
        term112292 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term112292, term112292.getClass(), "INEQ", null);
        setField(term112292, term112292.getClass(), "convention", null);
        setField(term112292, term112292.getClass(), "typeRegistry", null);
        setField(term112292, term112292.getClass(), "firstLink", null);
        setField(term112292, term112292.getClass(), "nextLink", null);
        setField(term112292, term112292.getClass(), "restrictUndefinedVisitor", null);
        setField(term112292, term112292.getClass(), "restrictNullVisitor", null);
        term112293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term112294 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term112295 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term112293, term112293.getClass(), "str", null);
        setIntField(term112293, term112293.getClass(), "type", 45);
        setField(term112293, term112293.getClass(), "next", null);
        setDoubleField(term112294, term112294.getClass(), "number", 0.0);
        setIntField(term112294, term112294.getClass(), "type", 45);
        setField(term112294, term112294.getClass(), "next", null);
        setField(term112294, term112294.getClass(), "first", null);
        setField(term112294, term112294.getClass(), "last", null);
        setField(term112294, term112294.getClass(), "propListHead", null);
        setIntField(term112294, term112294.getClass(), "sourcePosition", 0);
        setField(term112294, term112294.getClass(), "jsType", null);
        setField(term112294, term112294.getClass(), "parent", null);
        setField(term112293, term112293.getClass(), "first", term112294);
        setDoubleField(term112295, term112295.getClass(), "number", 0.0);
        setIntField(term112295, term112295.getClass(), "type", 45);
        setField(term112295, term112295.getClass(), "next", null);
        setField(term112295, term112295.getClass(), "first", null);
        setField(term112295, term112295.getClass(), "last", null);
        setField(term112295, term112295.getClass(), "propListHead", null);
        setIntField(term112295, term112295.getClass(), "sourcePosition", 0);
        setField(term112295, term112295.getClass(), "jsType", null);
        setField(term112295, term112295.getClass(), "parent", null);
        setField(term112293, term112293.getClass(), "last", term112295);
        setField(term112293, term112293.getClass(), "propListHead", null);
        setIntField(term112293, term112293.getClass(), "sourcePosition", 0);
        setField(term112293, term112293.getClass(), "jsType", null);
        setField(term112293, term112293.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term112041;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term111949, args);
        assertTrue(recursiveEquals(term111949, term112292));
        assertTrue(recursiveEquals(term112041, term112293));
        assertTrue(recursiveEquals(retValue, null));
    }

};


