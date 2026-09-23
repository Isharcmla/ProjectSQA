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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32077;
     Object term32169;
     Object term32393;
     Object term32394;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32077 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term32169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term32261 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32169, term32169.getClass(), "type", 45);
        setIntField(term32261, term32261.getClass(), "type", 0);
        setField(term32169, term32169.getClass(), "first", term32261);
        setField(term32169, term32169.getClass(), "last", term32331);
        term32393 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term32393, term32393.getClass(), "INEQ", null);
        setField(term32393, term32393.getClass(), "convention", null);
        setField(term32393, term32393.getClass(), "typeRegistry", null);
        setField(term32393, term32393.getClass(), "firstLink", null);
        setField(term32393, term32393.getClass(), "nextLink", null);
        setField(term32393, term32393.getClass(), "restrictUndefinedVisitor", null);
        setField(term32393, term32393.getClass(), "restrictNullVisitor", null);
        term32394 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term32395 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32394, term32394.getClass(), "str", null);
        setIntField(term32394, term32394.getClass(), "type", 45);
        setField(term32394, term32394.getClass(), "next", null);
        setDoubleField(term32395, term32395.getClass(), "number", 0.0);
        setIntField(term32395, term32395.getClass(), "type", 0);
        setField(term32395, term32395.getClass(), "next", null);
        setField(term32395, term32395.getClass(), "first", null);
        setField(term32395, term32395.getClass(), "last", null);
        setField(term32395, term32395.getClass(), "propListHead", null);
        setIntField(term32395, term32395.getClass(), "sourcePosition", 0);
        setField(term32395, term32395.getClass(), "jsType", null);
        setField(term32395, term32395.getClass(), "parent", null);
        setField(term32394, term32394.getClass(), "first", term32395);
        setIntField(term32396, term32396.getClass(), "type", 0);
        setField(term32396, term32396.getClass(), "next", null);
        setField(term32396, term32396.getClass(), "first", null);
        setField(term32396, term32396.getClass(), "last", null);
        setField(term32396, term32396.getClass(), "propListHead", null);
        setIntField(term32396, term32396.getClass(), "sourcePosition", 0);
        setField(term32396, term32396.getClass(), "jsType", null);
        setField(term32396, term32396.getClass(), "parent", null);
        setField(term32394, term32394.getClass(), "last", term32396);
        setField(term32394, term32394.getClass(), "propListHead", null);
        setIntField(term32394, term32394.getClass(), "sourcePosition", 0);
        setField(term32394, term32394.getClass(), "jsType", null);
        setField(term32394, term32394.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term32169;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term32077, args);
        assertTrue(recursiveEquals(term32077, term32393));
        assertTrue(recursiveEquals(term32169, term32394));
        assertTrue(recursiveEquals(retValue, null));
    }

};


