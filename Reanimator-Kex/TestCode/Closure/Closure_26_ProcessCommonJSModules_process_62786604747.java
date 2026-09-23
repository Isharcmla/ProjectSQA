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

public class ProcessCommonJSModules_process_62786604747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25219;
     Object term25311;

    public ProcessCommonJSModules_process_62786604747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25219 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term25219, term25219.getClass(), "compiler", null);
        term25311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term25311, term25311.getClass(), "type", 0);
        setField(term25311, term25311.getClass(), "parent", null);
        setField(term25495, term25495.getClass(), "next", term25565);
        setIntField(term25495, term25495.getClass(), "type", 33);
        setField(term25495, term25495.getClass(), "first", null);
        setField(term25403, term25403.getClass(), "next", term25495);
        setIntField(term25403, term25403.getClass(), "type", 0);
        setField(term25657, term25657.getClass(), "next", null);
        setIntField(term25657, term25657.getClass(), "type", 0);
        setField(term25657, term25657.getClass(), "first", null);
        setField(term25403, term25403.getClass(), "first", term25657);
        setField(term25311, term25311.getClass(), "first", term25403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term25311;
        try {
            callMethod(klass, "process", argTypes, term25219, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


