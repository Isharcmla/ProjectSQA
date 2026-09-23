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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128345;
     Object term128431;
     Object term128641;
     Object term128642;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128345 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term128431 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128517 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term128431, term128431.getClass(), "first", term128517);
        term128641 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term128641, term128641.getClass(), "propertyTestFunctions", null);
        term128642 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128643 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term128642, term128642.getClass(), "functionName", null);
        setBooleanField(term128642, term128642.getClass(), "itsNeedsActivation", false);
        setIntField(term128642, term128642.getClass(), "itsFunctionType", 0);
        setBooleanField(term128642, term128642.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term128642, term128642.getClass(), "encodedSourceStart", 0);
        setIntField(term128642, term128642.getClass(), "encodedSourceEnd", 0);
        setField(term128642, term128642.getClass(), "sourceName", null);
        setIntField(term128642, term128642.getClass(), "baseLineno", 0);
        setIntField(term128642, term128642.getClass(), "endLineno", 0);
        setField(term128642, term128642.getClass(), "functions", null);
        setField(term128642, term128642.getClass(), "regexps", null);
        setField(term128642, term128642.getClass(), "itsVariables", null);
        setField(term128642, term128642.getClass(), "itsConst", null);
        setField(term128642, term128642.getClass(), "itsVariableNames", null);
        setIntField(term128642, term128642.getClass(), "varStart", 0);
        setField(term128642, term128642.getClass(), "compilerData", null);
        setIntField(term128642, term128642.getClass(), "type", 0);
        setField(term128642, term128642.getClass(), "next", null);
        setField(term128643, term128643.getClass(), "functionName", null);
        setBooleanField(term128643, term128643.getClass(), "itsNeedsActivation", false);
        setIntField(term128643, term128643.getClass(), "itsFunctionType", 0);
        setBooleanField(term128643, term128643.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term128643, term128643.getClass(), "encodedSourceStart", 0);
        setIntField(term128643, term128643.getClass(), "encodedSourceEnd", 0);
        setField(term128643, term128643.getClass(), "sourceName", null);
        setIntField(term128643, term128643.getClass(), "baseLineno", 0);
        setIntField(term128643, term128643.getClass(), "endLineno", 0);
        setField(term128643, term128643.getClass(), "functions", null);
        setField(term128643, term128643.getClass(), "regexps", null);
        setField(term128643, term128643.getClass(), "itsVariables", null);
        setField(term128643, term128643.getClass(), "itsConst", null);
        setField(term128643, term128643.getClass(), "itsVariableNames", null);
        setIntField(term128643, term128643.getClass(), "varStart", 0);
        setField(term128643, term128643.getClass(), "compilerData", null);
        setIntField(term128643, term128643.getClass(), "type", 0);
        setField(term128643, term128643.getClass(), "next", null);
        setField(term128643, term128643.getClass(), "first", null);
        setField(term128643, term128643.getClass(), "last", null);
        setField(term128643, term128643.getClass(), "propListHead", null);
        setIntField(term128643, term128643.getClass(), "sourcePosition", 0);
        setField(term128643, term128643.getClass(), "jsType", null);
        setField(term128643, term128643.getClass(), "parent", null);
        setField(term128642, term128642.getClass(), "first", term128643);
        setField(term128642, term128642.getClass(), "last", null);
        setField(term128642, term128642.getClass(), "propListHead", null);
        setIntField(term128642, term128642.getClass(), "sourcePosition", 0);
        setField(term128642, term128642.getClass(), "jsType", null);
        setField(term128642, term128642.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128431;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term128345, args);
        assertTrue(recursiveEquals(term128345, term128641));
        assertTrue(recursiveEquals(term128431, term128642));
        assertTrue(recursiveEquals(retValue, null));
    }

};


