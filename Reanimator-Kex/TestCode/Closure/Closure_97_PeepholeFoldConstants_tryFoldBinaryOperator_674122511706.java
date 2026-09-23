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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181604;
     Object term181690;
     Object term181972;
     Object term181973;
     Object term181884;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181604 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term181690 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term181776 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term181868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term181776, term181776.getClass(), "next", term181868);
        setIntField(term181776, term181776.getClass(), "type", 0);
        setField(term181690, term181690.getClass(), "first", term181776);
        setIntField(term181690, term181690.getClass(), "type", 100);
        setField(term181690, term181690.getClass(), "parent", null);
        term181972 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term181972, term181972.getClass(), "currentTraversal", null);
        term181973 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term181974 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term181975 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term181973, term181973.getClass(), "functionName", null);
        setBooleanField(term181973, term181973.getClass(), "itsNeedsActivation", false);
        setIntField(term181973, term181973.getClass(), "itsFunctionType", 0);
        setBooleanField(term181973, term181973.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term181973, term181973.getClass(), "encodedSourceStart", 0);
        setIntField(term181973, term181973.getClass(), "encodedSourceEnd", 0);
        setField(term181973, term181973.getClass(), "sourceName", null);
        setIntField(term181973, term181973.getClass(), "baseLineno", 0);
        setIntField(term181973, term181973.getClass(), "endLineno", 0);
        setField(term181973, term181973.getClass(), "functions", null);
        setField(term181973, term181973.getClass(), "regexps", null);
        setField(term181973, term181973.getClass(), "itsVariables", null);
        setField(term181973, term181973.getClass(), "itsConst", null);
        setField(term181973, term181973.getClass(), "itsVariableNames", null);
        setIntField(term181973, term181973.getClass(), "varStart", 0);
        setField(term181973, term181973.getClass(), "compilerData", null);
        setIntField(term181973, term181973.getClass(), "type", 100);
        setField(term181973, term181973.getClass(), "next", null);
        setField(term181974, term181974.getClass(), "functionName", null);
        setBooleanField(term181974, term181974.getClass(), "itsNeedsActivation", false);
        setIntField(term181974, term181974.getClass(), "itsFunctionType", 0);
        setBooleanField(term181974, term181974.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term181974, term181974.getClass(), "encodedSourceStart", 0);
        setIntField(term181974, term181974.getClass(), "encodedSourceEnd", 0);
        setField(term181974, term181974.getClass(), "sourceName", null);
        setIntField(term181974, term181974.getClass(), "baseLineno", 0);
        setIntField(term181974, term181974.getClass(), "endLineno", 0);
        setField(term181974, term181974.getClass(), "functions", null);
        setField(term181974, term181974.getClass(), "regexps", null);
        setField(term181974, term181974.getClass(), "itsVariables", null);
        setField(term181974, term181974.getClass(), "itsConst", null);
        setField(term181974, term181974.getClass(), "itsVariableNames", null);
        setIntField(term181974, term181974.getClass(), "varStart", 0);
        setField(term181974, term181974.getClass(), "compilerData", null);
        setIntField(term181974, term181974.getClass(), "type", 0);
        setDoubleField(term181975, term181975.getClass(), "number", 0.0);
        setIntField(term181975, term181975.getClass(), "type", 0);
        setField(term181975, term181975.getClass(), "next", null);
        setField(term181975, term181975.getClass(), "first", null);
        setField(term181975, term181975.getClass(), "last", null);
        setField(term181975, term181975.getClass(), "propListHead", null);
        setIntField(term181975, term181975.getClass(), "sourcePosition", 0);
        setField(term181975, term181975.getClass(), "jsType", null);
        setField(term181975, term181975.getClass(), "parent", null);
        setField(term181974, term181974.getClass(), "next", term181975);
        setField(term181974, term181974.getClass(), "first", null);
        setField(term181974, term181974.getClass(), "last", null);
        setField(term181974, term181974.getClass(), "propListHead", null);
        setIntField(term181974, term181974.getClass(), "sourcePosition", 0);
        setField(term181974, term181974.getClass(), "jsType", null);
        setField(term181974, term181974.getClass(), "parent", null);
        setField(term181973, term181973.getClass(), "first", term181974);
        setField(term181973, term181973.getClass(), "last", null);
        setField(term181973, term181973.getClass(), "propListHead", null);
        setIntField(term181973, term181973.getClass(), "sourcePosition", 0);
        setField(term181973, term181973.getClass(), "jsType", null);
        setField(term181973, term181973.getClass(), "parent", null);
        term181884 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term181894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term181904 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term181884, term181884.getClass(), "functionName", null);
        setBooleanField(term181884, term181884.getClass(), "itsNeedsActivation", false);
        setIntField(term181884, term181884.getClass(), "itsFunctionType", 0);
        setBooleanField(term181884, term181884.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term181884, term181884.getClass(), "encodedSourceStart", 0);
        setIntField(term181884, term181884.getClass(), "encodedSourceEnd", 0);
        setField(term181884, term181884.getClass(), "sourceName", null);
        setIntField(term181884, term181884.getClass(), "baseLineno", 0);
        setIntField(term181884, term181884.getClass(), "endLineno", 0);
        setField(term181884, term181884.getClass(), "functions", null);
        setField(term181884, term181884.getClass(), "regexps", null);
        setField(term181884, term181884.getClass(), "itsVariables", null);
        setField(term181884, term181884.getClass(), "itsConst", null);
        setField(term181884, term181884.getClass(), "itsVariableNames", null);
        setIntField(term181884, term181884.getClass(), "varStart", 0);
        setField(term181884, term181884.getClass(), "compilerData", null);
        setIntField(term181884, term181884.getClass(), "type", 100);
        setField(term181884, term181884.getClass(), "next", null);
        setField(term181894, term181894.getClass(), "functionName", null);
        setBooleanField(term181894, term181894.getClass(), "itsNeedsActivation", false);
        setIntField(term181894, term181894.getClass(), "itsFunctionType", 0);
        setBooleanField(term181894, term181894.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term181894, term181894.getClass(), "encodedSourceStart", 0);
        setIntField(term181894, term181894.getClass(), "encodedSourceEnd", 0);
        setField(term181894, term181894.getClass(), "sourceName", null);
        setIntField(term181894, term181894.getClass(), "baseLineno", 0);
        setIntField(term181894, term181894.getClass(), "endLineno", 0);
        setField(term181894, term181894.getClass(), "functions", null);
        setField(term181894, term181894.getClass(), "regexps", null);
        setField(term181894, term181894.getClass(), "itsVariables", null);
        setField(term181894, term181894.getClass(), "itsConst", null);
        setField(term181894, term181894.getClass(), "itsVariableNames", null);
        setIntField(term181894, term181894.getClass(), "varStart", 0);
        setField(term181894, term181894.getClass(), "compilerData", null);
        setIntField(term181894, term181894.getClass(), "type", 0);
        setDoubleField(term181904, term181904.getClass(), "number", 0.0);
        setIntField(term181904, term181904.getClass(), "type", 0);
        setField(term181904, term181904.getClass(), "next", null);
        setField(term181904, term181904.getClass(), "first", null);
        setField(term181904, term181904.getClass(), "last", null);
        setField(term181904, term181904.getClass(), "propListHead", null);
        setIntField(term181904, term181904.getClass(), "sourcePosition", 0);
        setField(term181904, term181904.getClass(), "jsType", null);
        setField(term181904, term181904.getClass(), "parent", null);
        setField(term181894, term181894.getClass(), "next", term181904);
        setField(term181894, term181894.getClass(), "first", null);
        setField(term181894, term181894.getClass(), "last", null);
        setField(term181894, term181894.getClass(), "propListHead", null);
        setIntField(term181894, term181894.getClass(), "sourcePosition", 0);
        setField(term181894, term181894.getClass(), "jsType", null);
        setField(term181894, term181894.getClass(), "parent", null);
        setField(term181884, term181884.getClass(), "first", term181894);
        setField(term181884, term181884.getClass(), "last", null);
        setField(term181884, term181884.getClass(), "propListHead", null);
        setIntField(term181884, term181884.getClass(), "sourcePosition", 0);
        setField(term181884, term181884.getClass(), "jsType", null);
        setField(term181884, term181884.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term181690;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term181604, args);
        assertTrue(recursiveEquals(term181604, term181972));
        assertTrue(recursiveEquals(term181690, term181973));
        assertTrue(recursiveEquals(retValue, term181884));
    }

};


