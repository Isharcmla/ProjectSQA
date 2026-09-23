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

public class CheckAccessControls_getClassOfMethod_1679898606197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54668;
     Object term54754;
     Object term54840;
     Object term55470;
     Object term55471;
     Object term55472;

    public CheckAccessControls_getClassOfMethod_1679898606197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54668 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term54754 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term54840 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term54840, term54840.getClass(), "type", -87);
        term55470 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term55470, term55470.getClass(), "compiler", null);
        setField(term55470, term55470.getClass(), "validator", null);
        setIntField(term55470, term55470.getClass(), "deprecatedDepth", 0);
        setIntField(term55470, term55470.getClass(), "methodDepth", 0);
        setField(term55470, term55470.getClass(), "currentClass", null);
        setField(term55470, term55470.getClass(), "initializedConstantProperties", null);
        term55471 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term55471, term55471.getClass(), "functionName", null);
        setBooleanField(term55471, term55471.getClass(), "itsNeedsActivation", false);
        setIntField(term55471, term55471.getClass(), "itsFunctionType", 0);
        setBooleanField(term55471, term55471.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55471, term55471.getClass(), "encodedSourceStart", 0);
        setIntField(term55471, term55471.getClass(), "encodedSourceEnd", 0);
        setField(term55471, term55471.getClass(), "sourceName", null);
        setIntField(term55471, term55471.getClass(), "baseLineno", 0);
        setIntField(term55471, term55471.getClass(), "endLineno", 0);
        setField(term55471, term55471.getClass(), "functions", null);
        setField(term55471, term55471.getClass(), "regexps", null);
        setField(term55471, term55471.getClass(), "itsVariables", null);
        setField(term55471, term55471.getClass(), "itsConst", null);
        setField(term55471, term55471.getClass(), "itsVariableNames", null);
        setIntField(term55471, term55471.getClass(), "varStart", 0);
        setField(term55471, term55471.getClass(), "compilerData", null);
        setIntField(term55471, term55471.getClass(), "type", -87);
        setField(term55471, term55471.getClass(), "next", null);
        setField(term55471, term55471.getClass(), "first", null);
        setField(term55471, term55471.getClass(), "last", null);
        setField(term55471, term55471.getClass(), "propListHead", null);
        setIntField(term55471, term55471.getClass(), "sourcePosition", 0);
        setField(term55471, term55471.getClass(), "jsType", null);
        setField(term55471, term55471.getClass(), "parent", null);
        term55472 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term55472, term55472.getClass(), "functionName", null);
        setBooleanField(term55472, term55472.getClass(), "itsNeedsActivation", false);
        setIntField(term55472, term55472.getClass(), "itsFunctionType", 0);
        setBooleanField(term55472, term55472.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55472, term55472.getClass(), "encodedSourceStart", 0);
        setIntField(term55472, term55472.getClass(), "encodedSourceEnd", 0);
        setField(term55472, term55472.getClass(), "sourceName", null);
        setIntField(term55472, term55472.getClass(), "baseLineno", 0);
        setIntField(term55472, term55472.getClass(), "endLineno", 0);
        setField(term55472, term55472.getClass(), "functions", null);
        setField(term55472, term55472.getClass(), "regexps", null);
        setField(term55472, term55472.getClass(), "itsVariables", null);
        setField(term55472, term55472.getClass(), "itsConst", null);
        setField(term55472, term55472.getClass(), "itsVariableNames", null);
        setIntField(term55472, term55472.getClass(), "varStart", 0);
        setField(term55472, term55472.getClass(), "compilerData", null);
        setIntField(term55472, term55472.getClass(), "type", 0);
        setField(term55472, term55472.getClass(), "next", null);
        setField(term55472, term55472.getClass(), "first", null);
        setField(term55472, term55472.getClass(), "last", null);
        setField(term55472, term55472.getClass(), "propListHead", null);
        setIntField(term55472, term55472.getClass(), "sourcePosition", 0);
        setField(term55472, term55472.getClass(), "jsType", null);
        setField(term55472, term55472.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term54754;
        args[1] = term54840;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term54668, args);
        assertTrue(recursiveEquals(term54668, term55470));
        assertTrue(recursiveEquals(term54754, term55471));
        assertTrue(recursiveEquals(term54840, term55472));
        assertTrue(recursiveEquals(retValue, null));
    }

};


