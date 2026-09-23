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

public class TypeCheck_shouldTraverse_435604074277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77972;
     Object term78042;

    public TypeCheck_shouldTraverse_435604074277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77972 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term78042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78138 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term78234 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term78042, term78042.getClass(), "type", 118);
        setIntField(term78138, term78138.getClass(), "type", -30);
        setField(term78138, term78138.getClass(), "next", term78234);
        setField(term78042, term78042.getClass(), "propListHead", term78138);
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
        args[1] = term78042;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term77972, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


