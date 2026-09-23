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

public class ReferenceCollectingCallback_hotSwapScript_316460051799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306191;
     Object term306283;

    public ReferenceCollectingCallback_hotSwapScript_316460051799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306191 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term306191, term306191.getClass(), "compiler", null);
        term306283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306375 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term306283, term306283.getClass(), "type", 0);
        setIntField(term306375, term306375.getClass(), "type", 0);
        setField(term306375, term306375.getClass(), "parent", null);
        setField(term306283, term306283.getClass(), "parent", term306375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term306283;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term306191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


