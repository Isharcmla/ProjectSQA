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

public class ReferenceCollectingCallback_hotSwapScript_316460051599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187741;
     Object term187833;

    public ReferenceCollectingCallback_hotSwapScript_316460051599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187741 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term187741, term187741.getClass(), "compiler", null);
        term187833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term187925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term187833, term187833.getClass(), "type", 0);
        setIntField(term187925, term187925.getClass(), "type", 0);
        setField(term187925, term187925.getClass(), "parent", null);
        setField(term187833, term187833.getClass(), "parent", term187925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term187833;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term187741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


