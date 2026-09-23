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

public class TypeCheck_visit_8595247841723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558844;
     Object term559018;

    public TypeCheck_visit_8595247841723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558844 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term558948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term558844, term558844.getClass(), "typeRegistry", term558948);
        term559018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term559088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term559018, term559018.getClass(), "type", 92);
        setField(term559088, term559088.getClass(), "jsType", null);
        setField(term559018, term559018.getClass(), "first", term559088);
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
        args[1] = term559018;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term558844, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


