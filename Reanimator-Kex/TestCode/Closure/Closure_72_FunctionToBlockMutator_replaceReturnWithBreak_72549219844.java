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

public class FunctionToBlockMutator_replaceReturnWithBreak_72549219844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5154;
     Object term14585;
     Object term14516;

    public FunctionToBlockMutator_replaceReturnWithBreak_72549219844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5154 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term5240 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term5154, term5154.getClass(), "type", 0);
        setField(term5154, term5154.getClass(), "first", term5240);
        term14585 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term14586 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term14585, term14585.getClass(), "functionName", null);
        setBooleanField(term14585, term14585.getClass(), "itsNeedsActivation", false);
        setIntField(term14585, term14585.getClass(), "itsFunctionType", 0);
        setBooleanField(term14585, term14585.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term14585, term14585.getClass(), "encodedSourceStart", 0);
        setIntField(term14585, term14585.getClass(), "encodedSourceEnd", 0);
        setField(term14585, term14585.getClass(), "sourceName", null);
        setIntField(term14585, term14585.getClass(), "baseLineno", 0);
        setIntField(term14585, term14585.getClass(), "endLineno", 0);
        setField(term14585, term14585.getClass(), "functions", null);
        setField(term14585, term14585.getClass(), "regexps", null);
        setField(term14585, term14585.getClass(), "itsVariables", null);
        setField(term14585, term14585.getClass(), "itsConst", null);
        setField(term14585, term14585.getClass(), "itsVariableNames", null);
        setIntField(term14585, term14585.getClass(), "varStart", 0);
        setField(term14585, term14585.getClass(), "compilerData", null);
        setIntField(term14585, term14585.getClass(), "type", 0);
        setField(term14585, term14585.getClass(), "next", null);
        setField(term14586, term14586.getClass(), "functionName", null);
        setBooleanField(term14586, term14586.getClass(), "itsNeedsActivation", false);
        setIntField(term14586, term14586.getClass(), "itsFunctionType", 0);
        setBooleanField(term14586, term14586.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term14586, term14586.getClass(), "encodedSourceStart", 0);
        setIntField(term14586, term14586.getClass(), "encodedSourceEnd", 0);
        setField(term14586, term14586.getClass(), "sourceName", null);
        setIntField(term14586, term14586.getClass(), "baseLineno", 0);
        setIntField(term14586, term14586.getClass(), "endLineno", 0);
        setField(term14586, term14586.getClass(), "functions", null);
        setField(term14586, term14586.getClass(), "regexps", null);
        setField(term14586, term14586.getClass(), "itsVariables", null);
        setField(term14586, term14586.getClass(), "itsConst", null);
        setField(term14586, term14586.getClass(), "itsVariableNames", null);
        setIntField(term14586, term14586.getClass(), "varStart", 0);
        setField(term14586, term14586.getClass(), "compilerData", null);
        setIntField(term14586, term14586.getClass(), "type", 0);
        setField(term14586, term14586.getClass(), "next", null);
        setField(term14586, term14586.getClass(), "first", null);
        setField(term14586, term14586.getClass(), "last", null);
        setField(term14586, term14586.getClass(), "propListHead", null);
        setIntField(term14586, term14586.getClass(), "sourcePosition", 0);
        setField(term14586, term14586.getClass(), "jsType", null);
        setField(term14586, term14586.getClass(), "parent", null);
        setField(term14585, term14585.getClass(), "first", term14586);
        setField(term14585, term14585.getClass(), "last", null);
        setField(term14585, term14585.getClass(), "propListHead", null);
        setIntField(term14585, term14585.getClass(), "sourcePosition", 0);
        setField(term14585, term14585.getClass(), "jsType", null);
        setField(term14585, term14585.getClass(), "parent", null);
        term14516 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term14526 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term14516, term14516.getClass(), "functionName", null);
        setBooleanField(term14516, term14516.getClass(), "itsNeedsActivation", false);
        setIntField(term14516, term14516.getClass(), "itsFunctionType", 0);
        setBooleanField(term14516, term14516.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term14516, term14516.getClass(), "encodedSourceStart", 0);
        setIntField(term14516, term14516.getClass(), "encodedSourceEnd", 0);
        setField(term14516, term14516.getClass(), "sourceName", null);
        setIntField(term14516, term14516.getClass(), "baseLineno", 0);
        setIntField(term14516, term14516.getClass(), "endLineno", 0);
        setField(term14516, term14516.getClass(), "functions", null);
        setField(term14516, term14516.getClass(), "regexps", null);
        setField(term14516, term14516.getClass(), "itsVariables", null);
        setField(term14516, term14516.getClass(), "itsConst", null);
        setField(term14516, term14516.getClass(), "itsVariableNames", null);
        setIntField(term14516, term14516.getClass(), "varStart", 0);
        setField(term14516, term14516.getClass(), "compilerData", null);
        setIntField(term14516, term14516.getClass(), "type", 0);
        setField(term14516, term14516.getClass(), "next", null);
        setField(term14526, term14526.getClass(), "functionName", null);
        setBooleanField(term14526, term14526.getClass(), "itsNeedsActivation", false);
        setIntField(term14526, term14526.getClass(), "itsFunctionType", 0);
        setBooleanField(term14526, term14526.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term14526, term14526.getClass(), "encodedSourceStart", 0);
        setIntField(term14526, term14526.getClass(), "encodedSourceEnd", 0);
        setField(term14526, term14526.getClass(), "sourceName", null);
        setIntField(term14526, term14526.getClass(), "baseLineno", 0);
        setIntField(term14526, term14526.getClass(), "endLineno", 0);
        setField(term14526, term14526.getClass(), "functions", null);
        setField(term14526, term14526.getClass(), "regexps", null);
        setField(term14526, term14526.getClass(), "itsVariables", null);
        setField(term14526, term14526.getClass(), "itsConst", null);
        setField(term14526, term14526.getClass(), "itsVariableNames", null);
        setIntField(term14526, term14526.getClass(), "varStart", 0);
        setField(term14526, term14526.getClass(), "compilerData", null);
        setIntField(term14526, term14526.getClass(), "type", 0);
        setField(term14526, term14526.getClass(), "next", null);
        setField(term14526, term14526.getClass(), "first", null);
        setField(term14526, term14526.getClass(), "last", null);
        setField(term14526, term14526.getClass(), "propListHead", null);
        setIntField(term14526, term14526.getClass(), "sourcePosition", 0);
        setField(term14526, term14526.getClass(), "jsType", null);
        setField(term14526, term14526.getClass(), "parent", null);
        setField(term14516, term14516.getClass(), "first", term14526);
        setField(term14516, term14516.getClass(), "last", null);
        setField(term14516, term14516.getClass(), "propListHead", null);
        setIntField(term14516, term14516.getClass(), "sourcePosition", 0);
        setField(term14516, term14516.getClass(), "jsType", null);
        setField(term14516, term14516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term5154;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "replaceReturnWithBreak", argTypes, null, args);
        assertTrue(recursiveEquals(term5154, term14585));
        assertTrue(recursiveEquals(retValue, term14516));
    }

};


