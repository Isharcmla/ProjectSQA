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

public class TypeCheck_visit_8595247841244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364285;
     Object term364549;

    public TypeCheck_visit_8595247841244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364285 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term364375 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term364479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term364285, term364285.getClass(), "validator", term364375);
        setField(term364285, term364285.getClass(), "typeRegistry", term364479);
        term364549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term364619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term364549, term364549.getClass(), "type", 29);
        setField(term364619, term364619.getClass(), "jsType", null);
        setField(term364549, term364549.getClass(), "first", term364619);
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
        args[1] = term364549;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term364285, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


