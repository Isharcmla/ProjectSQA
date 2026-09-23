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

public class TypeCheck_visitGetElem_662149284412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100643;
     Object term100803;

    public TypeCheck_visitGetElem_662149284412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100643 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term100733 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term100643, term100643.getClass(), "validator", term100733);
        term100803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100803, term100803.getClass(), "first", term100803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term100803;
        try {
            callMethod(klass, "visitGetElem", argTypes, term100643, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


