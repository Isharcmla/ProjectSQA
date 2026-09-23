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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217030;
     Object term217122;
     Object term217364;
     Object term217365;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217030 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term217122 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term217214 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term217306 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term217122, term217122.getClass(), "type", 46);
        setIntField(term217214, term217214.getClass(), "type", 46);
        setField(term217122, term217122.getClass(), "first", term217214);
        setIntField(term217306, term217306.getClass(), "type", 46);
        setField(term217122, term217122.getClass(), "last", term217306);
        term217364 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term217364, term217364.getClass(), "INEQ", null);
        setField(term217364, term217364.getClass(), "convention", null);
        setField(term217364, term217364.getClass(), "typeRegistry", null);
        setField(term217364, term217364.getClass(), "firstLink", null);
        setField(term217364, term217364.getClass(), "nextLink", null);
        setField(term217364, term217364.getClass(), "restrictUndefinedVisitor", null);
        setField(term217364, term217364.getClass(), "restrictNullVisitor", null);
        term217365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term217366 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term217367 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term217365, term217365.getClass(), "number", 0.0);
        setIntField(term217365, term217365.getClass(), "type", 46);
        setField(term217365, term217365.getClass(), "next", null);
        setField(term217366, term217366.getClass(), "str", null);
        setIntField(term217366, term217366.getClass(), "type", 46);
        setField(term217366, term217366.getClass(), "next", null);
        setField(term217366, term217366.getClass(), "first", null);
        setField(term217366, term217366.getClass(), "last", null);
        setField(term217366, term217366.getClass(), "propListHead", null);
        setIntField(term217366, term217366.getClass(), "sourcePosition", 0);
        setField(term217366, term217366.getClass(), "jsType", null);
        setField(term217366, term217366.getClass(), "parent", null);
        setField(term217365, term217365.getClass(), "first", term217366);
        setField(term217367, term217367.getClass(), "str", null);
        setIntField(term217367, term217367.getClass(), "type", 46);
        setField(term217367, term217367.getClass(), "next", null);
        setField(term217367, term217367.getClass(), "first", null);
        setField(term217367, term217367.getClass(), "last", null);
        setField(term217367, term217367.getClass(), "propListHead", null);
        setIntField(term217367, term217367.getClass(), "sourcePosition", 0);
        setField(term217367, term217367.getClass(), "jsType", null);
        setField(term217367, term217367.getClass(), "parent", null);
        setField(term217365, term217365.getClass(), "last", term217367);
        setField(term217365, term217365.getClass(), "propListHead", null);
        setIntField(term217365, term217365.getClass(), "sourcePosition", 0);
        setField(term217365, term217365.getClass(), "jsType", null);
        setField(term217365, term217365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term217122;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term217030, args);
        assertTrue(recursiveEquals(term217030, term217364));
        assertTrue(recursiveEquals(term217122, term217365));
        assertTrue(recursiveEquals(retValue, null));
    }

};


