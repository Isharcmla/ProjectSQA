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

public class ProcessCommonJSModules_process_627866047363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193821;
     Object term193913;
     Object term194640;
     Object term194641;

    public ProcessCommonJSModules_process_627866047363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193821 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term193821, term193821.getClass(), "compiler", null);
        term193913 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194005 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194097 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term193913, term193913.getClass(), "type", 0);
        setField(term193913, term193913.getClass(), "parent", null);
        setField(term194005, term194005.getClass(), "next", null);
        setIntField(term194005, term194005.getClass(), "type", 0);
        setField(term194097, term194097.getClass(), "next", null);
        setIntField(term194097, term194097.getClass(), "type", 0);
        setField(term194097, term194097.getClass(), "first", null);
        setField(term194005, term194005.getClass(), "first", term194097);
        setField(term193913, term193913.getClass(), "first", term194005);
        term194640 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term194640, term194640.getClass(), "compiler", null);
        setField(term194640, term194640.getClass(), "filenamePrefix", null);
        setBooleanField(term194640, term194640.getClass(), "reportDependencies", false);
        setField(term194640, term194640.getClass(), "module", null);
        term194641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194643 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term194641, term194641.getClass(), "number", 0.0);
        setIntField(term194641, term194641.getClass(), "type", 0);
        setField(term194641, term194641.getClass(), "next", null);
        setDoubleField(term194642, term194642.getClass(), "number", 0.0);
        setIntField(term194642, term194642.getClass(), "type", 0);
        setField(term194642, term194642.getClass(), "next", null);
        setDoubleField(term194643, term194643.getClass(), "number", 0.0);
        setIntField(term194643, term194643.getClass(), "type", 0);
        setField(term194643, term194643.getClass(), "next", null);
        setField(term194643, term194643.getClass(), "first", null);
        setField(term194643, term194643.getClass(), "last", null);
        setField(term194643, term194643.getClass(), "propListHead", null);
        setIntField(term194643, term194643.getClass(), "sourcePosition", 0);
        setField(term194643, term194643.getClass(), "jsType", null);
        setField(term194643, term194643.getClass(), "parent", null);
        setField(term194642, term194642.getClass(), "first", term194643);
        setField(term194642, term194642.getClass(), "last", null);
        setField(term194642, term194642.getClass(), "propListHead", null);
        setIntField(term194642, term194642.getClass(), "sourcePosition", 0);
        setField(term194642, term194642.getClass(), "jsType", null);
        setField(term194642, term194642.getClass(), "parent", null);
        setField(term194641, term194641.getClass(), "first", term194642);
        setField(term194641, term194641.getClass(), "last", null);
        setField(term194641, term194641.getClass(), "propListHead", null);
        setIntField(term194641, term194641.getClass(), "sourcePosition", 0);
        setField(term194641, term194641.getClass(), "jsType", null);
        setField(term194641, term194641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term193913;
        callMethod(klass, "process", argTypes, term193821, args);
        assertTrue(recursiveEquals(term193821, term194640));
        assertTrue(recursiveEquals(term193913, null));
    }

};


