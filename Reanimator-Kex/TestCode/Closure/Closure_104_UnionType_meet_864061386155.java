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
import java.util.HashSet;

public class UnionType_meet_864061386155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48998;
     Object term49290;

    public UnionType_meet_864061386155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term49046 = new HashSet();
        term48998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term48998, term48998.getClass(), "registry", null);
        setField(term48998, term48998.getClass(), "alternates", term49046);
        term49290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term49290;
        try {
            callMethod(klass, "meet", argTypes, term48998, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


