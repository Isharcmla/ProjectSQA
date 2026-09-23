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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218245;
     Object term218315;

    public ProcessCommonJSModules_process_627866047406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218245 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term218245, term218245.getClass(), "compiler", null);
        term218315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term218499 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term218315, term218315.getClass(), "type", 0);
        setField(term218315, term218315.getClass(), "parent", null);
        setField(term218407, term218407.getClass(), "next", null);
        setIntField(term218407, term218407.getClass(), "type", 0);
        setField(term218499, term218499.getClass(), "next", term218407);
        setIntField(term218499, term218499.getClass(), "type", 0);
        setField(term218499, term218499.getClass(), "first", null);
        setField(term218407, term218407.getClass(), "first", term218499);
        setField(term218315, term218315.getClass(), "first", term218407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term218315;
        try {
            callMethod(klass, "process", argTypes, term218245, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


