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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583032;
     Object term583102;
     Object term583172;
     Object term583242;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term583032 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term583102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term583102, term583102.getClass(), "parent", null);
        setIntField(term583102, term583102.getClass(), "type", 0);
        term583172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term583172, term583172.getClass(), "type", 0);
        term583242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term583242, term583242.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term583102;
        args[1] = term583172;
        args[2] = term583242;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term583032, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


