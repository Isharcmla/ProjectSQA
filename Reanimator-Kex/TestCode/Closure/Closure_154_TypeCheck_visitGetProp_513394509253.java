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

public class TypeCheck_visitGetProp_513394509253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72126;
     Object term72322;

    public TypeCheck_visitGetProp_513394509253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72126 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term72230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term72126, term72126.getClass(), "typeRegistry", term72230);
        term72322 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term72414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term72322, term72322.getClass(), "jsType", null);
        setField(term72322, term72322.getClass(), "last", null);
        setField(term72414, term72414.getClass(), "jsType", null);
        setField(term72322, term72322.getClass(), "first", term72414);
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
        args[1] = term72322;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term72126, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


