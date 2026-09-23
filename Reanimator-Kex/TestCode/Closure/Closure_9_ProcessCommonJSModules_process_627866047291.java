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

public class ProcessCommonJSModules_process_627866047291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149549;
     Object term149641;

    public ProcessCommonJSModules_process_627866047291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149549 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term149549, term149549.getClass(), "compiler", null);
        term149641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149987 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term149641, term149641.getClass(), "type", 0);
        setField(term149641, term149641.getClass(), "parent", null);
        setField(term149825, term149825.getClass(), "next", term149895);
        setIntField(term149825, term149825.getClass(), "type", 37);
        setField(term149825, term149825.getClass(), "first", null);
        setField(term149733, term149733.getClass(), "next", term149825);
        setIntField(term149733, term149733.getClass(), "type", 0);
        setField(term149987, term149987.getClass(), "next", null);
        setIntField(term149987, term149987.getClass(), "type", 0);
        setField(term149987, term149987.getClass(), "first", null);
        setField(term149733, term149733.getClass(), "first", term149987);
        setField(term149641, term149641.getClass(), "first", term149733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term149641;
        callMethod(klass, "process", argTypes, term149549, args);
        assertTrue(recursiveEquals(term149641, null));
    }

};


