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

public class PeepholeFoldConstants_tryFoldAndOr_425870290112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20889;
     Object term20981;
     Object term21073;
     Object term21159;
     Object term21249;
     Object term21250;
     Object term21251;
     Object term21252;
     Object term21203;

    public PeepholeFoldConstants_tryFoldAndOr_425870290112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20981 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term20981, term20981.getClass(), "parent", null);
        setIntField(term20981, term20981.getClass(), "type", 0);
        term21073 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term21073, term21073.getClass(), "type", 0);
        term21159 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term21249 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term21249, term21249.getClass(), "currentTraversal", null);
        term21250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term21250, term21250.getClass(), "str", null);
        setIntField(term21250, term21250.getClass(), "type", 0);
        setField(term21250, term21250.getClass(), "next", null);
        setField(term21250, term21250.getClass(), "first", null);
        setField(term21250, term21250.getClass(), "last", null);
        setField(term21250, term21250.getClass(), "propListHead", null);
        setIntField(term21250, term21250.getClass(), "sourcePosition", 0);
        setField(term21250, term21250.getClass(), "jsType", null);
        setField(term21250, term21250.getClass(), "parent", null);
        term21251 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term21251, term21251.getClass(), "str", null);
        setIntField(term21251, term21251.getClass(), "type", 0);
        setField(term21251, term21251.getClass(), "next", null);
        setField(term21251, term21251.getClass(), "first", null);
        setField(term21251, term21251.getClass(), "last", null);
        setField(term21251, term21251.getClass(), "propListHead", null);
        setIntField(term21251, term21251.getClass(), "sourcePosition", 0);
        setField(term21251, term21251.getClass(), "jsType", null);
        setField(term21251, term21251.getClass(), "parent", null);
        term21252 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term21252, term21252.getClass(), "functionName", null);
        setBooleanField(term21252, term21252.getClass(), "itsNeedsActivation", false);
        setIntField(term21252, term21252.getClass(), "itsFunctionType", 0);
        setBooleanField(term21252, term21252.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term21252, term21252.getClass(), "encodedSourceStart", 0);
        setIntField(term21252, term21252.getClass(), "encodedSourceEnd", 0);
        setField(term21252, term21252.getClass(), "sourceName", null);
        setIntField(term21252, term21252.getClass(), "baseLineno", 0);
        setIntField(term21252, term21252.getClass(), "endLineno", 0);
        setField(term21252, term21252.getClass(), "functions", null);
        setField(term21252, term21252.getClass(), "regexps", null);
        setField(term21252, term21252.getClass(), "itsVariables", null);
        setField(term21252, term21252.getClass(), "itsConst", null);
        setField(term21252, term21252.getClass(), "itsVariableNames", null);
        setIntField(term21252, term21252.getClass(), "varStart", 0);
        setField(term21252, term21252.getClass(), "compilerData", null);
        setIntField(term21252, term21252.getClass(), "type", 0);
        setField(term21252, term21252.getClass(), "next", null);
        setField(term21252, term21252.getClass(), "first", null);
        setField(term21252, term21252.getClass(), "last", null);
        setField(term21252, term21252.getClass(), "propListHead", null);
        setIntField(term21252, term21252.getClass(), "sourcePosition", 0);
        setField(term21252, term21252.getClass(), "jsType", null);
        setField(term21252, term21252.getClass(), "parent", null);
        term21203 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term21203, term21203.getClass(), "str", null);
        setIntField(term21203, term21203.getClass(), "type", 0);
        setField(term21203, term21203.getClass(), "next", null);
        setField(term21203, term21203.getClass(), "first", null);
        setField(term21203, term21203.getClass(), "last", null);
        setField(term21203, term21203.getClass(), "propListHead", null);
        setIntField(term21203, term21203.getClass(), "sourcePosition", 0);
        setField(term21203, term21203.getClass(), "jsType", null);
        setField(term21203, term21203.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term20981;
        args[1] = term21073;
        args[2] = term21159;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term20889, args);
        assertTrue(recursiveEquals(term20889, term21249));
        assertTrue(recursiveEquals(term20981, term21250));
        assertTrue(recursiveEquals(term21073, term21251));
        assertTrue(recursiveEquals(term21159, term21252));
        assertTrue(recursiveEquals(retValue, term21203));
    }

};


