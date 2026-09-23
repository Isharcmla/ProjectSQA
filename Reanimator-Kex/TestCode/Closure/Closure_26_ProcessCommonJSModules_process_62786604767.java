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

public class ProcessCommonJSModules_process_62786604767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36431;
     Object term36523;

    public ProcessCommonJSModules_process_62786604767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36431 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term36431, term36431.getClass(), "compiler", null);
        term36523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term36685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term36523, term36523.getClass(), "type", 0);
        setField(term36523, term36523.getClass(), "parent", null);
        setField(term36685, term36685.getClass(), "next", term36755);
        setIntField(term36685, term36685.getClass(), "type", 132);
        setField(term36615, term36615.getClass(), "next", term36685);
        setIntField(term36615, term36615.getClass(), "type", 0);
        setField(term36847, term36847.getClass(), "next", null);
        setIntField(term36847, term36847.getClass(), "type", 0);
        setField(term36847, term36847.getClass(), "first", null);
        setField(term36615, term36615.getClass(), "first", term36847);
        setField(term36523, term36523.getClass(), "first", term36615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term36523;
        try {
            callMethod(klass, "process", argTypes, term36431, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


