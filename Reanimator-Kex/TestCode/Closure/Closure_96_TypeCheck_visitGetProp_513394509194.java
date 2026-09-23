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

public class TypeCheck_visitGetProp_513394509194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91984;
     Object term92076;

    public TypeCheck_visitGetProp_513394509194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91984 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term92076 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term92076, term92076.getClass(), "jsType", null);
        setField(term92076, term92076.getClass(), "last", term92168);
        setField(term92076, term92076.getClass(), "first", term92260);
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
        args[1] = term92076;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term91984, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


