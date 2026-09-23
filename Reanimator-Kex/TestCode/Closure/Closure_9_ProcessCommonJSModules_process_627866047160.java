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

public class ProcessCommonJSModules_process_627866047160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77253;
     Object term77323;
     Object term78268;
     Object term78269;

    public ProcessCommonJSModules_process_627866047160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77253 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term77253, term77253.getClass(), "compiler", null);
        term77323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77323, term77323.getClass(), "type", 0);
        setField(term77323, term77323.getClass(), "parent", null);
        setField(term77393, term77393.getClass(), "next", term77463);
        setIntField(term77393, term77393.getClass(), "type", 33);
        setField(term77533, term77533.getClass(), "next", null);
        setIntField(term77533, term77533.getClass(), "type", 0);
        setField(term77533, term77533.getClass(), "first", null);
        setField(term77393, term77393.getClass(), "first", term77533);
        setField(term77323, term77323.getClass(), "first", term77393);
        term78268 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term78268, term78268.getClass(), "compiler", null);
        setField(term78268, term78268.getClass(), "filenamePrefix", null);
        setBooleanField(term78268, term78268.getClass(), "reportDependencies", false);
        setField(term78268, term78268.getClass(), "module", null);
        term78269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78269, term78269.getClass(), "type", 0);
        setField(term78269, term78269.getClass(), "next", null);
        setIntField(term78270, term78270.getClass(), "type", 33);
        setIntField(term78271, term78271.getClass(), "type", 0);
        setField(term78271, term78271.getClass(), "next", null);
        setField(term78271, term78271.getClass(), "first", null);
        setField(term78271, term78271.getClass(), "last", null);
        setField(term78271, term78271.getClass(), "propListHead", null);
        setIntField(term78271, term78271.getClass(), "sourcePosition", 0);
        setField(term78271, term78271.getClass(), "jsType", null);
        setField(term78271, term78271.getClass(), "parent", null);
        setField(term78270, term78270.getClass(), "next", term78271);
        setIntField(term78272, term78272.getClass(), "type", 0);
        setField(term78272, term78272.getClass(), "next", null);
        setField(term78272, term78272.getClass(), "first", null);
        setField(term78272, term78272.getClass(), "last", null);
        setField(term78272, term78272.getClass(), "propListHead", null);
        setIntField(term78272, term78272.getClass(), "sourcePosition", 0);
        setField(term78272, term78272.getClass(), "jsType", null);
        setField(term78272, term78272.getClass(), "parent", null);
        setField(term78270, term78270.getClass(), "first", term78272);
        setField(term78270, term78270.getClass(), "last", null);
        setField(term78270, term78270.getClass(), "propListHead", null);
        setIntField(term78270, term78270.getClass(), "sourcePosition", 0);
        setField(term78270, term78270.getClass(), "jsType", null);
        setField(term78270, term78270.getClass(), "parent", null);
        setField(term78269, term78269.getClass(), "first", term78270);
        setField(term78269, term78269.getClass(), "last", null);
        setField(term78269, term78269.getClass(), "propListHead", null);
        setIntField(term78269, term78269.getClass(), "sourcePosition", 0);
        setField(term78269, term78269.getClass(), "jsType", null);
        setField(term78269, term78269.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term77323;
        callMethod(klass, "process", argTypes, term77253, args);
        assertTrue(recursiveEquals(term77253, term78268));
        assertTrue(recursiveEquals(term77323, null));
    }

};


