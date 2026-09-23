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

public class ProcessCommonJSModules_process_627866047283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145314;
     Object term145384;
     Object term146012;
     Object term146013;

    public ProcessCommonJSModules_process_627866047283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145314 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term145314, term145314.getClass(), "compiler", null);
        term145384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145384, term145384.getClass(), "type", 37);
        setField(term145384, term145384.getClass(), "parent", null);
        setField(term145594, term145594.getClass(), "next", null);
        setIntField(term145594, term145594.getClass(), "type", 0);
        setField(term145594, term145594.getClass(), "first", null);
        setField(term145524, term145524.getClass(), "next", term145594);
        setIntField(term145524, term145524.getClass(), "type", 37);
        setField(term145524, term145524.getClass(), "first", null);
        setField(term145454, term145454.getClass(), "next", term145524);
        setIntField(term145454, term145454.getClass(), "type", 0);
        setField(term145734, term145734.getClass(), "next", null);
        setIntField(term145734, term145734.getClass(), "type", 0);
        setField(term145734, term145734.getClass(), "first", null);
        setField(term145664, term145664.getClass(), "next", term145734);
        setIntField(term145664, term145664.getClass(), "type", 37);
        setField(term145664, term145664.getClass(), "first", null);
        setField(term145454, term145454.getClass(), "first", term145664);
        setField(term145384, term145384.getClass(), "first", term145454);
        term146012 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term146012, term146012.getClass(), "compiler", null);
        setField(term146012, term146012.getClass(), "filenamePrefix", null);
        setBooleanField(term146012, term146012.getClass(), "reportDependencies", true);
        setField(term146012, term146012.getClass(), "module", null);
        term146013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146013, term146013.getClass(), "type", 0);
        setField(term146013, term146013.getClass(), "next", null);
        setIntField(term146014, term146014.getClass(), "type", 0);
        setIntField(term146015, term146015.getClass(), "type", 37);
        setIntField(term146016, term146016.getClass(), "type", 0);
        setField(term146016, term146016.getClass(), "next", null);
        setField(term146016, term146016.getClass(), "first", null);
        setField(term146016, term146016.getClass(), "last", null);
        setField(term146016, term146016.getClass(), "propListHead", null);
        setIntField(term146016, term146016.getClass(), "sourcePosition", 0);
        setField(term146016, term146016.getClass(), "jsType", null);
        setField(term146016, term146016.getClass(), "parent", null);
        setField(term146015, term146015.getClass(), "next", term146016);
        setField(term146015, term146015.getClass(), "first", null);
        setField(term146015, term146015.getClass(), "last", null);
        setField(term146015, term146015.getClass(), "propListHead", null);
        setIntField(term146015, term146015.getClass(), "sourcePosition", 0);
        setField(term146015, term146015.getClass(), "jsType", null);
        setField(term146015, term146015.getClass(), "parent", null);
        setField(term146014, term146014.getClass(), "next", term146015);
        setIntField(term146017, term146017.getClass(), "type", 37);
        setIntField(term146018, term146018.getClass(), "type", 0);
        setField(term146018, term146018.getClass(), "next", null);
        setField(term146018, term146018.getClass(), "first", null);
        setField(term146018, term146018.getClass(), "last", null);
        setField(term146018, term146018.getClass(), "propListHead", null);
        setIntField(term146018, term146018.getClass(), "sourcePosition", 0);
        setField(term146018, term146018.getClass(), "jsType", null);
        setField(term146018, term146018.getClass(), "parent", null);
        setField(term146017, term146017.getClass(), "next", term146018);
        setField(term146017, term146017.getClass(), "first", null);
        setField(term146017, term146017.getClass(), "last", null);
        setField(term146017, term146017.getClass(), "propListHead", null);
        setIntField(term146017, term146017.getClass(), "sourcePosition", 0);
        setField(term146017, term146017.getClass(), "jsType", null);
        setField(term146017, term146017.getClass(), "parent", null);
        setField(term146014, term146014.getClass(), "first", term146017);
        setField(term146014, term146014.getClass(), "last", null);
        setField(term146014, term146014.getClass(), "propListHead", null);
        setIntField(term146014, term146014.getClass(), "sourcePosition", 0);
        setField(term146014, term146014.getClass(), "jsType", null);
        setField(term146014, term146014.getClass(), "parent", null);
        setField(term146013, term146013.getClass(), "first", term146014);
        setField(term146013, term146013.getClass(), "last", null);
        setField(term146013, term146013.getClass(), "propListHead", null);
        setIntField(term146013, term146013.getClass(), "sourcePosition", 0);
        setField(term146013, term146013.getClass(), "jsType", null);
        setField(term146013, term146013.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term145384;
        callMethod(klass, "process", argTypes, term145314, args);
        assertTrue(recursiveEquals(term145314, term146012));
        assertTrue(recursiveEquals(term145384, null));
    }

};


