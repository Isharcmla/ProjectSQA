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

public class ReferenceCollectingCallback_hotSwapScript_316460051484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131565;
     Object term131657;

    public ReferenceCollectingCallback_hotSwapScript_316460051484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131565 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term131565, term131565.getClass(), "compiler", null);
        term131657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term131749 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term131657, term131657.getClass(), "type", 0);
        setIntField(term131749, term131749.getClass(), "type", 0);
        setField(term131749, term131749.getClass(), "parent", null);
        setField(term131657, term131657.getClass(), "parent", term131749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term131657;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term131565, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


