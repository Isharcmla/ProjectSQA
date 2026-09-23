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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.lang.Object;

public class UnionType_getLeastSupertype_1460961551232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79701;
     Object term80069;

    public UnionType_getLeastSupertype_1460961551232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79887 = newInstance(Class.forName("java.lang.Object"));
        HashSet term79749 = new HashSet();
        ((HashSet) term79749).add(term79887);
        term79701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term79701, term79701.getClass(), "alternates", term79749);
        term80069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setBooleanField(term80069, term80069.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term80069;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term79701, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


