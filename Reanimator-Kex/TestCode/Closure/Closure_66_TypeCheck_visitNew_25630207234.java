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

public class TypeCheck_visitNew_25630207234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60835;
     Object term60905;

    public TypeCheck_visitNew_25630207234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60835 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term60905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term60905, term60905.getClass(), "first", term60905);
        setField(term60905, term60905.getClass(), "jsType", term61001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60905;
        try {
            callMethod(klass, "visitNew", argTypes, term60835, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


