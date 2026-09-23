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
import java.util.ArrayList;
import java.lang.Object;

public class UnionType_toDebugHashCodeString_1539103638195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39964;

    public UnionType_toDebugHashCodeString_1539103638195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList term40016 = new ArrayList();
        ((ArrayList) term40016).add(term40110);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        ((ArrayList) term40016).add((Object)null);
        term39964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term39964, term39964.getClass(), "alternates", term40016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toDebugHashCodeString", argTypes, term39964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


