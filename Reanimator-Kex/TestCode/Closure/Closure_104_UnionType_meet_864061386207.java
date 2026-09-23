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

public class UnionType_meet_864061386207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69639;
     Object term70037;

    public UnionType_meet_864061386207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term69791 = new HashSet();
        term69639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term69743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term69639, term69639.getClass(), "registry", term69743);
        setField(term69639, term69639.getClass(), "alternates", term69791);
        Object term70283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        HashSet term70085 = new HashSet();
        ((HashSet) term70085).add(term70283);
        ((HashSet) term70085).add((Object)null);
        term70037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term70037, term70037.getClass(), "alternates", term70085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term70037;
        try {
            callMethod(klass, "meet", argTypes, term69639, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


