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

public class TypeCheck_visit_859524784322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89255;
     Object term89345;
     Object term89415;

    public TypeCheck_visit_859524784322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89255 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term89255, term89255.getClass(), "noTypeCheckSection", 0);
        term89345 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term89415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89415, term89415.getClass(), "type", 104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term89345;
        args[1] = term89415;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term89255, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


