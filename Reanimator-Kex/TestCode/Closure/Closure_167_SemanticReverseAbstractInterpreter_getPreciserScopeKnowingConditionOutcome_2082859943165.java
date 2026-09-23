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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36564;
     Object term36656;
     Object term38124;
     Object term38125;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36564 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term36656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36840 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term36656, term36656.getClass(), "type", 46);
        setIntField(term36748, term36748.getClass(), "type", 46);
        setField(term36656, term36656.getClass(), "first", term36748);
        setField(term36656, term36656.getClass(), "last", term36840);
        term38124 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term38124, term38124.getClass(), "INEQ", null);
        setField(term38124, term38124.getClass(), "convention", null);
        setField(term38124, term38124.getClass(), "typeRegistry", null);
        setField(term38124, term38124.getClass(), "firstLink", null);
        setField(term38124, term38124.getClass(), "nextLink", null);
        setField(term38124, term38124.getClass(), "restrictUndefinedVisitor", null);
        setField(term38124, term38124.getClass(), "restrictNullVisitor", null);
        term38125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term38125, term38125.getClass(), "number", 0.0);
        setIntField(term38125, term38125.getClass(), "type", 46);
        setField(term38125, term38125.getClass(), "next", null);
        setDoubleField(term38126, term38126.getClass(), "number", 0.0);
        setIntField(term38126, term38126.getClass(), "type", 46);
        setField(term38126, term38126.getClass(), "next", null);
        setField(term38126, term38126.getClass(), "first", null);
        setField(term38126, term38126.getClass(), "last", null);
        setField(term38126, term38126.getClass(), "propListHead", null);
        setIntField(term38126, term38126.getClass(), "sourcePosition", 0);
        setField(term38126, term38126.getClass(), "jsType", null);
        setField(term38126, term38126.getClass(), "parent", null);
        setField(term38125, term38125.getClass(), "first", term38126);
        setField(term38127, term38127.getClass(), "str", null);
        setIntField(term38127, term38127.getClass(), "type", 0);
        setField(term38127, term38127.getClass(), "next", null);
        setField(term38127, term38127.getClass(), "first", null);
        setField(term38127, term38127.getClass(), "last", null);
        setField(term38127, term38127.getClass(), "propListHead", null);
        setIntField(term38127, term38127.getClass(), "sourcePosition", 0);
        setField(term38127, term38127.getClass(), "jsType", null);
        setField(term38127, term38127.getClass(), "parent", null);
        setField(term38125, term38125.getClass(), "last", term38127);
        setField(term38125, term38125.getClass(), "propListHead", null);
        setIntField(term38125, term38125.getClass(), "sourcePosition", 0);
        setField(term38125, term38125.getClass(), "jsType", null);
        setField(term38125, term38125.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term36656;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term36564, args);
        assertTrue(recursiveEquals(term36564, term38124));
        assertTrue(recursiveEquals(term36656, term38125));
        assertTrue(recursiveEquals(retValue, null));
    }

};


