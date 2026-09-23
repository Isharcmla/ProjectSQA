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

public class ProcessClosurePrimitives_process_1779090349123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50465;
     Object term50615;

    public ProcessClosurePrimitives_process_1779090349123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50465 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term50545 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term50465, term50465.getClass(), "compiler", term50545);
        term50615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term50615, term50615.getClass(), "type", 33);
        setField(term50707, term50707.getClass(), "next", null);
        setIntField(term50707, term50707.getClass(), "type", 0);
        setField(term50707, term50707.getClass(), "first", null);
        setField(term50615, term50615.getClass(), "first", term50707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term50615;
        callMethod(klass, "process", argTypes, term50465, args);
    }

};


