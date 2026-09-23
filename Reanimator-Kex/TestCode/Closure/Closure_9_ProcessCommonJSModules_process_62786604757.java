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

public class ProcessCommonJSModules_process_62786604757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19803;
     Object term19873;
     Object term20455;
     Object term20456;

    public ProcessCommonJSModules_process_62786604757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19803 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term19803, term19803.getClass(), "compiler", null);
        term19873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19965 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term19873, term19873.getClass(), "type", 0);
        setField(term19873, term19873.getClass(), "parent", null);
        setField(term19965, term19965.getClass(), "next", term20057);
        setIntField(term19965, term19965.getClass(), "type", 0);
        setField(term20149, term20149.getClass(), "next", null);
        setIntField(term20149, term20149.getClass(), "type", 37);
        setField(term20149, term20149.getClass(), "first", null);
        setField(term19965, term19965.getClass(), "first", term20149);
        setField(term19873, term19873.getClass(), "first", term19965);
        term20455 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term20455, term20455.getClass(), "compiler", null);
        setField(term20455, term20455.getClass(), "filenamePrefix", null);
        setBooleanField(term20455, term20455.getClass(), "reportDependencies", false);
        setField(term20455, term20455.getClass(), "module", null);
        term20456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20457 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term20456, term20456.getClass(), "type", 0);
        setField(term20456, term20456.getClass(), "next", null);
        setDoubleField(term20457, term20457.getClass(), "number", 0.0);
        setIntField(term20457, term20457.getClass(), "type", 0);
        setDoubleField(term20458, term20458.getClass(), "number", 0.0);
        setIntField(term20458, term20458.getClass(), "type", 0);
        setField(term20458, term20458.getClass(), "next", null);
        setField(term20458, term20458.getClass(), "first", null);
        setField(term20458, term20458.getClass(), "last", null);
        setField(term20458, term20458.getClass(), "propListHead", null);
        setIntField(term20458, term20458.getClass(), "sourcePosition", 0);
        setField(term20458, term20458.getClass(), "jsType", null);
        setField(term20458, term20458.getClass(), "parent", null);
        setField(term20457, term20457.getClass(), "next", term20458);
        setDoubleField(term20459, term20459.getClass(), "number", 0.0);
        setIntField(term20459, term20459.getClass(), "type", 37);
        setField(term20459, term20459.getClass(), "next", null);
        setField(term20459, term20459.getClass(), "first", null);
        setField(term20459, term20459.getClass(), "last", null);
        setField(term20459, term20459.getClass(), "propListHead", null);
        setIntField(term20459, term20459.getClass(), "sourcePosition", 0);
        setField(term20459, term20459.getClass(), "jsType", null);
        setField(term20459, term20459.getClass(), "parent", null);
        setField(term20457, term20457.getClass(), "first", term20459);
        setField(term20457, term20457.getClass(), "last", null);
        setField(term20457, term20457.getClass(), "propListHead", null);
        setIntField(term20457, term20457.getClass(), "sourcePosition", 0);
        setField(term20457, term20457.getClass(), "jsType", null);
        setField(term20457, term20457.getClass(), "parent", null);
        setField(term20456, term20456.getClass(), "first", term20457);
        setField(term20456, term20456.getClass(), "last", null);
        setField(term20456, term20456.getClass(), "propListHead", null);
        setIntField(term20456, term20456.getClass(), "sourcePosition", 0);
        setField(term20456, term20456.getClass(), "jsType", null);
        setField(term20456, term20456.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19873;
        callMethod(klass, "process", argTypes, term19803, args);
        assertTrue(recursiveEquals(term19803, term20455));
        assertTrue(recursiveEquals(term19873, null));
    }

};


