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

public class ProcessCommonJSModules_process_627866047170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84053;
     Object term84203;

    public ProcessCommonJSModules_process_627866047170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84053 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term84133 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term84053, term84053.getClass(), "compiler", term84133);
        term84203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84295 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84571 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term84203, term84203.getClass(), "type", 0);
        setField(term84203, term84203.getClass(), "parent", null);
        setField(term84479, term84479.getClass(), "next", term84203);
        setIntField(term84479, term84479.getClass(), "type", 37);
        setField(term84479, term84479.getClass(), "first", null);
        setField(term84387, term84387.getClass(), "next", term84479);
        setIntField(term84387, term84387.getClass(), "type", 37);
        setField(term84387, term84387.getClass(), "first", null);
        setField(term84295, term84295.getClass(), "next", term84387);
        setIntField(term84295, term84295.getClass(), "type", 0);
        setField(term84663, term84663.getClass(), "next", null);
        setIntField(term84663, term84663.getClass(), "type", 0);
        setField(term84663, term84663.getClass(), "first", null);
        setField(term84571, term84571.getClass(), "next", term84663);
        setIntField(term84571, term84571.getClass(), "type", 0);
        setField(term84571, term84571.getClass(), "first", null);
        setField(term84295, term84295.getClass(), "first", term84571);
        setField(term84203, term84203.getClass(), "first", term84295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term84203;
        callMethod(klass, "process", argTypes, term84053, args);
    }

};


