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

public class ReferenceCollectingCallback_init_49941749110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term958;

    public ReferenceCollectingCallback_init_49941749110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term959 = new HashMap();
        ArrayDeque term960 = new ArrayDeque();
        Class<? extends Object> term978 = Class.forName((String) "com.google.common.base.Predicates$AlwaysTruePredicate");
        Field term977 = ((Class) term978).getDeclaredField((String) "INSTANCE");
        ((Field) term977).setAccessible(true);
        Object enum0 = ((Field) term977).get((Object) null);
        term958 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term958, term958.getClass(), "referenceMap", term959);
        setField(term958, term958.getClass(), "blockStack", term960);
        setField(term958, term958.getClass(), "behavior", null);
        setField(term958, term958.getClass(), "compiler", null);
        setField(term958, term958.getClass(), "varFilter", enum0);
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
        assertTrue(recursiveEquals(instance, term958));
    }

};


