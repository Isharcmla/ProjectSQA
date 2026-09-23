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

public class TypeCheck_visitAssign_1165544828296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79285;
     Object term79459;

    public TypeCheck_visitAssign_1165544828296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79285 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term79389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term79285, term79285.getClass(), "typeRegistry", term79389);
        term79459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79555 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term79555, term79555.getClass(), "type", -30);
        setField(term79555, term79555.getClass(), "next", null);
        setField(term79459, term79459.getClass(), "propListHead", term79555);
        setField(term79459, term79459.getClass(), "first", term79459);
        setField(term79459, term79459.getClass(), "last", null);
        setIntField(term79459, term79459.getClass(), "type", 0);
        setField(term79459, term79459.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term79459;
        callMethod(klass, "visitAssign", argTypes, term79285, args);
    }

};


