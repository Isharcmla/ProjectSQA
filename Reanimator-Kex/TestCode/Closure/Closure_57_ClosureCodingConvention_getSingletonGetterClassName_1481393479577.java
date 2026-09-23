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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185876;
     Object term185968;
     Object term204671;
     Object term204672;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185876 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term185968 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term186054 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term186054, term186054.getClass(), "type", 42);
        setField(term185968, term185968.getClass(), "first", term186054);
        term204671 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term204671, term204671.getClass(), "propertyTestFunctions", null);
        term204672 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term204673 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term204672, term204672.getClass(), "str", null);
        setIntField(term204672, term204672.getClass(), "type", 0);
        setField(term204672, term204672.getClass(), "next", null);
        setField(term204673, term204673.getClass(), "functionName", null);
        setBooleanField(term204673, term204673.getClass(), "itsNeedsActivation", false);
        setIntField(term204673, term204673.getClass(), "itsFunctionType", 0);
        setBooleanField(term204673, term204673.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term204673, term204673.getClass(), "encodedSourceStart", 0);
        setIntField(term204673, term204673.getClass(), "encodedSourceEnd", 0);
        setField(term204673, term204673.getClass(), "sourceName", null);
        setIntField(term204673, term204673.getClass(), "baseLineno", 0);
        setIntField(term204673, term204673.getClass(), "endLineno", 0);
        setField(term204673, term204673.getClass(), "functions", null);
        setField(term204673, term204673.getClass(), "regexps", null);
        setField(term204673, term204673.getClass(), "itsVariables", null);
        setField(term204673, term204673.getClass(), "itsConst", null);
        setField(term204673, term204673.getClass(), "itsVariableNames", null);
        setIntField(term204673, term204673.getClass(), "varStart", 0);
        setField(term204673, term204673.getClass(), "compilerData", null);
        setIntField(term204673, term204673.getClass(), "type", 42);
        setField(term204673, term204673.getClass(), "next", null);
        setField(term204673, term204673.getClass(), "first", null);
        setField(term204673, term204673.getClass(), "last", null);
        setField(term204673, term204673.getClass(), "propListHead", null);
        setIntField(term204673, term204673.getClass(), "sourcePosition", 0);
        setField(term204673, term204673.getClass(), "jsType", null);
        setField(term204673, term204673.getClass(), "parent", null);
        setField(term204672, term204672.getClass(), "first", term204673);
        setField(term204672, term204672.getClass(), "last", null);
        setField(term204672, term204672.getClass(), "propListHead", null);
        setIntField(term204672, term204672.getClass(), "sourcePosition", 0);
        setField(term204672, term204672.getClass(), "jsType", null);
        setField(term204672, term204672.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term185968;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term185876, args);
        assertTrue(recursiveEquals(term185876, term204671));
        assertTrue(recursiveEquals(term185968, term204672));
        assertTrue(recursiveEquals(retValue, null));
    }

};


