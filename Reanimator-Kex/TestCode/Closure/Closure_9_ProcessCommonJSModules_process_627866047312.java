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

public class ProcessCommonJSModules_process_627866047312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159975;
     Object term160045;
     Object term161480;
     Object term161481;

    public ProcessCommonJSModules_process_627866047312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159975 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term159975, term159975.getClass(), "compiler", null);
        term160045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term160137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term160229 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term160321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term160413 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term160045, term160045.getClass(), "type", 0);
        setField(term160045, term160045.getClass(), "parent", null);
        setField(term160137, term160137.getClass(), "next", null);
        setIntField(term160137, term160137.getClass(), "type", 0);
        setField(term160413, term160413.getClass(), "next", null);
        setIntField(term160413, term160413.getClass(), "type", 0);
        setField(term160413, term160413.getClass(), "first", null);
        setField(term160321, term160321.getClass(), "next", term160413);
        setIntField(term160321, term160321.getClass(), "type", 37);
        setField(term160321, term160321.getClass(), "first", null);
        setField(term160229, term160229.getClass(), "next", term160321);
        setIntField(term160229, term160229.getClass(), "type", 0);
        setField(term160229, term160229.getClass(), "first", null);
        setField(term160137, term160137.getClass(), "first", term160229);
        setField(term160045, term160045.getClass(), "first", term160137);
        term161480 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term161480, term161480.getClass(), "compiler", null);
        setField(term161480, term161480.getClass(), "filenamePrefix", null);
        setBooleanField(term161480, term161480.getClass(), "reportDependencies", false);
        setField(term161480, term161480.getClass(), "module", null);
        term161481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161482 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161483 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161485 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term161481, term161481.getClass(), "type", 0);
        setField(term161481, term161481.getClass(), "next", null);
        setDoubleField(term161482, term161482.getClass(), "number", 0.0);
        setIntField(term161482, term161482.getClass(), "type", 0);
        setField(term161482, term161482.getClass(), "next", null);
        setDoubleField(term161483, term161483.getClass(), "number", 0.0);
        setIntField(term161483, term161483.getClass(), "type", 0);
        setDoubleField(term161484, term161484.getClass(), "number", 0.0);
        setIntField(term161484, term161484.getClass(), "type", 37);
        setDoubleField(term161485, term161485.getClass(), "number", 0.0);
        setIntField(term161485, term161485.getClass(), "type", 0);
        setField(term161485, term161485.getClass(), "next", null);
        setField(term161485, term161485.getClass(), "first", null);
        setField(term161485, term161485.getClass(), "last", null);
        setField(term161485, term161485.getClass(), "propListHead", null);
        setIntField(term161485, term161485.getClass(), "sourcePosition", 0);
        setField(term161485, term161485.getClass(), "jsType", null);
        setField(term161485, term161485.getClass(), "parent", null);
        setField(term161484, term161484.getClass(), "next", term161485);
        setField(term161484, term161484.getClass(), "first", null);
        setField(term161484, term161484.getClass(), "last", null);
        setField(term161484, term161484.getClass(), "propListHead", null);
        setIntField(term161484, term161484.getClass(), "sourcePosition", 0);
        setField(term161484, term161484.getClass(), "jsType", null);
        setField(term161484, term161484.getClass(), "parent", null);
        setField(term161483, term161483.getClass(), "next", term161484);
        setField(term161483, term161483.getClass(), "first", null);
        setField(term161483, term161483.getClass(), "last", null);
        setField(term161483, term161483.getClass(), "propListHead", null);
        setIntField(term161483, term161483.getClass(), "sourcePosition", 0);
        setField(term161483, term161483.getClass(), "jsType", null);
        setField(term161483, term161483.getClass(), "parent", null);
        setField(term161482, term161482.getClass(), "first", term161483);
        setField(term161482, term161482.getClass(), "last", null);
        setField(term161482, term161482.getClass(), "propListHead", null);
        setIntField(term161482, term161482.getClass(), "sourcePosition", 0);
        setField(term161482, term161482.getClass(), "jsType", null);
        setField(term161482, term161482.getClass(), "parent", null);
        setField(term161481, term161481.getClass(), "first", term161482);
        setField(term161481, term161481.getClass(), "last", null);
        setField(term161481, term161481.getClass(), "propListHead", null);
        setIntField(term161481, term161481.getClass(), "sourcePosition", 0);
        setField(term161481, term161481.getClass(), "jsType", null);
        setField(term161481, term161481.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term160045;
        callMethod(klass, "process", argTypes, term159975, args);
        assertTrue(recursiveEquals(term159975, term161480));
        assertTrue(recursiveEquals(term160045, null));
    }

};


