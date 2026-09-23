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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655621;
     Object term655713;
     Object term655959;
     Object term655960;
     Object term655906;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term655621 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term655713 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655891 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term655805, term655805.getClass(), "next", term655891);
        setIntField(term655805, term655805.getClass(), "type", 39);
        setField(term655713, term655713.getClass(), "first", term655805);
        setIntField(term655713, term655713.getClass(), "type", 24);
        term655959 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term655959, term655959.getClass(), "currentTraversal", null);
        term655960 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655961 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655962 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term655960, term655960.getClass(), "str", null);
        setIntField(term655960, term655960.getClass(), "type", 24);
        setField(term655960, term655960.getClass(), "next", null);
        setField(term655961, term655961.getClass(), "str", null);
        setIntField(term655961, term655961.getClass(), "type", 39);
        setField(term655962, term655962.getClass(), "functionName", null);
        setBooleanField(term655962, term655962.getClass(), "itsNeedsActivation", false);
        setIntField(term655962, term655962.getClass(), "itsFunctionType", 0);
        setBooleanField(term655962, term655962.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term655962, term655962.getClass(), "encodedSourceStart", 0);
        setIntField(term655962, term655962.getClass(), "encodedSourceEnd", 0);
        setField(term655962, term655962.getClass(), "sourceName", null);
        setIntField(term655962, term655962.getClass(), "baseLineno", 0);
        setIntField(term655962, term655962.getClass(), "endLineno", 0);
        setField(term655962, term655962.getClass(), "functions", null);
        setField(term655962, term655962.getClass(), "regexps", null);
        setField(term655962, term655962.getClass(), "itsVariables", null);
        setField(term655962, term655962.getClass(), "itsConst", null);
        setField(term655962, term655962.getClass(), "itsVariableNames", null);
        setIntField(term655962, term655962.getClass(), "varStart", 0);
        setField(term655962, term655962.getClass(), "compilerData", null);
        setIntField(term655962, term655962.getClass(), "type", 0);
        setField(term655962, term655962.getClass(), "next", null);
        setField(term655962, term655962.getClass(), "first", null);
        setField(term655962, term655962.getClass(), "last", null);
        setField(term655962, term655962.getClass(), "propListHead", null);
        setIntField(term655962, term655962.getClass(), "sourcePosition", 0);
        setField(term655962, term655962.getClass(), "jsType", null);
        setField(term655962, term655962.getClass(), "parent", null);
        setField(term655961, term655961.getClass(), "next", term655962);
        setField(term655961, term655961.getClass(), "first", null);
        setField(term655961, term655961.getClass(), "last", null);
        setField(term655961, term655961.getClass(), "propListHead", null);
        setIntField(term655961, term655961.getClass(), "sourcePosition", 0);
        setField(term655961, term655961.getClass(), "jsType", null);
        setField(term655961, term655961.getClass(), "parent", null);
        setField(term655960, term655960.getClass(), "first", term655961);
        setField(term655960, term655960.getClass(), "last", null);
        setField(term655960, term655960.getClass(), "propListHead", null);
        setIntField(term655960, term655960.getClass(), "sourcePosition", 0);
        setField(term655960, term655960.getClass(), "jsType", null);
        setField(term655960, term655960.getClass(), "parent", null);
        term655906 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655908 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term655910 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term655906, term655906.getClass(), "str", null);
        setIntField(term655906, term655906.getClass(), "type", 24);
        setField(term655906, term655906.getClass(), "next", null);
        setField(term655908, term655908.getClass(), "str", null);
        setIntField(term655908, term655908.getClass(), "type", 39);
        setField(term655910, term655910.getClass(), "functionName", null);
        setBooleanField(term655910, term655910.getClass(), "itsNeedsActivation", false);
        setIntField(term655910, term655910.getClass(), "itsFunctionType", 0);
        setBooleanField(term655910, term655910.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term655910, term655910.getClass(), "encodedSourceStart", 0);
        setIntField(term655910, term655910.getClass(), "encodedSourceEnd", 0);
        setField(term655910, term655910.getClass(), "sourceName", null);
        setIntField(term655910, term655910.getClass(), "baseLineno", 0);
        setIntField(term655910, term655910.getClass(), "endLineno", 0);
        setField(term655910, term655910.getClass(), "functions", null);
        setField(term655910, term655910.getClass(), "regexps", null);
        setField(term655910, term655910.getClass(), "itsVariables", null);
        setField(term655910, term655910.getClass(), "itsConst", null);
        setField(term655910, term655910.getClass(), "itsVariableNames", null);
        setIntField(term655910, term655910.getClass(), "varStart", 0);
        setField(term655910, term655910.getClass(), "compilerData", null);
        setIntField(term655910, term655910.getClass(), "type", 0);
        setField(term655910, term655910.getClass(), "next", null);
        setField(term655910, term655910.getClass(), "first", null);
        setField(term655910, term655910.getClass(), "last", null);
        setField(term655910, term655910.getClass(), "propListHead", null);
        setIntField(term655910, term655910.getClass(), "sourcePosition", 0);
        setField(term655910, term655910.getClass(), "jsType", null);
        setField(term655910, term655910.getClass(), "parent", null);
        setField(term655908, term655908.getClass(), "next", term655910);
        setField(term655908, term655908.getClass(), "first", null);
        setField(term655908, term655908.getClass(), "last", null);
        setField(term655908, term655908.getClass(), "propListHead", null);
        setIntField(term655908, term655908.getClass(), "sourcePosition", 0);
        setField(term655908, term655908.getClass(), "jsType", null);
        setField(term655908, term655908.getClass(), "parent", null);
        setField(term655906, term655906.getClass(), "first", term655908);
        setField(term655906, term655906.getClass(), "last", null);
        setField(term655906, term655906.getClass(), "propListHead", null);
        setIntField(term655906, term655906.getClass(), "sourcePosition", 0);
        setField(term655906, term655906.getClass(), "jsType", null);
        setField(term655906, term655906.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term655713;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term655621, args);
        assertTrue(recursiveEquals(term655621, term655959));
        assertTrue(recursiveEquals(term655713, term655960));
        assertTrue(recursiveEquals(retValue, term655906));
    }

};


