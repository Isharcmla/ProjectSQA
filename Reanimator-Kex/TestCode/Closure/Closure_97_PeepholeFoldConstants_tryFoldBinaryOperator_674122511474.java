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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109675;
     Object term109767;
     Object term110166;
     Object term110167;
     Object term110085;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109675 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term109767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term109859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term109945 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term109859, term109859.getClass(), "next", term109945);
        setIntField(term109859, term109859.getClass(), "type", 0);
        setField(term109767, term109767.getClass(), "first", term109859);
        setIntField(term109767, term109767.getClass(), "type", 100);
        setField(term109767, term109767.getClass(), "parent", null);
        term110166 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term110166, term110166.getClass(), "currentTraversal", null);
        term110167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110169 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term110167, term110167.getClass(), "number", 0.0);
        setIntField(term110167, term110167.getClass(), "type", 100);
        setField(term110167, term110167.getClass(), "next", null);
        setDoubleField(term110168, term110168.getClass(), "number", 0.0);
        setIntField(term110168, term110168.getClass(), "type", 0);
        setField(term110169, term110169.getClass(), "functionName", null);
        setBooleanField(term110169, term110169.getClass(), "itsNeedsActivation", false);
        setIntField(term110169, term110169.getClass(), "itsFunctionType", 0);
        setBooleanField(term110169, term110169.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term110169, term110169.getClass(), "encodedSourceStart", 0);
        setIntField(term110169, term110169.getClass(), "encodedSourceEnd", 0);
        setField(term110169, term110169.getClass(), "sourceName", null);
        setIntField(term110169, term110169.getClass(), "baseLineno", 0);
        setIntField(term110169, term110169.getClass(), "endLineno", 0);
        setField(term110169, term110169.getClass(), "functions", null);
        setField(term110169, term110169.getClass(), "regexps", null);
        setField(term110169, term110169.getClass(), "itsVariables", null);
        setField(term110169, term110169.getClass(), "itsConst", null);
        setField(term110169, term110169.getClass(), "itsVariableNames", null);
        setIntField(term110169, term110169.getClass(), "varStart", 0);
        setField(term110169, term110169.getClass(), "compilerData", null);
        setIntField(term110169, term110169.getClass(), "type", 0);
        setField(term110169, term110169.getClass(), "next", null);
        setField(term110169, term110169.getClass(), "first", null);
        setField(term110169, term110169.getClass(), "last", null);
        setField(term110169, term110169.getClass(), "propListHead", null);
        setIntField(term110169, term110169.getClass(), "sourcePosition", 0);
        setField(term110169, term110169.getClass(), "jsType", null);
        setField(term110169, term110169.getClass(), "parent", null);
        setField(term110168, term110168.getClass(), "next", term110169);
        setField(term110168, term110168.getClass(), "first", null);
        setField(term110168, term110168.getClass(), "last", null);
        setField(term110168, term110168.getClass(), "propListHead", null);
        setIntField(term110168, term110168.getClass(), "sourcePosition", 0);
        setField(term110168, term110168.getClass(), "jsType", null);
        setField(term110168, term110168.getClass(), "parent", null);
        setField(term110167, term110167.getClass(), "first", term110168);
        setField(term110167, term110167.getClass(), "last", null);
        setField(term110167, term110167.getClass(), "propListHead", null);
        setIntField(term110167, term110167.getClass(), "sourcePosition", 0);
        setField(term110167, term110167.getClass(), "jsType", null);
        setField(term110167, term110167.getClass(), "parent", null);
        term110085 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110091 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term110085, term110085.getClass(), "number", 0.0);
        setIntField(term110085, term110085.getClass(), "type", 100);
        setField(term110085, term110085.getClass(), "next", null);
        setDoubleField(term110088, term110088.getClass(), "number", 0.0);
        setIntField(term110088, term110088.getClass(), "type", 0);
        setField(term110091, term110091.getClass(), "functionName", null);
        setBooleanField(term110091, term110091.getClass(), "itsNeedsActivation", false);
        setIntField(term110091, term110091.getClass(), "itsFunctionType", 0);
        setBooleanField(term110091, term110091.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term110091, term110091.getClass(), "encodedSourceStart", 0);
        setIntField(term110091, term110091.getClass(), "encodedSourceEnd", 0);
        setField(term110091, term110091.getClass(), "sourceName", null);
        setIntField(term110091, term110091.getClass(), "baseLineno", 0);
        setIntField(term110091, term110091.getClass(), "endLineno", 0);
        setField(term110091, term110091.getClass(), "functions", null);
        setField(term110091, term110091.getClass(), "regexps", null);
        setField(term110091, term110091.getClass(), "itsVariables", null);
        setField(term110091, term110091.getClass(), "itsConst", null);
        setField(term110091, term110091.getClass(), "itsVariableNames", null);
        setIntField(term110091, term110091.getClass(), "varStart", 0);
        setField(term110091, term110091.getClass(), "compilerData", null);
        setIntField(term110091, term110091.getClass(), "type", 0);
        setField(term110091, term110091.getClass(), "next", null);
        setField(term110091, term110091.getClass(), "first", null);
        setField(term110091, term110091.getClass(), "last", null);
        setField(term110091, term110091.getClass(), "propListHead", null);
        setIntField(term110091, term110091.getClass(), "sourcePosition", 0);
        setField(term110091, term110091.getClass(), "jsType", null);
        setField(term110091, term110091.getClass(), "parent", null);
        setField(term110088, term110088.getClass(), "next", term110091);
        setField(term110088, term110088.getClass(), "first", null);
        setField(term110088, term110088.getClass(), "last", null);
        setField(term110088, term110088.getClass(), "propListHead", null);
        setIntField(term110088, term110088.getClass(), "sourcePosition", 0);
        setField(term110088, term110088.getClass(), "jsType", null);
        setField(term110088, term110088.getClass(), "parent", null);
        setField(term110085, term110085.getClass(), "first", term110088);
        setField(term110085, term110085.getClass(), "last", null);
        setField(term110085, term110085.getClass(), "propListHead", null);
        setIntField(term110085, term110085.getClass(), "sourcePosition", 0);
        setField(term110085, term110085.getClass(), "jsType", null);
        setField(term110085, term110085.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term109767;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term109675, args);
        assertTrue(recursiveEquals(term109675, term110166));
        assertTrue(recursiveEquals(term109767, term110167));
        assertTrue(recursiveEquals(retValue, term110085));
    }

};


