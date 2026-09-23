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

public class TypeCheck_visitAssign_1165544828452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114021;
     Object term114195;

    public TypeCheck_visitAssign_1165544828452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114021 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term114125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term114021, term114021.getClass(), "typeRegistry", term114125);
        term114195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term114195, term114195.getClass(), "propListHead", null);
        setIntField(term114265, term114265.getClass(), "type", -34);
        setField(term114265, term114265.getClass(), "jsType", null);
        setField(term114195, term114195.getClass(), "first", term114265);
        setField(term114195, term114195.getClass(), "last", term114335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term114195;
        try {
            callMethod(klass, "visitAssign", argTypes, term114021, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


