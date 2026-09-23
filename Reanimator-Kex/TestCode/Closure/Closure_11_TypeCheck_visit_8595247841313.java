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

public class TypeCheck_visit_8595247841313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390813;
     Object term390987;

    public TypeCheck_visit_8595247841313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390813 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term390917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term390813, term390813.getClass(), "typeRegistry", term390917);
        term390987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term391057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term390987, term390987.getClass(), "type", 15);
        setField(term391057, term391057.getClass(), "jsType", null);
        setField(term390987, term390987.getClass(), "first", term391057);
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
        args[1] = term390987;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term390813, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


