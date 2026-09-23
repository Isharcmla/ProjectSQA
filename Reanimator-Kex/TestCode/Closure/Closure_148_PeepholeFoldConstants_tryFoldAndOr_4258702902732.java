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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term785308;
     Object term785394;
     Object term785572;
     Object term785642;
     Object term785780;
     Object term785781;
     Object term785783;
     Object term785784;
     Object term785689;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term785308 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term785394 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term785480 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term785480, term785480.getClass(), "type", 108);
        setField(term785394, term785394.getClass(), "parent", term785480);
        setIntField(term785394, term785394.getClass(), "type", 0);
        term785572 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term785572, term785572.getClass(), "type", 34);
        term785642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term785642, term785642.getClass(), "type", 63);
        term785780 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term785780, term785780.getClass(), "currentTraversal", null);
        term785781 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term785782 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term785781, term785781.getClass(), "functionName", null);
        setBooleanField(term785781, term785781.getClass(), "itsNeedsActivation", false);
        setIntField(term785781, term785781.getClass(), "itsFunctionType", 0);
        setBooleanField(term785781, term785781.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term785781, term785781.getClass(), "encodedSourceStart", 0);
        setIntField(term785781, term785781.getClass(), "encodedSourceEnd", 0);
        setField(term785781, term785781.getClass(), "sourceName", null);
        setIntField(term785781, term785781.getClass(), "baseLineno", 0);
        setIntField(term785781, term785781.getClass(), "endLineno", 0);
        setField(term785781, term785781.getClass(), "functions", null);
        setField(term785781, term785781.getClass(), "regexps", null);
        setField(term785781, term785781.getClass(), "itsVariables", null);
        setField(term785781, term785781.getClass(), "itsConst", null);
        setField(term785781, term785781.getClass(), "itsVariableNames", null);
        setIntField(term785781, term785781.getClass(), "varStart", 0);
        setField(term785781, term785781.getClass(), "compilerData", null);
        setIntField(term785781, term785781.getClass(), "type", 0);
        setField(term785781, term785781.getClass(), "next", null);
        setField(term785781, term785781.getClass(), "first", null);
        setField(term785781, term785781.getClass(), "last", null);
        setField(term785781, term785781.getClass(), "propListHead", null);
        setIntField(term785781, term785781.getClass(), "sourcePosition", 0);
        setField(term785781, term785781.getClass(), "jsType", null);
        setField(term785782, term785782.getClass(), "functionName", null);
        setBooleanField(term785782, term785782.getClass(), "itsNeedsActivation", false);
        setIntField(term785782, term785782.getClass(), "itsFunctionType", 0);
        setBooleanField(term785782, term785782.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term785782, term785782.getClass(), "encodedSourceStart", 0);
        setIntField(term785782, term785782.getClass(), "encodedSourceEnd", 0);
        setField(term785782, term785782.getClass(), "sourceName", null);
        setIntField(term785782, term785782.getClass(), "baseLineno", 0);
        setIntField(term785782, term785782.getClass(), "endLineno", 0);
        setField(term785782, term785782.getClass(), "functions", null);
        setField(term785782, term785782.getClass(), "regexps", null);
        setField(term785782, term785782.getClass(), "itsVariables", null);
        setField(term785782, term785782.getClass(), "itsConst", null);
        setField(term785782, term785782.getClass(), "itsVariableNames", null);
        setIntField(term785782, term785782.getClass(), "varStart", 0);
        setField(term785782, term785782.getClass(), "compilerData", null);
        setIntField(term785782, term785782.getClass(), "type", 108);
        setField(term785782, term785782.getClass(), "next", null);
        setField(term785782, term785782.getClass(), "first", null);
        setField(term785782, term785782.getClass(), "last", null);
        setField(term785782, term785782.getClass(), "propListHead", null);
        setIntField(term785782, term785782.getClass(), "sourcePosition", 0);
        setField(term785782, term785782.getClass(), "jsType", null);
        setField(term785782, term785782.getClass(), "parent", null);
        setField(term785781, term785781.getClass(), "parent", term785782);
        term785783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term785783, term785783.getClass(), "str", null);
        setIntField(term785783, term785783.getClass(), "type", 34);
        setField(term785783, term785783.getClass(), "next", null);
        setField(term785783, term785783.getClass(), "first", null);
        setField(term785783, term785783.getClass(), "last", null);
        setField(term785783, term785783.getClass(), "propListHead", null);
        setIntField(term785783, term785783.getClass(), "sourcePosition", 0);
        setField(term785783, term785783.getClass(), "jsType", null);
        setField(term785783, term785783.getClass(), "parent", null);
        term785784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term785784, term785784.getClass(), "type", 63);
        setField(term785784, term785784.getClass(), "next", null);
        setField(term785784, term785784.getClass(), "first", null);
        setField(term785784, term785784.getClass(), "last", null);
        setField(term785784, term785784.getClass(), "propListHead", null);
        setIntField(term785784, term785784.getClass(), "sourcePosition", 0);
        setField(term785784, term785784.getClass(), "jsType", null);
        setField(term785784, term785784.getClass(), "parent", null);
        term785689 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term785700 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term785689, term785689.getClass(), "functionName", null);
        setBooleanField(term785689, term785689.getClass(), "itsNeedsActivation", false);
        setIntField(term785689, term785689.getClass(), "itsFunctionType", 0);
        setBooleanField(term785689, term785689.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term785689, term785689.getClass(), "encodedSourceStart", 0);
        setIntField(term785689, term785689.getClass(), "encodedSourceEnd", 0);
        setField(term785689, term785689.getClass(), "sourceName", null);
        setIntField(term785689, term785689.getClass(), "baseLineno", 0);
        setIntField(term785689, term785689.getClass(), "endLineno", 0);
        setField(term785689, term785689.getClass(), "functions", null);
        setField(term785689, term785689.getClass(), "regexps", null);
        setField(term785689, term785689.getClass(), "itsVariables", null);
        setField(term785689, term785689.getClass(), "itsConst", null);
        setField(term785689, term785689.getClass(), "itsVariableNames", null);
        setIntField(term785689, term785689.getClass(), "varStart", 0);
        setField(term785689, term785689.getClass(), "compilerData", null);
        setIntField(term785689, term785689.getClass(), "type", 0);
        setField(term785689, term785689.getClass(), "next", null);
        setField(term785689, term785689.getClass(), "first", null);
        setField(term785689, term785689.getClass(), "last", null);
        setField(term785689, term785689.getClass(), "propListHead", null);
        setIntField(term785689, term785689.getClass(), "sourcePosition", 0);
        setField(term785689, term785689.getClass(), "jsType", null);
        setField(term785700, term785700.getClass(), "functionName", null);
        setBooleanField(term785700, term785700.getClass(), "itsNeedsActivation", false);
        setIntField(term785700, term785700.getClass(), "itsFunctionType", 0);
        setBooleanField(term785700, term785700.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term785700, term785700.getClass(), "encodedSourceStart", 0);
        setIntField(term785700, term785700.getClass(), "encodedSourceEnd", 0);
        setField(term785700, term785700.getClass(), "sourceName", null);
        setIntField(term785700, term785700.getClass(), "baseLineno", 0);
        setIntField(term785700, term785700.getClass(), "endLineno", 0);
        setField(term785700, term785700.getClass(), "functions", null);
        setField(term785700, term785700.getClass(), "regexps", null);
        setField(term785700, term785700.getClass(), "itsVariables", null);
        setField(term785700, term785700.getClass(), "itsConst", null);
        setField(term785700, term785700.getClass(), "itsVariableNames", null);
        setIntField(term785700, term785700.getClass(), "varStart", 0);
        setField(term785700, term785700.getClass(), "compilerData", null);
        setIntField(term785700, term785700.getClass(), "type", 108);
        setField(term785700, term785700.getClass(), "next", null);
        setField(term785700, term785700.getClass(), "first", null);
        setField(term785700, term785700.getClass(), "last", null);
        setField(term785700, term785700.getClass(), "propListHead", null);
        setIntField(term785700, term785700.getClass(), "sourcePosition", 0);
        setField(term785700, term785700.getClass(), "jsType", null);
        setField(term785700, term785700.getClass(), "parent", null);
        setField(term785689, term785689.getClass(), "parent", term785700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term785394;
        args[1] = term785572;
        args[2] = term785642;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term785308, args);
        assertTrue(recursiveEquals(term785308, term785780));
        assertTrue(recursiveEquals(term785394, term785781));
        assertTrue(recursiveEquals(term785572, term785783));
        assertTrue(recursiveEquals(term785642, term785784));
        assertTrue(recursiveEquals(retValue, term785689));
    }

};


