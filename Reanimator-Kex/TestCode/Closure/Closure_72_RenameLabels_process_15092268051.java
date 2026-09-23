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

public class RenameLabels_process_15092268051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24964;
     Object term25050;
     Object term25404;
     Object term25405;

    public RenameLabels_process_15092268051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24964 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term24964, term24964.getClass(), "compiler", null);
        term25050 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term25136 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term25050, term25050.getClass(), "type", 0);
        setField(term25050, term25050.getClass(), "first", term25136);
        term25404 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term25404, term25404.getClass(), "compiler", null);
        setField(term25404, term25404.getClass(), "nameSupplier", null);
        setBooleanField(term25404, term25404.getClass(), "removeUnused", false);
        term25405 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term25406 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term25405, term25405.getClass(), "functionName", null);
        setBooleanField(term25405, term25405.getClass(), "itsNeedsActivation", false);
        setIntField(term25405, term25405.getClass(), "itsFunctionType", 0);
        setBooleanField(term25405, term25405.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term25405, term25405.getClass(), "encodedSourceStart", 0);
        setIntField(term25405, term25405.getClass(), "encodedSourceEnd", 0);
        setField(term25405, term25405.getClass(), "sourceName", null);
        setIntField(term25405, term25405.getClass(), "baseLineno", 0);
        setIntField(term25405, term25405.getClass(), "endLineno", 0);
        setField(term25405, term25405.getClass(), "functions", null);
        setField(term25405, term25405.getClass(), "regexps", null);
        setField(term25405, term25405.getClass(), "itsVariables", null);
        setField(term25405, term25405.getClass(), "itsConst", null);
        setField(term25405, term25405.getClass(), "itsVariableNames", null);
        setIntField(term25405, term25405.getClass(), "varStart", 0);
        setField(term25405, term25405.getClass(), "compilerData", null);
        setIntField(term25405, term25405.getClass(), "type", 0);
        setField(term25405, term25405.getClass(), "next", null);
        setField(term25406, term25406.getClass(), "functionName", null);
        setBooleanField(term25406, term25406.getClass(), "itsNeedsActivation", false);
        setIntField(term25406, term25406.getClass(), "itsFunctionType", 0);
        setBooleanField(term25406, term25406.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term25406, term25406.getClass(), "encodedSourceStart", 0);
        setIntField(term25406, term25406.getClass(), "encodedSourceEnd", 0);
        setField(term25406, term25406.getClass(), "sourceName", null);
        setIntField(term25406, term25406.getClass(), "baseLineno", 0);
        setIntField(term25406, term25406.getClass(), "endLineno", 0);
        setField(term25406, term25406.getClass(), "functions", null);
        setField(term25406, term25406.getClass(), "regexps", null);
        setField(term25406, term25406.getClass(), "itsVariables", null);
        setField(term25406, term25406.getClass(), "itsConst", null);
        setField(term25406, term25406.getClass(), "itsVariableNames", null);
        setIntField(term25406, term25406.getClass(), "varStart", 0);
        setField(term25406, term25406.getClass(), "compilerData", null);
        setIntField(term25406, term25406.getClass(), "type", 0);
        setField(term25406, term25406.getClass(), "next", null);
        setField(term25406, term25406.getClass(), "first", null);
        setField(term25406, term25406.getClass(), "last", null);
        setField(term25406, term25406.getClass(), "propListHead", null);
        setIntField(term25406, term25406.getClass(), "sourcePosition", 0);
        setField(term25406, term25406.getClass(), "jsType", null);
        setField(term25406, term25406.getClass(), "parent", null);
        setField(term25405, term25405.getClass(), "first", term25406);
        setField(term25405, term25405.getClass(), "last", null);
        setField(term25405, term25405.getClass(), "propListHead", null);
        setIntField(term25405, term25405.getClass(), "sourcePosition", 0);
        setField(term25405, term25405.getClass(), "jsType", null);
        setField(term25405, term25405.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term25050;
        callMethod(klass, "process", argTypes, term24964, args);
        assertTrue(recursiveEquals(term24964, term25404));
        assertTrue(recursiveEquals(term25050, null));
    }

};


