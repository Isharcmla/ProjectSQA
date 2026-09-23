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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23333;
     Object term23425;
     Object term23677;
     Object term23678;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23333 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term23425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term23517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term23609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term23425, term23425.getClass(), "type", 12);
        setField(term23425, term23425.getClass(), "first", term23517);
        setField(term23425, term23425.getClass(), "last", term23609);
        term23677 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term23677, term23677.getClass(), "INEQ", null);
        setField(term23677, term23677.getClass(), "convention", null);
        setField(term23677, term23677.getClass(), "typeRegistry", null);
        setField(term23677, term23677.getClass(), "firstLink", null);
        setField(term23677, term23677.getClass(), "nextLink", null);
        setField(term23677, term23677.getClass(), "restrictUndefinedVisitor", null);
        setField(term23677, term23677.getClass(), "restrictNullVisitor", null);
        term23678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term23679 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term23680 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term23678, term23678.getClass(), "number", 0.0);
        setIntField(term23678, term23678.getClass(), "type", 12);
        setField(term23678, term23678.getClass(), "next", null);
        setDoubleField(term23679, term23679.getClass(), "number", 0.0);
        setIntField(term23679, term23679.getClass(), "type", 0);
        setField(term23679, term23679.getClass(), "next", null);
        setField(term23679, term23679.getClass(), "first", null);
        setField(term23679, term23679.getClass(), "last", null);
        setField(term23679, term23679.getClass(), "propListHead", null);
        setIntField(term23679, term23679.getClass(), "sourcePosition", 0);
        setField(term23679, term23679.getClass(), "jsType", null);
        setField(term23679, term23679.getClass(), "parent", null);
        setField(term23678, term23678.getClass(), "first", term23679);
        setDoubleField(term23680, term23680.getClass(), "number", 0.0);
        setIntField(term23680, term23680.getClass(), "type", 0);
        setField(term23680, term23680.getClass(), "next", null);
        setField(term23680, term23680.getClass(), "first", null);
        setField(term23680, term23680.getClass(), "last", null);
        setField(term23680, term23680.getClass(), "propListHead", null);
        setIntField(term23680, term23680.getClass(), "sourcePosition", 0);
        setField(term23680, term23680.getClass(), "jsType", null);
        setField(term23680, term23680.getClass(), "parent", null);
        setField(term23678, term23678.getClass(), "last", term23680);
        setField(term23678, term23678.getClass(), "propListHead", null);
        setIntField(term23678, term23678.getClass(), "sourcePosition", 0);
        setField(term23678, term23678.getClass(), "jsType", null);
        setField(term23678, term23678.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term23425;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term23333, args);
        assertTrue(recursiveEquals(term23333, term23677));
        assertTrue(recursiveEquals(term23425, term23678));
        assertTrue(recursiveEquals(retValue, null));
    }

};


