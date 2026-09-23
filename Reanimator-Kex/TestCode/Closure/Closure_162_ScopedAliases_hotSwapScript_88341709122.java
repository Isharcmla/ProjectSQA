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

public class ScopedAliases_hotSwapScript_88341709122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66331;
     Object term66423;
     Object term67269;
     Object term67270;

    public ScopedAliases_hotSwapScript_88341709122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66331 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term66331, term66331.getClass(), "compiler", null);
        term66423 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66515 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66693 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term66423, term66423.getClass(), "type", 0);
        setField(term66423, term66423.getClass(), "parent", null);
        setField(term66601, term66601.getClass(), "next", null);
        setIntField(term66601, term66601.getClass(), "type", 0);
        setField(term66601, term66601.getClass(), "first", null);
        setField(term66515, term66515.getClass(), "next", term66601);
        setIntField(term66515, term66515.getClass(), "type", 0);
        setField(term66693, term66693.getClass(), "next", null);
        setIntField(term66693, term66693.getClass(), "type", 0);
        setField(term66693, term66693.getClass(), "first", null);
        setField(term66515, term66515.getClass(), "first", term66693);
        setField(term66423, term66423.getClass(), "first", term66515);
        term67269 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term67269, term67269.getClass(), "compiler", null);
        setField(term67269, term67269.getClass(), "preprocessorSymbolTable", null);
        setField(term67269, term67269.getClass(), "transformationHandler", null);
        term67270 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term67271 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term67272 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term67273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term67270, term67270.getClass(), "number", 0.0);
        setIntField(term67270, term67270.getClass(), "type", 0);
        setField(term67270, term67270.getClass(), "next", null);
        setDoubleField(term67271, term67271.getClass(), "number", 0.0);
        setIntField(term67271, term67271.getClass(), "type", 0);
        setField(term67272, term67272.getClass(), "functionName", null);
        setBooleanField(term67272, term67272.getClass(), "itsNeedsActivation", false);
        setIntField(term67272, term67272.getClass(), "itsFunctionType", 0);
        setBooleanField(term67272, term67272.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term67272, term67272.getClass(), "encodedSourceStart", 0);
        setIntField(term67272, term67272.getClass(), "encodedSourceEnd", 0);
        setField(term67272, term67272.getClass(), "sourceName", null);
        setIntField(term67272, term67272.getClass(), "baseLineno", 0);
        setIntField(term67272, term67272.getClass(), "endLineno", 0);
        setField(term67272, term67272.getClass(), "functions", null);
        setField(term67272, term67272.getClass(), "regexps", null);
        setField(term67272, term67272.getClass(), "itsVariables", null);
        setField(term67272, term67272.getClass(), "itsConst", null);
        setField(term67272, term67272.getClass(), "itsVariableNames", null);
        setIntField(term67272, term67272.getClass(), "varStart", 0);
        setField(term67272, term67272.getClass(), "compilerData", null);
        setIntField(term67272, term67272.getClass(), "type", 0);
        setField(term67272, term67272.getClass(), "next", null);
        setField(term67272, term67272.getClass(), "first", null);
        setField(term67272, term67272.getClass(), "last", null);
        setField(term67272, term67272.getClass(), "propListHead", null);
        setIntField(term67272, term67272.getClass(), "sourcePosition", 0);
        setField(term67272, term67272.getClass(), "jsType", null);
        setField(term67272, term67272.getClass(), "parent", null);
        setField(term67271, term67271.getClass(), "next", term67272);
        setDoubleField(term67273, term67273.getClass(), "number", 0.0);
        setIntField(term67273, term67273.getClass(), "type", 0);
        setField(term67273, term67273.getClass(), "next", null);
        setField(term67273, term67273.getClass(), "first", null);
        setField(term67273, term67273.getClass(), "last", null);
        setField(term67273, term67273.getClass(), "propListHead", null);
        setIntField(term67273, term67273.getClass(), "sourcePosition", 0);
        setField(term67273, term67273.getClass(), "jsType", null);
        setField(term67273, term67273.getClass(), "parent", null);
        setField(term67271, term67271.getClass(), "first", term67273);
        setField(term67271, term67271.getClass(), "last", null);
        setField(term67271, term67271.getClass(), "propListHead", null);
        setIntField(term67271, term67271.getClass(), "sourcePosition", 0);
        setField(term67271, term67271.getClass(), "jsType", null);
        setField(term67271, term67271.getClass(), "parent", null);
        setField(term67270, term67270.getClass(), "first", term67271);
        setField(term67270, term67270.getClass(), "last", null);
        setField(term67270, term67270.getClass(), "propListHead", null);
        setIntField(term67270, term67270.getClass(), "sourcePosition", 0);
        setField(term67270, term67270.getClass(), "jsType", null);
        setField(term67270, term67270.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term66423;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term66331, args);
        assertTrue(recursiveEquals(term66331, term67269));
        assertTrue(recursiveEquals(term66423, term67270));
    }

};


