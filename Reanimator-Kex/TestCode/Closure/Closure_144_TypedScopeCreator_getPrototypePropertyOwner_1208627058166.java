package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168342;
     Object term169279;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168342 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168428 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term168650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term168342, term168342.getClass(), "type", 33);
        setIntField(term168428, term168428.getClass(), "type", 33);
        setField(term168520, term168520.getClass(), "str", "prototype");
        setField(term168428, term168428.getClass(), "last", term168520);
        setField(term168428, term168428.getClass(), "first", term168650);
        setField(term168342, term168342.getClass(), "first", term168428);
        term169279 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169282 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term169279, term169279.getClass(), "functionName", null);
        setBooleanField(term169279, term169279.getClass(), "itsNeedsActivation", false);
        setIntField(term169279, term169279.getClass(), "itsFunctionType", 0);
        setBooleanField(term169279, term169279.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169279, term169279.getClass(), "encodedSourceStart", 0);
        setIntField(term169279, term169279.getClass(), "encodedSourceEnd", 0);
        setField(term169279, term169279.getClass(), "sourceName", null);
        setIntField(term169279, term169279.getClass(), "baseLineno", 0);
        setIntField(term169279, term169279.getClass(), "endLineno", 0);
        setField(term169279, term169279.getClass(), "functions", null);
        setField(term169279, term169279.getClass(), "regexps", null);
        setField(term169279, term169279.getClass(), "itsVariables", null);
        setField(term169279, term169279.getClass(), "itsConst", null);
        setField(term169279, term169279.getClass(), "itsVariableNames", null);
        setIntField(term169279, term169279.getClass(), "varStart", 0);
        setField(term169279, term169279.getClass(), "compilerData", null);
        setIntField(term169279, term169279.getClass(), "type", 33);
        setField(term169279, term169279.getClass(), "next", null);
        setField(term169280, term169280.getClass(), "functionName", null);
        setBooleanField(term169280, term169280.getClass(), "itsNeedsActivation", false);
        setIntField(term169280, term169280.getClass(), "itsFunctionType", 0);
        setBooleanField(term169280, term169280.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169280, term169280.getClass(), "encodedSourceStart", 0);
        setIntField(term169280, term169280.getClass(), "encodedSourceEnd", 0);
        setField(term169280, term169280.getClass(), "sourceName", null);
        setIntField(term169280, term169280.getClass(), "baseLineno", 0);
        setIntField(term169280, term169280.getClass(), "endLineno", 0);
        setField(term169280, term169280.getClass(), "functions", null);
        setField(term169280, term169280.getClass(), "regexps", null);
        setField(term169280, term169280.getClass(), "itsVariables", null);
        setField(term169280, term169280.getClass(), "itsConst", null);
        setField(term169280, term169280.getClass(), "itsVariableNames", null);
        setIntField(term169280, term169280.getClass(), "varStart", 0);
        setField(term169280, term169280.getClass(), "compilerData", null);
        setIntField(term169280, term169280.getClass(), "type", 33);
        setField(term169280, term169280.getClass(), "next", null);
        setField(term169281, term169281.getClass(), "str", null);
        setIntField(term169281, term169281.getClass(), "type", 0);
        setField(term169281, term169281.getClass(), "next", null);
        setField(term169281, term169281.getClass(), "first", null);
        setField(term169281, term169281.getClass(), "last", null);
        setField(term169281, term169281.getClass(), "propListHead", null);
        setIntField(term169281, term169281.getClass(), "sourcePosition", 0);
        setField(term169281, term169281.getClass(), "jsType", null);
        setField(term169281, term169281.getClass(), "parent", null);
        setField(term169280, term169280.getClass(), "first", term169281);
        setField(term169282, term169282.getClass(), "str", "prototype");
        setIntField(term169282, term169282.getClass(), "type", 0);
        setField(term169282, term169282.getClass(), "next", null);
        setField(term169282, term169282.getClass(), "first", null);
        setField(term169282, term169282.getClass(), "last", null);
        setField(term169282, term169282.getClass(), "propListHead", null);
        setIntField(term169282, term169282.getClass(), "sourcePosition", 0);
        setField(term169282, term169282.getClass(), "jsType", null);
        setField(term169282, term169282.getClass(), "parent", null);
        setField(term169280, term169280.getClass(), "last", term169282);
        setField(term169280, term169280.getClass(), "propListHead", null);
        setIntField(term169280, term169280.getClass(), "sourcePosition", 0);
        setField(term169280, term169280.getClass(), "jsType", null);
        setField(term169280, term169280.getClass(), "parent", null);
        setField(term169279, term169279.getClass(), "first", term169280);
        setField(term169279, term169279.getClass(), "last", null);
        setField(term169279, term169279.getClass(), "propListHead", null);
        setIntField(term169279, term169279.getClass(), "sourcePosition", 0);
        setField(term169279, term169279.getClass(), "jsType", null);
        setField(term169279, term169279.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term168342;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term168342, term169279));
        assertTrue(recursiveEquals(retValue, null));
    }

};


