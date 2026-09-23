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
import java.lang.String;
import java.lang.Object;

public class TypeCheck_getClosestPropertySuggestion_345516720160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37437;

    public TypeCheck_getClosestPropertySuggestion_345516720160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38434 = Class.forName((String) "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException");
        Object[] term38801 = (Object[]) newArray("java.lang.Class", 0);
        Method term37491 = ((Class) term38434).getDeclaredMethod((String) "getMessage", (Class[]) term38801);
        ((Method) term37491).setAccessible(false);
        term37437 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term37437, term37437.getClass(), "editDistance", term37491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "getClosestPropertySuggestion", argTypes, term37437, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


