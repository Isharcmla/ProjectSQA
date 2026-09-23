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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132654;
     Object term132746;
     Object term132860;
     Object term132861;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132654 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term132746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term132838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term132746, term132746.getClass(), "type", 51);
        setField(term132746, term132746.getClass(), "first", term132838);
        term132860 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term132860, term132860.getClass(), "INEQ", null);
        setField(term132860, term132860.getClass(), "convention", null);
        setField(term132860, term132860.getClass(), "typeRegistry", null);
        setField(term132860, term132860.getClass(), "firstLink", null);
        setField(term132860, term132860.getClass(), "nextLink", null);
        setField(term132860, term132860.getClass(), "restrictUndefinedVisitor", null);
        setField(term132860, term132860.getClass(), "restrictNullVisitor", null);
        term132861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term132862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term132861, term132861.getClass(), "str", null);
        setIntField(term132861, term132861.getClass(), "type", 51);
        setField(term132861, term132861.getClass(), "next", null);
        setField(term132862, term132862.getClass(), "str", null);
        setIntField(term132862, term132862.getClass(), "type", 0);
        setField(term132862, term132862.getClass(), "next", null);
        setField(term132862, term132862.getClass(), "first", null);
        setField(term132862, term132862.getClass(), "last", null);
        setField(term132862, term132862.getClass(), "propListHead", null);
        setIntField(term132862, term132862.getClass(), "sourcePosition", 0);
        setField(term132862, term132862.getClass(), "jsType", null);
        setField(term132862, term132862.getClass(), "parent", null);
        setField(term132861, term132861.getClass(), "first", term132862);
        setField(term132861, term132861.getClass(), "last", null);
        setField(term132861, term132861.getClass(), "propListHead", null);
        setIntField(term132861, term132861.getClass(), "sourcePosition", 0);
        setField(term132861, term132861.getClass(), "jsType", null);
        setField(term132861, term132861.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term132746;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term132654, args);
        assertTrue(recursiveEquals(term132654, term132860));
        assertTrue(recursiveEquals(term132746, term132861));
        assertTrue(recursiveEquals(retValue, null));
    }

};


