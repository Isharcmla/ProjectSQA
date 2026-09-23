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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540117;
     Object term540209;
     Object term540924;
     Object term540925;
     Object term540855;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540117 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term540209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term540295 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term540295, term540295.getClass(), "next", term540365);
        setField(term540209, term540209.getClass(), "first", term540295);
        setIntField(term540209, term540209.getClass(), "type", 100);
        term540924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term540924, term540924.getClass(), "currentTraversal", null);
        term540925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term540926 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term540925, term540925.getClass(), "str", null);
        setIntField(term540925, term540925.getClass(), "type", 100);
        setField(term540925, term540925.getClass(), "next", null);
        setField(term540926, term540926.getClass(), "functionName", null);
        setBooleanField(term540926, term540926.getClass(), "itsNeedsActivation", false);
        setIntField(term540926, term540926.getClass(), "itsFunctionType", 0);
        setBooleanField(term540926, term540926.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term540926, term540926.getClass(), "encodedSourceStart", 0);
        setIntField(term540926, term540926.getClass(), "encodedSourceEnd", 0);
        setField(term540926, term540926.getClass(), "sourceName", null);
        setIntField(term540926, term540926.getClass(), "baseLineno", 0);
        setIntField(term540926, term540926.getClass(), "endLineno", 0);
        setField(term540926, term540926.getClass(), "functions", null);
        setField(term540926, term540926.getClass(), "regexps", null);
        setField(term540926, term540926.getClass(), "itsVariables", null);
        setField(term540926, term540926.getClass(), "itsConst", null);
        setField(term540926, term540926.getClass(), "itsVariableNames", null);
        setIntField(term540926, term540926.getClass(), "varStart", 0);
        setField(term540926, term540926.getClass(), "compilerData", null);
        setIntField(term540926, term540926.getClass(), "type", 0);
        setIntField(term540927, term540927.getClass(), "type", 0);
        setField(term540927, term540927.getClass(), "next", null);
        setField(term540927, term540927.getClass(), "first", null);
        setField(term540927, term540927.getClass(), "last", null);
        setField(term540927, term540927.getClass(), "propListHead", null);
        setIntField(term540927, term540927.getClass(), "sourcePosition", 0);
        setField(term540927, term540927.getClass(), "jsType", null);
        setField(term540927, term540927.getClass(), "parent", null);
        setField(term540926, term540926.getClass(), "next", term540927);
        setField(term540926, term540926.getClass(), "first", null);
        setField(term540926, term540926.getClass(), "last", null);
        setField(term540926, term540926.getClass(), "propListHead", null);
        setIntField(term540926, term540926.getClass(), "sourcePosition", 0);
        setField(term540926, term540926.getClass(), "jsType", null);
        setField(term540926, term540926.getClass(), "parent", null);
        setField(term540925, term540925.getClass(), "first", term540926);
        setField(term540925, term540925.getClass(), "last", null);
        setField(term540925, term540925.getClass(), "propListHead", null);
        setIntField(term540925, term540925.getClass(), "sourcePosition", 0);
        setField(term540925, term540925.getClass(), "jsType", null);
        setField(term540925, term540925.getClass(), "parent", null);
        term540855 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term540857 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term540855, term540855.getClass(), "str", null);
        setIntField(term540855, term540855.getClass(), "type", 100);
        setField(term540855, term540855.getClass(), "next", null);
        setField(term540857, term540857.getClass(), "functionName", null);
        setBooleanField(term540857, term540857.getClass(), "itsNeedsActivation", false);
        setIntField(term540857, term540857.getClass(), "itsFunctionType", 0);
        setBooleanField(term540857, term540857.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term540857, term540857.getClass(), "encodedSourceStart", 0);
        setIntField(term540857, term540857.getClass(), "encodedSourceEnd", 0);
        setField(term540857, term540857.getClass(), "sourceName", null);
        setIntField(term540857, term540857.getClass(), "baseLineno", 0);
        setIntField(term540857, term540857.getClass(), "endLineno", 0);
        setField(term540857, term540857.getClass(), "functions", null);
        setField(term540857, term540857.getClass(), "regexps", null);
        setField(term540857, term540857.getClass(), "itsVariables", null);
        setField(term540857, term540857.getClass(), "itsConst", null);
        setField(term540857, term540857.getClass(), "itsVariableNames", null);
        setIntField(term540857, term540857.getClass(), "varStart", 0);
        setField(term540857, term540857.getClass(), "compilerData", null);
        setIntField(term540857, term540857.getClass(), "type", 0);
        setIntField(term540867, term540867.getClass(), "type", 0);
        setField(term540867, term540867.getClass(), "next", null);
        setField(term540867, term540867.getClass(), "first", null);
        setField(term540867, term540867.getClass(), "last", null);
        setField(term540867, term540867.getClass(), "propListHead", null);
        setIntField(term540867, term540867.getClass(), "sourcePosition", 0);
        setField(term540867, term540867.getClass(), "jsType", null);
        setField(term540867, term540867.getClass(), "parent", null);
        setField(term540857, term540857.getClass(), "next", term540867);
        setField(term540857, term540857.getClass(), "first", null);
        setField(term540857, term540857.getClass(), "last", null);
        setField(term540857, term540857.getClass(), "propListHead", null);
        setIntField(term540857, term540857.getClass(), "sourcePosition", 0);
        setField(term540857, term540857.getClass(), "jsType", null);
        setField(term540857, term540857.getClass(), "parent", null);
        setField(term540855, term540855.getClass(), "first", term540857);
        setField(term540855, term540855.getClass(), "last", null);
        setField(term540855, term540855.getClass(), "propListHead", null);
        setIntField(term540855, term540855.getClass(), "sourcePosition", 0);
        setField(term540855, term540855.getClass(), "jsType", null);
        setField(term540855, term540855.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term540209;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term540117, args);
        assertTrue(recursiveEquals(term540117, term540924));
        assertTrue(recursiveEquals(term540209, term540925));
        assertTrue(recursiveEquals(retValue, term540855));
    }

};


