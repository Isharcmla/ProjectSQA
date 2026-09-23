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

public class ScopedAliases_hotSwapScript_8834170988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45909;
     Object term46001;
     Object term46878;
     Object term46879;

    public ScopedAliases_hotSwapScript_8834170988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45909 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term45909, term45909.getClass(), "compiler", null);
        term46001 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46093 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46179 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term46271 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term46001, term46001.getClass(), "type", 0);
        setField(term46001, term46001.getClass(), "parent", null);
        setField(term46093, term46093.getClass(), "next", term46179);
        setIntField(term46093, term46093.getClass(), "type", 0);
        setField(term46271, term46271.getClass(), "next", null);
        setIntField(term46271, term46271.getClass(), "type", 0);
        setField(term46271, term46271.getClass(), "first", null);
        setField(term46093, term46093.getClass(), "first", term46271);
        setField(term46001, term46001.getClass(), "first", term46093);
        term46878 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term46878, term46878.getClass(), "compiler", null);
        setField(term46878, term46878.getClass(), "preprocessorSymbolTable", null);
        setField(term46878, term46878.getClass(), "transformationHandler", null);
        term46879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46880 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46881 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term46882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46879, term46879.getClass(), "number", 0.0);
        setIntField(term46879, term46879.getClass(), "type", 0);
        setField(term46879, term46879.getClass(), "next", null);
        setDoubleField(term46880, term46880.getClass(), "number", 0.0);
        setIntField(term46880, term46880.getClass(), "type", 0);
        setField(term46881, term46881.getClass(), "functionName", null);
        setBooleanField(term46881, term46881.getClass(), "itsNeedsActivation", false);
        setIntField(term46881, term46881.getClass(), "itsFunctionType", 0);
        setBooleanField(term46881, term46881.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term46881, term46881.getClass(), "encodedSourceStart", 0);
        setIntField(term46881, term46881.getClass(), "encodedSourceEnd", 0);
        setField(term46881, term46881.getClass(), "sourceName", null);
        setIntField(term46881, term46881.getClass(), "baseLineno", 0);
        setIntField(term46881, term46881.getClass(), "endLineno", 0);
        setField(term46881, term46881.getClass(), "functions", null);
        setField(term46881, term46881.getClass(), "regexps", null);
        setField(term46881, term46881.getClass(), "itsVariables", null);
        setField(term46881, term46881.getClass(), "itsConst", null);
        setField(term46881, term46881.getClass(), "itsVariableNames", null);
        setIntField(term46881, term46881.getClass(), "varStart", 0);
        setField(term46881, term46881.getClass(), "compilerData", null);
        setIntField(term46881, term46881.getClass(), "type", 0);
        setField(term46881, term46881.getClass(), "next", null);
        setField(term46881, term46881.getClass(), "first", null);
        setField(term46881, term46881.getClass(), "last", null);
        setField(term46881, term46881.getClass(), "propListHead", null);
        setIntField(term46881, term46881.getClass(), "sourcePosition", 0);
        setField(term46881, term46881.getClass(), "jsType", null);
        setField(term46881, term46881.getClass(), "parent", null);
        setField(term46880, term46880.getClass(), "next", term46881);
        setDoubleField(term46882, term46882.getClass(), "number", 0.0);
        setIntField(term46882, term46882.getClass(), "type", 0);
        setField(term46882, term46882.getClass(), "next", null);
        setField(term46882, term46882.getClass(), "first", null);
        setField(term46882, term46882.getClass(), "last", null);
        setField(term46882, term46882.getClass(), "propListHead", null);
        setIntField(term46882, term46882.getClass(), "sourcePosition", 0);
        setField(term46882, term46882.getClass(), "jsType", null);
        setField(term46882, term46882.getClass(), "parent", null);
        setField(term46880, term46880.getClass(), "first", term46882);
        setField(term46880, term46880.getClass(), "last", null);
        setField(term46880, term46880.getClass(), "propListHead", null);
        setIntField(term46880, term46880.getClass(), "sourcePosition", 0);
        setField(term46880, term46880.getClass(), "jsType", null);
        setField(term46880, term46880.getClass(), "parent", null);
        setField(term46879, term46879.getClass(), "first", term46880);
        setField(term46879, term46879.getClass(), "last", null);
        setField(term46879, term46879.getClass(), "propListHead", null);
        setIntField(term46879, term46879.getClass(), "sourcePosition", 0);
        setField(term46879, term46879.getClass(), "jsType", null);
        setField(term46879, term46879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term46001;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term45909, args);
        assertTrue(recursiveEquals(term45909, term46878));
        assertTrue(recursiveEquals(term46001, term46879));
    }

};


