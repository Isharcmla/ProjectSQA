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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term826896;
     Object term826982;
     Object term827166;
     Object term827258;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term826896 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term826982 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term827074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term827074, term827074.getClass(), "type", 108);
        setField(term826982, term826982.getClass(), "parent", term827074);
        setIntField(term826982, term826982.getClass(), "type", 0);
        term827166 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term827166, term827166.getClass(), "type", 90);
        term827258 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term827258, term827258.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term826982;
        args[1] = term827166;
        args[2] = term827258;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term826896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


