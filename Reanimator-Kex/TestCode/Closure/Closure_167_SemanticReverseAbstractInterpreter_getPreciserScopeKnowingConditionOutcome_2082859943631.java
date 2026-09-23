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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179487;
     Object term179579;
     Object term179825;
     Object term179826;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179487 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term179579 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term179671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179763 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term179579, term179579.getClass(), "type", 12);
        setIntField(term179671, term179671.getClass(), "type", -13);
        setField(term179579, term179579.getClass(), "first", term179671);
        setIntField(term179763, term179763.getClass(), "type", 12);
        setField(term179579, term179579.getClass(), "last", term179763);
        term179825 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term179825, term179825.getClass(), "INEQ", null);
        setField(term179825, term179825.getClass(), "convention", null);
        setField(term179825, term179825.getClass(), "typeRegistry", null);
        setField(term179825, term179825.getClass(), "firstLink", null);
        setField(term179825, term179825.getClass(), "nextLink", null);
        setField(term179825, term179825.getClass(), "restrictUndefinedVisitor", null);
        setField(term179825, term179825.getClass(), "restrictNullVisitor", null);
        term179826 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term179827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179826, term179826.getClass(), "str", null);
        setIntField(term179826, term179826.getClass(), "type", 12);
        setField(term179826, term179826.getClass(), "next", null);
        setDoubleField(term179827, term179827.getClass(), "number", 0.0);
        setIntField(term179827, term179827.getClass(), "type", -13);
        setField(term179827, term179827.getClass(), "next", null);
        setField(term179827, term179827.getClass(), "first", null);
        setField(term179827, term179827.getClass(), "last", null);
        setField(term179827, term179827.getClass(), "propListHead", null);
        setIntField(term179827, term179827.getClass(), "sourcePosition", 0);
        setField(term179827, term179827.getClass(), "jsType", null);
        setField(term179827, term179827.getClass(), "parent", null);
        setField(term179826, term179826.getClass(), "first", term179827);
        setField(term179828, term179828.getClass(), "str", null);
        setIntField(term179828, term179828.getClass(), "type", 12);
        setField(term179828, term179828.getClass(), "next", null);
        setField(term179828, term179828.getClass(), "first", null);
        setField(term179828, term179828.getClass(), "last", null);
        setField(term179828, term179828.getClass(), "propListHead", null);
        setIntField(term179828, term179828.getClass(), "sourcePosition", 0);
        setField(term179828, term179828.getClass(), "jsType", null);
        setField(term179828, term179828.getClass(), "parent", null);
        setField(term179826, term179826.getClass(), "last", term179828);
        setField(term179826, term179826.getClass(), "propListHead", null);
        setIntField(term179826, term179826.getClass(), "sourcePosition", 0);
        setField(term179826, term179826.getClass(), "jsType", null);
        setField(term179826, term179826.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term179579;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term179487, args);
        assertTrue(recursiveEquals(term179487, term179825));
        assertTrue(recursiveEquals(term179579, term179826));
        assertTrue(recursiveEquals(retValue, null));
    }

};


