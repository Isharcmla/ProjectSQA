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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28770;
     Object term28862;
     Object term29108;
     Object term29109;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28770 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term28862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term28862, term28862.getClass(), "type", 46);
        setIntField(term28954, term28954.getClass(), "type", 46);
        setField(term28862, term28862.getClass(), "first", term28954);
        setField(term28862, term28862.getClass(), "last", term29046);
        term29108 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term29108, term29108.getClass(), "INEQ", null);
        setField(term29108, term29108.getClass(), "convention", null);
        setField(term29108, term29108.getClass(), "typeRegistry", null);
        setField(term29108, term29108.getClass(), "firstLink", null);
        setField(term29108, term29108.getClass(), "nextLink", null);
        setField(term29108, term29108.getClass(), "restrictUndefinedVisitor", null);
        setField(term29108, term29108.getClass(), "restrictNullVisitor", null);
        term29109 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29110 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term29109, term29109.getClass(), "str", null);
        setIntField(term29109, term29109.getClass(), "type", 46);
        setField(term29109, term29109.getClass(), "next", null);
        setField(term29110, term29110.getClass(), "str", null);
        setIntField(term29110, term29110.getClass(), "type", 46);
        setField(term29110, term29110.getClass(), "next", null);
        setField(term29110, term29110.getClass(), "first", null);
        setField(term29110, term29110.getClass(), "last", null);
        setField(term29110, term29110.getClass(), "propListHead", null);
        setIntField(term29110, term29110.getClass(), "sourcePosition", 0);
        setField(term29110, term29110.getClass(), "jsType", null);
        setField(term29110, term29110.getClass(), "parent", null);
        setField(term29109, term29109.getClass(), "first", term29110);
        setDoubleField(term29111, term29111.getClass(), "number", 0.0);
        setIntField(term29111, term29111.getClass(), "type", 0);
        setField(term29111, term29111.getClass(), "next", null);
        setField(term29111, term29111.getClass(), "first", null);
        setField(term29111, term29111.getClass(), "last", null);
        setField(term29111, term29111.getClass(), "propListHead", null);
        setIntField(term29111, term29111.getClass(), "sourcePosition", 0);
        setField(term29111, term29111.getClass(), "jsType", null);
        setField(term29111, term29111.getClass(), "parent", null);
        setField(term29109, term29109.getClass(), "last", term29111);
        setField(term29109, term29109.getClass(), "propListHead", null);
        setIntField(term29109, term29109.getClass(), "sourcePosition", 0);
        setField(term29109, term29109.getClass(), "jsType", null);
        setField(term29109, term29109.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term28862;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term28770, args);
        assertTrue(recursiveEquals(term28770, term29108));
        assertTrue(recursiveEquals(term28862, term29109));
        assertTrue(recursiveEquals(retValue, null));
    }

};


