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

public class RecordType_getGreatestSubtypeHelper_1520580184138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42166;
     Object term42302;

    public RecordType_getGreatestSubtypeHelper_1520580184138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term42206 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term42166, term42166.getClass(), "registry", null);
        setField(term42166, term42166.getClass(), "properties", term42206);
        term42302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term42342 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term42302, term42302.getClass(), "properties", term42342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term42302;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term42166, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


