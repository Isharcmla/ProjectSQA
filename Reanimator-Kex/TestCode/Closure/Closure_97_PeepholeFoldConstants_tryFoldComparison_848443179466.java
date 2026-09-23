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

public class PeepholeFoldConstants_tryFoldComparison_848443179466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107857;
     Object term107943;
     Object term108029;
     Object term108115;
     Object term108167;
     Object term108168;
     Object term108169;
     Object term108170;
     Object term108133;

    public PeepholeFoldConstants_tryFoldComparison_848443179466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107857 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term107943 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term107943, term107943.getClass(), "type", 16);
        term108029 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term108029, term108029.getClass(), "type", 16);
        term108115 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term108167 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term108167, term108167.getClass(), "currentTraversal", null);
        term108168 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108168, term108168.getClass(), "functionName", null);
        setBooleanField(term108168, term108168.getClass(), "itsNeedsActivation", false);
        setIntField(term108168, term108168.getClass(), "itsFunctionType", 0);
        setBooleanField(term108168, term108168.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108168, term108168.getClass(), "encodedSourceStart", 0);
        setIntField(term108168, term108168.getClass(), "encodedSourceEnd", 0);
        setField(term108168, term108168.getClass(), "sourceName", null);
        setIntField(term108168, term108168.getClass(), "baseLineno", 0);
        setIntField(term108168, term108168.getClass(), "endLineno", 0);
        setField(term108168, term108168.getClass(), "functions", null);
        setField(term108168, term108168.getClass(), "regexps", null);
        setField(term108168, term108168.getClass(), "itsVariables", null);
        setField(term108168, term108168.getClass(), "itsConst", null);
        setField(term108168, term108168.getClass(), "itsVariableNames", null);
        setIntField(term108168, term108168.getClass(), "varStart", 0);
        setField(term108168, term108168.getClass(), "compilerData", null);
        setIntField(term108168, term108168.getClass(), "type", 16);
        setField(term108168, term108168.getClass(), "next", null);
        setField(term108168, term108168.getClass(), "first", null);
        setField(term108168, term108168.getClass(), "last", null);
        setField(term108168, term108168.getClass(), "propListHead", null);
        setIntField(term108168, term108168.getClass(), "sourcePosition", 0);
        setField(term108168, term108168.getClass(), "jsType", null);
        setField(term108168, term108168.getClass(), "parent", null);
        term108169 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108169, term108169.getClass(), "functionName", null);
        setBooleanField(term108169, term108169.getClass(), "itsNeedsActivation", false);
        setIntField(term108169, term108169.getClass(), "itsFunctionType", 0);
        setBooleanField(term108169, term108169.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108169, term108169.getClass(), "encodedSourceStart", 0);
        setIntField(term108169, term108169.getClass(), "encodedSourceEnd", 0);
        setField(term108169, term108169.getClass(), "sourceName", null);
        setIntField(term108169, term108169.getClass(), "baseLineno", 0);
        setIntField(term108169, term108169.getClass(), "endLineno", 0);
        setField(term108169, term108169.getClass(), "functions", null);
        setField(term108169, term108169.getClass(), "regexps", null);
        setField(term108169, term108169.getClass(), "itsVariables", null);
        setField(term108169, term108169.getClass(), "itsConst", null);
        setField(term108169, term108169.getClass(), "itsVariableNames", null);
        setIntField(term108169, term108169.getClass(), "varStart", 0);
        setField(term108169, term108169.getClass(), "compilerData", null);
        setIntField(term108169, term108169.getClass(), "type", 16);
        setField(term108169, term108169.getClass(), "next", null);
        setField(term108169, term108169.getClass(), "first", null);
        setField(term108169, term108169.getClass(), "last", null);
        setField(term108169, term108169.getClass(), "propListHead", null);
        setIntField(term108169, term108169.getClass(), "sourcePosition", 0);
        setField(term108169, term108169.getClass(), "jsType", null);
        setField(term108169, term108169.getClass(), "parent", null);
        term108170 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108170, term108170.getClass(), "functionName", null);
        setBooleanField(term108170, term108170.getClass(), "itsNeedsActivation", false);
        setIntField(term108170, term108170.getClass(), "itsFunctionType", 0);
        setBooleanField(term108170, term108170.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108170, term108170.getClass(), "encodedSourceStart", 0);
        setIntField(term108170, term108170.getClass(), "encodedSourceEnd", 0);
        setField(term108170, term108170.getClass(), "sourceName", null);
        setIntField(term108170, term108170.getClass(), "baseLineno", 0);
        setIntField(term108170, term108170.getClass(), "endLineno", 0);
        setField(term108170, term108170.getClass(), "functions", null);
        setField(term108170, term108170.getClass(), "regexps", null);
        setField(term108170, term108170.getClass(), "itsVariables", null);
        setField(term108170, term108170.getClass(), "itsConst", null);
        setField(term108170, term108170.getClass(), "itsVariableNames", null);
        setIntField(term108170, term108170.getClass(), "varStart", 0);
        setField(term108170, term108170.getClass(), "compilerData", null);
        setIntField(term108170, term108170.getClass(), "type", 0);
        setField(term108170, term108170.getClass(), "next", null);
        setField(term108170, term108170.getClass(), "first", null);
        setField(term108170, term108170.getClass(), "last", null);
        setField(term108170, term108170.getClass(), "propListHead", null);
        setIntField(term108170, term108170.getClass(), "sourcePosition", 0);
        setField(term108170, term108170.getClass(), "jsType", null);
        setField(term108170, term108170.getClass(), "parent", null);
        term108133 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108133, term108133.getClass(), "functionName", null);
        setBooleanField(term108133, term108133.getClass(), "itsNeedsActivation", false);
        setIntField(term108133, term108133.getClass(), "itsFunctionType", 0);
        setBooleanField(term108133, term108133.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108133, term108133.getClass(), "encodedSourceStart", 0);
        setIntField(term108133, term108133.getClass(), "encodedSourceEnd", 0);
        setField(term108133, term108133.getClass(), "sourceName", null);
        setIntField(term108133, term108133.getClass(), "baseLineno", 0);
        setIntField(term108133, term108133.getClass(), "endLineno", 0);
        setField(term108133, term108133.getClass(), "functions", null);
        setField(term108133, term108133.getClass(), "regexps", null);
        setField(term108133, term108133.getClass(), "itsVariables", null);
        setField(term108133, term108133.getClass(), "itsConst", null);
        setField(term108133, term108133.getClass(), "itsVariableNames", null);
        setIntField(term108133, term108133.getClass(), "varStart", 0);
        setField(term108133, term108133.getClass(), "compilerData", null);
        setIntField(term108133, term108133.getClass(), "type", 16);
        setField(term108133, term108133.getClass(), "next", null);
        setField(term108133, term108133.getClass(), "first", null);
        setField(term108133, term108133.getClass(), "last", null);
        setField(term108133, term108133.getClass(), "propListHead", null);
        setIntField(term108133, term108133.getClass(), "sourcePosition", 0);
        setField(term108133, term108133.getClass(), "jsType", null);
        setField(term108133, term108133.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term107943;
        args[1] = term108029;
        args[2] = term108115;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term107857, args);
        assertTrue(recursiveEquals(term107857, term108167));
        assertTrue(recursiveEquals(term107943, term108168));
        assertTrue(recursiveEquals(term108029, term108169));
        assertTrue(recursiveEquals(term108115, term108170));
        assertTrue(recursiveEquals(retValue, term108133));
    }

};


