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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36768;
     Object term36854;
     Object term37006;
     Object term37007;
     Object term36975;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36768 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term36854 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term36946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term36854, term36854.getClass(), "type", 37);
        setField(term36854, term36854.getClass(), "first", term36946);
        term37006 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term37006, term37006.getClass(), "currentTraversal", null);
        term37007 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term37008 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term37007, term37007.getClass(), "functionName", null);
        setBooleanField(term37007, term37007.getClass(), "itsNeedsActivation", false);
        setIntField(term37007, term37007.getClass(), "itsFunctionType", 0);
        setBooleanField(term37007, term37007.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term37007, term37007.getClass(), "encodedSourceStart", 0);
        setIntField(term37007, term37007.getClass(), "encodedSourceEnd", 0);
        setField(term37007, term37007.getClass(), "sourceName", null);
        setIntField(term37007, term37007.getClass(), "baseLineno", 0);
        setIntField(term37007, term37007.getClass(), "endLineno", 0);
        setField(term37007, term37007.getClass(), "functions", null);
        setField(term37007, term37007.getClass(), "regexps", null);
        setField(term37007, term37007.getClass(), "itsVariables", null);
        setField(term37007, term37007.getClass(), "itsConst", null);
        setField(term37007, term37007.getClass(), "itsVariableNames", null);
        setIntField(term37007, term37007.getClass(), "varStart", 0);
        setField(term37007, term37007.getClass(), "compilerData", null);
        setIntField(term37007, term37007.getClass(), "type", 37);
        setField(term37007, term37007.getClass(), "next", null);
        setField(term37008, term37008.getClass(), "str", null);
        setIntField(term37008, term37008.getClass(), "type", 0);
        setField(term37008, term37008.getClass(), "next", null);
        setField(term37008, term37008.getClass(), "first", null);
        setField(term37008, term37008.getClass(), "last", null);
        setField(term37008, term37008.getClass(), "propListHead", null);
        setIntField(term37008, term37008.getClass(), "sourcePosition", 0);
        setField(term37008, term37008.getClass(), "jsType", null);
        setField(term37008, term37008.getClass(), "parent", null);
        setField(term37007, term37007.getClass(), "first", term37008);
        setField(term37007, term37007.getClass(), "last", null);
        setField(term37007, term37007.getClass(), "propListHead", null);
        setIntField(term37007, term37007.getClass(), "sourcePosition", 0);
        setField(term37007, term37007.getClass(), "jsType", null);
        setField(term37007, term37007.getClass(), "parent", null);
        term36975 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term36985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36975, term36975.getClass(), "functionName", null);
        setBooleanField(term36975, term36975.getClass(), "itsNeedsActivation", false);
        setIntField(term36975, term36975.getClass(), "itsFunctionType", 0);
        setBooleanField(term36975, term36975.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term36975, term36975.getClass(), "encodedSourceStart", 0);
        setIntField(term36975, term36975.getClass(), "encodedSourceEnd", 0);
        setField(term36975, term36975.getClass(), "sourceName", null);
        setIntField(term36975, term36975.getClass(), "baseLineno", 0);
        setIntField(term36975, term36975.getClass(), "endLineno", 0);
        setField(term36975, term36975.getClass(), "functions", null);
        setField(term36975, term36975.getClass(), "regexps", null);
        setField(term36975, term36975.getClass(), "itsVariables", null);
        setField(term36975, term36975.getClass(), "itsConst", null);
        setField(term36975, term36975.getClass(), "itsVariableNames", null);
        setIntField(term36975, term36975.getClass(), "varStart", 0);
        setField(term36975, term36975.getClass(), "compilerData", null);
        setIntField(term36975, term36975.getClass(), "type", 37);
        setField(term36975, term36975.getClass(), "next", null);
        setField(term36985, term36985.getClass(), "str", null);
        setIntField(term36985, term36985.getClass(), "type", 0);
        setField(term36985, term36985.getClass(), "next", null);
        setField(term36985, term36985.getClass(), "first", null);
        setField(term36985, term36985.getClass(), "last", null);
        setField(term36985, term36985.getClass(), "propListHead", null);
        setIntField(term36985, term36985.getClass(), "sourcePosition", 0);
        setField(term36985, term36985.getClass(), "jsType", null);
        setField(term36985, term36985.getClass(), "parent", null);
        setField(term36975, term36975.getClass(), "first", term36985);
        setField(term36975, term36975.getClass(), "last", null);
        setField(term36975, term36975.getClass(), "propListHead", null);
        setIntField(term36975, term36975.getClass(), "sourcePosition", 0);
        setField(term36975, term36975.getClass(), "jsType", null);
        setField(term36975, term36975.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36854;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term36768, args);
        assertTrue(recursiveEquals(term36768, term37006));
        assertTrue(recursiveEquals(term36854, term37007));
        assertTrue(recursiveEquals(retValue, term36975));
    }

};


