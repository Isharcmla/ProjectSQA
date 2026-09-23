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

public class ProcessCommonJSModules_process_627866047383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207630;
     Object term207700;
     Object term208223;
     Object term208224;

    public ProcessCommonJSModules_process_627866047383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207630 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term207630, term207630.getClass(), "compiler", null);
        term207700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term207700, term207700.getClass(), "type", 33);
        setField(term207700, term207700.getClass(), "parent", null);
        setField(term207840, term207840.getClass(), "next", null);
        setIntField(term207840, term207840.getClass(), "type", 0);
        setField(term207840, term207840.getClass(), "first", null);
        setField(term207770, term207770.getClass(), "next", term207840);
        setIntField(term207770, term207770.getClass(), "type", 37);
        setField(term207910, term207910.getClass(), "next", null);
        setIntField(term207910, term207910.getClass(), "type", 0);
        setField(term207910, term207910.getClass(), "first", null);
        setField(term207770, term207770.getClass(), "first", term207910);
        setField(term207700, term207700.getClass(), "first", term207770);
        term208223 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term208223, term208223.getClass(), "compiler", null);
        setField(term208223, term208223.getClass(), "filenamePrefix", null);
        setBooleanField(term208223, term208223.getClass(), "reportDependencies", false);
        setField(term208223, term208223.getClass(), "module", null);
        term208224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term208224, term208224.getClass(), "type", 33);
        setField(term208224, term208224.getClass(), "next", null);
        setIntField(term208225, term208225.getClass(), "type", 37);
        setIntField(term208226, term208226.getClass(), "type", 0);
        setField(term208226, term208226.getClass(), "next", null);
        setField(term208226, term208226.getClass(), "first", null);
        setField(term208226, term208226.getClass(), "last", null);
        setField(term208226, term208226.getClass(), "propListHead", null);
        setIntField(term208226, term208226.getClass(), "sourcePosition", 0);
        setField(term208226, term208226.getClass(), "jsType", null);
        setField(term208226, term208226.getClass(), "parent", null);
        setField(term208225, term208225.getClass(), "next", term208226);
        setIntField(term208227, term208227.getClass(), "type", 0);
        setField(term208227, term208227.getClass(), "next", null);
        setField(term208227, term208227.getClass(), "first", null);
        setField(term208227, term208227.getClass(), "last", null);
        setField(term208227, term208227.getClass(), "propListHead", null);
        setIntField(term208227, term208227.getClass(), "sourcePosition", 0);
        setField(term208227, term208227.getClass(), "jsType", null);
        setField(term208227, term208227.getClass(), "parent", null);
        setField(term208225, term208225.getClass(), "first", term208227);
        setField(term208225, term208225.getClass(), "last", null);
        setField(term208225, term208225.getClass(), "propListHead", null);
        setIntField(term208225, term208225.getClass(), "sourcePosition", 0);
        setField(term208225, term208225.getClass(), "jsType", null);
        setField(term208225, term208225.getClass(), "parent", null);
        setField(term208224, term208224.getClass(), "first", term208225);
        setField(term208224, term208224.getClass(), "last", null);
        setField(term208224, term208224.getClass(), "propListHead", null);
        setIntField(term208224, term208224.getClass(), "sourcePosition", 0);
        setField(term208224, term208224.getClass(), "jsType", null);
        setField(term208224, term208224.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term207700;
        callMethod(klass, "process", argTypes, term207630, args);
        assertTrue(recursiveEquals(term207630, term208223));
        assertTrue(recursiveEquals(term207700, null));
    }

};


