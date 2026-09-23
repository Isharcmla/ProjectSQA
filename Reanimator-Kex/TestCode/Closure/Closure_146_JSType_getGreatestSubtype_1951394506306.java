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

public class JSType_getGreatestSubtype_1951394506306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59990;
     Object term60284;

    public JSType_getGreatestSubtype_1951394506306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term60082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term60186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term60082, term60082.getClass(), "unknown", false);
        setField(term60082, term60082.getClass(), "registry", term60186);
        setField(term59990, term59990.getClass(), "referencedType", term60082);
        term60284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term60376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setBooleanField(term60376, term60376.getClass(), "unknown", false);
        setField(term60284, term60284.getClass(), "referencedType", term60376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term59990;
        args[1] = term60284;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


