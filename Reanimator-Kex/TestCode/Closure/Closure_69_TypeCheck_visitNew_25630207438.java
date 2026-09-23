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

public class TypeCheck_visitNew_25630207438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132921;
     Object term133095;

    public TypeCheck_visitNew_25630207438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132921 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term133025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term132921, term132921.getClass(), "typeRegistry", term133025);
        term133095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term133165, term133165.getClass(), "jsType", null);
        setField(term133095, term133095.getClass(), "first", term133165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term133095;
        try {
            callMethod(klass, "visitNew", argTypes, term132921, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


