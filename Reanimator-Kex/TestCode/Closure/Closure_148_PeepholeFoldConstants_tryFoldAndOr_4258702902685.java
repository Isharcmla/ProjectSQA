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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767994;
     Object term768080;
     Object term768236;
     Object term768322;
     Object term769066;
     Object term769067;
     Object term769069;
     Object term769070;
     Object term768975;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term767994 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term768080 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term768150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term768150, term768150.getClass(), "type", 108);
        setField(term768080, term768080.getClass(), "parent", term768150);
        setIntField(term768080, term768080.getClass(), "type", 0);
        term768236 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term768236, term768236.getClass(), "type", 66);
        term768322 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term768322, term768322.getClass(), "type", 63);
        term769066 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term769066, term769066.getClass(), "currentTraversal", null);
        term769067 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term769068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term769067, term769067.getClass(), "functionName", null);
        setBooleanField(term769067, term769067.getClass(), "itsNeedsActivation", false);
        setIntField(term769067, term769067.getClass(), "itsFunctionType", 0);
        setBooleanField(term769067, term769067.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term769067, term769067.getClass(), "encodedSourceStart", 0);
        setIntField(term769067, term769067.getClass(), "encodedSourceEnd", 0);
        setField(term769067, term769067.getClass(), "sourceName", null);
        setIntField(term769067, term769067.getClass(), "baseLineno", 0);
        setIntField(term769067, term769067.getClass(), "endLineno", 0);
        setField(term769067, term769067.getClass(), "functions", null);
        setField(term769067, term769067.getClass(), "regexps", null);
        setField(term769067, term769067.getClass(), "itsVariables", null);
        setField(term769067, term769067.getClass(), "itsConst", null);
        setField(term769067, term769067.getClass(), "itsVariableNames", null);
        setIntField(term769067, term769067.getClass(), "varStart", 0);
        setField(term769067, term769067.getClass(), "compilerData", null);
        setIntField(term769067, term769067.getClass(), "type", 0);
        setField(term769067, term769067.getClass(), "next", null);
        setField(term769067, term769067.getClass(), "first", null);
        setField(term769067, term769067.getClass(), "last", null);
        setField(term769067, term769067.getClass(), "propListHead", null);
        setIntField(term769067, term769067.getClass(), "sourcePosition", 0);
        setField(term769067, term769067.getClass(), "jsType", null);
        setIntField(term769068, term769068.getClass(), "type", 108);
        setField(term769068, term769068.getClass(), "next", null);
        setField(term769068, term769068.getClass(), "first", null);
        setField(term769068, term769068.getClass(), "last", null);
        setField(term769068, term769068.getClass(), "propListHead", null);
        setIntField(term769068, term769068.getClass(), "sourcePosition", 0);
        setField(term769068, term769068.getClass(), "jsType", null);
        setField(term769068, term769068.getClass(), "parent", null);
        setField(term769067, term769067.getClass(), "parent", term769068);
        term769069 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term769069, term769069.getClass(), "functionName", null);
        setBooleanField(term769069, term769069.getClass(), "itsNeedsActivation", false);
        setIntField(term769069, term769069.getClass(), "itsFunctionType", 0);
        setBooleanField(term769069, term769069.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term769069, term769069.getClass(), "encodedSourceStart", 0);
        setIntField(term769069, term769069.getClass(), "encodedSourceEnd", 0);
        setField(term769069, term769069.getClass(), "sourceName", null);
        setIntField(term769069, term769069.getClass(), "baseLineno", 0);
        setIntField(term769069, term769069.getClass(), "endLineno", 0);
        setField(term769069, term769069.getClass(), "functions", null);
        setField(term769069, term769069.getClass(), "regexps", null);
        setField(term769069, term769069.getClass(), "itsVariables", null);
        setField(term769069, term769069.getClass(), "itsConst", null);
        setField(term769069, term769069.getClass(), "itsVariableNames", null);
        setIntField(term769069, term769069.getClass(), "varStart", 0);
        setField(term769069, term769069.getClass(), "compilerData", null);
        setIntField(term769069, term769069.getClass(), "type", 66);
        setField(term769069, term769069.getClass(), "next", null);
        setField(term769069, term769069.getClass(), "first", null);
        setField(term769069, term769069.getClass(), "last", null);
        setField(term769069, term769069.getClass(), "propListHead", null);
        setIntField(term769069, term769069.getClass(), "sourcePosition", 0);
        setField(term769069, term769069.getClass(), "jsType", null);
        setField(term769069, term769069.getClass(), "parent", null);
        term769070 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term769070, term769070.getClass(), "functionName", null);
        setBooleanField(term769070, term769070.getClass(), "itsNeedsActivation", false);
        setIntField(term769070, term769070.getClass(), "itsFunctionType", 0);
        setBooleanField(term769070, term769070.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term769070, term769070.getClass(), "encodedSourceStart", 0);
        setIntField(term769070, term769070.getClass(), "encodedSourceEnd", 0);
        setField(term769070, term769070.getClass(), "sourceName", null);
        setIntField(term769070, term769070.getClass(), "baseLineno", 0);
        setIntField(term769070, term769070.getClass(), "endLineno", 0);
        setField(term769070, term769070.getClass(), "functions", null);
        setField(term769070, term769070.getClass(), "regexps", null);
        setField(term769070, term769070.getClass(), "itsVariables", null);
        setField(term769070, term769070.getClass(), "itsConst", null);
        setField(term769070, term769070.getClass(), "itsVariableNames", null);
        setIntField(term769070, term769070.getClass(), "varStart", 0);
        setField(term769070, term769070.getClass(), "compilerData", null);
        setIntField(term769070, term769070.getClass(), "type", 63);
        setField(term769070, term769070.getClass(), "next", null);
        setField(term769070, term769070.getClass(), "first", null);
        setField(term769070, term769070.getClass(), "last", null);
        setField(term769070, term769070.getClass(), "propListHead", null);
        setIntField(term769070, term769070.getClass(), "sourcePosition", 0);
        setField(term769070, term769070.getClass(), "jsType", null);
        setField(term769070, term769070.getClass(), "parent", null);
        term768975 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term768986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term768975, term768975.getClass(), "functionName", null);
        setBooleanField(term768975, term768975.getClass(), "itsNeedsActivation", false);
        setIntField(term768975, term768975.getClass(), "itsFunctionType", 0);
        setBooleanField(term768975, term768975.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term768975, term768975.getClass(), "encodedSourceStart", 0);
        setIntField(term768975, term768975.getClass(), "encodedSourceEnd", 0);
        setField(term768975, term768975.getClass(), "sourceName", null);
        setIntField(term768975, term768975.getClass(), "baseLineno", 0);
        setIntField(term768975, term768975.getClass(), "endLineno", 0);
        setField(term768975, term768975.getClass(), "functions", null);
        setField(term768975, term768975.getClass(), "regexps", null);
        setField(term768975, term768975.getClass(), "itsVariables", null);
        setField(term768975, term768975.getClass(), "itsConst", null);
        setField(term768975, term768975.getClass(), "itsVariableNames", null);
        setIntField(term768975, term768975.getClass(), "varStart", 0);
        setField(term768975, term768975.getClass(), "compilerData", null);
        setIntField(term768975, term768975.getClass(), "type", 0);
        setField(term768975, term768975.getClass(), "next", null);
        setField(term768975, term768975.getClass(), "first", null);
        setField(term768975, term768975.getClass(), "last", null);
        setField(term768975, term768975.getClass(), "propListHead", null);
        setIntField(term768975, term768975.getClass(), "sourcePosition", 0);
        setField(term768975, term768975.getClass(), "jsType", null);
        setIntField(term768986, term768986.getClass(), "type", 108);
        setField(term768986, term768986.getClass(), "next", null);
        setField(term768986, term768986.getClass(), "first", null);
        setField(term768986, term768986.getClass(), "last", null);
        setField(term768986, term768986.getClass(), "propListHead", null);
        setIntField(term768986, term768986.getClass(), "sourcePosition", 0);
        setField(term768986, term768986.getClass(), "jsType", null);
        setField(term768986, term768986.getClass(), "parent", null);
        setField(term768975, term768975.getClass(), "parent", term768986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term768080;
        args[1] = term768236;
        args[2] = term768322;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term767994, args);
        assertTrue(recursiveEquals(term767994, term769066));
        assertTrue(recursiveEquals(term768080, term769067));
        assertTrue(recursiveEquals(term768236, term769069));
        assertTrue(recursiveEquals(term768322, term769070));
        assertTrue(recursiveEquals(retValue, term768975));
    }

};


