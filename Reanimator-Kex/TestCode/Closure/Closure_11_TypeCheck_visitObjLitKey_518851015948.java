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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitObjLitKey_518851015948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251842;
     Object term251912;
     Object term252144;

    public TypeCheck_visitObjLitKey_518851015948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251842 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term251912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term251982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term251982, term251982.getClass(), "jsType", term252074);
        setField(term251912, term251912.getClass(), "first", term251982);
        setIntField(term251912, term251912.getClass(), "type", 0);
        setField(term251912, term251912.getClass(), "jsType", term252074);
        term252144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term252144, term252144.getClass(), "propListHead", null);
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
        args[1] = term251912;
        args[2] = term252144;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term251842, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


