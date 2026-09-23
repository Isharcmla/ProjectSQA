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

public class ProcessCommonJSModules_process_627866047126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57419;
     Object term57489;
     Object term58810;
     Object term58811;

    public ProcessCommonJSModules_process_627866047126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57419 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term57419, term57419.getClass(), "compiler", null);
        term57489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57489, term57489.getClass(), "type", 37);
        setField(term57489, term57489.getClass(), "parent", null);
        setField(term57629, term57629.getClass(), "next", null);
        setIntField(term57629, term57629.getClass(), "type", 37);
        setField(term57629, term57629.getClass(), "first", null);
        setField(term57559, term57559.getClass(), "next", term57629);
        setIntField(term57559, term57559.getClass(), "type", 0);
        setField(term57699, term57699.getClass(), "next", null);
        setIntField(term57699, term57699.getClass(), "type", 0);
        setField(term57699, term57699.getClass(), "first", null);
        setField(term57559, term57559.getClass(), "first", term57699);
        setField(term57489, term57489.getClass(), "first", term57559);
        term58810 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term58810, term58810.getClass(), "compiler", null);
        setField(term58810, term58810.getClass(), "filenamePrefix", null);
        setBooleanField(term58810, term58810.getClass(), "reportDependencies", false);
        setField(term58810, term58810.getClass(), "module", null);
        term58811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58811, term58811.getClass(), "type", 37);
        setField(term58811, term58811.getClass(), "next", null);
        setIntField(term58812, term58812.getClass(), "type", 0);
        setIntField(term58813, term58813.getClass(), "type", 37);
        setField(term58813, term58813.getClass(), "next", null);
        setField(term58813, term58813.getClass(), "first", null);
        setField(term58813, term58813.getClass(), "last", null);
        setField(term58813, term58813.getClass(), "propListHead", null);
        setIntField(term58813, term58813.getClass(), "sourcePosition", 0);
        setField(term58813, term58813.getClass(), "jsType", null);
        setField(term58813, term58813.getClass(), "parent", null);
        setField(term58812, term58812.getClass(), "next", term58813);
        setIntField(term58814, term58814.getClass(), "type", 0);
        setField(term58814, term58814.getClass(), "next", null);
        setField(term58814, term58814.getClass(), "first", null);
        setField(term58814, term58814.getClass(), "last", null);
        setField(term58814, term58814.getClass(), "propListHead", null);
        setIntField(term58814, term58814.getClass(), "sourcePosition", 0);
        setField(term58814, term58814.getClass(), "jsType", null);
        setField(term58814, term58814.getClass(), "parent", null);
        setField(term58812, term58812.getClass(), "first", term58814);
        setField(term58812, term58812.getClass(), "last", null);
        setField(term58812, term58812.getClass(), "propListHead", null);
        setIntField(term58812, term58812.getClass(), "sourcePosition", 0);
        setField(term58812, term58812.getClass(), "jsType", null);
        setField(term58812, term58812.getClass(), "parent", null);
        setField(term58811, term58811.getClass(), "first", term58812);
        setField(term58811, term58811.getClass(), "last", null);
        setField(term58811, term58811.getClass(), "propListHead", null);
        setIntField(term58811, term58811.getClass(), "sourcePosition", 0);
        setField(term58811, term58811.getClass(), "jsType", null);
        setField(term58811, term58811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term57489;
        callMethod(klass, "process", argTypes, term57419, args);
        assertTrue(recursiveEquals(term57419, term58810));
        assertTrue(recursiveEquals(term57489, null));
    }

};


