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

public class Normalize_extractForInitializer_142113984838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7219;
     Object term7289;

    public Normalize_extractForInitializer_142113984838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7219 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        term7289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7359, term7359.getClass(), "next", term7429);
        setField(term7289, term7289.getClass(), "first", term7359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term7289;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "extractForInitializer", argTypes, term7219, args);
    }

};


