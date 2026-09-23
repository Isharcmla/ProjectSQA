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

public class ScopedAliases_hotSwapScript_88341709368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253544;
     Object term253694;

    public ScopedAliases_hotSwapScript_88341709368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253544 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term253624 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term253544, term253544.getClass(), "compiler", term253624);
        term253694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term253764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term253834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term253904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term253974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term254044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term254114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term253694, term253694.getClass(), "type", 0);
        setField(term253694, term253694.getClass(), "parent", null);
        setField(term253904, term253904.getClass(), "next", term253904);
        setIntField(term253904, term253904.getClass(), "type", 0);
        setField(term253904, term253904.getClass(), "first", null);
        setField(term253834, term253834.getClass(), "next", term253904);
        setIntField(term253834, term253834.getClass(), "type", 0);
        setField(term253834, term253834.getClass(), "first", null);
        setField(term253764, term253764.getClass(), "next", term253834);
        setIntField(term253764, term253764.getClass(), "type", 0);
        setField(term254114, term254114.getClass(), "next", null);
        setIntField(term254114, term254114.getClass(), "type", 0);
        setField(term254114, term254114.getClass(), "first", null);
        setField(term254044, term254044.getClass(), "next", term254114);
        setIntField(term254044, term254044.getClass(), "type", 105);
        setField(term253974, term253974.getClass(), "next", term254044);
        setIntField(term253974, term253974.getClass(), "type", 105);
        setField(term253764, term253764.getClass(), "first", term253974);
        setField(term253694, term253694.getClass(), "first", term253764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term253694;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term253544, args);
    }

};


