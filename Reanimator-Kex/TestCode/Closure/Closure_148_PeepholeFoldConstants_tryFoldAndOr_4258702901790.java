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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466416;
     Object term466502;
     Object term466658;
     Object term466744;
     Object term466927;
     Object term466928;
     Object term466930;
     Object term466931;
     Object term466836;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466416 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term466502 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term466572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term466572, term466572.getClass(), "type", 108);
        setField(term466502, term466502.getClass(), "parent", term466572);
        setIntField(term466502, term466502.getClass(), "type", 0);
        term466658 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term466658, term466658.getClass(), "type", 73);
        term466744 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term466744, term466744.getClass(), "type", 63);
        term466927 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term466927, term466927.getClass(), "currentTraversal", null);
        term466928 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term466929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term466928, term466928.getClass(), "functionName", null);
        setBooleanField(term466928, term466928.getClass(), "itsNeedsActivation", false);
        setIntField(term466928, term466928.getClass(), "itsFunctionType", 0);
        setBooleanField(term466928, term466928.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term466928, term466928.getClass(), "encodedSourceStart", 0);
        setIntField(term466928, term466928.getClass(), "encodedSourceEnd", 0);
        setField(term466928, term466928.getClass(), "sourceName", null);
        setIntField(term466928, term466928.getClass(), "baseLineno", 0);
        setIntField(term466928, term466928.getClass(), "endLineno", 0);
        setField(term466928, term466928.getClass(), "functions", null);
        setField(term466928, term466928.getClass(), "regexps", null);
        setField(term466928, term466928.getClass(), "itsVariables", null);
        setField(term466928, term466928.getClass(), "itsConst", null);
        setField(term466928, term466928.getClass(), "itsVariableNames", null);
        setIntField(term466928, term466928.getClass(), "varStart", 0);
        setField(term466928, term466928.getClass(), "compilerData", null);
        setIntField(term466928, term466928.getClass(), "type", 0);
        setField(term466928, term466928.getClass(), "next", null);
        setField(term466928, term466928.getClass(), "first", null);
        setField(term466928, term466928.getClass(), "last", null);
        setField(term466928, term466928.getClass(), "propListHead", null);
        setIntField(term466928, term466928.getClass(), "sourcePosition", 0);
        setField(term466928, term466928.getClass(), "jsType", null);
        setIntField(term466929, term466929.getClass(), "type", 108);
        setField(term466929, term466929.getClass(), "next", null);
        setField(term466929, term466929.getClass(), "first", null);
        setField(term466929, term466929.getClass(), "last", null);
        setField(term466929, term466929.getClass(), "propListHead", null);
        setIntField(term466929, term466929.getClass(), "sourcePosition", 0);
        setField(term466929, term466929.getClass(), "jsType", null);
        setField(term466929, term466929.getClass(), "parent", null);
        setField(term466928, term466928.getClass(), "parent", term466929);
        term466930 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term466930, term466930.getClass(), "functionName", null);
        setBooleanField(term466930, term466930.getClass(), "itsNeedsActivation", false);
        setIntField(term466930, term466930.getClass(), "itsFunctionType", 0);
        setBooleanField(term466930, term466930.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term466930, term466930.getClass(), "encodedSourceStart", 0);
        setIntField(term466930, term466930.getClass(), "encodedSourceEnd", 0);
        setField(term466930, term466930.getClass(), "sourceName", null);
        setIntField(term466930, term466930.getClass(), "baseLineno", 0);
        setIntField(term466930, term466930.getClass(), "endLineno", 0);
        setField(term466930, term466930.getClass(), "functions", null);
        setField(term466930, term466930.getClass(), "regexps", null);
        setField(term466930, term466930.getClass(), "itsVariables", null);
        setField(term466930, term466930.getClass(), "itsConst", null);
        setField(term466930, term466930.getClass(), "itsVariableNames", null);
        setIntField(term466930, term466930.getClass(), "varStart", 0);
        setField(term466930, term466930.getClass(), "compilerData", null);
        setIntField(term466930, term466930.getClass(), "type", 73);
        setField(term466930, term466930.getClass(), "next", null);
        setField(term466930, term466930.getClass(), "first", null);
        setField(term466930, term466930.getClass(), "last", null);
        setField(term466930, term466930.getClass(), "propListHead", null);
        setIntField(term466930, term466930.getClass(), "sourcePosition", 0);
        setField(term466930, term466930.getClass(), "jsType", null);
        setField(term466930, term466930.getClass(), "parent", null);
        term466931 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term466931, term466931.getClass(), "functionName", null);
        setBooleanField(term466931, term466931.getClass(), "itsNeedsActivation", false);
        setIntField(term466931, term466931.getClass(), "itsFunctionType", 0);
        setBooleanField(term466931, term466931.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term466931, term466931.getClass(), "encodedSourceStart", 0);
        setIntField(term466931, term466931.getClass(), "encodedSourceEnd", 0);
        setField(term466931, term466931.getClass(), "sourceName", null);
        setIntField(term466931, term466931.getClass(), "baseLineno", 0);
        setIntField(term466931, term466931.getClass(), "endLineno", 0);
        setField(term466931, term466931.getClass(), "functions", null);
        setField(term466931, term466931.getClass(), "regexps", null);
        setField(term466931, term466931.getClass(), "itsVariables", null);
        setField(term466931, term466931.getClass(), "itsConst", null);
        setField(term466931, term466931.getClass(), "itsVariableNames", null);
        setIntField(term466931, term466931.getClass(), "varStart", 0);
        setField(term466931, term466931.getClass(), "compilerData", null);
        setIntField(term466931, term466931.getClass(), "type", 63);
        setField(term466931, term466931.getClass(), "next", null);
        setField(term466931, term466931.getClass(), "first", null);
        setField(term466931, term466931.getClass(), "last", null);
        setField(term466931, term466931.getClass(), "propListHead", null);
        setIntField(term466931, term466931.getClass(), "sourcePosition", 0);
        setField(term466931, term466931.getClass(), "jsType", null);
        setField(term466931, term466931.getClass(), "parent", null);
        term466836 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term466847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term466836, term466836.getClass(), "functionName", null);
        setBooleanField(term466836, term466836.getClass(), "itsNeedsActivation", false);
        setIntField(term466836, term466836.getClass(), "itsFunctionType", 0);
        setBooleanField(term466836, term466836.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term466836, term466836.getClass(), "encodedSourceStart", 0);
        setIntField(term466836, term466836.getClass(), "encodedSourceEnd", 0);
        setField(term466836, term466836.getClass(), "sourceName", null);
        setIntField(term466836, term466836.getClass(), "baseLineno", 0);
        setIntField(term466836, term466836.getClass(), "endLineno", 0);
        setField(term466836, term466836.getClass(), "functions", null);
        setField(term466836, term466836.getClass(), "regexps", null);
        setField(term466836, term466836.getClass(), "itsVariables", null);
        setField(term466836, term466836.getClass(), "itsConst", null);
        setField(term466836, term466836.getClass(), "itsVariableNames", null);
        setIntField(term466836, term466836.getClass(), "varStart", 0);
        setField(term466836, term466836.getClass(), "compilerData", null);
        setIntField(term466836, term466836.getClass(), "type", 0);
        setField(term466836, term466836.getClass(), "next", null);
        setField(term466836, term466836.getClass(), "first", null);
        setField(term466836, term466836.getClass(), "last", null);
        setField(term466836, term466836.getClass(), "propListHead", null);
        setIntField(term466836, term466836.getClass(), "sourcePosition", 0);
        setField(term466836, term466836.getClass(), "jsType", null);
        setIntField(term466847, term466847.getClass(), "type", 108);
        setField(term466847, term466847.getClass(), "next", null);
        setField(term466847, term466847.getClass(), "first", null);
        setField(term466847, term466847.getClass(), "last", null);
        setField(term466847, term466847.getClass(), "propListHead", null);
        setIntField(term466847, term466847.getClass(), "sourcePosition", 0);
        setField(term466847, term466847.getClass(), "jsType", null);
        setField(term466847, term466847.getClass(), "parent", null);
        setField(term466836, term466836.getClass(), "parent", term466847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term466502;
        args[1] = term466658;
        args[2] = term466744;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term466416, args);
        assertTrue(recursiveEquals(term466416, term466927));
        assertTrue(recursiveEquals(term466502, term466928));
        assertTrue(recursiveEquals(term466658, term466930));
        assertTrue(recursiveEquals(term466744, term466931));
        assertTrue(recursiveEquals(retValue, term466836));
    }

};


