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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378563;
     Object term378649;
     Object term379321;
     Object term379322;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term378649 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term378649, term378649.getClass(), "type", 12);
        term379321 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term379321, term379321.getClass(), "functionName", null);
        setBooleanField(term379321, term379321.getClass(), "itsNeedsActivation", false);
        setIntField(term379321, term379321.getClass(), "itsFunctionType", 0);
        setBooleanField(term379321, term379321.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term379321, term379321.getClass(), "encodedSourceStart", 0);
        setIntField(term379321, term379321.getClass(), "encodedSourceEnd", 0);
        setField(term379321, term379321.getClass(), "sourceName", null);
        setIntField(term379321, term379321.getClass(), "baseLineno", 0);
        setIntField(term379321, term379321.getClass(), "endLineno", 0);
        setField(term379321, term379321.getClass(), "functions", null);
        setField(term379321, term379321.getClass(), "regexps", null);
        setField(term379321, term379321.getClass(), "itsVariables", null);
        setField(term379321, term379321.getClass(), "itsConst", null);
        setField(term379321, term379321.getClass(), "itsVariableNames", null);
        setIntField(term379321, term379321.getClass(), "varStart", 0);
        setField(term379321, term379321.getClass(), "compilerData", null);
        setIntField(term379321, term379321.getClass(), "type", 12);
        setField(term379321, term379321.getClass(), "next", null);
        setField(term379321, term379321.getClass(), "first", null);
        setField(term379321, term379321.getClass(), "last", null);
        setField(term379321, term379321.getClass(), "propListHead", null);
        setIntField(term379321, term379321.getClass(), "sourcePosition", 0);
        setField(term379321, term379321.getClass(), "jsType", null);
        setField(term379321, term379321.getClass(), "parent", null);
        term379322 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term379322, term379322.getClass(), "functionName", null);
        setBooleanField(term379322, term379322.getClass(), "itsNeedsActivation", false);
        setIntField(term379322, term379322.getClass(), "itsFunctionType", 0);
        setBooleanField(term379322, term379322.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term379322, term379322.getClass(), "encodedSourceStart", 0);
        setIntField(term379322, term379322.getClass(), "encodedSourceEnd", 0);
        setField(term379322, term379322.getClass(), "sourceName", null);
        setIntField(term379322, term379322.getClass(), "baseLineno", 0);
        setIntField(term379322, term379322.getClass(), "endLineno", 0);
        setField(term379322, term379322.getClass(), "functions", null);
        setField(term379322, term379322.getClass(), "regexps", null);
        setField(term379322, term379322.getClass(), "itsVariables", null);
        setField(term379322, term379322.getClass(), "itsConst", null);
        setField(term379322, term379322.getClass(), "itsVariableNames", null);
        setIntField(term379322, term379322.getClass(), "varStart", 0);
        setField(term379322, term379322.getClass(), "compilerData", null);
        setIntField(term379322, term379322.getClass(), "type", 0);
        setField(term379322, term379322.getClass(), "next", null);
        setField(term379322, term379322.getClass(), "first", null);
        setField(term379322, term379322.getClass(), "last", null);
        setField(term379322, term379322.getClass(), "propListHead", null);
        setIntField(term379322, term379322.getClass(), "sourcePosition", 0);
        setField(term379322, term379322.getClass(), "jsType", null);
        setField(term379322, term379322.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term378563;
        args[1] = term378649;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term378563, term379321));
        assertTrue(recursiveEquals(term378649, term379322));
        assertTrue(recursiveEquals(retValue, false));
    }

};


