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

public class TypeCheck_visitGetProp_513394509442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111021;
     Object term111195;

    public TypeCheck_visitGetProp_513394509442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111021 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term111125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term111021, term111021.getClass(), "typeRegistry", term111125);
        term111195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term111195, term111195.getClass(), "last", term111265);
        setField(term111335, term111335.getClass(), "jsType", null);
        setField(term111195, term111195.getClass(), "first", term111335);
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
        args[1] = term111195;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term111021, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


