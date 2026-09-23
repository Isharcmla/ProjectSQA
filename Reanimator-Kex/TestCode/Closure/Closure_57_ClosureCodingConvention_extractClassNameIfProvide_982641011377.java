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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139514;
     Object term139600;
     Object term139631;
     Object term139632;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139514 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term139600 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term139631 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term139631, term139631.getClass(), "propertyTestFunctions", null);
        term139632 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term139632, term139632.getClass(), "functionName", null);
        setBooleanField(term139632, term139632.getClass(), "itsNeedsActivation", false);
        setIntField(term139632, term139632.getClass(), "itsFunctionType", 0);
        setBooleanField(term139632, term139632.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term139632, term139632.getClass(), "encodedSourceStart", 0);
        setIntField(term139632, term139632.getClass(), "encodedSourceEnd", 0);
        setField(term139632, term139632.getClass(), "sourceName", null);
        setIntField(term139632, term139632.getClass(), "baseLineno", 0);
        setIntField(term139632, term139632.getClass(), "endLineno", 0);
        setField(term139632, term139632.getClass(), "functions", null);
        setField(term139632, term139632.getClass(), "regexps", null);
        setField(term139632, term139632.getClass(), "itsVariables", null);
        setField(term139632, term139632.getClass(), "itsConst", null);
        setField(term139632, term139632.getClass(), "itsVariableNames", null);
        setIntField(term139632, term139632.getClass(), "varStart", 0);
        setField(term139632, term139632.getClass(), "compilerData", null);
        setIntField(term139632, term139632.getClass(), "type", 0);
        setField(term139632, term139632.getClass(), "next", null);
        setField(term139632, term139632.getClass(), "first", null);
        setField(term139632, term139632.getClass(), "last", null);
        setField(term139632, term139632.getClass(), "propListHead", null);
        setIntField(term139632, term139632.getClass(), "sourcePosition", 0);
        setField(term139632, term139632.getClass(), "jsType", null);
        setField(term139632, term139632.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term139600;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term139514, args);
        assertTrue(recursiveEquals(term139514, term139631));
        assertTrue(recursiveEquals(term139600, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


