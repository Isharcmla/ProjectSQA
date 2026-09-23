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

public class ProcessCommonJSModules_process_627866047313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160728;
     Object term160820;
     Object term161821;
     Object term161822;

    public ProcessCommonJSModules_process_627866047313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160728 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term160728, term160728.getClass(), "compiler", null);
        term160820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term160912 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161004 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term160820, term160820.getClass(), "type", 0);
        setField(term160820, term160820.getClass(), "parent", null);
        setField(term160912, term160912.getClass(), "next", null);
        setIntField(term160912, term160912.getClass(), "type", 0);
        setField(term161096, term161096.getClass(), "next", null);
        setIntField(term161096, term161096.getClass(), "type", 0);
        setField(term161096, term161096.getClass(), "first", null);
        setField(term161004, term161004.getClass(), "next", term161096);
        setIntField(term161004, term161004.getClass(), "type", 37);
        setField(term161004, term161004.getClass(), "first", null);
        setField(term160912, term160912.getClass(), "first", term161004);
        setField(term160820, term160820.getClass(), "first", term160912);
        term161821 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term161821, term161821.getClass(), "compiler", null);
        setField(term161821, term161821.getClass(), "filenamePrefix", null);
        setBooleanField(term161821, term161821.getClass(), "reportDependencies", false);
        setField(term161821, term161821.getClass(), "module", null);
        term161822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161823 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161824 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term161822, term161822.getClass(), "number", 0.0);
        setIntField(term161822, term161822.getClass(), "type", 0);
        setField(term161822, term161822.getClass(), "next", null);
        setDoubleField(term161823, term161823.getClass(), "number", 0.0);
        setIntField(term161823, term161823.getClass(), "type", 0);
        setField(term161823, term161823.getClass(), "next", null);
        setDoubleField(term161824, term161824.getClass(), "number", 0.0);
        setIntField(term161824, term161824.getClass(), "type", 37);
        setDoubleField(term161825, term161825.getClass(), "number", 0.0);
        setIntField(term161825, term161825.getClass(), "type", 0);
        setField(term161825, term161825.getClass(), "next", null);
        setField(term161825, term161825.getClass(), "first", null);
        setField(term161825, term161825.getClass(), "last", null);
        setField(term161825, term161825.getClass(), "propListHead", null);
        setIntField(term161825, term161825.getClass(), "sourcePosition", 0);
        setField(term161825, term161825.getClass(), "jsType", null);
        setField(term161825, term161825.getClass(), "parent", null);
        setField(term161824, term161824.getClass(), "next", term161825);
        setField(term161824, term161824.getClass(), "first", null);
        setField(term161824, term161824.getClass(), "last", null);
        setField(term161824, term161824.getClass(), "propListHead", null);
        setIntField(term161824, term161824.getClass(), "sourcePosition", 0);
        setField(term161824, term161824.getClass(), "jsType", null);
        setField(term161824, term161824.getClass(), "parent", null);
        setField(term161823, term161823.getClass(), "first", term161824);
        setField(term161823, term161823.getClass(), "last", null);
        setField(term161823, term161823.getClass(), "propListHead", null);
        setIntField(term161823, term161823.getClass(), "sourcePosition", 0);
        setField(term161823, term161823.getClass(), "jsType", null);
        setField(term161823, term161823.getClass(), "parent", null);
        setField(term161822, term161822.getClass(), "first", term161823);
        setField(term161822, term161822.getClass(), "last", null);
        setField(term161822, term161822.getClass(), "propListHead", null);
        setIntField(term161822, term161822.getClass(), "sourcePosition", 0);
        setField(term161822, term161822.getClass(), "jsType", null);
        setField(term161822, term161822.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term160820;
        callMethod(klass, "process", argTypes, term160728, args);
        assertTrue(recursiveEquals(term160728, term161821));
        assertTrue(recursiveEquals(term160820, null));
    }

};


