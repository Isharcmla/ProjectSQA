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

public class ProcessCommonJSModules_process_627866047293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150535;
     Object term150627;
     Object term150907;

    public ProcessCommonJSModules_process_627866047293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150535 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term150535, term150535.getClass(), "compiler", null);
        term150627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term150719 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term150811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term150627, term150627.getClass(), "type", 33);
        setField(term150627, term150627.getClass(), "parent", null);
        setField(term150811, term150811.getClass(), "next", null);
        setIntField(term150811, term150811.getClass(), "type", 0);
        setField(term150811, term150811.getClass(), "first", null);
        setField(term150719, term150719.getClass(), "next", term150811);
        setIntField(term150719, term150719.getClass(), "type", 0);
        setField(term150719, term150719.getClass(), "first", null);
        setField(term150627, term150627.getClass(), "first", term150719);
        term150907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term150908 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term150909 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term150907, term150907.getClass(), "number", 0.0);
        setIntField(term150907, term150907.getClass(), "type", 33);
        setField(term150907, term150907.getClass(), "next", null);
        setDoubleField(term150908, term150908.getClass(), "number", 0.0);
        setIntField(term150908, term150908.getClass(), "type", 0);
        setDoubleField(term150909, term150909.getClass(), "number", 0.0);
        setIntField(term150909, term150909.getClass(), "type", 0);
        setField(term150909, term150909.getClass(), "next", null);
        setField(term150909, term150909.getClass(), "first", null);
        setField(term150909, term150909.getClass(), "last", null);
        setField(term150909, term150909.getClass(), "propListHead", null);
        setIntField(term150909, term150909.getClass(), "sourcePosition", 0);
        setField(term150909, term150909.getClass(), "jsType", null);
        setField(term150909, term150909.getClass(), "parent", null);
        setField(term150908, term150908.getClass(), "next", term150909);
        setField(term150908, term150908.getClass(), "first", null);
        setField(term150908, term150908.getClass(), "last", null);
        setField(term150908, term150908.getClass(), "propListHead", null);
        setIntField(term150908, term150908.getClass(), "sourcePosition", 0);
        setField(term150908, term150908.getClass(), "jsType", null);
        setField(term150908, term150908.getClass(), "parent", null);
        setField(term150907, term150907.getClass(), "first", term150908);
        setField(term150907, term150907.getClass(), "last", null);
        setField(term150907, term150907.getClass(), "propListHead", null);
        setIntField(term150907, term150907.getClass(), "sourcePosition", 0);
        setField(term150907, term150907.getClass(), "jsType", null);
        setField(term150907, term150907.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term150627;
        callMethod(klass, "process", argTypes, term150535, args);
        assertTrue(recursiveEquals(term150627, null));
    }

};


