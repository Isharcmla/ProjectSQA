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

public class ProcessCommonJSModules_process_62786604777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41027;
     Object term41097;

    public ProcessCommonJSModules_process_62786604777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41027 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term41027, term41027.getClass(), "compiler", null);
        term41097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41189 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41351 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41097, term41097.getClass(), "type", 0);
        setField(term41097, term41097.getClass(), "parent", null);
        setField(term41189, term41189.getClass(), "next", term41259);
        setIntField(term41189, term41189.getClass(), "type", 0);
        setField(term41351, term41351.getClass(), "next", term41421);
        setIntField(term41351, term41351.getClass(), "type", 33);
        setField(term41351, term41351.getClass(), "first", null);
        setField(term41189, term41189.getClass(), "first", term41351);
        setField(term41097, term41097.getClass(), "first", term41189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41097;
        try {
            callMethod(klass, "process", argTypes, term41027, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


