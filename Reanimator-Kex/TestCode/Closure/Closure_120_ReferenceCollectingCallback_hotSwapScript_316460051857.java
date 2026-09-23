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

public class ReferenceCollectingCallback_hotSwapScript_316460051857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348534;
     Object term348604;

    public ReferenceCollectingCallback_hotSwapScript_316460051857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348534 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term348534, term348534.getClass(), "compiler", null);
        term348604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term348604, term348604.getClass(), "type", 0);
        setIntField(term348674, term348674.getClass(), "type", 0);
        setField(term348674, term348674.getClass(), "parent", null);
        setField(term348604, term348604.getClass(), "parent", term348674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term348604;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term348534, args);
    }

};


