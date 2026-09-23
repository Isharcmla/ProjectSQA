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

public class UnionType_visit_1382171254236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81761;
     Object term81999;

    public UnionType_visit_1382171254236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term81865 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeySetView"));
        setField(term81761, term81761.getClass(), "alternates", term81865);
        term81999 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$4"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = term81999;
        try {
            callMethod(klass, "visit", argTypes, term81761, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


