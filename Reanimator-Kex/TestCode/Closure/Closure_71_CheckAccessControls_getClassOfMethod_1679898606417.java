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

public class CheckAccessControls_getClassOfMethod_1679898606417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207580;
     Object term207666;
     Object term208721;
     Object term208722;

    public CheckAccessControls_getClassOfMethod_1679898606417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207580 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term207666 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term207752 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term207666, term207666.getClass(), "type", 86);
        setField(term207666, term207666.getClass(), "first", term207752);
        term208721 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term208721, term208721.getClass(), "compiler", null);
        setField(term208721, term208721.getClass(), "validator", null);
        setIntField(term208721, term208721.getClass(), "deprecatedDepth", 0);
        setIntField(term208721, term208721.getClass(), "methodDepth", 0);
        setField(term208721, term208721.getClass(), "currentClass", null);
        setField(term208721, term208721.getClass(), "initializedConstantProperties", null);
        term208722 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term208722, term208722.getClass(), "functionName", null);
        setBooleanField(term208722, term208722.getClass(), "itsNeedsActivation", false);
        setIntField(term208722, term208722.getClass(), "itsFunctionType", 0);
        setBooleanField(term208722, term208722.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208722, term208722.getClass(), "encodedSourceStart", 0);
        setIntField(term208722, term208722.getClass(), "encodedSourceEnd", 0);
        setField(term208722, term208722.getClass(), "sourceName", null);
        setIntField(term208722, term208722.getClass(), "baseLineno", 0);
        setIntField(term208722, term208722.getClass(), "endLineno", 0);
        setField(term208722, term208722.getClass(), "functions", null);
        setField(term208722, term208722.getClass(), "regexps", null);
        setField(term208722, term208722.getClass(), "itsVariables", null);
        setField(term208722, term208722.getClass(), "itsConst", null);
        setField(term208722, term208722.getClass(), "itsVariableNames", null);
        setIntField(term208722, term208722.getClass(), "varStart", 0);
        setField(term208722, term208722.getClass(), "compilerData", null);
        setIntField(term208722, term208722.getClass(), "type", 86);
        setField(term208722, term208722.getClass(), "next", null);
        setField(term208723, term208723.getClass(), "functionName", null);
        setBooleanField(term208723, term208723.getClass(), "itsNeedsActivation", false);
        setIntField(term208723, term208723.getClass(), "itsFunctionType", 0);
        setBooleanField(term208723, term208723.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208723, term208723.getClass(), "encodedSourceStart", 0);
        setIntField(term208723, term208723.getClass(), "encodedSourceEnd", 0);
        setField(term208723, term208723.getClass(), "sourceName", null);
        setIntField(term208723, term208723.getClass(), "baseLineno", 0);
        setIntField(term208723, term208723.getClass(), "endLineno", 0);
        setField(term208723, term208723.getClass(), "functions", null);
        setField(term208723, term208723.getClass(), "regexps", null);
        setField(term208723, term208723.getClass(), "itsVariables", null);
        setField(term208723, term208723.getClass(), "itsConst", null);
        setField(term208723, term208723.getClass(), "itsVariableNames", null);
        setIntField(term208723, term208723.getClass(), "varStart", 0);
        setField(term208723, term208723.getClass(), "compilerData", null);
        setIntField(term208723, term208723.getClass(), "type", 0);
        setField(term208723, term208723.getClass(), "next", null);
        setField(term208723, term208723.getClass(), "first", null);
        setField(term208723, term208723.getClass(), "last", null);
        setField(term208723, term208723.getClass(), "propListHead", null);
        setIntField(term208723, term208723.getClass(), "sourcePosition", 0);
        setField(term208723, term208723.getClass(), "jsType", null);
        setField(term208723, term208723.getClass(), "parent", null);
        setField(term208722, term208722.getClass(), "first", term208723);
        setField(term208722, term208722.getClass(), "last", null);
        setField(term208722, term208722.getClass(), "propListHead", null);
        setIntField(term208722, term208722.getClass(), "sourcePosition", 0);
        setField(term208722, term208722.getClass(), "jsType", null);
        setField(term208722, term208722.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term207666;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term207580, args);
        assertTrue(recursiveEquals(term207580, term208721));
        assertTrue(recursiveEquals(term207666, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


