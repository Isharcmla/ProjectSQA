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

public class ProcessCommonJSModules_process_627866047183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94821;
     Object term94891;

    public ProcessCommonJSModules_process_627866047183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94821 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term94821, term94821.getClass(), "compiler", null);
        term94891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94983 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term95053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term95237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term95329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term94891, term94891.getClass(), "type", 0);
        setField(term94891, term94891.getClass(), "parent", null);
        setField(term94983, term94983.getClass(), "next", term95053);
        setIntField(term94983, term94983.getClass(), "type", 0);
        setField(term95237, term95237.getClass(), "next", term95329);
        setIntField(term95237, term95237.getClass(), "type", 33);
        setField(term95237, term95237.getClass(), "first", null);
        setField(term95145, term95145.getClass(), "next", term95237);
        setIntField(term95145, term95145.getClass(), "type", 37);
        setField(term95145, term95145.getClass(), "first", null);
        setField(term94983, term94983.getClass(), "first", term95145);
        setField(term94891, term94891.getClass(), "first", term94983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term94891;
        callMethod(klass, "process", argTypes, term94821, args);
    }

};


