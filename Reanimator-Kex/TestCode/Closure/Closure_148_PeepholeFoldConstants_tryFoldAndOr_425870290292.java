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

public class PeepholeFoldConstants_tryFoldAndOr_425870290292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56526;
     Object term56612;
     Object term56698;
     Object term56768;
     Object term56882;
     Object term56883;
     Object term56884;
     Object term56885;
     Object term56828;

    public PeepholeFoldConstants_tryFoldAndOr_425870290292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56526 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term56612 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56612, term56612.getClass(), "parent", null);
        setIntField(term56612, term56612.getClass(), "type", 0);
        term56698 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term56698, term56698.getClass(), "type", 0);
        term56768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term56882 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term56882, term56882.getClass(), "currentTraversal", null);
        term56883 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56883, term56883.getClass(), "functionName", null);
        setBooleanField(term56883, term56883.getClass(), "itsNeedsActivation", false);
        setIntField(term56883, term56883.getClass(), "itsFunctionType", 0);
        setBooleanField(term56883, term56883.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56883, term56883.getClass(), "encodedSourceStart", 0);
        setIntField(term56883, term56883.getClass(), "encodedSourceEnd", 0);
        setField(term56883, term56883.getClass(), "sourceName", null);
        setIntField(term56883, term56883.getClass(), "baseLineno", 0);
        setIntField(term56883, term56883.getClass(), "endLineno", 0);
        setField(term56883, term56883.getClass(), "functions", null);
        setField(term56883, term56883.getClass(), "regexps", null);
        setField(term56883, term56883.getClass(), "itsVariables", null);
        setField(term56883, term56883.getClass(), "itsConst", null);
        setField(term56883, term56883.getClass(), "itsVariableNames", null);
        setIntField(term56883, term56883.getClass(), "varStart", 0);
        setField(term56883, term56883.getClass(), "compilerData", null);
        setIntField(term56883, term56883.getClass(), "type", 0);
        setField(term56883, term56883.getClass(), "next", null);
        setField(term56883, term56883.getClass(), "first", null);
        setField(term56883, term56883.getClass(), "last", null);
        setField(term56883, term56883.getClass(), "propListHead", null);
        setIntField(term56883, term56883.getClass(), "sourcePosition", 0);
        setField(term56883, term56883.getClass(), "jsType", null);
        setField(term56883, term56883.getClass(), "parent", null);
        term56884 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56884, term56884.getClass(), "functionName", null);
        setBooleanField(term56884, term56884.getClass(), "itsNeedsActivation", false);
        setIntField(term56884, term56884.getClass(), "itsFunctionType", 0);
        setBooleanField(term56884, term56884.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56884, term56884.getClass(), "encodedSourceStart", 0);
        setIntField(term56884, term56884.getClass(), "encodedSourceEnd", 0);
        setField(term56884, term56884.getClass(), "sourceName", null);
        setIntField(term56884, term56884.getClass(), "baseLineno", 0);
        setIntField(term56884, term56884.getClass(), "endLineno", 0);
        setField(term56884, term56884.getClass(), "functions", null);
        setField(term56884, term56884.getClass(), "regexps", null);
        setField(term56884, term56884.getClass(), "itsVariables", null);
        setField(term56884, term56884.getClass(), "itsConst", null);
        setField(term56884, term56884.getClass(), "itsVariableNames", null);
        setIntField(term56884, term56884.getClass(), "varStart", 0);
        setField(term56884, term56884.getClass(), "compilerData", null);
        setIntField(term56884, term56884.getClass(), "type", 0);
        setField(term56884, term56884.getClass(), "next", null);
        setField(term56884, term56884.getClass(), "first", null);
        setField(term56884, term56884.getClass(), "last", null);
        setField(term56884, term56884.getClass(), "propListHead", null);
        setIntField(term56884, term56884.getClass(), "sourcePosition", 0);
        setField(term56884, term56884.getClass(), "jsType", null);
        setField(term56884, term56884.getClass(), "parent", null);
        term56885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56885, term56885.getClass(), "type", 0);
        setField(term56885, term56885.getClass(), "next", null);
        setField(term56885, term56885.getClass(), "first", null);
        setField(term56885, term56885.getClass(), "last", null);
        setField(term56885, term56885.getClass(), "propListHead", null);
        setIntField(term56885, term56885.getClass(), "sourcePosition", 0);
        setField(term56885, term56885.getClass(), "jsType", null);
        setField(term56885, term56885.getClass(), "parent", null);
        term56828 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56828, term56828.getClass(), "functionName", null);
        setBooleanField(term56828, term56828.getClass(), "itsNeedsActivation", false);
        setIntField(term56828, term56828.getClass(), "itsFunctionType", 0);
        setBooleanField(term56828, term56828.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56828, term56828.getClass(), "encodedSourceStart", 0);
        setIntField(term56828, term56828.getClass(), "encodedSourceEnd", 0);
        setField(term56828, term56828.getClass(), "sourceName", null);
        setIntField(term56828, term56828.getClass(), "baseLineno", 0);
        setIntField(term56828, term56828.getClass(), "endLineno", 0);
        setField(term56828, term56828.getClass(), "functions", null);
        setField(term56828, term56828.getClass(), "regexps", null);
        setField(term56828, term56828.getClass(), "itsVariables", null);
        setField(term56828, term56828.getClass(), "itsConst", null);
        setField(term56828, term56828.getClass(), "itsVariableNames", null);
        setIntField(term56828, term56828.getClass(), "varStart", 0);
        setField(term56828, term56828.getClass(), "compilerData", null);
        setIntField(term56828, term56828.getClass(), "type", 0);
        setField(term56828, term56828.getClass(), "next", null);
        setField(term56828, term56828.getClass(), "first", null);
        setField(term56828, term56828.getClass(), "last", null);
        setField(term56828, term56828.getClass(), "propListHead", null);
        setIntField(term56828, term56828.getClass(), "sourcePosition", 0);
        setField(term56828, term56828.getClass(), "jsType", null);
        setField(term56828, term56828.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term56612;
        args[1] = term56698;
        args[2] = term56768;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term56526, args);
        assertTrue(recursiveEquals(term56526, term56882));
        assertTrue(recursiveEquals(term56612, term56883));
        assertTrue(recursiveEquals(term56698, term56884));
        assertTrue(recursiveEquals(term56768, term56885));
        assertTrue(recursiveEquals(retValue, term56828));
    }

};


