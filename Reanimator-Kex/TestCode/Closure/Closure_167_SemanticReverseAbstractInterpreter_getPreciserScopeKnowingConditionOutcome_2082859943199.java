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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46666;
     Object term46758;
     Object term46999;
     Object term47000;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46666 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term46758 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term46850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term46942 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term46758, term46758.getClass(), "type", 13);
        setField(term46758, term46758.getClass(), "first", term46850);
        setField(term46758, term46758.getClass(), "last", term46942);
        term46999 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term46999, term46999.getClass(), "INEQ", null);
        setField(term46999, term46999.getClass(), "convention", null);
        setField(term46999, term46999.getClass(), "typeRegistry", null);
        setField(term46999, term46999.getClass(), "firstLink", null);
        setField(term46999, term46999.getClass(), "nextLink", null);
        setField(term46999, term46999.getClass(), "restrictUndefinedVisitor", null);
        setField(term46999, term46999.getClass(), "restrictNullVisitor", null);
        term47000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47001 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term47000, term47000.getClass(), "str", null);
        setIntField(term47000, term47000.getClass(), "type", 13);
        setField(term47000, term47000.getClass(), "next", null);
        setField(term47001, term47001.getClass(), "str", null);
        setIntField(term47001, term47001.getClass(), "type", 0);
        setField(term47001, term47001.getClass(), "next", null);
        setField(term47001, term47001.getClass(), "first", null);
        setField(term47001, term47001.getClass(), "last", null);
        setField(term47001, term47001.getClass(), "propListHead", null);
        setIntField(term47001, term47001.getClass(), "sourcePosition", 0);
        setField(term47001, term47001.getClass(), "jsType", null);
        setField(term47001, term47001.getClass(), "parent", null);
        setField(term47000, term47000.getClass(), "first", term47001);
        setField(term47002, term47002.getClass(), "str", null);
        setIntField(term47002, term47002.getClass(), "type", 0);
        setField(term47002, term47002.getClass(), "next", null);
        setField(term47002, term47002.getClass(), "first", null);
        setField(term47002, term47002.getClass(), "last", null);
        setField(term47002, term47002.getClass(), "propListHead", null);
        setIntField(term47002, term47002.getClass(), "sourcePosition", 0);
        setField(term47002, term47002.getClass(), "jsType", null);
        setField(term47002, term47002.getClass(), "parent", null);
        setField(term47000, term47000.getClass(), "last", term47002);
        setField(term47000, term47000.getClass(), "propListHead", null);
        setIntField(term47000, term47000.getClass(), "sourcePosition", 0);
        setField(term47000, term47000.getClass(), "jsType", null);
        setField(term47000, term47000.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term46758;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term46666, args);
        assertTrue(recursiveEquals(term46666, term46999));
        assertTrue(recursiveEquals(term46758, term47000));
        assertTrue(recursiveEquals(retValue, null));
    }

};


