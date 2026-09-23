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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69330;
     Object term69420;
     Object term70008;
     Object term70009;
     Object term69953;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69330 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term69420 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term69506 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term69598 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term69506, term69506.getClass(), "next", term69598);
        setIntField(term69506, term69506.getClass(), "type", 39);
        setField(term69420, term69420.getClass(), "first", term69506);
        setIntField(term69420, term69420.getClass(), "type", 22);
        term70008 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term70008, term70008.getClass(), "currentTraversal", null);
        term70009 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term70010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term70009, term70009.getClass(), "encodedSourceStart", 0);
        setIntField(term70009, term70009.getClass(), "encodedSourceEnd", 0);
        setField(term70009, term70009.getClass(), "sourceName", null);
        setIntField(term70009, term70009.getClass(), "baseLineno", 0);
        setIntField(term70009, term70009.getClass(), "endLineno", 0);
        setField(term70009, term70009.getClass(), "functions", null);
        setField(term70009, term70009.getClass(), "regexps", null);
        setField(term70009, term70009.getClass(), "itsVariables", null);
        setField(term70009, term70009.getClass(), "itsConst", null);
        setField(term70009, term70009.getClass(), "itsVariableNames", null);
        setIntField(term70009, term70009.getClass(), "varStart", 0);
        setField(term70009, term70009.getClass(), "compilerData", null);
        setIntField(term70009, term70009.getClass(), "type", 22);
        setField(term70009, term70009.getClass(), "next", null);
        setField(term70010, term70010.getClass(), "functionName", null);
        setBooleanField(term70010, term70010.getClass(), "itsNeedsActivation", false);
        setIntField(term70010, term70010.getClass(), "itsFunctionType", 0);
        setBooleanField(term70010, term70010.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term70010, term70010.getClass(), "encodedSourceStart", 0);
        setIntField(term70010, term70010.getClass(), "encodedSourceEnd", 0);
        setField(term70010, term70010.getClass(), "sourceName", null);
        setIntField(term70010, term70010.getClass(), "baseLineno", 0);
        setIntField(term70010, term70010.getClass(), "endLineno", 0);
        setField(term70010, term70010.getClass(), "functions", null);
        setField(term70010, term70010.getClass(), "regexps", null);
        setField(term70010, term70010.getClass(), "itsVariables", null);
        setField(term70010, term70010.getClass(), "itsConst", null);
        setField(term70010, term70010.getClass(), "itsVariableNames", null);
        setIntField(term70010, term70010.getClass(), "varStart", 0);
        setField(term70010, term70010.getClass(), "compilerData", null);
        setIntField(term70010, term70010.getClass(), "type", 39);
        setField(term70011, term70011.getClass(), "str", null);
        setIntField(term70011, term70011.getClass(), "type", 0);
        setField(term70011, term70011.getClass(), "next", null);
        setField(term70011, term70011.getClass(), "first", null);
        setField(term70011, term70011.getClass(), "last", null);
        setField(term70011, term70011.getClass(), "propListHead", null);
        setIntField(term70011, term70011.getClass(), "sourcePosition", 0);
        setField(term70011, term70011.getClass(), "jsType", null);
        setField(term70011, term70011.getClass(), "parent", null);
        setField(term70010, term70010.getClass(), "next", term70011);
        setField(term70010, term70010.getClass(), "first", null);
        setField(term70010, term70010.getClass(), "last", null);
        setField(term70010, term70010.getClass(), "propListHead", null);
        setIntField(term70010, term70010.getClass(), "sourcePosition", 0);
        setField(term70010, term70010.getClass(), "jsType", null);
        setField(term70010, term70010.getClass(), "parent", null);
        setField(term70009, term70009.getClass(), "first", term70010);
        setField(term70009, term70009.getClass(), "last", null);
        setField(term70009, term70009.getClass(), "propListHead", null);
        setIntField(term70009, term70009.getClass(), "sourcePosition", 0);
        setField(term70009, term70009.getClass(), "jsType", null);
        setField(term70009, term70009.getClass(), "parent", null);
        term69953 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term69960 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term69970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term69953, term69953.getClass(), "encodedSourceStart", 0);
        setIntField(term69953, term69953.getClass(), "encodedSourceEnd", 0);
        setField(term69953, term69953.getClass(), "sourceName", null);
        setIntField(term69953, term69953.getClass(), "baseLineno", 0);
        setIntField(term69953, term69953.getClass(), "endLineno", 0);
        setField(term69953, term69953.getClass(), "functions", null);
        setField(term69953, term69953.getClass(), "regexps", null);
        setField(term69953, term69953.getClass(), "itsVariables", null);
        setField(term69953, term69953.getClass(), "itsConst", null);
        setField(term69953, term69953.getClass(), "itsVariableNames", null);
        setIntField(term69953, term69953.getClass(), "varStart", 0);
        setField(term69953, term69953.getClass(), "compilerData", null);
        setIntField(term69953, term69953.getClass(), "type", 22);
        setField(term69953, term69953.getClass(), "next", null);
        setField(term69960, term69960.getClass(), "functionName", null);
        setBooleanField(term69960, term69960.getClass(), "itsNeedsActivation", false);
        setIntField(term69960, term69960.getClass(), "itsFunctionType", 0);
        setBooleanField(term69960, term69960.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term69960, term69960.getClass(), "encodedSourceStart", 0);
        setIntField(term69960, term69960.getClass(), "encodedSourceEnd", 0);
        setField(term69960, term69960.getClass(), "sourceName", null);
        setIntField(term69960, term69960.getClass(), "baseLineno", 0);
        setIntField(term69960, term69960.getClass(), "endLineno", 0);
        setField(term69960, term69960.getClass(), "functions", null);
        setField(term69960, term69960.getClass(), "regexps", null);
        setField(term69960, term69960.getClass(), "itsVariables", null);
        setField(term69960, term69960.getClass(), "itsConst", null);
        setField(term69960, term69960.getClass(), "itsVariableNames", null);
        setIntField(term69960, term69960.getClass(), "varStart", 0);
        setField(term69960, term69960.getClass(), "compilerData", null);
        setIntField(term69960, term69960.getClass(), "type", 39);
        setField(term69970, term69970.getClass(), "str", null);
        setIntField(term69970, term69970.getClass(), "type", 0);
        setField(term69970, term69970.getClass(), "next", null);
        setField(term69970, term69970.getClass(), "first", null);
        setField(term69970, term69970.getClass(), "last", null);
        setField(term69970, term69970.getClass(), "propListHead", null);
        setIntField(term69970, term69970.getClass(), "sourcePosition", 0);
        setField(term69970, term69970.getClass(), "jsType", null);
        setField(term69970, term69970.getClass(), "parent", null);
        setField(term69960, term69960.getClass(), "next", term69970);
        setField(term69960, term69960.getClass(), "first", null);
        setField(term69960, term69960.getClass(), "last", null);
        setField(term69960, term69960.getClass(), "propListHead", null);
        setIntField(term69960, term69960.getClass(), "sourcePosition", 0);
        setField(term69960, term69960.getClass(), "jsType", null);
        setField(term69960, term69960.getClass(), "parent", null);
        setField(term69953, term69953.getClass(), "first", term69960);
        setField(term69953, term69953.getClass(), "last", null);
        setField(term69953, term69953.getClass(), "propListHead", null);
        setIntField(term69953, term69953.getClass(), "sourcePosition", 0);
        setField(term69953, term69953.getClass(), "jsType", null);
        setField(term69953, term69953.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term69420;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term69330, args);
        assertTrue(recursiveEquals(term69330, term70008));
        assertTrue(recursiveEquals(term69420, term70009));
        assertTrue(recursiveEquals(retValue, term69953));
    }

};


