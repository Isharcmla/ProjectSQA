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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97123;
     Object term97209;
     Object term97675;
     Object term97676;
     Object term97616;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97123 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term97209 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97295 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term97295, term97295.getClass(), "next", term97365);
        setField(term97209, term97209.getClass(), "first", term97295);
        setIntField(term97209, term97209.getClass(), "type", 20);
        term97675 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term97675, term97675.getClass(), "currentTraversal", null);
        term97676 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97677 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term97676, term97676.getClass(), "functionName", null);
        setBooleanField(term97676, term97676.getClass(), "itsNeedsActivation", false);
        setIntField(term97676, term97676.getClass(), "itsFunctionType", 0);
        setBooleanField(term97676, term97676.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term97676, term97676.getClass(), "encodedSourceStart", 0);
        setIntField(term97676, term97676.getClass(), "encodedSourceEnd", 0);
        setField(term97676, term97676.getClass(), "sourceName", null);
        setIntField(term97676, term97676.getClass(), "baseLineno", 0);
        setIntField(term97676, term97676.getClass(), "endLineno", 0);
        setField(term97676, term97676.getClass(), "functions", null);
        setField(term97676, term97676.getClass(), "regexps", null);
        setField(term97676, term97676.getClass(), "itsVariables", null);
        setField(term97676, term97676.getClass(), "itsConst", null);
        setField(term97676, term97676.getClass(), "itsVariableNames", null);
        setIntField(term97676, term97676.getClass(), "varStart", 0);
        setField(term97676, term97676.getClass(), "compilerData", null);
        setIntField(term97676, term97676.getClass(), "type", 20);
        setField(term97676, term97676.getClass(), "next", null);
        setField(term97677, term97677.getClass(), "functionName", null);
        setBooleanField(term97677, term97677.getClass(), "itsNeedsActivation", false);
        setIntField(term97677, term97677.getClass(), "itsFunctionType", 0);
        setBooleanField(term97677, term97677.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term97677, term97677.getClass(), "encodedSourceStart", 0);
        setIntField(term97677, term97677.getClass(), "encodedSourceEnd", 0);
        setField(term97677, term97677.getClass(), "sourceName", null);
        setIntField(term97677, term97677.getClass(), "baseLineno", 0);
        setIntField(term97677, term97677.getClass(), "endLineno", 0);
        setField(term97677, term97677.getClass(), "functions", null);
        setField(term97677, term97677.getClass(), "regexps", null);
        setField(term97677, term97677.getClass(), "itsVariables", null);
        setField(term97677, term97677.getClass(), "itsConst", null);
        setField(term97677, term97677.getClass(), "itsVariableNames", null);
        setIntField(term97677, term97677.getClass(), "varStart", 0);
        setField(term97677, term97677.getClass(), "compilerData", null);
        setIntField(term97677, term97677.getClass(), "type", 0);
        setIntField(term97678, term97678.getClass(), "type", 0);
        setField(term97678, term97678.getClass(), "next", null);
        setField(term97678, term97678.getClass(), "first", null);
        setField(term97678, term97678.getClass(), "last", null);
        setField(term97678, term97678.getClass(), "propListHead", null);
        setIntField(term97678, term97678.getClass(), "sourcePosition", 0);
        setField(term97678, term97678.getClass(), "jsType", null);
        setField(term97678, term97678.getClass(), "parent", null);
        setField(term97677, term97677.getClass(), "next", term97678);
        setField(term97677, term97677.getClass(), "first", null);
        setField(term97677, term97677.getClass(), "last", null);
        setField(term97677, term97677.getClass(), "propListHead", null);
        setIntField(term97677, term97677.getClass(), "sourcePosition", 0);
        setField(term97677, term97677.getClass(), "jsType", null);
        setField(term97677, term97677.getClass(), "parent", null);
        setField(term97676, term97676.getClass(), "first", term97677);
        setField(term97676, term97676.getClass(), "last", null);
        setField(term97676, term97676.getClass(), "propListHead", null);
        setIntField(term97676, term97676.getClass(), "sourcePosition", 0);
        setField(term97676, term97676.getClass(), "jsType", null);
        setField(term97676, term97676.getClass(), "parent", null);
        term97616 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term97616, term97616.getClass(), "functionName", null);
        setBooleanField(term97616, term97616.getClass(), "itsNeedsActivation", false);
        setIntField(term97616, term97616.getClass(), "itsFunctionType", 0);
        setBooleanField(term97616, term97616.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term97616, term97616.getClass(), "encodedSourceStart", 0);
        setIntField(term97616, term97616.getClass(), "encodedSourceEnd", 0);
        setField(term97616, term97616.getClass(), "sourceName", null);
        setIntField(term97616, term97616.getClass(), "baseLineno", 0);
        setIntField(term97616, term97616.getClass(), "endLineno", 0);
        setField(term97616, term97616.getClass(), "functions", null);
        setField(term97616, term97616.getClass(), "regexps", null);
        setField(term97616, term97616.getClass(), "itsVariables", null);
        setField(term97616, term97616.getClass(), "itsConst", null);
        setField(term97616, term97616.getClass(), "itsVariableNames", null);
        setIntField(term97616, term97616.getClass(), "varStart", 0);
        setField(term97616, term97616.getClass(), "compilerData", null);
        setIntField(term97616, term97616.getClass(), "type", 20);
        setField(term97616, term97616.getClass(), "next", null);
        setField(term97626, term97626.getClass(), "functionName", null);
        setBooleanField(term97626, term97626.getClass(), "itsNeedsActivation", false);
        setIntField(term97626, term97626.getClass(), "itsFunctionType", 0);
        setBooleanField(term97626, term97626.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term97626, term97626.getClass(), "encodedSourceStart", 0);
        setIntField(term97626, term97626.getClass(), "encodedSourceEnd", 0);
        setField(term97626, term97626.getClass(), "sourceName", null);
        setIntField(term97626, term97626.getClass(), "baseLineno", 0);
        setIntField(term97626, term97626.getClass(), "endLineno", 0);
        setField(term97626, term97626.getClass(), "functions", null);
        setField(term97626, term97626.getClass(), "regexps", null);
        setField(term97626, term97626.getClass(), "itsVariables", null);
        setField(term97626, term97626.getClass(), "itsConst", null);
        setField(term97626, term97626.getClass(), "itsVariableNames", null);
        setIntField(term97626, term97626.getClass(), "varStart", 0);
        setField(term97626, term97626.getClass(), "compilerData", null);
        setIntField(term97626, term97626.getClass(), "type", 0);
        setIntField(term97636, term97636.getClass(), "type", 0);
        setField(term97636, term97636.getClass(), "next", null);
        setField(term97636, term97636.getClass(), "first", null);
        setField(term97636, term97636.getClass(), "last", null);
        setField(term97636, term97636.getClass(), "propListHead", null);
        setIntField(term97636, term97636.getClass(), "sourcePosition", 0);
        setField(term97636, term97636.getClass(), "jsType", null);
        setField(term97636, term97636.getClass(), "parent", null);
        setField(term97626, term97626.getClass(), "next", term97636);
        setField(term97626, term97626.getClass(), "first", null);
        setField(term97626, term97626.getClass(), "last", null);
        setField(term97626, term97626.getClass(), "propListHead", null);
        setIntField(term97626, term97626.getClass(), "sourcePosition", 0);
        setField(term97626, term97626.getClass(), "jsType", null);
        setField(term97626, term97626.getClass(), "parent", null);
        setField(term97616, term97616.getClass(), "first", term97626);
        setField(term97616, term97616.getClass(), "last", null);
        setField(term97616, term97616.getClass(), "propListHead", null);
        setIntField(term97616, term97616.getClass(), "sourcePosition", 0);
        setField(term97616, term97616.getClass(), "jsType", null);
        setField(term97616, term97616.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term97209;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term97123, args);
        assertTrue(recursiveEquals(term97123, term97675));
        assertTrue(recursiveEquals(term97209, term97676));
        assertTrue(recursiveEquals(retValue, term97616));
    }

};


