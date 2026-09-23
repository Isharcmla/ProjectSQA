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

public class TypeCheck_visit_8595247841344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410163;
     Object term410323;

    public TypeCheck_visit_8595247841344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410163 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term410253 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term410163, term410163.getClass(), "validator", term410253);
        term410323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term410323, term410323.getClass(), "type", 28);
        setField(term410323, term410323.getClass(), "first", term410323);
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
        args[1] = term410323;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term410163, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


