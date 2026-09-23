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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68121;
     Object term68213;
     Object term68455;
     Object term68456;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68121 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term68213 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term68305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term68397 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term68213, term68213.getClass(), "type", 45);
        setIntField(term68305, term68305.getClass(), "type", 0);
        setField(term68213, term68213.getClass(), "first", term68305);
        setField(term68213, term68213.getClass(), "last", term68397);
        term68455 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term68455, term68455.getClass(), "INEQ", null);
        setField(term68455, term68455.getClass(), "convention", null);
        setField(term68455, term68455.getClass(), "typeRegistry", null);
        setField(term68455, term68455.getClass(), "firstLink", null);
        setField(term68455, term68455.getClass(), "nextLink", null);
        setField(term68455, term68455.getClass(), "restrictUndefinedVisitor", null);
        setField(term68455, term68455.getClass(), "restrictNullVisitor", null);
        term68456 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term68457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term68458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term68456, term68456.getClass(), "number", 0.0);
        setIntField(term68456, term68456.getClass(), "type", 45);
        setField(term68456, term68456.getClass(), "next", null);
        setField(term68457, term68457.getClass(), "str", null);
        setIntField(term68457, term68457.getClass(), "type", 0);
        setField(term68457, term68457.getClass(), "next", null);
        setField(term68457, term68457.getClass(), "first", null);
        setField(term68457, term68457.getClass(), "last", null);
        setField(term68457, term68457.getClass(), "propListHead", null);
        setIntField(term68457, term68457.getClass(), "sourcePosition", 0);
        setField(term68457, term68457.getClass(), "jsType", null);
        setField(term68457, term68457.getClass(), "parent", null);
        setField(term68456, term68456.getClass(), "first", term68457);
        setField(term68458, term68458.getClass(), "str", null);
        setIntField(term68458, term68458.getClass(), "type", 0);
        setField(term68458, term68458.getClass(), "next", null);
        setField(term68458, term68458.getClass(), "first", null);
        setField(term68458, term68458.getClass(), "last", null);
        setField(term68458, term68458.getClass(), "propListHead", null);
        setIntField(term68458, term68458.getClass(), "sourcePosition", 0);
        setField(term68458, term68458.getClass(), "jsType", null);
        setField(term68458, term68458.getClass(), "parent", null);
        setField(term68456, term68456.getClass(), "last", term68458);
        setField(term68456, term68456.getClass(), "propListHead", null);
        setIntField(term68456, term68456.getClass(), "sourcePosition", 0);
        setField(term68456, term68456.getClass(), "jsType", null);
        setField(term68456, term68456.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term68213;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term68121, args);
        assertTrue(recursiveEquals(term68121, term68455));
        assertTrue(recursiveEquals(term68213, term68456));
        assertTrue(recursiveEquals(retValue, null));
    }

};


