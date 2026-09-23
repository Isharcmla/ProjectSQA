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

public class UnionType_meet_864061386181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59811;
     Object term60209;

    public UnionType_meet_864061386181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term59963 = new HashSet();
        term59811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term59915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term59811, term59811.getClass(), "registry", term59915);
        setField(term59811, term59811.getClass(), "alternates", term59963);
        HashSet term60257 = new HashSet();
        term60209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term60209, term60209.getClass(), "alternates", term60257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term60209;
        try {
            callMethod(klass, "meet", argTypes, term59811, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


