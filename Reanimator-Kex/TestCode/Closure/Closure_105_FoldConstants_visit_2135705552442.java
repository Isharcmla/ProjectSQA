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

public class FoldConstants_visit_2135705552442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133413;
     Object term133483;

    public FoldConstants_visit_2135705552442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133413 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term133483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133483, term133483.getClass(), "type", 4);
        setIntField(term133553, term133553.getClass(), "type", 38);
        setField(term133483, term133483.getClass(), "first", term133553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term133483;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term133413, args);
    }

};


