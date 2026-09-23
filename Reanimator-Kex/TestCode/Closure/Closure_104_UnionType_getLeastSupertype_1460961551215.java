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

public class UnionType_getLeastSupertype_1460961551215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73576;
     Object term73716;

    public UnionType_getLeastSupertype_1460961551215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term73624 = new HashSet();
        term73576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term73576, term73576.getClass(), "alternates", term73624);
        term73716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setBooleanField(term73716, term73716.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term73716;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term73576, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


