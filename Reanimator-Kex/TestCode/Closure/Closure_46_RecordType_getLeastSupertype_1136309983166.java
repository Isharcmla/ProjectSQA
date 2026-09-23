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

public class RecordType_getLeastSupertype_1136309983166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51825;
     Object term51923;

    public RecordType_getLeastSupertype_1136309983166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term51923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term52021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term51923, term51923.getClass(), "referencedType", term52021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term51923;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term51825, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


