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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GlobalNamespace_getNameIndex_22018420970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18933;

    public GlobalNamespace_getNameIndex_22018420970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18933 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term19003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19083 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term18933, term18933.getClass(), "generated", false);
        setIntField(term19003, term19003.getClass(), "type", 0);
        setField(term19003, term19003.getClass(), "first", null);
        setField(term18933, term18933.getClass(), "externsRoot", term19003);
        setBooleanField(term18933, term18933.getClass(), "inExterns", false);
        setField(term18933, term18933.getClass(), "compiler", term19083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameIndex", argTypes, term18933, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


