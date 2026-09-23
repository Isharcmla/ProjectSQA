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

public class TypeCheck_visit_8595247841510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490409;
     Object term490479;

    public TypeCheck_visit_8595247841510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490409 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term490479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term490549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term490641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term490711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term490479, term490479.getClass(), "type", 97);
        setIntField(term490549, term490549.getClass(), "type", 97);
        setField(term490549, term490549.getClass(), "jsType", term490641);
        setField(term490479, term490479.getClass(), "first", term490549);
        setField(term490479, term490479.getClass(), "last", term490711);
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
        args[1] = term490479;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term490409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


