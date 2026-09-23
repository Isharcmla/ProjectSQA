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

public class CheckAccessControls_hotSwapScript_739486180440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221297;
     Object term221367;

    public CheckAccessControls_hotSwapScript_739486180440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221297 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term221297, term221297.getClass(), "compiler", null);
        term221367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term221367, term221367.getClass(), "type", 30);
        setField(term221507, term221507.getClass(), "next", null);
        setIntField(term221507, term221507.getClass(), "type", 0);
        setField(term221507, term221507.getClass(), "first", null);
        setField(term221437, term221437.getClass(), "next", term221507);
        setIntField(term221437, term221437.getClass(), "type", 30);
        setField(term221437, term221437.getClass(), "first", null);
        setField(term221595, term221595.getClass(), "docInfo", null);
        setField(term221437, term221437.getClass(), "jsType", term221595);
        setField(term221367, term221367.getClass(), "first", term221437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term221367;
        callMethod(klass, "hotSwapScript", argTypes, term221297, args);
    }

};


