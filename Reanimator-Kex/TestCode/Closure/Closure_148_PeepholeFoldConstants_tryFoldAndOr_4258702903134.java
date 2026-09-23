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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927381;
     Object term927473;
     Object term927559;
     Object term927629;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term927381 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term927473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term927473, term927473.getClass(), "parent", null);
        setIntField(term927473, term927473.getClass(), "type", 0);
        term927559 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term927559, term927559.getClass(), "type", 0);
        term927629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term927629, term927629.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term927473;
        args[1] = term927559;
        args[2] = term927629;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term927381, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


