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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332706;
     Object term332798;
     Object term332890;
     Object term332982;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332706 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term332798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term332798, term332798.getClass(), "parent", null);
        setIntField(term332798, term332798.getClass(), "type", 0);
        term332890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term332890, term332890.getClass(), "type", 0);
        term332982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term332982, term332982.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term332798;
        args[1] = term332890;
        args[2] = term332982;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term332706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


