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

public class ProcessCommonJSModules_process_627866047131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60822;
     Object term60914;
     Object term61474;
     Object term61475;

    public ProcessCommonJSModules_process_627866047131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60822 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term60822, term60822.getClass(), "compiler", null);
        term60914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61006 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term60914, term60914.getClass(), "type", 0);
        setField(term60914, term60914.getClass(), "parent", null);
        setField(term61006, term61006.getClass(), "next", term61076);
        setIntField(term61006, term61006.getClass(), "type", 37);
        setField(term61168, term61168.getClass(), "next", null);
        setIntField(term61168, term61168.getClass(), "type", 37);
        setField(term61168, term61168.getClass(), "first", null);
        setField(term61006, term61006.getClass(), "first", term61168);
        setField(term60914, term60914.getClass(), "first", term61006);
        term61474 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term61474, term61474.getClass(), "compiler", null);
        setField(term61474, term61474.getClass(), "filenamePrefix", null);
        setBooleanField(term61474, term61474.getClass(), "reportDependencies", false);
        setField(term61474, term61474.getClass(), "module", null);
        term61475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term61475, term61475.getClass(), "number", 0.0);
        setIntField(term61475, term61475.getClass(), "type", 0);
        setField(term61475, term61475.getClass(), "next", null);
        setDoubleField(term61476, term61476.getClass(), "number", 0.0);
        setIntField(term61476, term61476.getClass(), "type", 37);
        setIntField(term61477, term61477.getClass(), "type", 0);
        setField(term61477, term61477.getClass(), "next", null);
        setField(term61477, term61477.getClass(), "first", null);
        setField(term61477, term61477.getClass(), "last", null);
        setField(term61477, term61477.getClass(), "propListHead", null);
        setIntField(term61477, term61477.getClass(), "sourcePosition", 0);
        setField(term61477, term61477.getClass(), "jsType", null);
        setField(term61477, term61477.getClass(), "parent", null);
        setField(term61476, term61476.getClass(), "next", term61477);
        setDoubleField(term61478, term61478.getClass(), "number", 0.0);
        setIntField(term61478, term61478.getClass(), "type", 37);
        setField(term61478, term61478.getClass(), "next", null);
        setField(term61478, term61478.getClass(), "first", null);
        setField(term61478, term61478.getClass(), "last", null);
        setField(term61478, term61478.getClass(), "propListHead", null);
        setIntField(term61478, term61478.getClass(), "sourcePosition", 0);
        setField(term61478, term61478.getClass(), "jsType", null);
        setField(term61478, term61478.getClass(), "parent", null);
        setField(term61476, term61476.getClass(), "first", term61478);
        setField(term61476, term61476.getClass(), "last", null);
        setField(term61476, term61476.getClass(), "propListHead", null);
        setIntField(term61476, term61476.getClass(), "sourcePosition", 0);
        setField(term61476, term61476.getClass(), "jsType", null);
        setField(term61476, term61476.getClass(), "parent", null);
        setField(term61475, term61475.getClass(), "first", term61476);
        setField(term61475, term61475.getClass(), "last", null);
        setField(term61475, term61475.getClass(), "propListHead", null);
        setIntField(term61475, term61475.getClass(), "sourcePosition", 0);
        setField(term61475, term61475.getClass(), "jsType", null);
        setField(term61475, term61475.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60914;
        callMethod(klass, "process", argTypes, term60822, args);
        assertTrue(recursiveEquals(term60822, term61474));
        assertTrue(recursiveEquals(term60914, null));
    }

};


