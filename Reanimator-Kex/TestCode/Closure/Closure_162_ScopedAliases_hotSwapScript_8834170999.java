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

public class ScopedAliases_hotSwapScript_8834170999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51366;
     Object term51458;
     Object term52625;
     Object term52626;

    public ScopedAliases_hotSwapScript_8834170999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51366 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term51366, term51366.getClass(), "compiler", null);
        term51458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51636 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term51458, term51458.getClass(), "type", 0);
        setField(term51458, term51458.getClass(), "parent", null);
        setField(term51550, term51550.getClass(), "next", null);
        setIntField(term51550, term51550.getClass(), "type", 0);
        setField(term51550, term51550.getClass(), "first", term51636);
        setField(term51458, term51458.getClass(), "first", term51550);
        term52625 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term52625, term52625.getClass(), "compiler", null);
        setField(term52625, term52625.getClass(), "preprocessorSymbolTable", null);
        setField(term52625, term52625.getClass(), "transformationHandler", null);
        term52626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term52626, term52626.getClass(), "number", 0.0);
        setIntField(term52626, term52626.getClass(), "type", 0);
        setField(term52626, term52626.getClass(), "next", null);
        setDoubleField(term52627, term52627.getClass(), "number", 0.0);
        setIntField(term52627, term52627.getClass(), "type", 0);
        setField(term52627, term52627.getClass(), "next", null);
        setField(term52628, term52628.getClass(), "functionName", null);
        setBooleanField(term52628, term52628.getClass(), "itsNeedsActivation", false);
        setIntField(term52628, term52628.getClass(), "itsFunctionType", 0);
        setBooleanField(term52628, term52628.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term52628, term52628.getClass(), "encodedSourceStart", 0);
        setIntField(term52628, term52628.getClass(), "encodedSourceEnd", 0);
        setField(term52628, term52628.getClass(), "sourceName", null);
        setIntField(term52628, term52628.getClass(), "baseLineno", 0);
        setIntField(term52628, term52628.getClass(), "endLineno", 0);
        setField(term52628, term52628.getClass(), "functions", null);
        setField(term52628, term52628.getClass(), "regexps", null);
        setField(term52628, term52628.getClass(), "itsVariables", null);
        setField(term52628, term52628.getClass(), "itsConst", null);
        setField(term52628, term52628.getClass(), "itsVariableNames", null);
        setIntField(term52628, term52628.getClass(), "varStart", 0);
        setField(term52628, term52628.getClass(), "compilerData", null);
        setIntField(term52628, term52628.getClass(), "type", 0);
        setField(term52628, term52628.getClass(), "next", null);
        setField(term52628, term52628.getClass(), "first", null);
        setField(term52628, term52628.getClass(), "last", null);
        setField(term52628, term52628.getClass(), "propListHead", null);
        setIntField(term52628, term52628.getClass(), "sourcePosition", 0);
        setField(term52628, term52628.getClass(), "jsType", null);
        setField(term52628, term52628.getClass(), "parent", null);
        setField(term52627, term52627.getClass(), "first", term52628);
        setField(term52627, term52627.getClass(), "last", null);
        setField(term52627, term52627.getClass(), "propListHead", null);
        setIntField(term52627, term52627.getClass(), "sourcePosition", 0);
        setField(term52627, term52627.getClass(), "jsType", null);
        setField(term52627, term52627.getClass(), "parent", null);
        setField(term52626, term52626.getClass(), "first", term52627);
        setField(term52626, term52626.getClass(), "last", null);
        setField(term52626, term52626.getClass(), "propListHead", null);
        setIntField(term52626, term52626.getClass(), "sourcePosition", 0);
        setField(term52626, term52626.getClass(), "jsType", null);
        setField(term52626, term52626.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term51458;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term51366, args);
        assertTrue(recursiveEquals(term51366, term52625));
        assertTrue(recursiveEquals(term51458, term52626));
    }

};


