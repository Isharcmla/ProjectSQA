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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133728;
     Object term133814;
     Object term133931;
     Object term133932;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133728 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term133814 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term133906 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term133814, term133814.getClass(), "type", 33);
        setField(term133814, term133814.getClass(), "last", term133906);
        term133931 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term133931, term133931.getClass(), "propertyTestFunctions", null);
        term133932 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term133933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term133932, term133932.getClass(), "functionName", null);
        setBooleanField(term133932, term133932.getClass(), "itsNeedsActivation", false);
        setIntField(term133932, term133932.getClass(), "itsFunctionType", 0);
        setBooleanField(term133932, term133932.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term133932, term133932.getClass(), "encodedSourceStart", 0);
        setIntField(term133932, term133932.getClass(), "encodedSourceEnd", 0);
        setField(term133932, term133932.getClass(), "sourceName", null);
        setIntField(term133932, term133932.getClass(), "baseLineno", 0);
        setIntField(term133932, term133932.getClass(), "endLineno", 0);
        setField(term133932, term133932.getClass(), "functions", null);
        setField(term133932, term133932.getClass(), "regexps", null);
        setField(term133932, term133932.getClass(), "itsVariables", null);
        setField(term133932, term133932.getClass(), "itsConst", null);
        setField(term133932, term133932.getClass(), "itsVariableNames", null);
        setIntField(term133932, term133932.getClass(), "varStart", 0);
        setField(term133932, term133932.getClass(), "compilerData", null);
        setIntField(term133932, term133932.getClass(), "type", 33);
        setField(term133932, term133932.getClass(), "next", null);
        setField(term133932, term133932.getClass(), "first", null);
        setField(term133933, term133933.getClass(), "str", null);
        setIntField(term133933, term133933.getClass(), "type", 0);
        setField(term133933, term133933.getClass(), "next", null);
        setField(term133933, term133933.getClass(), "first", null);
        setField(term133933, term133933.getClass(), "last", null);
        setField(term133933, term133933.getClass(), "propListHead", null);
        setIntField(term133933, term133933.getClass(), "sourcePosition", 0);
        setField(term133933, term133933.getClass(), "jsType", null);
        setField(term133933, term133933.getClass(), "parent", null);
        setField(term133932, term133932.getClass(), "last", term133933);
        setField(term133932, term133932.getClass(), "propListHead", null);
        setIntField(term133932, term133932.getClass(), "sourcePosition", 0);
        setField(term133932, term133932.getClass(), "jsType", null);
        setField(term133932, term133932.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term133814;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term133728, args);
        assertTrue(recursiveEquals(term133728, term133931));
        assertTrue(recursiveEquals(term133814, term133932));
        assertTrue(recursiveEquals(retValue, null));
    }

};


