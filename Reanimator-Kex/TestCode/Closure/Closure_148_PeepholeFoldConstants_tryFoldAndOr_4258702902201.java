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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601814;
     Object term601906;
     Object term601992;
     Object term602062;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601814 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term601906 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term601906, term601906.getClass(), "parent", null);
        setIntField(term601906, term601906.getClass(), "type", 0);
        term601992 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term601992, term601992.getClass(), "type", 0);
        term602062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term602062, term602062.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term601906;
        args[1] = term601992;
        args[2] = term602062;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term601814, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


