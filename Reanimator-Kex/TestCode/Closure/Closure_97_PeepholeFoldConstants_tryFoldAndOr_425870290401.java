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

public class PeepholeFoldConstants_tryFoldAndOr_425870290401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92814;
     Object term92900;
     Object term92992;
     Object term93078;
     Object term93504;
     Object term93505;
     Object term93506;
     Object term93507;
     Object term93450;

    public PeepholeFoldConstants_tryFoldAndOr_425870290401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92814 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term92900 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term92900, term92900.getClass(), "parent", null);
        setIntField(term92900, term92900.getClass(), "type", 0);
        term92992 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term92992, term92992.getClass(), "type", 0);
        term93078 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term93504 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term93504, term93504.getClass(), "currentTraversal", null);
        term93505 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term93505, term93505.getClass(), "functionName", null);
        setBooleanField(term93505, term93505.getClass(), "itsNeedsActivation", false);
        setIntField(term93505, term93505.getClass(), "itsFunctionType", 0);
        setBooleanField(term93505, term93505.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93505, term93505.getClass(), "encodedSourceStart", 0);
        setIntField(term93505, term93505.getClass(), "encodedSourceEnd", 0);
        setField(term93505, term93505.getClass(), "sourceName", null);
        setIntField(term93505, term93505.getClass(), "baseLineno", 0);
        setIntField(term93505, term93505.getClass(), "endLineno", 0);
        setField(term93505, term93505.getClass(), "functions", null);
        setField(term93505, term93505.getClass(), "regexps", null);
        setField(term93505, term93505.getClass(), "itsVariables", null);
        setField(term93505, term93505.getClass(), "itsConst", null);
        setField(term93505, term93505.getClass(), "itsVariableNames", null);
        setIntField(term93505, term93505.getClass(), "varStart", 0);
        setField(term93505, term93505.getClass(), "compilerData", null);
        setIntField(term93505, term93505.getClass(), "type", 0);
        setField(term93505, term93505.getClass(), "next", null);
        setField(term93505, term93505.getClass(), "first", null);
        setField(term93505, term93505.getClass(), "last", null);
        setField(term93505, term93505.getClass(), "propListHead", null);
        setIntField(term93505, term93505.getClass(), "sourcePosition", 0);
        setField(term93505, term93505.getClass(), "jsType", null);
        setField(term93505, term93505.getClass(), "parent", null);
        term93506 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term93506, term93506.getClass(), "str", null);
        setIntField(term93506, term93506.getClass(), "type", 0);
        setField(term93506, term93506.getClass(), "next", null);
        setField(term93506, term93506.getClass(), "first", null);
        setField(term93506, term93506.getClass(), "last", null);
        setField(term93506, term93506.getClass(), "propListHead", null);
        setIntField(term93506, term93506.getClass(), "sourcePosition", 0);
        setField(term93506, term93506.getClass(), "jsType", null);
        setField(term93506, term93506.getClass(), "parent", null);
        term93507 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term93507, term93507.getClass(), "functionName", null);
        setBooleanField(term93507, term93507.getClass(), "itsNeedsActivation", false);
        setIntField(term93507, term93507.getClass(), "itsFunctionType", 0);
        setBooleanField(term93507, term93507.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93507, term93507.getClass(), "encodedSourceStart", 0);
        setIntField(term93507, term93507.getClass(), "encodedSourceEnd", 0);
        setField(term93507, term93507.getClass(), "sourceName", null);
        setIntField(term93507, term93507.getClass(), "baseLineno", 0);
        setIntField(term93507, term93507.getClass(), "endLineno", 0);
        setField(term93507, term93507.getClass(), "functions", null);
        setField(term93507, term93507.getClass(), "regexps", null);
        setField(term93507, term93507.getClass(), "itsVariables", null);
        setField(term93507, term93507.getClass(), "itsConst", null);
        setField(term93507, term93507.getClass(), "itsVariableNames", null);
        setIntField(term93507, term93507.getClass(), "varStart", 0);
        setField(term93507, term93507.getClass(), "compilerData", null);
        setIntField(term93507, term93507.getClass(), "type", 0);
        setField(term93507, term93507.getClass(), "next", null);
        setField(term93507, term93507.getClass(), "first", null);
        setField(term93507, term93507.getClass(), "last", null);
        setField(term93507, term93507.getClass(), "propListHead", null);
        setIntField(term93507, term93507.getClass(), "sourcePosition", 0);
        setField(term93507, term93507.getClass(), "jsType", null);
        setField(term93507, term93507.getClass(), "parent", null);
        term93450 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term93450, term93450.getClass(), "functionName", null);
        setBooleanField(term93450, term93450.getClass(), "itsNeedsActivation", false);
        setIntField(term93450, term93450.getClass(), "itsFunctionType", 0);
        setBooleanField(term93450, term93450.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93450, term93450.getClass(), "encodedSourceStart", 0);
        setIntField(term93450, term93450.getClass(), "encodedSourceEnd", 0);
        setField(term93450, term93450.getClass(), "sourceName", null);
        setIntField(term93450, term93450.getClass(), "baseLineno", 0);
        setIntField(term93450, term93450.getClass(), "endLineno", 0);
        setField(term93450, term93450.getClass(), "functions", null);
        setField(term93450, term93450.getClass(), "regexps", null);
        setField(term93450, term93450.getClass(), "itsVariables", null);
        setField(term93450, term93450.getClass(), "itsConst", null);
        setField(term93450, term93450.getClass(), "itsVariableNames", null);
        setIntField(term93450, term93450.getClass(), "varStart", 0);
        setField(term93450, term93450.getClass(), "compilerData", null);
        setIntField(term93450, term93450.getClass(), "type", 0);
        setField(term93450, term93450.getClass(), "next", null);
        setField(term93450, term93450.getClass(), "first", null);
        setField(term93450, term93450.getClass(), "last", null);
        setField(term93450, term93450.getClass(), "propListHead", null);
        setIntField(term93450, term93450.getClass(), "sourcePosition", 0);
        setField(term93450, term93450.getClass(), "jsType", null);
        setField(term93450, term93450.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term92900;
        args[1] = term92992;
        args[2] = term93078;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term92814, args);
        assertTrue(recursiveEquals(term92814, term93504));
        assertTrue(recursiveEquals(term92900, term93505));
        assertTrue(recursiveEquals(term92992, term93506));
        assertTrue(recursiveEquals(term93078, term93507));
        assertTrue(recursiveEquals(retValue, term93450));
    }

};


