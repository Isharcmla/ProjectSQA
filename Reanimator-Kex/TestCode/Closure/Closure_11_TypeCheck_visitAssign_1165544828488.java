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

public class TypeCheck_visitAssign_1165544828488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122234;
     Object term122304;

    public TypeCheck_visitAssign_1165544828488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122234 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term122304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term122304, term122304.getClass(), "propListHead", null);
        setIntField(term122374, term122374.getClass(), "type", -34);
        setField(term122374, term122374.getClass(), "jsType", term122466);
        setField(term122304, term122304.getClass(), "first", term122374);
        setField(term122304, term122304.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term122304;
        try {
            callMethod(klass, "visitAssign", argTypes, term122234, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


