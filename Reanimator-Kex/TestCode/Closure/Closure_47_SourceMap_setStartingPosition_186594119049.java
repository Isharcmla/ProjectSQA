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

public class SourceMap_setStartingPosition_186594119049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81178;

    public SourceMap_setStartingPosition_186594119049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81178 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term81286 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(term81178, term81178.getClass(), "generator", term81286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -1;
        args[1] = 0;
        try {
            callMethod(klass, "setStartingPosition", argTypes, term81178, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


