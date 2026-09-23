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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170825;
     Object term170917;
     Object term171730;
     Object term171731;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170825 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term170917 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term171197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term170917, term170917.getClass(), "type", 45);
        setIntField(term171009, term171009.getClass(), "type", 1078385728);
        setField(term171009, term171009.getClass(), "jsType", term171105);
        setField(term170917, term170917.getClass(), "first", term171009);
        setIntField(term171197, term171197.getClass(), "type", -1078385729);
        setField(term171197, term171197.getClass(), "jsType", null);
        setField(term170917, term170917.getClass(), "last", term171197);
        term171730 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term171730, term171730.getClass(), "INEQ", null);
        setField(term171730, term171730.getClass(), "convention", null);
        setField(term171730, term171730.getClass(), "typeRegistry", null);
        setField(term171730, term171730.getClass(), "firstLink", null);
        setField(term171730, term171730.getClass(), "nextLink", null);
        setField(term171730, term171730.getClass(), "restrictUndefinedVisitor", null);
        setField(term171730, term171730.getClass(), "restrictNullVisitor", null);
        term171731 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term171734 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term171731, term171731.getClass(), "number", 0.0);
        setIntField(term171731, term171731.getClass(), "type", 45);
        setField(term171731, term171731.getClass(), "next", null);
        setField(term171732, term171732.getClass(), "str", null);
        setIntField(term171732, term171732.getClass(), "type", 1078385728);
        setField(term171732, term171732.getClass(), "next", null);
        setField(term171732, term171732.getClass(), "first", null);
        setField(term171732, term171732.getClass(), "last", null);
        setField(term171732, term171732.getClass(), "propListHead", null);
        setIntField(term171732, term171732.getClass(), "sourcePosition", 0);
        setBooleanField(term171733, term171733.getClass(), "resolved", false);
        setField(term171733, term171733.getClass(), "resolveResult", null);
        setBooleanField(term171733, term171733.getClass(), "inTemplatedCheckVisit", false);
        setField(term171733, term171733.getClass(), "registry", null);
        setField(term171732, term171732.getClass(), "jsType", term171733);
        setField(term171732, term171732.getClass(), "parent", null);
        setField(term171731, term171731.getClass(), "first", term171732);
        setField(term171734, term171734.getClass(), "str", null);
        setIntField(term171734, term171734.getClass(), "type", -1078385729);
        setField(term171734, term171734.getClass(), "next", null);
        setField(term171734, term171734.getClass(), "first", null);
        setField(term171734, term171734.getClass(), "last", null);
        setField(term171734, term171734.getClass(), "propListHead", null);
        setIntField(term171734, term171734.getClass(), "sourcePosition", 0);
        setField(term171734, term171734.getClass(), "jsType", null);
        setField(term171734, term171734.getClass(), "parent", null);
        setField(term171731, term171731.getClass(), "last", term171734);
        setField(term171731, term171731.getClass(), "propListHead", null);
        setIntField(term171731, term171731.getClass(), "sourcePosition", 0);
        setField(term171731, term171731.getClass(), "jsType", null);
        setField(term171731, term171731.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term170917;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term170825, args);
        assertTrue(recursiveEquals(term170825, term171730));
        assertTrue(recursiveEquals(term170917, term171731));
        assertTrue(recursiveEquals(retValue, null));
    }

};


