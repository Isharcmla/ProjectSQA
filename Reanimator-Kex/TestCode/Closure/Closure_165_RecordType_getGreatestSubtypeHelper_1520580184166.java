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

public class RecordType_getGreatestSubtypeHelper_1520580184166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52352;
     Object term52592;

    public RecordType_getGreatestSubtypeHelper_1520580184166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term52456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term52496 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term52352, term52352.getClass(), "registry", term52456);
        setField(term52352, term52352.getClass(), "properties", term52496);
        term52592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term52632 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term52592, term52592.getClass(), "properties", term52632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term52592;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term52352, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


