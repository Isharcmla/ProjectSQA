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

public class JSType_getGreatestSubtype_1951394506304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58048;
     Object term58242;

    public JSType_getGreatestSubtype_1951394506304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58048 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term58144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term58144, term58144.getClass(), "unknown", false);
        setField(term58048, term58048.getClass(), "referencedType", term58144);
        term58242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term58336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term58242, term58242.getClass(), "referencedType", term58336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term58048;
        args[1] = term58242;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


