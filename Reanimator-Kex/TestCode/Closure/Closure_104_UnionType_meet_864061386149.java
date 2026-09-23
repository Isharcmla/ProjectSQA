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

public class UnionType_meet_864061386149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45970;
     Object term46368;

    public UnionType_meet_864061386149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term46122 = new HashSet();
        term45970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term46074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term45970, term45970.getClass(), "registry", term46074);
        setField(term45970, term45970.getClass(), "alternates", term46122);
        HashSet term46416 = new HashSet();
        term46368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term46368, term46368.getClass(), "alternates", term46416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term46368;
        try {
            callMethod(klass, "meet", argTypes, term45970, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


