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

public class GlobalNamespace_getNameForest_66304294471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19367;

    public GlobalNamespace_getNameForest_66304294471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19367 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term19437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term19367, term19367.getClass(), "generated", false);
        setIntField(term19437, term19437.getClass(), "type", 0);
        setField(term19507, term19507.getClass(), "next", null);
        setIntField(term19507, term19507.getClass(), "type", 0);
        setField(term19507, term19507.getClass(), "first", null);
        setField(term19437, term19437.getClass(), "first", term19507);
        setField(term19367, term19367.getClass(), "externsRoot", term19437);
        setBooleanField(term19367, term19367.getClass(), "inExterns", false);
        setField(term19367, term19367.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameForest", argTypes, term19367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


