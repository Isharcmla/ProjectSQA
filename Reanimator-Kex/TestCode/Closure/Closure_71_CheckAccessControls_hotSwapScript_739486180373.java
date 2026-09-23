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

public class CheckAccessControls_hotSwapScript_739486180373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115079;
     Object term115149;

    public CheckAccessControls_hotSwapScript_739486180373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115079 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term115079, term115079.getClass(), "compiler", null);
        term115149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term115149, term115149.getClass(), "type", 118);
        setField(term115289, term115289.getClass(), "next", term115219);
        setIntField(term115289, term115289.getClass(), "type", 38);
        setField(term115289, term115289.getClass(), "first", null);
        setField(term115219, term115219.getClass(), "next", term115289);
        setIntField(term115219, term115219.getClass(), "type", 30);
        setField(term115219, term115219.getClass(), "first", null);
        setField(term115393, term115393.getClass(), "docInfo", null);
        setField(term115219, term115219.getClass(), "jsType", term115393);
        setField(term115149, term115149.getClass(), "first", term115219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term115149;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term115079, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


