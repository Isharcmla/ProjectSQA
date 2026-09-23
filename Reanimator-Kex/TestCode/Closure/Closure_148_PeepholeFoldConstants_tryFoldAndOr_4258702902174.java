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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592813;
     Object term592899;
     Object term593083;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term592813 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term592899 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term592991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term592899, term592899.getClass(), "parent", null);
        setIntField(term592899, term592899.getClass(), "type", 100);
        setField(term592899, term592899.getClass(), "first", term592991);
        term593083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term593083, term593083.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term592899;
        args[1] = term593083;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term592813, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


