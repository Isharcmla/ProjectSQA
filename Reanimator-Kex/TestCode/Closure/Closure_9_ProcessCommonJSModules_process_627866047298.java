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

public class ProcessCommonJSModules_process_627866047298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153314;
     Object term153486;

    public ProcessCommonJSModules_process_627866047298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153314 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term153394 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term153314, term153314.getClass(), "compiler", term153394);
        term153486 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term153740 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term153486, term153486.getClass(), "type", 33);
        setField(term153486, term153486.getClass(), "parent", null);
        setField(term153648, term153648.getClass(), "next", null);
        setIntField(term153648, term153648.getClass(), "type", 0);
        setField(term153648, term153648.getClass(), "first", null);
        setField(term153578, term153578.getClass(), "next", term153648);
        setIntField(term153578, term153578.getClass(), "type", 0);
        setField(term153740, term153740.getClass(), "next", null);
        setIntField(term153740, term153740.getClass(), "type", 0);
        setField(term153740, term153740.getClass(), "first", null);
        setField(term153578, term153578.getClass(), "first", term153740);
        setField(term153486, term153486.getClass(), "first", term153578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term153486;
        callMethod(klass, "process", argTypes, term153314, args);
    }

};


