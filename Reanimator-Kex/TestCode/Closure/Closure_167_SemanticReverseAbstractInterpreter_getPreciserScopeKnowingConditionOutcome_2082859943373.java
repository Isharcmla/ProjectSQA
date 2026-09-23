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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97821;
     Object term97913;
     Object term98274;
     Object term98275;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97821 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term97913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98005 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98097 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term97913, term97913.getClass(), "type", 111);
        setIntField(term98097, term98097.getClass(), "type", 111);
        setField(term98005, term98005.getClass(), "first", term98097);
        setField(term97913, term97913.getClass(), "parent", term98005);
        setField(term97913, term97913.getClass(), "first", term98189);
        term98274 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term98274, term98274.getClass(), "INEQ", null);
        setField(term98274, term98274.getClass(), "convention", null);
        setField(term98274, term98274.getClass(), "typeRegistry", null);
        setField(term98274, term98274.getClass(), "firstLink", null);
        setField(term98274, term98274.getClass(), "nextLink", null);
        setField(term98274, term98274.getClass(), "restrictUndefinedVisitor", null);
        setField(term98274, term98274.getClass(), "restrictNullVisitor", null);
        term98275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term98275, term98275.getClass(), "str", null);
        setIntField(term98275, term98275.getClass(), "type", 111);
        setField(term98275, term98275.getClass(), "next", null);
        setField(term98276, term98276.getClass(), "str", null);
        setIntField(term98276, term98276.getClass(), "type", 0);
        setField(term98276, term98276.getClass(), "next", null);
        setField(term98276, term98276.getClass(), "first", null);
        setField(term98276, term98276.getClass(), "last", null);
        setField(term98276, term98276.getClass(), "propListHead", null);
        setIntField(term98276, term98276.getClass(), "sourcePosition", 0);
        setField(term98276, term98276.getClass(), "jsType", null);
        setField(term98276, term98276.getClass(), "parent", null);
        setField(term98275, term98275.getClass(), "first", term98276);
        setField(term98275, term98275.getClass(), "last", null);
        setField(term98275, term98275.getClass(), "propListHead", null);
        setIntField(term98275, term98275.getClass(), "sourcePosition", 0);
        setField(term98275, term98275.getClass(), "jsType", null);
        setField(term98277, term98277.getClass(), "str", null);
        setIntField(term98277, term98277.getClass(), "type", 0);
        setField(term98277, term98277.getClass(), "next", null);
        setDoubleField(term98278, term98278.getClass(), "number", 0.0);
        setIntField(term98278, term98278.getClass(), "type", 111);
        setField(term98278, term98278.getClass(), "next", null);
        setField(term98278, term98278.getClass(), "first", null);
        setField(term98278, term98278.getClass(), "last", null);
        setField(term98278, term98278.getClass(), "propListHead", null);
        setIntField(term98278, term98278.getClass(), "sourcePosition", 0);
        setField(term98278, term98278.getClass(), "jsType", null);
        setField(term98278, term98278.getClass(), "parent", null);
        setField(term98277, term98277.getClass(), "first", term98278);
        setField(term98277, term98277.getClass(), "last", null);
        setField(term98277, term98277.getClass(), "propListHead", null);
        setIntField(term98277, term98277.getClass(), "sourcePosition", 0);
        setField(term98277, term98277.getClass(), "jsType", null);
        setField(term98277, term98277.getClass(), "parent", null);
        setField(term98275, term98275.getClass(), "parent", term98277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term97913;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term97821, args);
        assertTrue(recursiveEquals(term97821, term98274));
        assertTrue(recursiveEquals(term97913, term98275));
        assertTrue(recursiveEquals(retValue, null));
    }

};


