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

public class TypeCheck_visitGetProp_513394509210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52481;
     Object term52655;

    public TypeCheck_visitGetProp_513394509210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52481 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term52585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term52481, term52481.getClass(), "typeRegistry", term52585);
        term52655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52655, term52655.getClass(), "last", term52725);
        setField(term52795, term52795.getClass(), "jsType", null);
        setField(term52655, term52655.getClass(), "first", term52795);
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
        args[1] = term52655;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term52481, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


