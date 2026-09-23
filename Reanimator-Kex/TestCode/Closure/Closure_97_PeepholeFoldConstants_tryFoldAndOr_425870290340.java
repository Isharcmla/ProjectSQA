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

public class PeepholeFoldConstants_tryFoldAndOr_425870290340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65877;
     Object term65969;
     Object term66055;
     Object term66147;
     Object term81162;
     Object term81163;
     Object term81164;
     Object term81165;
     Object term81116;

    public PeepholeFoldConstants_tryFoldAndOr_425870290340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65877 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term65969 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term65969, term65969.getClass(), "parent", null);
        setIntField(term65969, term65969.getClass(), "type", 0);
        term66055 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term66055, term66055.getClass(), "type", 0);
        term66147 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term81162 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81162, term81162.getClass(), "currentTraversal", null);
        term81163 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81163, term81163.getClass(), "str", null);
        setIntField(term81163, term81163.getClass(), "type", 0);
        setField(term81163, term81163.getClass(), "next", null);
        setField(term81163, term81163.getClass(), "first", null);
        setField(term81163, term81163.getClass(), "last", null);
        setField(term81163, term81163.getClass(), "propListHead", null);
        setIntField(term81163, term81163.getClass(), "sourcePosition", 0);
        setField(term81163, term81163.getClass(), "jsType", null);
        setField(term81163, term81163.getClass(), "parent", null);
        term81164 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81164, term81164.getClass(), "functionName", null);
        setBooleanField(term81164, term81164.getClass(), "itsNeedsActivation", false);
        setIntField(term81164, term81164.getClass(), "itsFunctionType", 0);
        setBooleanField(term81164, term81164.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81164, term81164.getClass(), "encodedSourceStart", 0);
        setIntField(term81164, term81164.getClass(), "encodedSourceEnd", 0);
        setField(term81164, term81164.getClass(), "sourceName", null);
        setIntField(term81164, term81164.getClass(), "baseLineno", 0);
        setIntField(term81164, term81164.getClass(), "endLineno", 0);
        setField(term81164, term81164.getClass(), "functions", null);
        setField(term81164, term81164.getClass(), "regexps", null);
        setField(term81164, term81164.getClass(), "itsVariables", null);
        setField(term81164, term81164.getClass(), "itsConst", null);
        setField(term81164, term81164.getClass(), "itsVariableNames", null);
        setIntField(term81164, term81164.getClass(), "varStart", 0);
        setField(term81164, term81164.getClass(), "compilerData", null);
        setIntField(term81164, term81164.getClass(), "type", 0);
        setField(term81164, term81164.getClass(), "next", null);
        setField(term81164, term81164.getClass(), "first", null);
        setField(term81164, term81164.getClass(), "last", null);
        setField(term81164, term81164.getClass(), "propListHead", null);
        setIntField(term81164, term81164.getClass(), "sourcePosition", 0);
        setField(term81164, term81164.getClass(), "jsType", null);
        setField(term81164, term81164.getClass(), "parent", null);
        term81165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81165, term81165.getClass(), "str", null);
        setIntField(term81165, term81165.getClass(), "type", 0);
        setField(term81165, term81165.getClass(), "next", null);
        setField(term81165, term81165.getClass(), "first", null);
        setField(term81165, term81165.getClass(), "last", null);
        setField(term81165, term81165.getClass(), "propListHead", null);
        setIntField(term81165, term81165.getClass(), "sourcePosition", 0);
        setField(term81165, term81165.getClass(), "jsType", null);
        setField(term81165, term81165.getClass(), "parent", null);
        term81116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81116, term81116.getClass(), "str", null);
        setIntField(term81116, term81116.getClass(), "type", 0);
        setField(term81116, term81116.getClass(), "next", null);
        setField(term81116, term81116.getClass(), "first", null);
        setField(term81116, term81116.getClass(), "last", null);
        setField(term81116, term81116.getClass(), "propListHead", null);
        setIntField(term81116, term81116.getClass(), "sourcePosition", 0);
        setField(term81116, term81116.getClass(), "jsType", null);
        setField(term81116, term81116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term65969;
        args[1] = term66055;
        args[2] = term66147;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term65877, args);
        assertTrue(recursiveEquals(term65877, term81162));
        assertTrue(recursiveEquals(term65969, term81163));
        assertTrue(recursiveEquals(term66055, term81164));
        assertTrue(recursiveEquals(term66147, term81165));
        assertTrue(recursiveEquals(retValue, term81116));
    }

};


