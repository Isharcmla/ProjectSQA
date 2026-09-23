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
import java.lang.Object;

public class UnionType_getLeastSupertype_1460961551256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90269;
     Object term90667;

    public UnionType_getLeastSupertype_1460961551256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term90317 = new HashSet();
        term90269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term90573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term90269, term90269.getClass(), "alternates", term90317);
        setField(term90269, term90269.getClass(), "registry", term90573);
        term90667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term90783 = newInstance(Class.forName("java.util.TreeMap$AscendingSubMap$AscendingEntrySetView"));
        setField(term90667, term90667.getClass(), "alternates", term90783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term90667;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term90269, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


