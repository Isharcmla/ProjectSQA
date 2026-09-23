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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171988;
     Object term172595;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172074 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172166 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172290 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172382 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term171988, term171988.getClass(), "type", 33);
        setIntField(term172074, term172074.getClass(), "type", 33);
        setField(term172166, term172166.getClass(), "str", "prototype");
        setField(term172074, term172074.getClass(), "last", term172166);
        setIntField(term172290, term172290.getClass(), "type", 33);
        setField(term172290, term172290.getClass(), "first", term172382);
        setField(term172074, term172074.getClass(), "first", term172290);
        setField(term171988, term171988.getClass(), "first", term172074);
        term172595 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172597 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term172595, term172595.getClass(), "functionName", null);
        setBooleanField(term172595, term172595.getClass(), "itsNeedsActivation", false);
        setIntField(term172595, term172595.getClass(), "itsFunctionType", 0);
        setBooleanField(term172595, term172595.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term172595, term172595.getClass(), "encodedSourceStart", 0);
        setIntField(term172595, term172595.getClass(), "encodedSourceEnd", 0);
        setField(term172595, term172595.getClass(), "sourceName", null);
        setIntField(term172595, term172595.getClass(), "baseLineno", 0);
        setIntField(term172595, term172595.getClass(), "endLineno", 0);
        setField(term172595, term172595.getClass(), "functions", null);
        setField(term172595, term172595.getClass(), "regexps", null);
        setField(term172595, term172595.getClass(), "itsVariables", null);
        setField(term172595, term172595.getClass(), "itsConst", null);
        setField(term172595, term172595.getClass(), "itsVariableNames", null);
        setIntField(term172595, term172595.getClass(), "varStart", 0);
        setField(term172595, term172595.getClass(), "compilerData", null);
        setIntField(term172595, term172595.getClass(), "type", 33);
        setField(term172595, term172595.getClass(), "next", null);
        setField(term172596, term172596.getClass(), "functionName", null);
        setBooleanField(term172596, term172596.getClass(), "itsNeedsActivation", false);
        setIntField(term172596, term172596.getClass(), "itsFunctionType", 0);
        setBooleanField(term172596, term172596.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term172596, term172596.getClass(), "encodedSourceStart", 0);
        setIntField(term172596, term172596.getClass(), "encodedSourceEnd", 0);
        setField(term172596, term172596.getClass(), "sourceName", null);
        setIntField(term172596, term172596.getClass(), "baseLineno", 0);
        setIntField(term172596, term172596.getClass(), "endLineno", 0);
        setField(term172596, term172596.getClass(), "functions", null);
        setField(term172596, term172596.getClass(), "regexps", null);
        setField(term172596, term172596.getClass(), "itsVariables", null);
        setField(term172596, term172596.getClass(), "itsConst", null);
        setField(term172596, term172596.getClass(), "itsVariableNames", null);
        setIntField(term172596, term172596.getClass(), "varStart", 0);
        setField(term172596, term172596.getClass(), "compilerData", null);
        setIntField(term172596, term172596.getClass(), "type", 33);
        setField(term172596, term172596.getClass(), "next", null);
        setField(term172597, term172597.getClass(), "functionName", null);
        setBooleanField(term172597, term172597.getClass(), "itsNeedsActivation", false);
        setIntField(term172597, term172597.getClass(), "itsFunctionType", 0);
        setBooleanField(term172597, term172597.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term172597, term172597.getClass(), "encodedSourceStart", 0);
        setIntField(term172597, term172597.getClass(), "encodedSourceEnd", 0);
        setField(term172597, term172597.getClass(), "sourceName", null);
        setIntField(term172597, term172597.getClass(), "baseLineno", 0);
        setIntField(term172597, term172597.getClass(), "endLineno", 0);
        setField(term172597, term172597.getClass(), "functions", null);
        setField(term172597, term172597.getClass(), "regexps", null);
        setField(term172597, term172597.getClass(), "itsVariables", null);
        setField(term172597, term172597.getClass(), "itsConst", null);
        setField(term172597, term172597.getClass(), "itsVariableNames", null);
        setIntField(term172597, term172597.getClass(), "varStart", 0);
        setField(term172597, term172597.getClass(), "compilerData", null);
        setIntField(term172597, term172597.getClass(), "type", 33);
        setField(term172597, term172597.getClass(), "next", null);
        setDoubleField(term172598, term172598.getClass(), "number", 0.0);
        setIntField(term172598, term172598.getClass(), "type", 0);
        setField(term172598, term172598.getClass(), "next", null);
        setField(term172598, term172598.getClass(), "first", null);
        setField(term172598, term172598.getClass(), "last", null);
        setField(term172598, term172598.getClass(), "propListHead", null);
        setIntField(term172598, term172598.getClass(), "sourcePosition", 0);
        setField(term172598, term172598.getClass(), "jsType", null);
        setField(term172598, term172598.getClass(), "parent", null);
        setField(term172597, term172597.getClass(), "first", term172598);
        setField(term172597, term172597.getClass(), "last", null);
        setField(term172597, term172597.getClass(), "propListHead", null);
        setIntField(term172597, term172597.getClass(), "sourcePosition", 0);
        setField(term172597, term172597.getClass(), "jsType", null);
        setField(term172597, term172597.getClass(), "parent", null);
        setField(term172596, term172596.getClass(), "first", term172597);
        setField(term172599, term172599.getClass(), "str", "prototype");
        setIntField(term172599, term172599.getClass(), "type", 0);
        setField(term172599, term172599.getClass(), "next", null);
        setField(term172599, term172599.getClass(), "first", null);
        setField(term172599, term172599.getClass(), "last", null);
        setField(term172599, term172599.getClass(), "propListHead", null);
        setIntField(term172599, term172599.getClass(), "sourcePosition", 0);
        setField(term172599, term172599.getClass(), "jsType", null);
        setField(term172599, term172599.getClass(), "parent", null);
        setField(term172596, term172596.getClass(), "last", term172599);
        setField(term172596, term172596.getClass(), "propListHead", null);
        setIntField(term172596, term172596.getClass(), "sourcePosition", 0);
        setField(term172596, term172596.getClass(), "jsType", null);
        setField(term172596, term172596.getClass(), "parent", null);
        setField(term172595, term172595.getClass(), "first", term172596);
        setField(term172595, term172595.getClass(), "last", null);
        setField(term172595, term172595.getClass(), "propListHead", null);
        setIntField(term172595, term172595.getClass(), "sourcePosition", 0);
        setField(term172595, term172595.getClass(), "jsType", null);
        setField(term172595, term172595.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term171988;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term171988, term172595));
        assertTrue(recursiveEquals(retValue, null));
    }

};


