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

public class GlobalNamespace_getNameIndex_22018420945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12077;

    public GlobalNamespace_getNameIndex_22018420945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12077 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term12147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term12077, term12077.getClass(), "generated", false);
        setIntField(term12147, term12147.getClass(), "type", 0);
        setField(term12147, term12147.getClass(), "first", null);
        setField(term12077, term12077.getClass(), "externsRoot", term12147);
        setBooleanField(term12077, term12077.getClass(), "inExterns", false);
        setField(term12077, term12077.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameIndex", argTypes, term12077, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


