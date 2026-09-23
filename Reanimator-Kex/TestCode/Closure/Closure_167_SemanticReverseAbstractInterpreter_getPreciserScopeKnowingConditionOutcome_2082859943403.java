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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105562;
     Object term105654;
     Object term106020;
     Object term106021;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105562 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term105654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term105746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term105838 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term105654, term105654.getClass(), "type", 111);
        setIntField(term105838, term105838.getClass(), "type", 111);
        setField(term105746, term105746.getClass(), "first", term105838);
        setField(term105654, term105654.getClass(), "parent", term105746);
        setField(term105654, term105654.getClass(), "first", term105930);
        term106020 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term106020, term106020.getClass(), "INEQ", null);
        setField(term106020, term106020.getClass(), "convention", null);
        setField(term106020, term106020.getClass(), "typeRegistry", null);
        setField(term106020, term106020.getClass(), "firstLink", null);
        setField(term106020, term106020.getClass(), "nextLink", null);
        setField(term106020, term106020.getClass(), "restrictUndefinedVisitor", null);
        setField(term106020, term106020.getClass(), "restrictNullVisitor", null);
        term106021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term106022 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term106023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term106024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term106021, term106021.getClass(), "str", null);
        setIntField(term106021, term106021.getClass(), "type", 111);
        setField(term106021, term106021.getClass(), "next", null);
        setDoubleField(term106022, term106022.getClass(), "number", 0.0);
        setIntField(term106022, term106022.getClass(), "type", 0);
        setField(term106022, term106022.getClass(), "next", null);
        setField(term106022, term106022.getClass(), "first", null);
        setField(term106022, term106022.getClass(), "last", null);
        setField(term106022, term106022.getClass(), "propListHead", null);
        setIntField(term106022, term106022.getClass(), "sourcePosition", 0);
        setField(term106022, term106022.getClass(), "jsType", null);
        setField(term106022, term106022.getClass(), "parent", null);
        setField(term106021, term106021.getClass(), "first", term106022);
        setField(term106021, term106021.getClass(), "last", null);
        setField(term106021, term106021.getClass(), "propListHead", null);
        setIntField(term106021, term106021.getClass(), "sourcePosition", 0);
        setField(term106021, term106021.getClass(), "jsType", null);
        setField(term106023, term106023.getClass(), "str", null);
        setIntField(term106023, term106023.getClass(), "type", 0);
        setField(term106023, term106023.getClass(), "next", null);
        setDoubleField(term106024, term106024.getClass(), "number", 0.0);
        setIntField(term106024, term106024.getClass(), "type", 111);
        setField(term106024, term106024.getClass(), "next", null);
        setField(term106024, term106024.getClass(), "first", null);
        setField(term106024, term106024.getClass(), "last", null);
        setField(term106024, term106024.getClass(), "propListHead", null);
        setIntField(term106024, term106024.getClass(), "sourcePosition", 0);
        setField(term106024, term106024.getClass(), "jsType", null);
        setField(term106024, term106024.getClass(), "parent", null);
        setField(term106023, term106023.getClass(), "first", term106024);
        setField(term106023, term106023.getClass(), "last", null);
        setField(term106023, term106023.getClass(), "propListHead", null);
        setIntField(term106023, term106023.getClass(), "sourcePosition", 0);
        setField(term106023, term106023.getClass(), "jsType", null);
        setField(term106023, term106023.getClass(), "parent", null);
        setField(term106021, term106021.getClass(), "parent", term106023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term105654;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term105562, args);
        assertTrue(recursiveEquals(term105562, term106020));
        assertTrue(recursiveEquals(term105654, term106021));
        assertTrue(recursiveEquals(retValue, null));
    }

};


