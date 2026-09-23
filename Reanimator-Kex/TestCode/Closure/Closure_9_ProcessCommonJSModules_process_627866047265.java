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
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137023;
     Object term137115;

    public ProcessCommonJSModules_process_627866047265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137023 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term137023, term137023.getClass(), "compiler", null);
        term137115 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137207 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137299 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137531 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term137115, term137115.getClass(), "type", 0);
        setField(term137115, term137115.getClass(), "parent", null);
        setField(term137369, term137369.getClass(), "next", term137439);
        setIntField(term137369, term137369.getClass(), "type", 37);
        setField(term137369, term137369.getClass(), "first", null);
        setField(term137299, term137299.getClass(), "next", term137369);
        setIntField(term137299, term137299.getClass(), "type", 37);
        setField(term137299, term137299.getClass(), "first", null);
        setField(term137207, term137207.getClass(), "next", term137299);
        setIntField(term137207, term137207.getClass(), "type", 37);
        setField(term137531, term137531.getClass(), "next", null);
        setIntField(term137531, term137531.getClass(), "type", 0);
        setField(term137531, term137531.getClass(), "first", null);
        setField(term137207, term137207.getClass(), "first", term137531);
        setField(term137115, term137115.getClass(), "first", term137207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term137115;
        callMethod(klass, "process", argTypes, term137023, args);
    }

};


