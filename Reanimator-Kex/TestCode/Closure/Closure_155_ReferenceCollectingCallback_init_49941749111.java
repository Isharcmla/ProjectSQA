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
import java.util.HashMap;
import java.util.ArrayDeque;
import java.lang.String;
import java.lang.Object;

public class ReferenceCollectingCallback_init_49941749111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072;

    public ReferenceCollectingCallback_init_49941749111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1073 = new HashMap();
        ArrayDeque term1074 = new ArrayDeque();
        Class<? extends Object> term1134 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term1133 = ((Class) term1134).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term1133).setAccessible(true);
        Object enum0 = ((Field) term1133).get((Object) null);
        term1072 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term1072, term1072.getClass(), "referenceMap", term1073);
        setField(term1072, term1072.getClass(), "blockStack", term1074);
        setField(term1072, term1072.getClass(), "behavior", null);
        setField(term1072, term1072.getClass(), "compiler", null);
        setField(term1072, term1072.getClass(), "varFilter", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Behavior");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1072));
    }

};


