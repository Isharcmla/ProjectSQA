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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44828;
     Object term44920;
     Object term45166;
     Object term45167;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44828 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term44920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term44920, term44920.getClass(), "type", 45);
        setIntField(term45012, term45012.getClass(), "type", -46);
        setField(term44920, term44920.getClass(), "first", term45012);
        setIntField(term45104, term45104.getClass(), "type", 45);
        setField(term44920, term44920.getClass(), "last", term45104);
        term45166 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term45166, term45166.getClass(), "INEQ", null);
        setField(term45166, term45166.getClass(), "convention", null);
        setField(term45166, term45166.getClass(), "typeRegistry", null);
        setField(term45166, term45166.getClass(), "firstLink", null);
        setField(term45166, term45166.getClass(), "nextLink", null);
        setField(term45166, term45166.getClass(), "restrictUndefinedVisitor", null);
        setField(term45166, term45166.getClass(), "restrictNullVisitor", null);
        term45167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term45167, term45167.getClass(), "str", null);
        setIntField(term45167, term45167.getClass(), "type", 45);
        setField(term45167, term45167.getClass(), "next", null);
        setDoubleField(term45168, term45168.getClass(), "number", 0.0);
        setIntField(term45168, term45168.getClass(), "type", -46);
        setField(term45168, term45168.getClass(), "next", null);
        setField(term45168, term45168.getClass(), "first", null);
        setField(term45168, term45168.getClass(), "last", null);
        setField(term45168, term45168.getClass(), "propListHead", null);
        setIntField(term45168, term45168.getClass(), "sourcePosition", 0);
        setField(term45168, term45168.getClass(), "jsType", null);
        setField(term45168, term45168.getClass(), "parent", null);
        setField(term45167, term45167.getClass(), "first", term45168);
        setField(term45169, term45169.getClass(), "str", null);
        setIntField(term45169, term45169.getClass(), "type", 45);
        setField(term45169, term45169.getClass(), "next", null);
        setField(term45169, term45169.getClass(), "first", null);
        setField(term45169, term45169.getClass(), "last", null);
        setField(term45169, term45169.getClass(), "propListHead", null);
        setIntField(term45169, term45169.getClass(), "sourcePosition", 0);
        setField(term45169, term45169.getClass(), "jsType", null);
        setField(term45169, term45169.getClass(), "parent", null);
        setField(term45167, term45167.getClass(), "last", term45169);
        setField(term45167, term45167.getClass(), "propListHead", null);
        setIntField(term45167, term45167.getClass(), "sourcePosition", 0);
        setField(term45167, term45167.getClass(), "jsType", null);
        setField(term45167, term45167.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term44920;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term44828, args);
        assertTrue(recursiveEquals(term44828, term45166));
        assertTrue(recursiveEquals(term44920, term45167));
        assertTrue(recursiveEquals(retValue, null));
    }

};


