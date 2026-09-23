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

public class CheckAccessControls_getClassOfMethod_1679898606270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80930;
     Object term81016;
     Object term81102;
     Object term81188;
     Object term81189;
     Object term81190;

    public CheckAccessControls_getClassOfMethod_1679898606270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80930 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term81016 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term81016, term81016.getClass(), "type", 38);
        term81102 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term81102, term81102.getClass(), "type", 38);
        term81188 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term81188, term81188.getClass(), "compiler", null);
        setField(term81188, term81188.getClass(), "validator", null);
        setIntField(term81188, term81188.getClass(), "deprecatedDepth", 0);
        setIntField(term81188, term81188.getClass(), "methodDepth", 0);
        setField(term81188, term81188.getClass(), "currentClass", null);
        setField(term81188, term81188.getClass(), "initializedConstantProperties", null);
        term81189 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81189, term81189.getClass(), "functionName", null);
        setBooleanField(term81189, term81189.getClass(), "itsNeedsActivation", false);
        setIntField(term81189, term81189.getClass(), "itsFunctionType", 0);
        setBooleanField(term81189, term81189.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81189, term81189.getClass(), "encodedSourceStart", 0);
        setIntField(term81189, term81189.getClass(), "encodedSourceEnd", 0);
        setField(term81189, term81189.getClass(), "sourceName", null);
        setIntField(term81189, term81189.getClass(), "baseLineno", 0);
        setIntField(term81189, term81189.getClass(), "endLineno", 0);
        setField(term81189, term81189.getClass(), "functions", null);
        setField(term81189, term81189.getClass(), "regexps", null);
        setField(term81189, term81189.getClass(), "itsVariables", null);
        setField(term81189, term81189.getClass(), "itsConst", null);
        setField(term81189, term81189.getClass(), "itsVariableNames", null);
        setIntField(term81189, term81189.getClass(), "varStart", 0);
        setField(term81189, term81189.getClass(), "compilerData", null);
        setIntField(term81189, term81189.getClass(), "type", 38);
        setField(term81189, term81189.getClass(), "next", null);
        setField(term81189, term81189.getClass(), "first", null);
        setField(term81189, term81189.getClass(), "last", null);
        setField(term81189, term81189.getClass(), "propListHead", null);
        setIntField(term81189, term81189.getClass(), "sourcePosition", 0);
        setField(term81189, term81189.getClass(), "jsType", null);
        setField(term81189, term81189.getClass(), "parent", null);
        term81190 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81190, term81190.getClass(), "functionName", null);
        setBooleanField(term81190, term81190.getClass(), "itsNeedsActivation", false);
        setIntField(term81190, term81190.getClass(), "itsFunctionType", 0);
        setBooleanField(term81190, term81190.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81190, term81190.getClass(), "encodedSourceStart", 0);
        setIntField(term81190, term81190.getClass(), "encodedSourceEnd", 0);
        setField(term81190, term81190.getClass(), "sourceName", null);
        setIntField(term81190, term81190.getClass(), "baseLineno", 0);
        setIntField(term81190, term81190.getClass(), "endLineno", 0);
        setField(term81190, term81190.getClass(), "functions", null);
        setField(term81190, term81190.getClass(), "regexps", null);
        setField(term81190, term81190.getClass(), "itsVariables", null);
        setField(term81190, term81190.getClass(), "itsConst", null);
        setField(term81190, term81190.getClass(), "itsVariableNames", null);
        setIntField(term81190, term81190.getClass(), "varStart", 0);
        setField(term81190, term81190.getClass(), "compilerData", null);
        setIntField(term81190, term81190.getClass(), "type", 38);
        setField(term81190, term81190.getClass(), "next", null);
        setField(term81190, term81190.getClass(), "first", null);
        setField(term81190, term81190.getClass(), "last", null);
        setField(term81190, term81190.getClass(), "propListHead", null);
        setIntField(term81190, term81190.getClass(), "sourcePosition", 0);
        setField(term81190, term81190.getClass(), "jsType", null);
        setField(term81190, term81190.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term81016;
        args[1] = term81102;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term80930, args);
        assertTrue(recursiveEquals(term80930, term81188));
        assertTrue(recursiveEquals(term81016, term81189));
        assertTrue(recursiveEquals(term81102, term81190));
        assertTrue(recursiveEquals(retValue, null));
    }

};


