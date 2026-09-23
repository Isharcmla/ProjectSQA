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

public class TypeCheck_shouldTraverse_4356040741186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344576;
     Object term344756;
     Object term344826;

    public TypeCheck_shouldTraverse_4356040741186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344576 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term344666 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term344666, term344666.getClass(), "shouldReport", false);
        setField(term344576, term344576.getClass(), "validator", term344666);
        setIntField(term344576, term344576.getClass(), "noTypeCheckSection", -1);
        term344756 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term344826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term344826, term344826.getClass(), "type", 105);
        setField(term344826, term344826.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term344756;
        args[1] = term344826;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term344576, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


