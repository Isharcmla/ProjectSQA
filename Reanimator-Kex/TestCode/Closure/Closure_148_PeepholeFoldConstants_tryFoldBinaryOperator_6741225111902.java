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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503434;
     Object term503526;
     Object term503752;
     Object term503753;
     Object term503703;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503434 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term503526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term503612 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term503682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term503612, term503612.getClass(), "next", term503682);
        setField(term503526, term503526.getClass(), "first", term503612);
        setIntField(term503526, term503526.getClass(), "type", 33);
        term503752 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term503752, term503752.getClass(), "currentTraversal", null);
        term503753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term503754 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term503755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term503753, term503753.getClass(), "number", 0.0);
        setIntField(term503753, term503753.getClass(), "type", 33);
        setField(term503753, term503753.getClass(), "next", null);
        setField(term503754, term503754.getClass(), "functionName", null);
        setBooleanField(term503754, term503754.getClass(), "itsNeedsActivation", false);
        setIntField(term503754, term503754.getClass(), "itsFunctionType", 0);
        setBooleanField(term503754, term503754.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term503754, term503754.getClass(), "encodedSourceStart", 0);
        setIntField(term503754, term503754.getClass(), "encodedSourceEnd", 0);
        setField(term503754, term503754.getClass(), "sourceName", null);
        setIntField(term503754, term503754.getClass(), "baseLineno", 0);
        setIntField(term503754, term503754.getClass(), "endLineno", 0);
        setField(term503754, term503754.getClass(), "functions", null);
        setField(term503754, term503754.getClass(), "regexps", null);
        setField(term503754, term503754.getClass(), "itsVariables", null);
        setField(term503754, term503754.getClass(), "itsConst", null);
        setField(term503754, term503754.getClass(), "itsVariableNames", null);
        setIntField(term503754, term503754.getClass(), "varStart", 0);
        setField(term503754, term503754.getClass(), "compilerData", null);
        setIntField(term503754, term503754.getClass(), "type", 0);
        setIntField(term503755, term503755.getClass(), "type", 0);
        setField(term503755, term503755.getClass(), "next", null);
        setField(term503755, term503755.getClass(), "first", null);
        setField(term503755, term503755.getClass(), "last", null);
        setField(term503755, term503755.getClass(), "propListHead", null);
        setIntField(term503755, term503755.getClass(), "sourcePosition", 0);
        setField(term503755, term503755.getClass(), "jsType", null);
        setField(term503755, term503755.getClass(), "parent", null);
        setField(term503754, term503754.getClass(), "next", term503755);
        setField(term503754, term503754.getClass(), "first", null);
        setField(term503754, term503754.getClass(), "last", null);
        setField(term503754, term503754.getClass(), "propListHead", null);
        setIntField(term503754, term503754.getClass(), "sourcePosition", 0);
        setField(term503754, term503754.getClass(), "jsType", null);
        setField(term503754, term503754.getClass(), "parent", null);
        setField(term503753, term503753.getClass(), "first", term503754);
        setField(term503753, term503753.getClass(), "last", null);
        setField(term503753, term503753.getClass(), "propListHead", null);
        setIntField(term503753, term503753.getClass(), "sourcePosition", 0);
        setField(term503753, term503753.getClass(), "jsType", null);
        setField(term503753, term503753.getClass(), "parent", null);
        term503703 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term503706 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term503716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term503703, term503703.getClass(), "number", 0.0);
        setIntField(term503703, term503703.getClass(), "type", 33);
        setField(term503703, term503703.getClass(), "next", null);
        setField(term503706, term503706.getClass(), "functionName", null);
        setBooleanField(term503706, term503706.getClass(), "itsNeedsActivation", false);
        setIntField(term503706, term503706.getClass(), "itsFunctionType", 0);
        setBooleanField(term503706, term503706.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term503706, term503706.getClass(), "encodedSourceStart", 0);
        setIntField(term503706, term503706.getClass(), "encodedSourceEnd", 0);
        setField(term503706, term503706.getClass(), "sourceName", null);
        setIntField(term503706, term503706.getClass(), "baseLineno", 0);
        setIntField(term503706, term503706.getClass(), "endLineno", 0);
        setField(term503706, term503706.getClass(), "functions", null);
        setField(term503706, term503706.getClass(), "regexps", null);
        setField(term503706, term503706.getClass(), "itsVariables", null);
        setField(term503706, term503706.getClass(), "itsConst", null);
        setField(term503706, term503706.getClass(), "itsVariableNames", null);
        setIntField(term503706, term503706.getClass(), "varStart", 0);
        setField(term503706, term503706.getClass(), "compilerData", null);
        setIntField(term503706, term503706.getClass(), "type", 0);
        setIntField(term503716, term503716.getClass(), "type", 0);
        setField(term503716, term503716.getClass(), "next", null);
        setField(term503716, term503716.getClass(), "first", null);
        setField(term503716, term503716.getClass(), "last", null);
        setField(term503716, term503716.getClass(), "propListHead", null);
        setIntField(term503716, term503716.getClass(), "sourcePosition", 0);
        setField(term503716, term503716.getClass(), "jsType", null);
        setField(term503716, term503716.getClass(), "parent", null);
        setField(term503706, term503706.getClass(), "next", term503716);
        setField(term503706, term503706.getClass(), "first", null);
        setField(term503706, term503706.getClass(), "last", null);
        setField(term503706, term503706.getClass(), "propListHead", null);
        setIntField(term503706, term503706.getClass(), "sourcePosition", 0);
        setField(term503706, term503706.getClass(), "jsType", null);
        setField(term503706, term503706.getClass(), "parent", null);
        setField(term503703, term503703.getClass(), "first", term503706);
        setField(term503703, term503703.getClass(), "last", null);
        setField(term503703, term503703.getClass(), "propListHead", null);
        setIntField(term503703, term503703.getClass(), "sourcePosition", 0);
        setField(term503703, term503703.getClass(), "jsType", null);
        setField(term503703, term503703.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term503526;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term503434, args);
        assertTrue(recursiveEquals(term503434, term503752));
        assertTrue(recursiveEquals(term503526, term503753));
        assertTrue(recursiveEquals(retValue, term503703));
    }

};


