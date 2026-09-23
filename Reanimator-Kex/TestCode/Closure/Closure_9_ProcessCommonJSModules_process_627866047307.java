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

public class ProcessCommonJSModules_process_627866047307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157223;
     Object term157293;
     Object term158488;
     Object term158489;

    public ProcessCommonJSModules_process_627866047307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157223 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term157223, term157223.getClass(), "compiler", null);
        term157293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term157293, term157293.getClass(), "type", 0);
        setField(term157293, term157293.getClass(), "parent", null);
        setField(term157385, term157385.getClass(), "next", null);
        setIntField(term157385, term157385.getClass(), "type", 0);
        setField(term157477, term157477.getClass(), "next", null);
        setIntField(term157477, term157477.getClass(), "type", 37);
        setField(term157477, term157477.getClass(), "first", null);
        setField(term157385, term157385.getClass(), "first", term157477);
        setField(term157293, term157293.getClass(), "first", term157385);
        term158488 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term158488, term158488.getClass(), "compiler", null);
        setField(term158488, term158488.getClass(), "filenamePrefix", null);
        setBooleanField(term158488, term158488.getClass(), "reportDependencies", false);
        setField(term158488, term158488.getClass(), "module", null);
        term158489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term158490 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term158489, term158489.getClass(), "type", 0);
        setField(term158489, term158489.getClass(), "next", null);
        setDoubleField(term158490, term158490.getClass(), "number", 0.0);
        setIntField(term158490, term158490.getClass(), "type", 0);
        setField(term158490, term158490.getClass(), "next", null);
        setDoubleField(term158491, term158491.getClass(), "number", 0.0);
        setIntField(term158491, term158491.getClass(), "type", 37);
        setField(term158491, term158491.getClass(), "next", null);
        setField(term158491, term158491.getClass(), "first", null);
        setField(term158491, term158491.getClass(), "last", null);
        setField(term158491, term158491.getClass(), "propListHead", null);
        setIntField(term158491, term158491.getClass(), "sourcePosition", 0);
        setField(term158491, term158491.getClass(), "jsType", null);
        setField(term158491, term158491.getClass(), "parent", null);
        setField(term158490, term158490.getClass(), "first", term158491);
        setField(term158490, term158490.getClass(), "last", null);
        setField(term158490, term158490.getClass(), "propListHead", null);
        setIntField(term158490, term158490.getClass(), "sourcePosition", 0);
        setField(term158490, term158490.getClass(), "jsType", null);
        setField(term158490, term158490.getClass(), "parent", null);
        setField(term158489, term158489.getClass(), "first", term158490);
        setField(term158489, term158489.getClass(), "last", null);
        setField(term158489, term158489.getClass(), "propListHead", null);
        setIntField(term158489, term158489.getClass(), "sourcePosition", 0);
        setField(term158489, term158489.getClass(), "jsType", null);
        setField(term158489, term158489.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term157293;
        callMethod(klass, "process", argTypes, term157223, args);
        assertTrue(recursiveEquals(term157223, term158488));
        assertTrue(recursiveEquals(term157293, null));
    }

};


