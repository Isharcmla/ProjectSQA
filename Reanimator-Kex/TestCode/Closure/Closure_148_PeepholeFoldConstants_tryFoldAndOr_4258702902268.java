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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623532;
     Object term623618;
     Object term623802;
     Object term623894;
     Object term623979;
     Object term623980;
     Object term623982;
     Object term623983;
     Object term623899;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623532 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term623618 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term623710 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term623710, term623710.getClass(), "type", 114);
        setField(term623618, term623618.getClass(), "parent", term623710);
        setIntField(term623618, term623618.getClass(), "type", 44);
        term623802 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term623802, term623802.getClass(), "type", 0);
        term623894 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term623894, term623894.getClass(), "type", 44);
        term623979 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term623979, term623979.getClass(), "currentTraversal", null);
        term623980 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term623981 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term623980, term623980.getClass(), "functionName", null);
        setBooleanField(term623980, term623980.getClass(), "itsNeedsActivation", false);
        setIntField(term623980, term623980.getClass(), "itsFunctionType", 0);
        setBooleanField(term623980, term623980.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term623980, term623980.getClass(), "encodedSourceStart", 0);
        setIntField(term623980, term623980.getClass(), "encodedSourceEnd", 0);
        setField(term623980, term623980.getClass(), "sourceName", null);
        setIntField(term623980, term623980.getClass(), "baseLineno", 0);
        setIntField(term623980, term623980.getClass(), "endLineno", 0);
        setField(term623980, term623980.getClass(), "functions", null);
        setField(term623980, term623980.getClass(), "regexps", null);
        setField(term623980, term623980.getClass(), "itsVariables", null);
        setField(term623980, term623980.getClass(), "itsConst", null);
        setField(term623980, term623980.getClass(), "itsVariableNames", null);
        setIntField(term623980, term623980.getClass(), "varStart", 0);
        setField(term623980, term623980.getClass(), "compilerData", null);
        setIntField(term623980, term623980.getClass(), "type", 44);
        setField(term623980, term623980.getClass(), "next", null);
        setField(term623980, term623980.getClass(), "first", null);
        setField(term623980, term623980.getClass(), "last", null);
        setField(term623980, term623980.getClass(), "propListHead", null);
        setIntField(term623980, term623980.getClass(), "sourcePosition", 0);
        setField(term623980, term623980.getClass(), "jsType", null);
        setDoubleField(term623981, term623981.getClass(), "number", 0.0);
        setIntField(term623981, term623981.getClass(), "type", 114);
        setField(term623981, term623981.getClass(), "next", null);
        setField(term623981, term623981.getClass(), "first", null);
        setField(term623981, term623981.getClass(), "last", null);
        setField(term623981, term623981.getClass(), "propListHead", null);
        setIntField(term623981, term623981.getClass(), "sourcePosition", 0);
        setField(term623981, term623981.getClass(), "jsType", null);
        setField(term623981, term623981.getClass(), "parent", null);
        setField(term623980, term623980.getClass(), "parent", term623981);
        term623982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term623982, term623982.getClass(), "number", 0.0);
        setIntField(term623982, term623982.getClass(), "type", 0);
        setField(term623982, term623982.getClass(), "next", null);
        setField(term623982, term623982.getClass(), "first", null);
        setField(term623982, term623982.getClass(), "last", null);
        setField(term623982, term623982.getClass(), "propListHead", null);
        setIntField(term623982, term623982.getClass(), "sourcePosition", 0);
        setField(term623982, term623982.getClass(), "jsType", null);
        setField(term623982, term623982.getClass(), "parent", null);
        term623983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term623983, term623983.getClass(), "str", null);
        setIntField(term623983, term623983.getClass(), "type", 44);
        setField(term623983, term623983.getClass(), "next", null);
        setField(term623983, term623983.getClass(), "first", null);
        setField(term623983, term623983.getClass(), "last", null);
        setField(term623983, term623983.getClass(), "propListHead", null);
        setIntField(term623983, term623983.getClass(), "sourcePosition", 0);
        setField(term623983, term623983.getClass(), "jsType", null);
        setField(term623983, term623983.getClass(), "parent", null);
        term623899 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term623910 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term623899, term623899.getClass(), "functionName", null);
        setBooleanField(term623899, term623899.getClass(), "itsNeedsActivation", false);
        setIntField(term623899, term623899.getClass(), "itsFunctionType", 0);
        setBooleanField(term623899, term623899.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term623899, term623899.getClass(), "encodedSourceStart", 0);
        setIntField(term623899, term623899.getClass(), "encodedSourceEnd", 0);
        setField(term623899, term623899.getClass(), "sourceName", null);
        setIntField(term623899, term623899.getClass(), "baseLineno", 0);
        setIntField(term623899, term623899.getClass(), "endLineno", 0);
        setField(term623899, term623899.getClass(), "functions", null);
        setField(term623899, term623899.getClass(), "regexps", null);
        setField(term623899, term623899.getClass(), "itsVariables", null);
        setField(term623899, term623899.getClass(), "itsConst", null);
        setField(term623899, term623899.getClass(), "itsVariableNames", null);
        setIntField(term623899, term623899.getClass(), "varStart", 0);
        setField(term623899, term623899.getClass(), "compilerData", null);
        setIntField(term623899, term623899.getClass(), "type", 44);
        setField(term623899, term623899.getClass(), "next", null);
        setField(term623899, term623899.getClass(), "first", null);
        setField(term623899, term623899.getClass(), "last", null);
        setField(term623899, term623899.getClass(), "propListHead", null);
        setIntField(term623899, term623899.getClass(), "sourcePosition", 0);
        setField(term623899, term623899.getClass(), "jsType", null);
        setDoubleField(term623910, term623910.getClass(), "number", 0.0);
        setIntField(term623910, term623910.getClass(), "type", 114);
        setField(term623910, term623910.getClass(), "next", null);
        setField(term623910, term623910.getClass(), "first", null);
        setField(term623910, term623910.getClass(), "last", null);
        setField(term623910, term623910.getClass(), "propListHead", null);
        setIntField(term623910, term623910.getClass(), "sourcePosition", 0);
        setField(term623910, term623910.getClass(), "jsType", null);
        setField(term623910, term623910.getClass(), "parent", null);
        setField(term623899, term623899.getClass(), "parent", term623910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term623618;
        args[1] = term623802;
        args[2] = term623894;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term623532, args);
        assertTrue(recursiveEquals(term623532, term623979));
        assertTrue(recursiveEquals(term623618, term623980));
        assertTrue(recursiveEquals(term623802, term623982));
        assertTrue(recursiveEquals(term623894, term623983));
        assertTrue(recursiveEquals(retValue, term623899));
    }

};


