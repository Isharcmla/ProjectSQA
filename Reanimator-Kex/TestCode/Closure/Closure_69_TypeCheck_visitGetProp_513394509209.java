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

public class TypeCheck_visitGetProp_513394509209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60250;
     Object term60424;

    public TypeCheck_visitGetProp_513394509209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60250 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term60354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term60250, term60250.getClass(), "typeRegistry", term60354);
        term60424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60424, term60424.getClass(), "jsType", null);
        setField(term60424, term60424.getClass(), "last", term60494);
        setField(term60564, term60564.getClass(), "jsType", null);
        setField(term60424, term60424.getClass(), "first", term60564);
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
        args[1] = term60424;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term60250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


