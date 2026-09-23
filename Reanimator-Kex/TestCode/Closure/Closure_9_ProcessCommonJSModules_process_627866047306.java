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

public class ProcessCommonJSModules_process_627866047306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156473;
     Object term156565;

    public ProcessCommonJSModules_process_627866047306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156473 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term156473, term156473.getClass(), "compiler", null);
        term156565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156819 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156911 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term156565, term156565.getClass(), "type", 0);
        setField(term156565, term156565.getClass(), "parent", null);
        setField(term156657, term156657.getClass(), "next", term156727);
        setIntField(term156657, term156657.getClass(), "type", 0);
        setField(term156911, term156911.getClass(), "next", term156657);
        setIntField(term156911, term156911.getClass(), "type", 33);
        setField(term156911, term156911.getClass(), "first", null);
        setField(term156819, term156819.getClass(), "next", term156911);
        setIntField(term156819, term156819.getClass(), "type", 37);
        setField(term156819, term156819.getClass(), "first", null);
        setField(term156657, term156657.getClass(), "first", term156819);
        setField(term156565, term156565.getClass(), "first", term156657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term156565;
        try {
            callMethod(klass, "process", argTypes, term156473, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


