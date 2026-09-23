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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281100;
     Object term281186;
     Object term304138;
     Object term304139;
     Object term304072;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281100 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term281186 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term281272 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term281342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term281272, term281272.getClass(), "next", term281342);
        setField(term281186, term281186.getClass(), "first", term281272);
        setIntField(term281186, term281186.getClass(), "type", 12);
        term304138 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term304138, term304138.getClass(), "currentTraversal", null);
        term304139 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304140 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term304139, term304139.getClass(), "functionName", null);
        setBooleanField(term304139, term304139.getClass(), "itsNeedsActivation", false);
        setIntField(term304139, term304139.getClass(), "itsFunctionType", 0);
        setBooleanField(term304139, term304139.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304139, term304139.getClass(), "encodedSourceStart", 0);
        setIntField(term304139, term304139.getClass(), "encodedSourceEnd", 0);
        setField(term304139, term304139.getClass(), "sourceName", null);
        setIntField(term304139, term304139.getClass(), "baseLineno", 0);
        setIntField(term304139, term304139.getClass(), "endLineno", 0);
        setField(term304139, term304139.getClass(), "functions", null);
        setField(term304139, term304139.getClass(), "regexps", null);
        setField(term304139, term304139.getClass(), "itsVariables", null);
        setField(term304139, term304139.getClass(), "itsConst", null);
        setField(term304139, term304139.getClass(), "itsVariableNames", null);
        setIntField(term304139, term304139.getClass(), "varStart", 0);
        setField(term304139, term304139.getClass(), "compilerData", null);
        setIntField(term304139, term304139.getClass(), "type", 12);
        setField(term304139, term304139.getClass(), "next", null);
        setField(term304140, term304140.getClass(), "functionName", null);
        setBooleanField(term304140, term304140.getClass(), "itsNeedsActivation", false);
        setIntField(term304140, term304140.getClass(), "itsFunctionType", 0);
        setBooleanField(term304140, term304140.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304140, term304140.getClass(), "encodedSourceStart", 0);
        setIntField(term304140, term304140.getClass(), "encodedSourceEnd", 0);
        setField(term304140, term304140.getClass(), "sourceName", null);
        setIntField(term304140, term304140.getClass(), "baseLineno", 0);
        setIntField(term304140, term304140.getClass(), "endLineno", 0);
        setField(term304140, term304140.getClass(), "functions", null);
        setField(term304140, term304140.getClass(), "regexps", null);
        setField(term304140, term304140.getClass(), "itsVariables", null);
        setField(term304140, term304140.getClass(), "itsConst", null);
        setField(term304140, term304140.getClass(), "itsVariableNames", null);
        setIntField(term304140, term304140.getClass(), "varStart", 0);
        setField(term304140, term304140.getClass(), "compilerData", null);
        setIntField(term304140, term304140.getClass(), "type", 0);
        setIntField(term304141, term304141.getClass(), "type", 0);
        setField(term304141, term304141.getClass(), "next", null);
        setField(term304141, term304141.getClass(), "first", null);
        setField(term304141, term304141.getClass(), "last", null);
        setField(term304141, term304141.getClass(), "propListHead", null);
        setIntField(term304141, term304141.getClass(), "sourcePosition", 0);
        setField(term304141, term304141.getClass(), "jsType", null);
        setField(term304141, term304141.getClass(), "parent", null);
        setField(term304140, term304140.getClass(), "next", term304141);
        setField(term304140, term304140.getClass(), "first", null);
        setField(term304140, term304140.getClass(), "last", null);
        setField(term304140, term304140.getClass(), "propListHead", null);
        setIntField(term304140, term304140.getClass(), "sourcePosition", 0);
        setField(term304140, term304140.getClass(), "jsType", null);
        setField(term304140, term304140.getClass(), "parent", null);
        setField(term304139, term304139.getClass(), "first", term304140);
        setField(term304139, term304139.getClass(), "last", null);
        setField(term304139, term304139.getClass(), "propListHead", null);
        setIntField(term304139, term304139.getClass(), "sourcePosition", 0);
        setField(term304139, term304139.getClass(), "jsType", null);
        setField(term304139, term304139.getClass(), "parent", null);
        term304072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304082 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term304072, term304072.getClass(), "functionName", null);
        setBooleanField(term304072, term304072.getClass(), "itsNeedsActivation", false);
        setIntField(term304072, term304072.getClass(), "itsFunctionType", 0);
        setBooleanField(term304072, term304072.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304072, term304072.getClass(), "encodedSourceStart", 0);
        setIntField(term304072, term304072.getClass(), "encodedSourceEnd", 0);
        setField(term304072, term304072.getClass(), "sourceName", null);
        setIntField(term304072, term304072.getClass(), "baseLineno", 0);
        setIntField(term304072, term304072.getClass(), "endLineno", 0);
        setField(term304072, term304072.getClass(), "functions", null);
        setField(term304072, term304072.getClass(), "regexps", null);
        setField(term304072, term304072.getClass(), "itsVariables", null);
        setField(term304072, term304072.getClass(), "itsConst", null);
        setField(term304072, term304072.getClass(), "itsVariableNames", null);
        setIntField(term304072, term304072.getClass(), "varStart", 0);
        setField(term304072, term304072.getClass(), "compilerData", null);
        setIntField(term304072, term304072.getClass(), "type", 12);
        setField(term304072, term304072.getClass(), "next", null);
        setField(term304082, term304082.getClass(), "functionName", null);
        setBooleanField(term304082, term304082.getClass(), "itsNeedsActivation", false);
        setIntField(term304082, term304082.getClass(), "itsFunctionType", 0);
        setBooleanField(term304082, term304082.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304082, term304082.getClass(), "encodedSourceStart", 0);
        setIntField(term304082, term304082.getClass(), "encodedSourceEnd", 0);
        setField(term304082, term304082.getClass(), "sourceName", null);
        setIntField(term304082, term304082.getClass(), "baseLineno", 0);
        setIntField(term304082, term304082.getClass(), "endLineno", 0);
        setField(term304082, term304082.getClass(), "functions", null);
        setField(term304082, term304082.getClass(), "regexps", null);
        setField(term304082, term304082.getClass(), "itsVariables", null);
        setField(term304082, term304082.getClass(), "itsConst", null);
        setField(term304082, term304082.getClass(), "itsVariableNames", null);
        setIntField(term304082, term304082.getClass(), "varStart", 0);
        setField(term304082, term304082.getClass(), "compilerData", null);
        setIntField(term304082, term304082.getClass(), "type", 0);
        setIntField(term304092, term304092.getClass(), "type", 0);
        setField(term304092, term304092.getClass(), "next", null);
        setField(term304092, term304092.getClass(), "first", null);
        setField(term304092, term304092.getClass(), "last", null);
        setField(term304092, term304092.getClass(), "propListHead", null);
        setIntField(term304092, term304092.getClass(), "sourcePosition", 0);
        setField(term304092, term304092.getClass(), "jsType", null);
        setField(term304092, term304092.getClass(), "parent", null);
        setField(term304082, term304082.getClass(), "next", term304092);
        setField(term304082, term304082.getClass(), "first", null);
        setField(term304082, term304082.getClass(), "last", null);
        setField(term304082, term304082.getClass(), "propListHead", null);
        setIntField(term304082, term304082.getClass(), "sourcePosition", 0);
        setField(term304082, term304082.getClass(), "jsType", null);
        setField(term304082, term304082.getClass(), "parent", null);
        setField(term304072, term304072.getClass(), "first", term304082);
        setField(term304072, term304072.getClass(), "last", null);
        setField(term304072, term304072.getClass(), "propListHead", null);
        setIntField(term304072, term304072.getClass(), "sourcePosition", 0);
        setField(term304072, term304072.getClass(), "jsType", null);
        setField(term304072, term304072.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term281186;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term281100, args);
        assertTrue(recursiveEquals(term281100, term304138));
        assertTrue(recursiveEquals(term281186, term304139));
        assertTrue(recursiveEquals(retValue, term304072));
    }

};


