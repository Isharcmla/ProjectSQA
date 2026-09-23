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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242793;
     Object term242863;
     Object term243316;
     Object term243317;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242793 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term242863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term243171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term242863, term242863.getClass(), "type", 111);
        setIntField(term243003, term243003.getClass(), "type", 111);
        setField(term243003, term243003.getClass(), "jsType", term243101);
        setField(term242933, term242933.getClass(), "first", term243003);
        setField(term242863, term242863.getClass(), "parent", term242933);
        setIntField(term243171, term243171.getClass(), "type", 111);
        setField(term243171, term243171.getClass(), "jsType", null);
        setField(term242863, term242863.getClass(), "first", term243171);
        term243316 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term243316, term243316.getClass(), "INEQ", null);
        setField(term243316, term243316.getClass(), "convention", null);
        setField(term243316, term243316.getClass(), "typeRegistry", null);
        setField(term243316, term243316.getClass(), "firstLink", null);
        setField(term243316, term243316.getClass(), "nextLink", null);
        setField(term243316, term243316.getClass(), "restrictUndefinedVisitor", null);
        setField(term243316, term243316.getClass(), "restrictNullVisitor", null);
        term243317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term243317, term243317.getClass(), "type", 111);
        setField(term243317, term243317.getClass(), "next", null);
        setIntField(term243318, term243318.getClass(), "type", 111);
        setField(term243318, term243318.getClass(), "next", null);
        setField(term243318, term243318.getClass(), "first", null);
        setField(term243318, term243318.getClass(), "last", null);
        setField(term243318, term243318.getClass(), "propListHead", null);
        setIntField(term243318, term243318.getClass(), "sourcePosition", 0);
        setField(term243318, term243318.getClass(), "jsType", null);
        setField(term243318, term243318.getClass(), "parent", null);
        setField(term243317, term243317.getClass(), "first", term243318);
        setField(term243317, term243317.getClass(), "last", null);
        setField(term243317, term243317.getClass(), "propListHead", null);
        setIntField(term243317, term243317.getClass(), "sourcePosition", 0);
        setField(term243317, term243317.getClass(), "jsType", null);
        setIntField(term243319, term243319.getClass(), "type", 0);
        setField(term243319, term243319.getClass(), "next", null);
        setIntField(term243320, term243320.getClass(), "type", 111);
        setField(term243320, term243320.getClass(), "next", null);
        setField(term243320, term243320.getClass(), "first", null);
        setField(term243320, term243320.getClass(), "last", null);
        setField(term243320, term243320.getClass(), "propListHead", null);
        setIntField(term243320, term243320.getClass(), "sourcePosition", 0);
        setBooleanField(term243321, term243321.getClass(), "isChecked", false);
        setBooleanField(term243321, term243321.getClass(), "visited", false);
        setField(term243321, term243321.getClass(), "docInfo", null);
        setBooleanField(term243321, term243321.getClass(), "unknown", false);
        setBooleanField(term243321, term243321.getClass(), "resolved", false);
        setField(term243321, term243321.getClass(), "resolveResult", null);
        setBooleanField(term243321, term243321.getClass(), "inTemplatedCheckVisit", false);
        setField(term243321, term243321.getClass(), "registry", null);
        setField(term243320, term243320.getClass(), "jsType", term243321);
        setField(term243320, term243320.getClass(), "parent", null);
        setField(term243319, term243319.getClass(), "first", term243320);
        setField(term243319, term243319.getClass(), "last", null);
        setField(term243319, term243319.getClass(), "propListHead", null);
        setIntField(term243319, term243319.getClass(), "sourcePosition", 0);
        setField(term243319, term243319.getClass(), "jsType", null);
        setField(term243319, term243319.getClass(), "parent", null);
        setField(term243317, term243317.getClass(), "parent", term243319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term242863;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term242793, args);
        assertTrue(recursiveEquals(term242793, term243316));
        assertTrue(recursiveEquals(term242863, term243317));
        assertTrue(recursiveEquals(retValue, null));
    }

};


