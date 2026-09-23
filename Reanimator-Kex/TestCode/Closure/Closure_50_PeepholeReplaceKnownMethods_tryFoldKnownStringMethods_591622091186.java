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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61013;
     Object term61105;
     Object term61522;
     Object term61523;
     Object term61475;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61013 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term61105 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61191 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term61105, term61105.getClass(), "type", 37);
        setField(term61105, term61105.getClass(), "first", term61191);
        term61522 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term61522, term61522.getClass(), "currentTraversal", null);
        term61523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61524 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term61523, term61523.getClass(), "str", null);
        setIntField(term61523, term61523.getClass(), "type", 37);
        setField(term61523, term61523.getClass(), "next", null);
        setField(term61524, term61524.getClass(), "functionName", null);
        setBooleanField(term61524, term61524.getClass(), "itsNeedsActivation", false);
        setIntField(term61524, term61524.getClass(), "itsFunctionType", 0);
        setBooleanField(term61524, term61524.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term61524, term61524.getClass(), "encodedSourceStart", 0);
        setIntField(term61524, term61524.getClass(), "encodedSourceEnd", 0);
        setField(term61524, term61524.getClass(), "sourceName", null);
        setIntField(term61524, term61524.getClass(), "baseLineno", 0);
        setIntField(term61524, term61524.getClass(), "endLineno", 0);
        setField(term61524, term61524.getClass(), "functions", null);
        setField(term61524, term61524.getClass(), "regexps", null);
        setField(term61524, term61524.getClass(), "itsVariables", null);
        setField(term61524, term61524.getClass(), "itsConst", null);
        setField(term61524, term61524.getClass(), "itsVariableNames", null);
        setIntField(term61524, term61524.getClass(), "varStart", 0);
        setField(term61524, term61524.getClass(), "compilerData", null);
        setIntField(term61524, term61524.getClass(), "type", 0);
        setField(term61524, term61524.getClass(), "next", null);
        setField(term61524, term61524.getClass(), "first", null);
        setField(term61524, term61524.getClass(), "last", null);
        setField(term61524, term61524.getClass(), "propListHead", null);
        setIntField(term61524, term61524.getClass(), "sourcePosition", 0);
        setField(term61524, term61524.getClass(), "jsType", null);
        setField(term61524, term61524.getClass(), "parent", null);
        setField(term61523, term61523.getClass(), "first", term61524);
        setField(term61523, term61523.getClass(), "last", null);
        setField(term61523, term61523.getClass(), "propListHead", null);
        setIntField(term61523, term61523.getClass(), "sourcePosition", 0);
        setField(term61523, term61523.getClass(), "jsType", null);
        setField(term61523, term61523.getClass(), "parent", null);
        term61475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61477 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term61475, term61475.getClass(), "str", null);
        setIntField(term61475, term61475.getClass(), "type", 37);
        setField(term61475, term61475.getClass(), "next", null);
        setField(term61477, term61477.getClass(), "functionName", null);
        setBooleanField(term61477, term61477.getClass(), "itsNeedsActivation", false);
        setIntField(term61477, term61477.getClass(), "itsFunctionType", 0);
        setBooleanField(term61477, term61477.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term61477, term61477.getClass(), "encodedSourceStart", 0);
        setIntField(term61477, term61477.getClass(), "encodedSourceEnd", 0);
        setField(term61477, term61477.getClass(), "sourceName", null);
        setIntField(term61477, term61477.getClass(), "baseLineno", 0);
        setIntField(term61477, term61477.getClass(), "endLineno", 0);
        setField(term61477, term61477.getClass(), "functions", null);
        setField(term61477, term61477.getClass(), "regexps", null);
        setField(term61477, term61477.getClass(), "itsVariables", null);
        setField(term61477, term61477.getClass(), "itsConst", null);
        setField(term61477, term61477.getClass(), "itsVariableNames", null);
        setIntField(term61477, term61477.getClass(), "varStart", 0);
        setField(term61477, term61477.getClass(), "compilerData", null);
        setIntField(term61477, term61477.getClass(), "type", 0);
        setField(term61477, term61477.getClass(), "next", null);
        setField(term61477, term61477.getClass(), "first", null);
        setField(term61477, term61477.getClass(), "last", null);
        setField(term61477, term61477.getClass(), "propListHead", null);
        setIntField(term61477, term61477.getClass(), "sourcePosition", 0);
        setField(term61477, term61477.getClass(), "jsType", null);
        setField(term61477, term61477.getClass(), "parent", null);
        setField(term61475, term61475.getClass(), "first", term61477);
        setField(term61475, term61475.getClass(), "last", null);
        setField(term61475, term61475.getClass(), "propListHead", null);
        setIntField(term61475, term61475.getClass(), "sourcePosition", 0);
        setField(term61475, term61475.getClass(), "jsType", null);
        setField(term61475, term61475.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61105;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term61013, args);
        assertTrue(recursiveEquals(term61013, term61522));
        assertTrue(recursiveEquals(term61105, term61523));
        assertTrue(recursiveEquals(retValue, term61475));
    }

};


