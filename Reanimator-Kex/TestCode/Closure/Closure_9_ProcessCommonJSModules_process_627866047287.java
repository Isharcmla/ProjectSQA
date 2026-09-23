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

public class ProcessCommonJSModules_process_627866047287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148193;
     Object term148365;

    public ProcessCommonJSModules_process_627866047287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148193 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term148273 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term148193, term148193.getClass(), "compiler", term148273);
        term148365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term148457 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term148549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term148641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term148365, term148365.getClass(), "type", 37);
        setField(term148365, term148365.getClass(), "parent", null);
        setField(term148549, term148549.getClass(), "next", null);
        setIntField(term148549, term148549.getClass(), "type", 37);
        setField(term148549, term148549.getClass(), "first", null);
        setField(term148457, term148457.getClass(), "next", term148549);
        setIntField(term148457, term148457.getClass(), "type", 37);
        setField(term148641, term148641.getClass(), "next", null);
        setIntField(term148641, term148641.getClass(), "type", 0);
        setField(term148641, term148641.getClass(), "first", null);
        setField(term148457, term148457.getClass(), "first", term148641);
        setField(term148365, term148365.getClass(), "first", term148457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term148365;
        callMethod(klass, "process", argTypes, term148193, args);
    }

};


