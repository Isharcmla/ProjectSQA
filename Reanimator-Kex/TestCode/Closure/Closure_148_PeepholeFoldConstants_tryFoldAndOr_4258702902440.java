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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681372;
     Object term681458;
     Object term681636;
     Object term681728;
     Object term681998;
     Object term681999;
     Object term682001;
     Object term682002;
     Object term681903;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681372 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term681458 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term681544 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term681544, term681544.getClass(), "type", 114);
        setField(term681458, term681458.getClass(), "parent", term681544);
        setIntField(term681458, term681458.getClass(), "type", 0);
        term681636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term681636, term681636.getClass(), "type", 65);
        term681728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term681728, term681728.getClass(), "type", 63);
        term681998 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term681998, term681998.getClass(), "currentTraversal", null);
        term681999 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682000 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term681999, term681999.getClass(), "functionName", null);
        setBooleanField(term681999, term681999.getClass(), "itsNeedsActivation", false);
        setIntField(term681999, term681999.getClass(), "itsFunctionType", 0);
        setBooleanField(term681999, term681999.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term681999, term681999.getClass(), "encodedSourceStart", 0);
        setIntField(term681999, term681999.getClass(), "encodedSourceEnd", 0);
        setField(term681999, term681999.getClass(), "sourceName", null);
        setIntField(term681999, term681999.getClass(), "baseLineno", 0);
        setIntField(term681999, term681999.getClass(), "endLineno", 0);
        setField(term681999, term681999.getClass(), "functions", null);
        setField(term681999, term681999.getClass(), "regexps", null);
        setField(term681999, term681999.getClass(), "itsVariables", null);
        setField(term681999, term681999.getClass(), "itsConst", null);
        setField(term681999, term681999.getClass(), "itsVariableNames", null);
        setIntField(term681999, term681999.getClass(), "varStart", 0);
        setField(term681999, term681999.getClass(), "compilerData", null);
        setIntField(term681999, term681999.getClass(), "type", 0);
        setField(term681999, term681999.getClass(), "next", null);
        setField(term681999, term681999.getClass(), "first", null);
        setField(term681999, term681999.getClass(), "last", null);
        setField(term681999, term681999.getClass(), "propListHead", null);
        setIntField(term681999, term681999.getClass(), "sourcePosition", 0);
        setField(term681999, term681999.getClass(), "jsType", null);
        setField(term682000, term682000.getClass(), "functionName", null);
        setBooleanField(term682000, term682000.getClass(), "itsNeedsActivation", false);
        setIntField(term682000, term682000.getClass(), "itsFunctionType", 0);
        setBooleanField(term682000, term682000.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term682000, term682000.getClass(), "encodedSourceStart", 0);
        setIntField(term682000, term682000.getClass(), "encodedSourceEnd", 0);
        setField(term682000, term682000.getClass(), "sourceName", null);
        setIntField(term682000, term682000.getClass(), "baseLineno", 0);
        setIntField(term682000, term682000.getClass(), "endLineno", 0);
        setField(term682000, term682000.getClass(), "functions", null);
        setField(term682000, term682000.getClass(), "regexps", null);
        setField(term682000, term682000.getClass(), "itsVariables", null);
        setField(term682000, term682000.getClass(), "itsConst", null);
        setField(term682000, term682000.getClass(), "itsVariableNames", null);
        setIntField(term682000, term682000.getClass(), "varStart", 0);
        setField(term682000, term682000.getClass(), "compilerData", null);
        setIntField(term682000, term682000.getClass(), "type", 114);
        setField(term682000, term682000.getClass(), "next", null);
        setField(term682000, term682000.getClass(), "first", null);
        setField(term682000, term682000.getClass(), "last", null);
        setField(term682000, term682000.getClass(), "propListHead", null);
        setIntField(term682000, term682000.getClass(), "sourcePosition", 0);
        setField(term682000, term682000.getClass(), "jsType", null);
        setField(term682000, term682000.getClass(), "parent", null);
        setField(term681999, term681999.getClass(), "parent", term682000);
        term682001 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term682001, term682001.getClass(), "number", 0.0);
        setIntField(term682001, term682001.getClass(), "type", 65);
        setField(term682001, term682001.getClass(), "next", null);
        setField(term682001, term682001.getClass(), "first", null);
        setField(term682001, term682001.getClass(), "last", null);
        setField(term682001, term682001.getClass(), "propListHead", null);
        setIntField(term682001, term682001.getClass(), "sourcePosition", 0);
        setField(term682001, term682001.getClass(), "jsType", null);
        setField(term682001, term682001.getClass(), "parent", null);
        term682002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term682002, term682002.getClass(), "number", 0.0);
        setIntField(term682002, term682002.getClass(), "type", 63);
        setField(term682002, term682002.getClass(), "next", null);
        setField(term682002, term682002.getClass(), "first", null);
        setField(term682002, term682002.getClass(), "last", null);
        setField(term682002, term682002.getClass(), "propListHead", null);
        setIntField(term682002, term682002.getClass(), "sourcePosition", 0);
        setField(term682002, term682002.getClass(), "jsType", null);
        setField(term682002, term682002.getClass(), "parent", null);
        term681903 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term681914 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term681903, term681903.getClass(), "functionName", null);
        setBooleanField(term681903, term681903.getClass(), "itsNeedsActivation", false);
        setIntField(term681903, term681903.getClass(), "itsFunctionType", 0);
        setBooleanField(term681903, term681903.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term681903, term681903.getClass(), "encodedSourceStart", 0);
        setIntField(term681903, term681903.getClass(), "encodedSourceEnd", 0);
        setField(term681903, term681903.getClass(), "sourceName", null);
        setIntField(term681903, term681903.getClass(), "baseLineno", 0);
        setIntField(term681903, term681903.getClass(), "endLineno", 0);
        setField(term681903, term681903.getClass(), "functions", null);
        setField(term681903, term681903.getClass(), "regexps", null);
        setField(term681903, term681903.getClass(), "itsVariables", null);
        setField(term681903, term681903.getClass(), "itsConst", null);
        setField(term681903, term681903.getClass(), "itsVariableNames", null);
        setIntField(term681903, term681903.getClass(), "varStart", 0);
        setField(term681903, term681903.getClass(), "compilerData", null);
        setIntField(term681903, term681903.getClass(), "type", 0);
        setField(term681903, term681903.getClass(), "next", null);
        setField(term681903, term681903.getClass(), "first", null);
        setField(term681903, term681903.getClass(), "last", null);
        setField(term681903, term681903.getClass(), "propListHead", null);
        setIntField(term681903, term681903.getClass(), "sourcePosition", 0);
        setField(term681903, term681903.getClass(), "jsType", null);
        setField(term681914, term681914.getClass(), "functionName", null);
        setBooleanField(term681914, term681914.getClass(), "itsNeedsActivation", false);
        setIntField(term681914, term681914.getClass(), "itsFunctionType", 0);
        setBooleanField(term681914, term681914.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term681914, term681914.getClass(), "encodedSourceStart", 0);
        setIntField(term681914, term681914.getClass(), "encodedSourceEnd", 0);
        setField(term681914, term681914.getClass(), "sourceName", null);
        setIntField(term681914, term681914.getClass(), "baseLineno", 0);
        setIntField(term681914, term681914.getClass(), "endLineno", 0);
        setField(term681914, term681914.getClass(), "functions", null);
        setField(term681914, term681914.getClass(), "regexps", null);
        setField(term681914, term681914.getClass(), "itsVariables", null);
        setField(term681914, term681914.getClass(), "itsConst", null);
        setField(term681914, term681914.getClass(), "itsVariableNames", null);
        setIntField(term681914, term681914.getClass(), "varStart", 0);
        setField(term681914, term681914.getClass(), "compilerData", null);
        setIntField(term681914, term681914.getClass(), "type", 114);
        setField(term681914, term681914.getClass(), "next", null);
        setField(term681914, term681914.getClass(), "first", null);
        setField(term681914, term681914.getClass(), "last", null);
        setField(term681914, term681914.getClass(), "propListHead", null);
        setIntField(term681914, term681914.getClass(), "sourcePosition", 0);
        setField(term681914, term681914.getClass(), "jsType", null);
        setField(term681914, term681914.getClass(), "parent", null);
        setField(term681903, term681903.getClass(), "parent", term681914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term681458;
        args[1] = term681636;
        args[2] = term681728;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term681372, args);
        assertTrue(recursiveEquals(term681372, term681998));
        assertTrue(recursiveEquals(term681458, term681999));
        assertTrue(recursiveEquals(term681636, term682001));
        assertTrue(recursiveEquals(term681728, term682002));
        assertTrue(recursiveEquals(retValue, term681903));
    }

};


