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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32112;
     Object term32198;
     Object term33047;
     Object term33048;
     Object term32988;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term32198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term32284 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term32354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32284, term32284.getClass(), "next", term32354);
        setField(term32198, term32198.getClass(), "first", term32284);
        setIntField(term32198, term32198.getClass(), "type", 18);
        term33047 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term33047, term33047.getClass(), "currentTraversal", null);
        term33048 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term33049 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term33050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33048, term33048.getClass(), "functionName", null);
        setBooleanField(term33048, term33048.getClass(), "itsNeedsActivation", false);
        setIntField(term33048, term33048.getClass(), "itsFunctionType", 0);
        setBooleanField(term33048, term33048.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term33048, term33048.getClass(), "encodedSourceStart", 0);
        setIntField(term33048, term33048.getClass(), "encodedSourceEnd", 0);
        setField(term33048, term33048.getClass(), "sourceName", null);
        setIntField(term33048, term33048.getClass(), "baseLineno", 0);
        setIntField(term33048, term33048.getClass(), "endLineno", 0);
        setField(term33048, term33048.getClass(), "functions", null);
        setField(term33048, term33048.getClass(), "regexps", null);
        setField(term33048, term33048.getClass(), "itsVariables", null);
        setField(term33048, term33048.getClass(), "itsConst", null);
        setField(term33048, term33048.getClass(), "itsVariableNames", null);
        setIntField(term33048, term33048.getClass(), "varStart", 0);
        setField(term33048, term33048.getClass(), "compilerData", null);
        setIntField(term33048, term33048.getClass(), "type", 18);
        setField(term33048, term33048.getClass(), "next", null);
        setField(term33049, term33049.getClass(), "functionName", null);
        setBooleanField(term33049, term33049.getClass(), "itsNeedsActivation", false);
        setIntField(term33049, term33049.getClass(), "itsFunctionType", 0);
        setBooleanField(term33049, term33049.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term33049, term33049.getClass(), "encodedSourceStart", 0);
        setIntField(term33049, term33049.getClass(), "encodedSourceEnd", 0);
        setField(term33049, term33049.getClass(), "sourceName", null);
        setIntField(term33049, term33049.getClass(), "baseLineno", 0);
        setIntField(term33049, term33049.getClass(), "endLineno", 0);
        setField(term33049, term33049.getClass(), "functions", null);
        setField(term33049, term33049.getClass(), "regexps", null);
        setField(term33049, term33049.getClass(), "itsVariables", null);
        setField(term33049, term33049.getClass(), "itsConst", null);
        setField(term33049, term33049.getClass(), "itsVariableNames", null);
        setIntField(term33049, term33049.getClass(), "varStart", 0);
        setField(term33049, term33049.getClass(), "compilerData", null);
        setIntField(term33049, term33049.getClass(), "type", 0);
        setIntField(term33050, term33050.getClass(), "type", 0);
        setField(term33050, term33050.getClass(), "next", null);
        setField(term33050, term33050.getClass(), "first", null);
        setField(term33050, term33050.getClass(), "last", null);
        setField(term33050, term33050.getClass(), "propListHead", null);
        setIntField(term33050, term33050.getClass(), "sourcePosition", 0);
        setField(term33050, term33050.getClass(), "jsType", null);
        setField(term33050, term33050.getClass(), "parent", null);
        setField(term33049, term33049.getClass(), "next", term33050);
        setField(term33049, term33049.getClass(), "first", null);
        setField(term33049, term33049.getClass(), "last", null);
        setField(term33049, term33049.getClass(), "propListHead", null);
        setIntField(term33049, term33049.getClass(), "sourcePosition", 0);
        setField(term33049, term33049.getClass(), "jsType", null);
        setField(term33049, term33049.getClass(), "parent", null);
        setField(term33048, term33048.getClass(), "first", term33049);
        setField(term33048, term33048.getClass(), "last", null);
        setField(term33048, term33048.getClass(), "propListHead", null);
        setIntField(term33048, term33048.getClass(), "sourcePosition", 0);
        setField(term33048, term33048.getClass(), "jsType", null);
        setField(term33048, term33048.getClass(), "parent", null);
        term32988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term32998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term33008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32988, term32988.getClass(), "functionName", null);
        setBooleanField(term32988, term32988.getClass(), "itsNeedsActivation", false);
        setIntField(term32988, term32988.getClass(), "itsFunctionType", 0);
        setBooleanField(term32988, term32988.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32988, term32988.getClass(), "encodedSourceStart", 0);
        setIntField(term32988, term32988.getClass(), "encodedSourceEnd", 0);
        setField(term32988, term32988.getClass(), "sourceName", null);
        setIntField(term32988, term32988.getClass(), "baseLineno", 0);
        setIntField(term32988, term32988.getClass(), "endLineno", 0);
        setField(term32988, term32988.getClass(), "functions", null);
        setField(term32988, term32988.getClass(), "regexps", null);
        setField(term32988, term32988.getClass(), "itsVariables", null);
        setField(term32988, term32988.getClass(), "itsConst", null);
        setField(term32988, term32988.getClass(), "itsVariableNames", null);
        setIntField(term32988, term32988.getClass(), "varStart", 0);
        setField(term32988, term32988.getClass(), "compilerData", null);
        setIntField(term32988, term32988.getClass(), "type", 18);
        setField(term32988, term32988.getClass(), "next", null);
        setField(term32998, term32998.getClass(), "functionName", null);
        setBooleanField(term32998, term32998.getClass(), "itsNeedsActivation", false);
        setIntField(term32998, term32998.getClass(), "itsFunctionType", 0);
        setBooleanField(term32998, term32998.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32998, term32998.getClass(), "encodedSourceStart", 0);
        setIntField(term32998, term32998.getClass(), "encodedSourceEnd", 0);
        setField(term32998, term32998.getClass(), "sourceName", null);
        setIntField(term32998, term32998.getClass(), "baseLineno", 0);
        setIntField(term32998, term32998.getClass(), "endLineno", 0);
        setField(term32998, term32998.getClass(), "functions", null);
        setField(term32998, term32998.getClass(), "regexps", null);
        setField(term32998, term32998.getClass(), "itsVariables", null);
        setField(term32998, term32998.getClass(), "itsConst", null);
        setField(term32998, term32998.getClass(), "itsVariableNames", null);
        setIntField(term32998, term32998.getClass(), "varStart", 0);
        setField(term32998, term32998.getClass(), "compilerData", null);
        setIntField(term32998, term32998.getClass(), "type", 0);
        setIntField(term33008, term33008.getClass(), "type", 0);
        setField(term33008, term33008.getClass(), "next", null);
        setField(term33008, term33008.getClass(), "first", null);
        setField(term33008, term33008.getClass(), "last", null);
        setField(term33008, term33008.getClass(), "propListHead", null);
        setIntField(term33008, term33008.getClass(), "sourcePosition", 0);
        setField(term33008, term33008.getClass(), "jsType", null);
        setField(term33008, term33008.getClass(), "parent", null);
        setField(term32998, term32998.getClass(), "next", term33008);
        setField(term32998, term32998.getClass(), "first", null);
        setField(term32998, term32998.getClass(), "last", null);
        setField(term32998, term32998.getClass(), "propListHead", null);
        setIntField(term32998, term32998.getClass(), "sourcePosition", 0);
        setField(term32998, term32998.getClass(), "jsType", null);
        setField(term32998, term32998.getClass(), "parent", null);
        setField(term32988, term32988.getClass(), "first", term32998);
        setField(term32988, term32988.getClass(), "last", null);
        setField(term32988, term32988.getClass(), "propListHead", null);
        setIntField(term32988, term32988.getClass(), "sourcePosition", 0);
        setField(term32988, term32988.getClass(), "jsType", null);
        setField(term32988, term32988.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32198;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term32112, args);
        assertTrue(recursiveEquals(term32112, term33047));
        assertTrue(recursiveEquals(term32198, term33048));
        assertTrue(recursiveEquals(retValue, term32988));
    }

};


