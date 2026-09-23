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

public class ProcessCommonJSModules_process_627866047211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107051;
     Object term107143;
     Object term107819;
     Object term107820;

    public ProcessCommonJSModules_process_627866047211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107051 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term107051, term107051.getClass(), "compiler", null);
        term107143 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107235 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107327 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term107143, term107143.getClass(), "type", 0);
        setField(term107143, term107143.getClass(), "parent", null);
        setField(term107327, term107327.getClass(), "next", null);
        setIntField(term107327, term107327.getClass(), "type", 37);
        setField(term107327, term107327.getClass(), "first", null);
        setField(term107235, term107235.getClass(), "next", term107327);
        setIntField(term107235, term107235.getClass(), "type", 37);
        setField(term107235, term107235.getClass(), "first", term107327);
        setField(term107143, term107143.getClass(), "first", term107235);
        term107819 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term107819, term107819.getClass(), "compiler", null);
        setField(term107819, term107819.getClass(), "filenamePrefix", null);
        setBooleanField(term107819, term107819.getClass(), "reportDependencies", false);
        setField(term107819, term107819.getClass(), "module", null);
        term107820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term107820, term107820.getClass(), "number", 0.0);
        setIntField(term107820, term107820.getClass(), "type", 0);
        setField(term107820, term107820.getClass(), "next", null);
        setDoubleField(term107821, term107821.getClass(), "number", 0.0);
        setIntField(term107821, term107821.getClass(), "type", 37);
        setField(term107821, term107821.getClass(), "next", false);
        setField(term107821, term107821.getClass(), "first", false);
        setField(term107821, term107821.getClass(), "last", null);
        setField(term107821, term107821.getClass(), "propListHead", null);
        setIntField(term107821, term107821.getClass(), "sourcePosition", 0);
        setField(term107821, term107821.getClass(), "jsType", null);
        setField(term107821, term107821.getClass(), "parent", null);
        setField(term107820, term107820.getClass(), "first", term107821);
        setField(term107820, term107820.getClass(), "last", null);
        setField(term107820, term107820.getClass(), "propListHead", null);
        setIntField(term107820, term107820.getClass(), "sourcePosition", 0);
        setField(term107820, term107820.getClass(), "jsType", null);
        setField(term107820, term107820.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term107143;
        callMethod(klass, "process", argTypes, term107051, args);
        assertTrue(recursiveEquals(term107051, term107819));
        assertTrue(recursiveEquals(term107143, null));
    }

};


