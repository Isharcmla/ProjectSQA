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

public class TypeCheck_visit_8595247841380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428255;
     Object term428325;

    public TypeCheck_visit_8595247841380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428255 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term428325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term428325, term428325.getClass(), "type", 94);
        setIntField(term428395, term428395.getClass(), "type", 94);
        setField(term428395, term428395.getClass(), "jsType", term428489);
        setField(term428325, term428325.getClass(), "first", term428395);
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
        args[1] = term428325;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term428255, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


