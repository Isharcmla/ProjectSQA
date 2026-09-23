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

public class TypeCheck_visit_8595247841696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579255;
     Object term579534;

    public TypeCheck_visit_8595247841696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term579255 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term579359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term579255, term579255.getClass(), "typeRegistry", term579359);
        term579534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term579534, term579534.getClass(), "type", 111);
        setField(term579569, term579569.getClass(), "jsType", null);
        setField(term579534, term579534.getClass(), "first", term579569);
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
        args[1] = term579534;
        args[2] = term579534;
        try {
            callMethod(klass, "visit", argTypes, term579255, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


