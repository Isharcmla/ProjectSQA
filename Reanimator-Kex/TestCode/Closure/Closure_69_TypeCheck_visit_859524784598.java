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

public class TypeCheck_visit_859524784598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187008;
     Object term187182;

    public TypeCheck_visit_859524784598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187008 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term187112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term187008, term187008.getClass(), "typeRegistry", term187112);
        term187182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term187252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term187182, term187182.getClass(), "type", 16);
        setField(term187252, term187252.getClass(), "jsType", null);
        setField(term187182, term187182.getClass(), "first", term187252);
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
        args[1] = term187182;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term187008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


