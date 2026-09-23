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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class PureFunctionIdentifier_propagateSideEffects_39421116717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2506;

    public PureFunctionIdentifier_propagateSideEffects_39421116717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2644 = newInstance(Class.forName("java.lang.Object"));
        HashMap term2554 = new HashMap();
        ((HashMap) term2554).put(term2644, term2644);
        ((HashMap) term2554).put((Object)null, (Object)null);
        ((HashMap) term2554).put((Object)null, (Object)null);
        ((HashMap) term2554).put((Object)null, (Object)null);
        ((HashMap) term2554).put((Object)null, (Object)null);
        ((HashMap) term2554).put((Object)null, (Object)null);
        ((HashMap) term2554).put((Object)null, (Object)null);
        ((HashMap) term2554).put((Object)null, (Object)null);
        ((HashMap) term2554).put((Object)null, (Object)null);
        ((HashMap) term2554).put((Object)null, (Object)null);
        term2506 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        setField(term2506, term2506.getClass(), "functionSideEffectMap", term2554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "propagateSideEffects", argTypes, term2506, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


