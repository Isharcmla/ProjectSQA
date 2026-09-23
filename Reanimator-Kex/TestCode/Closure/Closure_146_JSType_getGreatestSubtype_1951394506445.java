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

public class JSType_getGreatestSubtype_1951394506445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113644;
     Object term113830;

    public JSType_getGreatestSubtype_1951394506445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term113732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term113732, term113732.getClass(), "unknown", false);
        setField(term113644, term113644.getClass(), "referencedType", term113732);
        term113830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term113928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term113830, term113830.getClass(), "referencedType", term113928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term113644;
        args[1] = term113830;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


