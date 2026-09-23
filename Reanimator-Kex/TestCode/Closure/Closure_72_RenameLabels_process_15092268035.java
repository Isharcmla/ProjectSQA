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

public class RenameLabels_process_15092268035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15700;
     Object term15770;

    public RenameLabels_process_15092268035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15700 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term15700, term15700.getClass(), "compiler", null);
        term15770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15770, term15770.getClass(), "type", 0);
        setField(term15910, term15910.getClass(), "next", null);
        setIntField(term15910, term15910.getClass(), "type", 126);
        setField(term15840, term15840.getClass(), "next", term15910);
        setIntField(term15840, term15840.getClass(), "type", 117);
        setField(term15840, term15840.getClass(), "first", null);
        setField(term15770, term15770.getClass(), "first", term15840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15770;
        try {
            callMethod(klass, "process", argTypes, term15700, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


