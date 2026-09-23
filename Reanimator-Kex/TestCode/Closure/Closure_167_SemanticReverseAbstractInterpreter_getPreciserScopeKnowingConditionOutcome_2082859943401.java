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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105073;
     Object term105165;
     Object term105385;
     Object term105386;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105073 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term105165 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term105327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105165, term105165.getClass(), "type", 12);
        setIntField(term105257, term105257.getClass(), "type", 0);
        setField(term105165, term105165.getClass(), "first", term105257);
        setField(term105165, term105165.getClass(), "last", term105327);
        term105385 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term105385, term105385.getClass(), "INEQ", null);
        setField(term105385, term105385.getClass(), "convention", null);
        setField(term105385, term105385.getClass(), "typeRegistry", null);
        setField(term105385, term105385.getClass(), "firstLink", null);
        setField(term105385, term105385.getClass(), "nextLink", null);
        setField(term105385, term105385.getClass(), "restrictUndefinedVisitor", null);
        setField(term105385, term105385.getClass(), "restrictNullVisitor", null);
        term105386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term105388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term105386, term105386.getClass(), "number", 0.0);
        setIntField(term105386, term105386.getClass(), "type", 12);
        setField(term105386, term105386.getClass(), "next", null);
        setField(term105387, term105387.getClass(), "str", null);
        setIntField(term105387, term105387.getClass(), "type", 0);
        setField(term105387, term105387.getClass(), "next", null);
        setField(term105387, term105387.getClass(), "first", null);
        setField(term105387, term105387.getClass(), "last", null);
        setField(term105387, term105387.getClass(), "propListHead", null);
        setIntField(term105387, term105387.getClass(), "sourcePosition", 0);
        setField(term105387, term105387.getClass(), "jsType", null);
        setField(term105387, term105387.getClass(), "parent", null);
        setField(term105386, term105386.getClass(), "first", term105387);
        setIntField(term105388, term105388.getClass(), "type", 0);
        setField(term105388, term105388.getClass(), "next", null);
        setField(term105388, term105388.getClass(), "first", null);
        setField(term105388, term105388.getClass(), "last", null);
        setField(term105388, term105388.getClass(), "propListHead", null);
        setIntField(term105388, term105388.getClass(), "sourcePosition", 0);
        setField(term105388, term105388.getClass(), "jsType", null);
        setField(term105388, term105388.getClass(), "parent", null);
        setField(term105386, term105386.getClass(), "last", term105388);
        setField(term105386, term105386.getClass(), "propListHead", null);
        setIntField(term105386, term105386.getClass(), "sourcePosition", 0);
        setField(term105386, term105386.getClass(), "jsType", null);
        setField(term105386, term105386.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term105165;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term105073, args);
        assertTrue(recursiveEquals(term105073, term105385));
        assertTrue(recursiveEquals(term105165, term105386));
        assertTrue(recursiveEquals(retValue, null));
    }

};


