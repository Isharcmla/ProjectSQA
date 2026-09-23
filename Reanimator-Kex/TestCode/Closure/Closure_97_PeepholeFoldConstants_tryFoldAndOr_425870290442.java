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

public class PeepholeFoldConstants_tryFoldAndOr_425870290442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102024;
     Object term102110;
     Object term102196;
     Object term102286;
     Object term102393;
     Object term102394;
     Object term102395;
     Object term102396;
     Object term102334;

    public PeepholeFoldConstants_tryFoldAndOr_425870290442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102024 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term102110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term102110, term102110.getClass(), "parent", null);
        setIntField(term102110, term102110.getClass(), "type", 0);
        term102196 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term102196, term102196.getClass(), "type", 0);
        term102286 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term102393 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term102393, term102393.getClass(), "currentTraversal", null);
        term102394 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term102394, term102394.getClass(), "functionName", null);
        setBooleanField(term102394, term102394.getClass(), "itsNeedsActivation", false);
        setIntField(term102394, term102394.getClass(), "itsFunctionType", 0);
        setBooleanField(term102394, term102394.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term102394, term102394.getClass(), "encodedSourceStart", 0);
        setIntField(term102394, term102394.getClass(), "encodedSourceEnd", 0);
        setField(term102394, term102394.getClass(), "sourceName", null);
        setIntField(term102394, term102394.getClass(), "baseLineno", 0);
        setIntField(term102394, term102394.getClass(), "endLineno", 0);
        setField(term102394, term102394.getClass(), "functions", null);
        setField(term102394, term102394.getClass(), "regexps", null);
        setField(term102394, term102394.getClass(), "itsVariables", null);
        setField(term102394, term102394.getClass(), "itsConst", null);
        setField(term102394, term102394.getClass(), "itsVariableNames", null);
        setIntField(term102394, term102394.getClass(), "varStart", 0);
        setField(term102394, term102394.getClass(), "compilerData", null);
        setIntField(term102394, term102394.getClass(), "type", 0);
        setField(term102394, term102394.getClass(), "next", null);
        setField(term102394, term102394.getClass(), "first", null);
        setField(term102394, term102394.getClass(), "last", null);
        setField(term102394, term102394.getClass(), "propListHead", null);
        setIntField(term102394, term102394.getClass(), "sourcePosition", 0);
        setField(term102394, term102394.getClass(), "jsType", null);
        setField(term102394, term102394.getClass(), "parent", null);
        term102395 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term102395, term102395.getClass(), "functionName", null);
        setBooleanField(term102395, term102395.getClass(), "itsNeedsActivation", false);
        setIntField(term102395, term102395.getClass(), "itsFunctionType", 0);
        setBooleanField(term102395, term102395.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term102395, term102395.getClass(), "encodedSourceStart", 0);
        setIntField(term102395, term102395.getClass(), "encodedSourceEnd", 0);
        setField(term102395, term102395.getClass(), "sourceName", null);
        setIntField(term102395, term102395.getClass(), "baseLineno", 0);
        setIntField(term102395, term102395.getClass(), "endLineno", 0);
        setField(term102395, term102395.getClass(), "functions", null);
        setField(term102395, term102395.getClass(), "regexps", null);
        setField(term102395, term102395.getClass(), "itsVariables", null);
        setField(term102395, term102395.getClass(), "itsConst", null);
        setField(term102395, term102395.getClass(), "itsVariableNames", null);
        setIntField(term102395, term102395.getClass(), "varStart", 0);
        setField(term102395, term102395.getClass(), "compilerData", null);
        setIntField(term102395, term102395.getClass(), "type", 0);
        setField(term102395, term102395.getClass(), "next", null);
        setField(term102395, term102395.getClass(), "first", null);
        setField(term102395, term102395.getClass(), "last", null);
        setField(term102395, term102395.getClass(), "propListHead", null);
        setIntField(term102395, term102395.getClass(), "sourcePosition", 0);
        setField(term102395, term102395.getClass(), "jsType", null);
        setField(term102395, term102395.getClass(), "parent", null);
        term102396 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term102396, term102396.getClass(), "encodedSourceStart", 0);
        setIntField(term102396, term102396.getClass(), "encodedSourceEnd", 0);
        setField(term102396, term102396.getClass(), "sourceName", null);
        setIntField(term102396, term102396.getClass(), "baseLineno", 0);
        setIntField(term102396, term102396.getClass(), "endLineno", 0);
        setField(term102396, term102396.getClass(), "functions", null);
        setField(term102396, term102396.getClass(), "regexps", null);
        setField(term102396, term102396.getClass(), "itsVariables", null);
        setField(term102396, term102396.getClass(), "itsConst", null);
        setField(term102396, term102396.getClass(), "itsVariableNames", null);
        setIntField(term102396, term102396.getClass(), "varStart", 0);
        setField(term102396, term102396.getClass(), "compilerData", null);
        setIntField(term102396, term102396.getClass(), "type", 0);
        setField(term102396, term102396.getClass(), "next", null);
        setField(term102396, term102396.getClass(), "first", null);
        setField(term102396, term102396.getClass(), "last", null);
        setField(term102396, term102396.getClass(), "propListHead", null);
        setIntField(term102396, term102396.getClass(), "sourcePosition", 0);
        setField(term102396, term102396.getClass(), "jsType", null);
        setField(term102396, term102396.getClass(), "parent", null);
        term102334 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term102334, term102334.getClass(), "functionName", null);
        setBooleanField(term102334, term102334.getClass(), "itsNeedsActivation", false);
        setIntField(term102334, term102334.getClass(), "itsFunctionType", 0);
        setBooleanField(term102334, term102334.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term102334, term102334.getClass(), "encodedSourceStart", 0);
        setIntField(term102334, term102334.getClass(), "encodedSourceEnd", 0);
        setField(term102334, term102334.getClass(), "sourceName", null);
        setIntField(term102334, term102334.getClass(), "baseLineno", 0);
        setIntField(term102334, term102334.getClass(), "endLineno", 0);
        setField(term102334, term102334.getClass(), "functions", null);
        setField(term102334, term102334.getClass(), "regexps", null);
        setField(term102334, term102334.getClass(), "itsVariables", null);
        setField(term102334, term102334.getClass(), "itsConst", null);
        setField(term102334, term102334.getClass(), "itsVariableNames", null);
        setIntField(term102334, term102334.getClass(), "varStart", 0);
        setField(term102334, term102334.getClass(), "compilerData", null);
        setIntField(term102334, term102334.getClass(), "type", 0);
        setField(term102334, term102334.getClass(), "next", null);
        setField(term102334, term102334.getClass(), "first", null);
        setField(term102334, term102334.getClass(), "last", null);
        setField(term102334, term102334.getClass(), "propListHead", null);
        setIntField(term102334, term102334.getClass(), "sourcePosition", 0);
        setField(term102334, term102334.getClass(), "jsType", null);
        setField(term102334, term102334.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term102110;
        args[1] = term102196;
        args[2] = term102286;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term102024, args);
        assertTrue(recursiveEquals(term102024, term102393));
        assertTrue(recursiveEquals(term102110, term102394));
        assertTrue(recursiveEquals(term102196, term102395));
        assertTrue(recursiveEquals(term102286, term102396));
        assertTrue(recursiveEquals(retValue, term102334));
    }

};


