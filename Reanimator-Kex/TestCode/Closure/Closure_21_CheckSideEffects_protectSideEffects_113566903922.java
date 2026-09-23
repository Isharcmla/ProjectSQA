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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.ArrayList;

public class CheckSideEffects_protectSideEffects_113566903922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9395;
     Object term9990;

    public CheckSideEffects_protectSideEffects_113566903922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9447 = new ArrayList();
        term9395 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term9395, term9395.getClass(), "problemNodes", term9447);
        ArrayList term9991 = new ArrayList();
        term9990 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term9990, term9990.getClass(), "level", null);
        setField(term9990, term9990.getClass(), "problemNodes", term9991);
        setField(term9990, term9990.getClass(), "compiler", null);
        setBooleanField(term9990, term9990.getClass(), "protectSideEffectFreeCode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "protectSideEffects", argTypes, term9395, args);
        assertTrue(recursiveEquals(term9395, term9990));
    }

};


