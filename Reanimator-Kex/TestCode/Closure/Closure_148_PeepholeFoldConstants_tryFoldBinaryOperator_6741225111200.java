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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284937;
     Object term285023;
     Object term285257;
     Object term285258;
     Object term285194;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term285023 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term285109 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term285179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term285109, term285109.getClass(), "next", term285179);
        setField(term285023, term285023.getClass(), "first", term285109);
        setIntField(term285023, term285023.getClass(), "type", 33);
        term285257 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term285257, term285257.getClass(), "currentTraversal", null);
        term285258 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term285259 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term285260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term285258, term285258.getClass(), "functionName", null);
        setBooleanField(term285258, term285258.getClass(), "itsNeedsActivation", false);
        setIntField(term285258, term285258.getClass(), "itsFunctionType", 0);
        setBooleanField(term285258, term285258.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term285258, term285258.getClass(), "encodedSourceStart", 0);
        setIntField(term285258, term285258.getClass(), "encodedSourceEnd", 0);
        setField(term285258, term285258.getClass(), "sourceName", null);
        setIntField(term285258, term285258.getClass(), "baseLineno", 0);
        setIntField(term285258, term285258.getClass(), "endLineno", 0);
        setField(term285258, term285258.getClass(), "functions", null);
        setField(term285258, term285258.getClass(), "regexps", null);
        setField(term285258, term285258.getClass(), "itsVariables", null);
        setField(term285258, term285258.getClass(), "itsConst", null);
        setField(term285258, term285258.getClass(), "itsVariableNames", null);
        setIntField(term285258, term285258.getClass(), "varStart", 0);
        setField(term285258, term285258.getClass(), "compilerData", null);
        setIntField(term285258, term285258.getClass(), "type", 33);
        setField(term285258, term285258.getClass(), "next", null);
        setField(term285259, term285259.getClass(), "functionName", null);
        setBooleanField(term285259, term285259.getClass(), "itsNeedsActivation", false);
        setIntField(term285259, term285259.getClass(), "itsFunctionType", 0);
        setBooleanField(term285259, term285259.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term285259, term285259.getClass(), "encodedSourceStart", 0);
        setIntField(term285259, term285259.getClass(), "encodedSourceEnd", 0);
        setField(term285259, term285259.getClass(), "sourceName", null);
        setIntField(term285259, term285259.getClass(), "baseLineno", 0);
        setIntField(term285259, term285259.getClass(), "endLineno", 0);
        setField(term285259, term285259.getClass(), "functions", null);
        setField(term285259, term285259.getClass(), "regexps", null);
        setField(term285259, term285259.getClass(), "itsVariables", null);
        setField(term285259, term285259.getClass(), "itsConst", null);
        setField(term285259, term285259.getClass(), "itsVariableNames", null);
        setIntField(term285259, term285259.getClass(), "varStart", 0);
        setField(term285259, term285259.getClass(), "compilerData", null);
        setIntField(term285259, term285259.getClass(), "type", 0);
        setIntField(term285260, term285260.getClass(), "type", 0);
        setField(term285260, term285260.getClass(), "next", null);
        setField(term285260, term285260.getClass(), "first", null);
        setField(term285260, term285260.getClass(), "last", null);
        setField(term285260, term285260.getClass(), "propListHead", null);
        setIntField(term285260, term285260.getClass(), "sourcePosition", 0);
        setField(term285260, term285260.getClass(), "jsType", null);
        setField(term285260, term285260.getClass(), "parent", null);
        setField(term285259, term285259.getClass(), "next", term285260);
        setField(term285259, term285259.getClass(), "first", null);
        setField(term285259, term285259.getClass(), "last", null);
        setField(term285259, term285259.getClass(), "propListHead", null);
        setIntField(term285259, term285259.getClass(), "sourcePosition", 0);
        setField(term285259, term285259.getClass(), "jsType", null);
        setField(term285259, term285259.getClass(), "parent", null);
        setField(term285258, term285258.getClass(), "first", term285259);
        setField(term285258, term285258.getClass(), "last", null);
        setField(term285258, term285258.getClass(), "propListHead", null);
        setIntField(term285258, term285258.getClass(), "sourcePosition", 0);
        setField(term285258, term285258.getClass(), "jsType", null);
        setField(term285258, term285258.getClass(), "parent", null);
        term285194 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term285204 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term285214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term285194, term285194.getClass(), "functionName", null);
        setBooleanField(term285194, term285194.getClass(), "itsNeedsActivation", false);
        setIntField(term285194, term285194.getClass(), "itsFunctionType", 0);
        setBooleanField(term285194, term285194.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term285194, term285194.getClass(), "encodedSourceStart", 0);
        setIntField(term285194, term285194.getClass(), "encodedSourceEnd", 0);
        setField(term285194, term285194.getClass(), "sourceName", null);
        setIntField(term285194, term285194.getClass(), "baseLineno", 0);
        setIntField(term285194, term285194.getClass(), "endLineno", 0);
        setField(term285194, term285194.getClass(), "functions", null);
        setField(term285194, term285194.getClass(), "regexps", null);
        setField(term285194, term285194.getClass(), "itsVariables", null);
        setField(term285194, term285194.getClass(), "itsConst", null);
        setField(term285194, term285194.getClass(), "itsVariableNames", null);
        setIntField(term285194, term285194.getClass(), "varStart", 0);
        setField(term285194, term285194.getClass(), "compilerData", null);
        setIntField(term285194, term285194.getClass(), "type", 33);
        setField(term285194, term285194.getClass(), "next", null);
        setField(term285204, term285204.getClass(), "functionName", null);
        setBooleanField(term285204, term285204.getClass(), "itsNeedsActivation", false);
        setIntField(term285204, term285204.getClass(), "itsFunctionType", 0);
        setBooleanField(term285204, term285204.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term285204, term285204.getClass(), "encodedSourceStart", 0);
        setIntField(term285204, term285204.getClass(), "encodedSourceEnd", 0);
        setField(term285204, term285204.getClass(), "sourceName", null);
        setIntField(term285204, term285204.getClass(), "baseLineno", 0);
        setIntField(term285204, term285204.getClass(), "endLineno", 0);
        setField(term285204, term285204.getClass(), "functions", null);
        setField(term285204, term285204.getClass(), "regexps", null);
        setField(term285204, term285204.getClass(), "itsVariables", null);
        setField(term285204, term285204.getClass(), "itsConst", null);
        setField(term285204, term285204.getClass(), "itsVariableNames", null);
        setIntField(term285204, term285204.getClass(), "varStart", 0);
        setField(term285204, term285204.getClass(), "compilerData", null);
        setIntField(term285204, term285204.getClass(), "type", 0);
        setIntField(term285214, term285214.getClass(), "type", 0);
        setField(term285214, term285214.getClass(), "next", null);
        setField(term285214, term285214.getClass(), "first", null);
        setField(term285214, term285214.getClass(), "last", null);
        setField(term285214, term285214.getClass(), "propListHead", null);
        setIntField(term285214, term285214.getClass(), "sourcePosition", 0);
        setField(term285214, term285214.getClass(), "jsType", null);
        setField(term285214, term285214.getClass(), "parent", null);
        setField(term285204, term285204.getClass(), "next", term285214);
        setField(term285204, term285204.getClass(), "first", null);
        setField(term285204, term285204.getClass(), "last", null);
        setField(term285204, term285204.getClass(), "propListHead", null);
        setIntField(term285204, term285204.getClass(), "sourcePosition", 0);
        setField(term285204, term285204.getClass(), "jsType", null);
        setField(term285204, term285204.getClass(), "parent", null);
        setField(term285194, term285194.getClass(), "first", term285204);
        setField(term285194, term285194.getClass(), "last", null);
        setField(term285194, term285194.getClass(), "propListHead", null);
        setIntField(term285194, term285194.getClass(), "sourcePosition", 0);
        setField(term285194, term285194.getClass(), "jsType", null);
        setField(term285194, term285194.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term285023;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term284937, args);
        assertTrue(recursiveEquals(term284937, term285257));
        assertTrue(recursiveEquals(term285023, term285258));
        assertTrue(recursiveEquals(retValue, term285194));
    }

};


