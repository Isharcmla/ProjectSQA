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

public class CheckSideEffects_protectSideEffects_113566903930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13990;
     Object term14050;

    public CheckSideEffects_protectSideEffects_113566903930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14042 = new ArrayList();
        term13990 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term13990, term13990.getClass(), "problemNodes", term14042);
        ArrayList term14051 = new ArrayList();
        term14050 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term14050, term14050.getClass(), "level", null);
        setField(term14050, term14050.getClass(), "problemNodes", term14051);
        setField(term14050, term14050.getClass(), "compiler", null);
        setBooleanField(term14050, term14050.getClass(), "protectSideEffectFreeCode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "protectSideEffects", argTypes, term13990, args);
        assertTrue(recursiveEquals(term13990, term14050));
    }

};


