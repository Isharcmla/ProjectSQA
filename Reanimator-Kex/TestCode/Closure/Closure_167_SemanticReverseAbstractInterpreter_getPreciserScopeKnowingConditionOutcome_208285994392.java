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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18999;
     Object term19091;
     Object term19611;
     Object term19612;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18999 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term19091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term19183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term19091, term19091.getClass(), "type", 46);
        setField(term19091, term19091.getClass(), "first", term19091);
        setField(term19091, term19091.getClass(), "last", term19183);
        term19611 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term19611, term19611.getClass(), "INEQ", null);
        setField(term19611, term19611.getClass(), "convention", null);
        setField(term19611, term19611.getClass(), "typeRegistry", null);
        setField(term19611, term19611.getClass(), "firstLink", null);
        setField(term19611, term19611.getClass(), "nextLink", null);
        setField(term19611, term19611.getClass(), "restrictUndefinedVisitor", null);
        setField(term19611, term19611.getClass(), "restrictNullVisitor", null);
        term19612 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term19613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term19612, term19612.getClass(), "number", 0.0);
        setIntField(term19612, term19612.getClass(), "type", 46);
        setField(term19612, term19612.getClass(), "next", null);
        setField(term19612, term19612.getClass(), "first", term19612);
        setDoubleField(term19613, term19613.getClass(), "number", 0.0);
        setIntField(term19613, term19613.getClass(), "type", 0);
        setField(term19613, term19613.getClass(), "next", null);
        setField(term19613, term19613.getClass(), "first", null);
        setField(term19613, term19613.getClass(), "last", null);
        setField(term19613, term19613.getClass(), "propListHead", null);
        setIntField(term19613, term19613.getClass(), "sourcePosition", 0);
        setField(term19613, term19613.getClass(), "jsType", null);
        setField(term19613, term19613.getClass(), "parent", null);
        setField(term19612, term19612.getClass(), "last", term19613);
        setField(term19612, term19612.getClass(), "propListHead", null);
        setIntField(term19612, term19612.getClass(), "sourcePosition", 0);
        setField(term19612, term19612.getClass(), "jsType", null);
        setField(term19612, term19612.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term19091;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term18999, args);
        assertTrue(recursiveEquals(term18999, term19611));
        assertTrue(recursiveEquals(term19091, term19612));
        assertTrue(recursiveEquals(retValue, null));
    }

};


