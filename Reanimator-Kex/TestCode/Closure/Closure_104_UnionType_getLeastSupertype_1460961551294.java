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

public class UnionType_getLeastSupertype_1460961551294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104953;
     Object term105063;

    public UnionType_getLeastSupertype_1460961551294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104953 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        term105063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term105163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term105063, term105063.getClass(), "referencedType", term105163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term105063;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term104953, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


