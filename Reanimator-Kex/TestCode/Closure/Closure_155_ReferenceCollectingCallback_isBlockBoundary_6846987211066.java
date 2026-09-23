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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273316;
     Object term273810;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273316 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term273316, term273316.getClass(), "type", 119);
        term273810 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term273810, term273810.getClass(), "functionName", null);
        setBooleanField(term273810, term273810.getClass(), "itsNeedsActivation", false);
        setIntField(term273810, term273810.getClass(), "itsFunctionType", 0);
        setBooleanField(term273810, term273810.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term273810, term273810.getClass(), "encodedSourceStart", 0);
        setIntField(term273810, term273810.getClass(), "encodedSourceEnd", 0);
        setField(term273810, term273810.getClass(), "sourceName", null);
        setIntField(term273810, term273810.getClass(), "baseLineno", 0);
        setIntField(term273810, term273810.getClass(), "endLineno", 0);
        setField(term273810, term273810.getClass(), "functions", null);
        setField(term273810, term273810.getClass(), "regexps", null);
        setField(term273810, term273810.getClass(), "itsVariables", null);
        setField(term273810, term273810.getClass(), "itsConst", null);
        setField(term273810, term273810.getClass(), "itsVariableNames", null);
        setIntField(term273810, term273810.getClass(), "varStart", 0);
        setField(term273810, term273810.getClass(), "compilerData", null);
        setIntField(term273810, term273810.getClass(), "type", 119);
        setField(term273810, term273810.getClass(), "next", null);
        setField(term273810, term273810.getClass(), "first", null);
        setField(term273810, term273810.getClass(), "last", null);
        setField(term273810, term273810.getClass(), "propListHead", null);
        setIntField(term273810, term273810.getClass(), "sourcePosition", 0);
        setField(term273810, term273810.getClass(), "jsType", null);
        setField(term273810, term273810.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term273316;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term273316, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


