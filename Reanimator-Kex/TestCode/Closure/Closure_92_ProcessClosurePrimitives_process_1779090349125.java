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

public class ProcessClosurePrimitives_process_1779090349125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51148;
     Object term51218;

    public ProcessClosurePrimitives_process_1779090349125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51148 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term51148, term51148.getClass(), "compiler", null);
        setBooleanField(term51148, term51148.getClass(), "rewriteNewDateGoogNow", true);
        term51218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51218, term51218.getClass(), "type", 30);
        setField(term51288, term51288.getClass(), "next", null);
        setIntField(term51288, term51288.getClass(), "type", 0);
        setField(term51288, term51288.getClass(), "first", null);
        setField(term51218, term51218.getClass(), "first", term51288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term51218;
        callMethod(klass, "process", argTypes, term51148, args);
    }

};


