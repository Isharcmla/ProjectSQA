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

public class ReferenceCollectingCallback_hotSwapScript_316460051424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104999;
     Object term105069;

    public ReferenceCollectingCallback_hotSwapScript_316460051424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104999 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term104999, term104999.getClass(), "compiler", null);
        term105069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105069, term105069.getClass(), "type", 0);
        setIntField(term105139, term105139.getClass(), "type", 0);
        setField(term105139, term105139.getClass(), "parent", null);
        setField(term105069, term105069.getClass(), "parent", term105139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term105069;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term104999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


