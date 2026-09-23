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

public class ProcessCommonJSModules_process_62786604743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23320;
     Object term23390;
     Object term24202;
     Object term24203;

    public ProcessCommonJSModules_process_62786604743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23320 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term23320, term23320.getClass(), "compiler", null);
        term23390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23390, term23390.getClass(), "type", 0);
        setField(term23390, term23390.getClass(), "parent", null);
        setField(term23460, term23460.getClass(), "next", null);
        setIntField(term23460, term23460.getClass(), "type", 0);
        setField(term23600, term23600.getClass(), "next", null);
        setIntField(term23600, term23600.getClass(), "type", 0);
        setField(term23600, term23600.getClass(), "first", null);
        setField(term23530, term23530.getClass(), "next", term23600);
        setIntField(term23530, term23530.getClass(), "type", 0);
        setField(term23530, term23530.getClass(), "first", null);
        setField(term23460, term23460.getClass(), "first", term23530);
        setField(term23390, term23390.getClass(), "first", term23460);
        term24202 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term24202, term24202.getClass(), "compiler", null);
        setField(term24202, term24202.getClass(), "filenamePrefix", null);
        setBooleanField(term24202, term24202.getClass(), "reportDependencies", false);
        setField(term24202, term24202.getClass(), "module", null);
        term24203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24203, term24203.getClass(), "type", 0);
        setField(term24203, term24203.getClass(), "next", null);
        setIntField(term24204, term24204.getClass(), "type", 0);
        setField(term24204, term24204.getClass(), "next", null);
        setIntField(term24205, term24205.getClass(), "type", 0);
        setIntField(term24206, term24206.getClass(), "type", 0);
        setField(term24206, term24206.getClass(), "next", null);
        setField(term24206, term24206.getClass(), "first", null);
        setField(term24206, term24206.getClass(), "last", null);
        setField(term24206, term24206.getClass(), "propListHead", null);
        setIntField(term24206, term24206.getClass(), "sourcePosition", 0);
        setField(term24206, term24206.getClass(), "jsType", null);
        setField(term24206, term24206.getClass(), "parent", null);
        setField(term24205, term24205.getClass(), "next", term24206);
        setField(term24205, term24205.getClass(), "first", null);
        setField(term24205, term24205.getClass(), "last", null);
        setField(term24205, term24205.getClass(), "propListHead", null);
        setIntField(term24205, term24205.getClass(), "sourcePosition", 0);
        setField(term24205, term24205.getClass(), "jsType", null);
        setField(term24205, term24205.getClass(), "parent", null);
        setField(term24204, term24204.getClass(), "first", term24205);
        setField(term24204, term24204.getClass(), "last", null);
        setField(term24204, term24204.getClass(), "propListHead", null);
        setIntField(term24204, term24204.getClass(), "sourcePosition", 0);
        setField(term24204, term24204.getClass(), "jsType", null);
        setField(term24204, term24204.getClass(), "parent", null);
        setField(term24203, term24203.getClass(), "first", term24204);
        setField(term24203, term24203.getClass(), "last", null);
        setField(term24203, term24203.getClass(), "propListHead", null);
        setIntField(term24203, term24203.getClass(), "sourcePosition", 0);
        setField(term24203, term24203.getClass(), "jsType", null);
        setField(term24203, term24203.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23390;
        callMethod(klass, "process", argTypes, term23320, args);
        assertTrue(recursiveEquals(term23320, term24202));
        assertTrue(recursiveEquals(term23390, null));
    }

};


