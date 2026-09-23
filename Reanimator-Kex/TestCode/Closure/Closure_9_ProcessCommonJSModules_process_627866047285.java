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

public class ProcessCommonJSModules_process_627866047285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146323;
     Object term146415;

    public ProcessCommonJSModules_process_627866047285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146323 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term146323, term146323.getClass(), "compiler", null);
        term146415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term146507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term146599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term146415, term146415.getClass(), "type", 0);
        setField(term146415, term146415.getClass(), "parent", null);
        setField(term146599, term146599.getClass(), "next", null);
        setIntField(term146599, term146599.getClass(), "type", 33);
        setField(term146599, term146599.getClass(), "first", null);
        setField(term146507, term146507.getClass(), "next", term146599);
        setIntField(term146507, term146507.getClass(), "type", 37);
        setField(term146507, term146507.getClass(), "first", null);
        setField(term146415, term146415.getClass(), "first", term146507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term146415;
        try {
            callMethod(klass, "process", argTypes, term146323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


