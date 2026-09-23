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

public class ClosureCodingConvention_extractClassNameIfGoog_1998914631473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155580;
     Object term155789;

    public ClosureCodingConvention_extractClassNameIfGoog_1998914631473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155580 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term155666 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term155580, term155580.getClass(), "type", 130);
        setField(term155580, term155580.getClass(), "first", term155666);
        term155789 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term155790 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155789, term155789.getClass(), "functionName", null);
        setBooleanField(term155789, term155789.getClass(), "itsNeedsActivation", false);
        setIntField(term155789, term155789.getClass(), "itsFunctionType", 0);
        setBooleanField(term155789, term155789.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155789, term155789.getClass(), "encodedSourceStart", 0);
        setIntField(term155789, term155789.getClass(), "encodedSourceEnd", 0);
        setField(term155789, term155789.getClass(), "sourceName", null);
        setIntField(term155789, term155789.getClass(), "baseLineno", 0);
        setIntField(term155789, term155789.getClass(), "endLineno", 0);
        setField(term155789, term155789.getClass(), "functions", null);
        setField(term155789, term155789.getClass(), "regexps", null);
        setField(term155789, term155789.getClass(), "itsVariables", null);
        setField(term155789, term155789.getClass(), "itsConst", null);
        setField(term155789, term155789.getClass(), "itsVariableNames", null);
        setIntField(term155789, term155789.getClass(), "varStart", 0);
        setField(term155789, term155789.getClass(), "compilerData", null);
        setIntField(term155789, term155789.getClass(), "type", 130);
        setField(term155789, term155789.getClass(), "next", null);
        setField(term155790, term155790.getClass(), "functionName", null);
        setBooleanField(term155790, term155790.getClass(), "itsNeedsActivation", false);
        setIntField(term155790, term155790.getClass(), "itsFunctionType", 0);
        setBooleanField(term155790, term155790.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155790, term155790.getClass(), "encodedSourceStart", 0);
        setIntField(term155790, term155790.getClass(), "encodedSourceEnd", 0);
        setField(term155790, term155790.getClass(), "sourceName", null);
        setIntField(term155790, term155790.getClass(), "baseLineno", 0);
        setIntField(term155790, term155790.getClass(), "endLineno", 0);
        setField(term155790, term155790.getClass(), "functions", null);
        setField(term155790, term155790.getClass(), "regexps", null);
        setField(term155790, term155790.getClass(), "itsVariables", null);
        setField(term155790, term155790.getClass(), "itsConst", null);
        setField(term155790, term155790.getClass(), "itsVariableNames", null);
        setIntField(term155790, term155790.getClass(), "varStart", 0);
        setField(term155790, term155790.getClass(), "compilerData", null);
        setIntField(term155790, term155790.getClass(), "type", 0);
        setField(term155790, term155790.getClass(), "next", null);
        setField(term155790, term155790.getClass(), "first", null);
        setField(term155790, term155790.getClass(), "last", null);
        setField(term155790, term155790.getClass(), "propListHead", null);
        setIntField(term155790, term155790.getClass(), "sourcePosition", 0);
        setField(term155790, term155790.getClass(), "jsType", null);
        setField(term155790, term155790.getClass(), "parent", null);
        setField(term155789, term155789.getClass(), "first", term155790);
        setField(term155789, term155789.getClass(), "last", null);
        setField(term155789, term155789.getClass(), "propListHead", null);
        setIntField(term155789, term155789.getClass(), "sourcePosition", 0);
        setField(term155789, term155789.getClass(), "jsType", null);
        setField(term155789, term155789.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term155580;
        args[2] = null;
        Object retValue = callMethod(klass, "extractClassNameIfGoog", argTypes, null, args);
        assertTrue(recursiveEquals(term155580, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


