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

public class PeepholeFoldConstants_tryFoldAndOr_425870290758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210045;
     Object term210131;
     Object term210309;
     Object term210379;
     Object term217902;
     Object term217903;
     Object term217905;
     Object term217906;
     Object term217845;

    public PeepholeFoldConstants_tryFoldAndOr_425870290758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210045 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term210131 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term210217 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term210131, term210131.getClass(), "parent", term210217);
        setIntField(term210131, term210131.getClass(), "type", 0);
        term210309 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term210309, term210309.getClass(), "type", 0);
        term210379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term217902 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term217902, term217902.getClass(), "currentTraversal", null);
        term217903 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term217904 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term217903, term217903.getClass(), "functionName", null);
        setBooleanField(term217903, term217903.getClass(), "itsNeedsActivation", false);
        setIntField(term217903, term217903.getClass(), "itsFunctionType", 0);
        setBooleanField(term217903, term217903.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217903, term217903.getClass(), "encodedSourceStart", 0);
        setIntField(term217903, term217903.getClass(), "encodedSourceEnd", 0);
        setField(term217903, term217903.getClass(), "sourceName", null);
        setIntField(term217903, term217903.getClass(), "baseLineno", 0);
        setIntField(term217903, term217903.getClass(), "endLineno", 0);
        setField(term217903, term217903.getClass(), "functions", null);
        setField(term217903, term217903.getClass(), "regexps", null);
        setField(term217903, term217903.getClass(), "itsVariables", null);
        setField(term217903, term217903.getClass(), "itsConst", null);
        setField(term217903, term217903.getClass(), "itsVariableNames", null);
        setIntField(term217903, term217903.getClass(), "varStart", 0);
        setField(term217903, term217903.getClass(), "compilerData", null);
        setIntField(term217903, term217903.getClass(), "type", 0);
        setField(term217903, term217903.getClass(), "next", null);
        setField(term217903, term217903.getClass(), "first", null);
        setField(term217903, term217903.getClass(), "last", null);
        setField(term217903, term217903.getClass(), "propListHead", null);
        setIntField(term217903, term217903.getClass(), "sourcePosition", 0);
        setField(term217903, term217903.getClass(), "jsType", null);
        setField(term217904, term217904.getClass(), "functionName", null);
        setBooleanField(term217904, term217904.getClass(), "itsNeedsActivation", false);
        setIntField(term217904, term217904.getClass(), "itsFunctionType", 0);
        setBooleanField(term217904, term217904.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217904, term217904.getClass(), "encodedSourceStart", 0);
        setIntField(term217904, term217904.getClass(), "encodedSourceEnd", 0);
        setField(term217904, term217904.getClass(), "sourceName", null);
        setIntField(term217904, term217904.getClass(), "baseLineno", 0);
        setIntField(term217904, term217904.getClass(), "endLineno", 0);
        setField(term217904, term217904.getClass(), "functions", null);
        setField(term217904, term217904.getClass(), "regexps", null);
        setField(term217904, term217904.getClass(), "itsVariables", null);
        setField(term217904, term217904.getClass(), "itsConst", null);
        setField(term217904, term217904.getClass(), "itsVariableNames", null);
        setIntField(term217904, term217904.getClass(), "varStart", 0);
        setField(term217904, term217904.getClass(), "compilerData", null);
        setIntField(term217904, term217904.getClass(), "type", 0);
        setField(term217904, term217904.getClass(), "next", null);
        setField(term217904, term217904.getClass(), "first", null);
        setField(term217904, term217904.getClass(), "last", null);
        setField(term217904, term217904.getClass(), "propListHead", null);
        setIntField(term217904, term217904.getClass(), "sourcePosition", 0);
        setField(term217904, term217904.getClass(), "jsType", null);
        setField(term217904, term217904.getClass(), "parent", null);
        setField(term217903, term217903.getClass(), "parent", term217904);
        term217905 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term217905, term217905.getClass(), "str", null);
        setIntField(term217905, term217905.getClass(), "type", 0);
        setField(term217905, term217905.getClass(), "next", null);
        setField(term217905, term217905.getClass(), "first", null);
        setField(term217905, term217905.getClass(), "last", null);
        setField(term217905, term217905.getClass(), "propListHead", null);
        setIntField(term217905, term217905.getClass(), "sourcePosition", 0);
        setField(term217905, term217905.getClass(), "jsType", null);
        setField(term217905, term217905.getClass(), "parent", null);
        term217906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term217906, term217906.getClass(), "type", 0);
        setField(term217906, term217906.getClass(), "next", null);
        setField(term217906, term217906.getClass(), "first", null);
        setField(term217906, term217906.getClass(), "last", null);
        setField(term217906, term217906.getClass(), "propListHead", null);
        setIntField(term217906, term217906.getClass(), "sourcePosition", 0);
        setField(term217906, term217906.getClass(), "jsType", null);
        setField(term217906, term217906.getClass(), "parent", null);
        term217845 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term217856 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term217845, term217845.getClass(), "functionName", null);
        setBooleanField(term217845, term217845.getClass(), "itsNeedsActivation", false);
        setIntField(term217845, term217845.getClass(), "itsFunctionType", 0);
        setBooleanField(term217845, term217845.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217845, term217845.getClass(), "encodedSourceStart", 0);
        setIntField(term217845, term217845.getClass(), "encodedSourceEnd", 0);
        setField(term217845, term217845.getClass(), "sourceName", null);
        setIntField(term217845, term217845.getClass(), "baseLineno", 0);
        setIntField(term217845, term217845.getClass(), "endLineno", 0);
        setField(term217845, term217845.getClass(), "functions", null);
        setField(term217845, term217845.getClass(), "regexps", null);
        setField(term217845, term217845.getClass(), "itsVariables", null);
        setField(term217845, term217845.getClass(), "itsConst", null);
        setField(term217845, term217845.getClass(), "itsVariableNames", null);
        setIntField(term217845, term217845.getClass(), "varStart", 0);
        setField(term217845, term217845.getClass(), "compilerData", null);
        setIntField(term217845, term217845.getClass(), "type", 0);
        setField(term217845, term217845.getClass(), "next", null);
        setField(term217845, term217845.getClass(), "first", null);
        setField(term217845, term217845.getClass(), "last", null);
        setField(term217845, term217845.getClass(), "propListHead", null);
        setIntField(term217845, term217845.getClass(), "sourcePosition", 0);
        setField(term217845, term217845.getClass(), "jsType", null);
        setField(term217856, term217856.getClass(), "functionName", null);
        setBooleanField(term217856, term217856.getClass(), "itsNeedsActivation", false);
        setIntField(term217856, term217856.getClass(), "itsFunctionType", 0);
        setBooleanField(term217856, term217856.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217856, term217856.getClass(), "encodedSourceStart", 0);
        setIntField(term217856, term217856.getClass(), "encodedSourceEnd", 0);
        setField(term217856, term217856.getClass(), "sourceName", null);
        setIntField(term217856, term217856.getClass(), "baseLineno", 0);
        setIntField(term217856, term217856.getClass(), "endLineno", 0);
        setField(term217856, term217856.getClass(), "functions", null);
        setField(term217856, term217856.getClass(), "regexps", null);
        setField(term217856, term217856.getClass(), "itsVariables", null);
        setField(term217856, term217856.getClass(), "itsConst", null);
        setField(term217856, term217856.getClass(), "itsVariableNames", null);
        setIntField(term217856, term217856.getClass(), "varStart", 0);
        setField(term217856, term217856.getClass(), "compilerData", null);
        setIntField(term217856, term217856.getClass(), "type", 0);
        setField(term217856, term217856.getClass(), "next", null);
        setField(term217856, term217856.getClass(), "first", null);
        setField(term217856, term217856.getClass(), "last", null);
        setField(term217856, term217856.getClass(), "propListHead", null);
        setIntField(term217856, term217856.getClass(), "sourcePosition", 0);
        setField(term217856, term217856.getClass(), "jsType", null);
        setField(term217856, term217856.getClass(), "parent", null);
        setField(term217845, term217845.getClass(), "parent", term217856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term210131;
        args[1] = term210309;
        args[2] = term210379;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term210045, args);
        assertTrue(recursiveEquals(term210045, term217902));
        assertTrue(recursiveEquals(term210131, term217903));
        assertTrue(recursiveEquals(term210309, term217905));
        assertTrue(recursiveEquals(term210379, term217906));
        assertTrue(recursiveEquals(retValue, term217845));
    }

};


