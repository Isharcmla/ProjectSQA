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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReferenceCollectingCallback_hotSwapScript_316460051859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349325;
     Object term349417;

    public ReferenceCollectingCallback_hotSwapScript_316460051859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349325 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term349325, term349325.getClass(), "compiler", null);
        term349417 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term349509 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term349579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term349417, term349417.getClass(), "type", 0);
        setIntField(term349509, term349509.getClass(), "type", 0);
        setField(term349509, term349509.getClass(), "parent", term349579);
        setField(term349417, term349417.getClass(), "parent", term349509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term349417;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term349325, args);
    }

};


