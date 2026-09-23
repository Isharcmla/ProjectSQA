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

public class PeepholeFoldConstants_tryFoldComparison_848443179168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32447;
     Object term32533;
     Object term32619;
     Object term32663;
     Object term32664;
     Object term32665;
     Object term32648;

    public PeepholeFoldConstants_tryFoldComparison_848443179168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32447 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term32533 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term32619 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term32619, term32619.getClass(), "type", 0);
        term32663 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term32663, term32663.getClass(), "currentTraversal", null);
        term32664 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32664, term32664.getClass(), "functionName", null);
        setBooleanField(term32664, term32664.getClass(), "itsNeedsActivation", false);
        setIntField(term32664, term32664.getClass(), "itsFunctionType", 0);
        setBooleanField(term32664, term32664.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32664, term32664.getClass(), "encodedSourceStart", 0);
        setIntField(term32664, term32664.getClass(), "encodedSourceEnd", 0);
        setField(term32664, term32664.getClass(), "sourceName", null);
        setIntField(term32664, term32664.getClass(), "baseLineno", 0);
        setIntField(term32664, term32664.getClass(), "endLineno", 0);
        setField(term32664, term32664.getClass(), "functions", null);
        setField(term32664, term32664.getClass(), "regexps", null);
        setField(term32664, term32664.getClass(), "itsVariables", null);
        setField(term32664, term32664.getClass(), "itsConst", null);
        setField(term32664, term32664.getClass(), "itsVariableNames", null);
        setIntField(term32664, term32664.getClass(), "varStart", 0);
        setField(term32664, term32664.getClass(), "compilerData", null);
        setIntField(term32664, term32664.getClass(), "type", 0);
        setField(term32664, term32664.getClass(), "next", null);
        setField(term32664, term32664.getClass(), "first", null);
        setField(term32664, term32664.getClass(), "last", null);
        setField(term32664, term32664.getClass(), "propListHead", null);
        setIntField(term32664, term32664.getClass(), "sourcePosition", 0);
        setField(term32664, term32664.getClass(), "jsType", null);
        setField(term32664, term32664.getClass(), "parent", null);
        term32665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32665, term32665.getClass(), "functionName", null);
        setBooleanField(term32665, term32665.getClass(), "itsNeedsActivation", false);
        setIntField(term32665, term32665.getClass(), "itsFunctionType", 0);
        setBooleanField(term32665, term32665.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32665, term32665.getClass(), "encodedSourceStart", 0);
        setIntField(term32665, term32665.getClass(), "encodedSourceEnd", 0);
        setField(term32665, term32665.getClass(), "sourceName", null);
        setIntField(term32665, term32665.getClass(), "baseLineno", 0);
        setIntField(term32665, term32665.getClass(), "endLineno", 0);
        setField(term32665, term32665.getClass(), "functions", null);
        setField(term32665, term32665.getClass(), "regexps", null);
        setField(term32665, term32665.getClass(), "itsVariables", null);
        setField(term32665, term32665.getClass(), "itsConst", null);
        setField(term32665, term32665.getClass(), "itsVariableNames", null);
        setIntField(term32665, term32665.getClass(), "varStart", 0);
        setField(term32665, term32665.getClass(), "compilerData", null);
        setIntField(term32665, term32665.getClass(), "type", 0);
        setField(term32665, term32665.getClass(), "next", null);
        setField(term32665, term32665.getClass(), "first", null);
        setField(term32665, term32665.getClass(), "last", null);
        setField(term32665, term32665.getClass(), "propListHead", null);
        setIntField(term32665, term32665.getClass(), "sourcePosition", 0);
        setField(term32665, term32665.getClass(), "jsType", null);
        setField(term32665, term32665.getClass(), "parent", null);
        term32648 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32648, term32648.getClass(), "functionName", null);
        setBooleanField(term32648, term32648.getClass(), "itsNeedsActivation", false);
        setIntField(term32648, term32648.getClass(), "itsFunctionType", 0);
        setBooleanField(term32648, term32648.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32648, term32648.getClass(), "encodedSourceStart", 0);
        setIntField(term32648, term32648.getClass(), "encodedSourceEnd", 0);
        setField(term32648, term32648.getClass(), "sourceName", null);
        setIntField(term32648, term32648.getClass(), "baseLineno", 0);
        setIntField(term32648, term32648.getClass(), "endLineno", 0);
        setField(term32648, term32648.getClass(), "functions", null);
        setField(term32648, term32648.getClass(), "regexps", null);
        setField(term32648, term32648.getClass(), "itsVariables", null);
        setField(term32648, term32648.getClass(), "itsConst", null);
        setField(term32648, term32648.getClass(), "itsVariableNames", null);
        setIntField(term32648, term32648.getClass(), "varStart", 0);
        setField(term32648, term32648.getClass(), "compilerData", null);
        setIntField(term32648, term32648.getClass(), "type", 0);
        setField(term32648, term32648.getClass(), "next", null);
        setField(term32648, term32648.getClass(), "first", null);
        setField(term32648, term32648.getClass(), "last", null);
        setField(term32648, term32648.getClass(), "propListHead", null);
        setIntField(term32648, term32648.getClass(), "sourcePosition", 0);
        setField(term32648, term32648.getClass(), "jsType", null);
        setField(term32648, term32648.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term32533;
        args[1] = term32619;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term32447, args);
        assertTrue(recursiveEquals(term32447, term32663));
        assertTrue(recursiveEquals(term32533, term32664));
        assertTrue(recursiveEquals(term32619, term32665));
        assertTrue(recursiveEquals(retValue, term32648));
    }

};


