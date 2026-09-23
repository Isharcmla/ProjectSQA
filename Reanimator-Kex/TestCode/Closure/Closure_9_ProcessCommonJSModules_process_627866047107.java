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

public class ProcessCommonJSModules_process_627866047107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47461;
     Object term47531;
     Object term48056;
     Object term48057;

    public ProcessCommonJSModules_process_627866047107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47461 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term47461, term47461.getClass(), "compiler", null);
        term47531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47531, term47531.getClass(), "type", 37);
        setField(term47531, term47531.getClass(), "parent", null);
        setField(term47671, term47671.getClass(), "next", null);
        setIntField(term47671, term47671.getClass(), "type", 0);
        setField(term47671, term47671.getClass(), "first", null);
        setField(term47601, term47601.getClass(), "next", term47671);
        setIntField(term47601, term47601.getClass(), "type", 37);
        setField(term47741, term47741.getClass(), "next", null);
        setIntField(term47741, term47741.getClass(), "type", 0);
        setField(term47741, term47741.getClass(), "first", null);
        setField(term47601, term47601.getClass(), "first", term47741);
        setField(term47531, term47531.getClass(), "first", term47601);
        term48056 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term48056, term48056.getClass(), "compiler", null);
        setField(term48056, term48056.getClass(), "filenamePrefix", null);
        setBooleanField(term48056, term48056.getClass(), "reportDependencies", false);
        setField(term48056, term48056.getClass(), "module", null);
        term48057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48057, term48057.getClass(), "type", 37);
        setField(term48057, term48057.getClass(), "next", null);
        setIntField(term48058, term48058.getClass(), "type", 37);
        setIntField(term48059, term48059.getClass(), "type", 0);
        setField(term48059, term48059.getClass(), "next", null);
        setField(term48059, term48059.getClass(), "first", null);
        setField(term48059, term48059.getClass(), "last", null);
        setField(term48059, term48059.getClass(), "propListHead", null);
        setIntField(term48059, term48059.getClass(), "sourcePosition", 0);
        setField(term48059, term48059.getClass(), "jsType", null);
        setField(term48059, term48059.getClass(), "parent", null);
        setField(term48058, term48058.getClass(), "next", term48059);
        setIntField(term48060, term48060.getClass(), "type", 0);
        setField(term48060, term48060.getClass(), "next", null);
        setField(term48060, term48060.getClass(), "first", null);
        setField(term48060, term48060.getClass(), "last", null);
        setField(term48060, term48060.getClass(), "propListHead", null);
        setIntField(term48060, term48060.getClass(), "sourcePosition", 0);
        setField(term48060, term48060.getClass(), "jsType", null);
        setField(term48060, term48060.getClass(), "parent", null);
        setField(term48058, term48058.getClass(), "first", term48060);
        setField(term48058, term48058.getClass(), "last", null);
        setField(term48058, term48058.getClass(), "propListHead", null);
        setIntField(term48058, term48058.getClass(), "sourcePosition", 0);
        setField(term48058, term48058.getClass(), "jsType", null);
        setField(term48058, term48058.getClass(), "parent", null);
        setField(term48057, term48057.getClass(), "first", term48058);
        setField(term48057, term48057.getClass(), "last", null);
        setField(term48057, term48057.getClass(), "propListHead", null);
        setIntField(term48057, term48057.getClass(), "sourcePosition", 0);
        setField(term48057, term48057.getClass(), "jsType", null);
        setField(term48057, term48057.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term47531;
        callMethod(klass, "process", argTypes, term47461, args);
        assertTrue(recursiveEquals(term47461, term48056));
        assertTrue(recursiveEquals(term47531, null));
    }

};


