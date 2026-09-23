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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112474;
     Object term112566;
     Object term112813;
     Object term112814;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112474 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term112566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term112658 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term112750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term112566, term112566.getClass(), "type", 13);
        setIntField(term112658, term112658.getClass(), "type", -14);
        setField(term112566, term112566.getClass(), "first", term112658);
        setIntField(term112750, term112750.getClass(), "type", 13);
        setField(term112566, term112566.getClass(), "last", term112750);
        term112813 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term112813, term112813.getClass(), "INEQ", null);
        setField(term112813, term112813.getClass(), "convention", null);
        setField(term112813, term112813.getClass(), "typeRegistry", null);
        setField(term112813, term112813.getClass(), "firstLink", null);
        setField(term112813, term112813.getClass(), "nextLink", null);
        setField(term112813, term112813.getClass(), "restrictUndefinedVisitor", null);
        setField(term112813, term112813.getClass(), "restrictNullVisitor", null);
        term112814 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term112815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term112816 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term112814, term112814.getClass(), "number", 0.0);
        setIntField(term112814, term112814.getClass(), "type", 13);
        setField(term112814, term112814.getClass(), "next", null);
        setDoubleField(term112815, term112815.getClass(), "number", 0.0);
        setIntField(term112815, term112815.getClass(), "type", -14);
        setField(term112815, term112815.getClass(), "next", null);
        setField(term112815, term112815.getClass(), "first", null);
        setField(term112815, term112815.getClass(), "last", null);
        setField(term112815, term112815.getClass(), "propListHead", null);
        setIntField(term112815, term112815.getClass(), "sourcePosition", 0);
        setField(term112815, term112815.getClass(), "jsType", null);
        setField(term112815, term112815.getClass(), "parent", null);
        setField(term112814, term112814.getClass(), "first", term112815);
        setField(term112816, term112816.getClass(), "str", null);
        setIntField(term112816, term112816.getClass(), "type", 13);
        setField(term112816, term112816.getClass(), "next", null);
        setField(term112816, term112816.getClass(), "first", null);
        setField(term112816, term112816.getClass(), "last", null);
        setField(term112816, term112816.getClass(), "propListHead", null);
        setIntField(term112816, term112816.getClass(), "sourcePosition", 0);
        setField(term112816, term112816.getClass(), "jsType", null);
        setField(term112816, term112816.getClass(), "parent", null);
        setField(term112814, term112814.getClass(), "last", term112816);
        setField(term112814, term112814.getClass(), "propListHead", null);
        setIntField(term112814, term112814.getClass(), "sourcePosition", 0);
        setField(term112814, term112814.getClass(), "jsType", null);
        setField(term112814, term112814.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term112566;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term112474, args);
        assertTrue(recursiveEquals(term112474, term112813));
        assertTrue(recursiveEquals(term112566, term112814));
        assertTrue(recursiveEquals(retValue, null));
    }

};


