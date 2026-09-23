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

public class ProcessClosurePrimitives_process_177909034968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31295;
     Object term31445;

    public ProcessClosurePrimitives_process_177909034968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31295 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term31375 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31295, term31295.getClass(), "compiler", term31375);
        term31445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31445, term31445.getClass(), "type", 30);
        setField(term31515, term31515.getClass(), "next", null);
        setIntField(term31515, term31515.getClass(), "type", 0);
        setField(term31515, term31515.getClass(), "first", null);
        setField(term31445, term31445.getClass(), "first", term31515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31445;
        try {
            callMethod(klass, "process", argTypes, term31295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


