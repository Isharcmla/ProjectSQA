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

public class TypeCheck_visitGetElem_662149284331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81076;
     Object term81236;

    public TypeCheck_visitGetElem_662149284331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81076 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term81166 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term81076, term81076.getClass(), "validator", term81166);
        term81236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81236, term81236.getClass(), "first", term81236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term81236;
        try {
            callMethod(klass, "visitGetElem", argTypes, term81076, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


