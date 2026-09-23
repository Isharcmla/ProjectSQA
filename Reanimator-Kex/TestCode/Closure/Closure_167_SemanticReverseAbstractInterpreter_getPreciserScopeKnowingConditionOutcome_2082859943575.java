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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161142;
     Object term161234;
     Object term161481;
     Object term161482;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161142 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term161234 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term161418 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term161234, term161234.getClass(), "type", 46);
        setIntField(term161326, term161326.getClass(), "type", 0);
        setField(term161234, term161234.getClass(), "first", term161326);
        setField(term161234, term161234.getClass(), "last", term161418);
        term161481 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term161481, term161481.getClass(), "INEQ", null);
        setField(term161481, term161481.getClass(), "convention", null);
        setField(term161481, term161481.getClass(), "typeRegistry", null);
        setField(term161481, term161481.getClass(), "firstLink", null);
        setField(term161481, term161481.getClass(), "nextLink", null);
        setField(term161481, term161481.getClass(), "restrictUndefinedVisitor", null);
        setField(term161481, term161481.getClass(), "restrictNullVisitor", null);
        term161482 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term161484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term161482, term161482.getClass(), "number", 0.0);
        setIntField(term161482, term161482.getClass(), "type", 46);
        setField(term161482, term161482.getClass(), "next", null);
        setField(term161483, term161483.getClass(), "str", null);
        setIntField(term161483, term161483.getClass(), "type", 0);
        setField(term161483, term161483.getClass(), "next", null);
        setField(term161483, term161483.getClass(), "first", null);
        setField(term161483, term161483.getClass(), "last", null);
        setField(term161483, term161483.getClass(), "propListHead", null);
        setIntField(term161483, term161483.getClass(), "sourcePosition", 0);
        setField(term161483, term161483.getClass(), "jsType", null);
        setField(term161483, term161483.getClass(), "parent", null);
        setField(term161482, term161482.getClass(), "first", term161483);
        setDoubleField(term161484, term161484.getClass(), "number", 0.0);
        setIntField(term161484, term161484.getClass(), "type", 0);
        setField(term161484, term161484.getClass(), "next", null);
        setField(term161484, term161484.getClass(), "first", null);
        setField(term161484, term161484.getClass(), "last", null);
        setField(term161484, term161484.getClass(), "propListHead", null);
        setIntField(term161484, term161484.getClass(), "sourcePosition", 0);
        setField(term161484, term161484.getClass(), "jsType", null);
        setField(term161484, term161484.getClass(), "parent", null);
        setField(term161482, term161482.getClass(), "last", term161484);
        setField(term161482, term161482.getClass(), "propListHead", null);
        setIntField(term161482, term161482.getClass(), "sourcePosition", 0);
        setField(term161482, term161482.getClass(), "jsType", null);
        setField(term161482, term161482.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term161234;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term161142, args);
        assertTrue(recursiveEquals(term161142, term161481));
        assertTrue(recursiveEquals(term161234, term161482));
        assertTrue(recursiveEquals(retValue, null));
    }

};


