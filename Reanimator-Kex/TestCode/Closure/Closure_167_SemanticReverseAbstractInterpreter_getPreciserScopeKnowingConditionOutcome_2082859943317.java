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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81585;
     Object term81677;
     Object term81923;
     Object term81924;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81585 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term81677 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term81769 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term81861 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term81677, term81677.getClass(), "type", 13);
        setIntField(term81769, term81769.getClass(), "type", -14);
        setField(term81677, term81677.getClass(), "first", term81769);
        setIntField(term81861, term81861.getClass(), "type", 13);
        setField(term81677, term81677.getClass(), "last", term81861);
        term81923 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term81923, term81923.getClass(), "INEQ", null);
        setField(term81923, term81923.getClass(), "convention", null);
        setField(term81923, term81923.getClass(), "typeRegistry", null);
        setField(term81923, term81923.getClass(), "firstLink", null);
        setField(term81923, term81923.getClass(), "nextLink", null);
        setField(term81923, term81923.getClass(), "restrictUndefinedVisitor", null);
        setField(term81923, term81923.getClass(), "restrictNullVisitor", null);
        term81924 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term81925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term81926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term81924, term81924.getClass(), "str", null);
        setIntField(term81924, term81924.getClass(), "type", 13);
        setField(term81924, term81924.getClass(), "next", null);
        setField(term81925, term81925.getClass(), "str", null);
        setIntField(term81925, term81925.getClass(), "type", -14);
        setField(term81925, term81925.getClass(), "next", null);
        setField(term81925, term81925.getClass(), "first", null);
        setField(term81925, term81925.getClass(), "last", null);
        setField(term81925, term81925.getClass(), "propListHead", null);
        setIntField(term81925, term81925.getClass(), "sourcePosition", 0);
        setField(term81925, term81925.getClass(), "jsType", null);
        setField(term81925, term81925.getClass(), "parent", null);
        setField(term81924, term81924.getClass(), "first", term81925);
        setDoubleField(term81926, term81926.getClass(), "number", 0.0);
        setIntField(term81926, term81926.getClass(), "type", 13);
        setField(term81926, term81926.getClass(), "next", null);
        setField(term81926, term81926.getClass(), "first", null);
        setField(term81926, term81926.getClass(), "last", null);
        setField(term81926, term81926.getClass(), "propListHead", null);
        setIntField(term81926, term81926.getClass(), "sourcePosition", 0);
        setField(term81926, term81926.getClass(), "jsType", null);
        setField(term81926, term81926.getClass(), "parent", null);
        setField(term81924, term81924.getClass(), "last", term81926);
        setField(term81924, term81924.getClass(), "propListHead", null);
        setIntField(term81924, term81924.getClass(), "sourcePosition", 0);
        setField(term81924, term81924.getClass(), "jsType", null);
        setField(term81924, term81924.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term81677;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term81585, args);
        assertTrue(recursiveEquals(term81585, term81923));
        assertTrue(recursiveEquals(term81677, term81924));
        assertTrue(recursiveEquals(retValue, null));
    }

};


