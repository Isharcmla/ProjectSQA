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

public class ProcessCommonJSModules_process_627866047387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210264;
     Object term210334;
     Object term210835;
     Object term210836;

    public ProcessCommonJSModules_process_627866047387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210264 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term210264, term210264.getClass(), "compiler", null);
        term210334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term210334, term210334.getClass(), "type", 0);
        setField(term210334, term210334.getClass(), "parent", null);
        setField(term210474, term210474.getClass(), "next", null);
        setIntField(term210474, term210474.getClass(), "type", 37);
        setField(term210474, term210474.getClass(), "first", null);
        setField(term210404, term210404.getClass(), "next", term210474);
        setIntField(term210404, term210404.getClass(), "type", 37);
        setField(term210544, term210544.getClass(), "next", null);
        setIntField(term210544, term210544.getClass(), "type", 0);
        setField(term210544, term210544.getClass(), "first", null);
        setField(term210404, term210404.getClass(), "first", term210544);
        setField(term210334, term210334.getClass(), "first", term210404);
        term210835 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term210835, term210835.getClass(), "compiler", null);
        setField(term210835, term210835.getClass(), "filenamePrefix", null);
        setBooleanField(term210835, term210835.getClass(), "reportDependencies", false);
        setField(term210835, term210835.getClass(), "module", null);
        term210836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term210836, term210836.getClass(), "type", 0);
        setField(term210836, term210836.getClass(), "next", null);
        setIntField(term210837, term210837.getClass(), "type", 37);
        setIntField(term210838, term210838.getClass(), "type", 37);
        setField(term210838, term210838.getClass(), "next", null);
        setField(term210838, term210838.getClass(), "first", null);
        setField(term210838, term210838.getClass(), "last", null);
        setField(term210838, term210838.getClass(), "propListHead", null);
        setIntField(term210838, term210838.getClass(), "sourcePosition", 0);
        setField(term210838, term210838.getClass(), "jsType", null);
        setField(term210838, term210838.getClass(), "parent", null);
        setField(term210837, term210837.getClass(), "next", term210838);
        setIntField(term210839, term210839.getClass(), "type", 0);
        setField(term210839, term210839.getClass(), "next", null);
        setField(term210839, term210839.getClass(), "first", null);
        setField(term210839, term210839.getClass(), "last", null);
        setField(term210839, term210839.getClass(), "propListHead", null);
        setIntField(term210839, term210839.getClass(), "sourcePosition", 0);
        setField(term210839, term210839.getClass(), "jsType", null);
        setField(term210839, term210839.getClass(), "parent", null);
        setField(term210837, term210837.getClass(), "first", term210839);
        setField(term210837, term210837.getClass(), "last", null);
        setField(term210837, term210837.getClass(), "propListHead", null);
        setIntField(term210837, term210837.getClass(), "sourcePosition", 0);
        setField(term210837, term210837.getClass(), "jsType", null);
        setField(term210837, term210837.getClass(), "parent", null);
        setField(term210836, term210836.getClass(), "first", term210837);
        setField(term210836, term210836.getClass(), "last", null);
        setField(term210836, term210836.getClass(), "propListHead", null);
        setIntField(term210836, term210836.getClass(), "sourcePosition", 0);
        setField(term210836, term210836.getClass(), "jsType", null);
        setField(term210836, term210836.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term210334;
        callMethod(klass, "process", argTypes, term210264, args);
        assertTrue(recursiveEquals(term210264, term210835));
        assertTrue(recursiveEquals(term210334, null));
    }

};


