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

public class TypeCheck_visitAssign_1165544828332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94979;
     Object term95153;

    public TypeCheck_visitAssign_1165544828332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94979 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term95083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term94979, term94979.getClass(), "typeRegistry", term95083);
        term95153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95249 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term95249, term95249.getClass(), "type", -30);
        setField(term95249, term95249.getClass(), "next", null);
        setField(term95153, term95153.getClass(), "propListHead", term95249);
        setField(term95153, term95153.getClass(), "first", term95153);
        setField(term95153, term95153.getClass(), "last", null);
        setIntField(term95153, term95153.getClass(), "type", 0);
        setField(term95153, term95153.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term95153;
        try {
            callMethod(klass, "visitAssign", argTypes, term94979, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


