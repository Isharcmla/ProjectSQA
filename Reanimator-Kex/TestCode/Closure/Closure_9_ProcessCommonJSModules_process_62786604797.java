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

public class ProcessCommonJSModules_process_62786604797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42179;
     Object term42249;
     Object term42913;
     Object term42914;

    public ProcessCommonJSModules_process_62786604797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42179 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term42179, term42179.getClass(), "compiler", null);
        term42249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42249, term42249.getClass(), "type", 37);
        setField(term42249, term42249.getClass(), "parent", null);
        setField(term42389, term42389.getClass(), "next", null);
        setIntField(term42389, term42389.getClass(), "type", 0);
        setField(term42389, term42389.getClass(), "first", null);
        setField(term42319, term42319.getClass(), "next", term42389);
        setIntField(term42319, term42319.getClass(), "type", 0);
        setField(term42529, term42529.getClass(), "next", null);
        setIntField(term42529, term42529.getClass(), "type", 0);
        setField(term42529, term42529.getClass(), "first", null);
        setField(term42459, term42459.getClass(), "next", term42529);
        setIntField(term42459, term42459.getClass(), "type", 37);
        setField(term42459, term42459.getClass(), "first", null);
        setField(term42319, term42319.getClass(), "first", term42459);
        setField(term42249, term42249.getClass(), "first", term42319);
        term42913 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term42913, term42913.getClass(), "compiler", null);
        setField(term42913, term42913.getClass(), "filenamePrefix", null);
        setBooleanField(term42913, term42913.getClass(), "reportDependencies", false);
        setField(term42913, term42913.getClass(), "module", null);
        term42914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42914, term42914.getClass(), "type", 37);
        setField(term42914, term42914.getClass(), "next", null);
        setIntField(term42915, term42915.getClass(), "type", 0);
        setIntField(term42916, term42916.getClass(), "type", 0);
        setField(term42916, term42916.getClass(), "next", null);
        setField(term42916, term42916.getClass(), "first", null);
        setField(term42916, term42916.getClass(), "last", null);
        setField(term42916, term42916.getClass(), "propListHead", null);
        setIntField(term42916, term42916.getClass(), "sourcePosition", 0);
        setField(term42916, term42916.getClass(), "jsType", null);
        setField(term42916, term42916.getClass(), "parent", null);
        setField(term42915, term42915.getClass(), "next", term42916);
        setIntField(term42917, term42917.getClass(), "type", 37);
        setIntField(term42918, term42918.getClass(), "type", 0);
        setField(term42918, term42918.getClass(), "next", null);
        setField(term42918, term42918.getClass(), "first", null);
        setField(term42918, term42918.getClass(), "last", null);
        setField(term42918, term42918.getClass(), "propListHead", null);
        setIntField(term42918, term42918.getClass(), "sourcePosition", 0);
        setField(term42918, term42918.getClass(), "jsType", null);
        setField(term42918, term42918.getClass(), "parent", null);
        setField(term42917, term42917.getClass(), "next", term42918);
        setField(term42917, term42917.getClass(), "first", null);
        setField(term42917, term42917.getClass(), "last", null);
        setField(term42917, term42917.getClass(), "propListHead", null);
        setIntField(term42917, term42917.getClass(), "sourcePosition", 0);
        setField(term42917, term42917.getClass(), "jsType", null);
        setField(term42917, term42917.getClass(), "parent", null);
        setField(term42915, term42915.getClass(), "first", term42917);
        setField(term42915, term42915.getClass(), "last", null);
        setField(term42915, term42915.getClass(), "propListHead", null);
        setIntField(term42915, term42915.getClass(), "sourcePosition", 0);
        setField(term42915, term42915.getClass(), "jsType", null);
        setField(term42915, term42915.getClass(), "parent", null);
        setField(term42914, term42914.getClass(), "first", term42915);
        setField(term42914, term42914.getClass(), "last", null);
        setField(term42914, term42914.getClass(), "propListHead", null);
        setIntField(term42914, term42914.getClass(), "sourcePosition", 0);
        setField(term42914, term42914.getClass(), "jsType", null);
        setField(term42914, term42914.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term42249;
        callMethod(klass, "process", argTypes, term42179, args);
        assertTrue(recursiveEquals(term42179, term42913));
        assertTrue(recursiveEquals(term42249, null));
    }

};


