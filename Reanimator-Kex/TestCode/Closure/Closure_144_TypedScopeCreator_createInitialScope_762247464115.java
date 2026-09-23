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

public class TypedScopeCreator_createInitialScope_762247464115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54634;
     Object term54806;

    public TypedScopeCreator_createInitialScope_762247464115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54634 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term54714 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term54634, term54634.getClass(), "compiler", term54714);
        setField(term54634, term54634.getClass(), "typeRegistry", null);
        term54806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term54806, term54806.getClass(), "type", 0);
        setField(term54806, term54806.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54806;
        try {
            callMethod(klass, "createInitialScope", argTypes, term54634, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


