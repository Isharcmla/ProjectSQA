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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73921;
     Object term74013;
     Object term74265;
     Object term74266;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73921 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term74013 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74197 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term74013, term74013.getClass(), "type", 13);
        setField(term74013, term74013.getClass(), "first", term74105);
        setField(term74013, term74013.getClass(), "last", term74197);
        term74265 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term74265, term74265.getClass(), "INEQ", null);
        setField(term74265, term74265.getClass(), "convention", null);
        setField(term74265, term74265.getClass(), "typeRegistry", null);
        setField(term74265, term74265.getClass(), "firstLink", null);
        setField(term74265, term74265.getClass(), "nextLink", null);
        setField(term74265, term74265.getClass(), "restrictUndefinedVisitor", null);
        setField(term74265, term74265.getClass(), "restrictNullVisitor", null);
        term74266 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74268 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term74266, term74266.getClass(), "number", 0.0);
        setIntField(term74266, term74266.getClass(), "type", 13);
        setField(term74266, term74266.getClass(), "next", null);
        setDoubleField(term74267, term74267.getClass(), "number", 0.0);
        setIntField(term74267, term74267.getClass(), "type", 0);
        setField(term74267, term74267.getClass(), "next", null);
        setField(term74267, term74267.getClass(), "first", null);
        setField(term74267, term74267.getClass(), "last", null);
        setField(term74267, term74267.getClass(), "propListHead", null);
        setIntField(term74267, term74267.getClass(), "sourcePosition", 0);
        setField(term74267, term74267.getClass(), "jsType", null);
        setField(term74267, term74267.getClass(), "parent", null);
        setField(term74266, term74266.getClass(), "first", term74267);
        setDoubleField(term74268, term74268.getClass(), "number", 0.0);
        setIntField(term74268, term74268.getClass(), "type", 0);
        setField(term74268, term74268.getClass(), "next", null);
        setField(term74268, term74268.getClass(), "first", null);
        setField(term74268, term74268.getClass(), "last", null);
        setField(term74268, term74268.getClass(), "propListHead", null);
        setIntField(term74268, term74268.getClass(), "sourcePosition", 0);
        setField(term74268, term74268.getClass(), "jsType", null);
        setField(term74268, term74268.getClass(), "parent", null);
        setField(term74266, term74266.getClass(), "last", term74268);
        setField(term74266, term74266.getClass(), "propListHead", null);
        setIntField(term74266, term74266.getClass(), "sourcePosition", 0);
        setField(term74266, term74266.getClass(), "jsType", null);
        setField(term74266, term74266.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term74013;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term73921, args);
        assertTrue(recursiveEquals(term73921, term74265));
        assertTrue(recursiveEquals(term74013, term74266));
        assertTrue(recursiveEquals(retValue, null));
    }

};


