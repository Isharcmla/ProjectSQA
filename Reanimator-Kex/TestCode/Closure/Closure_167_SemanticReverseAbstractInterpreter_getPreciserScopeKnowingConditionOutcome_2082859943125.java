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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27316;
     Object term27408;
     Object term27660;
     Object term27661;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27316 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term27408 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27500 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27592 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term27408, term27408.getClass(), "type", 12);
        setIntField(term27500, term27500.getClass(), "type", 12);
        setField(term27408, term27408.getClass(), "first", term27500);
        setField(term27408, term27408.getClass(), "last", term27592);
        term27660 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term27660, term27660.getClass(), "INEQ", null);
        setField(term27660, term27660.getClass(), "convention", null);
        setField(term27660, term27660.getClass(), "typeRegistry", null);
        setField(term27660, term27660.getClass(), "firstLink", null);
        setField(term27660, term27660.getClass(), "nextLink", null);
        setField(term27660, term27660.getClass(), "restrictUndefinedVisitor", null);
        setField(term27660, term27660.getClass(), "restrictNullVisitor", null);
        term27661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term27661, term27661.getClass(), "number", 0.0);
        setIntField(term27661, term27661.getClass(), "type", 12);
        setField(term27661, term27661.getClass(), "next", null);
        setDoubleField(term27662, term27662.getClass(), "number", 0.0);
        setIntField(term27662, term27662.getClass(), "type", 12);
        setField(term27662, term27662.getClass(), "next", null);
        setField(term27662, term27662.getClass(), "first", null);
        setField(term27662, term27662.getClass(), "last", null);
        setField(term27662, term27662.getClass(), "propListHead", null);
        setIntField(term27662, term27662.getClass(), "sourcePosition", 0);
        setField(term27662, term27662.getClass(), "jsType", null);
        setField(term27662, term27662.getClass(), "parent", null);
        setField(term27661, term27661.getClass(), "first", term27662);
        setDoubleField(term27663, term27663.getClass(), "number", 0.0);
        setIntField(term27663, term27663.getClass(), "type", 0);
        setField(term27663, term27663.getClass(), "next", null);
        setField(term27663, term27663.getClass(), "first", null);
        setField(term27663, term27663.getClass(), "last", null);
        setField(term27663, term27663.getClass(), "propListHead", null);
        setIntField(term27663, term27663.getClass(), "sourcePosition", 0);
        setField(term27663, term27663.getClass(), "jsType", null);
        setField(term27663, term27663.getClass(), "parent", null);
        setField(term27661, term27661.getClass(), "last", term27663);
        setField(term27661, term27661.getClass(), "propListHead", null);
        setIntField(term27661, term27661.getClass(), "sourcePosition", 0);
        setField(term27661, term27661.getClass(), "jsType", null);
        setField(term27661, term27661.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term27408;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term27316, args);
        assertTrue(recursiveEquals(term27316, term27660));
        assertTrue(recursiveEquals(term27408, term27661));
        assertTrue(recursiveEquals(retValue, null));
    }

};


