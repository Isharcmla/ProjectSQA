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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146820;
     Object term146912;
     Object term147278;
     Object term147279;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146820 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term146912 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term147004 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term147096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term146912, term146912.getClass(), "type", 111);
        setIntField(term147096, term147096.getClass(), "type", 415367776);
        setField(term147004, term147004.getClass(), "first", term147096);
        setField(term146912, term146912.getClass(), "parent", term147004);
        setIntField(term147188, term147188.getClass(), "type", 2359296);
        setField(term146912, term146912.getClass(), "first", term147188);
        term147278 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term147278, term147278.getClass(), "INEQ", null);
        setField(term147278, term147278.getClass(), "convention", null);
        setField(term147278, term147278.getClass(), "typeRegistry", null);
        setField(term147278, term147278.getClass(), "firstLink", null);
        setField(term147278, term147278.getClass(), "nextLink", null);
        setField(term147278, term147278.getClass(), "restrictUndefinedVisitor", null);
        setField(term147278, term147278.getClass(), "restrictNullVisitor", null);
        term147279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term147280 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term147282 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term147279, term147279.getClass(), "str", null);
        setIntField(term147279, term147279.getClass(), "type", 111);
        setField(term147279, term147279.getClass(), "next", null);
        setDoubleField(term147280, term147280.getClass(), "number", 0.0);
        setIntField(term147280, term147280.getClass(), "type", 2359296);
        setField(term147280, term147280.getClass(), "next", null);
        setField(term147280, term147280.getClass(), "first", null);
        setField(term147280, term147280.getClass(), "last", null);
        setField(term147280, term147280.getClass(), "propListHead", null);
        setIntField(term147280, term147280.getClass(), "sourcePosition", 0);
        setField(term147280, term147280.getClass(), "jsType", null);
        setField(term147280, term147280.getClass(), "parent", null);
        setField(term147279, term147279.getClass(), "first", term147280);
        setField(term147279, term147279.getClass(), "last", null);
        setField(term147279, term147279.getClass(), "propListHead", null);
        setIntField(term147279, term147279.getClass(), "sourcePosition", 0);
        setField(term147279, term147279.getClass(), "jsType", null);
        setField(term147281, term147281.getClass(), "str", null);
        setIntField(term147281, term147281.getClass(), "type", 0);
        setField(term147281, term147281.getClass(), "next", null);
        setDoubleField(term147282, term147282.getClass(), "number", 0.0);
        setIntField(term147282, term147282.getClass(), "type", 415367776);
        setField(term147282, term147282.getClass(), "next", null);
        setField(term147282, term147282.getClass(), "first", null);
        setField(term147282, term147282.getClass(), "last", null);
        setField(term147282, term147282.getClass(), "propListHead", null);
        setIntField(term147282, term147282.getClass(), "sourcePosition", 0);
        setField(term147282, term147282.getClass(), "jsType", null);
        setField(term147282, term147282.getClass(), "parent", null);
        setField(term147281, term147281.getClass(), "first", term147282);
        setField(term147281, term147281.getClass(), "last", null);
        setField(term147281, term147281.getClass(), "propListHead", null);
        setIntField(term147281, term147281.getClass(), "sourcePosition", 0);
        setField(term147281, term147281.getClass(), "jsType", null);
        setField(term147281, term147281.getClass(), "parent", null);
        setField(term147279, term147279.getClass(), "parent", term147281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term146912;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term146820, args);
        assertTrue(recursiveEquals(term146820, term147278));
        assertTrue(recursiveEquals(term146912, term147279));
        assertTrue(recursiveEquals(retValue, null));
    }

};


