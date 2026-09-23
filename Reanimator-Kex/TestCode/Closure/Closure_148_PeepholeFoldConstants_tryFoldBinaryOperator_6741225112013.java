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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538732;
     Object term538818;
     Object term540025;
     Object term540026;
     Object term539949;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term538732 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term538818 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538904 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term538904, term538904.getClass(), "next", term538974);
        setField(term538818, term538818.getClass(), "first", term538904);
        setIntField(term538818, term538818.getClass(), "type", 14);
        term540025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term540025, term540025.getClass(), "currentTraversal", null);
        term540026 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540027 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term540026, term540026.getClass(), "functionName", null);
        setBooleanField(term540026, term540026.getClass(), "itsNeedsActivation", false);
        setIntField(term540026, term540026.getClass(), "itsFunctionType", 0);
        setBooleanField(term540026, term540026.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term540026, term540026.getClass(), "encodedSourceStart", 0);
        setIntField(term540026, term540026.getClass(), "encodedSourceEnd", 0);
        setField(term540026, term540026.getClass(), "sourceName", null);
        setIntField(term540026, term540026.getClass(), "baseLineno", 0);
        setIntField(term540026, term540026.getClass(), "endLineno", 0);
        setField(term540026, term540026.getClass(), "functions", null);
        setField(term540026, term540026.getClass(), "regexps", null);
        setField(term540026, term540026.getClass(), "itsVariables", null);
        setField(term540026, term540026.getClass(), "itsConst", null);
        setField(term540026, term540026.getClass(), "itsVariableNames", null);
        setIntField(term540026, term540026.getClass(), "varStart", 0);
        setField(term540026, term540026.getClass(), "compilerData", null);
        setIntField(term540026, term540026.getClass(), "type", 14);
        setField(term540026, term540026.getClass(), "next", null);
        setField(term540027, term540027.getClass(), "functionName", null);
        setBooleanField(term540027, term540027.getClass(), "itsNeedsActivation", false);
        setIntField(term540027, term540027.getClass(), "itsFunctionType", 0);
        setBooleanField(term540027, term540027.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term540027, term540027.getClass(), "encodedSourceStart", 0);
        setIntField(term540027, term540027.getClass(), "encodedSourceEnd", 0);
        setField(term540027, term540027.getClass(), "sourceName", null);
        setIntField(term540027, term540027.getClass(), "baseLineno", 0);
        setIntField(term540027, term540027.getClass(), "endLineno", 0);
        setField(term540027, term540027.getClass(), "functions", null);
        setField(term540027, term540027.getClass(), "regexps", null);
        setField(term540027, term540027.getClass(), "itsVariables", null);
        setField(term540027, term540027.getClass(), "itsConst", null);
        setField(term540027, term540027.getClass(), "itsVariableNames", null);
        setIntField(term540027, term540027.getClass(), "varStart", 0);
        setField(term540027, term540027.getClass(), "compilerData", null);
        setIntField(term540027, term540027.getClass(), "type", 0);
        setIntField(term540028, term540028.getClass(), "type", 0);
        setField(term540028, term540028.getClass(), "next", null);
        setField(term540028, term540028.getClass(), "first", null);
        setField(term540028, term540028.getClass(), "last", null);
        setField(term540028, term540028.getClass(), "propListHead", null);
        setIntField(term540028, term540028.getClass(), "sourcePosition", 0);
        setField(term540028, term540028.getClass(), "jsType", null);
        setField(term540028, term540028.getClass(), "parent", null);
        setField(term540027, term540027.getClass(), "next", term540028);
        setField(term540027, term540027.getClass(), "first", null);
        setField(term540027, term540027.getClass(), "last", null);
        setField(term540027, term540027.getClass(), "propListHead", null);
        setIntField(term540027, term540027.getClass(), "sourcePosition", 0);
        setField(term540027, term540027.getClass(), "jsType", null);
        setField(term540027, term540027.getClass(), "parent", null);
        setField(term540026, term540026.getClass(), "first", term540027);
        setField(term540026, term540026.getClass(), "last", null);
        setField(term540026, term540026.getClass(), "propListHead", null);
        setIntField(term540026, term540026.getClass(), "sourcePosition", 0);
        setField(term540026, term540026.getClass(), "jsType", null);
        setField(term540026, term540026.getClass(), "parent", null);
        term539949 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term539959 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term539969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term539949, term539949.getClass(), "functionName", null);
        setBooleanField(term539949, term539949.getClass(), "itsNeedsActivation", false);
        setIntField(term539949, term539949.getClass(), "itsFunctionType", 0);
        setBooleanField(term539949, term539949.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term539949, term539949.getClass(), "encodedSourceStart", 0);
        setIntField(term539949, term539949.getClass(), "encodedSourceEnd", 0);
        setField(term539949, term539949.getClass(), "sourceName", null);
        setIntField(term539949, term539949.getClass(), "baseLineno", 0);
        setIntField(term539949, term539949.getClass(), "endLineno", 0);
        setField(term539949, term539949.getClass(), "functions", null);
        setField(term539949, term539949.getClass(), "regexps", null);
        setField(term539949, term539949.getClass(), "itsVariables", null);
        setField(term539949, term539949.getClass(), "itsConst", null);
        setField(term539949, term539949.getClass(), "itsVariableNames", null);
        setIntField(term539949, term539949.getClass(), "varStart", 0);
        setField(term539949, term539949.getClass(), "compilerData", null);
        setIntField(term539949, term539949.getClass(), "type", 14);
        setField(term539949, term539949.getClass(), "next", null);
        setField(term539959, term539959.getClass(), "functionName", null);
        setBooleanField(term539959, term539959.getClass(), "itsNeedsActivation", false);
        setIntField(term539959, term539959.getClass(), "itsFunctionType", 0);
        setBooleanField(term539959, term539959.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term539959, term539959.getClass(), "encodedSourceStart", 0);
        setIntField(term539959, term539959.getClass(), "encodedSourceEnd", 0);
        setField(term539959, term539959.getClass(), "sourceName", null);
        setIntField(term539959, term539959.getClass(), "baseLineno", 0);
        setIntField(term539959, term539959.getClass(), "endLineno", 0);
        setField(term539959, term539959.getClass(), "functions", null);
        setField(term539959, term539959.getClass(), "regexps", null);
        setField(term539959, term539959.getClass(), "itsVariables", null);
        setField(term539959, term539959.getClass(), "itsConst", null);
        setField(term539959, term539959.getClass(), "itsVariableNames", null);
        setIntField(term539959, term539959.getClass(), "varStart", 0);
        setField(term539959, term539959.getClass(), "compilerData", null);
        setIntField(term539959, term539959.getClass(), "type", 0);
        setIntField(term539969, term539969.getClass(), "type", 0);
        setField(term539969, term539969.getClass(), "next", null);
        setField(term539969, term539969.getClass(), "first", null);
        setField(term539969, term539969.getClass(), "last", null);
        setField(term539969, term539969.getClass(), "propListHead", null);
        setIntField(term539969, term539969.getClass(), "sourcePosition", 0);
        setField(term539969, term539969.getClass(), "jsType", null);
        setField(term539969, term539969.getClass(), "parent", null);
        setField(term539959, term539959.getClass(), "next", term539969);
        setField(term539959, term539959.getClass(), "first", null);
        setField(term539959, term539959.getClass(), "last", null);
        setField(term539959, term539959.getClass(), "propListHead", null);
        setIntField(term539959, term539959.getClass(), "sourcePosition", 0);
        setField(term539959, term539959.getClass(), "jsType", null);
        setField(term539959, term539959.getClass(), "parent", null);
        setField(term539949, term539949.getClass(), "first", term539959);
        setField(term539949, term539949.getClass(), "last", null);
        setField(term539949, term539949.getClass(), "propListHead", null);
        setIntField(term539949, term539949.getClass(), "sourcePosition", 0);
        setField(term539949, term539949.getClass(), "jsType", null);
        setField(term539949, term539949.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term538818;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term538732, args);
        assertTrue(recursiveEquals(term538732, term540025));
        assertTrue(recursiveEquals(term538818, term540026));
        assertTrue(recursiveEquals(retValue, term539949));
    }

};


