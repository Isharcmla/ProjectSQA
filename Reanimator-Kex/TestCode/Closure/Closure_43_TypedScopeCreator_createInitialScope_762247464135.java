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

public class TypedScopeCreator_createInitialScope_762247464135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100392;
     Object term100462;

    public TypedScopeCreator_createInitialScope_762247464135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100392 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term100392, term100392.getClass(), "compiler", null);
        setField(term100392, term100392.getClass(), "typeRegistry", null);
        term100462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100462, term100462.getClass(), "type", 119);
        setField(term100462, term100462.getClass(), "parent", null);
        setField(term100532, term100532.getClass(), "next", null);
        setIntField(term100532, term100532.getClass(), "type", 118);
        setField(term100532, term100532.getClass(), "first", null);
        setField(term100462, term100462.getClass(), "first", term100532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term100462;
        try {
            callMethod(klass, "createInitialScope", argTypes, term100392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


