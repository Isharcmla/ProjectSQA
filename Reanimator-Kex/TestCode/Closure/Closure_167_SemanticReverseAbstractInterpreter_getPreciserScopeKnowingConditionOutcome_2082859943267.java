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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66072;
     Object term66164;
     Object term66313;
     Object term66314;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66072 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term66164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term66256 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term66164, term66164.getClass(), "type", 111);
        setField(term66256, term66256.getClass(), "first", term66256);
        setIntField(term66256, term66256.getClass(), "type", 111);
        setField(term66164, term66164.getClass(), "parent", term66256);
        setField(term66164, term66164.getClass(), "first", term66256);
        term66313 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term66313, term66313.getClass(), "INEQ", null);
        setField(term66313, term66313.getClass(), "convention", null);
        setField(term66313, term66313.getClass(), "typeRegistry", null);
        setField(term66313, term66313.getClass(), "firstLink", null);
        setField(term66313, term66313.getClass(), "nextLink", null);
        setField(term66313, term66313.getClass(), "restrictUndefinedVisitor", null);
        setField(term66313, term66313.getClass(), "restrictNullVisitor", null);
        term66314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term66315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term66314, term66314.getClass(), "str", null);
        setIntField(term66314, term66314.getClass(), "type", 111);
        setField(term66314, term66314.getClass(), "next", null);
        setField(term66315, term66315.getClass(), "str", null);
        setIntField(term66315, term66315.getClass(), "type", 111);
        setField(term66315, term66315.getClass(), "next", null);
        setField(term66315, term66315.getClass(), "first", term66315);
        setField(term66315, term66315.getClass(), "last", null);
        setField(term66315, term66315.getClass(), "propListHead", null);
        setIntField(term66315, term66315.getClass(), "sourcePosition", 0);
        setField(term66315, term66315.getClass(), "jsType", null);
        setField(term66315, term66315.getClass(), "parent", null);
        setField(term66314, term66314.getClass(), "first", term66315);
        setField(term66314, term66314.getClass(), "last", null);
        setField(term66314, term66314.getClass(), "propListHead", null);
        setIntField(term66314, term66314.getClass(), "sourcePosition", 0);
        setField(term66314, term66314.getClass(), "jsType", null);
        setField(term66314, term66314.getClass(), "parent", term66315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term66164;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term66072, args);
        assertTrue(recursiveEquals(term66072, term66313));
        assertTrue(recursiveEquals(term66164, term66314));
        assertTrue(recursiveEquals(retValue, null));
    }

};


