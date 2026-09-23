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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27833;
     Object term27925;
     Object term28166;
     Object term28167;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27833 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term27925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28109 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term27925, term27925.getClass(), "type", 45);
        setIntField(term28017, term28017.getClass(), "type", 45);
        setField(term27925, term27925.getClass(), "first", term28017);
        setField(term27925, term27925.getClass(), "last", term28109);
        term28166 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term28166, term28166.getClass(), "INEQ", null);
        setField(term28166, term28166.getClass(), "convention", null);
        setField(term28166, term28166.getClass(), "typeRegistry", null);
        setField(term28166, term28166.getClass(), "firstLink", null);
        setField(term28166, term28166.getClass(), "nextLink", null);
        setField(term28166, term28166.getClass(), "restrictUndefinedVisitor", null);
        setField(term28166, term28166.getClass(), "restrictNullVisitor", null);
        term28167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term28167, term28167.getClass(), "str", null);
        setIntField(term28167, term28167.getClass(), "type", 45);
        setField(term28167, term28167.getClass(), "next", null);
        setField(term28168, term28168.getClass(), "str", null);
        setIntField(term28168, term28168.getClass(), "type", 45);
        setField(term28168, term28168.getClass(), "next", null);
        setField(term28168, term28168.getClass(), "first", null);
        setField(term28168, term28168.getClass(), "last", null);
        setField(term28168, term28168.getClass(), "propListHead", null);
        setIntField(term28168, term28168.getClass(), "sourcePosition", 0);
        setField(term28168, term28168.getClass(), "jsType", null);
        setField(term28168, term28168.getClass(), "parent", null);
        setField(term28167, term28167.getClass(), "first", term28168);
        setField(term28169, term28169.getClass(), "str", null);
        setIntField(term28169, term28169.getClass(), "type", 0);
        setField(term28169, term28169.getClass(), "next", null);
        setField(term28169, term28169.getClass(), "first", null);
        setField(term28169, term28169.getClass(), "last", null);
        setField(term28169, term28169.getClass(), "propListHead", null);
        setIntField(term28169, term28169.getClass(), "sourcePosition", 0);
        setField(term28169, term28169.getClass(), "jsType", null);
        setField(term28169, term28169.getClass(), "parent", null);
        setField(term28167, term28167.getClass(), "last", term28169);
        setField(term28167, term28167.getClass(), "propListHead", null);
        setIntField(term28167, term28167.getClass(), "sourcePosition", 0);
        setField(term28167, term28167.getClass(), "jsType", null);
        setField(term28167, term28167.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term27925;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term27833, args);
        assertTrue(recursiveEquals(term27833, term28166));
        assertTrue(recursiveEquals(term27925, term28167));
        assertTrue(recursiveEquals(retValue, null));
    }

};


