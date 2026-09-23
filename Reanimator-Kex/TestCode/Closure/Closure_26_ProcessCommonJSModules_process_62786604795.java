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

public class ProcessCommonJSModules_process_62786604795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51148;
     Object term51320;

    public ProcessCommonJSModules_process_62786604795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51148 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term51228 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term51148, term51148.getClass(), "compiler", term51228);
        term51320 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51320, term51320.getClass(), "type", 0);
        setField(term51320, term51320.getClass(), "parent", null);
        setField(term51412, term51412.getClass(), "next", term51482);
        setIntField(term51412, term51412.getClass(), "type", 0);
        setField(term51412, term51412.getClass(), "first", null);
        setField(term51320, term51320.getClass(), "first", term51412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term51320;
        callMethod(klass, "process", argTypes, term51148, args);
    }

};


