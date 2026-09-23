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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199352;
     Object term199444;
     Object term199561;
     Object term199562;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199352 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term199444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term199444, term199444.getClass(), "type", 51);
        setField(term199444, term199444.getClass(), "first", term199536);
        term199561 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term199561, term199561.getClass(), "INEQ", null);
        setField(term199561, term199561.getClass(), "convention", null);
        setField(term199561, term199561.getClass(), "typeRegistry", null);
        setField(term199561, term199561.getClass(), "firstLink", null);
        setField(term199561, term199561.getClass(), "nextLink", null);
        setField(term199561, term199561.getClass(), "restrictUndefinedVisitor", null);
        setField(term199561, term199561.getClass(), "restrictNullVisitor", null);
        term199562 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199563 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term199562, term199562.getClass(), "str", null);
        setIntField(term199562, term199562.getClass(), "type", 51);
        setField(term199562, term199562.getClass(), "next", null);
        setDoubleField(term199563, term199563.getClass(), "number", 0.0);
        setIntField(term199563, term199563.getClass(), "type", 0);
        setField(term199563, term199563.getClass(), "next", null);
        setField(term199563, term199563.getClass(), "first", null);
        setField(term199563, term199563.getClass(), "last", null);
        setField(term199563, term199563.getClass(), "propListHead", null);
        setIntField(term199563, term199563.getClass(), "sourcePosition", 0);
        setField(term199563, term199563.getClass(), "jsType", null);
        setField(term199563, term199563.getClass(), "parent", null);
        setField(term199562, term199562.getClass(), "first", term199563);
        setField(term199562, term199562.getClass(), "last", null);
        setField(term199562, term199562.getClass(), "propListHead", null);
        setIntField(term199562, term199562.getClass(), "sourcePosition", 0);
        setField(term199562, term199562.getClass(), "jsType", null);
        setField(term199562, term199562.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term199444;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term199352, args);
        assertTrue(recursiveEquals(term199352, term199561));
        assertTrue(recursiveEquals(term199444, term199562));
        assertTrue(recursiveEquals(retValue, null));
    }

};


