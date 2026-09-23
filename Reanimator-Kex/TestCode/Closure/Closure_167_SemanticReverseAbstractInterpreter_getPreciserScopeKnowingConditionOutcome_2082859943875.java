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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274413;
     Object term274505;
     Object term274751;
     Object term274752;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274413 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term274505 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term274597 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term274689 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term274505, term274505.getClass(), "type", 13);
        setIntField(term274597, term274597.getClass(), "type", -14);
        setField(term274505, term274505.getClass(), "first", term274597);
        setIntField(term274689, term274689.getClass(), "type", 13);
        setField(term274505, term274505.getClass(), "last", term274689);
        term274751 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term274751, term274751.getClass(), "INEQ", null);
        setField(term274751, term274751.getClass(), "convention", null);
        setField(term274751, term274751.getClass(), "typeRegistry", null);
        setField(term274751, term274751.getClass(), "firstLink", null);
        setField(term274751, term274751.getClass(), "nextLink", null);
        setField(term274751, term274751.getClass(), "restrictUndefinedVisitor", null);
        setField(term274751, term274751.getClass(), "restrictNullVisitor", null);
        term274752 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term274753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term274754 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term274752, term274752.getClass(), "str", null);
        setIntField(term274752, term274752.getClass(), "type", 13);
        setField(term274752, term274752.getClass(), "next", null);
        setDoubleField(term274753, term274753.getClass(), "number", 0.0);
        setIntField(term274753, term274753.getClass(), "type", -14);
        setField(term274753, term274753.getClass(), "next", null);
        setField(term274753, term274753.getClass(), "first", null);
        setField(term274753, term274753.getClass(), "last", null);
        setField(term274753, term274753.getClass(), "propListHead", null);
        setIntField(term274753, term274753.getClass(), "sourcePosition", 0);
        setField(term274753, term274753.getClass(), "jsType", null);
        setField(term274753, term274753.getClass(), "parent", null);
        setField(term274752, term274752.getClass(), "first", term274753);
        setField(term274754, term274754.getClass(), "str", null);
        setIntField(term274754, term274754.getClass(), "type", 13);
        setField(term274754, term274754.getClass(), "next", null);
        setField(term274754, term274754.getClass(), "first", null);
        setField(term274754, term274754.getClass(), "last", null);
        setField(term274754, term274754.getClass(), "propListHead", null);
        setIntField(term274754, term274754.getClass(), "sourcePosition", 0);
        setField(term274754, term274754.getClass(), "jsType", null);
        setField(term274754, term274754.getClass(), "parent", null);
        setField(term274752, term274752.getClass(), "last", term274754);
        setField(term274752, term274752.getClass(), "propListHead", null);
        setIntField(term274752, term274752.getClass(), "sourcePosition", 0);
        setField(term274752, term274752.getClass(), "jsType", null);
        setField(term274752, term274752.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term274505;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term274413, args);
        assertTrue(recursiveEquals(term274413, term274751));
        assertTrue(recursiveEquals(term274505, term274752));
        assertTrue(recursiveEquals(retValue, null));
    }

};


