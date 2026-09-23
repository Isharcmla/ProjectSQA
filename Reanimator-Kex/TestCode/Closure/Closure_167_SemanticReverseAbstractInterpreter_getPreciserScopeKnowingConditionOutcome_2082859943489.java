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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131867;
     Object term131959;
     Object term132487;
     Object term132488;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131867 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term131959 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term132051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term132143 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term132341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term131959, term131959.getClass(), "type", 111);
        setIntField(term132143, term132143.getClass(), "type", 0);
        setField(term132143, term132143.getClass(), "jsType", term132249);
        setField(term132051, term132051.getClass(), "first", term132143);
        setField(term131959, term131959.getClass(), "parent", term132051);
        setIntField(term132341, term132341.getClass(), "type", -1431654433);
        setField(term132341, term132341.getClass(), "jsType", null);
        setField(term131959, term131959.getClass(), "first", term132341);
        term132487 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term132487, term132487.getClass(), "INEQ", null);
        setField(term132487, term132487.getClass(), "convention", null);
        setField(term132487, term132487.getClass(), "typeRegistry", null);
        setField(term132487, term132487.getClass(), "firstLink", null);
        setField(term132487, term132487.getClass(), "nextLink", null);
        setField(term132487, term132487.getClass(), "restrictUndefinedVisitor", null);
        setField(term132487, term132487.getClass(), "restrictNullVisitor", null);
        term132488 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term132489 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term132491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term132488, term132488.getClass(), "str", null);
        setIntField(term132488, term132488.getClass(), "type", 111);
        setField(term132488, term132488.getClass(), "next", null);
        setDoubleField(term132489, term132489.getClass(), "number", 0.0);
        setIntField(term132489, term132489.getClass(), "type", -1431654433);
        setField(term132489, term132489.getClass(), "next", null);
        setField(term132489, term132489.getClass(), "first", null);
        setField(term132489, term132489.getClass(), "last", null);
        setField(term132489, term132489.getClass(), "propListHead", null);
        setIntField(term132489, term132489.getClass(), "sourcePosition", 0);
        setField(term132489, term132489.getClass(), "jsType", null);
        setField(term132489, term132489.getClass(), "parent", null);
        setField(term132488, term132488.getClass(), "first", term132489);
        setField(term132488, term132488.getClass(), "last", null);
        setField(term132488, term132488.getClass(), "propListHead", null);
        setIntField(term132488, term132488.getClass(), "sourcePosition", 0);
        setField(term132488, term132488.getClass(), "jsType", null);
        setField(term132490, term132490.getClass(), "str", null);
        setIntField(term132490, term132490.getClass(), "type", 0);
        setField(term132490, term132490.getClass(), "next", null);
        setDoubleField(term132491, term132491.getClass(), "number", 0.0);
        setIntField(term132491, term132491.getClass(), "type", 0);
        setField(term132491, term132491.getClass(), "next", null);
        setField(term132491, term132491.getClass(), "first", null);
        setField(term132491, term132491.getClass(), "last", null);
        setField(term132491, term132491.getClass(), "propListHead", null);
        setIntField(term132491, term132491.getClass(), "sourcePosition", 0);
        setField(term132492, term132492.getClass(), "primitiveType", null);
        setField(term132492, term132492.getClass(), "primitiveObjectType", null);
        setField(term132492, term132492.getClass(), "name", null);
        setBooleanField(term132492, term132492.getClass(), "visited", false);
        setField(term132492, term132492.getClass(), "docInfo", null);
        setBooleanField(term132492, term132492.getClass(), "unknown", false);
        setBooleanField(term132492, term132492.getClass(), "resolved", false);
        setField(term132492, term132492.getClass(), "resolveResult", null);
        setBooleanField(term132492, term132492.getClass(), "inTemplatedCheckVisit", false);
        setField(term132492, term132492.getClass(), "registry", null);
        setField(term132491, term132491.getClass(), "jsType", term132492);
        setField(term132491, term132491.getClass(), "parent", null);
        setField(term132490, term132490.getClass(), "first", term132491);
        setField(term132490, term132490.getClass(), "last", null);
        setField(term132490, term132490.getClass(), "propListHead", null);
        setIntField(term132490, term132490.getClass(), "sourcePosition", 0);
        setField(term132490, term132490.getClass(), "jsType", null);
        setField(term132490, term132490.getClass(), "parent", null);
        setField(term132488, term132488.getClass(), "parent", term132490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term131959;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term131867, args);
        assertTrue(recursiveEquals(term131867, term132487));
        assertTrue(recursiveEquals(term131959, term132488));
        assertTrue(recursiveEquals(retValue, null));
    }

};


