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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71212;
     Object term71304;
     Object term71556;
     Object term71557;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71212 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term71304 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71396 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term71304, term71304.getClass(), "type", 46);
        setIntField(term71396, term71396.getClass(), "type", 46);
        setField(term71304, term71304.getClass(), "first", term71396);
        setIntField(term71488, term71488.getClass(), "type", 46);
        setField(term71304, term71304.getClass(), "last", term71488);
        term71556 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term71556, term71556.getClass(), "INEQ", null);
        setField(term71556, term71556.getClass(), "convention", null);
        setField(term71556, term71556.getClass(), "typeRegistry", null);
        setField(term71556, term71556.getClass(), "firstLink", null);
        setField(term71556, term71556.getClass(), "nextLink", null);
        setField(term71556, term71556.getClass(), "restrictUndefinedVisitor", null);
        setField(term71556, term71556.getClass(), "restrictNullVisitor", null);
        term71557 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71558 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term71557, term71557.getClass(), "number", 0.0);
        setIntField(term71557, term71557.getClass(), "type", 46);
        setField(term71557, term71557.getClass(), "next", null);
        setDoubleField(term71558, term71558.getClass(), "number", 0.0);
        setIntField(term71558, term71558.getClass(), "type", 46);
        setField(term71558, term71558.getClass(), "next", null);
        setField(term71558, term71558.getClass(), "first", null);
        setField(term71558, term71558.getClass(), "last", null);
        setField(term71558, term71558.getClass(), "propListHead", null);
        setIntField(term71558, term71558.getClass(), "sourcePosition", 0);
        setField(term71558, term71558.getClass(), "jsType", null);
        setField(term71558, term71558.getClass(), "parent", null);
        setField(term71557, term71557.getClass(), "first", term71558);
        setDoubleField(term71559, term71559.getClass(), "number", 0.0);
        setIntField(term71559, term71559.getClass(), "type", 46);
        setField(term71559, term71559.getClass(), "next", null);
        setField(term71559, term71559.getClass(), "first", null);
        setField(term71559, term71559.getClass(), "last", null);
        setField(term71559, term71559.getClass(), "propListHead", null);
        setIntField(term71559, term71559.getClass(), "sourcePosition", 0);
        setField(term71559, term71559.getClass(), "jsType", null);
        setField(term71559, term71559.getClass(), "parent", null);
        setField(term71557, term71557.getClass(), "last", term71559);
        setField(term71557, term71557.getClass(), "propListHead", null);
        setIntField(term71557, term71557.getClass(), "sourcePosition", 0);
        setField(term71557, term71557.getClass(), "jsType", null);
        setField(term71557, term71557.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term71304;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term71212, args);
        assertTrue(recursiveEquals(term71212, term71556));
        assertTrue(recursiveEquals(term71304, term71557));
        assertTrue(recursiveEquals(retValue, null));
    }

};


