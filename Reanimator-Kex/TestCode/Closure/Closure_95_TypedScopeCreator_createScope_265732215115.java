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

public class TypedScopeCreator_createScope_265732215115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75626;
     Object term75696;
     Object term76002;

    public TypedScopeCreator_createScope_265732215115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75626 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term75626, term75626.getClass(), "compiler", null);
        term75696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term75696, term75696.getClass(), "jsType", null);
        setIntField(term75696, term75696.getClass(), "type", 0);
        setField(term75836, term75836.getClass(), "next", null);
        setIntField(term75836, term75836.getClass(), "type", 41);
        setField(term75836, term75836.getClass(), "first", null);
        setField(term75766, term75766.getClass(), "next", term75836);
        setIntField(term75766, term75766.getClass(), "type", 64);
        setField(term75766, term75766.getClass(), "first", null);
        setField(term75766, term75766.getClass(), "jsType", term75928);
        setField(term75696, term75696.getClass(), "first", term75766);
        term76002 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term76072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76002, term76002.getClass(), "rootNode", term76072);
        setField(term76002, term76002.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term75696;
        args[1] = term76002;
        try {
            callMethod(klass, "createScope", argTypes, term75626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


