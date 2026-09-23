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

public class TypeCheck_visit_859524784932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260329;
     Object term260489;

    public TypeCheck_visit_859524784932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260329 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term260419 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term260329, term260329.getClass(), "validator", term260419);
        term260489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term260489, term260489.getClass(), "type", 102);
        setIntField(term260559, term260559.getClass(), "type", 102);
        setField(term260559, term260559.getClass(), "jsType", term260649);
        setField(term260489, term260489.getClass(), "first", term260559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term260489;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term260329, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


