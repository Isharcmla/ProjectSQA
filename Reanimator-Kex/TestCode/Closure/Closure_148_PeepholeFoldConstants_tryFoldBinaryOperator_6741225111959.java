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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521812;
     Object term521898;
     Object term522505;
     Object term522506;
     Object term522436;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521812 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term521898 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term521968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term521898, term521898.getClass(), "first", term521898);
        setField(term521898, term521898.getClass(), "next", term521968);
        setIntField(term521898, term521898.getClass(), "type", 100);
        term522505 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term522505, term522505.getClass(), "currentTraversal", null);
        term522506 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term522507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term522506, term522506.getClass(), "functionName", null);
        setBooleanField(term522506, term522506.getClass(), "itsNeedsActivation", false);
        setIntField(term522506, term522506.getClass(), "itsFunctionType", 0);
        setBooleanField(term522506, term522506.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term522506, term522506.getClass(), "encodedSourceStart", 0);
        setIntField(term522506, term522506.getClass(), "encodedSourceEnd", 0);
        setField(term522506, term522506.getClass(), "sourceName", null);
        setIntField(term522506, term522506.getClass(), "baseLineno", 0);
        setIntField(term522506, term522506.getClass(), "endLineno", 0);
        setField(term522506, term522506.getClass(), "functions", null);
        setField(term522506, term522506.getClass(), "regexps", null);
        setField(term522506, term522506.getClass(), "itsVariables", null);
        setField(term522506, term522506.getClass(), "itsConst", null);
        setField(term522506, term522506.getClass(), "itsVariableNames", null);
        setIntField(term522506, term522506.getClass(), "varStart", 0);
        setField(term522506, term522506.getClass(), "compilerData", null);
        setIntField(term522506, term522506.getClass(), "type", 100);
        setIntField(term522507, term522507.getClass(), "type", 0);
        setField(term522507, term522507.getClass(), "next", null);
        setField(term522507, term522507.getClass(), "first", null);
        setField(term522507, term522507.getClass(), "last", null);
        setField(term522507, term522507.getClass(), "propListHead", null);
        setIntField(term522507, term522507.getClass(), "sourcePosition", 0);
        setField(term522507, term522507.getClass(), "jsType", null);
        setField(term522507, term522507.getClass(), "parent", null);
        setField(term522506, term522506.getClass(), "next", term522507);
        setField(term522506, term522506.getClass(), "first", term522506);
        setField(term522506, term522506.getClass(), "last", null);
        setField(term522506, term522506.getClass(), "propListHead", null);
        setIntField(term522506, term522506.getClass(), "sourcePosition", 0);
        setField(term522506, term522506.getClass(), "jsType", null);
        setField(term522506, term522506.getClass(), "parent", null);
        term522436 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term522446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term522436, term522436.getClass(), "functionName", null);
        setBooleanField(term522436, term522436.getClass(), "itsNeedsActivation", false);
        setIntField(term522436, term522436.getClass(), "itsFunctionType", 0);
        setBooleanField(term522436, term522436.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term522436, term522436.getClass(), "encodedSourceStart", 0);
        setIntField(term522436, term522436.getClass(), "encodedSourceEnd", 0);
        setField(term522436, term522436.getClass(), "sourceName", null);
        setIntField(term522436, term522436.getClass(), "baseLineno", 0);
        setIntField(term522436, term522436.getClass(), "endLineno", 0);
        setField(term522436, term522436.getClass(), "functions", null);
        setField(term522436, term522436.getClass(), "regexps", null);
        setField(term522436, term522436.getClass(), "itsVariables", null);
        setField(term522436, term522436.getClass(), "itsConst", null);
        setField(term522436, term522436.getClass(), "itsVariableNames", null);
        setIntField(term522436, term522436.getClass(), "varStart", 0);
        setField(term522436, term522436.getClass(), "compilerData", null);
        setIntField(term522436, term522436.getClass(), "type", 100);
        setIntField(term522446, term522446.getClass(), "type", 0);
        setField(term522446, term522446.getClass(), "next", null);
        setField(term522446, term522446.getClass(), "first", null);
        setField(term522446, term522446.getClass(), "last", null);
        setField(term522446, term522446.getClass(), "propListHead", null);
        setIntField(term522446, term522446.getClass(), "sourcePosition", 0);
        setField(term522446, term522446.getClass(), "jsType", null);
        setField(term522446, term522446.getClass(), "parent", null);
        setField(term522436, term522436.getClass(), "next", term522446);
        setField(term522436, term522436.getClass(), "first", term522436);
        setField(term522436, term522436.getClass(), "last", null);
        setField(term522436, term522436.getClass(), "propListHead", null);
        setIntField(term522436, term522436.getClass(), "sourcePosition", 0);
        setField(term522436, term522436.getClass(), "jsType", null);
        setField(term522436, term522436.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term521898;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term521812, args);
        assertTrue(recursiveEquals(term521812, term522505));
        assertTrue(recursiveEquals(term521898, term522506));
        assertTrue(recursiveEquals(retValue, term522436));
    }

};


