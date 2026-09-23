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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556725;
     Object term556817;
     Object term556909;
     Object term557001;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556725 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term556817 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term556817, term556817.getClass(), "parent", null);
        setIntField(term556817, term556817.getClass(), "type", 0);
        term556909 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term556909, term556909.getClass(), "type", 0);
        term557001 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term557001, term557001.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term556817;
        args[1] = term556909;
        args[2] = term557001;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term556725, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


