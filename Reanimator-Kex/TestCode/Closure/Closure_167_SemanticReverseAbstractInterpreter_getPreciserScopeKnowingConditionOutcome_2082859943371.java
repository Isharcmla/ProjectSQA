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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97438;
     Object term97530;
     Object term97645;
     Object term97646;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97438 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term97530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97622 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term97530, term97530.getClass(), "type", 51);
        setField(term97530, term97530.getClass(), "first", term97622);
        term97645 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term97645, term97645.getClass(), "INEQ", null);
        setField(term97645, term97645.getClass(), "convention", null);
        setField(term97645, term97645.getClass(), "typeRegistry", null);
        setField(term97645, term97645.getClass(), "firstLink", null);
        setField(term97645, term97645.getClass(), "nextLink", null);
        setField(term97645, term97645.getClass(), "restrictUndefinedVisitor", null);
        setField(term97645, term97645.getClass(), "restrictNullVisitor", null);
        term97646 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97647 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term97646, term97646.getClass(), "number", 0.0);
        setIntField(term97646, term97646.getClass(), "type", 51);
        setField(term97646, term97646.getClass(), "next", null);
        setField(term97647, term97647.getClass(), "str", null);
        setIntField(term97647, term97647.getClass(), "type", 0);
        setField(term97647, term97647.getClass(), "next", null);
        setField(term97647, term97647.getClass(), "first", null);
        setField(term97647, term97647.getClass(), "last", null);
        setField(term97647, term97647.getClass(), "propListHead", null);
        setIntField(term97647, term97647.getClass(), "sourcePosition", 0);
        setField(term97647, term97647.getClass(), "jsType", null);
        setField(term97647, term97647.getClass(), "parent", null);
        setField(term97646, term97646.getClass(), "first", term97647);
        setField(term97646, term97646.getClass(), "last", null);
        setField(term97646, term97646.getClass(), "propListHead", null);
        setIntField(term97646, term97646.getClass(), "sourcePosition", 0);
        setField(term97646, term97646.getClass(), "jsType", null);
        setField(term97646, term97646.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term97530;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term97438, args);
        assertTrue(recursiveEquals(term97438, term97645));
        assertTrue(recursiveEquals(term97530, term97646));
        assertTrue(recursiveEquals(retValue, null));
    }

};


