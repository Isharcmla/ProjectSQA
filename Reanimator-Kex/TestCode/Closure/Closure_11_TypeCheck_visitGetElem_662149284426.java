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

public class TypeCheck_visitGetElem_662149284426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101812;
     Object term101972;

    public TypeCheck_visitGetElem_662149284426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101812 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term101902 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term101812, term101812.getClass(), "validator", term101902);
        term101972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term102042, term102042.getClass(), "jsType", term102166);
        setField(term101972, term101972.getClass(), "first", term102042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term101972;
        try {
            callMethod(klass, "visitGetElem", argTypes, term101812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


