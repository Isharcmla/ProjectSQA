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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66899;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66899 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66985 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term67077 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term66899, term66899.getClass(), "type", 33);
        setIntField(term66985, term66985.getClass(), "type", 33);
        setField(term66985, term66985.getClass(), "last", term67077);
        setField(term66899, term66899.getClass(), "first", term66985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term66899;
        try {
            callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


