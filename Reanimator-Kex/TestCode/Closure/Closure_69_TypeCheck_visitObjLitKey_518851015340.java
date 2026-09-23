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

public class TypeCheck_visitObjLitKey_518851015340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98772;
     Object term98946;

    public TypeCheck_visitObjLitKey_518851015340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98772 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term98876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term98772, term98772.getClass(), "typeRegistry", term98876);
        term98946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99016, term99016.getClass(), "jsType", null);
        setField(term98946, term98946.getClass(), "first", term99016);
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
        args[1] = term98946;
        args[2] = null;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term98772, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


