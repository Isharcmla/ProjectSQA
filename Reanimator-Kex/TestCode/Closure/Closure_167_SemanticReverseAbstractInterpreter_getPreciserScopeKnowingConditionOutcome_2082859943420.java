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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109803;
     Object term109895;
     Object term110548;
     Object term110549;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109803 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term109895 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term109987 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term110057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term109895, term109895.getClass(), "type", 45);
        setIntField(term109987, term109987.getClass(), "type", -46);
        setField(term109895, term109895.getClass(), "first", term109987);
        setIntField(term110057, term110057.getClass(), "type", 45);
        setField(term109895, term109895.getClass(), "last", term110057);
        term110548 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term110548, term110548.getClass(), "INEQ", null);
        setField(term110548, term110548.getClass(), "convention", null);
        setField(term110548, term110548.getClass(), "typeRegistry", null);
        setField(term110548, term110548.getClass(), "firstLink", null);
        setField(term110548, term110548.getClass(), "nextLink", null);
        setField(term110548, term110548.getClass(), "restrictUndefinedVisitor", null);
        setField(term110548, term110548.getClass(), "restrictNullVisitor", null);
        term110549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term110551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term110549, term110549.getClass(), "number", 0.0);
        setIntField(term110549, term110549.getClass(), "type", 45);
        setField(term110549, term110549.getClass(), "next", null);
        setField(term110550, term110550.getClass(), "str", null);
        setIntField(term110550, term110550.getClass(), "type", -46);
        setField(term110550, term110550.getClass(), "next", null);
        setField(term110550, term110550.getClass(), "first", null);
        setField(term110550, term110550.getClass(), "last", null);
        setField(term110550, term110550.getClass(), "propListHead", null);
        setIntField(term110550, term110550.getClass(), "sourcePosition", 0);
        setField(term110550, term110550.getClass(), "jsType", null);
        setField(term110550, term110550.getClass(), "parent", null);
        setField(term110549, term110549.getClass(), "first", term110550);
        setIntField(term110551, term110551.getClass(), "type", 45);
        setField(term110551, term110551.getClass(), "next", null);
        setField(term110551, term110551.getClass(), "first", null);
        setField(term110551, term110551.getClass(), "last", null);
        setField(term110551, term110551.getClass(), "propListHead", null);
        setIntField(term110551, term110551.getClass(), "sourcePosition", 0);
        setField(term110551, term110551.getClass(), "jsType", null);
        setField(term110551, term110551.getClass(), "parent", null);
        setField(term110549, term110549.getClass(), "last", term110551);
        setField(term110549, term110549.getClass(), "propListHead", null);
        setIntField(term110549, term110549.getClass(), "sourcePosition", 0);
        setField(term110549, term110549.getClass(), "jsType", null);
        setField(term110549, term110549.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term109895;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term109803, args);
        assertTrue(recursiveEquals(term109803, term110548));
        assertTrue(recursiveEquals(term109895, term110549));
        assertTrue(recursiveEquals(retValue, null));
    }

};


