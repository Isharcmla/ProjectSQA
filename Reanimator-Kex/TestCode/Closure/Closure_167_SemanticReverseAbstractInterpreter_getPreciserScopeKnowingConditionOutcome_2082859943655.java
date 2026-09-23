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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188339;
     Object term188431;
     Object term188677;
     Object term188678;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188339 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term188431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term188523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term188431, term188431.getClass(), "type", 13);
        setIntField(term188523, term188523.getClass(), "type", 0);
        setField(term188431, term188431.getClass(), "first", term188523);
        setField(term188431, term188431.getClass(), "last", term188615);
        term188677 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term188677, term188677.getClass(), "INEQ", null);
        setField(term188677, term188677.getClass(), "convention", null);
        setField(term188677, term188677.getClass(), "typeRegistry", null);
        setField(term188677, term188677.getClass(), "firstLink", null);
        setField(term188677, term188677.getClass(), "nextLink", null);
        setField(term188677, term188677.getClass(), "restrictUndefinedVisitor", null);
        setField(term188677, term188677.getClass(), "restrictNullVisitor", null);
        term188678 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term188679 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188680 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term188678, term188678.getClass(), "str", null);
        setIntField(term188678, term188678.getClass(), "type", 13);
        setField(term188678, term188678.getClass(), "next", null);
        setDoubleField(term188679, term188679.getClass(), "number", 0.0);
        setIntField(term188679, term188679.getClass(), "type", 0);
        setField(term188679, term188679.getClass(), "next", null);
        setField(term188679, term188679.getClass(), "first", null);
        setField(term188679, term188679.getClass(), "last", null);
        setField(term188679, term188679.getClass(), "propListHead", null);
        setIntField(term188679, term188679.getClass(), "sourcePosition", 0);
        setField(term188679, term188679.getClass(), "jsType", null);
        setField(term188679, term188679.getClass(), "parent", null);
        setField(term188678, term188678.getClass(), "first", term188679);
        setField(term188680, term188680.getClass(), "str", null);
        setIntField(term188680, term188680.getClass(), "type", 0);
        setField(term188680, term188680.getClass(), "next", null);
        setField(term188680, term188680.getClass(), "first", null);
        setField(term188680, term188680.getClass(), "last", null);
        setField(term188680, term188680.getClass(), "propListHead", null);
        setIntField(term188680, term188680.getClass(), "sourcePosition", 0);
        setField(term188680, term188680.getClass(), "jsType", null);
        setField(term188680, term188680.getClass(), "parent", null);
        setField(term188678, term188678.getClass(), "last", term188680);
        setField(term188678, term188678.getClass(), "propListHead", null);
        setIntField(term188678, term188678.getClass(), "sourcePosition", 0);
        setField(term188678, term188678.getClass(), "jsType", null);
        setField(term188678, term188678.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term188431;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term188339, args);
        assertTrue(recursiveEquals(term188339, term188677));
        assertTrue(recursiveEquals(term188431, term188678));
        assertTrue(recursiveEquals(retValue, null));
    }

};


