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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494076;
     Object term494168;
     Object term494260;
     Object term494352;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term494168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term494168, term494168.getClass(), "parent", null);
        setIntField(term494168, term494168.getClass(), "type", 0);
        term494260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term494260, term494260.getClass(), "type", 0);
        term494352 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term494352, term494352.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term494168;
        args[1] = term494260;
        args[2] = term494352;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term494076, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


