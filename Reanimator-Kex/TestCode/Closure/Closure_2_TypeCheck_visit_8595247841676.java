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

public class TypeCheck_visit_8595247841676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570032;
     Object term570102;

    public TypeCheck_visit_8595247841676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570032 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term570102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term570172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term570268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term570338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term570102, term570102.getClass(), "type", 89);
        setIntField(term570172, term570172.getClass(), "type", 89);
        setField(term570172, term570172.getClass(), "jsType", term570268);
        setField(term570102, term570102.getClass(), "first", term570172);
        setField(term570338, term570338.getClass(), "jsType", term570268);
        setField(term570102, term570102.getClass(), "last", term570338);
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
        args[1] = term570102;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term570032, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


