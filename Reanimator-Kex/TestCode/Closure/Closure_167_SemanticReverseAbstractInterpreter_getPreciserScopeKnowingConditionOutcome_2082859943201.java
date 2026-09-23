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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47173;
     Object term47265;
     Object term47516;
     Object term47517;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47173 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term47265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47357 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term47449 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term47265, term47265.getClass(), "type", 45);
        setIntField(term47357, term47357.getClass(), "type", 0);
        setField(term47265, term47265.getClass(), "first", term47357);
        setField(term47265, term47265.getClass(), "last", term47449);
        term47516 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term47516, term47516.getClass(), "INEQ", null);
        setField(term47516, term47516.getClass(), "convention", null);
        setField(term47516, term47516.getClass(), "typeRegistry", null);
        setField(term47516, term47516.getClass(), "firstLink", null);
        setField(term47516, term47516.getClass(), "nextLink", null);
        setField(term47516, term47516.getClass(), "restrictUndefinedVisitor", null);
        setField(term47516, term47516.getClass(), "restrictNullVisitor", null);
        term47517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47518 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term47519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term47517, term47517.getClass(), "str", null);
        setIntField(term47517, term47517.getClass(), "type", 45);
        setField(term47517, term47517.getClass(), "next", null);
        setDoubleField(term47518, term47518.getClass(), "number", 0.0);
        setIntField(term47518, term47518.getClass(), "type", 0);
        setField(term47518, term47518.getClass(), "next", null);
        setField(term47518, term47518.getClass(), "first", null);
        setField(term47518, term47518.getClass(), "last", null);
        setField(term47518, term47518.getClass(), "propListHead", null);
        setIntField(term47518, term47518.getClass(), "sourcePosition", 0);
        setField(term47518, term47518.getClass(), "jsType", null);
        setField(term47518, term47518.getClass(), "parent", null);
        setField(term47517, term47517.getClass(), "first", term47518);
        setDoubleField(term47519, term47519.getClass(), "number", 0.0);
        setIntField(term47519, term47519.getClass(), "type", 0);
        setField(term47519, term47519.getClass(), "next", null);
        setField(term47519, term47519.getClass(), "first", null);
        setField(term47519, term47519.getClass(), "last", null);
        setField(term47519, term47519.getClass(), "propListHead", null);
        setIntField(term47519, term47519.getClass(), "sourcePosition", 0);
        setField(term47519, term47519.getClass(), "jsType", null);
        setField(term47519, term47519.getClass(), "parent", null);
        setField(term47517, term47517.getClass(), "last", term47519);
        setField(term47517, term47517.getClass(), "propListHead", null);
        setIntField(term47517, term47517.getClass(), "sourcePosition", 0);
        setField(term47517, term47517.getClass(), "jsType", null);
        setField(term47517, term47517.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term47265;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term47173, args);
        assertTrue(recursiveEquals(term47173, term47516));
        assertTrue(recursiveEquals(term47265, term47517));
        assertTrue(recursiveEquals(retValue, null));
    }

};


