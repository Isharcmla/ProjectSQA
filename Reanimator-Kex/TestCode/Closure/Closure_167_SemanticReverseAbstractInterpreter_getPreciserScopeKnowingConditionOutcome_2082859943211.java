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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49630;
     Object term49722;
     Object term50233;
     Object term50234;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49630 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term49722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term49814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term49906 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term49722, term49722.getClass(), "type", 46);
        setField(term49722, term49722.getClass(), "first", term49814);
        setField(term49722, term49722.getClass(), "last", term49906);
        term50233 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term50233, term50233.getClass(), "INEQ", null);
        setField(term50233, term50233.getClass(), "convention", null);
        setField(term50233, term50233.getClass(), "typeRegistry", null);
        setField(term50233, term50233.getClass(), "firstLink", null);
        setField(term50233, term50233.getClass(), "nextLink", null);
        setField(term50233, term50233.getClass(), "restrictUndefinedVisitor", null);
        setField(term50233, term50233.getClass(), "restrictNullVisitor", null);
        term50234 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term50235 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term50236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term50234, term50234.getClass(), "str", null);
        setIntField(term50234, term50234.getClass(), "type", 46);
        setField(term50234, term50234.getClass(), "next", null);
        setField(term50235, term50235.getClass(), "str", null);
        setIntField(term50235, term50235.getClass(), "type", 0);
        setField(term50235, term50235.getClass(), "next", null);
        setField(term50235, term50235.getClass(), "first", null);
        setField(term50235, term50235.getClass(), "last", null);
        setField(term50235, term50235.getClass(), "propListHead", null);
        setIntField(term50235, term50235.getClass(), "sourcePosition", 0);
        setField(term50235, term50235.getClass(), "jsType", null);
        setField(term50235, term50235.getClass(), "parent", null);
        setField(term50234, term50234.getClass(), "first", term50235);
        setField(term50236, term50236.getClass(), "str", null);
        setIntField(term50236, term50236.getClass(), "type", 0);
        setField(term50236, term50236.getClass(), "next", null);
        setField(term50236, term50236.getClass(), "first", null);
        setField(term50236, term50236.getClass(), "last", null);
        setField(term50236, term50236.getClass(), "propListHead", null);
        setIntField(term50236, term50236.getClass(), "sourcePosition", 0);
        setField(term50236, term50236.getClass(), "jsType", null);
        setField(term50236, term50236.getClass(), "parent", null);
        setField(term50234, term50234.getClass(), "last", term50236);
        setField(term50234, term50234.getClass(), "propListHead", null);
        setIntField(term50234, term50234.getClass(), "sourcePosition", 0);
        setField(term50234, term50234.getClass(), "jsType", null);
        setField(term50234, term50234.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term49722;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term49630, args);
        assertTrue(recursiveEquals(term49630, term50233));
        assertTrue(recursiveEquals(term49722, term50234));
        assertTrue(recursiveEquals(retValue, null));
    }

};


