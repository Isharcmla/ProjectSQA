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

public class PeepholeFoldConstants_tryFoldComparison_8484431791678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431348;
     Object term431434;
     Object term431520;
     Object term431612;
     Object term432088;
     Object term432089;
     Object term432090;
     Object term432091;
     Object term432062;

    public PeepholeFoldConstants_tryFoldComparison_8484431791678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431348 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term431434 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term431434, term431434.getClass(), "type", 16);
        term431520 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term431520, term431520.getClass(), "type", 16);
        term431612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term432088 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term432088, term432088.getClass(), "currentTraversal", null);
        term432089 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term432089, term432089.getClass(), "functionName", null);
        setBooleanField(term432089, term432089.getClass(), "itsNeedsActivation", false);
        setIntField(term432089, term432089.getClass(), "itsFunctionType", 0);
        setBooleanField(term432089, term432089.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term432089, term432089.getClass(), "encodedSourceStart", 0);
        setIntField(term432089, term432089.getClass(), "encodedSourceEnd", 0);
        setField(term432089, term432089.getClass(), "sourceName", null);
        setIntField(term432089, term432089.getClass(), "baseLineno", 0);
        setIntField(term432089, term432089.getClass(), "endLineno", 0);
        setField(term432089, term432089.getClass(), "functions", null);
        setField(term432089, term432089.getClass(), "regexps", null);
        setField(term432089, term432089.getClass(), "itsVariables", null);
        setField(term432089, term432089.getClass(), "itsConst", null);
        setField(term432089, term432089.getClass(), "itsVariableNames", null);
        setIntField(term432089, term432089.getClass(), "varStart", 0);
        setField(term432089, term432089.getClass(), "compilerData", null);
        setIntField(term432089, term432089.getClass(), "type", 16);
        setField(term432089, term432089.getClass(), "next", null);
        setField(term432089, term432089.getClass(), "first", null);
        setField(term432089, term432089.getClass(), "last", null);
        setField(term432089, term432089.getClass(), "propListHead", null);
        setIntField(term432089, term432089.getClass(), "sourcePosition", 0);
        setField(term432089, term432089.getClass(), "jsType", null);
        setField(term432089, term432089.getClass(), "parent", null);
        term432090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term432090, term432090.getClass(), "functionName", null);
        setBooleanField(term432090, term432090.getClass(), "itsNeedsActivation", false);
        setIntField(term432090, term432090.getClass(), "itsFunctionType", 0);
        setBooleanField(term432090, term432090.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term432090, term432090.getClass(), "encodedSourceStart", 0);
        setIntField(term432090, term432090.getClass(), "encodedSourceEnd", 0);
        setField(term432090, term432090.getClass(), "sourceName", null);
        setIntField(term432090, term432090.getClass(), "baseLineno", 0);
        setIntField(term432090, term432090.getClass(), "endLineno", 0);
        setField(term432090, term432090.getClass(), "functions", null);
        setField(term432090, term432090.getClass(), "regexps", null);
        setField(term432090, term432090.getClass(), "itsVariables", null);
        setField(term432090, term432090.getClass(), "itsConst", null);
        setField(term432090, term432090.getClass(), "itsVariableNames", null);
        setIntField(term432090, term432090.getClass(), "varStart", 0);
        setField(term432090, term432090.getClass(), "compilerData", null);
        setIntField(term432090, term432090.getClass(), "type", 16);
        setField(term432090, term432090.getClass(), "next", null);
        setField(term432090, term432090.getClass(), "first", null);
        setField(term432090, term432090.getClass(), "last", null);
        setField(term432090, term432090.getClass(), "propListHead", null);
        setIntField(term432090, term432090.getClass(), "sourcePosition", 0);
        setField(term432090, term432090.getClass(), "jsType", null);
        setField(term432090, term432090.getClass(), "parent", null);
        term432091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term432091, term432091.getClass(), "str", null);
        setIntField(term432091, term432091.getClass(), "type", 0);
        setField(term432091, term432091.getClass(), "next", null);
        setField(term432091, term432091.getClass(), "first", null);
        setField(term432091, term432091.getClass(), "last", null);
        setField(term432091, term432091.getClass(), "propListHead", null);
        setIntField(term432091, term432091.getClass(), "sourcePosition", 0);
        setField(term432091, term432091.getClass(), "jsType", null);
        setField(term432091, term432091.getClass(), "parent", null);
        term432062 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term432062, term432062.getClass(), "functionName", null);
        setBooleanField(term432062, term432062.getClass(), "itsNeedsActivation", false);
        setIntField(term432062, term432062.getClass(), "itsFunctionType", 0);
        setBooleanField(term432062, term432062.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term432062, term432062.getClass(), "encodedSourceStart", 0);
        setIntField(term432062, term432062.getClass(), "encodedSourceEnd", 0);
        setField(term432062, term432062.getClass(), "sourceName", null);
        setIntField(term432062, term432062.getClass(), "baseLineno", 0);
        setIntField(term432062, term432062.getClass(), "endLineno", 0);
        setField(term432062, term432062.getClass(), "functions", null);
        setField(term432062, term432062.getClass(), "regexps", null);
        setField(term432062, term432062.getClass(), "itsVariables", null);
        setField(term432062, term432062.getClass(), "itsConst", null);
        setField(term432062, term432062.getClass(), "itsVariableNames", null);
        setIntField(term432062, term432062.getClass(), "varStart", 0);
        setField(term432062, term432062.getClass(), "compilerData", null);
        setIntField(term432062, term432062.getClass(), "type", 16);
        setField(term432062, term432062.getClass(), "next", null);
        setField(term432062, term432062.getClass(), "first", null);
        setField(term432062, term432062.getClass(), "last", null);
        setField(term432062, term432062.getClass(), "propListHead", null);
        setIntField(term432062, term432062.getClass(), "sourcePosition", 0);
        setField(term432062, term432062.getClass(), "jsType", null);
        setField(term432062, term432062.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term431434;
        args[1] = term431520;
        args[2] = term431612;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term431348, args);
        assertTrue(recursiveEquals(term431348, term432088));
        assertTrue(recursiveEquals(term431434, term432089));
        assertTrue(recursiveEquals(term431520, term432090));
        assertTrue(recursiveEquals(term431612, term432091));
        assertTrue(recursiveEquals(retValue, term432062));
    }

};


