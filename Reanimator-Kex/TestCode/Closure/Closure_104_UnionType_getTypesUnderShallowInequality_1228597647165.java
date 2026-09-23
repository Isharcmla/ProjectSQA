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

public class UnionType_getTypesUnderShallowInequality_1228597647165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52581;

    public UnionType_getTypesUnderShallowInequality_1228597647165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52767 = newInstance(Class.forName("java.lang.Object"));
        HashSet term52629 = new HashSet();
        ((HashSet) term52629).add(term52767);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        ((HashSet) term52629).add((Object)null);
        term52581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term52581, term52581.getClass(), "registry", null);
        setField(term52581, term52581.getClass(), "alternates", term52629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTypesUnderShallowInequality", argTypes, term52581, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


