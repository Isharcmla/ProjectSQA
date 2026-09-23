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

public class GlobalNamespace_getNameForest_66304294472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318507;

    public GlobalNamespace_getNameForest_66304294472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318507 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term318577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term318507, term318507.getClass(), "generated", false);
        setIntField(term318577, term318577.getClass(), "type", 0);
        setField(term318577, term318577.getClass(), "first", null);
        setField(term318507, term318507.getClass(), "externsRoot", term318577);
        setBooleanField(term318507, term318507.getClass(), "inExterns", false);
        setField(term318507, term318507.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameForest", argTypes, term318507, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


