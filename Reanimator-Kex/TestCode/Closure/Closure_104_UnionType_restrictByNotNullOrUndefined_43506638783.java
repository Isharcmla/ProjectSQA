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

public class UnionType_restrictByNotNullOrUndefined_43506638783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20879;

    public UnionType_restrictByNotNullOrUndefined_43506638783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21169 = newInstance(Class.forName("java.lang.Object"));
        HashSet term21031 = new HashSet();
        ((HashSet) term21031).add(term21169);
        ((HashSet) term21031).add((Object)null);
        term20879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term20983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term20879, term20879.getClass(), "registry", term20983);
        setField(term20879, term20879.getClass(), "alternates", term21031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "restrictByNotNullOrUndefined", argTypes, term20879, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


