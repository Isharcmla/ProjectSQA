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

public class UnionType_meet_864061386133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39441;
     Object term39735;

    public UnionType_meet_864061386133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term39489 = new HashSet();
        term39441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term39441, term39441.getClass(), "registry", null);
        setField(term39441, term39441.getClass(), "alternates", term39489);
        HashSet term39783 = new HashSet();
        term39735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term39735, term39735.getClass(), "alternates", term39783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term39735;
        try {
            callMethod(klass, "meet", argTypes, term39441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


