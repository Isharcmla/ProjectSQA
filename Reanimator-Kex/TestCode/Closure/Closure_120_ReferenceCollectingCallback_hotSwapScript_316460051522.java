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

public class ReferenceCollectingCallback_hotSwapScript_316460051522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154347;
     Object term154439;

    public ReferenceCollectingCallback_hotSwapScript_316460051522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154347 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term154347, term154347.getClass(), "compiler", null);
        term154439 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term154531 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term154439, term154439.getClass(), "type", -133);
        setField(term154439, term154439.getClass(), "parent", term154531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term154439;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term154347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


