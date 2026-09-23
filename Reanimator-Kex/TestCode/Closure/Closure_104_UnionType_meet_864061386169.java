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

public class UnionType_meet_864061386169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54036;
     Object term54434;

    public UnionType_meet_864061386169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term54188 = new HashSet();
        term54036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term54140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term54036, term54036.getClass(), "registry", term54140);
        setField(term54036, term54036.getClass(), "alternates", term54188);
        Object term54682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setBooleanField(term54682, term54682.getClass(), "unknown", false);
        HashSet term54482 = new HashSet();
        ((HashSet) term54482).add(term54682);
        ((HashSet) term54482).add((Object)null);
        term54434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term54434, term54434.getClass(), "alternates", term54482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term54434;
        try {
            callMethod(klass, "meet", argTypes, term54036, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


