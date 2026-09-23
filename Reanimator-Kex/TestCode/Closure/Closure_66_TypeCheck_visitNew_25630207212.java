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

public class TypeCheck_visitNew_25630207212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53951;
     Object term54125;

    public TypeCheck_visitNew_25630207212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53951 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term54055 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term53951, term53951.getClass(), "typeRegistry", term54055);
        term54125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54195, term54195.getClass(), "jsType", null);
        setField(term54125, term54125.getClass(), "first", term54195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term54125;
        try {
            callMethod(klass, "visitNew", argTypes, term53951, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


