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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43817;
     Object term43909;
     Object term44156;
     Object term44157;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43817 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term43909 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44001 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44093 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term43909, term43909.getClass(), "type", 12);
        setIntField(term44001, term44001.getClass(), "type", 12);
        setField(term43909, term43909.getClass(), "first", term44001);
        setField(term43909, term43909.getClass(), "last", term44093);
        term44156 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term44156, term44156.getClass(), "INEQ", null);
        setField(term44156, term44156.getClass(), "convention", null);
        setField(term44156, term44156.getClass(), "typeRegistry", null);
        setField(term44156, term44156.getClass(), "firstLink", null);
        setField(term44156, term44156.getClass(), "nextLink", null);
        setField(term44156, term44156.getClass(), "restrictUndefinedVisitor", null);
        setField(term44156, term44156.getClass(), "restrictNullVisitor", null);
        term44157 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44158 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term44157, term44157.getClass(), "number", 0.0);
        setIntField(term44157, term44157.getClass(), "type", 12);
        setField(term44157, term44157.getClass(), "next", null);
        setDoubleField(term44158, term44158.getClass(), "number", 0.0);
        setIntField(term44158, term44158.getClass(), "type", 12);
        setField(term44158, term44158.getClass(), "next", null);
        setField(term44158, term44158.getClass(), "first", null);
        setField(term44158, term44158.getClass(), "last", null);
        setField(term44158, term44158.getClass(), "propListHead", null);
        setIntField(term44158, term44158.getClass(), "sourcePosition", 0);
        setField(term44158, term44158.getClass(), "jsType", null);
        setField(term44158, term44158.getClass(), "parent", null);
        setField(term44157, term44157.getClass(), "first", term44158);
        setField(term44159, term44159.getClass(), "str", null);
        setIntField(term44159, term44159.getClass(), "type", 0);
        setField(term44159, term44159.getClass(), "next", null);
        setField(term44159, term44159.getClass(), "first", null);
        setField(term44159, term44159.getClass(), "last", null);
        setField(term44159, term44159.getClass(), "propListHead", null);
        setIntField(term44159, term44159.getClass(), "sourcePosition", 0);
        setField(term44159, term44159.getClass(), "jsType", null);
        setField(term44159, term44159.getClass(), "parent", null);
        setField(term44157, term44157.getClass(), "last", term44159);
        setField(term44157, term44157.getClass(), "propListHead", null);
        setIntField(term44157, term44157.getClass(), "sourcePosition", 0);
        setField(term44157, term44157.getClass(), "jsType", null);
        setField(term44157, term44157.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term43909;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term43817, args);
        assertTrue(recursiveEquals(term43817, term44156));
        assertTrue(recursiveEquals(term43909, term44157));
        assertTrue(recursiveEquals(retValue, null));
    }

};


