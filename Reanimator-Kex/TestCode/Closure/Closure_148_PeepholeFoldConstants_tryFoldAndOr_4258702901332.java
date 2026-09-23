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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322301;
     Object term322387;
     Object term322479;
     Object term322571;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322301 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term322387 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term322387, term322387.getClass(), "parent", null);
        setIntField(term322387, term322387.getClass(), "type", 0);
        term322479 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term322479, term322479.getClass(), "type", 0);
        term322571 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term322571, term322571.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term322387;
        args[1] = term322479;
        args[2] = term322571;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term322301, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


