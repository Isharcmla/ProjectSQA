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

public class TypeCheck_visitAssign_1165544828542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138548;
     Object term138722;

    public TypeCheck_visitAssign_1165544828542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138548 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term138652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term138548, term138548.getClass(), "typeRegistry", term138652);
        term138722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term138722, term138722.getClass(), "propListHead", null);
        setIntField(term138792, term138792.getClass(), "type", -34);
        setField(term138792, term138792.getClass(), "jsType", null);
        setField(term138722, term138722.getClass(), "first", term138792);
        setField(term138722, term138722.getClass(), "last", term138862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term138722;
        try {
            callMethod(klass, "visitAssign", argTypes, term138548, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


