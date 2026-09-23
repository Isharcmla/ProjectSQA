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

public class TypeCheck_visitObjLitKey_518851015784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201147;
     Object term201217;
     Object term201469;

    public TypeCheck_visitObjLitKey_518851015784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201147 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term201217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term201287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term201399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term201287, term201287.getClass(), "jsType", term201399);
        setField(term201217, term201217.getClass(), "first", term201287);
        term201469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term201469, term201469.getClass(), "propListHead", null);
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
        args[1] = term201217;
        args[2] = term201469;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term201147, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


