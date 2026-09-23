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

public class TypeCheck_visitGetElem_662149284206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58025;
     Object term58199;

    public TypeCheck_visitGetElem_662149284206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58025 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term58129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term58025, term58025.getClass(), "validator", null);
        setField(term58025, term58025.getClass(), "typeRegistry", term58129);
        term58199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58269, term58269.getClass(), "jsType", null);
        setField(term58199, term58199.getClass(), "first", term58269);
        setField(term58199, term58199.getClass(), "last", term58339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term58199;
        try {
            callMethod(klass, "visitGetElem", argTypes, term58025, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


