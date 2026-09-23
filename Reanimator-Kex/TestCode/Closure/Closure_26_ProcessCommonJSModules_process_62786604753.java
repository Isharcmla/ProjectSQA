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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_62786604753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28699;
     Object term28849;

    public ProcessCommonJSModules_process_62786604753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28699 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term28779 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term28699, term28699.getClass(), "compiler", term28779);
        term28849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28849, term28849.getClass(), "type", 0);
        setField(term28849, term28849.getClass(), "parent", null);
        setField(term28989, term28989.getClass(), "next", term29059);
        setIntField(term28989, term28989.getClass(), "type", 33);
        setField(term28989, term28989.getClass(), "first", null);
        setField(term28919, term28919.getClass(), "next", term28989);
        setIntField(term28919, term28919.getClass(), "type", 0);
        setField(term29199, term29199.getClass(), "next", null);
        setIntField(term29199, term29199.getClass(), "type", 0);
        setField(term29199, term29199.getClass(), "first", null);
        setField(term29129, term29129.getClass(), "next", term29199);
        setIntField(term29129, term29129.getClass(), "type", 0);
        setField(term29129, term29129.getClass(), "first", null);
        setField(term28919, term28919.getClass(), "first", term29129);
        setField(term28849, term28849.getClass(), "first", term28919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28849;
        try {
            callMethod(klass, "process", argTypes, term28699, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


