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

public class TypeCheck_visit_8595247841532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478509;
     Object term478669;

    public TypeCheck_visit_8595247841532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term478509 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term478599 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term478509, term478509.getClass(), "validator", term478599);
        term478669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term478669, term478669.getClass(), "type", 35);
        setField(term478669, term478669.getClass(), "first", term478669);
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
        args[1] = term478669;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term478509, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


