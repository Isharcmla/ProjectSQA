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
import java.util.ArrayList;
import java.lang.Object;

public class PureFunctionIdentifier_markPureFunctionCalls_87078875719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3644;
     Object term3934;

    public PureFunctionIdentifier_markPureFunctionCalls_87078875719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3874 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term3788, term3788.getClass(), "first", term3874);
        ArrayList term3696 = new ArrayList();
        ((ArrayList) term3696).add(term3788);
        term3644 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        setField(term3644, term3644.getClass(), "allFunctionCalls", term3696);
        setField(term3644, term3644.getClass(), "definitionProvider", null);
        Object term3937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term3937, term3937.getClass(), "str", null);
        setIntField(term3937, term3937.getClass(), "type", 0);
        setField(term3937, term3937.getClass(), "next", null);
        setField(term3938, term3938.getClass(), "functionName", null);
        setBooleanField(term3938, term3938.getClass(), "itsNeedsActivation", false);
        setIntField(term3938, term3938.getClass(), "itsFunctionType", 0);
        setBooleanField(term3938, term3938.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3938, term3938.getClass(), "encodedSourceStart", 0);
        setIntField(term3938, term3938.getClass(), "encodedSourceEnd", 0);
        setField(term3938, term3938.getClass(), "sourceName", null);
        setIntField(term3938, term3938.getClass(), "baseLineno", 0);
        setIntField(term3938, term3938.getClass(), "endLineno", 0);
        setField(term3938, term3938.getClass(), "functions", null);
        setField(term3938, term3938.getClass(), "regexps", null);
        setField(term3938, term3938.getClass(), "itsVariables", null);
        setField(term3938, term3938.getClass(), "itsConst", null);
        setField(term3938, term3938.getClass(), "itsVariableNames", null);
        setIntField(term3938, term3938.getClass(), "varStart", 0);
        setField(term3938, term3938.getClass(), "compilerData", null);
        setIntField(term3938, term3938.getClass(), "type", 0);
        setField(term3938, term3938.getClass(), "next", null);
        setField(term3938, term3938.getClass(), "first", null);
        setField(term3938, term3938.getClass(), "last", null);
        setField(term3938, term3938.getClass(), "propListHead", null);
        setIntField(term3938, term3938.getClass(), "sourcePosition", 0);
        setField(term3938, term3938.getClass(), "jsType", null);
        setField(term3938, term3938.getClass(), "parent", null);
        setField(term3937, term3937.getClass(), "first", term3938);
        setField(term3937, term3937.getClass(), "last", null);
        setField(term3937, term3937.getClass(), "propListHead", null);
        setIntField(term3937, term3937.getClass(), "sourcePosition", 0);
        setField(term3937, term3937.getClass(), "jsType", null);
        setField(term3937, term3937.getClass(), "parent", null);
        ArrayList term3935 = new ArrayList();
        ((ArrayList) term3935).add(term3937);
        term3934 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        setField(term3934, term3934.getClass(), "compiler", null);
        setField(term3934, term3934.getClass(), "definitionProvider", null);
        setField(term3934, term3934.getClass(), "functionSideEffectMap", null);
        setField(term3934, term3934.getClass(), "allFunctionCalls", term3935);
        setField(term3934, term3934.getClass(), "externs", null);
        setField(term3934, term3934.getClass(), "root", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "markPureFunctionCalls", argTypes, term3644, args);
        assertTrue(recursiveEquals(term3644, term3934));
    }

};


