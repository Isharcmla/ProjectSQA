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

public class GlobalNamespace_getSlot_150227970385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16517;

    public GlobalNamespace_getSlot_150227970385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16517 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setBooleanField(term16517, term16517.getClass(), "generated", false);
        setField(term16517, term16517.getClass(), "externsRoot", null);
        setBooleanField(term16517, term16517.getClass(), "inExterns", false);
        setField(term16517, term16517.getClass(), "compiler", null);
        setField(term16517, term16517.getClass(), "root", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getSlot", argTypes, term16517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


