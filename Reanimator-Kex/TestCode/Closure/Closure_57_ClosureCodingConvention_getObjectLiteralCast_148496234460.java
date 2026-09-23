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

public class ClosureCodingConvention_getObjectLiteralCast_148496234460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153003;
     Object term153095;
     Object term153538;
     Object term153539;

    public ClosureCodingConvention_getObjectLiteralCast_148496234460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153003 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term153095 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153181 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term153095, term153095.getClass(), "type", 37);
        setField(term153095, term153095.getClass(), "first", term153181);
        term153538 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term153538, term153538.getClass(), "propertyTestFunctions", null);
        term153539 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153540 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term153539, term153539.getClass(), "number", 0.0);
        setIntField(term153539, term153539.getClass(), "type", 37);
        setField(term153539, term153539.getClass(), "next", null);
        setField(term153540, term153540.getClass(), "functionName", null);
        setBooleanField(term153540, term153540.getClass(), "itsNeedsActivation", false);
        setIntField(term153540, term153540.getClass(), "itsFunctionType", 0);
        setBooleanField(term153540, term153540.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term153540, term153540.getClass(), "encodedSourceStart", 0);
        setIntField(term153540, term153540.getClass(), "encodedSourceEnd", 0);
        setField(term153540, term153540.getClass(), "sourceName", null);
        setIntField(term153540, term153540.getClass(), "baseLineno", 0);
        setIntField(term153540, term153540.getClass(), "endLineno", 0);
        setField(term153540, term153540.getClass(), "functions", null);
        setField(term153540, term153540.getClass(), "regexps", null);
        setField(term153540, term153540.getClass(), "itsVariables", null);
        setField(term153540, term153540.getClass(), "itsConst", null);
        setField(term153540, term153540.getClass(), "itsVariableNames", null);
        setIntField(term153540, term153540.getClass(), "varStart", 0);
        setField(term153540, term153540.getClass(), "compilerData", null);
        setIntField(term153540, term153540.getClass(), "type", 0);
        setField(term153540, term153540.getClass(), "next", null);
        setField(term153540, term153540.getClass(), "first", null);
        setField(term153540, term153540.getClass(), "last", null);
        setField(term153540, term153540.getClass(), "propListHead", null);
        setIntField(term153540, term153540.getClass(), "sourcePosition", 0);
        setField(term153540, term153540.getClass(), "jsType", null);
        setField(term153540, term153540.getClass(), "parent", null);
        setField(term153539, term153539.getClass(), "first", term153540);
        setField(term153539, term153539.getClass(), "last", null);
        setField(term153539, term153539.getClass(), "propListHead", null);
        setIntField(term153539, term153539.getClass(), "sourcePosition", 0);
        setField(term153539, term153539.getClass(), "jsType", null);
        setField(term153539, term153539.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term153095;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term153003, args);
        assertTrue(recursiveEquals(term153003, term153538));
        assertTrue(recursiveEquals(term153095, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


