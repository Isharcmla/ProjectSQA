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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169620;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169620 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term169620, term169620.getClass(), "type", 33);
        setIntField(term169712, term169712.getClass(), "type", 33);
        setField(term169712, term169712.getClass(), "last", term169712);
        setField(term169620, term169620.getClass(), "first", term169712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term169620;
        try {
            callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


