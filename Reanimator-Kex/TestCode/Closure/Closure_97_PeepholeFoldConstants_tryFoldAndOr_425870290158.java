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

public class PeepholeFoldConstants_tryFoldAndOr_425870290158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30495;
     Object term30581;
     Object term30667;
     Object term30753;
     Object term31084;
     Object term31085;
     Object term31086;
     Object term31087;
     Object term31022;

    public PeepholeFoldConstants_tryFoldAndOr_425870290158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30495 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term30581 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term30581, term30581.getClass(), "parent", null);
        setIntField(term30581, term30581.getClass(), "type", 0);
        term30667 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term30667, term30667.getClass(), "type", 0);
        term30753 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term31084 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term31084, term31084.getClass(), "currentTraversal", null);
        term31085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term31085, term31085.getClass(), "functionName", null);
        setBooleanField(term31085, term31085.getClass(), "itsNeedsActivation", false);
        setIntField(term31085, term31085.getClass(), "itsFunctionType", 0);
        setBooleanField(term31085, term31085.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term31085, term31085.getClass(), "encodedSourceStart", 0);
        setIntField(term31085, term31085.getClass(), "encodedSourceEnd", 0);
        setField(term31085, term31085.getClass(), "sourceName", null);
        setIntField(term31085, term31085.getClass(), "baseLineno", 0);
        setIntField(term31085, term31085.getClass(), "endLineno", 0);
        setField(term31085, term31085.getClass(), "functions", null);
        setField(term31085, term31085.getClass(), "regexps", null);
        setField(term31085, term31085.getClass(), "itsVariables", null);
        setField(term31085, term31085.getClass(), "itsConst", null);
        setField(term31085, term31085.getClass(), "itsVariableNames", null);
        setIntField(term31085, term31085.getClass(), "varStart", 0);
        setField(term31085, term31085.getClass(), "compilerData", null);
        setIntField(term31085, term31085.getClass(), "type", 0);
        setField(term31085, term31085.getClass(), "next", null);
        setField(term31085, term31085.getClass(), "first", null);
        setField(term31085, term31085.getClass(), "last", null);
        setField(term31085, term31085.getClass(), "propListHead", null);
        setIntField(term31085, term31085.getClass(), "sourcePosition", 0);
        setField(term31085, term31085.getClass(), "jsType", null);
        setField(term31085, term31085.getClass(), "parent", null);
        term31086 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term31086, term31086.getClass(), "functionName", null);
        setBooleanField(term31086, term31086.getClass(), "itsNeedsActivation", false);
        setIntField(term31086, term31086.getClass(), "itsFunctionType", 0);
        setBooleanField(term31086, term31086.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term31086, term31086.getClass(), "encodedSourceStart", 0);
        setIntField(term31086, term31086.getClass(), "encodedSourceEnd", 0);
        setField(term31086, term31086.getClass(), "sourceName", null);
        setIntField(term31086, term31086.getClass(), "baseLineno", 0);
        setIntField(term31086, term31086.getClass(), "endLineno", 0);
        setField(term31086, term31086.getClass(), "functions", null);
        setField(term31086, term31086.getClass(), "regexps", null);
        setField(term31086, term31086.getClass(), "itsVariables", null);
        setField(term31086, term31086.getClass(), "itsConst", null);
        setField(term31086, term31086.getClass(), "itsVariableNames", null);
        setIntField(term31086, term31086.getClass(), "varStart", 0);
        setField(term31086, term31086.getClass(), "compilerData", null);
        setIntField(term31086, term31086.getClass(), "type", 0);
        setField(term31086, term31086.getClass(), "next", null);
        setField(term31086, term31086.getClass(), "first", null);
        setField(term31086, term31086.getClass(), "last", null);
        setField(term31086, term31086.getClass(), "propListHead", null);
        setIntField(term31086, term31086.getClass(), "sourcePosition", 0);
        setField(term31086, term31086.getClass(), "jsType", null);
        setField(term31086, term31086.getClass(), "parent", null);
        term31087 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term31087, term31087.getClass(), "functionName", null);
        setBooleanField(term31087, term31087.getClass(), "itsNeedsActivation", false);
        setIntField(term31087, term31087.getClass(), "itsFunctionType", 0);
        setBooleanField(term31087, term31087.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term31087, term31087.getClass(), "encodedSourceStart", 0);
        setIntField(term31087, term31087.getClass(), "encodedSourceEnd", 0);
        setField(term31087, term31087.getClass(), "sourceName", null);
        setIntField(term31087, term31087.getClass(), "baseLineno", 0);
        setIntField(term31087, term31087.getClass(), "endLineno", 0);
        setField(term31087, term31087.getClass(), "functions", null);
        setField(term31087, term31087.getClass(), "regexps", null);
        setField(term31087, term31087.getClass(), "itsVariables", null);
        setField(term31087, term31087.getClass(), "itsConst", null);
        setField(term31087, term31087.getClass(), "itsVariableNames", null);
        setIntField(term31087, term31087.getClass(), "varStart", 0);
        setField(term31087, term31087.getClass(), "compilerData", null);
        setIntField(term31087, term31087.getClass(), "type", 0);
        setField(term31087, term31087.getClass(), "next", null);
        setField(term31087, term31087.getClass(), "first", null);
        setField(term31087, term31087.getClass(), "last", null);
        setField(term31087, term31087.getClass(), "propListHead", null);
        setIntField(term31087, term31087.getClass(), "sourcePosition", 0);
        setField(term31087, term31087.getClass(), "jsType", null);
        setField(term31087, term31087.getClass(), "parent", null);
        term31022 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term31022, term31022.getClass(), "functionName", null);
        setBooleanField(term31022, term31022.getClass(), "itsNeedsActivation", false);
        setIntField(term31022, term31022.getClass(), "itsFunctionType", 0);
        setBooleanField(term31022, term31022.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term31022, term31022.getClass(), "encodedSourceStart", 0);
        setIntField(term31022, term31022.getClass(), "encodedSourceEnd", 0);
        setField(term31022, term31022.getClass(), "sourceName", null);
        setIntField(term31022, term31022.getClass(), "baseLineno", 0);
        setIntField(term31022, term31022.getClass(), "endLineno", 0);
        setField(term31022, term31022.getClass(), "functions", null);
        setField(term31022, term31022.getClass(), "regexps", null);
        setField(term31022, term31022.getClass(), "itsVariables", null);
        setField(term31022, term31022.getClass(), "itsConst", null);
        setField(term31022, term31022.getClass(), "itsVariableNames", null);
        setIntField(term31022, term31022.getClass(), "varStart", 0);
        setField(term31022, term31022.getClass(), "compilerData", null);
        setIntField(term31022, term31022.getClass(), "type", 0);
        setField(term31022, term31022.getClass(), "next", null);
        setField(term31022, term31022.getClass(), "first", null);
        setField(term31022, term31022.getClass(), "last", null);
        setField(term31022, term31022.getClass(), "propListHead", null);
        setIntField(term31022, term31022.getClass(), "sourcePosition", 0);
        setField(term31022, term31022.getClass(), "jsType", null);
        setField(term31022, term31022.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term30581;
        args[1] = term30667;
        args[2] = term30753;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term30495, args);
        assertTrue(recursiveEquals(term30495, term31084));
        assertTrue(recursiveEquals(term30581, term31085));
        assertTrue(recursiveEquals(term30667, term31086));
        assertTrue(recursiveEquals(term30753, term31087));
        assertTrue(recursiveEquals(retValue, term31022));
    }

};


