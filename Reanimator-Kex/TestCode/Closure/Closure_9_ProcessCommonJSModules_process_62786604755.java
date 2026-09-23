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

public class ProcessCommonJSModules_process_62786604755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18638;
     Object term18730;
     Object term19424;
     Object term19425;

    public ProcessCommonJSModules_process_62786604755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18638 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term18638, term18638.getClass(), "compiler", null);
        term18730 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term18822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term18892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term18730, term18730.getClass(), "type", 0);
        setField(term18730, term18730.getClass(), "parent", null);
        setField(term18892, term18892.getClass(), "next", term18962);
        setIntField(term18892, term18892.getClass(), "type", 37);
        setField(term18892, term18892.getClass(), "first", null);
        setField(term18822, term18822.getClass(), "next", term18892);
        setIntField(term18822, term18822.getClass(), "type", 37);
        setField(term19054, term19054.getClass(), "next", null);
        setIntField(term19054, term19054.getClass(), "type", 0);
        setField(term19054, term19054.getClass(), "first", null);
        setField(term18822, term18822.getClass(), "first", term19054);
        setField(term18730, term18730.getClass(), "first", term18822);
        term19424 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term19424, term19424.getClass(), "compiler", null);
        setField(term19424, term19424.getClass(), "filenamePrefix", null);
        setBooleanField(term19424, term19424.getClass(), "reportDependencies", false);
        setField(term19424, term19424.getClass(), "module", null);
        term19425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term19426 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term19427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term19425, term19425.getClass(), "number", 0.0);
        setIntField(term19425, term19425.getClass(), "type", 0);
        setField(term19425, term19425.getClass(), "next", null);
        setDoubleField(term19426, term19426.getClass(), "number", 0.0);
        setIntField(term19426, term19426.getClass(), "type", 37);
        setIntField(term19427, term19427.getClass(), "type", 37);
        setIntField(term19428, term19428.getClass(), "type", 0);
        setField(term19428, term19428.getClass(), "next", null);
        setField(term19428, term19428.getClass(), "first", null);
        setField(term19428, term19428.getClass(), "last", null);
        setField(term19428, term19428.getClass(), "propListHead", null);
        setIntField(term19428, term19428.getClass(), "sourcePosition", 0);
        setField(term19428, term19428.getClass(), "jsType", null);
        setField(term19428, term19428.getClass(), "parent", null);
        setField(term19427, term19427.getClass(), "next", term19428);
        setField(term19427, term19427.getClass(), "first", null);
        setField(term19427, term19427.getClass(), "last", null);
        setField(term19427, term19427.getClass(), "propListHead", null);
        setIntField(term19427, term19427.getClass(), "sourcePosition", 0);
        setField(term19427, term19427.getClass(), "jsType", null);
        setField(term19427, term19427.getClass(), "parent", null);
        setField(term19426, term19426.getClass(), "next", term19427);
        setDoubleField(term19429, term19429.getClass(), "number", 0.0);
        setIntField(term19429, term19429.getClass(), "type", 0);
        setField(term19429, term19429.getClass(), "next", null);
        setField(term19429, term19429.getClass(), "first", null);
        setField(term19429, term19429.getClass(), "last", null);
        setField(term19429, term19429.getClass(), "propListHead", null);
        setIntField(term19429, term19429.getClass(), "sourcePosition", 0);
        setField(term19429, term19429.getClass(), "jsType", null);
        setField(term19429, term19429.getClass(), "parent", null);
        setField(term19426, term19426.getClass(), "first", term19429);
        setField(term19426, term19426.getClass(), "last", null);
        setField(term19426, term19426.getClass(), "propListHead", null);
        setIntField(term19426, term19426.getClass(), "sourcePosition", 0);
        setField(term19426, term19426.getClass(), "jsType", null);
        setField(term19426, term19426.getClass(), "parent", null);
        setField(term19425, term19425.getClass(), "first", term19426);
        setField(term19425, term19425.getClass(), "last", null);
        setField(term19425, term19425.getClass(), "propListHead", null);
        setIntField(term19425, term19425.getClass(), "sourcePosition", 0);
        setField(term19425, term19425.getClass(), "jsType", null);
        setField(term19425, term19425.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term18730;
        callMethod(klass, "process", argTypes, term18638, args);
        assertTrue(recursiveEquals(term18638, term19424));
        assertTrue(recursiveEquals(term18730, null));
    }

};


