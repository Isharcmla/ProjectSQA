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

public class ProcessCommonJSModules_process_627866047279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142937;
     Object term143029;
     Object term143805;
     Object term143806;

    public ProcessCommonJSModules_process_627866047279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142937 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term142937, term142937.getClass(), "compiler", null);
        term143029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143121 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143029, term143029.getClass(), "type", 37);
        setField(term143029, term143029.getClass(), "parent", null);
        setField(term143191, term143191.getClass(), "next", null);
        setIntField(term143191, term143191.getClass(), "type", 0);
        setField(term143191, term143191.getClass(), "first", null);
        setField(term143121, term143121.getClass(), "next", term143191);
        setIntField(term143121, term143121.getClass(), "type", 0);
        setField(term143261, term143261.getClass(), "next", null);
        setIntField(term143261, term143261.getClass(), "type", 0);
        setField(term143261, term143261.getClass(), "first", null);
        setField(term143121, term143121.getClass(), "first", term143261);
        setField(term143029, term143029.getClass(), "first", term143121);
        term143805 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term143805, term143805.getClass(), "compiler", null);
        setField(term143805, term143805.getClass(), "filenamePrefix", null);
        setBooleanField(term143805, term143805.getClass(), "reportDependencies", false);
        setField(term143805, term143805.getClass(), "module", null);
        term143806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143807 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term143806, term143806.getClass(), "number", 0.0);
        setIntField(term143806, term143806.getClass(), "type", 37);
        setField(term143806, term143806.getClass(), "next", null);
        setDoubleField(term143807, term143807.getClass(), "number", 0.0);
        setIntField(term143807, term143807.getClass(), "type", 0);
        setIntField(term143808, term143808.getClass(), "type", 0);
        setField(term143808, term143808.getClass(), "next", null);
        setField(term143808, term143808.getClass(), "first", null);
        setField(term143808, term143808.getClass(), "last", null);
        setField(term143808, term143808.getClass(), "propListHead", null);
        setIntField(term143808, term143808.getClass(), "sourcePosition", 0);
        setField(term143808, term143808.getClass(), "jsType", null);
        setField(term143808, term143808.getClass(), "parent", null);
        setField(term143807, term143807.getClass(), "next", term143808);
        setIntField(term143809, term143809.getClass(), "type", 0);
        setField(term143809, term143809.getClass(), "next", null);
        setField(term143809, term143809.getClass(), "first", null);
        setField(term143809, term143809.getClass(), "last", null);
        setField(term143809, term143809.getClass(), "propListHead", null);
        setIntField(term143809, term143809.getClass(), "sourcePosition", 0);
        setField(term143809, term143809.getClass(), "jsType", null);
        setField(term143809, term143809.getClass(), "parent", null);
        setField(term143807, term143807.getClass(), "first", term143809);
        setField(term143807, term143807.getClass(), "last", null);
        setField(term143807, term143807.getClass(), "propListHead", null);
        setIntField(term143807, term143807.getClass(), "sourcePosition", 0);
        setField(term143807, term143807.getClass(), "jsType", null);
        setField(term143807, term143807.getClass(), "parent", null);
        setField(term143806, term143806.getClass(), "first", term143807);
        setField(term143806, term143806.getClass(), "last", null);
        setField(term143806, term143806.getClass(), "propListHead", null);
        setIntField(term143806, term143806.getClass(), "sourcePosition", 0);
        setField(term143806, term143806.getClass(), "jsType", null);
        setField(term143806, term143806.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term143029;
        callMethod(klass, "process", argTypes, term142937, args);
        assertTrue(recursiveEquals(term142937, term143805));
        assertTrue(recursiveEquals(term143029, null));
    }

};


