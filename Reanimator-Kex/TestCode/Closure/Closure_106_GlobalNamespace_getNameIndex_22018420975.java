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

public class GlobalNamespace_getNameIndex_22018420975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618465;

    public GlobalNamespace_getNameIndex_22018420975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term618465 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term618545 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term618465, term618465.getClass(), "generated", false);
        setField(term618465, term618465.getClass(), "externsRoot", null);
        setBooleanField(term618465, term618465.getClass(), "inExterns", false);
        setField(term618465, term618465.getClass(), "compiler", term618545);
        setField(term618465, term618465.getClass(), "root", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameIndex", argTypes, term618465, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


