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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83877;
     Object term83969;
     Object term84328;
     Object term84329;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83877 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term83969 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84061 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84153 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84245 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term83969, term83969.getClass(), "type", 111);
        setIntField(term84153, term84153.getClass(), "type", 111);
        setField(term84061, term84061.getClass(), "first", term84153);
        setField(term83969, term83969.getClass(), "parent", term84061);
        setField(term83969, term83969.getClass(), "first", term84245);
        term84328 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term84328, term84328.getClass(), "INEQ", null);
        setField(term84328, term84328.getClass(), "convention", null);
        setField(term84328, term84328.getClass(), "typeRegistry", null);
        setField(term84328, term84328.getClass(), "firstLink", null);
        setField(term84328, term84328.getClass(), "nextLink", null);
        setField(term84328, term84328.getClass(), "restrictUndefinedVisitor", null);
        setField(term84328, term84328.getClass(), "restrictNullVisitor", null);
        term84329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84331 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term84329, term84329.getClass(), "str", null);
        setIntField(term84329, term84329.getClass(), "type", 111);
        setField(term84329, term84329.getClass(), "next", null);
        setDoubleField(term84330, term84330.getClass(), "number", 0.0);
        setIntField(term84330, term84330.getClass(), "type", 0);
        setField(term84330, term84330.getClass(), "next", null);
        setField(term84330, term84330.getClass(), "first", null);
        setField(term84330, term84330.getClass(), "last", null);
        setField(term84330, term84330.getClass(), "propListHead", null);
        setIntField(term84330, term84330.getClass(), "sourcePosition", 0);
        setField(term84330, term84330.getClass(), "jsType", null);
        setField(term84330, term84330.getClass(), "parent", null);
        setField(term84329, term84329.getClass(), "first", term84330);
        setField(term84329, term84329.getClass(), "last", null);
        setField(term84329, term84329.getClass(), "propListHead", null);
        setIntField(term84329, term84329.getClass(), "sourcePosition", 0);
        setField(term84329, term84329.getClass(), "jsType", null);
        setField(term84331, term84331.getClass(), "str", null);
        setIntField(term84331, term84331.getClass(), "type", 0);
        setField(term84331, term84331.getClass(), "next", null);
        setField(term84332, term84332.getClass(), "str", null);
        setIntField(term84332, term84332.getClass(), "type", 111);
        setField(term84332, term84332.getClass(), "next", null);
        setField(term84332, term84332.getClass(), "first", null);
        setField(term84332, term84332.getClass(), "last", null);
        setField(term84332, term84332.getClass(), "propListHead", null);
        setIntField(term84332, term84332.getClass(), "sourcePosition", 0);
        setField(term84332, term84332.getClass(), "jsType", null);
        setField(term84332, term84332.getClass(), "parent", null);
        setField(term84331, term84331.getClass(), "first", term84332);
        setField(term84331, term84331.getClass(), "last", null);
        setField(term84331, term84331.getClass(), "propListHead", null);
        setIntField(term84331, term84331.getClass(), "sourcePosition", 0);
        setField(term84331, term84331.getClass(), "jsType", null);
        setField(term84331, term84331.getClass(), "parent", null);
        setField(term84329, term84329.getClass(), "parent", term84331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term83969;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term83877, args);
        assertTrue(recursiveEquals(term83877, term84328));
        assertTrue(recursiveEquals(term83969, term84329));
        assertTrue(recursiveEquals(retValue, null));
    }

};


