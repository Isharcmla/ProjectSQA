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

public class PeepholeFoldConstants_tryFoldComparison_848443179236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46885;
     Object term46971;
     Object term47057;
     Object term47143;
     Object term47195;
     Object term47196;
     Object term47197;
     Object term47198;
     Object term47161;

    public PeepholeFoldConstants_tryFoldComparison_848443179236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46885 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term46971 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term46971, term46971.getClass(), "type", 16);
        term47057 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term47057, term47057.getClass(), "type", 16);
        term47143 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term47195 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term47195, term47195.getClass(), "currentTraversal", null);
        term47196 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term47196, term47196.getClass(), "functionName", null);
        setBooleanField(term47196, term47196.getClass(), "itsNeedsActivation", false);
        setIntField(term47196, term47196.getClass(), "itsFunctionType", 0);
        setBooleanField(term47196, term47196.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term47196, term47196.getClass(), "encodedSourceStart", 0);
        setIntField(term47196, term47196.getClass(), "encodedSourceEnd", 0);
        setField(term47196, term47196.getClass(), "sourceName", null);
        setIntField(term47196, term47196.getClass(), "baseLineno", 0);
        setIntField(term47196, term47196.getClass(), "endLineno", 0);
        setField(term47196, term47196.getClass(), "functions", null);
        setField(term47196, term47196.getClass(), "regexps", null);
        setField(term47196, term47196.getClass(), "itsVariables", null);
        setField(term47196, term47196.getClass(), "itsConst", null);
        setField(term47196, term47196.getClass(), "itsVariableNames", null);
        setIntField(term47196, term47196.getClass(), "varStart", 0);
        setField(term47196, term47196.getClass(), "compilerData", null);
        setIntField(term47196, term47196.getClass(), "type", 16);
        setField(term47196, term47196.getClass(), "next", null);
        setField(term47196, term47196.getClass(), "first", null);
        setField(term47196, term47196.getClass(), "last", null);
        setField(term47196, term47196.getClass(), "propListHead", null);
        setIntField(term47196, term47196.getClass(), "sourcePosition", 0);
        setField(term47196, term47196.getClass(), "jsType", null);
        setField(term47196, term47196.getClass(), "parent", null);
        term47197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term47197, term47197.getClass(), "functionName", null);
        setBooleanField(term47197, term47197.getClass(), "itsNeedsActivation", false);
        setIntField(term47197, term47197.getClass(), "itsFunctionType", 0);
        setBooleanField(term47197, term47197.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term47197, term47197.getClass(), "encodedSourceStart", 0);
        setIntField(term47197, term47197.getClass(), "encodedSourceEnd", 0);
        setField(term47197, term47197.getClass(), "sourceName", null);
        setIntField(term47197, term47197.getClass(), "baseLineno", 0);
        setIntField(term47197, term47197.getClass(), "endLineno", 0);
        setField(term47197, term47197.getClass(), "functions", null);
        setField(term47197, term47197.getClass(), "regexps", null);
        setField(term47197, term47197.getClass(), "itsVariables", null);
        setField(term47197, term47197.getClass(), "itsConst", null);
        setField(term47197, term47197.getClass(), "itsVariableNames", null);
        setIntField(term47197, term47197.getClass(), "varStart", 0);
        setField(term47197, term47197.getClass(), "compilerData", null);
        setIntField(term47197, term47197.getClass(), "type", 16);
        setField(term47197, term47197.getClass(), "next", null);
        setField(term47197, term47197.getClass(), "first", null);
        setField(term47197, term47197.getClass(), "last", null);
        setField(term47197, term47197.getClass(), "propListHead", null);
        setIntField(term47197, term47197.getClass(), "sourcePosition", 0);
        setField(term47197, term47197.getClass(), "jsType", null);
        setField(term47197, term47197.getClass(), "parent", null);
        term47198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term47198, term47198.getClass(), "functionName", null);
        setBooleanField(term47198, term47198.getClass(), "itsNeedsActivation", false);
        setIntField(term47198, term47198.getClass(), "itsFunctionType", 0);
        setBooleanField(term47198, term47198.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term47198, term47198.getClass(), "encodedSourceStart", 0);
        setIntField(term47198, term47198.getClass(), "encodedSourceEnd", 0);
        setField(term47198, term47198.getClass(), "sourceName", null);
        setIntField(term47198, term47198.getClass(), "baseLineno", 0);
        setIntField(term47198, term47198.getClass(), "endLineno", 0);
        setField(term47198, term47198.getClass(), "functions", null);
        setField(term47198, term47198.getClass(), "regexps", null);
        setField(term47198, term47198.getClass(), "itsVariables", null);
        setField(term47198, term47198.getClass(), "itsConst", null);
        setField(term47198, term47198.getClass(), "itsVariableNames", null);
        setIntField(term47198, term47198.getClass(), "varStart", 0);
        setField(term47198, term47198.getClass(), "compilerData", null);
        setIntField(term47198, term47198.getClass(), "type", 0);
        setField(term47198, term47198.getClass(), "next", null);
        setField(term47198, term47198.getClass(), "first", null);
        setField(term47198, term47198.getClass(), "last", null);
        setField(term47198, term47198.getClass(), "propListHead", null);
        setIntField(term47198, term47198.getClass(), "sourcePosition", 0);
        setField(term47198, term47198.getClass(), "jsType", null);
        setField(term47198, term47198.getClass(), "parent", null);
        term47161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term47161, term47161.getClass(), "functionName", null);
        setBooleanField(term47161, term47161.getClass(), "itsNeedsActivation", false);
        setIntField(term47161, term47161.getClass(), "itsFunctionType", 0);
        setBooleanField(term47161, term47161.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term47161, term47161.getClass(), "encodedSourceStart", 0);
        setIntField(term47161, term47161.getClass(), "encodedSourceEnd", 0);
        setField(term47161, term47161.getClass(), "sourceName", null);
        setIntField(term47161, term47161.getClass(), "baseLineno", 0);
        setIntField(term47161, term47161.getClass(), "endLineno", 0);
        setField(term47161, term47161.getClass(), "functions", null);
        setField(term47161, term47161.getClass(), "regexps", null);
        setField(term47161, term47161.getClass(), "itsVariables", null);
        setField(term47161, term47161.getClass(), "itsConst", null);
        setField(term47161, term47161.getClass(), "itsVariableNames", null);
        setIntField(term47161, term47161.getClass(), "varStart", 0);
        setField(term47161, term47161.getClass(), "compilerData", null);
        setIntField(term47161, term47161.getClass(), "type", 16);
        setField(term47161, term47161.getClass(), "next", null);
        setField(term47161, term47161.getClass(), "first", null);
        setField(term47161, term47161.getClass(), "last", null);
        setField(term47161, term47161.getClass(), "propListHead", null);
        setIntField(term47161, term47161.getClass(), "sourcePosition", 0);
        setField(term47161, term47161.getClass(), "jsType", null);
        setField(term47161, term47161.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term46971;
        args[1] = term47057;
        args[2] = term47143;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term46885, args);
        assertTrue(recursiveEquals(term46885, term47195));
        assertTrue(recursiveEquals(term46971, term47196));
        assertTrue(recursiveEquals(term47057, term47197));
        assertTrue(recursiveEquals(term47143, term47198));
        assertTrue(recursiveEquals(retValue, term47161));
    }

};


