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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211636;
     Object term211728;
     Object term212208;
     Object term212209;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211636 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term211728 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211912 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term212096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term211728, term211728.getClass(), "type", 111);
        setIntField(term211912, term211912.getClass(), "type", 0);
        setField(term211912, term211912.getClass(), "jsType", term212004);
        setField(term211820, term211820.getClass(), "first", term211912);
        setField(term211728, term211728.getClass(), "parent", term211820);
        setIntField(term212096, term212096.getClass(), "type", 111);
        setField(term212096, term212096.getClass(), "jsType", null);
        setField(term211728, term211728.getClass(), "first", term212096);
        term212208 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term212208, term212208.getClass(), "INEQ", null);
        setField(term212208, term212208.getClass(), "convention", null);
        setField(term212208, term212208.getClass(), "typeRegistry", null);
        setField(term212208, term212208.getClass(), "firstLink", null);
        setField(term212208, term212208.getClass(), "nextLink", null);
        setField(term212208, term212208.getClass(), "restrictUndefinedVisitor", null);
        setField(term212208, term212208.getClass(), "restrictNullVisitor", null);
        term212209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212210 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212212 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setField(term212209, term212209.getClass(), "str", null);
        setIntField(term212209, term212209.getClass(), "type", 111);
        setField(term212209, term212209.getClass(), "next", null);
        setField(term212210, term212210.getClass(), "str", null);
        setIntField(term212210, term212210.getClass(), "type", 111);
        setField(term212210, term212210.getClass(), "next", null);
        setField(term212210, term212210.getClass(), "first", null);
        setField(term212210, term212210.getClass(), "last", null);
        setField(term212210, term212210.getClass(), "propListHead", null);
        setIntField(term212210, term212210.getClass(), "sourcePosition", 0);
        setField(term212210, term212210.getClass(), "jsType", null);
        setField(term212210, term212210.getClass(), "parent", null);
        setField(term212209, term212209.getClass(), "first", term212210);
        setField(term212209, term212209.getClass(), "last", null);
        setField(term212209, term212209.getClass(), "propListHead", null);
        setIntField(term212209, term212209.getClass(), "sourcePosition", 0);
        setField(term212209, term212209.getClass(), "jsType", null);
        setField(term212211, term212211.getClass(), "str", null);
        setIntField(term212211, term212211.getClass(), "type", 0);
        setField(term212211, term212211.getClass(), "next", null);
        setField(term212212, term212212.getClass(), "str", null);
        setIntField(term212212, term212212.getClass(), "type", 0);
        setField(term212212, term212212.getClass(), "next", null);
        setField(term212212, term212212.getClass(), "first", null);
        setField(term212212, term212212.getClass(), "last", null);
        setField(term212212, term212212.getClass(), "propListHead", null);
        setIntField(term212212, term212212.getClass(), "sourcePosition", 0);
        setBooleanField(term212213, term212213.getClass(), "resolved", false);
        setField(term212213, term212213.getClass(), "resolveResult", null);
        setBooleanField(term212213, term212213.getClass(), "inTemplatedCheckVisit", false);
        setField(term212213, term212213.getClass(), "registry", null);
        setField(term212212, term212212.getClass(), "jsType", term212213);
        setField(term212212, term212212.getClass(), "parent", null);
        setField(term212211, term212211.getClass(), "first", term212212);
        setField(term212211, term212211.getClass(), "last", null);
        setField(term212211, term212211.getClass(), "propListHead", null);
        setIntField(term212211, term212211.getClass(), "sourcePosition", 0);
        setField(term212211, term212211.getClass(), "jsType", null);
        setField(term212211, term212211.getClass(), "parent", null);
        setField(term212209, term212209.getClass(), "parent", term212211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term211728;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term211636, args);
        assertTrue(recursiveEquals(term211636, term212208));
        assertTrue(recursiveEquals(term211728, term212209));
        assertTrue(recursiveEquals(retValue, null));
    }

};


