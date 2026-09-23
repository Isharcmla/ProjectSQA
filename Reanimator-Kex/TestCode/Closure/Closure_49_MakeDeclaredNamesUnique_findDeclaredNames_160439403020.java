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

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2279;
     Object term2365;
     Object term2537;
     Object term2985;
     Object term2986;
     Object term2987;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2279 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term2365 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2451 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2365, term2365.getClass(), "type", -2147483638);
        setField(term2365, term2365.getClass(), "first", term2451);
        term2537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2537, term2537.getClass(), "type", 2147483637);
        term2985 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        setField(term2985, term2985.getClass(), "nameStack", null);
        setField(term2985, term2985.getClass(), "rootRenamer", null);
        term2986 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term2986, term2986.getClass(), "functionName", null);
        setBooleanField(term2986, term2986.getClass(), "itsNeedsActivation", false);
        setIntField(term2986, term2986.getClass(), "itsFunctionType", 0);
        setBooleanField(term2986, term2986.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2986, term2986.getClass(), "encodedSourceStart", 0);
        setIntField(term2986, term2986.getClass(), "encodedSourceEnd", 0);
        setField(term2986, term2986.getClass(), "sourceName", null);
        setIntField(term2986, term2986.getClass(), "baseLineno", 0);
        setIntField(term2986, term2986.getClass(), "endLineno", 0);
        setField(term2986, term2986.getClass(), "functions", null);
        setField(term2986, term2986.getClass(), "regexps", null);
        setField(term2986, term2986.getClass(), "itsVariables", null);
        setField(term2986, term2986.getClass(), "itsConst", null);
        setField(term2986, term2986.getClass(), "itsVariableNames", null);
        setIntField(term2986, term2986.getClass(), "varStart", 0);
        setField(term2986, term2986.getClass(), "compilerData", null);
        setIntField(term2986, term2986.getClass(), "type", 2147483637);
        setField(term2986, term2986.getClass(), "next", null);
        setField(term2986, term2986.getClass(), "first", null);
        setField(term2986, term2986.getClass(), "last", null);
        setField(term2986, term2986.getClass(), "propListHead", null);
        setIntField(term2986, term2986.getClass(), "sourcePosition", 0);
        setField(term2986, term2986.getClass(), "jsType", null);
        setField(term2986, term2986.getClass(), "parent", null);
        term2987 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term2987, term2987.getClass(), "functionName", null);
        setBooleanField(term2987, term2987.getClass(), "itsNeedsActivation", false);
        setIntField(term2987, term2987.getClass(), "itsFunctionType", 0);
        setBooleanField(term2987, term2987.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2987, term2987.getClass(), "encodedSourceStart", 0);
        setIntField(term2987, term2987.getClass(), "encodedSourceEnd", 0);
        setField(term2987, term2987.getClass(), "sourceName", null);
        setIntField(term2987, term2987.getClass(), "baseLineno", 0);
        setIntField(term2987, term2987.getClass(), "endLineno", 0);
        setField(term2987, term2987.getClass(), "functions", null);
        setField(term2987, term2987.getClass(), "regexps", null);
        setField(term2987, term2987.getClass(), "itsVariables", null);
        setField(term2987, term2987.getClass(), "itsConst", null);
        setField(term2987, term2987.getClass(), "itsVariableNames", null);
        setIntField(term2987, term2987.getClass(), "varStart", 0);
        setField(term2987, term2987.getClass(), "compilerData", null);
        setIntField(term2987, term2987.getClass(), "type", -2147483638);
        setField(term2987, term2987.getClass(), "next", null);
        setField(term2988, term2988.getClass(), "functionName", null);
        setBooleanField(term2988, term2988.getClass(), "itsNeedsActivation", false);
        setIntField(term2988, term2988.getClass(), "itsFunctionType", 0);
        setBooleanField(term2988, term2988.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2988, term2988.getClass(), "encodedSourceStart", 0);
        setIntField(term2988, term2988.getClass(), "encodedSourceEnd", 0);
        setField(term2988, term2988.getClass(), "sourceName", null);
        setIntField(term2988, term2988.getClass(), "baseLineno", 0);
        setIntField(term2988, term2988.getClass(), "endLineno", 0);
        setField(term2988, term2988.getClass(), "functions", null);
        setField(term2988, term2988.getClass(), "regexps", null);
        setField(term2988, term2988.getClass(), "itsVariables", null);
        setField(term2988, term2988.getClass(), "itsConst", null);
        setField(term2988, term2988.getClass(), "itsVariableNames", null);
        setIntField(term2988, term2988.getClass(), "varStart", 0);
        setField(term2988, term2988.getClass(), "compilerData", null);
        setIntField(term2988, term2988.getClass(), "type", 0);
        setField(term2988, term2988.getClass(), "next", null);
        setField(term2988, term2988.getClass(), "first", null);
        setField(term2988, term2988.getClass(), "last", null);
        setField(term2988, term2988.getClass(), "propListHead", null);
        setIntField(term2988, term2988.getClass(), "sourcePosition", 0);
        setField(term2988, term2988.getClass(), "jsType", null);
        setField(term2988, term2988.getClass(), "parent", null);
        setField(term2987, term2987.getClass(), "first", term2988);
        setField(term2987, term2987.getClass(), "last", null);
        setField(term2987, term2987.getClass(), "propListHead", null);
        setIntField(term2987, term2987.getClass(), "sourcePosition", 0);
        setField(term2987, term2987.getClass(), "jsType", null);
        setField(term2987, term2987.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term2365;
        args[1] = term2537;
        args[2] = null;
        callMethod(klass, "findDeclaredNames", argTypes, term2279, args);
        assertTrue(recursiveEquals(term2279, term2985));
        assertTrue(recursiveEquals(term2365, term2986));
        assertTrue(recursiveEquals(term2537, term2987));
    }

};


