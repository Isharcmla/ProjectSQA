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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167750;
     Object term167842;
     Object term168335;
     Object term168336;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167750 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term167842 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167934 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term168026 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term167842, term167842.getClass(), "type", 13);
        setIntField(term167934, term167934.getClass(), "type", 13);
        setField(term167842, term167842.getClass(), "first", term167934);
        setIntField(term168026, term168026.getClass(), "type", 13);
        setField(term167842, term167842.getClass(), "last", term168026);
        term168335 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term168335, term168335.getClass(), "INEQ", null);
        setField(term168335, term168335.getClass(), "convention", null);
        setField(term168335, term168335.getClass(), "typeRegistry", null);
        setField(term168335, term168335.getClass(), "firstLink", null);
        setField(term168335, term168335.getClass(), "nextLink", null);
        setField(term168335, term168335.getClass(), "restrictUndefinedVisitor", null);
        setField(term168335, term168335.getClass(), "restrictNullVisitor", null);
        term168336 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168337 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term168338 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term168336, term168336.getClass(), "number", 0.0);
        setIntField(term168336, term168336.getClass(), "type", 13);
        setField(term168336, term168336.getClass(), "next", null);
        setField(term168337, term168337.getClass(), "str", null);
        setIntField(term168337, term168337.getClass(), "type", 13);
        setField(term168337, term168337.getClass(), "next", null);
        setField(term168337, term168337.getClass(), "first", null);
        setField(term168337, term168337.getClass(), "last", null);
        setField(term168337, term168337.getClass(), "propListHead", null);
        setIntField(term168337, term168337.getClass(), "sourcePosition", 0);
        setField(term168337, term168337.getClass(), "jsType", null);
        setField(term168337, term168337.getClass(), "parent", null);
        setField(term168336, term168336.getClass(), "first", term168337);
        setField(term168338, term168338.getClass(), "str", null);
        setIntField(term168338, term168338.getClass(), "type", 13);
        setField(term168338, term168338.getClass(), "next", null);
        setField(term168338, term168338.getClass(), "first", null);
        setField(term168338, term168338.getClass(), "last", null);
        setField(term168338, term168338.getClass(), "propListHead", null);
        setIntField(term168338, term168338.getClass(), "sourcePosition", 0);
        setField(term168338, term168338.getClass(), "jsType", null);
        setField(term168338, term168338.getClass(), "parent", null);
        setField(term168336, term168336.getClass(), "last", term168338);
        setField(term168336, term168336.getClass(), "propListHead", null);
        setIntField(term168336, term168336.getClass(), "sourcePosition", 0);
        setField(term168336, term168336.getClass(), "jsType", null);
        setField(term168336, term168336.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term167842;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term167750, args);
        assertTrue(recursiveEquals(term167750, term168335));
        assertTrue(recursiveEquals(term167842, term168336));
        assertTrue(recursiveEquals(retValue, null));
    }

};


