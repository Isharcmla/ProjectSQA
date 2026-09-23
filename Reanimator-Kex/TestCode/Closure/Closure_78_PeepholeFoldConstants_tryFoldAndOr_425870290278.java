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

public class PeepholeFoldConstants_tryFoldAndOr_425870290278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45263;
     Object term45349;
     Object term45439;
     Object term45667;
     Object term45668;
     Object term45669;
     Object term45632;

    public PeepholeFoldConstants_tryFoldAndOr_425870290278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45263 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term45349 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45349, term45349.getClass(), "parent", null);
        setIntField(term45349, term45349.getClass(), "type", 0);
        term45439 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term45667 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term45667, term45667.getClass(), "currentTraversal", null);
        term45668 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45668, term45668.getClass(), "functionName", null);
        setBooleanField(term45668, term45668.getClass(), "itsNeedsActivation", false);
        setIntField(term45668, term45668.getClass(), "itsFunctionType", 0);
        setBooleanField(term45668, term45668.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45668, term45668.getClass(), "encodedSourceStart", 0);
        setIntField(term45668, term45668.getClass(), "encodedSourceEnd", 0);
        setField(term45668, term45668.getClass(), "sourceName", null);
        setIntField(term45668, term45668.getClass(), "baseLineno", 0);
        setIntField(term45668, term45668.getClass(), "endLineno", 0);
        setField(term45668, term45668.getClass(), "functions", null);
        setField(term45668, term45668.getClass(), "regexps", null);
        setField(term45668, term45668.getClass(), "itsVariables", null);
        setField(term45668, term45668.getClass(), "itsConst", null);
        setField(term45668, term45668.getClass(), "itsVariableNames", null);
        setIntField(term45668, term45668.getClass(), "varStart", 0);
        setField(term45668, term45668.getClass(), "compilerData", null);
        setIntField(term45668, term45668.getClass(), "type", 0);
        setField(term45668, term45668.getClass(), "next", null);
        setField(term45668, term45668.getClass(), "first", null);
        setField(term45668, term45668.getClass(), "last", null);
        setField(term45668, term45668.getClass(), "propListHead", null);
        setIntField(term45668, term45668.getClass(), "sourcePosition", 0);
        setField(term45668, term45668.getClass(), "jsType", null);
        setField(term45668, term45668.getClass(), "parent", null);
        term45669 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term45669, term45669.getClass(), "encodedSourceStart", 0);
        setIntField(term45669, term45669.getClass(), "encodedSourceEnd", 0);
        setField(term45669, term45669.getClass(), "sourceName", null);
        setIntField(term45669, term45669.getClass(), "baseLineno", 0);
        setIntField(term45669, term45669.getClass(), "endLineno", 0);
        setField(term45669, term45669.getClass(), "functions", null);
        setField(term45669, term45669.getClass(), "regexps", null);
        setField(term45669, term45669.getClass(), "itsVariables", null);
        setField(term45669, term45669.getClass(), "itsConst", null);
        setField(term45669, term45669.getClass(), "itsVariableNames", null);
        setIntField(term45669, term45669.getClass(), "varStart", 0);
        setField(term45669, term45669.getClass(), "compilerData", null);
        setIntField(term45669, term45669.getClass(), "type", 0);
        setField(term45669, term45669.getClass(), "next", null);
        setField(term45669, term45669.getClass(), "first", null);
        setField(term45669, term45669.getClass(), "last", null);
        setField(term45669, term45669.getClass(), "propListHead", null);
        setIntField(term45669, term45669.getClass(), "sourcePosition", 0);
        setField(term45669, term45669.getClass(), "jsType", null);
        setField(term45669, term45669.getClass(), "parent", null);
        term45632 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45632, term45632.getClass(), "functionName", null);
        setBooleanField(term45632, term45632.getClass(), "itsNeedsActivation", false);
        setIntField(term45632, term45632.getClass(), "itsFunctionType", 0);
        setBooleanField(term45632, term45632.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45632, term45632.getClass(), "encodedSourceStart", 0);
        setIntField(term45632, term45632.getClass(), "encodedSourceEnd", 0);
        setField(term45632, term45632.getClass(), "sourceName", null);
        setIntField(term45632, term45632.getClass(), "baseLineno", 0);
        setIntField(term45632, term45632.getClass(), "endLineno", 0);
        setField(term45632, term45632.getClass(), "functions", null);
        setField(term45632, term45632.getClass(), "regexps", null);
        setField(term45632, term45632.getClass(), "itsVariables", null);
        setField(term45632, term45632.getClass(), "itsConst", null);
        setField(term45632, term45632.getClass(), "itsVariableNames", null);
        setIntField(term45632, term45632.getClass(), "varStart", 0);
        setField(term45632, term45632.getClass(), "compilerData", null);
        setIntField(term45632, term45632.getClass(), "type", 0);
        setField(term45632, term45632.getClass(), "next", null);
        setField(term45632, term45632.getClass(), "first", null);
        setField(term45632, term45632.getClass(), "last", null);
        setField(term45632, term45632.getClass(), "propListHead", null);
        setIntField(term45632, term45632.getClass(), "sourcePosition", 0);
        setField(term45632, term45632.getClass(), "jsType", null);
        setField(term45632, term45632.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term45349;
        args[1] = term45439;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term45263, args);
        assertTrue(recursiveEquals(term45263, term45667));
        assertTrue(recursiveEquals(term45349, term45668));
        assertTrue(recursiveEquals(term45439, term45669));
        assertTrue(recursiveEquals(retValue, term45632));
    }

};


