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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647572;
     Object term647658;
     Object term647836;
     Object term647906;
     Object term647995;
     Object term647996;
     Object term647998;
     Object term647999;
     Object term647924;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647572 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term647658 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term647744 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term647658, term647658.getClass(), "parent", term647744);
        setIntField(term647658, term647658.getClass(), "type", 0);
        term647836 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term647836, term647836.getClass(), "type", 0);
        term647906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term647906, term647906.getClass(), "type", 63);
        term647995 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term647995, term647995.getClass(), "currentTraversal", null);
        term647996 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term647997 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term647996, term647996.getClass(), "functionName", null);
        setBooleanField(term647996, term647996.getClass(), "itsNeedsActivation", false);
        setIntField(term647996, term647996.getClass(), "itsFunctionType", 0);
        setBooleanField(term647996, term647996.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term647996, term647996.getClass(), "encodedSourceStart", 0);
        setIntField(term647996, term647996.getClass(), "encodedSourceEnd", 0);
        setField(term647996, term647996.getClass(), "sourceName", null);
        setIntField(term647996, term647996.getClass(), "baseLineno", 0);
        setIntField(term647996, term647996.getClass(), "endLineno", 0);
        setField(term647996, term647996.getClass(), "functions", null);
        setField(term647996, term647996.getClass(), "regexps", null);
        setField(term647996, term647996.getClass(), "itsVariables", null);
        setField(term647996, term647996.getClass(), "itsConst", null);
        setField(term647996, term647996.getClass(), "itsVariableNames", null);
        setIntField(term647996, term647996.getClass(), "varStart", 0);
        setField(term647996, term647996.getClass(), "compilerData", null);
        setIntField(term647996, term647996.getClass(), "type", 0);
        setField(term647996, term647996.getClass(), "next", null);
        setField(term647996, term647996.getClass(), "first", null);
        setField(term647996, term647996.getClass(), "last", null);
        setField(term647996, term647996.getClass(), "propListHead", null);
        setIntField(term647996, term647996.getClass(), "sourcePosition", 0);
        setField(term647996, term647996.getClass(), "jsType", null);
        setField(term647997, term647997.getClass(), "functionName", null);
        setBooleanField(term647997, term647997.getClass(), "itsNeedsActivation", false);
        setIntField(term647997, term647997.getClass(), "itsFunctionType", 0);
        setBooleanField(term647997, term647997.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term647997, term647997.getClass(), "encodedSourceStart", 0);
        setIntField(term647997, term647997.getClass(), "encodedSourceEnd", 0);
        setField(term647997, term647997.getClass(), "sourceName", null);
        setIntField(term647997, term647997.getClass(), "baseLineno", 0);
        setIntField(term647997, term647997.getClass(), "endLineno", 0);
        setField(term647997, term647997.getClass(), "functions", null);
        setField(term647997, term647997.getClass(), "regexps", null);
        setField(term647997, term647997.getClass(), "itsVariables", null);
        setField(term647997, term647997.getClass(), "itsConst", null);
        setField(term647997, term647997.getClass(), "itsVariableNames", null);
        setIntField(term647997, term647997.getClass(), "varStart", 0);
        setField(term647997, term647997.getClass(), "compilerData", null);
        setIntField(term647997, term647997.getClass(), "type", 0);
        setField(term647997, term647997.getClass(), "next", null);
        setField(term647997, term647997.getClass(), "first", null);
        setField(term647997, term647997.getClass(), "last", null);
        setField(term647997, term647997.getClass(), "propListHead", null);
        setIntField(term647997, term647997.getClass(), "sourcePosition", 0);
        setField(term647997, term647997.getClass(), "jsType", null);
        setField(term647997, term647997.getClass(), "parent", null);
        setField(term647996, term647996.getClass(), "parent", term647997);
        term647998 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term647998, term647998.getClass(), "str", null);
        setIntField(term647998, term647998.getClass(), "type", 0);
        setField(term647998, term647998.getClass(), "next", null);
        setField(term647998, term647998.getClass(), "first", null);
        setField(term647998, term647998.getClass(), "last", null);
        setField(term647998, term647998.getClass(), "propListHead", null);
        setIntField(term647998, term647998.getClass(), "sourcePosition", 0);
        setField(term647998, term647998.getClass(), "jsType", null);
        setField(term647998, term647998.getClass(), "parent", null);
        term647999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term647999, term647999.getClass(), "type", 63);
        setField(term647999, term647999.getClass(), "next", null);
        setField(term647999, term647999.getClass(), "first", null);
        setField(term647999, term647999.getClass(), "last", null);
        setField(term647999, term647999.getClass(), "propListHead", null);
        setIntField(term647999, term647999.getClass(), "sourcePosition", 0);
        setField(term647999, term647999.getClass(), "jsType", null);
        setField(term647999, term647999.getClass(), "parent", null);
        term647924 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term647935 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term647924, term647924.getClass(), "functionName", null);
        setBooleanField(term647924, term647924.getClass(), "itsNeedsActivation", false);
        setIntField(term647924, term647924.getClass(), "itsFunctionType", 0);
        setBooleanField(term647924, term647924.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term647924, term647924.getClass(), "encodedSourceStart", 0);
        setIntField(term647924, term647924.getClass(), "encodedSourceEnd", 0);
        setField(term647924, term647924.getClass(), "sourceName", null);
        setIntField(term647924, term647924.getClass(), "baseLineno", 0);
        setIntField(term647924, term647924.getClass(), "endLineno", 0);
        setField(term647924, term647924.getClass(), "functions", null);
        setField(term647924, term647924.getClass(), "regexps", null);
        setField(term647924, term647924.getClass(), "itsVariables", null);
        setField(term647924, term647924.getClass(), "itsConst", null);
        setField(term647924, term647924.getClass(), "itsVariableNames", null);
        setIntField(term647924, term647924.getClass(), "varStart", 0);
        setField(term647924, term647924.getClass(), "compilerData", null);
        setIntField(term647924, term647924.getClass(), "type", 0);
        setField(term647924, term647924.getClass(), "next", null);
        setField(term647924, term647924.getClass(), "first", null);
        setField(term647924, term647924.getClass(), "last", null);
        setField(term647924, term647924.getClass(), "propListHead", null);
        setIntField(term647924, term647924.getClass(), "sourcePosition", 0);
        setField(term647924, term647924.getClass(), "jsType", null);
        setField(term647935, term647935.getClass(), "functionName", null);
        setBooleanField(term647935, term647935.getClass(), "itsNeedsActivation", false);
        setIntField(term647935, term647935.getClass(), "itsFunctionType", 0);
        setBooleanField(term647935, term647935.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term647935, term647935.getClass(), "encodedSourceStart", 0);
        setIntField(term647935, term647935.getClass(), "encodedSourceEnd", 0);
        setField(term647935, term647935.getClass(), "sourceName", null);
        setIntField(term647935, term647935.getClass(), "baseLineno", 0);
        setIntField(term647935, term647935.getClass(), "endLineno", 0);
        setField(term647935, term647935.getClass(), "functions", null);
        setField(term647935, term647935.getClass(), "regexps", null);
        setField(term647935, term647935.getClass(), "itsVariables", null);
        setField(term647935, term647935.getClass(), "itsConst", null);
        setField(term647935, term647935.getClass(), "itsVariableNames", null);
        setIntField(term647935, term647935.getClass(), "varStart", 0);
        setField(term647935, term647935.getClass(), "compilerData", null);
        setIntField(term647935, term647935.getClass(), "type", 0);
        setField(term647935, term647935.getClass(), "next", null);
        setField(term647935, term647935.getClass(), "first", null);
        setField(term647935, term647935.getClass(), "last", null);
        setField(term647935, term647935.getClass(), "propListHead", null);
        setIntField(term647935, term647935.getClass(), "sourcePosition", 0);
        setField(term647935, term647935.getClass(), "jsType", null);
        setField(term647935, term647935.getClass(), "parent", null);
        setField(term647924, term647924.getClass(), "parent", term647935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term647658;
        args[1] = term647836;
        args[2] = term647906;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term647572, args);
        assertTrue(recursiveEquals(term647572, term647995));
        assertTrue(recursiveEquals(term647658, term647996));
        assertTrue(recursiveEquals(term647836, term647998));
        assertTrue(recursiveEquals(term647906, term647999));
        assertTrue(recursiveEquals(retValue, term647924));
    }

};


