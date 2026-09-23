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

public class ProcessCommonJSModules_process_627866047271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139329;
     Object term139399;
     Object term139889;
     Object term139890;

    public ProcessCommonJSModules_process_627866047271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139329 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term139329, term139329.getClass(), "compiler", null);
        term139399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139583 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139399, term139399.getClass(), "type", 37);
        setField(term139399, term139399.getClass(), "parent", null);
        setField(term139583, term139583.getClass(), "next", null);
        setIntField(term139583, term139583.getClass(), "type", 37);
        setField(term139583, term139583.getClass(), "first", null);
        setField(term139491, term139491.getClass(), "next", term139583);
        setIntField(term139491, term139491.getClass(), "type", 0);
        setField(term139653, term139653.getClass(), "next", null);
        setIntField(term139653, term139653.getClass(), "type", 0);
        setField(term139653, term139653.getClass(), "first", null);
        setField(term139491, term139491.getClass(), "first", term139653);
        setField(term139399, term139399.getClass(), "first", term139491);
        term139889 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term139889, term139889.getClass(), "compiler", null);
        setField(term139889, term139889.getClass(), "filenamePrefix", null);
        setBooleanField(term139889, term139889.getClass(), "reportDependencies", false);
        setField(term139889, term139889.getClass(), "module", null);
        term139890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139891 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139890, term139890.getClass(), "type", 37);
        setField(term139890, term139890.getClass(), "next", null);
        setField(term139891, term139891.getClass(), "str", null);
        setIntField(term139891, term139891.getClass(), "type", 0);
        setField(term139892, term139892.getClass(), "str", null);
        setIntField(term139892, term139892.getClass(), "type", 37);
        setField(term139892, term139892.getClass(), "next", null);
        setField(term139892, term139892.getClass(), "first", null);
        setField(term139892, term139892.getClass(), "last", null);
        setField(term139892, term139892.getClass(), "propListHead", null);
        setIntField(term139892, term139892.getClass(), "sourcePosition", 0);
        setField(term139892, term139892.getClass(), "jsType", null);
        setField(term139892, term139892.getClass(), "parent", null);
        setField(term139891, term139891.getClass(), "next", term139892);
        setIntField(term139893, term139893.getClass(), "type", 0);
        setField(term139893, term139893.getClass(), "next", null);
        setField(term139893, term139893.getClass(), "first", null);
        setField(term139893, term139893.getClass(), "last", null);
        setField(term139893, term139893.getClass(), "propListHead", null);
        setIntField(term139893, term139893.getClass(), "sourcePosition", 0);
        setField(term139893, term139893.getClass(), "jsType", null);
        setField(term139893, term139893.getClass(), "parent", null);
        setField(term139891, term139891.getClass(), "first", term139893);
        setField(term139891, term139891.getClass(), "last", null);
        setField(term139891, term139891.getClass(), "propListHead", null);
        setIntField(term139891, term139891.getClass(), "sourcePosition", 0);
        setField(term139891, term139891.getClass(), "jsType", null);
        setField(term139891, term139891.getClass(), "parent", null);
        setField(term139890, term139890.getClass(), "first", term139891);
        setField(term139890, term139890.getClass(), "last", null);
        setField(term139890, term139890.getClass(), "propListHead", null);
        setIntField(term139890, term139890.getClass(), "sourcePosition", 0);
        setField(term139890, term139890.getClass(), "jsType", null);
        setField(term139890, term139890.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term139399;
        callMethod(klass, "process", argTypes, term139329, args);
        assertTrue(recursiveEquals(term139329, term139889));
        assertTrue(recursiveEquals(term139399, null));
    }

};


