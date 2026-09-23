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

public class PeepholeFoldConstants_tryFoldTypeof_1036786877495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127932;
     Object term128024;
     Object term133945;
     Object term133946;
     Object term133899;

    public PeepholeFoldConstants_tryFoldTypeof_1036786877495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127932 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term128024 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term128110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term128024, term128024.getClass(), "type", 32);
        setField(term128024, term128024.getClass(), "first", term128110);
        term133945 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term133945, term133945.getClass(), "currentTraversal", null);
        term133946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term133947 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term133946, term133946.getClass(), "str", null);
        setIntField(term133946, term133946.getClass(), "type", 32);
        setField(term133946, term133946.getClass(), "next", null);
        setField(term133947, term133947.getClass(), "functionName", null);
        setBooleanField(term133947, term133947.getClass(), "itsNeedsActivation", false);
        setIntField(term133947, term133947.getClass(), "itsFunctionType", 0);
        setBooleanField(term133947, term133947.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term133947, term133947.getClass(), "encodedSourceStart", 0);
        setIntField(term133947, term133947.getClass(), "encodedSourceEnd", 0);
        setField(term133947, term133947.getClass(), "sourceName", null);
        setIntField(term133947, term133947.getClass(), "baseLineno", 0);
        setIntField(term133947, term133947.getClass(), "endLineno", 0);
        setField(term133947, term133947.getClass(), "functions", null);
        setField(term133947, term133947.getClass(), "regexps", null);
        setField(term133947, term133947.getClass(), "itsVariables", null);
        setField(term133947, term133947.getClass(), "itsConst", null);
        setField(term133947, term133947.getClass(), "itsVariableNames", null);
        setIntField(term133947, term133947.getClass(), "varStart", 0);
        setField(term133947, term133947.getClass(), "compilerData", null);
        setIntField(term133947, term133947.getClass(), "type", 0);
        setField(term133947, term133947.getClass(), "next", null);
        setField(term133947, term133947.getClass(), "first", null);
        setField(term133947, term133947.getClass(), "last", null);
        setField(term133947, term133947.getClass(), "propListHead", null);
        setIntField(term133947, term133947.getClass(), "sourcePosition", 0);
        setField(term133947, term133947.getClass(), "jsType", null);
        setField(term133947, term133947.getClass(), "parent", null);
        setField(term133946, term133946.getClass(), "first", term133947);
        setField(term133946, term133946.getClass(), "last", null);
        setField(term133946, term133946.getClass(), "propListHead", null);
        setIntField(term133946, term133946.getClass(), "sourcePosition", 0);
        setField(term133946, term133946.getClass(), "jsType", null);
        setField(term133946, term133946.getClass(), "parent", null);
        term133899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term133901 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term133899, term133899.getClass(), "str", null);
        setIntField(term133899, term133899.getClass(), "type", 32);
        setField(term133899, term133899.getClass(), "next", null);
        setField(term133901, term133901.getClass(), "functionName", null);
        setBooleanField(term133901, term133901.getClass(), "itsNeedsActivation", false);
        setIntField(term133901, term133901.getClass(), "itsFunctionType", 0);
        setBooleanField(term133901, term133901.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term133901, term133901.getClass(), "encodedSourceStart", 0);
        setIntField(term133901, term133901.getClass(), "encodedSourceEnd", 0);
        setField(term133901, term133901.getClass(), "sourceName", null);
        setIntField(term133901, term133901.getClass(), "baseLineno", 0);
        setIntField(term133901, term133901.getClass(), "endLineno", 0);
        setField(term133901, term133901.getClass(), "functions", null);
        setField(term133901, term133901.getClass(), "regexps", null);
        setField(term133901, term133901.getClass(), "itsVariables", null);
        setField(term133901, term133901.getClass(), "itsConst", null);
        setField(term133901, term133901.getClass(), "itsVariableNames", null);
        setIntField(term133901, term133901.getClass(), "varStart", 0);
        setField(term133901, term133901.getClass(), "compilerData", null);
        setIntField(term133901, term133901.getClass(), "type", 0);
        setField(term133901, term133901.getClass(), "next", null);
        setField(term133901, term133901.getClass(), "first", null);
        setField(term133901, term133901.getClass(), "last", null);
        setField(term133901, term133901.getClass(), "propListHead", null);
        setIntField(term133901, term133901.getClass(), "sourcePosition", 0);
        setField(term133901, term133901.getClass(), "jsType", null);
        setField(term133901, term133901.getClass(), "parent", null);
        setField(term133899, term133899.getClass(), "first", term133901);
        setField(term133899, term133899.getClass(), "last", null);
        setField(term133899, term133899.getClass(), "propListHead", null);
        setIntField(term133899, term133899.getClass(), "sourcePosition", 0);
        setField(term133899, term133899.getClass(), "jsType", null);
        setField(term133899, term133899.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128024;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term127932, args);
        assertTrue(recursiveEquals(term127932, term133945));
        assertTrue(recursiveEquals(term128024, term133946));
        assertTrue(recursiveEquals(retValue, term133899));
    }

};


