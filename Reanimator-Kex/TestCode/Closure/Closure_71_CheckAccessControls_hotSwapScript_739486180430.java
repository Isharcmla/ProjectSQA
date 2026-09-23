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

public class CheckAccessControls_hotSwapScript_739486180430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215026;
     Object term215176;

    public CheckAccessControls_hotSwapScript_739486180430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215026 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term215106 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term215026, term215026.getClass(), "compiler", term215106);
        term215176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term215176, term215176.getClass(), "type", 0);
        setField(term215316, term215316.getClass(), "next", term215386);
        setIntField(term215316, term215316.getClass(), "type", 30);
        setField(term215316, term215316.getClass(), "first", null);
        setField(term215246, term215246.getClass(), "next", term215316);
        setIntField(term215246, term215246.getClass(), "type", 30);
        setField(term215246, term215246.getClass(), "first", null);
        setField(term215474, term215474.getClass(), "docInfo", null);
        setField(term215246, term215246.getClass(), "jsType", term215474);
        setField(term215176, term215176.getClass(), "first", term215246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term215176;
        callMethod(klass, "hotSwapScript", argTypes, term215026, args);
    }

};


