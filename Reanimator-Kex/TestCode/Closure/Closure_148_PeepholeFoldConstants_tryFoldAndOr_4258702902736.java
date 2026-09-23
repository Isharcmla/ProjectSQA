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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term786684;
     Object term786770;
     Object term786954;
     Object term787046;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term786684 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term786770 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term786862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term786862, term786862.getClass(), "type", 108);
        setField(term786770, term786770.getClass(), "parent", term786862);
        setIntField(term786770, term786770.getClass(), "type", 0);
        term786954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term786954, term786954.getClass(), "type", 91);
        term787046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term787046, term787046.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term786770;
        args[1] = term786954;
        args[2] = term787046;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term786684, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


