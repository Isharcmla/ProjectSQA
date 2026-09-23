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

public class PeepholeFoldConstants_tryFoldAndOr_425870290298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57832;
     Object term57918;
     Object term58010;
     Object term58096;
     Object term58182;
     Object term58183;
     Object term58184;
     Object term58185;
     Object term58128;

    public PeepholeFoldConstants_tryFoldAndOr_425870290298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57832 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term57918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term57918, term57918.getClass(), "parent", null);
        setIntField(term57918, term57918.getClass(), "type", 0);
        term58010 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term58010, term58010.getClass(), "type", 0);
        term58096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term58182 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term58182, term58182.getClass(), "currentTraversal", null);
        term58183 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term58183, term58183.getClass(), "functionName", null);
        setBooleanField(term58183, term58183.getClass(), "itsNeedsActivation", false);
        setIntField(term58183, term58183.getClass(), "itsFunctionType", 0);
        setBooleanField(term58183, term58183.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58183, term58183.getClass(), "encodedSourceStart", 0);
        setIntField(term58183, term58183.getClass(), "encodedSourceEnd", 0);
        setField(term58183, term58183.getClass(), "sourceName", null);
        setIntField(term58183, term58183.getClass(), "baseLineno", 0);
        setIntField(term58183, term58183.getClass(), "endLineno", 0);
        setField(term58183, term58183.getClass(), "functions", null);
        setField(term58183, term58183.getClass(), "regexps", null);
        setField(term58183, term58183.getClass(), "itsVariables", null);
        setField(term58183, term58183.getClass(), "itsConst", null);
        setField(term58183, term58183.getClass(), "itsVariableNames", null);
        setIntField(term58183, term58183.getClass(), "varStart", 0);
        setField(term58183, term58183.getClass(), "compilerData", null);
        setIntField(term58183, term58183.getClass(), "type", 0);
        setField(term58183, term58183.getClass(), "next", null);
        setField(term58183, term58183.getClass(), "first", null);
        setField(term58183, term58183.getClass(), "last", null);
        setField(term58183, term58183.getClass(), "propListHead", null);
        setIntField(term58183, term58183.getClass(), "sourcePosition", 0);
        setField(term58183, term58183.getClass(), "jsType", null);
        setField(term58183, term58183.getClass(), "parent", null);
        term58184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term58184, term58184.getClass(), "str", null);
        setIntField(term58184, term58184.getClass(), "type", 0);
        setField(term58184, term58184.getClass(), "next", null);
        setField(term58184, term58184.getClass(), "first", null);
        setField(term58184, term58184.getClass(), "last", null);
        setField(term58184, term58184.getClass(), "propListHead", null);
        setIntField(term58184, term58184.getClass(), "sourcePosition", 0);
        setField(term58184, term58184.getClass(), "jsType", null);
        setField(term58184, term58184.getClass(), "parent", null);
        term58185 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term58185, term58185.getClass(), "functionName", null);
        setBooleanField(term58185, term58185.getClass(), "itsNeedsActivation", false);
        setIntField(term58185, term58185.getClass(), "itsFunctionType", 0);
        setBooleanField(term58185, term58185.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58185, term58185.getClass(), "encodedSourceStart", 0);
        setIntField(term58185, term58185.getClass(), "encodedSourceEnd", 0);
        setField(term58185, term58185.getClass(), "sourceName", null);
        setIntField(term58185, term58185.getClass(), "baseLineno", 0);
        setIntField(term58185, term58185.getClass(), "endLineno", 0);
        setField(term58185, term58185.getClass(), "functions", null);
        setField(term58185, term58185.getClass(), "regexps", null);
        setField(term58185, term58185.getClass(), "itsVariables", null);
        setField(term58185, term58185.getClass(), "itsConst", null);
        setField(term58185, term58185.getClass(), "itsVariableNames", null);
        setIntField(term58185, term58185.getClass(), "varStart", 0);
        setField(term58185, term58185.getClass(), "compilerData", null);
        setIntField(term58185, term58185.getClass(), "type", 0);
        setField(term58185, term58185.getClass(), "next", null);
        setField(term58185, term58185.getClass(), "first", null);
        setField(term58185, term58185.getClass(), "last", null);
        setField(term58185, term58185.getClass(), "propListHead", null);
        setIntField(term58185, term58185.getClass(), "sourcePosition", 0);
        setField(term58185, term58185.getClass(), "jsType", null);
        setField(term58185, term58185.getClass(), "parent", null);
        term58128 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term58128, term58128.getClass(), "functionName", null);
        setBooleanField(term58128, term58128.getClass(), "itsNeedsActivation", false);
        setIntField(term58128, term58128.getClass(), "itsFunctionType", 0);
        setBooleanField(term58128, term58128.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58128, term58128.getClass(), "encodedSourceStart", 0);
        setIntField(term58128, term58128.getClass(), "encodedSourceEnd", 0);
        setField(term58128, term58128.getClass(), "sourceName", null);
        setIntField(term58128, term58128.getClass(), "baseLineno", 0);
        setIntField(term58128, term58128.getClass(), "endLineno", 0);
        setField(term58128, term58128.getClass(), "functions", null);
        setField(term58128, term58128.getClass(), "regexps", null);
        setField(term58128, term58128.getClass(), "itsVariables", null);
        setField(term58128, term58128.getClass(), "itsConst", null);
        setField(term58128, term58128.getClass(), "itsVariableNames", null);
        setIntField(term58128, term58128.getClass(), "varStart", 0);
        setField(term58128, term58128.getClass(), "compilerData", null);
        setIntField(term58128, term58128.getClass(), "type", 0);
        setField(term58128, term58128.getClass(), "next", null);
        setField(term58128, term58128.getClass(), "first", null);
        setField(term58128, term58128.getClass(), "last", null);
        setField(term58128, term58128.getClass(), "propListHead", null);
        setIntField(term58128, term58128.getClass(), "sourcePosition", 0);
        setField(term58128, term58128.getClass(), "jsType", null);
        setField(term58128, term58128.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term57918;
        args[1] = term58010;
        args[2] = term58096;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term57832, args);
        assertTrue(recursiveEquals(term57832, term58182));
        assertTrue(recursiveEquals(term57918, term58183));
        assertTrue(recursiveEquals(term58010, term58184));
        assertTrue(recursiveEquals(term58096, term58185));
        assertTrue(recursiveEquals(retValue, term58128));
    }

};


