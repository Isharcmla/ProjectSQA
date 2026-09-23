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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578181;
     Object term578267;
     Object term578445;
     Object term578537;
     Object term578749;
     Object term578750;
     Object term578752;
     Object term578753;
     Object term578654;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578181 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term578267 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term578353 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term578353, term578353.getClass(), "type", 114);
        setField(term578267, term578267.getClass(), "parent", term578353);
        setIntField(term578267, term578267.getClass(), "type", 0);
        term578445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term578445, term578445.getClass(), "type", 117);
        term578537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term578537, term578537.getClass(), "type", 63);
        term578749 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term578749, term578749.getClass(), "currentTraversal", null);
        term578750 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term578751 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term578750, term578750.getClass(), "functionName", null);
        setBooleanField(term578750, term578750.getClass(), "itsNeedsActivation", false);
        setIntField(term578750, term578750.getClass(), "itsFunctionType", 0);
        setBooleanField(term578750, term578750.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term578750, term578750.getClass(), "encodedSourceStart", 0);
        setIntField(term578750, term578750.getClass(), "encodedSourceEnd", 0);
        setField(term578750, term578750.getClass(), "sourceName", null);
        setIntField(term578750, term578750.getClass(), "baseLineno", 0);
        setIntField(term578750, term578750.getClass(), "endLineno", 0);
        setField(term578750, term578750.getClass(), "functions", null);
        setField(term578750, term578750.getClass(), "regexps", null);
        setField(term578750, term578750.getClass(), "itsVariables", null);
        setField(term578750, term578750.getClass(), "itsConst", null);
        setField(term578750, term578750.getClass(), "itsVariableNames", null);
        setIntField(term578750, term578750.getClass(), "varStart", 0);
        setField(term578750, term578750.getClass(), "compilerData", null);
        setIntField(term578750, term578750.getClass(), "type", 0);
        setField(term578750, term578750.getClass(), "next", null);
        setField(term578750, term578750.getClass(), "first", null);
        setField(term578750, term578750.getClass(), "last", null);
        setField(term578750, term578750.getClass(), "propListHead", null);
        setIntField(term578750, term578750.getClass(), "sourcePosition", 0);
        setField(term578750, term578750.getClass(), "jsType", null);
        setField(term578751, term578751.getClass(), "functionName", null);
        setBooleanField(term578751, term578751.getClass(), "itsNeedsActivation", false);
        setIntField(term578751, term578751.getClass(), "itsFunctionType", 0);
        setBooleanField(term578751, term578751.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term578751, term578751.getClass(), "encodedSourceStart", 0);
        setIntField(term578751, term578751.getClass(), "encodedSourceEnd", 0);
        setField(term578751, term578751.getClass(), "sourceName", null);
        setIntField(term578751, term578751.getClass(), "baseLineno", 0);
        setIntField(term578751, term578751.getClass(), "endLineno", 0);
        setField(term578751, term578751.getClass(), "functions", null);
        setField(term578751, term578751.getClass(), "regexps", null);
        setField(term578751, term578751.getClass(), "itsVariables", null);
        setField(term578751, term578751.getClass(), "itsConst", null);
        setField(term578751, term578751.getClass(), "itsVariableNames", null);
        setIntField(term578751, term578751.getClass(), "varStart", 0);
        setField(term578751, term578751.getClass(), "compilerData", null);
        setIntField(term578751, term578751.getClass(), "type", 114);
        setField(term578751, term578751.getClass(), "next", null);
        setField(term578751, term578751.getClass(), "first", null);
        setField(term578751, term578751.getClass(), "last", null);
        setField(term578751, term578751.getClass(), "propListHead", null);
        setIntField(term578751, term578751.getClass(), "sourcePosition", 0);
        setField(term578751, term578751.getClass(), "jsType", null);
        setField(term578751, term578751.getClass(), "parent", null);
        setField(term578750, term578750.getClass(), "parent", term578751);
        term578752 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term578752, term578752.getClass(), "number", 0.0);
        setIntField(term578752, term578752.getClass(), "type", 117);
        setField(term578752, term578752.getClass(), "next", null);
        setField(term578752, term578752.getClass(), "first", null);
        setField(term578752, term578752.getClass(), "last", null);
        setField(term578752, term578752.getClass(), "propListHead", null);
        setIntField(term578752, term578752.getClass(), "sourcePosition", 0);
        setField(term578752, term578752.getClass(), "jsType", null);
        setField(term578752, term578752.getClass(), "parent", null);
        term578753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term578753, term578753.getClass(), "number", 0.0);
        setIntField(term578753, term578753.getClass(), "type", 63);
        setField(term578753, term578753.getClass(), "next", null);
        setField(term578753, term578753.getClass(), "first", null);
        setField(term578753, term578753.getClass(), "last", null);
        setField(term578753, term578753.getClass(), "propListHead", null);
        setIntField(term578753, term578753.getClass(), "sourcePosition", 0);
        setField(term578753, term578753.getClass(), "jsType", null);
        setField(term578753, term578753.getClass(), "parent", null);
        term578654 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term578665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term578654, term578654.getClass(), "functionName", null);
        setBooleanField(term578654, term578654.getClass(), "itsNeedsActivation", false);
        setIntField(term578654, term578654.getClass(), "itsFunctionType", 0);
        setBooleanField(term578654, term578654.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term578654, term578654.getClass(), "encodedSourceStart", 0);
        setIntField(term578654, term578654.getClass(), "encodedSourceEnd", 0);
        setField(term578654, term578654.getClass(), "sourceName", null);
        setIntField(term578654, term578654.getClass(), "baseLineno", 0);
        setIntField(term578654, term578654.getClass(), "endLineno", 0);
        setField(term578654, term578654.getClass(), "functions", null);
        setField(term578654, term578654.getClass(), "regexps", null);
        setField(term578654, term578654.getClass(), "itsVariables", null);
        setField(term578654, term578654.getClass(), "itsConst", null);
        setField(term578654, term578654.getClass(), "itsVariableNames", null);
        setIntField(term578654, term578654.getClass(), "varStart", 0);
        setField(term578654, term578654.getClass(), "compilerData", null);
        setIntField(term578654, term578654.getClass(), "type", 0);
        setField(term578654, term578654.getClass(), "next", null);
        setField(term578654, term578654.getClass(), "first", null);
        setField(term578654, term578654.getClass(), "last", null);
        setField(term578654, term578654.getClass(), "propListHead", null);
        setIntField(term578654, term578654.getClass(), "sourcePosition", 0);
        setField(term578654, term578654.getClass(), "jsType", null);
        setField(term578665, term578665.getClass(), "functionName", null);
        setBooleanField(term578665, term578665.getClass(), "itsNeedsActivation", false);
        setIntField(term578665, term578665.getClass(), "itsFunctionType", 0);
        setBooleanField(term578665, term578665.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term578665, term578665.getClass(), "encodedSourceStart", 0);
        setIntField(term578665, term578665.getClass(), "encodedSourceEnd", 0);
        setField(term578665, term578665.getClass(), "sourceName", null);
        setIntField(term578665, term578665.getClass(), "baseLineno", 0);
        setIntField(term578665, term578665.getClass(), "endLineno", 0);
        setField(term578665, term578665.getClass(), "functions", null);
        setField(term578665, term578665.getClass(), "regexps", null);
        setField(term578665, term578665.getClass(), "itsVariables", null);
        setField(term578665, term578665.getClass(), "itsConst", null);
        setField(term578665, term578665.getClass(), "itsVariableNames", null);
        setIntField(term578665, term578665.getClass(), "varStart", 0);
        setField(term578665, term578665.getClass(), "compilerData", null);
        setIntField(term578665, term578665.getClass(), "type", 114);
        setField(term578665, term578665.getClass(), "next", null);
        setField(term578665, term578665.getClass(), "first", null);
        setField(term578665, term578665.getClass(), "last", null);
        setField(term578665, term578665.getClass(), "propListHead", null);
        setIntField(term578665, term578665.getClass(), "sourcePosition", 0);
        setField(term578665, term578665.getClass(), "jsType", null);
        setField(term578665, term578665.getClass(), "parent", null);
        setField(term578654, term578654.getClass(), "parent", term578665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term578267;
        args[1] = term578445;
        args[2] = term578537;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term578181, args);
        assertTrue(recursiveEquals(term578181, term578749));
        assertTrue(recursiveEquals(term578267, term578750));
        assertTrue(recursiveEquals(term578445, term578752));
        assertTrue(recursiveEquals(term578537, term578753));
        assertTrue(recursiveEquals(retValue, term578654));
    }

};


