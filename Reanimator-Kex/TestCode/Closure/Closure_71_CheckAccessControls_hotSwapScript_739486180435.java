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

public class CheckAccessControls_hotSwapScript_739486180435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218500;
     Object term218650;

    public CheckAccessControls_hotSwapScript_739486180435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218500 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term218580 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term218500, term218500.getClass(), "compiler", term218580);
        term218650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term218650, term218650.getClass(), "type", 30);
        setField(term218720, term218720.getClass(), "next", null);
        setIntField(term218720, term218720.getClass(), "type", 0);
        setField(term218720, term218720.getClass(), "first", null);
        setField(term218650, term218650.getClass(), "first", term218720);
        setField(term218650, term218650.getClass(), "jsType", term218824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term218650;
        callMethod(klass, "hotSwapScript", argTypes, term218500, args);
    }

};


