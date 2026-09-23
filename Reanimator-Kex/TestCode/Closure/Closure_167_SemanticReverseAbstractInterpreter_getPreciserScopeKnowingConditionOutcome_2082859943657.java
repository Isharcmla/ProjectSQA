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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188862;
     Object term188954;
     Object term189319;
     Object term189320;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188862 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term188954 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term189230 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term188954, term188954.getClass(), "type", 111);
        setIntField(term189138, term189138.getClass(), "type", 0);
        setField(term189046, term189046.getClass(), "first", term189138);
        setField(term188954, term188954.getClass(), "parent", term189046);
        setIntField(term189230, term189230.getClass(), "type", 111);
        setField(term188954, term188954.getClass(), "first", term189230);
        term189319 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term189319, term189319.getClass(), "INEQ", null);
        setField(term189319, term189319.getClass(), "convention", null);
        setField(term189319, term189319.getClass(), "typeRegistry", null);
        setField(term189319, term189319.getClass(), "firstLink", null);
        setField(term189319, term189319.getClass(), "nextLink", null);
        setField(term189319, term189319.getClass(), "restrictUndefinedVisitor", null);
        setField(term189319, term189319.getClass(), "restrictNullVisitor", null);
        term189320 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189322 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term189320, term189320.getClass(), "number", 0.0);
        setIntField(term189320, term189320.getClass(), "type", 111);
        setField(term189320, term189320.getClass(), "next", null);
        setDoubleField(term189321, term189321.getClass(), "number", 0.0);
        setIntField(term189321, term189321.getClass(), "type", 111);
        setField(term189321, term189321.getClass(), "next", null);
        setField(term189321, term189321.getClass(), "first", null);
        setField(term189321, term189321.getClass(), "last", null);
        setField(term189321, term189321.getClass(), "propListHead", null);
        setIntField(term189321, term189321.getClass(), "sourcePosition", 0);
        setField(term189321, term189321.getClass(), "jsType", null);
        setField(term189321, term189321.getClass(), "parent", null);
        setField(term189320, term189320.getClass(), "first", term189321);
        setField(term189320, term189320.getClass(), "last", null);
        setField(term189320, term189320.getClass(), "propListHead", null);
        setIntField(term189320, term189320.getClass(), "sourcePosition", 0);
        setField(term189320, term189320.getClass(), "jsType", null);
        setDoubleField(term189322, term189322.getClass(), "number", 0.0);
        setIntField(term189322, term189322.getClass(), "type", 0);
        setField(term189322, term189322.getClass(), "next", null);
        setField(term189323, term189323.getClass(), "str", null);
        setIntField(term189323, term189323.getClass(), "type", 0);
        setField(term189323, term189323.getClass(), "next", null);
        setField(term189323, term189323.getClass(), "first", null);
        setField(term189323, term189323.getClass(), "last", null);
        setField(term189323, term189323.getClass(), "propListHead", null);
        setIntField(term189323, term189323.getClass(), "sourcePosition", 0);
        setField(term189323, term189323.getClass(), "jsType", null);
        setField(term189323, term189323.getClass(), "parent", null);
        setField(term189322, term189322.getClass(), "first", term189323);
        setField(term189322, term189322.getClass(), "last", null);
        setField(term189322, term189322.getClass(), "propListHead", null);
        setIntField(term189322, term189322.getClass(), "sourcePosition", 0);
        setField(term189322, term189322.getClass(), "jsType", null);
        setField(term189322, term189322.getClass(), "parent", null);
        setField(term189320, term189320.getClass(), "parent", term189322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term188954;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term188862, args);
        assertTrue(recursiveEquals(term188862, term189319));
        assertTrue(recursiveEquals(term188954, term189320));
        assertTrue(recursiveEquals(retValue, null));
    }

};


