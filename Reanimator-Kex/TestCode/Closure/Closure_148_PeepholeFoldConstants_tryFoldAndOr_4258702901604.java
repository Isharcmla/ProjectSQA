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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407411;
     Object term407497;
     Object term407653;
     Object term407739;
     Object term407834;
     Object term407835;
     Object term407837;
     Object term407838;
     Object term407743;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407411 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term407497 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term407567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term407567, term407567.getClass(), "type", 108);
        setField(term407497, term407497.getClass(), "parent", term407567);
        setIntField(term407497, term407497.getClass(), "type", 0);
        term407653 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term407653, term407653.getClass(), "type", 111);
        term407739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term407739, term407739.getClass(), "type", 63);
        term407834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term407834, term407834.getClass(), "currentTraversal", null);
        term407835 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term407836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term407835, term407835.getClass(), "functionName", null);
        setBooleanField(term407835, term407835.getClass(), "itsNeedsActivation", false);
        setIntField(term407835, term407835.getClass(), "itsFunctionType", 0);
        setBooleanField(term407835, term407835.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term407835, term407835.getClass(), "encodedSourceStart", 0);
        setIntField(term407835, term407835.getClass(), "encodedSourceEnd", 0);
        setField(term407835, term407835.getClass(), "sourceName", null);
        setIntField(term407835, term407835.getClass(), "baseLineno", 0);
        setIntField(term407835, term407835.getClass(), "endLineno", 0);
        setField(term407835, term407835.getClass(), "functions", null);
        setField(term407835, term407835.getClass(), "regexps", null);
        setField(term407835, term407835.getClass(), "itsVariables", null);
        setField(term407835, term407835.getClass(), "itsConst", null);
        setField(term407835, term407835.getClass(), "itsVariableNames", null);
        setIntField(term407835, term407835.getClass(), "varStart", 0);
        setField(term407835, term407835.getClass(), "compilerData", null);
        setIntField(term407835, term407835.getClass(), "type", 0);
        setField(term407835, term407835.getClass(), "next", null);
        setField(term407835, term407835.getClass(), "first", null);
        setField(term407835, term407835.getClass(), "last", null);
        setField(term407835, term407835.getClass(), "propListHead", null);
        setIntField(term407835, term407835.getClass(), "sourcePosition", 0);
        setField(term407835, term407835.getClass(), "jsType", null);
        setIntField(term407836, term407836.getClass(), "type", 108);
        setField(term407836, term407836.getClass(), "next", null);
        setField(term407836, term407836.getClass(), "first", null);
        setField(term407836, term407836.getClass(), "last", null);
        setField(term407836, term407836.getClass(), "propListHead", null);
        setIntField(term407836, term407836.getClass(), "sourcePosition", 0);
        setField(term407836, term407836.getClass(), "jsType", null);
        setField(term407836, term407836.getClass(), "parent", null);
        setField(term407835, term407835.getClass(), "parent", term407836);
        term407837 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term407837, term407837.getClass(), "functionName", null);
        setBooleanField(term407837, term407837.getClass(), "itsNeedsActivation", false);
        setIntField(term407837, term407837.getClass(), "itsFunctionType", 0);
        setBooleanField(term407837, term407837.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term407837, term407837.getClass(), "encodedSourceStart", 0);
        setIntField(term407837, term407837.getClass(), "encodedSourceEnd", 0);
        setField(term407837, term407837.getClass(), "sourceName", null);
        setIntField(term407837, term407837.getClass(), "baseLineno", 0);
        setIntField(term407837, term407837.getClass(), "endLineno", 0);
        setField(term407837, term407837.getClass(), "functions", null);
        setField(term407837, term407837.getClass(), "regexps", null);
        setField(term407837, term407837.getClass(), "itsVariables", null);
        setField(term407837, term407837.getClass(), "itsConst", null);
        setField(term407837, term407837.getClass(), "itsVariableNames", null);
        setIntField(term407837, term407837.getClass(), "varStart", 0);
        setField(term407837, term407837.getClass(), "compilerData", null);
        setIntField(term407837, term407837.getClass(), "type", 111);
        setField(term407837, term407837.getClass(), "next", null);
        setField(term407837, term407837.getClass(), "first", null);
        setField(term407837, term407837.getClass(), "last", null);
        setField(term407837, term407837.getClass(), "propListHead", null);
        setIntField(term407837, term407837.getClass(), "sourcePosition", 0);
        setField(term407837, term407837.getClass(), "jsType", null);
        setField(term407837, term407837.getClass(), "parent", null);
        term407838 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term407838, term407838.getClass(), "functionName", null);
        setBooleanField(term407838, term407838.getClass(), "itsNeedsActivation", false);
        setIntField(term407838, term407838.getClass(), "itsFunctionType", 0);
        setBooleanField(term407838, term407838.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term407838, term407838.getClass(), "encodedSourceStart", 0);
        setIntField(term407838, term407838.getClass(), "encodedSourceEnd", 0);
        setField(term407838, term407838.getClass(), "sourceName", null);
        setIntField(term407838, term407838.getClass(), "baseLineno", 0);
        setIntField(term407838, term407838.getClass(), "endLineno", 0);
        setField(term407838, term407838.getClass(), "functions", null);
        setField(term407838, term407838.getClass(), "regexps", null);
        setField(term407838, term407838.getClass(), "itsVariables", null);
        setField(term407838, term407838.getClass(), "itsConst", null);
        setField(term407838, term407838.getClass(), "itsVariableNames", null);
        setIntField(term407838, term407838.getClass(), "varStart", 0);
        setField(term407838, term407838.getClass(), "compilerData", null);
        setIntField(term407838, term407838.getClass(), "type", 63);
        setField(term407838, term407838.getClass(), "next", null);
        setField(term407838, term407838.getClass(), "first", null);
        setField(term407838, term407838.getClass(), "last", null);
        setField(term407838, term407838.getClass(), "propListHead", null);
        setIntField(term407838, term407838.getClass(), "sourcePosition", 0);
        setField(term407838, term407838.getClass(), "jsType", null);
        setField(term407838, term407838.getClass(), "parent", null);
        term407743 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term407754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term407743, term407743.getClass(), "functionName", null);
        setBooleanField(term407743, term407743.getClass(), "itsNeedsActivation", false);
        setIntField(term407743, term407743.getClass(), "itsFunctionType", 0);
        setBooleanField(term407743, term407743.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term407743, term407743.getClass(), "encodedSourceStart", 0);
        setIntField(term407743, term407743.getClass(), "encodedSourceEnd", 0);
        setField(term407743, term407743.getClass(), "sourceName", null);
        setIntField(term407743, term407743.getClass(), "baseLineno", 0);
        setIntField(term407743, term407743.getClass(), "endLineno", 0);
        setField(term407743, term407743.getClass(), "functions", null);
        setField(term407743, term407743.getClass(), "regexps", null);
        setField(term407743, term407743.getClass(), "itsVariables", null);
        setField(term407743, term407743.getClass(), "itsConst", null);
        setField(term407743, term407743.getClass(), "itsVariableNames", null);
        setIntField(term407743, term407743.getClass(), "varStart", 0);
        setField(term407743, term407743.getClass(), "compilerData", null);
        setIntField(term407743, term407743.getClass(), "type", 0);
        setField(term407743, term407743.getClass(), "next", null);
        setField(term407743, term407743.getClass(), "first", null);
        setField(term407743, term407743.getClass(), "last", null);
        setField(term407743, term407743.getClass(), "propListHead", null);
        setIntField(term407743, term407743.getClass(), "sourcePosition", 0);
        setField(term407743, term407743.getClass(), "jsType", null);
        setIntField(term407754, term407754.getClass(), "type", 108);
        setField(term407754, term407754.getClass(), "next", null);
        setField(term407754, term407754.getClass(), "first", null);
        setField(term407754, term407754.getClass(), "last", null);
        setField(term407754, term407754.getClass(), "propListHead", null);
        setIntField(term407754, term407754.getClass(), "sourcePosition", 0);
        setField(term407754, term407754.getClass(), "jsType", null);
        setField(term407754, term407754.getClass(), "parent", null);
        setField(term407743, term407743.getClass(), "parent", term407754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term407497;
        args[1] = term407653;
        args[2] = term407739;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term407411, args);
        assertTrue(recursiveEquals(term407411, term407834));
        assertTrue(recursiveEquals(term407497, term407835));
        assertTrue(recursiveEquals(term407653, term407837));
        assertTrue(recursiveEquals(term407739, term407838));
        assertTrue(recursiveEquals(retValue, term407743));
    }

};


