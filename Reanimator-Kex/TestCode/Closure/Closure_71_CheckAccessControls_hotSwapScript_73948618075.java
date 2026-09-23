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

public class CheckAccessControls_hotSwapScript_73948618075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18792;
     Object term18942;

    public CheckAccessControls_hotSwapScript_73948618075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18792 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term18872 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term18792, term18792.getClass(), "compiler", term18872);
        term18942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18942, term18942.getClass(), "type", 33);
        setField(term19012, term19012.getClass(), "next", null);
        setIntField(term19012, term19012.getClass(), "type", 0);
        setField(term19012, term19012.getClass(), "first", null);
        setField(term18942, term18942.getClass(), "first", term19012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18942;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term18792, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


