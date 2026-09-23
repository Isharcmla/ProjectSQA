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
     Object term473084;
     Object term473244;

    public TypeCheck_visit_8595247841514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473084 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term473174 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term473084, term473084.getClass(), "validator", term473174);
        term473244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term473314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term473418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term473488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term473592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term473244, term473244.getClass(), "type", 52);
        setField(term473314, term473314.getClass(), "jsType", term473418);
        setField(term473244, term473244.getClass(), "first", term473314);
        setField(term473488, term473488.getClass(), "jsType", term473592);
        setField(term473244, term473244.getClass(), "last", term473488);
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
        args[1] = term473244;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term473084, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


