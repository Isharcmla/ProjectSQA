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

public class ClosureCodingConvention_getObjectLiteralCast_148496234333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129829;
     Object term129915;
     Object term130058;
     Object term130059;

    public ClosureCodingConvention_getObjectLiteralCast_148496234333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129829 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term129915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term130007 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term129915, term129915.getClass(), "type", 37);
        setField(term129915, term129915.getClass(), "first", term130007);
        term130058 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term130058, term130058.getClass(), "propertyTestFunctions", null);
        term130059 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term130060 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term130059, term130059.getClass(), "functionName", null);
        setBooleanField(term130059, term130059.getClass(), "itsNeedsActivation", false);
        setIntField(term130059, term130059.getClass(), "itsFunctionType", 0);
        setBooleanField(term130059, term130059.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term130059, term130059.getClass(), "encodedSourceStart", 0);
        setIntField(term130059, term130059.getClass(), "encodedSourceEnd", 0);
        setField(term130059, term130059.getClass(), "sourceName", null);
        setIntField(term130059, term130059.getClass(), "baseLineno", 0);
        setIntField(term130059, term130059.getClass(), "endLineno", 0);
        setField(term130059, term130059.getClass(), "functions", null);
        setField(term130059, term130059.getClass(), "regexps", null);
        setField(term130059, term130059.getClass(), "itsVariables", null);
        setField(term130059, term130059.getClass(), "itsConst", null);
        setField(term130059, term130059.getClass(), "itsVariableNames", null);
        setIntField(term130059, term130059.getClass(), "varStart", 0);
        setField(term130059, term130059.getClass(), "compilerData", null);
        setIntField(term130059, term130059.getClass(), "type", 37);
        setField(term130059, term130059.getClass(), "next", null);
        setDoubleField(term130060, term130060.getClass(), "number", 0.0);
        setIntField(term130060, term130060.getClass(), "type", 0);
        setField(term130060, term130060.getClass(), "next", null);
        setField(term130060, term130060.getClass(), "first", null);
        setField(term130060, term130060.getClass(), "last", null);
        setField(term130060, term130060.getClass(), "propListHead", null);
        setIntField(term130060, term130060.getClass(), "sourcePosition", 0);
        setField(term130060, term130060.getClass(), "jsType", null);
        setField(term130060, term130060.getClass(), "parent", null);
        setField(term130059, term130059.getClass(), "first", term130060);
        setField(term130059, term130059.getClass(), "last", null);
        setField(term130059, term130059.getClass(), "propListHead", null);
        setIntField(term130059, term130059.getClass(), "sourcePosition", 0);
        setField(term130059, term130059.getClass(), "jsType", null);
        setField(term130059, term130059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term129915;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term129829, args);
        assertTrue(recursiveEquals(term129829, term130058));
        assertTrue(recursiveEquals(term129915, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


