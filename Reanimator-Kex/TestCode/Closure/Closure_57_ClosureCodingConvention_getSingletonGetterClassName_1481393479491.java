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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158694;
     Object term158780;
     Object term158960;
     Object term158961;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158694 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term158780 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term158866 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term158780, term158780.getClass(), "first", term158866);
        term158960 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term158960, term158960.getClass(), "propertyTestFunctions", null);
        term158961 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term158962 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term158961, term158961.getClass(), "functionName", null);
        setBooleanField(term158961, term158961.getClass(), "itsNeedsActivation", false);
        setIntField(term158961, term158961.getClass(), "itsFunctionType", 0);
        setBooleanField(term158961, term158961.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term158961, term158961.getClass(), "encodedSourceStart", 0);
        setIntField(term158961, term158961.getClass(), "encodedSourceEnd", 0);
        setField(term158961, term158961.getClass(), "sourceName", null);
        setIntField(term158961, term158961.getClass(), "baseLineno", 0);
        setIntField(term158961, term158961.getClass(), "endLineno", 0);
        setField(term158961, term158961.getClass(), "functions", null);
        setField(term158961, term158961.getClass(), "regexps", null);
        setField(term158961, term158961.getClass(), "itsVariables", null);
        setField(term158961, term158961.getClass(), "itsConst", null);
        setField(term158961, term158961.getClass(), "itsVariableNames", null);
        setIntField(term158961, term158961.getClass(), "varStart", 0);
        setField(term158961, term158961.getClass(), "compilerData", null);
        setIntField(term158961, term158961.getClass(), "type", 0);
        setField(term158961, term158961.getClass(), "next", null);
        setField(term158962, term158962.getClass(), "functionName", null);
        setBooleanField(term158962, term158962.getClass(), "itsNeedsActivation", false);
        setIntField(term158962, term158962.getClass(), "itsFunctionType", 0);
        setBooleanField(term158962, term158962.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term158962, term158962.getClass(), "encodedSourceStart", 0);
        setIntField(term158962, term158962.getClass(), "encodedSourceEnd", 0);
        setField(term158962, term158962.getClass(), "sourceName", null);
        setIntField(term158962, term158962.getClass(), "baseLineno", 0);
        setIntField(term158962, term158962.getClass(), "endLineno", 0);
        setField(term158962, term158962.getClass(), "functions", null);
        setField(term158962, term158962.getClass(), "regexps", null);
        setField(term158962, term158962.getClass(), "itsVariables", null);
        setField(term158962, term158962.getClass(), "itsConst", null);
        setField(term158962, term158962.getClass(), "itsVariableNames", null);
        setIntField(term158962, term158962.getClass(), "varStart", 0);
        setField(term158962, term158962.getClass(), "compilerData", null);
        setIntField(term158962, term158962.getClass(), "type", 0);
        setField(term158962, term158962.getClass(), "next", null);
        setField(term158962, term158962.getClass(), "first", null);
        setField(term158962, term158962.getClass(), "last", null);
        setField(term158962, term158962.getClass(), "propListHead", null);
        setIntField(term158962, term158962.getClass(), "sourcePosition", 0);
        setField(term158962, term158962.getClass(), "jsType", null);
        setField(term158962, term158962.getClass(), "parent", null);
        setField(term158961, term158961.getClass(), "first", term158962);
        setField(term158961, term158961.getClass(), "last", null);
        setField(term158961, term158961.getClass(), "propListHead", null);
        setIntField(term158961, term158961.getClass(), "sourcePosition", 0);
        setField(term158961, term158961.getClass(), "jsType", null);
        setField(term158961, term158961.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term158780;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term158694, args);
        assertTrue(recursiveEquals(term158694, term158960));
        assertTrue(recursiveEquals(term158780, term158961));
        assertTrue(recursiveEquals(retValue, null));
    }

};


