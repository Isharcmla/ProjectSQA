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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28608;
     Object term28678;
     Object term29013;
     Object term29014;
     Object term28926;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28608 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28768 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term28854 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term28768, term28768.getClass(), "next", term28854);
        setIntField(term28768, term28768.getClass(), "type", 0);
        setField(term28678, term28678.getClass(), "first", term28768);
        setIntField(term28678, term28678.getClass(), "type", 101);
        setField(term28678, term28678.getClass(), "parent", null);
        term29013 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29013, term29013.getClass(), "currentTraversal", null);
        term29014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29015 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term29016 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term29014, term29014.getClass(), "type", 101);
        setField(term29014, term29014.getClass(), "next", null);
        setIntField(term29015, term29015.getClass(), "encodedSourceStart", 0);
        setIntField(term29015, term29015.getClass(), "encodedSourceEnd", 0);
        setField(term29015, term29015.getClass(), "sourceName", null);
        setIntField(term29015, term29015.getClass(), "baseLineno", 0);
        setIntField(term29015, term29015.getClass(), "endLineno", 0);
        setField(term29015, term29015.getClass(), "functions", null);
        setField(term29015, term29015.getClass(), "regexps", null);
        setField(term29015, term29015.getClass(), "itsVariables", null);
        setField(term29015, term29015.getClass(), "itsConst", null);
        setField(term29015, term29015.getClass(), "itsVariableNames", null);
        setIntField(term29015, term29015.getClass(), "varStart", 0);
        setField(term29015, term29015.getClass(), "compilerData", null);
        setIntField(term29015, term29015.getClass(), "type", 0);
        setField(term29016, term29016.getClass(), "functionName", null);
        setBooleanField(term29016, term29016.getClass(), "itsNeedsActivation", false);
        setIntField(term29016, term29016.getClass(), "itsFunctionType", 0);
        setBooleanField(term29016, term29016.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term29016, term29016.getClass(), "encodedSourceStart", 0);
        setIntField(term29016, term29016.getClass(), "encodedSourceEnd", 0);
        setField(term29016, term29016.getClass(), "sourceName", null);
        setIntField(term29016, term29016.getClass(), "baseLineno", 0);
        setIntField(term29016, term29016.getClass(), "endLineno", 0);
        setField(term29016, term29016.getClass(), "functions", null);
        setField(term29016, term29016.getClass(), "regexps", null);
        setField(term29016, term29016.getClass(), "itsVariables", null);
        setField(term29016, term29016.getClass(), "itsConst", null);
        setField(term29016, term29016.getClass(), "itsVariableNames", null);
        setIntField(term29016, term29016.getClass(), "varStart", 0);
        setField(term29016, term29016.getClass(), "compilerData", null);
        setIntField(term29016, term29016.getClass(), "type", 0);
        setField(term29016, term29016.getClass(), "next", null);
        setField(term29016, term29016.getClass(), "first", null);
        setField(term29016, term29016.getClass(), "last", null);
        setField(term29016, term29016.getClass(), "propListHead", null);
        setIntField(term29016, term29016.getClass(), "sourcePosition", 0);
        setField(term29016, term29016.getClass(), "jsType", null);
        setField(term29016, term29016.getClass(), "parent", null);
        setField(term29015, term29015.getClass(), "next", term29016);
        setField(term29015, term29015.getClass(), "first", null);
        setField(term29015, term29015.getClass(), "last", null);
        setField(term29015, term29015.getClass(), "propListHead", null);
        setIntField(term29015, term29015.getClass(), "sourcePosition", 0);
        setField(term29015, term29015.getClass(), "jsType", null);
        setField(term29015, term29015.getClass(), "parent", null);
        setField(term29014, term29014.getClass(), "first", term29015);
        setField(term29014, term29014.getClass(), "last", null);
        setField(term29014, term29014.getClass(), "propListHead", null);
        setIntField(term29014, term29014.getClass(), "sourcePosition", 0);
        setField(term29014, term29014.getClass(), "jsType", null);
        setField(term29014, term29014.getClass(), "parent", null);
        term28926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28928 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term28935 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term28926, term28926.getClass(), "type", 101);
        setField(term28926, term28926.getClass(), "next", null);
        setIntField(term28928, term28928.getClass(), "encodedSourceStart", 0);
        setIntField(term28928, term28928.getClass(), "encodedSourceEnd", 0);
        setField(term28928, term28928.getClass(), "sourceName", null);
        setIntField(term28928, term28928.getClass(), "baseLineno", 0);
        setIntField(term28928, term28928.getClass(), "endLineno", 0);
        setField(term28928, term28928.getClass(), "functions", null);
        setField(term28928, term28928.getClass(), "regexps", null);
        setField(term28928, term28928.getClass(), "itsVariables", null);
        setField(term28928, term28928.getClass(), "itsConst", null);
        setField(term28928, term28928.getClass(), "itsVariableNames", null);
        setIntField(term28928, term28928.getClass(), "varStart", 0);
        setField(term28928, term28928.getClass(), "compilerData", null);
        setIntField(term28928, term28928.getClass(), "type", 0);
        setField(term28935, term28935.getClass(), "functionName", null);
        setBooleanField(term28935, term28935.getClass(), "itsNeedsActivation", false);
        setIntField(term28935, term28935.getClass(), "itsFunctionType", 0);
        setBooleanField(term28935, term28935.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term28935, term28935.getClass(), "encodedSourceStart", 0);
        setIntField(term28935, term28935.getClass(), "encodedSourceEnd", 0);
        setField(term28935, term28935.getClass(), "sourceName", null);
        setIntField(term28935, term28935.getClass(), "baseLineno", 0);
        setIntField(term28935, term28935.getClass(), "endLineno", 0);
        setField(term28935, term28935.getClass(), "functions", null);
        setField(term28935, term28935.getClass(), "regexps", null);
        setField(term28935, term28935.getClass(), "itsVariables", null);
        setField(term28935, term28935.getClass(), "itsConst", null);
        setField(term28935, term28935.getClass(), "itsVariableNames", null);
        setIntField(term28935, term28935.getClass(), "varStart", 0);
        setField(term28935, term28935.getClass(), "compilerData", null);
        setIntField(term28935, term28935.getClass(), "type", 0);
        setField(term28935, term28935.getClass(), "next", null);
        setField(term28935, term28935.getClass(), "first", null);
        setField(term28935, term28935.getClass(), "last", null);
        setField(term28935, term28935.getClass(), "propListHead", null);
        setIntField(term28935, term28935.getClass(), "sourcePosition", 0);
        setField(term28935, term28935.getClass(), "jsType", null);
        setField(term28935, term28935.getClass(), "parent", null);
        setField(term28928, term28928.getClass(), "next", term28935);
        setField(term28928, term28928.getClass(), "first", null);
        setField(term28928, term28928.getClass(), "last", null);
        setField(term28928, term28928.getClass(), "propListHead", null);
        setIntField(term28928, term28928.getClass(), "sourcePosition", 0);
        setField(term28928, term28928.getClass(), "jsType", null);
        setField(term28928, term28928.getClass(), "parent", null);
        setField(term28926, term28926.getClass(), "first", term28928);
        setField(term28926, term28926.getClass(), "last", null);
        setField(term28926, term28926.getClass(), "propListHead", null);
        setIntField(term28926, term28926.getClass(), "sourcePosition", 0);
        setField(term28926, term28926.getClass(), "jsType", null);
        setField(term28926, term28926.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28678;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term28608, args);
        assertTrue(recursiveEquals(term28608, term29013));
        assertTrue(recursiveEquals(term28678, term29014));
        assertTrue(recursiveEquals(retValue, term28926));
    }

};


