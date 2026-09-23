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

public class PeepholeFoldConstants_tryFoldAndOr_425870290938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218727;
     Object term218813;
     Object term218899;
     Object term218991;
     Object term219407;
     Object term219408;
     Object term219409;
     Object term219410;
     Object term219353;

    public PeepholeFoldConstants_tryFoldAndOr_425870290938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218727 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term218813 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term218813, term218813.getClass(), "parent", null);
        setIntField(term218813, term218813.getClass(), "type", 0);
        term218899 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term218899, term218899.getClass(), "type", 0);
        term218991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term219407 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term219407, term219407.getClass(), "currentTraversal", null);
        term219408 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term219408, term219408.getClass(), "functionName", null);
        setBooleanField(term219408, term219408.getClass(), "itsNeedsActivation", false);
        setIntField(term219408, term219408.getClass(), "itsFunctionType", 0);
        setBooleanField(term219408, term219408.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term219408, term219408.getClass(), "encodedSourceStart", 0);
        setIntField(term219408, term219408.getClass(), "encodedSourceEnd", 0);
        setField(term219408, term219408.getClass(), "sourceName", null);
        setIntField(term219408, term219408.getClass(), "baseLineno", 0);
        setIntField(term219408, term219408.getClass(), "endLineno", 0);
        setField(term219408, term219408.getClass(), "functions", null);
        setField(term219408, term219408.getClass(), "regexps", null);
        setField(term219408, term219408.getClass(), "itsVariables", null);
        setField(term219408, term219408.getClass(), "itsConst", null);
        setField(term219408, term219408.getClass(), "itsVariableNames", null);
        setIntField(term219408, term219408.getClass(), "varStart", 0);
        setField(term219408, term219408.getClass(), "compilerData", null);
        setIntField(term219408, term219408.getClass(), "type", 0);
        setField(term219408, term219408.getClass(), "next", null);
        setField(term219408, term219408.getClass(), "first", null);
        setField(term219408, term219408.getClass(), "last", null);
        setField(term219408, term219408.getClass(), "propListHead", null);
        setIntField(term219408, term219408.getClass(), "sourcePosition", 0);
        setField(term219408, term219408.getClass(), "jsType", null);
        setField(term219408, term219408.getClass(), "parent", null);
        term219409 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term219409, term219409.getClass(), "functionName", null);
        setBooleanField(term219409, term219409.getClass(), "itsNeedsActivation", false);
        setIntField(term219409, term219409.getClass(), "itsFunctionType", 0);
        setBooleanField(term219409, term219409.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term219409, term219409.getClass(), "encodedSourceStart", 0);
        setIntField(term219409, term219409.getClass(), "encodedSourceEnd", 0);
        setField(term219409, term219409.getClass(), "sourceName", null);
        setIntField(term219409, term219409.getClass(), "baseLineno", 0);
        setIntField(term219409, term219409.getClass(), "endLineno", 0);
        setField(term219409, term219409.getClass(), "functions", null);
        setField(term219409, term219409.getClass(), "regexps", null);
        setField(term219409, term219409.getClass(), "itsVariables", null);
        setField(term219409, term219409.getClass(), "itsConst", null);
        setField(term219409, term219409.getClass(), "itsVariableNames", null);
        setIntField(term219409, term219409.getClass(), "varStart", 0);
        setField(term219409, term219409.getClass(), "compilerData", null);
        setIntField(term219409, term219409.getClass(), "type", 0);
        setField(term219409, term219409.getClass(), "next", null);
        setField(term219409, term219409.getClass(), "first", null);
        setField(term219409, term219409.getClass(), "last", null);
        setField(term219409, term219409.getClass(), "propListHead", null);
        setIntField(term219409, term219409.getClass(), "sourcePosition", 0);
        setField(term219409, term219409.getClass(), "jsType", null);
        setField(term219409, term219409.getClass(), "parent", null);
        term219410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term219410, term219410.getClass(), "str", null);
        setIntField(term219410, term219410.getClass(), "type", 0);
        setField(term219410, term219410.getClass(), "next", null);
        setField(term219410, term219410.getClass(), "first", null);
        setField(term219410, term219410.getClass(), "last", null);
        setField(term219410, term219410.getClass(), "propListHead", null);
        setIntField(term219410, term219410.getClass(), "sourcePosition", 0);
        setField(term219410, term219410.getClass(), "jsType", null);
        setField(term219410, term219410.getClass(), "parent", null);
        term219353 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term219353, term219353.getClass(), "functionName", null);
        setBooleanField(term219353, term219353.getClass(), "itsNeedsActivation", false);
        setIntField(term219353, term219353.getClass(), "itsFunctionType", 0);
        setBooleanField(term219353, term219353.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term219353, term219353.getClass(), "encodedSourceStart", 0);
        setIntField(term219353, term219353.getClass(), "encodedSourceEnd", 0);
        setField(term219353, term219353.getClass(), "sourceName", null);
        setIntField(term219353, term219353.getClass(), "baseLineno", 0);
        setIntField(term219353, term219353.getClass(), "endLineno", 0);
        setField(term219353, term219353.getClass(), "functions", null);
        setField(term219353, term219353.getClass(), "regexps", null);
        setField(term219353, term219353.getClass(), "itsVariables", null);
        setField(term219353, term219353.getClass(), "itsConst", null);
        setField(term219353, term219353.getClass(), "itsVariableNames", null);
        setIntField(term219353, term219353.getClass(), "varStart", 0);
        setField(term219353, term219353.getClass(), "compilerData", null);
        setIntField(term219353, term219353.getClass(), "type", 0);
        setField(term219353, term219353.getClass(), "next", null);
        setField(term219353, term219353.getClass(), "first", null);
        setField(term219353, term219353.getClass(), "last", null);
        setField(term219353, term219353.getClass(), "propListHead", null);
        setIntField(term219353, term219353.getClass(), "sourcePosition", 0);
        setField(term219353, term219353.getClass(), "jsType", null);
        setField(term219353, term219353.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term218813;
        args[1] = term218899;
        args[2] = term218991;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term218727, args);
        assertTrue(recursiveEquals(term218727, term219407));
        assertTrue(recursiveEquals(term218813, term219408));
        assertTrue(recursiveEquals(term218899, term219409));
        assertTrue(recursiveEquals(term218991, term219410));
        assertTrue(recursiveEquals(retValue, term219353));
    }

};


