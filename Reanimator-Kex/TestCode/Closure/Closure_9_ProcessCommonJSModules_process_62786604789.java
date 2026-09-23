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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_62786604789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36156;
     Object term36226;

    public ProcessCommonJSModules_process_62786604789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36156 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term36156, term36156.getClass(), "compiler", null);
        term36226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term36226, term36226.getClass(), "type", 0);
        setField(term36226, term36226.getClass(), "parent", null);
        setField(term36388, term36388.getClass(), "next", term36458);
        setIntField(term36388, term36388.getClass(), "type", 33);
        setField(term36388, term36388.getClass(), "first", null);
        setField(term36296, term36296.getClass(), "next", term36388);
        setIntField(term36296, term36296.getClass(), "type", 0);
        setField(term36550, term36550.getClass(), "next", null);
        setIntField(term36550, term36550.getClass(), "type", 0);
        setField(term36550, term36550.getClass(), "first", null);
        setField(term36296, term36296.getClass(), "first", term36550);
        setField(term36226, term36226.getClass(), "first", term36296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term36226;
        try {
            callMethod(klass, "process", argTypes, term36156, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


