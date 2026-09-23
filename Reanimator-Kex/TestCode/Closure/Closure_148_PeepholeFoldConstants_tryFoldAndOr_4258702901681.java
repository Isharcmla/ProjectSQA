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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432247;
     Object term432339;
     Object term432425;
     Object term432886;
     Object term432887;
     Object term432888;
     Object term432847;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432247 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term432339 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term432339, term432339.getClass(), "parent", null);
        setIntField(term432339, term432339.getClass(), "type", 63);
        term432425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term432425, term432425.getClass(), "type", 63);
        term432886 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term432886, term432886.getClass(), "currentTraversal", null);
        term432887 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term432887, term432887.getClass(), "str", null);
        setIntField(term432887, term432887.getClass(), "type", 63);
        setField(term432887, term432887.getClass(), "next", null);
        setField(term432887, term432887.getClass(), "first", null);
        setField(term432887, term432887.getClass(), "last", null);
        setField(term432887, term432887.getClass(), "propListHead", null);
        setIntField(term432887, term432887.getClass(), "sourcePosition", 0);
        setField(term432887, term432887.getClass(), "jsType", null);
        setField(term432887, term432887.getClass(), "parent", null);
        term432888 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term432888, term432888.getClass(), "functionName", null);
        setBooleanField(term432888, term432888.getClass(), "itsNeedsActivation", false);
        setIntField(term432888, term432888.getClass(), "itsFunctionType", 0);
        setBooleanField(term432888, term432888.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term432888, term432888.getClass(), "encodedSourceStart", 0);
        setIntField(term432888, term432888.getClass(), "encodedSourceEnd", 0);
        setField(term432888, term432888.getClass(), "sourceName", null);
        setIntField(term432888, term432888.getClass(), "baseLineno", 0);
        setIntField(term432888, term432888.getClass(), "endLineno", 0);
        setField(term432888, term432888.getClass(), "functions", null);
        setField(term432888, term432888.getClass(), "regexps", null);
        setField(term432888, term432888.getClass(), "itsVariables", null);
        setField(term432888, term432888.getClass(), "itsConst", null);
        setField(term432888, term432888.getClass(), "itsVariableNames", null);
        setIntField(term432888, term432888.getClass(), "varStart", 0);
        setField(term432888, term432888.getClass(), "compilerData", null);
        setIntField(term432888, term432888.getClass(), "type", 63);
        setField(term432888, term432888.getClass(), "next", null);
        setField(term432888, term432888.getClass(), "first", null);
        setField(term432888, term432888.getClass(), "last", null);
        setField(term432888, term432888.getClass(), "propListHead", null);
        setIntField(term432888, term432888.getClass(), "sourcePosition", 0);
        setField(term432888, term432888.getClass(), "jsType", null);
        setField(term432888, term432888.getClass(), "parent", null);
        term432847 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term432847, term432847.getClass(), "str", null);
        setIntField(term432847, term432847.getClass(), "type", 63);
        setField(term432847, term432847.getClass(), "next", null);
        setField(term432847, term432847.getClass(), "first", null);
        setField(term432847, term432847.getClass(), "last", null);
        setField(term432847, term432847.getClass(), "propListHead", null);
        setIntField(term432847, term432847.getClass(), "sourcePosition", 0);
        setField(term432847, term432847.getClass(), "jsType", null);
        setField(term432847, term432847.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term432339;
        args[1] = term432425;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term432247, args);
        assertTrue(recursiveEquals(term432247, term432886));
        assertTrue(recursiveEquals(term432339, term432887));
        assertTrue(recursiveEquals(term432425, term432888));
        assertTrue(recursiveEquals(retValue, term432847));
    }

};


