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

public class ProcessCommonJSModules_process_627866047161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77794;
     Object term77886;

    public ProcessCommonJSModules_process_627866047161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77794 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term77794, term77794.getClass(), "compiler", null);
        term77886 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term77978 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term77886, term77886.getClass(), "type", 0);
        setField(term77886, term77886.getClass(), "parent", null);
        setField(term77978, term77978.getClass(), "next", null);
        setIntField(term77978, term77978.getClass(), "type", 105);
        setField(term77886, term77886.getClass(), "first", term77978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term77886;
        try {
            callMethod(klass, "process", argTypes, term77794, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


