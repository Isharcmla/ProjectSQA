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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_62786604737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19536;
     Object term19708;

    public ProcessCommonJSModules_process_62786604737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19536 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term19616 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19536, term19536.getClass(), "compiler", term19616);
        term19708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term19778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term19940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19708, term19708.getClass(), "type", 0);
        setField(term19708, term19708.getClass(), "parent", null);
        setField(term19870, term19870.getClass(), "next", term19940);
        setIntField(term19870, term19870.getClass(), "type", 132);
        setField(term19778, term19778.getClass(), "next", term19870);
        setIntField(term19778, term19778.getClass(), "type", 0);
        setField(term20010, term20010.getClass(), "next", null);
        setIntField(term20010, term20010.getClass(), "type", 0);
        setField(term20010, term20010.getClass(), "first", null);
        setField(term19778, term19778.getClass(), "first", term20010);
        setField(term19708, term19708.getClass(), "first", term19778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19708;
        try {
            callMethod(klass, "process", argTypes, term19536, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


