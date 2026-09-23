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

public class ProcessCommonJSModules_process_627866047110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48454;
     Object term48546;
     Object term50199;
     Object term50200;

    public ProcessCommonJSModules_process_627866047110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48454 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term48454, term48454.getClass(), "compiler", null);
        term48546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term48638 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term48730 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term48800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term48546, term48546.getClass(), "type", 0);
        setField(term48546, term48546.getClass(), "parent", null);
        setField(term48800, term48800.getClass(), "next", term48870);
        setIntField(term48800, term48800.getClass(), "type", 37);
        setField(term48800, term48800.getClass(), "first", null);
        setField(term48730, term48730.getClass(), "next", term48800);
        setIntField(term48730, term48730.getClass(), "type", 37);
        setField(term48730, term48730.getClass(), "first", null);
        setField(term48638, term48638.getClass(), "next", term48730);
        setIntField(term48638, term48638.getClass(), "type", 0);
        setField(term48962, term48962.getClass(), "next", null);
        setIntField(term48962, term48962.getClass(), "type", 0);
        setField(term48962, term48962.getClass(), "first", null);
        setField(term48638, term48638.getClass(), "first", term48962);
        setField(term48546, term48546.getClass(), "first", term48638);
        term50199 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term50199, term50199.getClass(), "compiler", null);
        setField(term50199, term50199.getClass(), "filenamePrefix", null);
        setBooleanField(term50199, term50199.getClass(), "reportDependencies", false);
        setField(term50199, term50199.getClass(), "module", null);
        term50200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50201 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50205 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term50200, term50200.getClass(), "number", 0.0);
        setIntField(term50200, term50200.getClass(), "type", 0);
        setField(term50200, term50200.getClass(), "next", null);
        setDoubleField(term50201, term50201.getClass(), "number", 0.0);
        setIntField(term50201, term50201.getClass(), "type", 0);
        setDoubleField(term50202, term50202.getClass(), "number", 0.0);
        setIntField(term50202, term50202.getClass(), "type", 37);
        setIntField(term50203, term50203.getClass(), "type", 37);
        setIntField(term50204, term50204.getClass(), "type", 0);
        setField(term50204, term50204.getClass(), "next", null);
        setField(term50204, term50204.getClass(), "first", null);
        setField(term50204, term50204.getClass(), "last", null);
        setField(term50204, term50204.getClass(), "propListHead", null);
        setIntField(term50204, term50204.getClass(), "sourcePosition", 0);
        setField(term50204, term50204.getClass(), "jsType", null);
        setField(term50204, term50204.getClass(), "parent", null);
        setField(term50203, term50203.getClass(), "next", term50204);
        setField(term50203, term50203.getClass(), "first", null);
        setField(term50203, term50203.getClass(), "last", null);
        setField(term50203, term50203.getClass(), "propListHead", null);
        setIntField(term50203, term50203.getClass(), "sourcePosition", 0);
        setField(term50203, term50203.getClass(), "jsType", null);
        setField(term50203, term50203.getClass(), "parent", null);
        setField(term50202, term50202.getClass(), "next", term50203);
        setField(term50202, term50202.getClass(), "first", null);
        setField(term50202, term50202.getClass(), "last", null);
        setField(term50202, term50202.getClass(), "propListHead", null);
        setIntField(term50202, term50202.getClass(), "sourcePosition", 0);
        setField(term50202, term50202.getClass(), "jsType", null);
        setField(term50202, term50202.getClass(), "parent", null);
        setField(term50201, term50201.getClass(), "next", term50202);
        setDoubleField(term50205, term50205.getClass(), "number", 0.0);
        setIntField(term50205, term50205.getClass(), "type", 0);
        setField(term50205, term50205.getClass(), "next", null);
        setField(term50205, term50205.getClass(), "first", null);
        setField(term50205, term50205.getClass(), "last", null);
        setField(term50205, term50205.getClass(), "propListHead", null);
        setIntField(term50205, term50205.getClass(), "sourcePosition", 0);
        setField(term50205, term50205.getClass(), "jsType", null);
        setField(term50205, term50205.getClass(), "parent", null);
        setField(term50201, term50201.getClass(), "first", term50205);
        setField(term50201, term50201.getClass(), "last", null);
        setField(term50201, term50201.getClass(), "propListHead", null);
        setIntField(term50201, term50201.getClass(), "sourcePosition", 0);
        setField(term50201, term50201.getClass(), "jsType", null);
        setField(term50201, term50201.getClass(), "parent", null);
        setField(term50200, term50200.getClass(), "first", term50201);
        setField(term50200, term50200.getClass(), "last", null);
        setField(term50200, term50200.getClass(), "propListHead", null);
        setIntField(term50200, term50200.getClass(), "sourcePosition", 0);
        setField(term50200, term50200.getClass(), "jsType", null);
        setField(term50200, term50200.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term48546;
        callMethod(klass, "process", argTypes, term48454, args);
        assertTrue(recursiveEquals(term48454, term50199));
        assertTrue(recursiveEquals(term48546, null));
    }

};


