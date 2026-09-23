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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162953;
     Object term163045;
     Object term164192;
     Object term164193;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162953 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term163045 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term163137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term163233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term163325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term163045, term163045.getClass(), "type", 45);
        setIntField(term163137, term163137.getClass(), "type", 0);
        setField(term163137, term163137.getClass(), "jsType", term163233);
        setField(term163045, term163045.getClass(), "first", term163137);
        setIntField(term163325, term163325.getClass(), "type", 0);
        setField(term163325, term163325.getClass(), "jsType", null);
        setField(term163045, term163045.getClass(), "last", term163325);
        term164192 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term164192, term164192.getClass(), "INEQ", null);
        setField(term164192, term164192.getClass(), "convention", null);
        setField(term164192, term164192.getClass(), "typeRegistry", null);
        setField(term164192, term164192.getClass(), "firstLink", null);
        setField(term164192, term164192.getClass(), "nextLink", null);
        setField(term164192, term164192.getClass(), "restrictUndefinedVisitor", null);
        setField(term164192, term164192.getClass(), "restrictNullVisitor", null);
        term164193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term164194 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term164195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term164196 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term164193, term164193.getClass(), "str", null);
        setIntField(term164193, term164193.getClass(), "type", 45);
        setField(term164193, term164193.getClass(), "next", null);
        setField(term164194, term164194.getClass(), "str", null);
        setIntField(term164194, term164194.getClass(), "type", 0);
        setField(term164194, term164194.getClass(), "next", null);
        setField(term164194, term164194.getClass(), "first", null);
        setField(term164194, term164194.getClass(), "last", null);
        setField(term164194, term164194.getClass(), "propListHead", null);
        setIntField(term164194, term164194.getClass(), "sourcePosition", 0);
        setBooleanField(term164195, term164195.getClass(), "resolved", false);
        setField(term164195, term164195.getClass(), "resolveResult", null);
        setBooleanField(term164195, term164195.getClass(), "inTemplatedCheckVisit", false);
        setField(term164195, term164195.getClass(), "registry", null);
        setField(term164194, term164194.getClass(), "jsType", term164195);
        setField(term164194, term164194.getClass(), "parent", null);
        setField(term164193, term164193.getClass(), "first", term164194);
        setDoubleField(term164196, term164196.getClass(), "number", 0.0);
        setIntField(term164196, term164196.getClass(), "type", 0);
        setField(term164196, term164196.getClass(), "next", null);
        setField(term164196, term164196.getClass(), "first", null);
        setField(term164196, term164196.getClass(), "last", null);
        setField(term164196, term164196.getClass(), "propListHead", null);
        setIntField(term164196, term164196.getClass(), "sourcePosition", 0);
        setField(term164196, term164196.getClass(), "jsType", null);
        setField(term164196, term164196.getClass(), "parent", null);
        setField(term164193, term164193.getClass(), "last", term164196);
        setField(term164193, term164193.getClass(), "propListHead", null);
        setIntField(term164193, term164193.getClass(), "sourcePosition", 0);
        setField(term164193, term164193.getClass(), "jsType", null);
        setField(term164193, term164193.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term163045;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term162953, args);
        assertTrue(recursiveEquals(term162953, term164192));
        assertTrue(recursiveEquals(term163045, term164193));
        assertTrue(recursiveEquals(retValue, null));
    }

};


