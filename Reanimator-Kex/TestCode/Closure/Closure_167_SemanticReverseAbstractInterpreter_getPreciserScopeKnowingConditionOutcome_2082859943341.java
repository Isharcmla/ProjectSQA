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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87962;
     Object term88054;
     Object term88300;
     Object term88301;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87962 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term88054 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term88146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term88238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term88054, term88054.getClass(), "type", 45);
        setIntField(term88146, term88146.getClass(), "type", -46);
        setField(term88054, term88054.getClass(), "first", term88146);
        setIntField(term88238, term88238.getClass(), "type", 45);
        setField(term88054, term88054.getClass(), "last", term88238);
        term88300 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term88300, term88300.getClass(), "INEQ", null);
        setField(term88300, term88300.getClass(), "convention", null);
        setField(term88300, term88300.getClass(), "typeRegistry", null);
        setField(term88300, term88300.getClass(), "firstLink", null);
        setField(term88300, term88300.getClass(), "nextLink", null);
        setField(term88300, term88300.getClass(), "restrictUndefinedVisitor", null);
        setField(term88300, term88300.getClass(), "restrictNullVisitor", null);
        term88301 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term88302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term88303 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term88301, term88301.getClass(), "str", null);
        setIntField(term88301, term88301.getClass(), "type", 45);
        setField(term88301, term88301.getClass(), "next", null);
        setField(term88302, term88302.getClass(), "str", null);
        setIntField(term88302, term88302.getClass(), "type", -46);
        setField(term88302, term88302.getClass(), "next", null);
        setField(term88302, term88302.getClass(), "first", null);
        setField(term88302, term88302.getClass(), "last", null);
        setField(term88302, term88302.getClass(), "propListHead", null);
        setIntField(term88302, term88302.getClass(), "sourcePosition", 0);
        setField(term88302, term88302.getClass(), "jsType", null);
        setField(term88302, term88302.getClass(), "parent", null);
        setField(term88301, term88301.getClass(), "first", term88302);
        setDoubleField(term88303, term88303.getClass(), "number", 0.0);
        setIntField(term88303, term88303.getClass(), "type", 45);
        setField(term88303, term88303.getClass(), "next", null);
        setField(term88303, term88303.getClass(), "first", null);
        setField(term88303, term88303.getClass(), "last", null);
        setField(term88303, term88303.getClass(), "propListHead", null);
        setIntField(term88303, term88303.getClass(), "sourcePosition", 0);
        setField(term88303, term88303.getClass(), "jsType", null);
        setField(term88303, term88303.getClass(), "parent", null);
        setField(term88301, term88301.getClass(), "last", term88303);
        setField(term88301, term88301.getClass(), "propListHead", null);
        setIntField(term88301, term88301.getClass(), "sourcePosition", 0);
        setField(term88301, term88301.getClass(), "jsType", null);
        setField(term88301, term88301.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term88054;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term87962, args);
        assertTrue(recursiveEquals(term87962, term88300));
        assertTrue(recursiveEquals(term88054, term88301));
        assertTrue(recursiveEquals(retValue, null));
    }

};


