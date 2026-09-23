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

public class TypeCheck_shouldTraverse_4356040741575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497887;
     Object term498067;
     Object term498137;

    public TypeCheck_shouldTraverse_4356040741575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497887 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term497977 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term497977, term497977.getClass(), "shouldReport", false);
        setField(term497887, term497887.getClass(), "validator", term497977);
        setIntField(term497887, term497887.getClass(), "noTypeCheckSection", 0);
        term498067 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term498137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term498137, term498137.getClass(), "type", 105);
        setField(term498137, term498137.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term498067;
        args[1] = term498137;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term497887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


