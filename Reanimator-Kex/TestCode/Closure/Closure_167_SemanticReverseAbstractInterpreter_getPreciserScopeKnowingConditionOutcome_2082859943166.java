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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37011;
     Object term37103;
     Object term38189;
     Object term38190;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37011 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term37103 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term37195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term37287 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term37103, term37103.getClass(), "type", 45);
        setIntField(term37195, term37195.getClass(), "type", 45);
        setField(term37103, term37103.getClass(), "first", term37195);
        setField(term37103, term37103.getClass(), "last", term37287);
        term38189 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term38189, term38189.getClass(), "INEQ", null);
        setField(term38189, term38189.getClass(), "convention", null);
        setField(term38189, term38189.getClass(), "typeRegistry", null);
        setField(term38189, term38189.getClass(), "firstLink", null);
        setField(term38189, term38189.getClass(), "nextLink", null);
        setField(term38189, term38189.getClass(), "restrictUndefinedVisitor", null);
        setField(term38189, term38189.getClass(), "restrictNullVisitor", null);
        term38190 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term38191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term38192 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term38190, term38190.getClass(), "str", null);
        setIntField(term38190, term38190.getClass(), "type", 45);
        setField(term38190, term38190.getClass(), "next", null);
        setField(term38191, term38191.getClass(), "str", null);
        setIntField(term38191, term38191.getClass(), "type", 45);
        setField(term38191, term38191.getClass(), "next", null);
        setField(term38191, term38191.getClass(), "first", null);
        setField(term38191, term38191.getClass(), "last", null);
        setField(term38191, term38191.getClass(), "propListHead", null);
        setIntField(term38191, term38191.getClass(), "sourcePosition", 0);
        setField(term38191, term38191.getClass(), "jsType", null);
        setField(term38191, term38191.getClass(), "parent", null);
        setField(term38190, term38190.getClass(), "first", term38191);
        setDoubleField(term38192, term38192.getClass(), "number", 0.0);
        setIntField(term38192, term38192.getClass(), "type", 0);
        setField(term38192, term38192.getClass(), "next", null);
        setField(term38192, term38192.getClass(), "first", null);
        setField(term38192, term38192.getClass(), "last", null);
        setField(term38192, term38192.getClass(), "propListHead", null);
        setIntField(term38192, term38192.getClass(), "sourcePosition", 0);
        setField(term38192, term38192.getClass(), "jsType", null);
        setField(term38192, term38192.getClass(), "parent", null);
        setField(term38190, term38190.getClass(), "last", term38192);
        setField(term38190, term38190.getClass(), "propListHead", null);
        setIntField(term38190, term38190.getClass(), "sourcePosition", 0);
        setField(term38190, term38190.getClass(), "jsType", null);
        setField(term38190, term38190.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term37103;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term37011, args);
        assertTrue(recursiveEquals(term37011, term38189));
        assertTrue(recursiveEquals(term37103, term38190));
        assertTrue(recursiveEquals(retValue, null));
    }

};


