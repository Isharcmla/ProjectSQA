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

public class ReferenceCollectingCallback_hotSwapScript_316460051438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111424;
     Object term111494;

    public ReferenceCollectingCallback_hotSwapScript_316460051438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111424 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term111424, term111424.getClass(), "compiler", null);
        term111494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term111494, term111494.getClass(), "type", -133);
        setField(term111494, term111494.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term111494;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term111424, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


