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

public class TypeCheck_visit_8595247841621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544210;
     Object term544384;

    public TypeCheck_visit_8595247841621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544210 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term544314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term544210, term544210.getClass(), "typeRegistry", term544314);
        term544384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term544454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term544542 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term544384, term544384.getClass(), "type", 97);
        setIntField(term544454, term544454.getClass(), "type", 0);
        setField(term544454, term544454.getClass(), "jsType", term544542);
        setField(term544384, term544384.getClass(), "first", term544454);
        setField(term544384, term544384.getClass(), "last", term544384);
        setField(term544384, term544384.getClass(), "jsType", null);
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
        args[1] = term544384;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term544210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


