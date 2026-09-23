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

public class ProcessCommonJSModules_process_627866047262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135060;
     Object term135232;

    public ProcessCommonJSModules_process_627866047262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135060 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term135140 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term135060, term135060.getClass(), "compiler", term135140);
        term135232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term135324 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term135416 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term135486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term135232, term135232.getClass(), "type", 0);
        setField(term135232, term135232.getClass(), "parent", null);
        setField(term135416, term135416.getClass(), "next", term135486);
        setIntField(term135416, term135416.getClass(), "type", 0);
        setField(term135416, term135416.getClass(), "first", null);
        setField(term135324, term135324.getClass(), "next", term135416);
        setIntField(term135324, term135324.getClass(), "type", 37);
        setField(term135578, term135578.getClass(), "next", null);
        setIntField(term135578, term135578.getClass(), "type", 0);
        setField(term135578, term135578.getClass(), "first", null);
        setField(term135324, term135324.getClass(), "first", term135578);
        setField(term135232, term135232.getClass(), "first", term135324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term135232;
        callMethod(klass, "process", argTypes, term135060, args);
    }

};


