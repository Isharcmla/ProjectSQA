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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124155;
     Object term124245;
     Object term124409;
     Object term124410;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124155 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term124245 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term124335 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term124245, term124245.getClass(), "first", term124335);
        term124409 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term124409, term124409.getClass(), "propertyTestFunctions", null);
        term124410 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term124411 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term124410, term124410.getClass(), "encodedSourceStart", 0);
        setIntField(term124410, term124410.getClass(), "encodedSourceEnd", 0);
        setField(term124410, term124410.getClass(), "sourceName", null);
        setIntField(term124410, term124410.getClass(), "baseLineno", 0);
        setIntField(term124410, term124410.getClass(), "endLineno", 0);
        setField(term124410, term124410.getClass(), "functions", null);
        setField(term124410, term124410.getClass(), "regexps", null);
        setField(term124410, term124410.getClass(), "itsVariables", null);
        setField(term124410, term124410.getClass(), "itsConst", null);
        setField(term124410, term124410.getClass(), "itsVariableNames", null);
        setIntField(term124410, term124410.getClass(), "varStart", 0);
        setField(term124410, term124410.getClass(), "compilerData", null);
        setIntField(term124410, term124410.getClass(), "type", 0);
        setField(term124410, term124410.getClass(), "next", null);
        setIntField(term124411, term124411.getClass(), "encodedSourceStart", 0);
        setIntField(term124411, term124411.getClass(), "encodedSourceEnd", 0);
        setField(term124411, term124411.getClass(), "sourceName", null);
        setIntField(term124411, term124411.getClass(), "baseLineno", 0);
        setIntField(term124411, term124411.getClass(), "endLineno", 0);
        setField(term124411, term124411.getClass(), "functions", null);
        setField(term124411, term124411.getClass(), "regexps", null);
        setField(term124411, term124411.getClass(), "itsVariables", null);
        setField(term124411, term124411.getClass(), "itsConst", null);
        setField(term124411, term124411.getClass(), "itsVariableNames", null);
        setIntField(term124411, term124411.getClass(), "varStart", 0);
        setField(term124411, term124411.getClass(), "compilerData", null);
        setIntField(term124411, term124411.getClass(), "type", 0);
        setField(term124411, term124411.getClass(), "next", null);
        setField(term124411, term124411.getClass(), "first", null);
        setField(term124411, term124411.getClass(), "last", null);
        setField(term124411, term124411.getClass(), "propListHead", null);
        setIntField(term124411, term124411.getClass(), "sourcePosition", 0);
        setField(term124411, term124411.getClass(), "jsType", null);
        setField(term124411, term124411.getClass(), "parent", null);
        setField(term124410, term124410.getClass(), "first", term124411);
        setField(term124410, term124410.getClass(), "last", null);
        setField(term124410, term124410.getClass(), "propListHead", null);
        setIntField(term124410, term124410.getClass(), "sourcePosition", 0);
        setField(term124410, term124410.getClass(), "jsType", null);
        setField(term124410, term124410.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term124245;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term124155, args);
        assertTrue(recursiveEquals(term124155, term124409));
        assertTrue(recursiveEquals(term124245, term124410));
        assertTrue(recursiveEquals(retValue, null));
    }

};


