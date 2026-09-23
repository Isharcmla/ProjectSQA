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

public class UnionType_getLeastSupertype_1460961551290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103117;
     Object term103227;

    public UnionType_getLeastSupertype_1460961551290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        term103227 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term103333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term103227, term103227.getClass(), "referencedType", term103333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term103227;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term103117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


