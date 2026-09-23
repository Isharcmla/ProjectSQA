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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203928;
     Object term204020;
     Object term204271;
     Object term204272;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203928 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term204020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term204112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204204 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term204020, term204020.getClass(), "type", 12);
        setIntField(term204112, term204112.getClass(), "type", 12);
        setField(term204020, term204020.getClass(), "first", term204112);
        setIntField(term204204, term204204.getClass(), "type", 12);
        setField(term204020, term204020.getClass(), "last", term204204);
        term204271 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term204271, term204271.getClass(), "INEQ", null);
        setField(term204271, term204271.getClass(), "convention", null);
        setField(term204271, term204271.getClass(), "typeRegistry", null);
        setField(term204271, term204271.getClass(), "firstLink", null);
        setField(term204271, term204271.getClass(), "nextLink", null);
        setField(term204271, term204271.getClass(), "restrictUndefinedVisitor", null);
        setField(term204271, term204271.getClass(), "restrictNullVisitor", null);
        term204272 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term204273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term204272, term204272.getClass(), "str", null);
        setIntField(term204272, term204272.getClass(), "type", 12);
        setField(term204272, term204272.getClass(), "next", null);
        setDoubleField(term204273, term204273.getClass(), "number", 0.0);
        setIntField(term204273, term204273.getClass(), "type", 12);
        setField(term204273, term204273.getClass(), "next", null);
        setField(term204273, term204273.getClass(), "first", null);
        setField(term204273, term204273.getClass(), "last", null);
        setField(term204273, term204273.getClass(), "propListHead", null);
        setIntField(term204273, term204273.getClass(), "sourcePosition", 0);
        setField(term204273, term204273.getClass(), "jsType", null);
        setField(term204273, term204273.getClass(), "parent", null);
        setField(term204272, term204272.getClass(), "first", term204273);
        setDoubleField(term204274, term204274.getClass(), "number", 0.0);
        setIntField(term204274, term204274.getClass(), "type", 12);
        setField(term204274, term204274.getClass(), "next", null);
        setField(term204274, term204274.getClass(), "first", null);
        setField(term204274, term204274.getClass(), "last", null);
        setField(term204274, term204274.getClass(), "propListHead", null);
        setIntField(term204274, term204274.getClass(), "sourcePosition", 0);
        setField(term204274, term204274.getClass(), "jsType", null);
        setField(term204274, term204274.getClass(), "parent", null);
        setField(term204272, term204272.getClass(), "last", term204274);
        setField(term204272, term204272.getClass(), "propListHead", null);
        setIntField(term204272, term204272.getClass(), "sourcePosition", 0);
        setField(term204272, term204272.getClass(), "jsType", null);
        setField(term204272, term204272.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term204020;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term203928, args);
        assertTrue(recursiveEquals(term203928, term204271));
        assertTrue(recursiveEquals(term204020, term204272));
        assertTrue(recursiveEquals(retValue, null));
    }

};


