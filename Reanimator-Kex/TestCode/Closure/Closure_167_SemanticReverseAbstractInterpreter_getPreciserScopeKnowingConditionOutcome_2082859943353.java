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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91786;
     Object term91878;
     Object term92129;
     Object term92130;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91786 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term91878 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term91970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92062 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term91878, term91878.getClass(), "type", 46);
        setIntField(term91970, term91970.getClass(), "type", 46);
        setField(term91878, term91878.getClass(), "first", term91970);
        setIntField(term92062, term92062.getClass(), "type", 46);
        setField(term91878, term91878.getClass(), "last", term92062);
        term92129 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term92129, term92129.getClass(), "INEQ", null);
        setField(term92129, term92129.getClass(), "convention", null);
        setField(term92129, term92129.getClass(), "typeRegistry", null);
        setField(term92129, term92129.getClass(), "firstLink", null);
        setField(term92129, term92129.getClass(), "nextLink", null);
        setField(term92129, term92129.getClass(), "restrictUndefinedVisitor", null);
        setField(term92129, term92129.getClass(), "restrictNullVisitor", null);
        term92130 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92132 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term92130, term92130.getClass(), "str", null);
        setIntField(term92130, term92130.getClass(), "type", 46);
        setField(term92130, term92130.getClass(), "next", null);
        setDoubleField(term92131, term92131.getClass(), "number", 0.0);
        setIntField(term92131, term92131.getClass(), "type", 46);
        setField(term92131, term92131.getClass(), "next", null);
        setField(term92131, term92131.getClass(), "first", null);
        setField(term92131, term92131.getClass(), "last", null);
        setField(term92131, term92131.getClass(), "propListHead", null);
        setIntField(term92131, term92131.getClass(), "sourcePosition", 0);
        setField(term92131, term92131.getClass(), "jsType", null);
        setField(term92131, term92131.getClass(), "parent", null);
        setField(term92130, term92130.getClass(), "first", term92131);
        setDoubleField(term92132, term92132.getClass(), "number", 0.0);
        setIntField(term92132, term92132.getClass(), "type", 46);
        setField(term92132, term92132.getClass(), "next", null);
        setField(term92132, term92132.getClass(), "first", null);
        setField(term92132, term92132.getClass(), "last", null);
        setField(term92132, term92132.getClass(), "propListHead", null);
        setIntField(term92132, term92132.getClass(), "sourcePosition", 0);
        setField(term92132, term92132.getClass(), "jsType", null);
        setField(term92132, term92132.getClass(), "parent", null);
        setField(term92130, term92130.getClass(), "last", term92132);
        setField(term92130, term92130.getClass(), "propListHead", null);
        setIntField(term92130, term92130.getClass(), "sourcePosition", 0);
        setField(term92130, term92130.getClass(), "jsType", null);
        setField(term92130, term92130.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term91878;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term91786, args);
        assertTrue(recursiveEquals(term91786, term92129));
        assertTrue(recursiveEquals(term91878, term92130));
        assertTrue(recursiveEquals(retValue, null));
    }

};


