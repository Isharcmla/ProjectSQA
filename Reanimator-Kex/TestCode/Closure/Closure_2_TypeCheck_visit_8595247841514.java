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

public class TypeCheck_visit_8595247841514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493496;
     Object term493670;
     Object term493740;

    public TypeCheck_visit_8595247841514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493496 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term493600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term493496, term493496.getClass(), "typeRegistry", term493600);
        term493670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term493670, term493670.getClass(), "type", 38);
        setField(term493670, term493670.getClass(), "jsType", null);
        term493740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term493740, term493740.getClass(), "type", 0);
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
        args[1] = term493670;
        args[2] = term493740;
        try {
            callMethod(klass, "visit", argTypes, term493496, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


