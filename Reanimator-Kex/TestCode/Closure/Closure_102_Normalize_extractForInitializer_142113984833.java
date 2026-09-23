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

public class Normalize_extractForInitializer_142113984833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6161;
     Object term6231;
     Object term6371;

    public Normalize_extractForInitializer_142113984833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6161 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        term6231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6231, term6231.getClass(), "first", term6231);
        setField(term6231, term6231.getClass(), "next", term6301);
        setIntField(term6231, term6231.getClass(), "type", 115);
        term6371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term6231;
        args[1] = term6371;
        args[2] = null;
        callMethod(klass, "extractForInitializer", argTypes, term6161, args);
    }

};


