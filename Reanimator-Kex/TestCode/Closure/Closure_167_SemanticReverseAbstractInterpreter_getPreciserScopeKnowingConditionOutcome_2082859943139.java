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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30707;
     Object term30799;
     Object term31329;
     Object term31330;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30707 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term30799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30983 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term30799, term30799.getClass(), "type", 46);
        setField(term30799, term30799.getClass(), "first", term30891);
        setField(term30799, term30799.getClass(), "last", term30983);
        term31329 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term31329, term31329.getClass(), "INEQ", null);
        setField(term31329, term31329.getClass(), "convention", null);
        setField(term31329, term31329.getClass(), "typeRegistry", null);
        setField(term31329, term31329.getClass(), "firstLink", null);
        setField(term31329, term31329.getClass(), "nextLink", null);
        setField(term31329, term31329.getClass(), "restrictUndefinedVisitor", null);
        setField(term31329, term31329.getClass(), "restrictNullVisitor", null);
        term31330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term31331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term31332 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term31330, term31330.getClass(), "number", 0.0);
        setIntField(term31330, term31330.getClass(), "type", 46);
        setField(term31330, term31330.getClass(), "next", null);
        setDoubleField(term31331, term31331.getClass(), "number", 0.0);
        setIntField(term31331, term31331.getClass(), "type", 0);
        setField(term31331, term31331.getClass(), "next", null);
        setField(term31331, term31331.getClass(), "first", null);
        setField(term31331, term31331.getClass(), "last", null);
        setField(term31331, term31331.getClass(), "propListHead", null);
        setIntField(term31331, term31331.getClass(), "sourcePosition", 0);
        setField(term31331, term31331.getClass(), "jsType", null);
        setField(term31331, term31331.getClass(), "parent", null);
        setField(term31330, term31330.getClass(), "first", term31331);
        setDoubleField(term31332, term31332.getClass(), "number", 0.0);
        setIntField(term31332, term31332.getClass(), "type", 0);
        setField(term31332, term31332.getClass(), "next", null);
        setField(term31332, term31332.getClass(), "first", null);
        setField(term31332, term31332.getClass(), "last", null);
        setField(term31332, term31332.getClass(), "propListHead", null);
        setIntField(term31332, term31332.getClass(), "sourcePosition", 0);
        setField(term31332, term31332.getClass(), "jsType", null);
        setField(term31332, term31332.getClass(), "parent", null);
        setField(term31330, term31330.getClass(), "last", term31332);
        setField(term31330, term31330.getClass(), "propListHead", null);
        setIntField(term31330, term31330.getClass(), "sourcePosition", 0);
        setField(term31330, term31330.getClass(), "jsType", null);
        setField(term31330, term31330.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term30799;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term30707, args);
        assertTrue(recursiveEquals(term30707, term31329));
        assertTrue(recursiveEquals(term30799, term31330));
        assertTrue(recursiveEquals(retValue, null));
    }

};


