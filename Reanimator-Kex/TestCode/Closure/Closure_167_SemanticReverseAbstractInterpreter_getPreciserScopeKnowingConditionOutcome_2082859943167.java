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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37466;
     Object term37558;
     Object term38255;
     Object term38256;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37466 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term37558 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term37650 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term37742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term37558, term37558.getClass(), "type", 45);
        setIntField(term37650, term37650.getClass(), "type", -46);
        setField(term37558, term37558.getClass(), "first", term37650);
        setIntField(term37742, term37742.getClass(), "type", 45);
        setField(term37558, term37558.getClass(), "last", term37742);
        term38255 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term38255, term38255.getClass(), "INEQ", null);
        setField(term38255, term38255.getClass(), "convention", null);
        setField(term38255, term38255.getClass(), "typeRegistry", null);
        setField(term38255, term38255.getClass(), "firstLink", null);
        setField(term38255, term38255.getClass(), "nextLink", null);
        setField(term38255, term38255.getClass(), "restrictUndefinedVisitor", null);
        setField(term38255, term38255.getClass(), "restrictNullVisitor", null);
        term38256 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38257 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term38256, term38256.getClass(), "number", 0.0);
        setIntField(term38256, term38256.getClass(), "type", 45);
        setField(term38256, term38256.getClass(), "next", null);
        setDoubleField(term38257, term38257.getClass(), "number", 0.0);
        setIntField(term38257, term38257.getClass(), "type", -46);
        setField(term38257, term38257.getClass(), "next", null);
        setField(term38257, term38257.getClass(), "first", null);
        setField(term38257, term38257.getClass(), "last", null);
        setField(term38257, term38257.getClass(), "propListHead", null);
        setIntField(term38257, term38257.getClass(), "sourcePosition", 0);
        setField(term38257, term38257.getClass(), "jsType", null);
        setField(term38257, term38257.getClass(), "parent", null);
        setField(term38256, term38256.getClass(), "first", term38257);
        setField(term38258, term38258.getClass(), "str", null);
        setIntField(term38258, term38258.getClass(), "type", 45);
        setField(term38258, term38258.getClass(), "next", null);
        setField(term38258, term38258.getClass(), "first", null);
        setField(term38258, term38258.getClass(), "last", null);
        setField(term38258, term38258.getClass(), "propListHead", null);
        setIntField(term38258, term38258.getClass(), "sourcePosition", 0);
        setField(term38258, term38258.getClass(), "jsType", null);
        setField(term38258, term38258.getClass(), "parent", null);
        setField(term38256, term38256.getClass(), "last", term38258);
        setField(term38256, term38256.getClass(), "propListHead", null);
        setIntField(term38256, term38256.getClass(), "sourcePosition", 0);
        setField(term38256, term38256.getClass(), "jsType", null);
        setField(term38256, term38256.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term37558;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term37466, args);
        assertTrue(recursiveEquals(term37466, term38255));
        assertTrue(recursiveEquals(term37558, term38256));
        assertTrue(recursiveEquals(retValue, null));
    }

};


