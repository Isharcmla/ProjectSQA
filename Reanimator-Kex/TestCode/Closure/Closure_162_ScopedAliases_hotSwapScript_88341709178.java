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

public class ScopedAliases_hotSwapScript_88341709178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101052;
     Object term101144;
     Object term101959;
     Object term101960;

    public ScopedAliases_hotSwapScript_88341709178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101052 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term101052, term101052.getClass(), "compiler", null);
        term101144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101236 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101392 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term101144, term101144.getClass(), "type", 0);
        setField(term101144, term101144.getClass(), "parent", null);
        setField(term101236, term101236.getClass(), "next", term101306);
        setIntField(term101236, term101236.getClass(), "type", 0);
        setField(term101392, term101392.getClass(), "next", null);
        setIntField(term101392, term101392.getClass(), "type", 0);
        setField(term101392, term101392.getClass(), "first", null);
        setField(term101236, term101236.getClass(), "first", term101392);
        setField(term101144, term101144.getClass(), "first", term101236);
        term101959 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term101959, term101959.getClass(), "compiler", null);
        setField(term101959, term101959.getClass(), "preprocessorSymbolTable", null);
        setField(term101959, term101959.getClass(), "transformationHandler", null);
        term101960 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101961 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101963 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term101960, term101960.getClass(), "number", 0.0);
        setIntField(term101960, term101960.getClass(), "type", 0);
        setField(term101960, term101960.getClass(), "next", null);
        setDoubleField(term101961, term101961.getClass(), "number", 0.0);
        setIntField(term101961, term101961.getClass(), "type", 0);
        setIntField(term101962, term101962.getClass(), "type", 0);
        setField(term101962, term101962.getClass(), "next", null);
        setField(term101962, term101962.getClass(), "first", null);
        setField(term101962, term101962.getClass(), "last", null);
        setField(term101962, term101962.getClass(), "propListHead", null);
        setIntField(term101962, term101962.getClass(), "sourcePosition", 0);
        setField(term101962, term101962.getClass(), "jsType", null);
        setField(term101962, term101962.getClass(), "parent", null);
        setField(term101961, term101961.getClass(), "next", term101962);
        setField(term101963, term101963.getClass(), "functionName", null);
        setBooleanField(term101963, term101963.getClass(), "itsNeedsActivation", false);
        setIntField(term101963, term101963.getClass(), "itsFunctionType", 0);
        setBooleanField(term101963, term101963.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term101963, term101963.getClass(), "encodedSourceStart", 0);
        setIntField(term101963, term101963.getClass(), "encodedSourceEnd", 0);
        setField(term101963, term101963.getClass(), "sourceName", null);
        setIntField(term101963, term101963.getClass(), "baseLineno", 0);
        setIntField(term101963, term101963.getClass(), "endLineno", 0);
        setField(term101963, term101963.getClass(), "functions", null);
        setField(term101963, term101963.getClass(), "regexps", null);
        setField(term101963, term101963.getClass(), "itsVariables", null);
        setField(term101963, term101963.getClass(), "itsConst", null);
        setField(term101963, term101963.getClass(), "itsVariableNames", null);
        setIntField(term101963, term101963.getClass(), "varStart", 0);
        setField(term101963, term101963.getClass(), "compilerData", null);
        setIntField(term101963, term101963.getClass(), "type", 0);
        setField(term101963, term101963.getClass(), "next", null);
        setField(term101963, term101963.getClass(), "first", null);
        setField(term101963, term101963.getClass(), "last", null);
        setField(term101963, term101963.getClass(), "propListHead", null);
        setIntField(term101963, term101963.getClass(), "sourcePosition", 0);
        setField(term101963, term101963.getClass(), "jsType", null);
        setField(term101963, term101963.getClass(), "parent", null);
        setField(term101961, term101961.getClass(), "first", term101963);
        setField(term101961, term101961.getClass(), "last", null);
        setField(term101961, term101961.getClass(), "propListHead", null);
        setIntField(term101961, term101961.getClass(), "sourcePosition", 0);
        setField(term101961, term101961.getClass(), "jsType", null);
        setField(term101961, term101961.getClass(), "parent", null);
        setField(term101960, term101960.getClass(), "first", term101961);
        setField(term101960, term101960.getClass(), "last", null);
        setField(term101960, term101960.getClass(), "propListHead", null);
        setIntField(term101960, term101960.getClass(), "sourcePosition", 0);
        setField(term101960, term101960.getClass(), "jsType", null);
        setField(term101960, term101960.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term101144;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term101052, args);
        assertTrue(recursiveEquals(term101052, term101959));
        assertTrue(recursiveEquals(term101144, term101960));
    }

};


