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
import java.lang.reflect.InvocationTargetException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142160;
     Object term142252;

    public ProcessCommonJSModules_process_627866047278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142160 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term142160, term142160.getClass(), "compiler", null);
        term142252 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142344 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term142252, term142252.getClass(), "type", 0);
        setField(term142252, term142252.getClass(), "parent", null);
        setField(term142436, term142436.getClass(), "next", term142506);
        setIntField(term142436, term142436.getClass(), "type", 33);
        setField(term142436, term142436.getClass(), "first", null);
        setField(term142344, term142344.getClass(), "next", term142436);
        setIntField(term142344, term142344.getClass(), "type", 0);
        setField(term142598, term142598.getClass(), "next", null);
        setIntField(term142598, term142598.getClass(), "type", 37);
        setField(term142598, term142598.getClass(), "first", null);
        setField(term142344, term142344.getClass(), "first", term142598);
        setField(term142252, term142252.getClass(), "first", term142344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term142252;
        try {
            callMethod(klass, "process", argTypes, term142160, args);
            assertTrue(false);
        }
        catch (InvocationTargetException e) {
        }

    }

};


