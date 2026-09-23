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

public class ClosureCodingConvention_describeFunctionBind_91621925871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44451;
     Object term44537;
     Object term44574;
     Object term44575;

    public ClosureCodingConvention_describeFunctionBind_91621925871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44451 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term44537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term44574 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term44574, term44574.getClass(), "propertyTestFunctions", null);
        term44575 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term44575, term44575.getClass(), "functionName", null);
        setBooleanField(term44575, term44575.getClass(), "itsNeedsActivation", false);
        setIntField(term44575, term44575.getClass(), "itsFunctionType", 0);
        setBooleanField(term44575, term44575.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44575, term44575.getClass(), "encodedSourceStart", 0);
        setIntField(term44575, term44575.getClass(), "encodedSourceEnd", 0);
        setField(term44575, term44575.getClass(), "sourceName", null);
        setIntField(term44575, term44575.getClass(), "baseLineno", 0);
        setIntField(term44575, term44575.getClass(), "endLineno", 0);
        setField(term44575, term44575.getClass(), "functions", null);
        setField(term44575, term44575.getClass(), "regexps", null);
        setField(term44575, term44575.getClass(), "itsVariables", null);
        setField(term44575, term44575.getClass(), "itsConst", null);
        setField(term44575, term44575.getClass(), "itsVariableNames", null);
        setIntField(term44575, term44575.getClass(), "varStart", 0);
        setField(term44575, term44575.getClass(), "compilerData", null);
        setIntField(term44575, term44575.getClass(), "type", 0);
        setField(term44575, term44575.getClass(), "next", null);
        setField(term44575, term44575.getClass(), "first", null);
        setField(term44575, term44575.getClass(), "last", null);
        setField(term44575, term44575.getClass(), "propListHead", null);
        setIntField(term44575, term44575.getClass(), "sourcePosition", 0);
        setField(term44575, term44575.getClass(), "jsType", null);
        setField(term44575, term44575.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44537;
        Object retValue = callMethod(klass, "describeFunctionBind", argTypes, term44451, args);
        assertTrue(recursiveEquals(term44451, term44574));
        assertTrue(recursiveEquals(term44537, term44575));
        assertTrue(recursiveEquals(retValue, null));
    }

};


