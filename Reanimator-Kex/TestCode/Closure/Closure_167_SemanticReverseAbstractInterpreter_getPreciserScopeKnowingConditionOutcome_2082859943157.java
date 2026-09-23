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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35332;
     Object term35424;
     Object term35676;
     Object term35677;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35332 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term35424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35608 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term35424, term35424.getClass(), "type", 13);
        setIntField(term35516, term35516.getClass(), "type", 13);
        setField(term35424, term35424.getClass(), "first", term35516);
        setIntField(term35608, term35608.getClass(), "type", 13);
        setField(term35424, term35424.getClass(), "last", term35608);
        term35676 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term35676, term35676.getClass(), "INEQ", null);
        setField(term35676, term35676.getClass(), "convention", null);
        setField(term35676, term35676.getClass(), "typeRegistry", null);
        setField(term35676, term35676.getClass(), "firstLink", null);
        setField(term35676, term35676.getClass(), "nextLink", null);
        setField(term35676, term35676.getClass(), "restrictUndefinedVisitor", null);
        setField(term35676, term35676.getClass(), "restrictNullVisitor", null);
        term35677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35679 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term35677, term35677.getClass(), "number", 0.0);
        setIntField(term35677, term35677.getClass(), "type", 13);
        setField(term35677, term35677.getClass(), "next", null);
        setDoubleField(term35678, term35678.getClass(), "number", 0.0);
        setIntField(term35678, term35678.getClass(), "type", 13);
        setField(term35678, term35678.getClass(), "next", null);
        setField(term35678, term35678.getClass(), "first", null);
        setField(term35678, term35678.getClass(), "last", null);
        setField(term35678, term35678.getClass(), "propListHead", null);
        setIntField(term35678, term35678.getClass(), "sourcePosition", 0);
        setField(term35678, term35678.getClass(), "jsType", null);
        setField(term35678, term35678.getClass(), "parent", null);
        setField(term35677, term35677.getClass(), "first", term35678);
        setDoubleField(term35679, term35679.getClass(), "number", 0.0);
        setIntField(term35679, term35679.getClass(), "type", 13);
        setField(term35679, term35679.getClass(), "next", null);
        setField(term35679, term35679.getClass(), "first", null);
        setField(term35679, term35679.getClass(), "last", null);
        setField(term35679, term35679.getClass(), "propListHead", null);
        setIntField(term35679, term35679.getClass(), "sourcePosition", 0);
        setField(term35679, term35679.getClass(), "jsType", null);
        setField(term35679, term35679.getClass(), "parent", null);
        setField(term35677, term35677.getClass(), "last", term35679);
        setField(term35677, term35677.getClass(), "propListHead", null);
        setIntField(term35677, term35677.getClass(), "sourcePosition", 0);
        setField(term35677, term35677.getClass(), "jsType", null);
        setField(term35677, term35677.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term35424;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term35332, args);
        assertTrue(recursiveEquals(term35332, term35676));
        assertTrue(recursiveEquals(term35424, term35677));
        assertTrue(recursiveEquals(retValue, null));
    }

};


