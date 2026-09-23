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

public class ProcessCommonJSModules_process_627866047321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167239;
     Object term167309;
     Object term168220;
     Object term168221;

    public ProcessCommonJSModules_process_627866047321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167239 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term167239, term167239.getClass(), "compiler", null);
        term167309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167401 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167493 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167769 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term167309, term167309.getClass(), "type", 37);
        setField(term167309, term167309.getClass(), "parent", null);
        setField(term167585, term167585.getClass(), "next", null);
        setIntField(term167585, term167585.getClass(), "type", 0);
        setField(term167585, term167585.getClass(), "first", null);
        setField(term167493, term167493.getClass(), "next", term167585);
        setIntField(term167493, term167493.getClass(), "type", 37);
        setField(term167493, term167493.getClass(), "first", null);
        setField(term167401, term167401.getClass(), "next", term167493);
        setIntField(term167401, term167401.getClass(), "type", 0);
        setField(term167769, term167769.getClass(), "next", null);
        setIntField(term167769, term167769.getClass(), "type", 0);
        setField(term167769, term167769.getClass(), "first", null);
        setField(term167677, term167677.getClass(), "next", term167769);
        setIntField(term167677, term167677.getClass(), "type", 0);
        setField(term167677, term167677.getClass(), "first", null);
        setField(term167401, term167401.getClass(), "first", term167677);
        setField(term167309, term167309.getClass(), "first", term167401);
        term168220 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term168220, term168220.getClass(), "compiler", null);
        setField(term168220, term168220.getClass(), "filenamePrefix", null);
        setBooleanField(term168220, term168220.getClass(), "reportDependencies", false);
        setField(term168220, term168220.getClass(), "module", null);
        term168221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168222 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168223 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168224 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term168221, term168221.getClass(), "type", 37);
        setField(term168221, term168221.getClass(), "next", null);
        setDoubleField(term168222, term168222.getClass(), "number", 0.0);
        setIntField(term168222, term168222.getClass(), "type", 0);
        setDoubleField(term168223, term168223.getClass(), "number", 0.0);
        setIntField(term168223, term168223.getClass(), "type", 37);
        setDoubleField(term168224, term168224.getClass(), "number", 0.0);
        setIntField(term168224, term168224.getClass(), "type", 0);
        setField(term168224, term168224.getClass(), "next", null);
        setField(term168224, term168224.getClass(), "first", null);
        setField(term168224, term168224.getClass(), "last", null);
        setField(term168224, term168224.getClass(), "propListHead", null);
        setIntField(term168224, term168224.getClass(), "sourcePosition", 0);
        setField(term168224, term168224.getClass(), "jsType", null);
        setField(term168224, term168224.getClass(), "parent", null);
        setField(term168223, term168223.getClass(), "next", term168224);
        setField(term168223, term168223.getClass(), "first", null);
        setField(term168223, term168223.getClass(), "last", null);
        setField(term168223, term168223.getClass(), "propListHead", null);
        setIntField(term168223, term168223.getClass(), "sourcePosition", 0);
        setField(term168223, term168223.getClass(), "jsType", null);
        setField(term168223, term168223.getClass(), "parent", null);
        setField(term168222, term168222.getClass(), "next", term168223);
        setDoubleField(term168225, term168225.getClass(), "number", 0.0);
        setIntField(term168225, term168225.getClass(), "type", 0);
        setDoubleField(term168226, term168226.getClass(), "number", 0.0);
        setIntField(term168226, term168226.getClass(), "type", 0);
        setField(term168226, term168226.getClass(), "next", null);
        setField(term168226, term168226.getClass(), "first", null);
        setField(term168226, term168226.getClass(), "last", null);
        setField(term168226, term168226.getClass(), "propListHead", null);
        setIntField(term168226, term168226.getClass(), "sourcePosition", 0);
        setField(term168226, term168226.getClass(), "jsType", null);
        setField(term168226, term168226.getClass(), "parent", null);
        setField(term168225, term168225.getClass(), "next", term168226);
        setField(term168225, term168225.getClass(), "first", null);
        setField(term168225, term168225.getClass(), "last", null);
        setField(term168225, term168225.getClass(), "propListHead", null);
        setIntField(term168225, term168225.getClass(), "sourcePosition", 0);
        setField(term168225, term168225.getClass(), "jsType", null);
        setField(term168225, term168225.getClass(), "parent", null);
        setField(term168222, term168222.getClass(), "first", term168225);
        setField(term168222, term168222.getClass(), "last", null);
        setField(term168222, term168222.getClass(), "propListHead", null);
        setIntField(term168222, term168222.getClass(), "sourcePosition", 0);
        setField(term168222, term168222.getClass(), "jsType", null);
        setField(term168222, term168222.getClass(), "parent", null);
        setField(term168221, term168221.getClass(), "first", term168222);
        setField(term168221, term168221.getClass(), "last", null);
        setField(term168221, term168221.getClass(), "propListHead", null);
        setIntField(term168221, term168221.getClass(), "sourcePosition", 0);
        setField(term168221, term168221.getClass(), "jsType", null);
        setField(term168221, term168221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term167309;
        callMethod(klass, "process", argTypes, term167239, args);
        assertTrue(recursiveEquals(term167239, term168220));
        assertTrue(recursiveEquals(term167309, null));
    }

};


