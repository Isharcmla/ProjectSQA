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

public class UnionType_getTypesUnderInequality_692494137190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63282;

    public UnionType_getTypesUnderInequality_692494137190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63468 = newInstance(Class.forName("java.lang.Object"));
        HashSet term63330 = new HashSet();
        ((HashSet) term63330).add(term63468);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        ((HashSet) term63330).add((Object)null);
        term63282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term63282, term63282.getClass(), "registry", null);
        setField(term63282, term63282.getClass(), "alternates", term63330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTypesUnderInequality", argTypes, term63282, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


