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

public class TypedScopeCreator_createScope_26573221540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19371;
     Object term19441;
     Object term19585;

    public TypedScopeCreator_createScope_26573221540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19371 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term19371, term19371.getClass(), "compiler", null);
        term19441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19441, term19441.getClass(), "jsType", null);
        setIntField(term19441, term19441.getClass(), "type", 0);
        setField(term19511, term19511.getClass(), "next", null);
        setIntField(term19511, term19511.getClass(), "type", 0);
        setField(term19511, term19511.getClass(), "first", null);
        setField(term19441, term19441.getClass(), "first", term19511);
        term19585 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term19585, term19585.getClass(), "rootNode", null);
        setField(term19585, term19585.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term19441;
        args[1] = term19585;
        try {
            callMethod(klass, "createScope", argTypes, term19371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


