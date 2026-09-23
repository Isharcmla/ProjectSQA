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

public class TypeCheck_visitAssign_1165544828156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41626;
     Object term41696;

    public TypeCheck_visitAssign_1165544828156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41626 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term41696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41792 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term41792, term41792.getClass(), "type", -30);
        setField(term41792, term41792.getClass(), "next", null);
        setField(term41696, term41696.getClass(), "propListHead", term41792);
        setField(term41696, term41696.getClass(), "first", term41696);
        setField(term41696, term41696.getClass(), "last", null);
        setIntField(term41696, term41696.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41696;
        try {
            callMethod(klass, "visitAssign", argTypes, term41626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


