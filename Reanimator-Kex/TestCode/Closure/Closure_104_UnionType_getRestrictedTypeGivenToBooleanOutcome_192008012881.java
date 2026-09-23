package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashSet;

public class UnionType_getRestrictedTypeGivenToBooleanOutcome_192008012881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19783;

    public UnionType_getRestrictedTypeGivenToBooleanOutcome_192008012881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20073 = newInstance(Class.forName("java.lang.Object"));
        HashSet term19935 = new HashSet();
        ((HashSet) term19935).add(term20073);
        ((HashSet) term19935).add((Object)null);
        term19783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term19887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term19783, term19783.getClass(), "registry", term19887);
        setField(term19783, term19783.getClass(), "alternates", term19935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "getRestrictedTypeGivenToBooleanOutcome", argTypes, term19783, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


