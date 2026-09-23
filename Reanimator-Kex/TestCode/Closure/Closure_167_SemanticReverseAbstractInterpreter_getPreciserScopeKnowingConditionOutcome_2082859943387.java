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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101430;
     Object term101522;
     Object term101746;
     Object term101747;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101430 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term101522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term101614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term101522, term101522.getClass(), "type", 12);
        setIntField(term101614, term101614.getClass(), "type", 0);
        setField(term101522, term101522.getClass(), "first", term101614);
        setField(term101522, term101522.getClass(), "last", term101684);
        term101746 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term101746, term101746.getClass(), "INEQ", null);
        setField(term101746, term101746.getClass(), "convention", null);
        setField(term101746, term101746.getClass(), "typeRegistry", null);
        setField(term101746, term101746.getClass(), "firstLink", null);
        setField(term101746, term101746.getClass(), "nextLink", null);
        setField(term101746, term101746.getClass(), "restrictUndefinedVisitor", null);
        setField(term101746, term101746.getClass(), "restrictNullVisitor", null);
        term101747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term101748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101747, term101747.getClass(), "str", null);
        setIntField(term101747, term101747.getClass(), "type", 12);
        setField(term101747, term101747.getClass(), "next", null);
        setDoubleField(term101748, term101748.getClass(), "number", 0.0);
        setIntField(term101748, term101748.getClass(), "type", 0);
        setField(term101748, term101748.getClass(), "next", null);
        setField(term101748, term101748.getClass(), "first", null);
        setField(term101748, term101748.getClass(), "last", null);
        setField(term101748, term101748.getClass(), "propListHead", null);
        setIntField(term101748, term101748.getClass(), "sourcePosition", 0);
        setField(term101748, term101748.getClass(), "jsType", null);
        setField(term101748, term101748.getClass(), "parent", null);
        setField(term101747, term101747.getClass(), "first", term101748);
        setIntField(term101749, term101749.getClass(), "type", 0);
        setField(term101749, term101749.getClass(), "next", null);
        setField(term101749, term101749.getClass(), "first", null);
        setField(term101749, term101749.getClass(), "last", null);
        setField(term101749, term101749.getClass(), "propListHead", null);
        setIntField(term101749, term101749.getClass(), "sourcePosition", 0);
        setField(term101749, term101749.getClass(), "jsType", null);
        setField(term101749, term101749.getClass(), "parent", null);
        setField(term101747, term101747.getClass(), "last", term101749);
        setField(term101747, term101747.getClass(), "propListHead", null);
        setIntField(term101747, term101747.getClass(), "sourcePosition", 0);
        setField(term101747, term101747.getClass(), "jsType", null);
        setField(term101747, term101747.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term101522;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term101430, args);
        assertTrue(recursiveEquals(term101430, term101746));
        assertTrue(recursiveEquals(term101522, term101747));
        assertTrue(recursiveEquals(retValue, null));
    }

};


