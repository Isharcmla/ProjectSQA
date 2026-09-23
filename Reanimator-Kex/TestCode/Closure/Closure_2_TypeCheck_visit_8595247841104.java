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

public class TypeCheck_visit_8595247841104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315974;
     Object term316044;

    public TypeCheck_visit_8595247841104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315974 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term316044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term316114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term316212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term316282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term316044, term316044.getClass(), "type", 92);
        setIntField(term316114, term316114.getClass(), "type", 92);
        setField(term316114, term316114.getClass(), "jsType", term316212);
        setField(term316044, term316044.getClass(), "first", term316114);
        setField(term316044, term316044.getClass(), "last", term316282);
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
        args[1] = term316044;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term315974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


