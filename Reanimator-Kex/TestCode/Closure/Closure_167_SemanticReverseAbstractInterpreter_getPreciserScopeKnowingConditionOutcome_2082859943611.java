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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171368;
     Object term171460;
     Object term171801;
     Object term171802;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171368 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term171460 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171552 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171644 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term171460, term171460.getClass(), "type", 12);
        setIntField(term171552, term171552.getClass(), "type", 0);
        setField(term171460, term171460.getClass(), "first", term171552);
        setField(term171460, term171460.getClass(), "last", term171644);
        term171801 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term171801, term171801.getClass(), "INEQ", null);
        setField(term171801, term171801.getClass(), "convention", null);
        setField(term171801, term171801.getClass(), "typeRegistry", null);
        setField(term171801, term171801.getClass(), "firstLink", null);
        setField(term171801, term171801.getClass(), "nextLink", null);
        setField(term171801, term171801.getClass(), "restrictUndefinedVisitor", null);
        setField(term171801, term171801.getClass(), "restrictNullVisitor", null);
        term171802 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171803 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171804 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term171802, term171802.getClass(), "str", null);
        setIntField(term171802, term171802.getClass(), "type", 12);
        setField(term171802, term171802.getClass(), "next", null);
        setDoubleField(term171803, term171803.getClass(), "number", 0.0);
        setIntField(term171803, term171803.getClass(), "type", 0);
        setField(term171803, term171803.getClass(), "next", null);
        setField(term171803, term171803.getClass(), "first", null);
        setField(term171803, term171803.getClass(), "last", null);
        setField(term171803, term171803.getClass(), "propListHead", null);
        setIntField(term171803, term171803.getClass(), "sourcePosition", 0);
        setField(term171803, term171803.getClass(), "jsType", null);
        setField(term171803, term171803.getClass(), "parent", null);
        setField(term171802, term171802.getClass(), "first", term171803);
        setDoubleField(term171804, term171804.getClass(), "number", 0.0);
        setIntField(term171804, term171804.getClass(), "type", 0);
        setField(term171804, term171804.getClass(), "next", null);
        setField(term171804, term171804.getClass(), "first", null);
        setField(term171804, term171804.getClass(), "last", null);
        setField(term171804, term171804.getClass(), "propListHead", null);
        setIntField(term171804, term171804.getClass(), "sourcePosition", 0);
        setField(term171804, term171804.getClass(), "jsType", null);
        setField(term171804, term171804.getClass(), "parent", null);
        setField(term171802, term171802.getClass(), "last", term171804);
        setField(term171802, term171802.getClass(), "propListHead", null);
        setIntField(term171802, term171802.getClass(), "sourcePosition", 0);
        setField(term171802, term171802.getClass(), "jsType", null);
        setField(term171802, term171802.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term171460;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term171368, args);
        assertTrue(recursiveEquals(term171368, term171801));
        assertTrue(recursiveEquals(term171460, term171802));
        assertTrue(recursiveEquals(retValue, null));
    }

};


