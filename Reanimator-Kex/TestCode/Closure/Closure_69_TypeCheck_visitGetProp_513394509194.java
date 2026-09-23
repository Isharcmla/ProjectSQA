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

public class TypeCheck_visitGetProp_513394509194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51664;
     Object term51734;

    public TypeCheck_visitGetProp_513394509194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51664 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term51734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term51734, term51734.getClass(), "jsType", null);
        setField(term51734, term51734.getClass(), "last", term51804);
        setField(term51874, term51874.getClass(), "jsType", term51978);
        setField(term51734, term51734.getClass(), "first", term51874);
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
        args[1] = term51734;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term51664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


