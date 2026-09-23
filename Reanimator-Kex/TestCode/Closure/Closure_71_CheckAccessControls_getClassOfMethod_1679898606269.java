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

public class CheckAccessControls_getClassOfMethod_1679898606269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80011;
     Object term80101;
     Object term81151;
     Object term81152;

    public CheckAccessControls_getClassOfMethod_1679898606269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80011 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term80101 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term80191 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term80101, term80101.getClass(), "type", 86);
        setField(term80101, term80101.getClass(), "first", term80191);
        term81151 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term81151, term81151.getClass(), "compiler", null);
        setField(term81151, term81151.getClass(), "validator", null);
        setIntField(term81151, term81151.getClass(), "deprecatedDepth", 0);
        setIntField(term81151, term81151.getClass(), "methodDepth", 0);
        setField(term81151, term81151.getClass(), "currentClass", null);
        setField(term81151, term81151.getClass(), "initializedConstantProperties", null);
        term81152 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term81153 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term81152, term81152.getClass(), "encodedSourceStart", 0);
        setIntField(term81152, term81152.getClass(), "encodedSourceEnd", 0);
        setField(term81152, term81152.getClass(), "sourceName", null);
        setIntField(term81152, term81152.getClass(), "baseLineno", 0);
        setIntField(term81152, term81152.getClass(), "endLineno", 0);
        setField(term81152, term81152.getClass(), "functions", null);
        setField(term81152, term81152.getClass(), "regexps", null);
        setField(term81152, term81152.getClass(), "itsVariables", null);
        setField(term81152, term81152.getClass(), "itsConst", null);
        setField(term81152, term81152.getClass(), "itsVariableNames", null);
        setIntField(term81152, term81152.getClass(), "varStart", 0);
        setField(term81152, term81152.getClass(), "compilerData", null);
        setIntField(term81152, term81152.getClass(), "type", 86);
        setField(term81152, term81152.getClass(), "next", null);
        setIntField(term81153, term81153.getClass(), "encodedSourceStart", 0);
        setIntField(term81153, term81153.getClass(), "encodedSourceEnd", 0);
        setField(term81153, term81153.getClass(), "sourceName", null);
        setIntField(term81153, term81153.getClass(), "baseLineno", 0);
        setIntField(term81153, term81153.getClass(), "endLineno", 0);
        setField(term81153, term81153.getClass(), "functions", null);
        setField(term81153, term81153.getClass(), "regexps", null);
        setField(term81153, term81153.getClass(), "itsVariables", null);
        setField(term81153, term81153.getClass(), "itsConst", null);
        setField(term81153, term81153.getClass(), "itsVariableNames", null);
        setIntField(term81153, term81153.getClass(), "varStart", 0);
        setField(term81153, term81153.getClass(), "compilerData", null);
        setIntField(term81153, term81153.getClass(), "type", 0);
        setField(term81153, term81153.getClass(), "next", null);
        setField(term81153, term81153.getClass(), "first", null);
        setField(term81153, term81153.getClass(), "last", null);
        setField(term81153, term81153.getClass(), "propListHead", null);
        setIntField(term81153, term81153.getClass(), "sourcePosition", 0);
        setField(term81153, term81153.getClass(), "jsType", null);
        setField(term81153, term81153.getClass(), "parent", null);
        setField(term81152, term81152.getClass(), "first", term81153);
        setField(term81152, term81152.getClass(), "last", null);
        setField(term81152, term81152.getClass(), "propListHead", null);
        setIntField(term81152, term81152.getClass(), "sourcePosition", 0);
        setField(term81152, term81152.getClass(), "jsType", null);
        setField(term81152, term81152.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term80101;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term80011, args);
        assertTrue(recursiveEquals(term80011, term81151));
        assertTrue(recursiveEquals(term80101, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


