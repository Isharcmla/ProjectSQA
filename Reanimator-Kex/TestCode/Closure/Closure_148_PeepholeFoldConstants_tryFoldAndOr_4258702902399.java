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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666615;
     Object term666707;
     Object term666891;
     Object term666983;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term666615 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term666707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term666799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term666799, term666799.getClass(), "type", 114);
        setField(term666707, term666707.getClass(), "parent", term666799);
        setIntField(term666707, term666707.getClass(), "type", 0);
        term666891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term666891, term666891.getClass(), "type", 94);
        term666983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term666983, term666983.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term666707;
        args[1] = term666891;
        args[2] = term666983;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term666615, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


