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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809244;
     Object term809330;
     Object term809514;
     Object term809606;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809244 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term809330 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term809422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term809422, term809422.getClass(), "type", 114);
        setField(term809330, term809330.getClass(), "parent", term809422);
        setIntField(term809330, term809330.getClass(), "type", 0);
        term809514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term809514, term809514.getClass(), "type", 33);
        term809606 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term809606, term809606.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term809330;
        args[1] = term809514;
        args[2] = term809606;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term809244, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


