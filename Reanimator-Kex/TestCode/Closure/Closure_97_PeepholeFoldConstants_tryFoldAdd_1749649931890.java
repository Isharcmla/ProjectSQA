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

public class PeepholeFoldConstants_tryFoldAdd_1749649931890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251586;
     Object term251672;
     Object term251758;
     Object term251844;
     Object term251910;
     Object term251911;
     Object term251912;
     Object term251913;
     Object term251852;

    public PeepholeFoldConstants_tryFoldAdd_1749649931890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251586 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term251672 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term251672, term251672.getClass(), "type", 21);
        term251758 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term251758, term251758.getClass(), "type", 21);
        term251844 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term251910 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term251910, term251910.getClass(), "currentTraversal", null);
        term251911 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term251911, term251911.getClass(), "functionName", null);
        setBooleanField(term251911, term251911.getClass(), "itsNeedsActivation", false);
        setIntField(term251911, term251911.getClass(), "itsFunctionType", 0);
        setBooleanField(term251911, term251911.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term251911, term251911.getClass(), "encodedSourceStart", 0);
        setIntField(term251911, term251911.getClass(), "encodedSourceEnd", 0);
        setField(term251911, term251911.getClass(), "sourceName", null);
        setIntField(term251911, term251911.getClass(), "baseLineno", 0);
        setIntField(term251911, term251911.getClass(), "endLineno", 0);
        setField(term251911, term251911.getClass(), "functions", null);
        setField(term251911, term251911.getClass(), "regexps", null);
        setField(term251911, term251911.getClass(), "itsVariables", null);
        setField(term251911, term251911.getClass(), "itsConst", null);
        setField(term251911, term251911.getClass(), "itsVariableNames", null);
        setIntField(term251911, term251911.getClass(), "varStart", 0);
        setField(term251911, term251911.getClass(), "compilerData", null);
        setIntField(term251911, term251911.getClass(), "type", 21);
        setField(term251911, term251911.getClass(), "next", null);
        setField(term251911, term251911.getClass(), "first", null);
        setField(term251911, term251911.getClass(), "last", null);
        setField(term251911, term251911.getClass(), "propListHead", null);
        setIntField(term251911, term251911.getClass(), "sourcePosition", 0);
        setField(term251911, term251911.getClass(), "jsType", null);
        setField(term251911, term251911.getClass(), "parent", null);
        term251912 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term251912, term251912.getClass(), "functionName", null);
        setBooleanField(term251912, term251912.getClass(), "itsNeedsActivation", false);
        setIntField(term251912, term251912.getClass(), "itsFunctionType", 0);
        setBooleanField(term251912, term251912.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term251912, term251912.getClass(), "encodedSourceStart", 0);
        setIntField(term251912, term251912.getClass(), "encodedSourceEnd", 0);
        setField(term251912, term251912.getClass(), "sourceName", null);
        setIntField(term251912, term251912.getClass(), "baseLineno", 0);
        setIntField(term251912, term251912.getClass(), "endLineno", 0);
        setField(term251912, term251912.getClass(), "functions", null);
        setField(term251912, term251912.getClass(), "regexps", null);
        setField(term251912, term251912.getClass(), "itsVariables", null);
        setField(term251912, term251912.getClass(), "itsConst", null);
        setField(term251912, term251912.getClass(), "itsVariableNames", null);
        setIntField(term251912, term251912.getClass(), "varStart", 0);
        setField(term251912, term251912.getClass(), "compilerData", null);
        setIntField(term251912, term251912.getClass(), "type", 21);
        setField(term251912, term251912.getClass(), "next", null);
        setField(term251912, term251912.getClass(), "first", null);
        setField(term251912, term251912.getClass(), "last", null);
        setField(term251912, term251912.getClass(), "propListHead", null);
        setIntField(term251912, term251912.getClass(), "sourcePosition", 0);
        setField(term251912, term251912.getClass(), "jsType", null);
        setField(term251912, term251912.getClass(), "parent", null);
        term251913 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term251913, term251913.getClass(), "functionName", null);
        setBooleanField(term251913, term251913.getClass(), "itsNeedsActivation", false);
        setIntField(term251913, term251913.getClass(), "itsFunctionType", 0);
        setBooleanField(term251913, term251913.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term251913, term251913.getClass(), "encodedSourceStart", 0);
        setIntField(term251913, term251913.getClass(), "encodedSourceEnd", 0);
        setField(term251913, term251913.getClass(), "sourceName", null);
        setIntField(term251913, term251913.getClass(), "baseLineno", 0);
        setIntField(term251913, term251913.getClass(), "endLineno", 0);
        setField(term251913, term251913.getClass(), "functions", null);
        setField(term251913, term251913.getClass(), "regexps", null);
        setField(term251913, term251913.getClass(), "itsVariables", null);
        setField(term251913, term251913.getClass(), "itsConst", null);
        setField(term251913, term251913.getClass(), "itsVariableNames", null);
        setIntField(term251913, term251913.getClass(), "varStart", 0);
        setField(term251913, term251913.getClass(), "compilerData", null);
        setIntField(term251913, term251913.getClass(), "type", 0);
        setField(term251913, term251913.getClass(), "next", null);
        setField(term251913, term251913.getClass(), "first", null);
        setField(term251913, term251913.getClass(), "last", null);
        setField(term251913, term251913.getClass(), "propListHead", null);
        setIntField(term251913, term251913.getClass(), "sourcePosition", 0);
        setField(term251913, term251913.getClass(), "jsType", null);
        setField(term251913, term251913.getClass(), "parent", null);
        term251852 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term251852, term251852.getClass(), "functionName", null);
        setBooleanField(term251852, term251852.getClass(), "itsNeedsActivation", false);
        setIntField(term251852, term251852.getClass(), "itsFunctionType", 0);
        setBooleanField(term251852, term251852.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term251852, term251852.getClass(), "encodedSourceStart", 0);
        setIntField(term251852, term251852.getClass(), "encodedSourceEnd", 0);
        setField(term251852, term251852.getClass(), "sourceName", null);
        setIntField(term251852, term251852.getClass(), "baseLineno", 0);
        setIntField(term251852, term251852.getClass(), "endLineno", 0);
        setField(term251852, term251852.getClass(), "functions", null);
        setField(term251852, term251852.getClass(), "regexps", null);
        setField(term251852, term251852.getClass(), "itsVariables", null);
        setField(term251852, term251852.getClass(), "itsConst", null);
        setField(term251852, term251852.getClass(), "itsVariableNames", null);
        setIntField(term251852, term251852.getClass(), "varStart", 0);
        setField(term251852, term251852.getClass(), "compilerData", null);
        setIntField(term251852, term251852.getClass(), "type", 21);
        setField(term251852, term251852.getClass(), "next", null);
        setField(term251852, term251852.getClass(), "first", null);
        setField(term251852, term251852.getClass(), "last", null);
        setField(term251852, term251852.getClass(), "propListHead", null);
        setIntField(term251852, term251852.getClass(), "sourcePosition", 0);
        setField(term251852, term251852.getClass(), "jsType", null);
        setField(term251852, term251852.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term251672;
        args[1] = term251758;
        args[2] = term251844;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term251586, args);
        assertTrue(recursiveEquals(term251586, term251910));
        assertTrue(recursiveEquals(term251672, term251911));
        assertTrue(recursiveEquals(term251758, term251912));
        assertTrue(recursiveEquals(term251844, term251913));
        assertTrue(recursiveEquals(retValue, term251852));
    }

};


