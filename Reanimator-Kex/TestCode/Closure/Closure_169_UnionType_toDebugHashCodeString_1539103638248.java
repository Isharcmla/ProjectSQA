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

public class UnionType_toDebugHashCodeString_1539103638248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99612;

    public UnionType_toDebugHashCodeString_1539103638248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term99810 = new ArrayList();
        Object term99758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term99758, term99758.getClass(), "alternates", term99810);
        ArrayList term99664 = new ArrayList();
        ((ArrayList) term99664).add(term99758);
        ((ArrayList) term99664).add((Object)null);
        ((ArrayList) term99664).add((Object)null);
        ((ArrayList) term99664).add((Object)null);
        ((ArrayList) term99664).add((Object)null);
        ((ArrayList) term99664).add((Object)null);
        ((ArrayList) term99664).add((Object)null);
        ((ArrayList) term99664).add((Object)null);
        ((ArrayList) term99664).add((Object)null);
        term99612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term99612, term99612.getClass(), "alternates", term99664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toDebugHashCodeString", argTypes, term99612, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


