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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124511;
     Object term124597;
     Object term125232;
     Object term125233;
     Object term125166;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124511 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term124597 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term124683 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term124753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term124683, term124683.getClass(), "next", term124753);
        setField(term124597, term124597.getClass(), "first", term124683);
        setIntField(term124597, term124597.getClass(), "type", 46);
        term125232 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term125232, term125232.getClass(), "currentTraversal", null);
        term125233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term125234 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term125235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125233, term125233.getClass(), "functionName", null);
        setBooleanField(term125233, term125233.getClass(), "itsNeedsActivation", false);
        setIntField(term125233, term125233.getClass(), "itsFunctionType", 0);
        setBooleanField(term125233, term125233.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term125233, term125233.getClass(), "encodedSourceStart", 0);
        setIntField(term125233, term125233.getClass(), "encodedSourceEnd", 0);
        setField(term125233, term125233.getClass(), "sourceName", null);
        setIntField(term125233, term125233.getClass(), "baseLineno", 0);
        setIntField(term125233, term125233.getClass(), "endLineno", 0);
        setField(term125233, term125233.getClass(), "functions", null);
        setField(term125233, term125233.getClass(), "regexps", null);
        setField(term125233, term125233.getClass(), "itsVariables", null);
        setField(term125233, term125233.getClass(), "itsConst", null);
        setField(term125233, term125233.getClass(), "itsVariableNames", null);
        setIntField(term125233, term125233.getClass(), "varStart", 0);
        setField(term125233, term125233.getClass(), "compilerData", null);
        setIntField(term125233, term125233.getClass(), "type", 46);
        setField(term125233, term125233.getClass(), "next", null);
        setField(term125234, term125234.getClass(), "functionName", null);
        setBooleanField(term125234, term125234.getClass(), "itsNeedsActivation", false);
        setIntField(term125234, term125234.getClass(), "itsFunctionType", 0);
        setBooleanField(term125234, term125234.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term125234, term125234.getClass(), "encodedSourceStart", 0);
        setIntField(term125234, term125234.getClass(), "encodedSourceEnd", 0);
        setField(term125234, term125234.getClass(), "sourceName", null);
        setIntField(term125234, term125234.getClass(), "baseLineno", 0);
        setIntField(term125234, term125234.getClass(), "endLineno", 0);
        setField(term125234, term125234.getClass(), "functions", null);
        setField(term125234, term125234.getClass(), "regexps", null);
        setField(term125234, term125234.getClass(), "itsVariables", null);
        setField(term125234, term125234.getClass(), "itsConst", null);
        setField(term125234, term125234.getClass(), "itsVariableNames", null);
        setIntField(term125234, term125234.getClass(), "varStart", 0);
        setField(term125234, term125234.getClass(), "compilerData", null);
        setIntField(term125234, term125234.getClass(), "type", 0);
        setIntField(term125235, term125235.getClass(), "type", 0);
        setField(term125235, term125235.getClass(), "next", null);
        setField(term125235, term125235.getClass(), "first", null);
        setField(term125235, term125235.getClass(), "last", null);
        setField(term125235, term125235.getClass(), "propListHead", null);
        setIntField(term125235, term125235.getClass(), "sourcePosition", 0);
        setField(term125235, term125235.getClass(), "jsType", null);
        setField(term125235, term125235.getClass(), "parent", null);
        setField(term125234, term125234.getClass(), "next", term125235);
        setField(term125234, term125234.getClass(), "first", null);
        setField(term125234, term125234.getClass(), "last", null);
        setField(term125234, term125234.getClass(), "propListHead", null);
        setIntField(term125234, term125234.getClass(), "sourcePosition", 0);
        setField(term125234, term125234.getClass(), "jsType", null);
        setField(term125234, term125234.getClass(), "parent", null);
        setField(term125233, term125233.getClass(), "first", term125234);
        setField(term125233, term125233.getClass(), "last", null);
        setField(term125233, term125233.getClass(), "propListHead", null);
        setIntField(term125233, term125233.getClass(), "sourcePosition", 0);
        setField(term125233, term125233.getClass(), "jsType", null);
        setField(term125233, term125233.getClass(), "parent", null);
        term125166 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term125176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term125186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125166, term125166.getClass(), "functionName", null);
        setBooleanField(term125166, term125166.getClass(), "itsNeedsActivation", false);
        setIntField(term125166, term125166.getClass(), "itsFunctionType", 0);
        setBooleanField(term125166, term125166.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term125166, term125166.getClass(), "encodedSourceStart", 0);
        setIntField(term125166, term125166.getClass(), "encodedSourceEnd", 0);
        setField(term125166, term125166.getClass(), "sourceName", null);
        setIntField(term125166, term125166.getClass(), "baseLineno", 0);
        setIntField(term125166, term125166.getClass(), "endLineno", 0);
        setField(term125166, term125166.getClass(), "functions", null);
        setField(term125166, term125166.getClass(), "regexps", null);
        setField(term125166, term125166.getClass(), "itsVariables", null);
        setField(term125166, term125166.getClass(), "itsConst", null);
        setField(term125166, term125166.getClass(), "itsVariableNames", null);
        setIntField(term125166, term125166.getClass(), "varStart", 0);
        setField(term125166, term125166.getClass(), "compilerData", null);
        setIntField(term125166, term125166.getClass(), "type", 46);
        setField(term125166, term125166.getClass(), "next", null);
        setField(term125176, term125176.getClass(), "functionName", null);
        setBooleanField(term125176, term125176.getClass(), "itsNeedsActivation", false);
        setIntField(term125176, term125176.getClass(), "itsFunctionType", 0);
        setBooleanField(term125176, term125176.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term125176, term125176.getClass(), "encodedSourceStart", 0);
        setIntField(term125176, term125176.getClass(), "encodedSourceEnd", 0);
        setField(term125176, term125176.getClass(), "sourceName", null);
        setIntField(term125176, term125176.getClass(), "baseLineno", 0);
        setIntField(term125176, term125176.getClass(), "endLineno", 0);
        setField(term125176, term125176.getClass(), "functions", null);
        setField(term125176, term125176.getClass(), "regexps", null);
        setField(term125176, term125176.getClass(), "itsVariables", null);
        setField(term125176, term125176.getClass(), "itsConst", null);
        setField(term125176, term125176.getClass(), "itsVariableNames", null);
        setIntField(term125176, term125176.getClass(), "varStart", 0);
        setField(term125176, term125176.getClass(), "compilerData", null);
        setIntField(term125176, term125176.getClass(), "type", 0);
        setIntField(term125186, term125186.getClass(), "type", 0);
        setField(term125186, term125186.getClass(), "next", null);
        setField(term125186, term125186.getClass(), "first", null);
        setField(term125186, term125186.getClass(), "last", null);
        setField(term125186, term125186.getClass(), "propListHead", null);
        setIntField(term125186, term125186.getClass(), "sourcePosition", 0);
        setField(term125186, term125186.getClass(), "jsType", null);
        setField(term125186, term125186.getClass(), "parent", null);
        setField(term125176, term125176.getClass(), "next", term125186);
        setField(term125176, term125176.getClass(), "first", null);
        setField(term125176, term125176.getClass(), "last", null);
        setField(term125176, term125176.getClass(), "propListHead", null);
        setIntField(term125176, term125176.getClass(), "sourcePosition", 0);
        setField(term125176, term125176.getClass(), "jsType", null);
        setField(term125176, term125176.getClass(), "parent", null);
        setField(term125166, term125166.getClass(), "first", term125176);
        setField(term125166, term125166.getClass(), "last", null);
        setField(term125166, term125166.getClass(), "propListHead", null);
        setIntField(term125166, term125166.getClass(), "sourcePosition", 0);
        setField(term125166, term125166.getClass(), "jsType", null);
        setField(term125166, term125166.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term124597;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term124511, args);
        assertTrue(recursiveEquals(term124511, term125232));
        assertTrue(recursiveEquals(term124597, term125233));
        assertTrue(recursiveEquals(retValue, term125166));
    }

};


