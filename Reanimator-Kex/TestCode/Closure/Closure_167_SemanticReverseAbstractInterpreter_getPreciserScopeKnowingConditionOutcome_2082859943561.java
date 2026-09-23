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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156546;
     Object term156638;
     Object term156889;
     Object term156890;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156546 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term156638 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156730 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term156638, term156638.getClass(), "type", 13);
        setIntField(term156730, term156730.getClass(), "type", 0);
        setField(term156638, term156638.getClass(), "first", term156730);
        setField(term156638, term156638.getClass(), "last", term156822);
        term156889 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term156889, term156889.getClass(), "INEQ", null);
        setField(term156889, term156889.getClass(), "convention", null);
        setField(term156889, term156889.getClass(), "typeRegistry", null);
        setField(term156889, term156889.getClass(), "firstLink", null);
        setField(term156889, term156889.getClass(), "nextLink", null);
        setField(term156889, term156889.getClass(), "restrictUndefinedVisitor", null);
        setField(term156889, term156889.getClass(), "restrictNullVisitor", null);
        term156890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term156890, term156890.getClass(), "str", null);
        setIntField(term156890, term156890.getClass(), "type", 13);
        setField(term156890, term156890.getClass(), "next", null);
        setDoubleField(term156891, term156891.getClass(), "number", 0.0);
        setIntField(term156891, term156891.getClass(), "type", 0);
        setField(term156891, term156891.getClass(), "next", null);
        setField(term156891, term156891.getClass(), "first", null);
        setField(term156891, term156891.getClass(), "last", null);
        setField(term156891, term156891.getClass(), "propListHead", null);
        setIntField(term156891, term156891.getClass(), "sourcePosition", 0);
        setField(term156891, term156891.getClass(), "jsType", null);
        setField(term156891, term156891.getClass(), "parent", null);
        setField(term156890, term156890.getClass(), "first", term156891);
        setDoubleField(term156892, term156892.getClass(), "number", 0.0);
        setIntField(term156892, term156892.getClass(), "type", 0);
        setField(term156892, term156892.getClass(), "next", null);
        setField(term156892, term156892.getClass(), "first", null);
        setField(term156892, term156892.getClass(), "last", null);
        setField(term156892, term156892.getClass(), "propListHead", null);
        setIntField(term156892, term156892.getClass(), "sourcePosition", 0);
        setField(term156892, term156892.getClass(), "jsType", null);
        setField(term156892, term156892.getClass(), "parent", null);
        setField(term156890, term156890.getClass(), "last", term156892);
        setField(term156890, term156890.getClass(), "propListHead", null);
        setIntField(term156890, term156890.getClass(), "sourcePosition", 0);
        setField(term156890, term156890.getClass(), "jsType", null);
        setField(term156890, term156890.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term156638;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term156546, args);
        assertTrue(recursiveEquals(term156546, term156889));
        assertTrue(recursiveEquals(term156638, term156890));
        assertTrue(recursiveEquals(retValue, null));
    }

};


