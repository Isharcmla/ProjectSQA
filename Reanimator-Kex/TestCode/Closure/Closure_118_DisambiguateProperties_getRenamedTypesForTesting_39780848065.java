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

public class DisambiguateProperties_getRenamedTypesForTesting_39780848065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17694;

    public DisambiguateProperties_getRenamedTypesForTesting_39780848065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17742 = new HashMap();
        ((HashMap) term17742).put(term17742, term17742);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        ((HashMap) term17742).put((Object)null, (Object)null);
        term17694 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term17694, term17694.getClass(), "properties", term17742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRenamedTypesForTesting", argTypes, term17694, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


