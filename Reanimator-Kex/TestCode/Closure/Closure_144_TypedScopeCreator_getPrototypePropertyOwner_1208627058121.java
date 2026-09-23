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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58220;
     Object term58340;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58220 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term58312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term58220, term58220.getClass(), "type", 33);
        setField(term58220, term58220.getClass(), "first", term58312);
        term58340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term58341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term58340, term58340.getClass(), "functionName", null);
        setBooleanField(term58340, term58340.getClass(), "itsNeedsActivation", false);
        setIntField(term58340, term58340.getClass(), "itsFunctionType", 0);
        setBooleanField(term58340, term58340.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58340, term58340.getClass(), "encodedSourceStart", 0);
        setIntField(term58340, term58340.getClass(), "encodedSourceEnd", 0);
        setField(term58340, term58340.getClass(), "sourceName", null);
        setIntField(term58340, term58340.getClass(), "baseLineno", 0);
        setIntField(term58340, term58340.getClass(), "endLineno", 0);
        setField(term58340, term58340.getClass(), "functions", null);
        setField(term58340, term58340.getClass(), "regexps", null);
        setField(term58340, term58340.getClass(), "itsVariables", null);
        setField(term58340, term58340.getClass(), "itsConst", null);
        setField(term58340, term58340.getClass(), "itsVariableNames", null);
        setIntField(term58340, term58340.getClass(), "varStart", 0);
        setField(term58340, term58340.getClass(), "compilerData", null);
        setIntField(term58340, term58340.getClass(), "type", 33);
        setField(term58340, term58340.getClass(), "next", null);
        setDoubleField(term58341, term58341.getClass(), "number", 0.0);
        setIntField(term58341, term58341.getClass(), "type", 0);
        setField(term58341, term58341.getClass(), "next", null);
        setField(term58341, term58341.getClass(), "first", null);
        setField(term58341, term58341.getClass(), "last", null);
        setField(term58341, term58341.getClass(), "propListHead", null);
        setIntField(term58341, term58341.getClass(), "sourcePosition", 0);
        setField(term58341, term58341.getClass(), "jsType", null);
        setField(term58341, term58341.getClass(), "parent", null);
        setField(term58340, term58340.getClass(), "first", term58341);
        setField(term58340, term58340.getClass(), "last", null);
        setField(term58340, term58340.getClass(), "propListHead", null);
        setIntField(term58340, term58340.getClass(), "sourcePosition", 0);
        setField(term58340, term58340.getClass(), "jsType", null);
        setField(term58340, term58340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term58220;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term58220, term58340));
        assertTrue(recursiveEquals(retValue, null));
    }

};


