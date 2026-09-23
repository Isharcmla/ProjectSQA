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

public class TypeCheck_visit_8595247841138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326893;
     Object term326963;

    public TypeCheck_visit_8595247841138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326893 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term326963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term326963, term326963.getClass(), "type", 90);
        setIntField(term327033, term327033.getClass(), "type", 90);
        setField(term327033, term327033.getClass(), "jsType", term327127);
        setField(term326963, term326963.getClass(), "first", term327033);
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
        args[1] = term326963;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term326893, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


