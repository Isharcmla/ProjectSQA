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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255092;
     Object term255184;
     Object term255786;
     Object term255787;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255092 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term255184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255276 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term255366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term255458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term255184, term255184.getClass(), "type", 46);
        setIntField(term255276, term255276.getClass(), "type", 0);
        setField(term255276, term255276.getClass(), "jsType", term255366);
        setField(term255184, term255184.getClass(), "first", term255276);
        setIntField(term255458, term255458.getClass(), "type", 46);
        setField(term255458, term255458.getClass(), "jsType", term255546);
        setField(term255184, term255184.getClass(), "last", term255458);
        term255786 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term255786, term255786.getClass(), "INEQ", null);
        setField(term255786, term255786.getClass(), "convention", null);
        setField(term255786, term255786.getClass(), "typeRegistry", null);
        setField(term255786, term255786.getClass(), "firstLink", null);
        setField(term255786, term255786.getClass(), "nextLink", null);
        setField(term255786, term255786.getClass(), "restrictUndefinedVisitor", null);
        setField(term255786, term255786.getClass(), "restrictNullVisitor", null);
        term255787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255788 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term255789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term255790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term255787, term255787.getClass(), "str", null);
        setIntField(term255787, term255787.getClass(), "type", 46);
        setField(term255787, term255787.getClass(), "next", null);
        setDoubleField(term255788, term255788.getClass(), "number", 0.0);
        setIntField(term255788, term255788.getClass(), "type", 0);
        setField(term255788, term255788.getClass(), "next", null);
        setField(term255788, term255788.getClass(), "first", null);
        setField(term255788, term255788.getClass(), "last", null);
        setField(term255788, term255788.getClass(), "propListHead", null);
        setIntField(term255788, term255788.getClass(), "sourcePosition", 0);
        setBooleanField(term255789, term255789.getClass(), "resolved", false);
        setField(term255789, term255789.getClass(), "resolveResult", null);
        setBooleanField(term255789, term255789.getClass(), "inTemplatedCheckVisit", false);
        setField(term255789, term255789.getClass(), "registry", null);
        setField(term255788, term255788.getClass(), "jsType", term255789);
        setField(term255788, term255788.getClass(), "parent", null);
        setField(term255787, term255787.getClass(), "first", term255788);
        setField(term255790, term255790.getClass(), "str", null);
        setIntField(term255790, term255790.getClass(), "type", 46);
        setField(term255790, term255790.getClass(), "next", null);
        setField(term255790, term255790.getClass(), "first", null);
        setField(term255790, term255790.getClass(), "last", null);
        setField(term255790, term255790.getClass(), "propListHead", null);
        setIntField(term255790, term255790.getClass(), "sourcePosition", 0);
        setField(term255791, term255791.getClass(), "call", null);
        setField(term255791, term255791.getClass(), "prototypeSlot", null);
        setField(term255791, term255791.getClass(), "kind", null);
        setField(term255791, term255791.getClass(), "typeOfThis", null);
        setField(term255791, term255791.getClass(), "source", null);
        setField(term255791, term255791.getClass(), "implementedInterfaces", null);
        setField(term255791, term255791.getClass(), "extendedInterfaces", null);
        setField(term255791, term255791.getClass(), "subTypes", null);
        setField(term255791, term255791.getClass(), "templateTypeNames", null);
        setField(term255791, term255791.getClass(), "className", null);
        setField(term255791, term255791.getClass(), "properties", null);
        setBooleanField(term255791, term255791.getClass(), "nativeType", false);
        setField(term255791, term255791.getClass(), "implicitPrototypeFallback", null);
        setField(term255791, term255791.getClass(), "ownerFunction", null);
        setBooleanField(term255791, term255791.getClass(), "prettyPrint", false);
        setBooleanField(term255791, term255791.getClass(), "visited", false);
        setField(term255791, term255791.getClass(), "docInfo", null);
        setBooleanField(term255791, term255791.getClass(), "unknown", false);
        setBooleanField(term255791, term255791.getClass(), "resolved", false);
        setField(term255791, term255791.getClass(), "resolveResult", null);
        setBooleanField(term255791, term255791.getClass(), "inTemplatedCheckVisit", false);
        setField(term255791, term255791.getClass(), "registry", null);
        setField(term255790, term255790.getClass(), "jsType", term255791);
        setField(term255790, term255790.getClass(), "parent", null);
        setField(term255787, term255787.getClass(), "last", term255790);
        setField(term255787, term255787.getClass(), "propListHead", null);
        setIntField(term255787, term255787.getClass(), "sourcePosition", 0);
        setField(term255787, term255787.getClass(), "jsType", null);
        setField(term255787, term255787.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term255184;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term255092, args);
        assertTrue(recursiveEquals(term255092, term255786));
        assertTrue(recursiveEquals(term255184, term255787));
        assertTrue(recursiveEquals(retValue, null));
    }

};


