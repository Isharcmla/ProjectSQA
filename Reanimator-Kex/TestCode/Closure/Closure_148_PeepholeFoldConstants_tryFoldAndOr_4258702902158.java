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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588610;
     Object term588696;
     Object term588852;
     Object term588938;
     Object term589100;
     Object term589101;
     Object term589103;
     Object term589104;
     Object term589009;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term588610 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term588696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term588766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term588766, term588766.getClass(), "type", 108);
        setField(term588696, term588696.getClass(), "parent", term588766);
        setIntField(term588696, term588696.getClass(), "type", 0);
        term588852 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term588852, term588852.getClass(), "type", 0);
        term588938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term588938, term588938.getClass(), "type", 44);
        term589100 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term589100, term589100.getClass(), "currentTraversal", null);
        term589101 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term589102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term589101, term589101.getClass(), "functionName", null);
        setBooleanField(term589101, term589101.getClass(), "itsNeedsActivation", false);
        setIntField(term589101, term589101.getClass(), "itsFunctionType", 0);
        setBooleanField(term589101, term589101.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term589101, term589101.getClass(), "encodedSourceStart", 0);
        setIntField(term589101, term589101.getClass(), "encodedSourceEnd", 0);
        setField(term589101, term589101.getClass(), "sourceName", null);
        setIntField(term589101, term589101.getClass(), "baseLineno", 0);
        setIntField(term589101, term589101.getClass(), "endLineno", 0);
        setField(term589101, term589101.getClass(), "functions", null);
        setField(term589101, term589101.getClass(), "regexps", null);
        setField(term589101, term589101.getClass(), "itsVariables", null);
        setField(term589101, term589101.getClass(), "itsConst", null);
        setField(term589101, term589101.getClass(), "itsVariableNames", null);
        setIntField(term589101, term589101.getClass(), "varStart", 0);
        setField(term589101, term589101.getClass(), "compilerData", null);
        setIntField(term589101, term589101.getClass(), "type", 0);
        setField(term589101, term589101.getClass(), "next", null);
        setField(term589101, term589101.getClass(), "first", null);
        setField(term589101, term589101.getClass(), "last", null);
        setField(term589101, term589101.getClass(), "propListHead", null);
        setIntField(term589101, term589101.getClass(), "sourcePosition", 0);
        setField(term589101, term589101.getClass(), "jsType", null);
        setIntField(term589102, term589102.getClass(), "type", 108);
        setField(term589102, term589102.getClass(), "next", null);
        setField(term589102, term589102.getClass(), "first", null);
        setField(term589102, term589102.getClass(), "last", null);
        setField(term589102, term589102.getClass(), "propListHead", null);
        setIntField(term589102, term589102.getClass(), "sourcePosition", 0);
        setField(term589102, term589102.getClass(), "jsType", null);
        setField(term589102, term589102.getClass(), "parent", null);
        setField(term589101, term589101.getClass(), "parent", term589102);
        term589103 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term589103, term589103.getClass(), "functionName", null);
        setBooleanField(term589103, term589103.getClass(), "itsNeedsActivation", false);
        setIntField(term589103, term589103.getClass(), "itsFunctionType", 0);
        setBooleanField(term589103, term589103.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term589103, term589103.getClass(), "encodedSourceStart", 0);
        setIntField(term589103, term589103.getClass(), "encodedSourceEnd", 0);
        setField(term589103, term589103.getClass(), "sourceName", null);
        setIntField(term589103, term589103.getClass(), "baseLineno", 0);
        setIntField(term589103, term589103.getClass(), "endLineno", 0);
        setField(term589103, term589103.getClass(), "functions", null);
        setField(term589103, term589103.getClass(), "regexps", null);
        setField(term589103, term589103.getClass(), "itsVariables", null);
        setField(term589103, term589103.getClass(), "itsConst", null);
        setField(term589103, term589103.getClass(), "itsVariableNames", null);
        setIntField(term589103, term589103.getClass(), "varStart", 0);
        setField(term589103, term589103.getClass(), "compilerData", null);
        setIntField(term589103, term589103.getClass(), "type", 0);
        setField(term589103, term589103.getClass(), "next", null);
        setField(term589103, term589103.getClass(), "first", null);
        setField(term589103, term589103.getClass(), "last", null);
        setField(term589103, term589103.getClass(), "propListHead", null);
        setIntField(term589103, term589103.getClass(), "sourcePosition", 0);
        setField(term589103, term589103.getClass(), "jsType", null);
        setField(term589103, term589103.getClass(), "parent", null);
        term589104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term589104, term589104.getClass(), "functionName", null);
        setBooleanField(term589104, term589104.getClass(), "itsNeedsActivation", false);
        setIntField(term589104, term589104.getClass(), "itsFunctionType", 0);
        setBooleanField(term589104, term589104.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term589104, term589104.getClass(), "encodedSourceStart", 0);
        setIntField(term589104, term589104.getClass(), "encodedSourceEnd", 0);
        setField(term589104, term589104.getClass(), "sourceName", null);
        setIntField(term589104, term589104.getClass(), "baseLineno", 0);
        setIntField(term589104, term589104.getClass(), "endLineno", 0);
        setField(term589104, term589104.getClass(), "functions", null);
        setField(term589104, term589104.getClass(), "regexps", null);
        setField(term589104, term589104.getClass(), "itsVariables", null);
        setField(term589104, term589104.getClass(), "itsConst", null);
        setField(term589104, term589104.getClass(), "itsVariableNames", null);
        setIntField(term589104, term589104.getClass(), "varStart", 0);
        setField(term589104, term589104.getClass(), "compilerData", null);
        setIntField(term589104, term589104.getClass(), "type", 44);
        setField(term589104, term589104.getClass(), "next", null);
        setField(term589104, term589104.getClass(), "first", null);
        setField(term589104, term589104.getClass(), "last", null);
        setField(term589104, term589104.getClass(), "propListHead", null);
        setIntField(term589104, term589104.getClass(), "sourcePosition", 0);
        setField(term589104, term589104.getClass(), "jsType", null);
        setField(term589104, term589104.getClass(), "parent", null);
        term589009 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term589020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term589009, term589009.getClass(), "functionName", null);
        setBooleanField(term589009, term589009.getClass(), "itsNeedsActivation", false);
        setIntField(term589009, term589009.getClass(), "itsFunctionType", 0);
        setBooleanField(term589009, term589009.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term589009, term589009.getClass(), "encodedSourceStart", 0);
        setIntField(term589009, term589009.getClass(), "encodedSourceEnd", 0);
        setField(term589009, term589009.getClass(), "sourceName", null);
        setIntField(term589009, term589009.getClass(), "baseLineno", 0);
        setIntField(term589009, term589009.getClass(), "endLineno", 0);
        setField(term589009, term589009.getClass(), "functions", null);
        setField(term589009, term589009.getClass(), "regexps", null);
        setField(term589009, term589009.getClass(), "itsVariables", null);
        setField(term589009, term589009.getClass(), "itsConst", null);
        setField(term589009, term589009.getClass(), "itsVariableNames", null);
        setIntField(term589009, term589009.getClass(), "varStart", 0);
        setField(term589009, term589009.getClass(), "compilerData", null);
        setIntField(term589009, term589009.getClass(), "type", 0);
        setField(term589009, term589009.getClass(), "next", null);
        setField(term589009, term589009.getClass(), "first", null);
        setField(term589009, term589009.getClass(), "last", null);
        setField(term589009, term589009.getClass(), "propListHead", null);
        setIntField(term589009, term589009.getClass(), "sourcePosition", 0);
        setField(term589009, term589009.getClass(), "jsType", null);
        setIntField(term589020, term589020.getClass(), "type", 108);
        setField(term589020, term589020.getClass(), "next", null);
        setField(term589020, term589020.getClass(), "first", null);
        setField(term589020, term589020.getClass(), "last", null);
        setField(term589020, term589020.getClass(), "propListHead", null);
        setIntField(term589020, term589020.getClass(), "sourcePosition", 0);
        setField(term589020, term589020.getClass(), "jsType", null);
        setField(term589020, term589020.getClass(), "parent", null);
        setField(term589009, term589009.getClass(), "parent", term589020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term588696;
        args[1] = term588852;
        args[2] = term588938;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term588610, args);
        assertTrue(recursiveEquals(term588610, term589100));
        assertTrue(recursiveEquals(term588696, term589101));
        assertTrue(recursiveEquals(term588852, term589103));
        assertTrue(recursiveEquals(term588938, term589104));
        assertTrue(recursiveEquals(retValue, term589009));
    }

};


