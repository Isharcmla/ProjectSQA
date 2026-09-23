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

public class PeepholeFoldConstants_tryFoldComparison_8484431791314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435655;
     Object term435741;
     Object term435827;
     Object term435919;
     Object term435990;
     Object term435991;
     Object term435992;
     Object term435993;
     Object term435963;

    public PeepholeFoldConstants_tryFoldComparison_8484431791314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435655 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term435741 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term435741, term435741.getClass(), "type", 16);
        term435827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term435827, term435827.getClass(), "type", 16);
        term435919 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term435990 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term435990, term435990.getClass(), "currentTraversal", null);
        term435991 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term435991, term435991.getClass(), "functionName", null);
        setBooleanField(term435991, term435991.getClass(), "itsNeedsActivation", false);
        setIntField(term435991, term435991.getClass(), "itsFunctionType", 0);
        setBooleanField(term435991, term435991.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term435991, term435991.getClass(), "encodedSourceStart", 0);
        setIntField(term435991, term435991.getClass(), "encodedSourceEnd", 0);
        setField(term435991, term435991.getClass(), "sourceName", null);
        setIntField(term435991, term435991.getClass(), "baseLineno", 0);
        setIntField(term435991, term435991.getClass(), "endLineno", 0);
        setField(term435991, term435991.getClass(), "functions", null);
        setField(term435991, term435991.getClass(), "regexps", null);
        setField(term435991, term435991.getClass(), "itsVariables", null);
        setField(term435991, term435991.getClass(), "itsConst", null);
        setField(term435991, term435991.getClass(), "itsVariableNames", null);
        setIntField(term435991, term435991.getClass(), "varStart", 0);
        setField(term435991, term435991.getClass(), "compilerData", null);
        setIntField(term435991, term435991.getClass(), "type", 16);
        setField(term435991, term435991.getClass(), "next", null);
        setField(term435991, term435991.getClass(), "first", null);
        setField(term435991, term435991.getClass(), "last", null);
        setField(term435991, term435991.getClass(), "propListHead", null);
        setIntField(term435991, term435991.getClass(), "sourcePosition", 0);
        setField(term435991, term435991.getClass(), "jsType", null);
        setField(term435991, term435991.getClass(), "parent", null);
        term435992 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term435992, term435992.getClass(), "functionName", null);
        setBooleanField(term435992, term435992.getClass(), "itsNeedsActivation", false);
        setIntField(term435992, term435992.getClass(), "itsFunctionType", 0);
        setBooleanField(term435992, term435992.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term435992, term435992.getClass(), "encodedSourceStart", 0);
        setIntField(term435992, term435992.getClass(), "encodedSourceEnd", 0);
        setField(term435992, term435992.getClass(), "sourceName", null);
        setIntField(term435992, term435992.getClass(), "baseLineno", 0);
        setIntField(term435992, term435992.getClass(), "endLineno", 0);
        setField(term435992, term435992.getClass(), "functions", null);
        setField(term435992, term435992.getClass(), "regexps", null);
        setField(term435992, term435992.getClass(), "itsVariables", null);
        setField(term435992, term435992.getClass(), "itsConst", null);
        setField(term435992, term435992.getClass(), "itsVariableNames", null);
        setIntField(term435992, term435992.getClass(), "varStart", 0);
        setField(term435992, term435992.getClass(), "compilerData", null);
        setIntField(term435992, term435992.getClass(), "type", 16);
        setField(term435992, term435992.getClass(), "next", null);
        setField(term435992, term435992.getClass(), "first", null);
        setField(term435992, term435992.getClass(), "last", null);
        setField(term435992, term435992.getClass(), "propListHead", null);
        setIntField(term435992, term435992.getClass(), "sourcePosition", 0);
        setField(term435992, term435992.getClass(), "jsType", null);
        setField(term435992, term435992.getClass(), "parent", null);
        term435993 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term435993, term435993.getClass(), "number", 0.0);
        setIntField(term435993, term435993.getClass(), "type", 0);
        setField(term435993, term435993.getClass(), "next", null);
        setField(term435993, term435993.getClass(), "first", null);
        setField(term435993, term435993.getClass(), "last", null);
        setField(term435993, term435993.getClass(), "propListHead", null);
        setIntField(term435993, term435993.getClass(), "sourcePosition", 0);
        setField(term435993, term435993.getClass(), "jsType", null);
        setField(term435993, term435993.getClass(), "parent", null);
        term435963 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term435963, term435963.getClass(), "functionName", null);
        setBooleanField(term435963, term435963.getClass(), "itsNeedsActivation", false);
        setIntField(term435963, term435963.getClass(), "itsFunctionType", 0);
        setBooleanField(term435963, term435963.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term435963, term435963.getClass(), "encodedSourceStart", 0);
        setIntField(term435963, term435963.getClass(), "encodedSourceEnd", 0);
        setField(term435963, term435963.getClass(), "sourceName", null);
        setIntField(term435963, term435963.getClass(), "baseLineno", 0);
        setIntField(term435963, term435963.getClass(), "endLineno", 0);
        setField(term435963, term435963.getClass(), "functions", null);
        setField(term435963, term435963.getClass(), "regexps", null);
        setField(term435963, term435963.getClass(), "itsVariables", null);
        setField(term435963, term435963.getClass(), "itsConst", null);
        setField(term435963, term435963.getClass(), "itsVariableNames", null);
        setIntField(term435963, term435963.getClass(), "varStart", 0);
        setField(term435963, term435963.getClass(), "compilerData", null);
        setIntField(term435963, term435963.getClass(), "type", 16);
        setField(term435963, term435963.getClass(), "next", null);
        setField(term435963, term435963.getClass(), "first", null);
        setField(term435963, term435963.getClass(), "last", null);
        setField(term435963, term435963.getClass(), "propListHead", null);
        setIntField(term435963, term435963.getClass(), "sourcePosition", 0);
        setField(term435963, term435963.getClass(), "jsType", null);
        setField(term435963, term435963.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term435741;
        args[1] = term435827;
        args[2] = term435919;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term435655, args);
        assertTrue(recursiveEquals(term435655, term435990));
        assertTrue(recursiveEquals(term435741, term435991));
        assertTrue(recursiveEquals(term435827, term435992));
        assertTrue(recursiveEquals(term435919, term435993));
        assertTrue(recursiveEquals(retValue, term435963));
    }

};


