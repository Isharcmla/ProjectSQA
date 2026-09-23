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

public class JSType_getGreatestSubtype_1951394506308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60809;
     Object term61003;

    public JSType_getGreatestSubtype_1951394506308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term60905 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term60905, term60905.getClass(), "unknown", false);
        setField(term60809, term60809.getClass(), "referencedType", term60905);
        term61003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term61099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term61003, term61003.getClass(), "referencedType", term61099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term60809;
        args[1] = term61003;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


