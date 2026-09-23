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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398244;
     Object term398330;
     Object term398486;
     Object term398572;
     Object term399422;
     Object term399423;
     Object term399425;
     Object term399426;
     Object term399331;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398244 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term398330 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term398400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term398400, term398400.getClass(), "type", 108);
        setField(term398330, term398330.getClass(), "parent", term398400);
        setIntField(term398330, term398330.getClass(), "type", 0);
        term398486 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term398486, term398486.getClass(), "type", 55);
        term398572 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term398572, term398572.getClass(), "type", 63);
        term399422 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term399422, term399422.getClass(), "currentTraversal", null);
        term399423 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term399424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term399423, term399423.getClass(), "functionName", null);
        setBooleanField(term399423, term399423.getClass(), "itsNeedsActivation", false);
        setIntField(term399423, term399423.getClass(), "itsFunctionType", 0);
        setBooleanField(term399423, term399423.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term399423, term399423.getClass(), "encodedSourceStart", 0);
        setIntField(term399423, term399423.getClass(), "encodedSourceEnd", 0);
        setField(term399423, term399423.getClass(), "sourceName", null);
        setIntField(term399423, term399423.getClass(), "baseLineno", 0);
        setIntField(term399423, term399423.getClass(), "endLineno", 0);
        setField(term399423, term399423.getClass(), "functions", null);
        setField(term399423, term399423.getClass(), "regexps", null);
        setField(term399423, term399423.getClass(), "itsVariables", null);
        setField(term399423, term399423.getClass(), "itsConst", null);
        setField(term399423, term399423.getClass(), "itsVariableNames", null);
        setIntField(term399423, term399423.getClass(), "varStart", 0);
        setField(term399423, term399423.getClass(), "compilerData", null);
        setIntField(term399423, term399423.getClass(), "type", 0);
        setField(term399423, term399423.getClass(), "next", null);
        setField(term399423, term399423.getClass(), "first", null);
        setField(term399423, term399423.getClass(), "last", null);
        setField(term399423, term399423.getClass(), "propListHead", null);
        setIntField(term399423, term399423.getClass(), "sourcePosition", 0);
        setField(term399423, term399423.getClass(), "jsType", null);
        setIntField(term399424, term399424.getClass(), "type", 108);
        setField(term399424, term399424.getClass(), "next", null);
        setField(term399424, term399424.getClass(), "first", null);
        setField(term399424, term399424.getClass(), "last", null);
        setField(term399424, term399424.getClass(), "propListHead", null);
        setIntField(term399424, term399424.getClass(), "sourcePosition", 0);
        setField(term399424, term399424.getClass(), "jsType", null);
        setField(term399424, term399424.getClass(), "parent", null);
        setField(term399423, term399423.getClass(), "parent", term399424);
        term399425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term399425, term399425.getClass(), "functionName", null);
        setBooleanField(term399425, term399425.getClass(), "itsNeedsActivation", false);
        setIntField(term399425, term399425.getClass(), "itsFunctionType", 0);
        setBooleanField(term399425, term399425.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term399425, term399425.getClass(), "encodedSourceStart", 0);
        setIntField(term399425, term399425.getClass(), "encodedSourceEnd", 0);
        setField(term399425, term399425.getClass(), "sourceName", null);
        setIntField(term399425, term399425.getClass(), "baseLineno", 0);
        setIntField(term399425, term399425.getClass(), "endLineno", 0);
        setField(term399425, term399425.getClass(), "functions", null);
        setField(term399425, term399425.getClass(), "regexps", null);
        setField(term399425, term399425.getClass(), "itsVariables", null);
        setField(term399425, term399425.getClass(), "itsConst", null);
        setField(term399425, term399425.getClass(), "itsVariableNames", null);
        setIntField(term399425, term399425.getClass(), "varStart", 0);
        setField(term399425, term399425.getClass(), "compilerData", null);
        setIntField(term399425, term399425.getClass(), "type", 55);
        setField(term399425, term399425.getClass(), "next", null);
        setField(term399425, term399425.getClass(), "first", null);
        setField(term399425, term399425.getClass(), "last", null);
        setField(term399425, term399425.getClass(), "propListHead", null);
        setIntField(term399425, term399425.getClass(), "sourcePosition", 0);
        setField(term399425, term399425.getClass(), "jsType", null);
        setField(term399425, term399425.getClass(), "parent", null);
        term399426 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term399426, term399426.getClass(), "functionName", null);
        setBooleanField(term399426, term399426.getClass(), "itsNeedsActivation", false);
        setIntField(term399426, term399426.getClass(), "itsFunctionType", 0);
        setBooleanField(term399426, term399426.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term399426, term399426.getClass(), "encodedSourceStart", 0);
        setIntField(term399426, term399426.getClass(), "encodedSourceEnd", 0);
        setField(term399426, term399426.getClass(), "sourceName", null);
        setIntField(term399426, term399426.getClass(), "baseLineno", 0);
        setIntField(term399426, term399426.getClass(), "endLineno", 0);
        setField(term399426, term399426.getClass(), "functions", null);
        setField(term399426, term399426.getClass(), "regexps", null);
        setField(term399426, term399426.getClass(), "itsVariables", null);
        setField(term399426, term399426.getClass(), "itsConst", null);
        setField(term399426, term399426.getClass(), "itsVariableNames", null);
        setIntField(term399426, term399426.getClass(), "varStart", 0);
        setField(term399426, term399426.getClass(), "compilerData", null);
        setIntField(term399426, term399426.getClass(), "type", 63);
        setField(term399426, term399426.getClass(), "next", null);
        setField(term399426, term399426.getClass(), "first", null);
        setField(term399426, term399426.getClass(), "last", null);
        setField(term399426, term399426.getClass(), "propListHead", null);
        setIntField(term399426, term399426.getClass(), "sourcePosition", 0);
        setField(term399426, term399426.getClass(), "jsType", null);
        setField(term399426, term399426.getClass(), "parent", null);
        term399331 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term399342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term399331, term399331.getClass(), "functionName", null);
        setBooleanField(term399331, term399331.getClass(), "itsNeedsActivation", false);
        setIntField(term399331, term399331.getClass(), "itsFunctionType", 0);
        setBooleanField(term399331, term399331.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term399331, term399331.getClass(), "encodedSourceStart", 0);
        setIntField(term399331, term399331.getClass(), "encodedSourceEnd", 0);
        setField(term399331, term399331.getClass(), "sourceName", null);
        setIntField(term399331, term399331.getClass(), "baseLineno", 0);
        setIntField(term399331, term399331.getClass(), "endLineno", 0);
        setField(term399331, term399331.getClass(), "functions", null);
        setField(term399331, term399331.getClass(), "regexps", null);
        setField(term399331, term399331.getClass(), "itsVariables", null);
        setField(term399331, term399331.getClass(), "itsConst", null);
        setField(term399331, term399331.getClass(), "itsVariableNames", null);
        setIntField(term399331, term399331.getClass(), "varStart", 0);
        setField(term399331, term399331.getClass(), "compilerData", null);
        setIntField(term399331, term399331.getClass(), "type", 0);
        setField(term399331, term399331.getClass(), "next", null);
        setField(term399331, term399331.getClass(), "first", null);
        setField(term399331, term399331.getClass(), "last", null);
        setField(term399331, term399331.getClass(), "propListHead", null);
        setIntField(term399331, term399331.getClass(), "sourcePosition", 0);
        setField(term399331, term399331.getClass(), "jsType", null);
        setIntField(term399342, term399342.getClass(), "type", 108);
        setField(term399342, term399342.getClass(), "next", null);
        setField(term399342, term399342.getClass(), "first", null);
        setField(term399342, term399342.getClass(), "last", null);
        setField(term399342, term399342.getClass(), "propListHead", null);
        setIntField(term399342, term399342.getClass(), "sourcePosition", 0);
        setField(term399342, term399342.getClass(), "jsType", null);
        setField(term399342, term399342.getClass(), "parent", null);
        setField(term399331, term399331.getClass(), "parent", term399342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term398330;
        args[1] = term398486;
        args[2] = term398572;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term398244, args);
        assertTrue(recursiveEquals(term398244, term399422));
        assertTrue(recursiveEquals(term398330, term399423));
        assertTrue(recursiveEquals(term398486, term399425));
        assertTrue(recursiveEquals(term398572, term399426));
        assertTrue(recursiveEquals(retValue, term399331));
    }

};


