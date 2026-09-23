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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashSet;

public class UnionType_meet_864061386129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37439;
     Object term37837;

    public UnionType_meet_864061386129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term37591 = new HashSet();
        term37439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term37543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term37439, term37439.getClass(), "registry", term37543);
        setField(term37439, term37439.getClass(), "alternates", term37591);
        Object term38023 = newInstance(Class.forName("java.lang.Object"));
        HashSet term37885 = new HashSet();
        ((HashSet) term37885).add(term38023);
        term37837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37837, term37837.getClass(), "alternates", term37885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term37837;
        try {
            callMethod(klass, "meet", argTypes, term37439, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


