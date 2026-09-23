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
import java.util.HashSet;

public class DisambiguateProperties_addInvalidatingType_1040538549159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59306;
     Object term59608;

    public DisambiguateProperties_addInvalidatingType_1040538549159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term59500 = new HashSet();
        term59306 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term59452 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term59452, term59452.getClass(), "invalidatingTypes", term59500);
        setField(term59306, term59306.getClass(), "typeSystem", term59452);
        term59608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term59608;
        args[1] = null;
        try {
            callMethod(klass, "addInvalidatingType", argTypes, term59306, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


