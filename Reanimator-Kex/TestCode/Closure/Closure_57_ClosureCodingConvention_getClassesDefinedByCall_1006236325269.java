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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117403;
     Object term117495;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117403 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term117495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term117587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term117679 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term117587, term117587.getClass(), "type", 33);
        setIntField(term117679, term117679.getClass(), "type", 40);
        setField(term117587, term117587.getClass(), "last", term117679);
        setField(term117495, term117495.getClass(), "first", term117587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term117495;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term117403, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


