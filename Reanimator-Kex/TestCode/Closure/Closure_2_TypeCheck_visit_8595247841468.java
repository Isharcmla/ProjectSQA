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

public class TypeCheck_visit_8595247841468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471770;
     Object term471952;

    public TypeCheck_visit_8595247841468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471770 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term471860 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term471770, term471770.getClass(), "validator", term471860);
        term471952 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term472042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term471952, term471952.getClass(), "type", 28);
        setField(term471952, term471952.getClass(), "first", term471952);
        setField(term471952, term471952.getClass(), "jsType", term472042);
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
        args[1] = term471952;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term471770, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


