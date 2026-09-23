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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574517;
     Object term574609;
     Object term574793;
     Object term574839;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574517 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term574609 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term574839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term574609, term574609.getClass(), "parent", null);
        setIntField(term574609, term574609.getClass(), "type", 0);
        setField(term574609, term574609.getClass(), "first", term574839);
        term574793 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term574793, term574793.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term574609;
        args[1] = term574793;
        args[2] = term574839;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term574517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


