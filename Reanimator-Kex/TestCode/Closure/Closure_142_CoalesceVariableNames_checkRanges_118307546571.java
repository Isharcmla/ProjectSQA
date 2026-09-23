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

public class CoalesceVariableNames_checkRanges_118307546571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27934;
     Object term28004;
     Object term28886;
     Object term28887;

    public CoalesceVariableNames_checkRanges_118307546571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27934 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term27934, term27934.getClass(), "compiler", null);
        term28004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term28160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28004, term28004.getClass(), "type", 0);
        setField(term28090, term28090.getClass(), "next", null);
        setIntField(term28090, term28090.getClass(), "type", 0);
        setField(term28090, term28090.getClass(), "parent", term28160);
        setField(term28004, term28004.getClass(), "first", term28090);
        term28886 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term28886, term28886.getClass(), "compiler", null);
        setField(term28886, term28886.getClass(), "colorings", null);
        setBooleanField(term28886, term28886.getClass(), "usePseudoNames", false);
        term28887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28888 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term28889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28887, term28887.getClass(), "type", 0);
        setField(term28887, term28887.getClass(), "next", null);
        setField(term28888, term28888.getClass(), "functionName", null);
        setBooleanField(term28888, term28888.getClass(), "itsNeedsActivation", false);
        setIntField(term28888, term28888.getClass(), "itsFunctionType", 0);
        setBooleanField(term28888, term28888.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term28888, term28888.getClass(), "encodedSourceStart", 0);
        setIntField(term28888, term28888.getClass(), "encodedSourceEnd", 0);
        setField(term28888, term28888.getClass(), "sourceName", null);
        setIntField(term28888, term28888.getClass(), "baseLineno", 0);
        setIntField(term28888, term28888.getClass(), "endLineno", 0);
        setField(term28888, term28888.getClass(), "functions", null);
        setField(term28888, term28888.getClass(), "regexps", null);
        setField(term28888, term28888.getClass(), "itsVariables", null);
        setField(term28888, term28888.getClass(), "itsConst", null);
        setField(term28888, term28888.getClass(), "itsVariableNames", null);
        setIntField(term28888, term28888.getClass(), "varStart", 0);
        setField(term28888, term28888.getClass(), "compilerData", null);
        setIntField(term28888, term28888.getClass(), "type", 0);
        setField(term28888, term28888.getClass(), "next", null);
        setField(term28888, term28888.getClass(), "first", null);
        setField(term28888, term28888.getClass(), "last", null);
        setField(term28888, term28888.getClass(), "propListHead", null);
        setIntField(term28888, term28888.getClass(), "sourcePosition", 0);
        setField(term28888, term28888.getClass(), "jsType", null);
        setIntField(term28889, term28889.getClass(), "type", 0);
        setField(term28889, term28889.getClass(), "next", null);
        setField(term28889, term28889.getClass(), "first", null);
        setField(term28889, term28889.getClass(), "last", null);
        setField(term28889, term28889.getClass(), "propListHead", null);
        setIntField(term28889, term28889.getClass(), "sourcePosition", 0);
        setField(term28889, term28889.getClass(), "jsType", null);
        setField(term28889, term28889.getClass(), "parent", null);
        setField(term28888, term28888.getClass(), "parent", term28889);
        setField(term28887, term28887.getClass(), "first", term28888);
        setField(term28887, term28887.getClass(), "last", null);
        setField(term28887, term28887.getClass(), "propListHead", null);
        setIntField(term28887, term28887.getClass(), "sourcePosition", 0);
        setField(term28887, term28887.getClass(), "jsType", null);
        setField(term28887, term28887.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28004;
        callMethod(klass, "checkRanges", argTypes, term27934, args);
        assertTrue(recursiveEquals(term27934, term28886));
        assertTrue(recursiveEquals(term28004, term28887));
    }

};


