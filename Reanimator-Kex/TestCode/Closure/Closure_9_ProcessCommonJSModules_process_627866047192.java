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

public class ProcessCommonJSModules_process_627866047192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95699;
     Object term95791;
     Object term98029;
     Object term98030;

    public ProcessCommonJSModules_process_627866047192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95699 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term95699, term95699.getClass(), "compiler", null);
        term95791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term95883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term95975 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96067 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term95791, term95791.getClass(), "type", 0);
        setField(term95791, term95791.getClass(), "parent", null);
        setField(term95975, term95975.getClass(), "next", null);
        setIntField(term95975, term95975.getClass(), "type", 37);
        setField(term95975, term95975.getClass(), "first", null);
        setField(term95883, term95883.getClass(), "next", term95975);
        setIntField(term95883, term95883.getClass(), "type", 0);
        setField(term96067, term96067.getClass(), "next", null);
        setIntField(term96067, term96067.getClass(), "type", 37);
        setField(term96067, term96067.getClass(), "first", null);
        setField(term95883, term95883.getClass(), "first", term96067);
        setField(term95791, term95791.getClass(), "first", term95883);
        term98029 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term98029, term98029.getClass(), "compiler", null);
        setField(term98029, term98029.getClass(), "filenamePrefix", null);
        setBooleanField(term98029, term98029.getClass(), "reportDependencies", false);
        setField(term98029, term98029.getClass(), "module", null);
        term98030 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98031 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98032 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term98030, term98030.getClass(), "number", 0.0);
        setIntField(term98030, term98030.getClass(), "type", 0);
        setField(term98030, term98030.getClass(), "next", null);
        setDoubleField(term98031, term98031.getClass(), "number", 0.0);
        setIntField(term98031, term98031.getClass(), "type", 0);
        setDoubleField(term98032, term98032.getClass(), "number", 0.0);
        setIntField(term98032, term98032.getClass(), "type", 37);
        setField(term98032, term98032.getClass(), "next", null);
        setField(term98032, term98032.getClass(), "first", null);
        setField(term98032, term98032.getClass(), "last", null);
        setField(term98032, term98032.getClass(), "propListHead", null);
        setIntField(term98032, term98032.getClass(), "sourcePosition", 0);
        setField(term98032, term98032.getClass(), "jsType", null);
        setField(term98032, term98032.getClass(), "parent", null);
        setField(term98031, term98031.getClass(), "next", term98032);
        setDoubleField(term98033, term98033.getClass(), "number", 0);
        setIntField(term98033, term98033.getClass(), "type", 37);
        setField(term98033, term98033.getClass(), "next", null);
        setField(term98033, term98033.getClass(), "first", null);
        setField(term98033, term98033.getClass(), "last", null);
        setField(term98033, term98033.getClass(), "propListHead", null);
        setIntField(term98033, term98033.getClass(), "sourcePosition", 0);
        setField(term98033, term98033.getClass(), "jsType", null);
        setField(term98033, term98033.getClass(), "parent", null);
        setField(term98031, term98031.getClass(), "first", term98033);
        setField(term98031, term98031.getClass(), "last", null);
        setField(term98031, term98031.getClass(), "propListHead", null);
        setIntField(term98031, term98031.getClass(), "sourcePosition", 0);
        setField(term98031, term98031.getClass(), "jsType", null);
        setField(term98031, term98031.getClass(), "parent", null);
        setField(term98030, term98030.getClass(), "first", term98031);
        setField(term98030, term98030.getClass(), "last", null);
        setField(term98030, term98030.getClass(), "propListHead", null);
        setIntField(term98030, term98030.getClass(), "sourcePosition", 0);
        setField(term98030, term98030.getClass(), "jsType", null);
        setField(term98030, term98030.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term95791;
        callMethod(klass, "process", argTypes, term95699, args);
        assertTrue(recursiveEquals(term95699, term98029));
        assertTrue(recursiveEquals(term95791, null));
    }

};


