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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78265;
     Object term78357;
     Object term78724;
     Object term78725;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78265 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term78357 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78449 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78541 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78633 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term78357, term78357.getClass(), "type", 111);
        setIntField(term78541, term78541.getClass(), "type", 111);
        setField(term78449, term78449.getClass(), "first", term78541);
        setField(term78357, term78357.getClass(), "parent", term78449);
        setField(term78357, term78357.getClass(), "first", term78633);
        term78724 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term78724, term78724.getClass(), "INEQ", null);
        setField(term78724, term78724.getClass(), "convention", null);
        setField(term78724, term78724.getClass(), "typeRegistry", null);
        setField(term78724, term78724.getClass(), "firstLink", null);
        setField(term78724, term78724.getClass(), "nextLink", null);
        setField(term78724, term78724.getClass(), "restrictUndefinedVisitor", null);
        setField(term78724, term78724.getClass(), "restrictNullVisitor", null);
        term78725 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78726 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term78727 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term78725, term78725.getClass(), "number", 0.0);
        setIntField(term78725, term78725.getClass(), "type", 111);
        setField(term78725, term78725.getClass(), "next", null);
        setField(term78726, term78726.getClass(), "str", null);
        setIntField(term78726, term78726.getClass(), "type", 0);
        setField(term78726, term78726.getClass(), "next", null);
        setField(term78726, term78726.getClass(), "first", null);
        setField(term78726, term78726.getClass(), "last", null);
        setField(term78726, term78726.getClass(), "propListHead", null);
        setIntField(term78726, term78726.getClass(), "sourcePosition", 0);
        setField(term78726, term78726.getClass(), "jsType", null);
        setField(term78726, term78726.getClass(), "parent", null);
        setField(term78725, term78725.getClass(), "first", term78726);
        setField(term78725, term78725.getClass(), "last", null);
        setField(term78725, term78725.getClass(), "propListHead", null);
        setIntField(term78725, term78725.getClass(), "sourcePosition", 0);
        setField(term78725, term78725.getClass(), "jsType", null);
        setDoubleField(term78727, term78727.getClass(), "number", 0.0);
        setIntField(term78727, term78727.getClass(), "type", 0);
        setField(term78727, term78727.getClass(), "next", null);
        setDoubleField(term78728, term78728.getClass(), "number", 0.0);
        setIntField(term78728, term78728.getClass(), "type", 111);
        setField(term78728, term78728.getClass(), "next", null);
        setField(term78728, term78728.getClass(), "first", null);
        setField(term78728, term78728.getClass(), "last", null);
        setField(term78728, term78728.getClass(), "propListHead", null);
        setIntField(term78728, term78728.getClass(), "sourcePosition", 0);
        setField(term78728, term78728.getClass(), "jsType", null);
        setField(term78728, term78728.getClass(), "parent", null);
        setField(term78727, term78727.getClass(), "first", term78728);
        setField(term78727, term78727.getClass(), "last", null);
        setField(term78727, term78727.getClass(), "propListHead", null);
        setIntField(term78727, term78727.getClass(), "sourcePosition", 0);
        setField(term78727, term78727.getClass(), "jsType", null);
        setField(term78727, term78727.getClass(), "parent", null);
        setField(term78725, term78725.getClass(), "parent", term78727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term78357;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term78265, args);
        assertTrue(recursiveEquals(term78265, term78724));
        assertTrue(recursiveEquals(term78357, term78725));
        assertTrue(recursiveEquals(retValue, null));
    }

};


