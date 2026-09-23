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

public class TypeCheck_visitObjLitKey_518851015774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197424;
     Object term197703;

    public TypeCheck_visitObjLitKey_518851015774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197424 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term197528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term197424, term197424.getClass(), "typeRegistry", term197528);
        term197703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term197738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term197703, term197703.getClass(), "propListHead", null);
        setField(term197738, term197738.getClass(), "jsType", null);
        setField(term197703, term197703.getClass(), "first", term197738);
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
        args[1] = term197703;
        args[2] = term197703;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term197424, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


