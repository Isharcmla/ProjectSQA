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

public class TypeCheck_visitGetProp_513394509226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62573;
     Object term62643;

    public TypeCheck_visitGetProp_513394509226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62573 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term62643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term62643, term62643.getClass(), "jsType", null);
        setField(term62643, term62643.getClass(), "last", term62713);
        setField(term62783, term62783.getClass(), "jsType", term62877);
        setField(term62643, term62643.getClass(), "first", term62783);
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
        args[1] = term62643;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term62573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


