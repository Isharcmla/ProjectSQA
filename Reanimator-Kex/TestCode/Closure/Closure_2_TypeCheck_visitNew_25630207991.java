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

public class TypeCheck_visitNew_25630207991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281367;
     Object term281437;

    public TypeCheck_visitNew_25630207991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281367 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term281437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term281537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term281437, term281437.getClass(), "first", term281437);
        setField(term281437, term281437.getClass(), "jsType", term281537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term281437;
        try {
            callMethod(klass, "visitNew", argTypes, term281367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


