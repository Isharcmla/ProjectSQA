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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58129;
     Object term58221;
     Object term58907;
     Object term58908;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58129 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term58221 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term58313 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58405 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term58221, term58221.getClass(), "type", 46);
        setIntField(term58313, term58313.getClass(), "type", 0);
        setField(term58221, term58221.getClass(), "first", term58313);
        setField(term58221, term58221.getClass(), "last", term58405);
        term58907 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term58907, term58907.getClass(), "INEQ", null);
        setField(term58907, term58907.getClass(), "convention", null);
        setField(term58907, term58907.getClass(), "typeRegistry", null);
        setField(term58907, term58907.getClass(), "firstLink", null);
        setField(term58907, term58907.getClass(), "nextLink", null);
        setField(term58907, term58907.getClass(), "restrictUndefinedVisitor", null);
        setField(term58907, term58907.getClass(), "restrictNullVisitor", null);
        term58908 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term58909 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term58908, term58908.getClass(), "str", null);
        setIntField(term58908, term58908.getClass(), "type", 46);
        setField(term58908, term58908.getClass(), "next", null);
        setDoubleField(term58909, term58909.getClass(), "number", 0.0);
        setIntField(term58909, term58909.getClass(), "type", 0);
        setField(term58909, term58909.getClass(), "next", null);
        setField(term58909, term58909.getClass(), "first", null);
        setField(term58909, term58909.getClass(), "last", null);
        setField(term58909, term58909.getClass(), "propListHead", null);
        setIntField(term58909, term58909.getClass(), "sourcePosition", 0);
        setField(term58909, term58909.getClass(), "jsType", null);
        setField(term58909, term58909.getClass(), "parent", null);
        setField(term58908, term58908.getClass(), "first", term58909);
        setField(term58910, term58910.getClass(), "str", null);
        setIntField(term58910, term58910.getClass(), "type", 0);
        setField(term58910, term58910.getClass(), "next", null);
        setField(term58910, term58910.getClass(), "first", null);
        setField(term58910, term58910.getClass(), "last", null);
        setField(term58910, term58910.getClass(), "propListHead", null);
        setIntField(term58910, term58910.getClass(), "sourcePosition", 0);
        setField(term58910, term58910.getClass(), "jsType", null);
        setField(term58910, term58910.getClass(), "parent", null);
        setField(term58908, term58908.getClass(), "last", term58910);
        setField(term58908, term58908.getClass(), "propListHead", null);
        setIntField(term58908, term58908.getClass(), "sourcePosition", 0);
        setField(term58908, term58908.getClass(), "jsType", null);
        setField(term58908, term58908.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term58221;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term58129, args);
        assertTrue(recursiveEquals(term58129, term58907));
        assertTrue(recursiveEquals(term58221, term58908));
        assertTrue(recursiveEquals(retValue, null));
    }

};


