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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61925;
     Object term62011;
     Object term62029;
     Object term62030;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61925 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term62011 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term62029 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term62029, term62029.getClass(), "propertyTestFunctions", null);
        term62030 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term62030, term62030.getClass(), "functionName", null);
        setBooleanField(term62030, term62030.getClass(), "itsNeedsActivation", false);
        setIntField(term62030, term62030.getClass(), "itsFunctionType", 0);
        setBooleanField(term62030, term62030.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62030, term62030.getClass(), "encodedSourceStart", 0);
        setIntField(term62030, term62030.getClass(), "encodedSourceEnd", 0);
        setField(term62030, term62030.getClass(), "sourceName", null);
        setIntField(term62030, term62030.getClass(), "baseLineno", 0);
        setIntField(term62030, term62030.getClass(), "endLineno", 0);
        setField(term62030, term62030.getClass(), "functions", null);
        setField(term62030, term62030.getClass(), "regexps", null);
        setField(term62030, term62030.getClass(), "itsVariables", null);
        setField(term62030, term62030.getClass(), "itsConst", null);
        setField(term62030, term62030.getClass(), "itsVariableNames", null);
        setIntField(term62030, term62030.getClass(), "varStart", 0);
        setField(term62030, term62030.getClass(), "compilerData", null);
        setIntField(term62030, term62030.getClass(), "type", 0);
        setField(term62030, term62030.getClass(), "next", null);
        setField(term62030, term62030.getClass(), "first", null);
        setField(term62030, term62030.getClass(), "last", null);
        setField(term62030, term62030.getClass(), "propListHead", null);
        setIntField(term62030, term62030.getClass(), "sourcePosition", 0);
        setField(term62030, term62030.getClass(), "jsType", null);
        setField(term62030, term62030.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term62011;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term61925, args);
        assertTrue(recursiveEquals(term61925, term62029));
        assertTrue(recursiveEquals(term62011, term62030));
        assertTrue(recursiveEquals(retValue, null));
    }

};


