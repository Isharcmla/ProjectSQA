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

public class RenameLabels_process_15092268059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28176;
     Object term28262;
     Object term28814;
     Object term28815;

    public RenameLabels_process_15092268059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28176 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term28176, term28176.getClass(), "compiler", null);
        term28262 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term28348 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term28434 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term28262, term28262.getClass(), "type", 0);
        setField(term28348, term28348.getClass(), "next", null);
        setIntField(term28348, term28348.getClass(), "type", 0);
        setField(term28348, term28348.getClass(), "first", term28434);
        setField(term28262, term28262.getClass(), "first", term28348);
        term28814 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term28814, term28814.getClass(), "compiler", null);
        setField(term28814, term28814.getClass(), "nameSupplier", null);
        setBooleanField(term28814, term28814.getClass(), "removeUnused", false);
        term28815 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term28816 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term28817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term28815, term28815.getClass(), "functionName", null);
        setBooleanField(term28815, term28815.getClass(), "itsNeedsActivation", false);
        setIntField(term28815, term28815.getClass(), "itsFunctionType", 0);
        setBooleanField(term28815, term28815.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term28815, term28815.getClass(), "encodedSourceStart", 0);
        setIntField(term28815, term28815.getClass(), "encodedSourceEnd", 0);
        setField(term28815, term28815.getClass(), "sourceName", null);
        setIntField(term28815, term28815.getClass(), "baseLineno", 0);
        setIntField(term28815, term28815.getClass(), "endLineno", 0);
        setField(term28815, term28815.getClass(), "functions", null);
        setField(term28815, term28815.getClass(), "regexps", null);
        setField(term28815, term28815.getClass(), "itsVariables", null);
        setField(term28815, term28815.getClass(), "itsConst", null);
        setField(term28815, term28815.getClass(), "itsVariableNames", null);
        setIntField(term28815, term28815.getClass(), "varStart", 0);
        setField(term28815, term28815.getClass(), "compilerData", null);
        setIntField(term28815, term28815.getClass(), "type", 0);
        setField(term28815, term28815.getClass(), "next", null);
        setField(term28816, term28816.getClass(), "functionName", null);
        setBooleanField(term28816, term28816.getClass(), "itsNeedsActivation", false);
        setIntField(term28816, term28816.getClass(), "itsFunctionType", 0);
        setBooleanField(term28816, term28816.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term28816, term28816.getClass(), "encodedSourceStart", 0);
        setIntField(term28816, term28816.getClass(), "encodedSourceEnd", 0);
        setField(term28816, term28816.getClass(), "sourceName", null);
        setIntField(term28816, term28816.getClass(), "baseLineno", 0);
        setIntField(term28816, term28816.getClass(), "endLineno", 0);
        setField(term28816, term28816.getClass(), "functions", null);
        setField(term28816, term28816.getClass(), "regexps", null);
        setField(term28816, term28816.getClass(), "itsVariables", null);
        setField(term28816, term28816.getClass(), "itsConst", null);
        setField(term28816, term28816.getClass(), "itsVariableNames", null);
        setIntField(term28816, term28816.getClass(), "varStart", 0);
        setField(term28816, term28816.getClass(), "compilerData", null);
        setIntField(term28816, term28816.getClass(), "type", 0);
        setField(term28816, term28816.getClass(), "next", null);
        setField(term28817, term28817.getClass(), "functionName", null);
        setBooleanField(term28817, term28817.getClass(), "itsNeedsActivation", false);
        setIntField(term28817, term28817.getClass(), "itsFunctionType", 0);
        setBooleanField(term28817, term28817.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term28817, term28817.getClass(), "encodedSourceStart", 0);
        setIntField(term28817, term28817.getClass(), "encodedSourceEnd", 0);
        setField(term28817, term28817.getClass(), "sourceName", null);
        setIntField(term28817, term28817.getClass(), "baseLineno", 0);
        setIntField(term28817, term28817.getClass(), "endLineno", 0);
        setField(term28817, term28817.getClass(), "functions", null);
        setField(term28817, term28817.getClass(), "regexps", null);
        setField(term28817, term28817.getClass(), "itsVariables", null);
        setField(term28817, term28817.getClass(), "itsConst", null);
        setField(term28817, term28817.getClass(), "itsVariableNames", null);
        setIntField(term28817, term28817.getClass(), "varStart", 0);
        setField(term28817, term28817.getClass(), "compilerData", null);
        setIntField(term28817, term28817.getClass(), "type", 0);
        setField(term28817, term28817.getClass(), "next", null);
        setField(term28817, term28817.getClass(), "first", null);
        setField(term28817, term28817.getClass(), "last", null);
        setField(term28817, term28817.getClass(), "propListHead", null);
        setIntField(term28817, term28817.getClass(), "sourcePosition", 0);
        setField(term28817, term28817.getClass(), "jsType", null);
        setField(term28817, term28817.getClass(), "parent", null);
        setField(term28816, term28816.getClass(), "first", term28817);
        setField(term28816, term28816.getClass(), "last", null);
        setField(term28816, term28816.getClass(), "propListHead", null);
        setIntField(term28816, term28816.getClass(), "sourcePosition", 0);
        setField(term28816, term28816.getClass(), "jsType", null);
        setField(term28816, term28816.getClass(), "parent", null);
        setField(term28815, term28815.getClass(), "first", term28816);
        setField(term28815, term28815.getClass(), "last", null);
        setField(term28815, term28815.getClass(), "propListHead", null);
        setIntField(term28815, term28815.getClass(), "sourcePosition", 0);
        setField(term28815, term28815.getClass(), "jsType", null);
        setField(term28815, term28815.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28262;
        callMethod(klass, "process", argTypes, term28176, args);
        assertTrue(recursiveEquals(term28176, term28814));
        assertTrue(recursiveEquals(term28262, null));
    }

};


