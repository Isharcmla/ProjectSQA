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

public class ProcessCommonJSModules_process_62786604795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40975;
     Object term41045;
     Object term41797;
     Object term41798;

    public ProcessCommonJSModules_process_62786604795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40975 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term40975, term40975.getClass(), "compiler", null);
        term41045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41229 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41045, term41045.getClass(), "type", 37);
        setField(term41045, term41045.getClass(), "parent", null);
        setField(term41229, term41229.getClass(), "next", null);
        setIntField(term41229, term41229.getClass(), "type", 0);
        setField(term41229, term41229.getClass(), "first", null);
        setField(term41137, term41137.getClass(), "next", term41229);
        setIntField(term41137, term41137.getClass(), "type", 0);
        setField(term41391, term41391.getClass(), "next", null);
        setIntField(term41391, term41391.getClass(), "type", 0);
        setField(term41391, term41391.getClass(), "first", null);
        setField(term41321, term41321.getClass(), "next", term41391);
        setIntField(term41321, term41321.getClass(), "type", 0);
        setField(term41321, term41321.getClass(), "first", null);
        setField(term41137, term41137.getClass(), "first", term41321);
        setField(term41045, term41045.getClass(), "first", term41137);
        term41797 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term41797, term41797.getClass(), "compiler", null);
        setField(term41797, term41797.getClass(), "filenamePrefix", null);
        setBooleanField(term41797, term41797.getClass(), "reportDependencies", false);
        setField(term41797, term41797.getClass(), "module", null);
        term41798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41800 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41801 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41798, term41798.getClass(), "type", 37);
        setField(term41798, term41798.getClass(), "next", null);
        setDoubleField(term41799, term41799.getClass(), "number", 0.0);
        setIntField(term41799, term41799.getClass(), "type", 0);
        setDoubleField(term41800, term41800.getClass(), "number", 0.0);
        setIntField(term41800, term41800.getClass(), "type", 0);
        setField(term41800, term41800.getClass(), "next", null);
        setField(term41800, term41800.getClass(), "first", null);
        setField(term41800, term41800.getClass(), "last", null);
        setField(term41800, term41800.getClass(), "propListHead", null);
        setIntField(term41800, term41800.getClass(), "sourcePosition", 0);
        setField(term41800, term41800.getClass(), "jsType", null);
        setField(term41800, term41800.getClass(), "parent", null);
        setField(term41799, term41799.getClass(), "next", term41800);
        setDoubleField(term41801, term41801.getClass(), "number", 0.0);
        setIntField(term41801, term41801.getClass(), "type", 0);
        setIntField(term41802, term41802.getClass(), "type", 0);
        setField(term41802, term41802.getClass(), "next", null);
        setField(term41802, term41802.getClass(), "first", null);
        setField(term41802, term41802.getClass(), "last", null);
        setField(term41802, term41802.getClass(), "propListHead", null);
        setIntField(term41802, term41802.getClass(), "sourcePosition", 0);
        setField(term41802, term41802.getClass(), "jsType", null);
        setField(term41802, term41802.getClass(), "parent", null);
        setField(term41801, term41801.getClass(), "next", term41802);
        setField(term41801, term41801.getClass(), "first", null);
        setField(term41801, term41801.getClass(), "last", null);
        setField(term41801, term41801.getClass(), "propListHead", null);
        setIntField(term41801, term41801.getClass(), "sourcePosition", 0);
        setField(term41801, term41801.getClass(), "jsType", null);
        setField(term41801, term41801.getClass(), "parent", null);
        setField(term41799, term41799.getClass(), "first", term41801);
        setField(term41799, term41799.getClass(), "last", null);
        setField(term41799, term41799.getClass(), "propListHead", null);
        setIntField(term41799, term41799.getClass(), "sourcePosition", 0);
        setField(term41799, term41799.getClass(), "jsType", null);
        setField(term41799, term41799.getClass(), "parent", null);
        setField(term41798, term41798.getClass(), "first", term41799);
        setField(term41798, term41798.getClass(), "last", null);
        setField(term41798, term41798.getClass(), "propListHead", null);
        setIntField(term41798, term41798.getClass(), "sourcePosition", 0);
        setField(term41798, term41798.getClass(), "jsType", null);
        setField(term41798, term41798.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41045;
        callMethod(klass, "process", argTypes, term40975, args);
        assertTrue(recursiveEquals(term40975, term41797));
        assertTrue(recursiveEquals(term41045, null));
    }

};


