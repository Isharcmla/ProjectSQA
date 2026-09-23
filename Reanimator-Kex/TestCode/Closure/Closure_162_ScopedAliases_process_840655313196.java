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

public class ScopedAliases_process_840655313196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110637;
     Object term110707;
     Object term111132;
     Object term111133;

    public ScopedAliases_process_840655313196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110637 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term110637, term110637.getClass(), "compiler", null);
        term110707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110793 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term110707, term110707.getClass(), "type", 0);
        setIntField(term110793, term110793.getClass(), "type", 0);
        setField(term110793, term110793.getClass(), "parent", null);
        setField(term110707, term110707.getClass(), "parent", term110793);
        term111132 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term111132, term111132.getClass(), "compiler", null);
        setField(term111132, term111132.getClass(), "preprocessorSymbolTable", null);
        setField(term111132, term111132.getClass(), "transformationHandler", null);
        term111133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111134 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term111133, term111133.getClass(), "type", 0);
        setField(term111133, term111133.getClass(), "next", null);
        setField(term111133, term111133.getClass(), "first", null);
        setField(term111133, term111133.getClass(), "last", null);
        setField(term111133, term111133.getClass(), "propListHead", null);
        setIntField(term111133, term111133.getClass(), "sourcePosition", 0);
        setField(term111133, term111133.getClass(), "jsType", null);
        setField(term111134, term111134.getClass(), "functionName", null);
        setBooleanField(term111134, term111134.getClass(), "itsNeedsActivation", false);
        setIntField(term111134, term111134.getClass(), "itsFunctionType", 0);
        setBooleanField(term111134, term111134.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term111134, term111134.getClass(), "encodedSourceStart", 0);
        setIntField(term111134, term111134.getClass(), "encodedSourceEnd", 0);
        setField(term111134, term111134.getClass(), "sourceName", null);
        setIntField(term111134, term111134.getClass(), "baseLineno", 0);
        setIntField(term111134, term111134.getClass(), "endLineno", 0);
        setField(term111134, term111134.getClass(), "functions", null);
        setField(term111134, term111134.getClass(), "regexps", null);
        setField(term111134, term111134.getClass(), "itsVariables", null);
        setField(term111134, term111134.getClass(), "itsConst", null);
        setField(term111134, term111134.getClass(), "itsVariableNames", null);
        setIntField(term111134, term111134.getClass(), "varStart", 0);
        setField(term111134, term111134.getClass(), "compilerData", null);
        setIntField(term111134, term111134.getClass(), "type", 0);
        setField(term111134, term111134.getClass(), "next", null);
        setField(term111134, term111134.getClass(), "first", null);
        setField(term111134, term111134.getClass(), "last", null);
        setField(term111134, term111134.getClass(), "propListHead", null);
        setIntField(term111134, term111134.getClass(), "sourcePosition", 0);
        setField(term111134, term111134.getClass(), "jsType", null);
        setField(term111134, term111134.getClass(), "parent", null);
        setField(term111133, term111133.getClass(), "parent", term111134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term110707;
        callMethod(klass, "process", argTypes, term110637, args);
        assertTrue(recursiveEquals(term110637, term111132));
        assertTrue(recursiveEquals(term110707, null));
    }

};


