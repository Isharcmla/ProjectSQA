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

public class TypedScopeCreator_createInitialScope_762247464152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72254;
     Object term72324;

    public TypedScopeCreator_createInitialScope_762247464152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72254 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term72254, term72254.getClass(), "compiler", null);
        setField(term72254, term72254.getClass(), "typeRegistry", null);
        term72324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72324, term72324.getClass(), "type", 0);
        setField(term72394, term72394.getClass(), "next", term72464);
        setIntField(term72394, term72394.getClass(), "type", 118);
        setField(term72394, term72394.getClass(), "first", null);
        setField(term72324, term72324.getClass(), "first", term72394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term72324;
        try {
            callMethod(klass, "createInitialScope", argTypes, term72254, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


