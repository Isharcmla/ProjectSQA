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

public class RecordType_isSubtype_1383543061150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45121;
     Object term45257;

    public RecordType_isSubtype_1383543061150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term45161 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term45121, term45121.getClass(), "properties", term45161);
        term45257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term45257, term45257.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term45257;
        try {
            callMethod(klass, "isSubtype", argTypes, term45121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


