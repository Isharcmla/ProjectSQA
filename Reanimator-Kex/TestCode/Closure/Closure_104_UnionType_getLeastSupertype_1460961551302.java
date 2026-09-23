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

public class UnionType_getLeastSupertype_1460961551302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108266;
     Object term108420;

    public UnionType_getLeastSupertype_1460961551302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term108314 = new HashSet();
        term108266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term108266, term108266.getClass(), "alternates", term108314);
        term108420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term108528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term108528, term108528.getClass(), "unknown", false);
        setField(term108420, term108420.getClass(), "referencedType", term108528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term108420;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term108266, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


