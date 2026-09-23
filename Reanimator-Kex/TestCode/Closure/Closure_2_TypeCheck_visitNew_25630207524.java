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

public class TypeCheck_visitNew_25630207524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136256;
     Object term136430;

    public TypeCheck_visitNew_25630207524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136256 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term136360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term136256, term136256.getClass(), "typeRegistry", term136360);
        term136430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term136500, term136500.getClass(), "jsType", null);
        setField(term136430, term136430.getClass(), "first", term136500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term136430;
        try {
            callMethod(klass, "visitNew", argTypes, term136256, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


