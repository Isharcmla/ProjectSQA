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

public class TypeValidator_getReadableJSTypeName_850599436290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99152;
     Object term99238;
     Object term99407;
     Object term99408;

    public TypeValidator_getReadableJSTypeName_850599436290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99152 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term99238 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term99336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term99238, term99238.getClass(), "type", 42);
        setField(term99238, term99238.getClass(), "jsType", term99336);
        term99407 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term99407, term99407.getClass(), "compiler", null);
        setField(term99407, term99407.getClass(), "typeRegistry", null);
        setField(term99407, term99407.getClass(), "allValueTypes", null);
        setBooleanField(term99407, term99407.getClass(), "shouldReport", false);
        setField(term99407, term99407.getClass(), "nullOrUndefined", null);
        setField(term99407, term99407.getClass(), "mismatches", null);
        term99408 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term99409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term99408, term99408.getClass(), "functionName", null);
        setBooleanField(term99408, term99408.getClass(), "itsNeedsActivation", false);
        setIntField(term99408, term99408.getClass(), "itsFunctionType", 0);
        setBooleanField(term99408, term99408.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term99408, term99408.getClass(), "encodedSourceStart", 0);
        setIntField(term99408, term99408.getClass(), "encodedSourceEnd", 0);
        setField(term99408, term99408.getClass(), "sourceName", null);
        setIntField(term99408, term99408.getClass(), "baseLineno", 0);
        setIntField(term99408, term99408.getClass(), "endLineno", 0);
        setField(term99408, term99408.getClass(), "functions", null);
        setField(term99408, term99408.getClass(), "regexps", null);
        setField(term99408, term99408.getClass(), "itsVariables", null);
        setField(term99408, term99408.getClass(), "itsConst", null);
        setField(term99408, term99408.getClass(), "itsVariableNames", null);
        setIntField(term99408, term99408.getClass(), "varStart", 0);
        setField(term99408, term99408.getClass(), "compilerData", null);
        setIntField(term99408, term99408.getClass(), "type", 42);
        setField(term99408, term99408.getClass(), "next", null);
        setField(term99408, term99408.getClass(), "first", null);
        setField(term99408, term99408.getClass(), "last", null);
        setField(term99408, term99408.getClass(), "propListHead", null);
        setIntField(term99408, term99408.getClass(), "sourcePosition", 0);
        setBooleanField(term99409, term99409.getClass(), "isChecked", false);
        setBooleanField(term99409, term99409.getClass(), "visited", false);
        setField(term99409, term99409.getClass(), "docInfo", null);
        setBooleanField(term99409, term99409.getClass(), "unknown", false);
        setBooleanField(term99409, term99409.getClass(), "resolved", false);
        setField(term99409, term99409.getClass(), "resolveResult", null);
        setField(term99409, term99409.getClass(), "registry", null);
        setField(term99408, term99408.getClass(), "jsType", term99409);
        setField(term99408, term99408.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term99238;
        args[1] = false;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term99152, args);
        assertTrue(recursiveEquals(term99152, term99407));
        assertTrue(recursiveEquals(term99238, term99408));
        assertTrue(recursiveEquals(retValue, "this"));
    }

};


