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

public class TypeCheck_visit_8595247841546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510088;
     Object term510158;

    public TypeCheck_visit_8595247841546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term510088 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term510158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term510228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term510316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term510158, term510158.getClass(), "type", 119);
        setField(term510228, term510228.getClass(), "jsType", term510316);
        setField(term510158, term510158.getClass(), "first", term510228);
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
        args[1] = term510158;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term510088, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


