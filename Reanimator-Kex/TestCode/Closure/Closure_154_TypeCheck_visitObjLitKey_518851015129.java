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

public class TypeCheck_visitObjLitKey_518851015129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38051;
     Object term38225;

    public TypeCheck_visitObjLitKey_518851015129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38051 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term38155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term38051, term38051.getClass(), "typeRegistry", term38155);
        term38225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38295, term38295.getClass(), "jsType", null);
        setField(term38225, term38225.getClass(), "first", term38295);
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
        args[1] = term38225;
        args[2] = null;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term38051, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


