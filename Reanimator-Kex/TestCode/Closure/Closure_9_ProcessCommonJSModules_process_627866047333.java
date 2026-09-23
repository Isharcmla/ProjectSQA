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

public class ProcessCommonJSModules_process_627866047333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174337;
     Object term174407;
     Object term175294;
     Object term175295;

    public ProcessCommonJSModules_process_627866047333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174337 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term174337, term174337.getClass(), "compiler", null);
        term174407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174499 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term174407, term174407.getClass(), "type", 0);
        setField(term174407, term174407.getClass(), "parent", null);
        setField(term174499, term174499.getClass(), "next", term174569);
        setIntField(term174499, term174499.getClass(), "type", 33);
        setField(term174823, term174823.getClass(), "next", null);
        setIntField(term174823, term174823.getClass(), "type", 0);
        setField(term174823, term174823.getClass(), "first", null);
        setField(term174753, term174753.getClass(), "next", term174823);
        setIntField(term174753, term174753.getClass(), "type", 37);
        setField(term174753, term174753.getClass(), "first", null);
        setField(term174661, term174661.getClass(), "next", term174753);
        setIntField(term174661, term174661.getClass(), "type", 37);
        setField(term174661, term174661.getClass(), "first", null);
        setField(term174499, term174499.getClass(), "first", term174661);
        setField(term174407, term174407.getClass(), "first", term174499);
        term175294 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term175294, term175294.getClass(), "compiler", null);
        setField(term175294, term175294.getClass(), "filenamePrefix", null);
        setBooleanField(term175294, term175294.getClass(), "reportDependencies", false);
        setField(term175294, term175294.getClass(), "module", null);
        term175295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175298 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175299 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term175295, term175295.getClass(), "type", 0);
        setField(term175295, term175295.getClass(), "next", null);
        setDoubleField(term175296, term175296.getClass(), "number", 0.0);
        setIntField(term175296, term175296.getClass(), "type", 33);
        setIntField(term175297, term175297.getClass(), "type", 0);
        setField(term175297, term175297.getClass(), "next", null);
        setField(term175297, term175297.getClass(), "first", null);
        setField(term175297, term175297.getClass(), "last", null);
        setField(term175297, term175297.getClass(), "propListHead", null);
        setIntField(term175297, term175297.getClass(), "sourcePosition", 0);
        setField(term175297, term175297.getClass(), "jsType", null);
        setField(term175297, term175297.getClass(), "parent", null);
        setField(term175296, term175296.getClass(), "next", term175297);
        setDoubleField(term175298, term175298.getClass(), "number", 0.0);
        setIntField(term175298, term175298.getClass(), "type", 37);
        setDoubleField(term175299, term175299.getClass(), "number", 0.0);
        setIntField(term175299, term175299.getClass(), "type", 37);
        setIntField(term175300, term175300.getClass(), "type", 0);
        setField(term175300, term175300.getClass(), "next", null);
        setField(term175300, term175300.getClass(), "first", null);
        setField(term175300, term175300.getClass(), "last", null);
        setField(term175300, term175300.getClass(), "propListHead", null);
        setIntField(term175300, term175300.getClass(), "sourcePosition", 0);
        setField(term175300, term175300.getClass(), "jsType", null);
        setField(term175300, term175300.getClass(), "parent", null);
        setField(term175299, term175299.getClass(), "next", term175300);
        setField(term175299, term175299.getClass(), "first", null);
        setField(term175299, term175299.getClass(), "last", null);
        setField(term175299, term175299.getClass(), "propListHead", null);
        setIntField(term175299, term175299.getClass(), "sourcePosition", 0);
        setField(term175299, term175299.getClass(), "jsType", null);
        setField(term175299, term175299.getClass(), "parent", null);
        setField(term175298, term175298.getClass(), "next", term175299);
        setField(term175298, term175298.getClass(), "first", null);
        setField(term175298, term175298.getClass(), "last", null);
        setField(term175298, term175298.getClass(), "propListHead", null);
        setIntField(term175298, term175298.getClass(), "sourcePosition", 0);
        setField(term175298, term175298.getClass(), "jsType", null);
        setField(term175298, term175298.getClass(), "parent", null);
        setField(term175296, term175296.getClass(), "first", term175298);
        setField(term175296, term175296.getClass(), "last", null);
        setField(term175296, term175296.getClass(), "propListHead", null);
        setIntField(term175296, term175296.getClass(), "sourcePosition", 0);
        setField(term175296, term175296.getClass(), "jsType", null);
        setField(term175296, term175296.getClass(), "parent", null);
        setField(term175295, term175295.getClass(), "first", term175296);
        setField(term175295, term175295.getClass(), "last", null);
        setField(term175295, term175295.getClass(), "propListHead", null);
        setIntField(term175295, term175295.getClass(), "sourcePosition", 0);
        setField(term175295, term175295.getClass(), "jsType", null);
        setField(term175295, term175295.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term174407;
        callMethod(klass, "process", argTypes, term174337, args);
        assertTrue(recursiveEquals(term174337, term175294));
        assertTrue(recursiveEquals(term174407, null));
    }

};


