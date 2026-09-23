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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131340;
     Object term131432;
     Object term131656;
     Object term131657;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131340 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term131432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term131594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term131432, term131432.getClass(), "type", 13);
        setIntField(term131524, term131524.getClass(), "type", -14);
        setField(term131432, term131432.getClass(), "first", term131524);
        setIntField(term131594, term131594.getClass(), "type", 13);
        setField(term131432, term131432.getClass(), "last", term131594);
        term131656 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term131656, term131656.getClass(), "INEQ", null);
        setField(term131656, term131656.getClass(), "convention", null);
        setField(term131656, term131656.getClass(), "typeRegistry", null);
        setField(term131656, term131656.getClass(), "firstLink", null);
        setField(term131656, term131656.getClass(), "nextLink", null);
        setField(term131656, term131656.getClass(), "restrictUndefinedVisitor", null);
        setField(term131656, term131656.getClass(), "restrictNullVisitor", null);
        term131657 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131658 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term131659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term131657, term131657.getClass(), "str", null);
        setIntField(term131657, term131657.getClass(), "type", 13);
        setField(term131657, term131657.getClass(), "next", null);
        setDoubleField(term131658, term131658.getClass(), "number", 0.0);
        setIntField(term131658, term131658.getClass(), "type", -14);
        setField(term131658, term131658.getClass(), "next", null);
        setField(term131658, term131658.getClass(), "first", null);
        setField(term131658, term131658.getClass(), "last", null);
        setField(term131658, term131658.getClass(), "propListHead", null);
        setIntField(term131658, term131658.getClass(), "sourcePosition", 0);
        setField(term131658, term131658.getClass(), "jsType", null);
        setField(term131658, term131658.getClass(), "parent", null);
        setField(term131657, term131657.getClass(), "first", term131658);
        setIntField(term131659, term131659.getClass(), "type", 13);
        setField(term131659, term131659.getClass(), "next", null);
        setField(term131659, term131659.getClass(), "first", null);
        setField(term131659, term131659.getClass(), "last", null);
        setField(term131659, term131659.getClass(), "propListHead", null);
        setIntField(term131659, term131659.getClass(), "sourcePosition", 0);
        setField(term131659, term131659.getClass(), "jsType", null);
        setField(term131659, term131659.getClass(), "parent", null);
        setField(term131657, term131657.getClass(), "last", term131659);
        setField(term131657, term131657.getClass(), "propListHead", null);
        setIntField(term131657, term131657.getClass(), "sourcePosition", 0);
        setField(term131657, term131657.getClass(), "jsType", null);
        setField(term131657, term131657.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term131432;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term131340, args);
        assertTrue(recursiveEquals(term131340, term131656));
        assertTrue(recursiveEquals(term131432, term131657));
        assertTrue(recursiveEquals(retValue, null));
    }

};


