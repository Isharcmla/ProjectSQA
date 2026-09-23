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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92823;
     Object term92915;
     Object term93850;
     Object term93851;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92823 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term92915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93007 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term93099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term92915, term92915.getClass(), "type", 45);
        setIntField(term93007, term93007.getClass(), "type", 45);
        setField(term92915, term92915.getClass(), "first", term93007);
        setIntField(term93099, term93099.getClass(), "type", 45);
        setField(term92915, term92915.getClass(), "last", term93099);
        term93850 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term93850, term93850.getClass(), "INEQ", null);
        setField(term93850, term93850.getClass(), "convention", null);
        setField(term93850, term93850.getClass(), "typeRegistry", null);
        setField(term93850, term93850.getClass(), "firstLink", null);
        setField(term93850, term93850.getClass(), "nextLink", null);
        setField(term93850, term93850.getClass(), "restrictUndefinedVisitor", null);
        setField(term93850, term93850.getClass(), "restrictNullVisitor", null);
        term93851 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term93853 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term93851, term93851.getClass(), "number", 0.0);
        setIntField(term93851, term93851.getClass(), "type", 45);
        setField(term93851, term93851.getClass(), "next", null);
        setField(term93852, term93852.getClass(), "str", null);
        setIntField(term93852, term93852.getClass(), "type", 45);
        setField(term93852, term93852.getClass(), "next", null);
        setField(term93852, term93852.getClass(), "first", null);
        setField(term93852, term93852.getClass(), "last", null);
        setField(term93852, term93852.getClass(), "propListHead", null);
        setIntField(term93852, term93852.getClass(), "sourcePosition", 0);
        setField(term93852, term93852.getClass(), "jsType", null);
        setField(term93852, term93852.getClass(), "parent", null);
        setField(term93851, term93851.getClass(), "first", term93852);
        setField(term93853, term93853.getClass(), "str", null);
        setIntField(term93853, term93853.getClass(), "type", 45);
        setField(term93853, term93853.getClass(), "next", null);
        setField(term93853, term93853.getClass(), "first", null);
        setField(term93853, term93853.getClass(), "last", null);
        setField(term93853, term93853.getClass(), "propListHead", null);
        setIntField(term93853, term93853.getClass(), "sourcePosition", 0);
        setField(term93853, term93853.getClass(), "jsType", null);
        setField(term93853, term93853.getClass(), "parent", null);
        setField(term93851, term93851.getClass(), "last", term93853);
        setField(term93851, term93851.getClass(), "propListHead", null);
        setIntField(term93851, term93851.getClass(), "sourcePosition", 0);
        setField(term93851, term93851.getClass(), "jsType", null);
        setField(term93851, term93851.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term92915;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term92823, args);
        assertTrue(recursiveEquals(term92823, term93850));
        assertTrue(recursiveEquals(term92915, term93851));
        assertTrue(recursiveEquals(retValue, null));
    }

};


