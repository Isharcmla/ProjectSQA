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

public class TypeValidator_expectValidTypeofName_356302988197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69276;
     Object term69446;

    public TypeValidator_expectValidTypeofName_356302988197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69276 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term69356 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term69276, term69276.getClass(), "shouldReport", true);
        setField(term69276, term69276.getClass(), "compiler", term69356);
        term69446 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term69446, term69446.getClass(), "sourceName", "OFF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term69446;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "expectValidTypeofName", argTypes, term69276, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


