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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702626;
     Object term702712;
     Object term702890;
     Object term702982;
     Object term703088;
     Object term703089;
     Object term703091;
     Object term703092;
     Object term702994;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term702626 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term702712 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term702798 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term702798, term702798.getClass(), "type", 113);
        setField(term702712, term702712.getClass(), "parent", term702798);
        setIntField(term702712, term702712.getClass(), "type", 0);
        term702890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term702890, term702890.getClass(), "type", 117);
        term702982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term702982, term702982.getClass(), "type", 63);
        term703088 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term703088, term703088.getClass(), "currentTraversal", null);
        term703089 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term703089, term703089.getClass(), "functionName", null);
        setBooleanField(term703089, term703089.getClass(), "itsNeedsActivation", false);
        setIntField(term703089, term703089.getClass(), "itsFunctionType", 0);
        setBooleanField(term703089, term703089.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term703089, term703089.getClass(), "encodedSourceStart", 0);
        setIntField(term703089, term703089.getClass(), "encodedSourceEnd", 0);
        setField(term703089, term703089.getClass(), "sourceName", null);
        setIntField(term703089, term703089.getClass(), "baseLineno", 0);
        setIntField(term703089, term703089.getClass(), "endLineno", 0);
        setField(term703089, term703089.getClass(), "functions", null);
        setField(term703089, term703089.getClass(), "regexps", null);
        setField(term703089, term703089.getClass(), "itsVariables", null);
        setField(term703089, term703089.getClass(), "itsConst", null);
        setField(term703089, term703089.getClass(), "itsVariableNames", null);
        setIntField(term703089, term703089.getClass(), "varStart", 0);
        setField(term703089, term703089.getClass(), "compilerData", null);
        setIntField(term703089, term703089.getClass(), "type", 0);
        setField(term703089, term703089.getClass(), "next", null);
        setField(term703089, term703089.getClass(), "first", null);
        setField(term703089, term703089.getClass(), "last", null);
        setField(term703089, term703089.getClass(), "propListHead", null);
        setIntField(term703089, term703089.getClass(), "sourcePosition", 0);
        setField(term703089, term703089.getClass(), "jsType", null);
        setField(term703090, term703090.getClass(), "functionName", null);
        setBooleanField(term703090, term703090.getClass(), "itsNeedsActivation", false);
        setIntField(term703090, term703090.getClass(), "itsFunctionType", 0);
        setBooleanField(term703090, term703090.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term703090, term703090.getClass(), "encodedSourceStart", 0);
        setIntField(term703090, term703090.getClass(), "encodedSourceEnd", 0);
        setField(term703090, term703090.getClass(), "sourceName", null);
        setIntField(term703090, term703090.getClass(), "baseLineno", 0);
        setIntField(term703090, term703090.getClass(), "endLineno", 0);
        setField(term703090, term703090.getClass(), "functions", null);
        setField(term703090, term703090.getClass(), "regexps", null);
        setField(term703090, term703090.getClass(), "itsVariables", null);
        setField(term703090, term703090.getClass(), "itsConst", null);
        setField(term703090, term703090.getClass(), "itsVariableNames", null);
        setIntField(term703090, term703090.getClass(), "varStart", 0);
        setField(term703090, term703090.getClass(), "compilerData", null);
        setIntField(term703090, term703090.getClass(), "type", 113);
        setField(term703090, term703090.getClass(), "next", null);
        setField(term703090, term703090.getClass(), "first", null);
        setField(term703090, term703090.getClass(), "last", null);
        setField(term703090, term703090.getClass(), "propListHead", null);
        setIntField(term703090, term703090.getClass(), "sourcePosition", 0);
        setField(term703090, term703090.getClass(), "jsType", null);
        setField(term703090, term703090.getClass(), "parent", null);
        setField(term703089, term703089.getClass(), "parent", term703090);
        term703091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term703091, term703091.getClass(), "number", 0.0);
        setIntField(term703091, term703091.getClass(), "type", 117);
        setField(term703091, term703091.getClass(), "next", null);
        setField(term703091, term703091.getClass(), "first", null);
        setField(term703091, term703091.getClass(), "last", null);
        setField(term703091, term703091.getClass(), "propListHead", null);
        setIntField(term703091, term703091.getClass(), "sourcePosition", 0);
        setField(term703091, term703091.getClass(), "jsType", null);
        setField(term703091, term703091.getClass(), "parent", null);
        term703092 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term703092, term703092.getClass(), "number", 0.0);
        setIntField(term703092, term703092.getClass(), "type", 63);
        setField(term703092, term703092.getClass(), "next", null);
        setField(term703092, term703092.getClass(), "first", null);
        setField(term703092, term703092.getClass(), "last", null);
        setField(term703092, term703092.getClass(), "propListHead", null);
        setIntField(term703092, term703092.getClass(), "sourcePosition", 0);
        setField(term703092, term703092.getClass(), "jsType", null);
        setField(term703092, term703092.getClass(), "parent", null);
        term702994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703005 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term702994, term702994.getClass(), "functionName", null);
        setBooleanField(term702994, term702994.getClass(), "itsNeedsActivation", false);
        setIntField(term702994, term702994.getClass(), "itsFunctionType", 0);
        setBooleanField(term702994, term702994.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term702994, term702994.getClass(), "encodedSourceStart", 0);
        setIntField(term702994, term702994.getClass(), "encodedSourceEnd", 0);
        setField(term702994, term702994.getClass(), "sourceName", null);
        setIntField(term702994, term702994.getClass(), "baseLineno", 0);
        setIntField(term702994, term702994.getClass(), "endLineno", 0);
        setField(term702994, term702994.getClass(), "functions", null);
        setField(term702994, term702994.getClass(), "regexps", null);
        setField(term702994, term702994.getClass(), "itsVariables", null);
        setField(term702994, term702994.getClass(), "itsConst", null);
        setField(term702994, term702994.getClass(), "itsVariableNames", null);
        setIntField(term702994, term702994.getClass(), "varStart", 0);
        setField(term702994, term702994.getClass(), "compilerData", null);
        setIntField(term702994, term702994.getClass(), "type", 0);
        setField(term702994, term702994.getClass(), "next", null);
        setField(term702994, term702994.getClass(), "first", null);
        setField(term702994, term702994.getClass(), "last", null);
        setField(term702994, term702994.getClass(), "propListHead", null);
        setIntField(term702994, term702994.getClass(), "sourcePosition", 0);
        setField(term702994, term702994.getClass(), "jsType", null);
        setField(term703005, term703005.getClass(), "functionName", null);
        setBooleanField(term703005, term703005.getClass(), "itsNeedsActivation", false);
        setIntField(term703005, term703005.getClass(), "itsFunctionType", 0);
        setBooleanField(term703005, term703005.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term703005, term703005.getClass(), "encodedSourceStart", 0);
        setIntField(term703005, term703005.getClass(), "encodedSourceEnd", 0);
        setField(term703005, term703005.getClass(), "sourceName", null);
        setIntField(term703005, term703005.getClass(), "baseLineno", 0);
        setIntField(term703005, term703005.getClass(), "endLineno", 0);
        setField(term703005, term703005.getClass(), "functions", null);
        setField(term703005, term703005.getClass(), "regexps", null);
        setField(term703005, term703005.getClass(), "itsVariables", null);
        setField(term703005, term703005.getClass(), "itsConst", null);
        setField(term703005, term703005.getClass(), "itsVariableNames", null);
        setIntField(term703005, term703005.getClass(), "varStart", 0);
        setField(term703005, term703005.getClass(), "compilerData", null);
        setIntField(term703005, term703005.getClass(), "type", 113);
        setField(term703005, term703005.getClass(), "next", null);
        setField(term703005, term703005.getClass(), "first", null);
        setField(term703005, term703005.getClass(), "last", null);
        setField(term703005, term703005.getClass(), "propListHead", null);
        setIntField(term703005, term703005.getClass(), "sourcePosition", 0);
        setField(term703005, term703005.getClass(), "jsType", null);
        setField(term703005, term703005.getClass(), "parent", null);
        setField(term702994, term702994.getClass(), "parent", term703005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term702712;
        args[1] = term702890;
        args[2] = term702982;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term702626, args);
        assertTrue(recursiveEquals(term702626, term703088));
        assertTrue(recursiveEquals(term702712, term703089));
        assertTrue(recursiveEquals(term702890, term703091));
        assertTrue(recursiveEquals(term702982, term703092));
        assertTrue(recursiveEquals(retValue, term702994));
    }

};


