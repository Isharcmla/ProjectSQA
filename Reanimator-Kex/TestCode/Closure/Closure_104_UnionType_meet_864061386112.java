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

public class UnionType_meet_864061386112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31182;
     Object term31580;

    public UnionType_meet_864061386112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term31334 = new HashSet();
        term31182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term31286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term31182, term31182.getClass(), "registry", term31286);
        setField(term31182, term31182.getClass(), "alternates", term31334);
        HashSet term31628 = new HashSet();
        term31580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term31580, term31580.getClass(), "alternates", term31628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term31580;
        try {
            callMethod(klass, "meet", argTypes, term31182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


