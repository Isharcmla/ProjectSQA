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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111299;
     Object term111391;
     Object term111509;
     Object term111510;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111299 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term111391 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111483 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term111391, term111391.getClass(), "type", 51);
        setField(term111391, term111391.getClass(), "first", term111483);
        term111509 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term111509, term111509.getClass(), "INEQ", null);
        setField(term111509, term111509.getClass(), "convention", null);
        setField(term111509, term111509.getClass(), "typeRegistry", null);
        setField(term111509, term111509.getClass(), "firstLink", null);
        setField(term111509, term111509.getClass(), "nextLink", null);
        setField(term111509, term111509.getClass(), "restrictUndefinedVisitor", null);
        setField(term111509, term111509.getClass(), "restrictNullVisitor", null);
        term111510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term111510, term111510.getClass(), "number", 0.0);
        setIntField(term111510, term111510.getClass(), "type", 51);
        setField(term111510, term111510.getClass(), "next", null);
        setDoubleField(term111511, term111511.getClass(), "number", 0.0);
        setIntField(term111511, term111511.getClass(), "type", 0);
        setField(term111511, term111511.getClass(), "next", null);
        setField(term111511, term111511.getClass(), "first", null);
        setField(term111511, term111511.getClass(), "last", null);
        setField(term111511, term111511.getClass(), "propListHead", null);
        setIntField(term111511, term111511.getClass(), "sourcePosition", 0);
        setField(term111511, term111511.getClass(), "jsType", null);
        setField(term111511, term111511.getClass(), "parent", null);
        setField(term111510, term111510.getClass(), "first", term111511);
        setField(term111510, term111510.getClass(), "last", null);
        setField(term111510, term111510.getClass(), "propListHead", null);
        setIntField(term111510, term111510.getClass(), "sourcePosition", 0);
        setField(term111510, term111510.getClass(), "jsType", null);
        setField(term111510, term111510.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term111391;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term111299, args);
        assertTrue(recursiveEquals(term111299, term111509));
        assertTrue(recursiveEquals(term111391, term111510));
        assertTrue(recursiveEquals(retValue, null));
    }

};


