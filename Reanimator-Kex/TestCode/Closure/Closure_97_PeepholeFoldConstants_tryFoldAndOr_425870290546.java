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

public class PeepholeFoldConstants_tryFoldAndOr_425870290546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145100;
     Object term145192;
     Object term145284;
     Object term145370;
     Object term145475;
     Object term145476;
     Object term145477;
     Object term145478;
     Object term145428;

    public PeepholeFoldConstants_tryFoldAndOr_425870290546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145100 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term145192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term145192, term145192.getClass(), "parent", null);
        setIntField(term145192, term145192.getClass(), "type", 0);
        term145284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term145284, term145284.getClass(), "type", 0);
        term145370 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term145475 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term145475, term145475.getClass(), "currentTraversal", null);
        term145476 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term145476, term145476.getClass(), "str", null);
        setIntField(term145476, term145476.getClass(), "type", 0);
        setField(term145476, term145476.getClass(), "next", null);
        setField(term145476, term145476.getClass(), "first", null);
        setField(term145476, term145476.getClass(), "last", null);
        setField(term145476, term145476.getClass(), "propListHead", null);
        setIntField(term145476, term145476.getClass(), "sourcePosition", 0);
        setField(term145476, term145476.getClass(), "jsType", null);
        setField(term145476, term145476.getClass(), "parent", null);
        term145477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term145477, term145477.getClass(), "number", 0.0);
        setIntField(term145477, term145477.getClass(), "type", 0);
        setField(term145477, term145477.getClass(), "next", null);
        setField(term145477, term145477.getClass(), "first", null);
        setField(term145477, term145477.getClass(), "last", null);
        setField(term145477, term145477.getClass(), "propListHead", null);
        setIntField(term145477, term145477.getClass(), "sourcePosition", 0);
        setField(term145477, term145477.getClass(), "jsType", null);
        setField(term145477, term145477.getClass(), "parent", null);
        term145478 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term145478, term145478.getClass(), "functionName", null);
        setBooleanField(term145478, term145478.getClass(), "itsNeedsActivation", false);
        setIntField(term145478, term145478.getClass(), "itsFunctionType", 0);
        setBooleanField(term145478, term145478.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145478, term145478.getClass(), "encodedSourceStart", 0);
        setIntField(term145478, term145478.getClass(), "encodedSourceEnd", 0);
        setField(term145478, term145478.getClass(), "sourceName", null);
        setIntField(term145478, term145478.getClass(), "baseLineno", 0);
        setIntField(term145478, term145478.getClass(), "endLineno", 0);
        setField(term145478, term145478.getClass(), "functions", null);
        setField(term145478, term145478.getClass(), "regexps", null);
        setField(term145478, term145478.getClass(), "itsVariables", null);
        setField(term145478, term145478.getClass(), "itsConst", null);
        setField(term145478, term145478.getClass(), "itsVariableNames", null);
        setIntField(term145478, term145478.getClass(), "varStart", 0);
        setField(term145478, term145478.getClass(), "compilerData", null);
        setIntField(term145478, term145478.getClass(), "type", 0);
        setField(term145478, term145478.getClass(), "next", null);
        setField(term145478, term145478.getClass(), "first", null);
        setField(term145478, term145478.getClass(), "last", null);
        setField(term145478, term145478.getClass(), "propListHead", null);
        setIntField(term145478, term145478.getClass(), "sourcePosition", 0);
        setField(term145478, term145478.getClass(), "jsType", null);
        setField(term145478, term145478.getClass(), "parent", null);
        term145428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term145428, term145428.getClass(), "str", null);
        setIntField(term145428, term145428.getClass(), "type", 0);
        setField(term145428, term145428.getClass(), "next", null);
        setField(term145428, term145428.getClass(), "first", null);
        setField(term145428, term145428.getClass(), "last", null);
        setField(term145428, term145428.getClass(), "propListHead", null);
        setIntField(term145428, term145428.getClass(), "sourcePosition", 0);
        setField(term145428, term145428.getClass(), "jsType", null);
        setField(term145428, term145428.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term145192;
        args[1] = term145284;
        args[2] = term145370;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term145100, args);
        assertTrue(recursiveEquals(term145100, term145475));
        assertTrue(recursiveEquals(term145192, term145476));
        assertTrue(recursiveEquals(term145284, term145477));
        assertTrue(recursiveEquals(term145370, term145478));
        assertTrue(recursiveEquals(retValue, term145428));
    }

};


