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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222793;
     Object term222885;
     Object term223252;
     Object term223253;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222793 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term222885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222977 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223069 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setIntField(term222885, term222885.getClass(), "type", 45);
        setIntField(term222977, term222977.getClass(), "type", -197085);
        setField(term222977, term222977.getClass(), "jsType", null);
        setField(term222885, term222885.getClass(), "first", term222977);
        setIntField(term223069, term223069.getClass(), "type", 196608);
        setField(term223069, term223069.getClass(), "jsType", term223167);
        setField(term222885, term222885.getClass(), "last", term223069);
        term223252 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term223252, term223252.getClass(), "INEQ", null);
        setField(term223252, term223252.getClass(), "convention", null);
        setField(term223252, term223252.getClass(), "typeRegistry", null);
        setField(term223252, term223252.getClass(), "firstLink", null);
        setField(term223252, term223252.getClass(), "nextLink", null);
        setField(term223252, term223252.getClass(), "restrictUndefinedVisitor", null);
        setField(term223252, term223252.getClass(), "restrictNullVisitor", null);
        term223253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term223254 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223255 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setDoubleField(term223253, term223253.getClass(), "number", 0.0);
        setIntField(term223253, term223253.getClass(), "type", 45);
        setField(term223253, term223253.getClass(), "next", null);
        setField(term223254, term223254.getClass(), "str", null);
        setIntField(term223254, term223254.getClass(), "type", -197085);
        setField(term223254, term223254.getClass(), "next", null);
        setField(term223254, term223254.getClass(), "first", null);
        setField(term223254, term223254.getClass(), "last", null);
        setField(term223254, term223254.getClass(), "propListHead", null);
        setIntField(term223254, term223254.getClass(), "sourcePosition", 0);
        setField(term223254, term223254.getClass(), "jsType", null);
        setField(term223254, term223254.getClass(), "parent", null);
        setField(term223253, term223253.getClass(), "first", term223254);
        setField(term223255, term223255.getClass(), "str", null);
        setIntField(term223255, term223255.getClass(), "type", 196608);
        setField(term223255, term223255.getClass(), "next", null);
        setField(term223255, term223255.getClass(), "first", null);
        setField(term223255, term223255.getClass(), "last", null);
        setField(term223255, term223255.getClass(), "propListHead", null);
        setIntField(term223255, term223255.getClass(), "sourcePosition", 0);
        setBooleanField(term223256, term223256.getClass(), "resolved", false);
        setField(term223256, term223256.getClass(), "resolveResult", null);
        setBooleanField(term223256, term223256.getClass(), "inTemplatedCheckVisit", false);
        setField(term223256, term223256.getClass(), "registry", null);
        setField(term223255, term223255.getClass(), "jsType", term223256);
        setField(term223255, term223255.getClass(), "parent", null);
        setField(term223253, term223253.getClass(), "last", term223255);
        setField(term223253, term223253.getClass(), "propListHead", null);
        setIntField(term223253, term223253.getClass(), "sourcePosition", 0);
        setField(term223253, term223253.getClass(), "jsType", null);
        setField(term223253, term223253.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term222885;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term222793, args);
        assertTrue(recursiveEquals(term222793, term223252));
        assertTrue(recursiveEquals(term222885, term223253));
        assertTrue(recursiveEquals(retValue, null));
    }

};


