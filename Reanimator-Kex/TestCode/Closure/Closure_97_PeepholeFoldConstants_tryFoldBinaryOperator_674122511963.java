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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305863;
     Object term305949;
     Object term306639;
     Object term306640;
     Object term306563;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305863 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term305949 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term306035 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term306105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term306035, term306035.getClass(), "next", term306105);
        setField(term305949, term305949.getClass(), "first", term306035);
        setIntField(term305949, term305949.getClass(), "type", 14);
        term306639 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term306639, term306639.getClass(), "currentTraversal", null);
        term306640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term306641 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term306642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term306640, term306640.getClass(), "functionName", null);
        setBooleanField(term306640, term306640.getClass(), "itsNeedsActivation", false);
        setIntField(term306640, term306640.getClass(), "itsFunctionType", 0);
        setBooleanField(term306640, term306640.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term306640, term306640.getClass(), "encodedSourceStart", 0);
        setIntField(term306640, term306640.getClass(), "encodedSourceEnd", 0);
        setField(term306640, term306640.getClass(), "sourceName", null);
        setIntField(term306640, term306640.getClass(), "baseLineno", 0);
        setIntField(term306640, term306640.getClass(), "endLineno", 0);
        setField(term306640, term306640.getClass(), "functions", null);
        setField(term306640, term306640.getClass(), "regexps", null);
        setField(term306640, term306640.getClass(), "itsVariables", null);
        setField(term306640, term306640.getClass(), "itsConst", null);
        setField(term306640, term306640.getClass(), "itsVariableNames", null);
        setIntField(term306640, term306640.getClass(), "varStart", 0);
        setField(term306640, term306640.getClass(), "compilerData", null);
        setIntField(term306640, term306640.getClass(), "type", 14);
        setField(term306640, term306640.getClass(), "next", null);
        setField(term306641, term306641.getClass(), "functionName", null);
        setBooleanField(term306641, term306641.getClass(), "itsNeedsActivation", false);
        setIntField(term306641, term306641.getClass(), "itsFunctionType", 0);
        setBooleanField(term306641, term306641.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term306641, term306641.getClass(), "encodedSourceStart", 0);
        setIntField(term306641, term306641.getClass(), "encodedSourceEnd", 0);
        setField(term306641, term306641.getClass(), "sourceName", null);
        setIntField(term306641, term306641.getClass(), "baseLineno", 0);
        setIntField(term306641, term306641.getClass(), "endLineno", 0);
        setField(term306641, term306641.getClass(), "functions", null);
        setField(term306641, term306641.getClass(), "regexps", null);
        setField(term306641, term306641.getClass(), "itsVariables", null);
        setField(term306641, term306641.getClass(), "itsConst", null);
        setField(term306641, term306641.getClass(), "itsVariableNames", null);
        setIntField(term306641, term306641.getClass(), "varStart", 0);
        setField(term306641, term306641.getClass(), "compilerData", null);
        setIntField(term306641, term306641.getClass(), "type", 0);
        setIntField(term306642, term306642.getClass(), "type", 0);
        setField(term306642, term306642.getClass(), "next", null);
        setField(term306642, term306642.getClass(), "first", null);
        setField(term306642, term306642.getClass(), "last", null);
        setField(term306642, term306642.getClass(), "propListHead", null);
        setIntField(term306642, term306642.getClass(), "sourcePosition", 0);
        setField(term306642, term306642.getClass(), "jsType", null);
        setField(term306642, term306642.getClass(), "parent", null);
        setField(term306641, term306641.getClass(), "next", term306642);
        setField(term306641, term306641.getClass(), "first", null);
        setField(term306641, term306641.getClass(), "last", null);
        setField(term306641, term306641.getClass(), "propListHead", null);
        setIntField(term306641, term306641.getClass(), "sourcePosition", 0);
        setField(term306641, term306641.getClass(), "jsType", null);
        setField(term306641, term306641.getClass(), "parent", null);
        setField(term306640, term306640.getClass(), "first", term306641);
        setField(term306640, term306640.getClass(), "last", null);
        setField(term306640, term306640.getClass(), "propListHead", null);
        setIntField(term306640, term306640.getClass(), "sourcePosition", 0);
        setField(term306640, term306640.getClass(), "jsType", null);
        setField(term306640, term306640.getClass(), "parent", null);
        term306563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term306573 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term306583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term306563, term306563.getClass(), "functionName", null);
        setBooleanField(term306563, term306563.getClass(), "itsNeedsActivation", false);
        setIntField(term306563, term306563.getClass(), "itsFunctionType", 0);
        setBooleanField(term306563, term306563.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term306563, term306563.getClass(), "encodedSourceStart", 0);
        setIntField(term306563, term306563.getClass(), "encodedSourceEnd", 0);
        setField(term306563, term306563.getClass(), "sourceName", null);
        setIntField(term306563, term306563.getClass(), "baseLineno", 0);
        setIntField(term306563, term306563.getClass(), "endLineno", 0);
        setField(term306563, term306563.getClass(), "functions", null);
        setField(term306563, term306563.getClass(), "regexps", null);
        setField(term306563, term306563.getClass(), "itsVariables", null);
        setField(term306563, term306563.getClass(), "itsConst", null);
        setField(term306563, term306563.getClass(), "itsVariableNames", null);
        setIntField(term306563, term306563.getClass(), "varStart", 0);
        setField(term306563, term306563.getClass(), "compilerData", null);
        setIntField(term306563, term306563.getClass(), "type", 14);
        setField(term306563, term306563.getClass(), "next", null);
        setField(term306573, term306573.getClass(), "functionName", null);
        setBooleanField(term306573, term306573.getClass(), "itsNeedsActivation", false);
        setIntField(term306573, term306573.getClass(), "itsFunctionType", 0);
        setBooleanField(term306573, term306573.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term306573, term306573.getClass(), "encodedSourceStart", 0);
        setIntField(term306573, term306573.getClass(), "encodedSourceEnd", 0);
        setField(term306573, term306573.getClass(), "sourceName", null);
        setIntField(term306573, term306573.getClass(), "baseLineno", 0);
        setIntField(term306573, term306573.getClass(), "endLineno", 0);
        setField(term306573, term306573.getClass(), "functions", null);
        setField(term306573, term306573.getClass(), "regexps", null);
        setField(term306573, term306573.getClass(), "itsVariables", null);
        setField(term306573, term306573.getClass(), "itsConst", null);
        setField(term306573, term306573.getClass(), "itsVariableNames", null);
        setIntField(term306573, term306573.getClass(), "varStart", 0);
        setField(term306573, term306573.getClass(), "compilerData", null);
        setIntField(term306573, term306573.getClass(), "type", 0);
        setIntField(term306583, term306583.getClass(), "type", 0);
        setField(term306583, term306583.getClass(), "next", null);
        setField(term306583, term306583.getClass(), "first", null);
        setField(term306583, term306583.getClass(), "last", null);
        setField(term306583, term306583.getClass(), "propListHead", null);
        setIntField(term306583, term306583.getClass(), "sourcePosition", 0);
        setField(term306583, term306583.getClass(), "jsType", null);
        setField(term306583, term306583.getClass(), "parent", null);
        setField(term306573, term306573.getClass(), "next", term306583);
        setField(term306573, term306573.getClass(), "first", null);
        setField(term306573, term306573.getClass(), "last", null);
        setField(term306573, term306573.getClass(), "propListHead", null);
        setIntField(term306573, term306573.getClass(), "sourcePosition", 0);
        setField(term306573, term306573.getClass(), "jsType", null);
        setField(term306573, term306573.getClass(), "parent", null);
        setField(term306563, term306563.getClass(), "first", term306573);
        setField(term306563, term306563.getClass(), "last", null);
        setField(term306563, term306563.getClass(), "propListHead", null);
        setIntField(term306563, term306563.getClass(), "sourcePosition", 0);
        setField(term306563, term306563.getClass(), "jsType", null);
        setField(term306563, term306563.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term305949;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term305863, args);
        assertTrue(recursiveEquals(term305863, term306639));
        assertTrue(recursiveEquals(term305949, term306640));
        assertTrue(recursiveEquals(retValue, term306563));
    }

};


