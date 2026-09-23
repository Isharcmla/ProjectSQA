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

public class GlobalNamespace_getNameIndex_22018420967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18631;

    public GlobalNamespace_getNameIndex_22018420967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18631 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term18717 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setBooleanField(term18631, term18631.getClass(), "generated", false);
        setIntField(term18717, term18717.getClass(), "type", 0);
        setField(term18717, term18717.getClass(), "first", null);
        setField(term18631, term18631.getClass(), "externsRoot", term18717);
        setBooleanField(term18631, term18631.getClass(), "inExterns", false);
        setField(term18631, term18631.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameIndex", argTypes, term18631, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


