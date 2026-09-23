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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407097;
     Object term407183;
     Object term407952;
     Object term407954;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407097 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term407183 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term407269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term407183, term407183.getClass(), "type", 108);
        setField(term407183, term407183.getClass(), "first", term407269);
        term407952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term407953 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term407952, term407952.getClass(), "functionName", null);
        setBooleanField(term407952, term407952.getClass(), "itsNeedsActivation", false);
        setIntField(term407952, term407952.getClass(), "itsFunctionType", 0);
        setBooleanField(term407952, term407952.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term407952, term407952.getClass(), "encodedSourceStart", 0);
        setIntField(term407952, term407952.getClass(), "encodedSourceEnd", 0);
        setField(term407952, term407952.getClass(), "sourceName", null);
        setIntField(term407952, term407952.getClass(), "baseLineno", 0);
        setIntField(term407952, term407952.getClass(), "endLineno", 0);
        setField(term407952, term407952.getClass(), "functions", null);
        setField(term407952, term407952.getClass(), "regexps", null);
        setField(term407952, term407952.getClass(), "itsVariables", null);
        setField(term407952, term407952.getClass(), "itsConst", null);
        setField(term407952, term407952.getClass(), "itsVariableNames", null);
        setIntField(term407952, term407952.getClass(), "varStart", 0);
        setField(term407952, term407952.getClass(), "compilerData", null);
        setIntField(term407952, term407952.getClass(), "type", 108);
        setField(term407952, term407952.getClass(), "next", null);
        setField(term407953, term407953.getClass(), "functionName", null);
        setBooleanField(term407953, term407953.getClass(), "itsNeedsActivation", false);
        setIntField(term407953, term407953.getClass(), "itsFunctionType", 0);
        setBooleanField(term407953, term407953.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term407953, term407953.getClass(), "encodedSourceStart", 0);
        setIntField(term407953, term407953.getClass(), "encodedSourceEnd", 0);
        setField(term407953, term407953.getClass(), "sourceName", null);
        setIntField(term407953, term407953.getClass(), "baseLineno", 0);
        setIntField(term407953, term407953.getClass(), "endLineno", 0);
        setField(term407953, term407953.getClass(), "functions", null);
        setField(term407953, term407953.getClass(), "regexps", null);
        setField(term407953, term407953.getClass(), "itsVariables", null);
        setField(term407953, term407953.getClass(), "itsConst", null);
        setField(term407953, term407953.getClass(), "itsVariableNames", null);
        setIntField(term407953, term407953.getClass(), "varStart", 0);
        setField(term407953, term407953.getClass(), "compilerData", null);
        setIntField(term407953, term407953.getClass(), "type", 0);
        setField(term407953, term407953.getClass(), "next", null);
        setField(term407953, term407953.getClass(), "first", null);
        setField(term407953, term407953.getClass(), "last", null);
        setField(term407953, term407953.getClass(), "propListHead", null);
        setIntField(term407953, term407953.getClass(), "sourcePosition", 0);
        setField(term407953, term407953.getClass(), "jsType", null);
        setField(term407953, term407953.getClass(), "parent", null);
        setField(term407952, term407952.getClass(), "first", term407953);
        setField(term407952, term407952.getClass(), "last", null);
        setField(term407952, term407952.getClass(), "propListHead", null);
        setIntField(term407952, term407952.getClass(), "sourcePosition", 0);
        setField(term407952, term407952.getClass(), "jsType", null);
        setField(term407952, term407952.getClass(), "parent", null);
        term407954 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term407954, term407954.getClass(), "functionName", null);
        setBooleanField(term407954, term407954.getClass(), "itsNeedsActivation", false);
        setIntField(term407954, term407954.getClass(), "itsFunctionType", 0);
        setBooleanField(term407954, term407954.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term407954, term407954.getClass(), "encodedSourceStart", 0);
        setIntField(term407954, term407954.getClass(), "encodedSourceEnd", 0);
        setField(term407954, term407954.getClass(), "sourceName", null);
        setIntField(term407954, term407954.getClass(), "baseLineno", 0);
        setIntField(term407954, term407954.getClass(), "endLineno", 0);
        setField(term407954, term407954.getClass(), "functions", null);
        setField(term407954, term407954.getClass(), "regexps", null);
        setField(term407954, term407954.getClass(), "itsVariables", null);
        setField(term407954, term407954.getClass(), "itsConst", null);
        setField(term407954, term407954.getClass(), "itsVariableNames", null);
        setIntField(term407954, term407954.getClass(), "varStart", 0);
        setField(term407954, term407954.getClass(), "compilerData", null);
        setIntField(term407954, term407954.getClass(), "type", 0);
        setField(term407954, term407954.getClass(), "next", null);
        setField(term407954, term407954.getClass(), "first", null);
        setField(term407954, term407954.getClass(), "last", null);
        setField(term407954, term407954.getClass(), "propListHead", null);
        setIntField(term407954, term407954.getClass(), "sourcePosition", 0);
        setField(term407954, term407954.getClass(), "jsType", null);
        setField(term407954, term407954.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term407097;
        args[1] = term407183;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term407097, term407952));
        assertTrue(recursiveEquals(term407183, term407954));
        assertTrue(recursiveEquals(retValue, true));
    }

};


