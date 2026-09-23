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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.ArrayList;

public class UnionType_canBeCalled_230051747180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37016;
     Object term37254;

    public UnionType_canBeCalled_230051747180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37068 = new ArrayList();
        term37016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37016, term37016.getClass(), "alternates", term37068);
        ArrayList term37255 = new ArrayList();
        term37254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37254, term37254.getClass(), "alternates", term37255);
        setIntField(term37254, term37254.getClass(), "hashcode", 0);
        setBooleanField(term37254, term37254.getClass(), "resolved", false);
        setField(term37254, term37254.getClass(), "resolveResult", null);
        setBooleanField(term37254, term37254.getClass(), "inTemplatedCheckVisit", false);
        setField(term37254, term37254.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "canBeCalled", argTypes, term37016, args);
        assertTrue(recursiveEquals(term37016, term37254));
        assertTrue(recursiveEquals(retValue, true));
    }

};


