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

public class UnionType_getLeastSupertype_1460961551300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106902;
     Object term107056;

    public UnionType_getLeastSupertype_1460961551300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term106950 = new HashSet();
        term106902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term106902, term106902.getClass(), "alternates", term106950);
        term107056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term107144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term107144, term107144.getClass(), "unknown", false);
        setField(term107056, term107056.getClass(), "referencedType", term107144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term107056;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term106902, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


