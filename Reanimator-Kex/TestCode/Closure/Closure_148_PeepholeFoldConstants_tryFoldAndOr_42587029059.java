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

public class PeepholeFoldConstants_tryFoldAndOr_42587029059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9787;
     Object term9916;
     Object term10002;
     Object term10500;
     Object term10501;
     Object term10502;
     Object term10503;
     Object term10449;

    public PeepholeFoldConstants_tryFoldAndOr_42587029059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9787 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term9916 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term9916, term9916.getClass(), "parent", null);
        setIntField(term9916, term9916.getClass(), "type", 0);
        term10002 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term10500 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term10500, term10500.getClass(), "currentTraversal", null);
        term10501 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10501, term10501.getClass(), "functionName", null);
        setBooleanField(term10501, term10501.getClass(), "itsNeedsActivation", false);
        setIntField(term10501, term10501.getClass(), "itsFunctionType", 0);
        setBooleanField(term10501, term10501.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10501, term10501.getClass(), "encodedSourceStart", 0);
        setIntField(term10501, term10501.getClass(), "encodedSourceEnd", 0);
        setField(term10501, term10501.getClass(), "sourceName", null);
        setIntField(term10501, term10501.getClass(), "baseLineno", 0);
        setIntField(term10501, term10501.getClass(), "endLineno", 0);
        setField(term10501, term10501.getClass(), "functions", null);
        setField(term10501, term10501.getClass(), "regexps", null);
        setField(term10501, term10501.getClass(), "itsVariables", null);
        setField(term10501, term10501.getClass(), "itsConst", null);
        setField(term10501, term10501.getClass(), "itsVariableNames", null);
        setIntField(term10501, term10501.getClass(), "varStart", 0);
        setField(term10501, term10501.getClass(), "compilerData", null);
        setIntField(term10501, term10501.getClass(), "type", 0);
        setField(term10501, term10501.getClass(), "next", null);
        setField(term10501, term10501.getClass(), "first", null);
        setField(term10501, term10501.getClass(), "last", null);
        setField(term10501, term10501.getClass(), "propListHead", null);
        setIntField(term10501, term10501.getClass(), "sourcePosition", 0);
        setField(term10501, term10501.getClass(), "jsType", null);
        setField(term10501, term10501.getClass(), "parent", null);
        term10502 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10502, term10502.getClass(), "functionName", null);
        setBooleanField(term10502, term10502.getClass(), "itsNeedsActivation", false);
        setIntField(term10502, term10502.getClass(), "itsFunctionType", 0);
        setBooleanField(term10502, term10502.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10502, term10502.getClass(), "encodedSourceStart", 0);
        setIntField(term10502, term10502.getClass(), "encodedSourceEnd", 0);
        setField(term10502, term10502.getClass(), "sourceName", null);
        setIntField(term10502, term10502.getClass(), "baseLineno", 0);
        setIntField(term10502, term10502.getClass(), "endLineno", 0);
        setField(term10502, term10502.getClass(), "functions", null);
        setField(term10502, term10502.getClass(), "regexps", null);
        setField(term10502, term10502.getClass(), "itsVariables", null);
        setField(term10502, term10502.getClass(), "itsConst", null);
        setField(term10502, term10502.getClass(), "itsVariableNames", null);
        setIntField(term10502, term10502.getClass(), "varStart", 0);
        setField(term10502, term10502.getClass(), "compilerData", null);
        setIntField(term10502, term10502.getClass(), "type", 0);
        setField(term10502, term10502.getClass(), "next", null);
        setField(term10502, term10502.getClass(), "first", null);
        setField(term10502, term10502.getClass(), "last", null);
        setField(term10502, term10502.getClass(), "propListHead", null);
        setIntField(term10502, term10502.getClass(), "sourcePosition", 0);
        setField(term10502, term10502.getClass(), "jsType", null);
        setField(term10502, term10502.getClass(), "parent", null);
        term10503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10503, term10503.getClass(), "functionName", null);
        setBooleanField(term10503, term10503.getClass(), "itsNeedsActivation", false);
        setIntField(term10503, term10503.getClass(), "itsFunctionType", 0);
        setBooleanField(term10503, term10503.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10503, term10503.getClass(), "encodedSourceStart", 0);
        setIntField(term10503, term10503.getClass(), "encodedSourceEnd", 0);
        setField(term10503, term10503.getClass(), "sourceName", null);
        setIntField(term10503, term10503.getClass(), "baseLineno", 0);
        setIntField(term10503, term10503.getClass(), "endLineno", 0);
        setField(term10503, term10503.getClass(), "functions", null);
        setField(term10503, term10503.getClass(), "regexps", null);
        setField(term10503, term10503.getClass(), "itsVariables", null);
        setField(term10503, term10503.getClass(), "itsConst", null);
        setField(term10503, term10503.getClass(), "itsVariableNames", null);
        setIntField(term10503, term10503.getClass(), "varStart", 0);
        setField(term10503, term10503.getClass(), "compilerData", null);
        setIntField(term10503, term10503.getClass(), "type", 0);
        setField(term10503, term10503.getClass(), "next", null);
        setField(term10503, term10503.getClass(), "first", null);
        setField(term10503, term10503.getClass(), "last", null);
        setField(term10503, term10503.getClass(), "propListHead", null);
        setIntField(term10503, term10503.getClass(), "sourcePosition", 0);
        setField(term10503, term10503.getClass(), "jsType", null);
        setField(term10503, term10503.getClass(), "parent", null);
        term10449 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10449, term10449.getClass(), "functionName", null);
        setBooleanField(term10449, term10449.getClass(), "itsNeedsActivation", false);
        setIntField(term10449, term10449.getClass(), "itsFunctionType", 0);
        setBooleanField(term10449, term10449.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10449, term10449.getClass(), "encodedSourceStart", 0);
        setIntField(term10449, term10449.getClass(), "encodedSourceEnd", 0);
        setField(term10449, term10449.getClass(), "sourceName", null);
        setIntField(term10449, term10449.getClass(), "baseLineno", 0);
        setIntField(term10449, term10449.getClass(), "endLineno", 0);
        setField(term10449, term10449.getClass(), "functions", null);
        setField(term10449, term10449.getClass(), "regexps", null);
        setField(term10449, term10449.getClass(), "itsVariables", null);
        setField(term10449, term10449.getClass(), "itsConst", null);
        setField(term10449, term10449.getClass(), "itsVariableNames", null);
        setIntField(term10449, term10449.getClass(), "varStart", 0);
        setField(term10449, term10449.getClass(), "compilerData", null);
        setIntField(term10449, term10449.getClass(), "type", 0);
        setField(term10449, term10449.getClass(), "next", null);
        setField(term10449, term10449.getClass(), "first", null);
        setField(term10449, term10449.getClass(), "last", null);
        setField(term10449, term10449.getClass(), "propListHead", null);
        setIntField(term10449, term10449.getClass(), "sourcePosition", 0);
        setField(term10449, term10449.getClass(), "jsType", null);
        setField(term10449, term10449.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term9916;
        args[1] = term9916;
        args[2] = term10002;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term9787, args);
        assertTrue(recursiveEquals(term9787, term10500));
        assertTrue(recursiveEquals(term9916, term10501));
        assertTrue(recursiveEquals(term9916, term10502));
        assertTrue(recursiveEquals(term10002, term10503));
        assertTrue(recursiveEquals(retValue, term10449));
    }

};


