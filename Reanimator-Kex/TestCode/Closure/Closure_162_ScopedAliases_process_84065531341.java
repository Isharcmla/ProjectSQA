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

public class ScopedAliases_process_84065531341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20035;
     Object term20105;
     Object term20508;
     Object term20509;

    public ScopedAliases_process_84065531341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20035 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term20035, term20035.getClass(), "compiler", null);
        term20105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20105, term20105.getClass(), "type", 37);
        setField(term20105, term20105.getClass(), "parent", null);
        setField(term20175, term20175.getClass(), "next", null);
        setIntField(term20175, term20175.getClass(), "type", 42);
        setField(term20175, term20175.getClass(), "first", null);
        setField(term20105, term20105.getClass(), "first", term20175);
        term20508 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term20508, term20508.getClass(), "compiler", null);
        setField(term20508, term20508.getClass(), "preprocessorSymbolTable", null);
        setField(term20508, term20508.getClass(), "transformationHandler", null);
        term20509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20509, term20509.getClass(), "type", 37);
        setField(term20509, term20509.getClass(), "next", null);
        setIntField(term20510, term20510.getClass(), "type", 42);
        setField(term20510, term20510.getClass(), "next", null);
        setField(term20510, term20510.getClass(), "first", null);
        setField(term20510, term20510.getClass(), "last", null);
        setField(term20510, term20510.getClass(), "propListHead", null);
        setIntField(term20510, term20510.getClass(), "sourcePosition", 0);
        setField(term20510, term20510.getClass(), "jsType", null);
        setField(term20510, term20510.getClass(), "parent", null);
        setField(term20509, term20509.getClass(), "first", term20510);
        setField(term20509, term20509.getClass(), "last", null);
        setField(term20509, term20509.getClass(), "propListHead", null);
        setIntField(term20509, term20509.getClass(), "sourcePosition", 0);
        setField(term20509, term20509.getClass(), "jsType", null);
        setField(term20509, term20509.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20105;
        callMethod(klass, "process", argTypes, term20035, args);
        assertTrue(recursiveEquals(term20035, term20508));
        assertTrue(recursiveEquals(term20105, null));
    }

};


