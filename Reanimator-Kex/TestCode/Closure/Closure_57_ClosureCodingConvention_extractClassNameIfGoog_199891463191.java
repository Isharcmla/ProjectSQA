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

public class ClosureCodingConvention_extractClassNameIfGoog_199891463191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49529;
     Object term49545;

    public ClosureCodingConvention_extractClassNameIfGoog_199891463191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49529 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term49545 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term49545, term49545.getClass(), "functionName", null);
        setBooleanField(term49545, term49545.getClass(), "itsNeedsActivation", false);
        setIntField(term49545, term49545.getClass(), "itsFunctionType", 0);
        setBooleanField(term49545, term49545.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term49545, term49545.getClass(), "encodedSourceStart", 0);
        setIntField(term49545, term49545.getClass(), "encodedSourceEnd", 0);
        setField(term49545, term49545.getClass(), "sourceName", null);
        setIntField(term49545, term49545.getClass(), "baseLineno", 0);
        setIntField(term49545, term49545.getClass(), "endLineno", 0);
        setField(term49545, term49545.getClass(), "functions", null);
        setField(term49545, term49545.getClass(), "regexps", null);
        setField(term49545, term49545.getClass(), "itsVariables", null);
        setField(term49545, term49545.getClass(), "itsConst", null);
        setField(term49545, term49545.getClass(), "itsVariableNames", null);
        setIntField(term49545, term49545.getClass(), "varStart", 0);
        setField(term49545, term49545.getClass(), "compilerData", null);
        setIntField(term49545, term49545.getClass(), "type", 0);
        setField(term49545, term49545.getClass(), "next", null);
        setField(term49545, term49545.getClass(), "first", null);
        setField(term49545, term49545.getClass(), "last", null);
        setField(term49545, term49545.getClass(), "propListHead", null);
        setIntField(term49545, term49545.getClass(), "sourcePosition", 0);
        setField(term49545, term49545.getClass(), "jsType", null);
        setField(term49545, term49545.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term49529;
        args[2] = null;
        Object retValue = callMethod(klass, "extractClassNameIfGoog", argTypes, null, args);
        assertTrue(recursiveEquals(term49529, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


