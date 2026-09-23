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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62781;
     Object term62873;
     Object term63114;
     Object term63115;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62781 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term62873 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term62873, term62873.getClass(), "type", 13);
        setIntField(term62965, term62965.getClass(), "type", 13);
        setField(term62873, term62873.getClass(), "first", term62965);
        setField(term62873, term62873.getClass(), "last", term63057);
        term63114 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term63114, term63114.getClass(), "INEQ", null);
        setField(term63114, term63114.getClass(), "convention", null);
        setField(term63114, term63114.getClass(), "typeRegistry", null);
        setField(term63114, term63114.getClass(), "firstLink", null);
        setField(term63114, term63114.getClass(), "nextLink", null);
        setField(term63114, term63114.getClass(), "restrictUndefinedVisitor", null);
        setField(term63114, term63114.getClass(), "restrictNullVisitor", null);
        term63115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63117 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term63115, term63115.getClass(), "str", null);
        setIntField(term63115, term63115.getClass(), "type", 13);
        setField(term63115, term63115.getClass(), "next", null);
        setField(term63116, term63116.getClass(), "str", null);
        setIntField(term63116, term63116.getClass(), "type", 13);
        setField(term63116, term63116.getClass(), "next", null);
        setField(term63116, term63116.getClass(), "first", null);
        setField(term63116, term63116.getClass(), "last", null);
        setField(term63116, term63116.getClass(), "propListHead", null);
        setIntField(term63116, term63116.getClass(), "sourcePosition", 0);
        setField(term63116, term63116.getClass(), "jsType", null);
        setField(term63116, term63116.getClass(), "parent", null);
        setField(term63115, term63115.getClass(), "first", term63116);
        setField(term63117, term63117.getClass(), "str", null);
        setIntField(term63117, term63117.getClass(), "type", 0);
        setField(term63117, term63117.getClass(), "next", null);
        setField(term63117, term63117.getClass(), "first", null);
        setField(term63117, term63117.getClass(), "last", null);
        setField(term63117, term63117.getClass(), "propListHead", null);
        setIntField(term63117, term63117.getClass(), "sourcePosition", 0);
        setField(term63117, term63117.getClass(), "jsType", null);
        setField(term63117, term63117.getClass(), "parent", null);
        setField(term63115, term63115.getClass(), "last", term63117);
        setField(term63115, term63115.getClass(), "propListHead", null);
        setIntField(term63115, term63115.getClass(), "sourcePosition", 0);
        setField(term63115, term63115.getClass(), "jsType", null);
        setField(term63115, term63115.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term62873;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term62781, args);
        assertTrue(recursiveEquals(term62781, term63114));
        assertTrue(recursiveEquals(term62873, term63115));
        assertTrue(recursiveEquals(retValue, null));
    }

};


