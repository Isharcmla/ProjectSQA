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

public class ProcessCommonJSModules_process_627866047173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86871;
     Object term86963;

    public ProcessCommonJSModules_process_627866047173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86871 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term86871, term86871.getClass(), "compiler", null);
        term86963 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87055 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87147 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term86963, term86963.getClass(), "type", 37);
        setField(term86963, term86963.getClass(), "parent", null);
        setField(term87147, term87147.getClass(), "next", null);
        setIntField(term87147, term87147.getClass(), "type", 37);
        setField(term87147, term87147.getClass(), "first", null);
        setField(term87055, term87055.getClass(), "next", term87147);
        setIntField(term87055, term87055.getClass(), "type", 0);
        setField(term87055, term87055.getClass(), "first", null);
        setField(term86963, term86963.getClass(), "first", term87055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term86963;
        callMethod(klass, "process", argTypes, term86871, args);
    }

};


