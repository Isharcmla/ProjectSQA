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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178810;
     Object term178902;
     Object term179304;
     Object term179305;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178810 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term178902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178994 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term179196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term178902, term178902.getClass(), "type", 46);
        setIntField(term178994, term178994.getClass(), "type", 0);
        setField(term178994, term178994.getClass(), "jsType", term179104);
        setField(term178902, term178902.getClass(), "first", term178994);
        setIntField(term179196, term179196.getClass(), "type", 46);
        setField(term179196, term179196.getClass(), "jsType", null);
        setField(term178902, term178902.getClass(), "last", term179196);
        term179304 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term179304, term179304.getClass(), "INEQ", null);
        setField(term179304, term179304.getClass(), "convention", null);
        setField(term179304, term179304.getClass(), "typeRegistry", null);
        setField(term179304, term179304.getClass(), "firstLink", null);
        setField(term179304, term179304.getClass(), "nextLink", null);
        setField(term179304, term179304.getClass(), "restrictUndefinedVisitor", null);
        setField(term179304, term179304.getClass(), "restrictNullVisitor", null);
        term179305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term179306 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term179308 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179305, term179305.getClass(), "str", null);
        setIntField(term179305, term179305.getClass(), "type", 46);
        setField(term179305, term179305.getClass(), "next", null);
        setDoubleField(term179306, term179306.getClass(), "number", 0.0);
        setIntField(term179306, term179306.getClass(), "type", 0);
        setField(term179306, term179306.getClass(), "next", null);
        setField(term179306, term179306.getClass(), "first", null);
        setField(term179306, term179306.getClass(), "last", null);
        setField(term179306, term179306.getClass(), "propListHead", null);
        setIntField(term179306, term179306.getClass(), "sourcePosition", 0);
        setField(term179307, term179307.getClass(), "parameterType", null);
        setField(term179307, term179307.getClass(), "referencedType", null);
        setField(term179307, term179307.getClass(), "referencedObjType", null);
        setBooleanField(term179307, term179307.getClass(), "visited", false);
        setField(term179307, term179307.getClass(), "docInfo", null);
        setBooleanField(term179307, term179307.getClass(), "unknown", false);
        setBooleanField(term179307, term179307.getClass(), "resolved", false);
        setField(term179307, term179307.getClass(), "resolveResult", null);
        setBooleanField(term179307, term179307.getClass(), "inTemplatedCheckVisit", false);
        setField(term179307, term179307.getClass(), "registry", null);
        setField(term179306, term179306.getClass(), "jsType", term179307);
        setField(term179306, term179306.getClass(), "parent", null);
        setField(term179305, term179305.getClass(), "first", term179306);
        setField(term179308, term179308.getClass(), "str", null);
        setIntField(term179308, term179308.getClass(), "type", 46);
        setField(term179308, term179308.getClass(), "next", null);
        setField(term179308, term179308.getClass(), "first", null);
        setField(term179308, term179308.getClass(), "last", null);
        setField(term179308, term179308.getClass(), "propListHead", null);
        setIntField(term179308, term179308.getClass(), "sourcePosition", 0);
        setField(term179308, term179308.getClass(), "jsType", null);
        setField(term179308, term179308.getClass(), "parent", null);
        setField(term179305, term179305.getClass(), "last", term179308);
        setField(term179305, term179305.getClass(), "propListHead", null);
        setIntField(term179305, term179305.getClass(), "sourcePosition", 0);
        setField(term179305, term179305.getClass(), "jsType", null);
        setField(term179305, term179305.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term178902;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term178810, args);
        assertTrue(recursiveEquals(term178810, term179304));
        assertTrue(recursiveEquals(term178902, term179305));
        assertTrue(recursiveEquals(retValue, null));
    }

};


